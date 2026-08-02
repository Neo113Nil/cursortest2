package androidx.media3.session;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.session.MediaSession;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
final class ConnectedControllersManager<T> {

    @GuardedBy("lock")
    private final ArrayMap<T, MediaSession.ControllerInfo> controllerInfoMap = new ArrayMap<>();

    @GuardedBy("lock")
    private final ArrayMap<MediaSession.ControllerInfo, ConnectedControllerRecord<T>> controllerRecords = new ArrayMap<>();
    private final Object lock = new Object();
    private final WeakReference<MediaSessionImpl> sessionImpl;

    public interface AsyncCommand {
        com.google.common.util.concurrent.u<Void> run();
    }

    public static final class ConnectedControllerRecord<T> {
        public boolean commandQueueIsFlushing;
        public final T controllerKey;

        @Nullable
        public PlaybackException playbackException;
        public Player.Commands playerCommands;

        @Nullable
        public Player.Commands playerCommandsBeforePlaybackException;

        @Nullable
        public PlayerInfo playerInfoForPlaybackException;
        public final SequencedFutureManager sequencedFutureManager;
        public SessionCommands sessionCommands;
        public final Deque<AsyncCommand> commandQueue = new ArrayDeque();
        public Player.Commands commandQueuePlayerCommands = Player.Commands.EMPTY;

        public ConnectedControllerRecord(T t, SequencedFutureManager sequencedFutureManager, SessionCommands sessionCommands, Player.Commands commands) {
            this.controllerKey = t;
            this.sequencedFutureManager = sequencedFutureManager;
            this.sessionCommands = sessionCommands;
            this.playerCommands = commands;
        }
    }

    public ConnectedControllersManager(MediaSessionImpl mediaSessionImpl) {
        this.sessionImpl = new WeakReference<>(mediaSessionImpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.util.concurrent.u lambda$flushCommandQueue$1(MediaSession.ControllerInfo controllerInfo, Player.Commands commands) {
        MediaSessionImpl mediaSessionImpl = this.sessionImpl.get();
        if (mediaSessionImpl != null) {
            mediaSessionImpl.onPlayerInteractionFinishedOnHandler(controllerInfo, commands);
        }
        return com.google.common.util.concurrent.r.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$flushCommandQueue$2(AtomicBoolean atomicBoolean, ConnectedControllerRecord connectedControllerRecord, AtomicBoolean atomicBoolean2) {
        synchronized (this.lock) {
            try {
                if (atomicBoolean.get()) {
                    atomicBoolean2.set(true);
                } else {
                    flushCommandQueue(connectedControllerRecord);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$flushCommandQueue$3(AsyncCommand asyncCommand, final AtomicBoolean atomicBoolean, final ConnectedControllerRecord connectedControllerRecord, final AtomicBoolean atomicBoolean2) {
        asyncCommand.run().addListener(new Runnable() { // from class: androidx.media3.session.c
            @Override // java.lang.Runnable
            public final void run() {
                ConnectedControllersManager.this.lambda$flushCommandQueue$2(atomicBoolean, connectedControllerRecord, atomicBoolean2);
            }
        }, com.google.common.util.concurrent.j.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$removeController$0(MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) {
        if (mediaSessionImpl.isReleased()) {
            return;
        }
        mediaSessionImpl.onDisconnectedOnHandler(controllerInfo);
    }

    public void addController(T t, MediaSession.ControllerInfo controllerInfo, SessionCommands sessionCommands, Player.Commands commands) {
        synchronized (this.lock) {
            try {
                MediaSession.ControllerInfo controller = getController(t);
                if (controller == null) {
                    this.controllerInfoMap.put(t, controllerInfo);
                    this.controllerRecords.put(controllerInfo, new ConnectedControllerRecord<>(t, new SequencedFutureManager(), sessionCommands, commands));
                } else {
                    ConnectedControllerRecord connectedControllerRecord = (ConnectedControllerRecord) Assertions.checkStateNotNull(this.controllerRecords.get(controller));
                    connectedControllerRecord.sessionCommands = sessionCommands;
                    connectedControllerRecord.playerCommands = commands;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addToCommandQueue(MediaSession.ControllerInfo controllerInfo, int i, AsyncCommand asyncCommand) {
        synchronized (this.lock) {
            try {
                ConnectedControllerRecord<T> connectedControllerRecord = this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord != null) {
                    connectedControllerRecord.commandQueuePlayerCommands = connectedControllerRecord.commandQueuePlayerCommands.buildUpon().add(i).build();
                    connectedControllerRecord.commandQueue.add(asyncCommand);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void flushCommandQueue(final MediaSession.ControllerInfo controllerInfo) {
        synchronized (this.lock) {
            try {
                ConnectedControllerRecord<T> connectedControllerRecord = this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord == null) {
                    return;
                }
                final Player.Commands commands = connectedControllerRecord.commandQueuePlayerCommands;
                connectedControllerRecord.commandQueuePlayerCommands = Player.Commands.EMPTY;
                connectedControllerRecord.commandQueue.add(new AsyncCommand() { // from class: androidx.media3.session.b
                    @Override // androidx.media3.session.ConnectedControllersManager.AsyncCommand
                    public final com.google.common.util.concurrent.u run() {
                        com.google.common.util.concurrent.u lambda$flushCommandQueue$1;
                        lambda$flushCommandQueue$1 = ConnectedControllersManager.this.lambda$flushCommandQueue$1(controllerInfo, commands);
                        return lambda$flushCommandQueue$1;
                    }
                });
                if (connectedControllerRecord.commandQueueIsFlushing) {
                    return;
                }
                connectedControllerRecord.commandQueueIsFlushing = true;
                flushCommandQueue(connectedControllerRecord);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public Player.Commands getAvailablePlayerCommands(MediaSession.ControllerInfo controllerInfo) {
        synchronized (this.lock) {
            try {
                ConnectedControllerRecord<T> connectedControllerRecord = this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord == null) {
                    return null;
                }
                return connectedControllerRecord.playerCommands;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public SessionCommands getAvailableSessionCommands(MediaSession.ControllerInfo controllerInfo) {
        synchronized (this.lock) {
            try {
                ConnectedControllerRecord<T> connectedControllerRecord = this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord == null) {
                    return null;
                }
                return connectedControllerRecord.sessionCommands;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public com.google.common.collect.G<MediaSession.ControllerInfo> getConnectedControllers() {
        com.google.common.collect.G<MediaSession.ControllerInfo> j;
        synchronized (this.lock) {
            j = com.google.common.collect.G.j(this.controllerInfoMap.values());
        }
        return j;
    }

    @Nullable
    public MediaSession.ControllerInfo getController(T t) {
        MediaSession.ControllerInfo controllerInfo;
        synchronized (this.lock) {
            controllerInfo = this.controllerInfoMap.get(t);
        }
        return controllerInfo;
    }

    @Nullable
    public PlaybackException getPlaybackException(MediaSession.ControllerInfo controllerInfo) {
        synchronized (this.lock) {
            try {
                ConnectedControllerRecord<T> connectedControllerRecord = this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord == null) {
                    return null;
                }
                return connectedControllerRecord.playbackException;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public Player.Commands getPlayerCommandsBeforePlaybackException(MediaSession.ControllerInfo controllerInfo) {
        synchronized (this.lock) {
            try {
                ConnectedControllerRecord<T> connectedControllerRecord = this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord == null) {
                    return null;
                }
                return connectedControllerRecord.playerCommandsBeforePlaybackException;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public PlayerInfo getPlayerInfoForPlaybackException(MediaSession.ControllerInfo controllerInfo) {
        synchronized (this.lock) {
            try {
                ConnectedControllerRecord<T> connectedControllerRecord = this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord == null) {
                    return null;
                }
                return connectedControllerRecord.playerInfoForPlaybackException;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public SequencedFutureManager getSequencedFutureManager(MediaSession.ControllerInfo controllerInfo) {
        ConnectedControllerRecord<T> connectedControllerRecord;
        synchronized (this.lock) {
            connectedControllerRecord = this.controllerRecords.get(controllerInfo);
        }
        if (connectedControllerRecord != null) {
            return connectedControllerRecord.sequencedFutureManager;
        }
        return null;
    }

    public boolean isConnected(MediaSession.ControllerInfo controllerInfo) {
        boolean z;
        synchronized (this.lock) {
            z = this.controllerRecords.get(controllerInfo) != null;
        }
        return z;
    }

    public boolean isPlayerCommandAvailable(MediaSession.ControllerInfo controllerInfo, int i) {
        ConnectedControllerRecord<T> connectedControllerRecord;
        synchronized (this.lock) {
            connectedControllerRecord = this.controllerRecords.get(controllerInfo);
        }
        MediaSessionImpl mediaSessionImpl = this.sessionImpl.get();
        return connectedControllerRecord != null && connectedControllerRecord.playerCommands.contains(i) && mediaSessionImpl != null && mediaSessionImpl.getPlayerWrapper().getAvailableCommands().contains(i);
    }

    public boolean isSessionCommandAvailable(MediaSession.ControllerInfo controllerInfo, SessionCommand sessionCommand) {
        ConnectedControllerRecord<T> connectedControllerRecord;
        synchronized (this.lock) {
            connectedControllerRecord = this.controllerRecords.get(controllerInfo);
        }
        return connectedControllerRecord != null && connectedControllerRecord.sessionCommands.contains(sessionCommand);
    }

    public void removeController(T t) {
        MediaSession.ControllerInfo controller = getController(t);
        if (controller != null) {
            removeController(controller);
        }
    }

    public void resetPlaybackException(MediaSession.ControllerInfo controllerInfo) {
        synchronized (this.lock) {
            try {
                ConnectedControllerRecord<T> connectedControllerRecord = this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord != null) {
                    connectedControllerRecord.playbackException = null;
                    connectedControllerRecord.playerCommandsBeforePlaybackException = null;
                    connectedControllerRecord.playerInfoForPlaybackException = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setPlaybackException(MediaSession.ControllerInfo controllerInfo, PlaybackException playbackException, Player.Commands commands) {
        synchronized (this.lock) {
            try {
                ConnectedControllerRecord<T> connectedControllerRecord = this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord != null) {
                    connectedControllerRecord.playbackException = playbackException;
                    connectedControllerRecord.playerCommandsBeforePlaybackException = commands;
                    connectedControllerRecord.playerInfoForPlaybackException = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setPlayerInfoForPlaybackException(MediaSession.ControllerInfo controllerInfo, PlayerInfo playerInfo) {
        synchronized (this.lock) {
            try {
                ConnectedControllerRecord<T> connectedControllerRecord = this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord != null) {
                    Assertions.checkStateNotNull(connectedControllerRecord.playbackException);
                    connectedControllerRecord.playerInfoForPlaybackException = playerInfo;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void updateCommandsFromSession(MediaSession.ControllerInfo controllerInfo, SessionCommands sessionCommands, Player.Commands commands) {
        synchronized (this.lock) {
            try {
                ConnectedControllerRecord<T> connectedControllerRecord = this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord != null) {
                    connectedControllerRecord.sessionCommands = sessionCommands;
                    if (connectedControllerRecord.playerCommandsBeforePlaybackException != null) {
                        connectedControllerRecord.playerCommandsBeforePlaybackException = commands;
                    } else {
                        connectedControllerRecord.playerCommands = commands;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeController(final MediaSession.ControllerInfo controllerInfo) {
        synchronized (this.lock) {
            try {
                ConnectedControllerRecord<T> remove = this.controllerRecords.remove(controllerInfo);
                if (remove == null) {
                    return;
                }
                this.controllerInfoMap.remove(remove.controllerKey);
                remove.sequencedFutureManager.release();
                final MediaSessionImpl mediaSessionImpl = this.sessionImpl.get();
                if (mediaSessionImpl == null || mediaSessionImpl.isReleased()) {
                    return;
                }
                Util.postOrRun(mediaSessionImpl.getApplicationHandler(), new Runnable() { // from class: androidx.media3.session.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConnectedControllersManager.lambda$removeController$0(MediaSessionImpl.this, controllerInfo);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public SequencedFutureManager getSequencedFutureManager(T t) {
        ConnectedControllerRecord<T> connectedControllerRecord;
        synchronized (this.lock) {
            try {
                MediaSession.ControllerInfo controller = getController(t);
                connectedControllerRecord = controller != null ? this.controllerRecords.get(controller) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (connectedControllerRecord != null) {
            return connectedControllerRecord.sequencedFutureManager;
        }
        return null;
    }

    public boolean isSessionCommandAvailable(MediaSession.ControllerInfo controllerInfo, int i) {
        ConnectedControllerRecord<T> connectedControllerRecord;
        synchronized (this.lock) {
            connectedControllerRecord = this.controllerRecords.get(controllerInfo);
        }
        return connectedControllerRecord != null && connectedControllerRecord.sessionCommands.contains(i);
    }

    @GuardedBy("lock")
    private void flushCommandQueue(ConnectedControllerRecord<T> connectedControllerRecord) {
        MediaSessionImpl mediaSessionImpl = this.sessionImpl.get();
        if (mediaSessionImpl == null) {
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        while (atomicBoolean.get()) {
            atomicBoolean.set(false);
            final AsyncCommand poll = connectedControllerRecord.commandQueue.poll();
            if (poll == null) {
                connectedControllerRecord.commandQueueIsFlushing = false;
                return;
            }
            final AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
            final ConnectedControllerRecord<T> connectedControllerRecord2 = connectedControllerRecord;
            Util.postOrRun(mediaSessionImpl.getApplicationHandler(), mediaSessionImpl.callWithControllerForCurrentRequestSet(getController(connectedControllerRecord.controllerKey), new Runnable() { // from class: androidx.media3.session.a
                @Override // java.lang.Runnable
                public final void run() {
                    ConnectedControllersManager.this.lambda$flushCommandQueue$3(poll, atomicBoolean2, connectedControllerRecord2, atomicBoolean);
                }
            }));
            atomicBoolean2.set(false);
            connectedControllerRecord = connectedControllerRecord2;
        }
    }
}
