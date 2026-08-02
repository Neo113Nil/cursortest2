package androidx.media3.session;

import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.BundleListRetriever;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Rating;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.session.ConnectedControllersManager;
import androidx.media3.session.IMediaSession;
import androidx.media3.session.MediaLibraryService;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionStub;
import androidx.media3.session.PlayerInfo;
import androidx.media3.session.legacy.MediaSessionManager;
import com.google.common.collect.D;
import com.google.common.collect.G;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
final class MediaSessionStub extends IMediaSession.Stub {
    private static final String TAG = "MediaSessionStub";
    public static final int UNKNOWN_SEQUENCE_NUMBER = Integer.MIN_VALUE;
    public static final int VERSION_INT = 5;
    private final ConnectedControllersManager<IBinder> connectedControllersManager;
    private int nextUniqueTrackGroupIdPrefix;
    private final WeakReference<MediaSessionImpl> sessionImpl;
    private final Set<MediaSession.ControllerInfo> pendingControllers = Collections.synchronizedSet(new HashSet());
    private com.google.common.collect.D<TrackGroup, String> trackGroupIdMap = com.google.common.collect.h0.k;

    public static final class Controller2Cb implements MediaSession.ControllerCb {
        private final int controllerInterfaceVersion;
        private final IMediaController iController;

        public Controller2Cb(IMediaController iMediaController, int i) {
            this.iController = iMediaController;
            this.controllerInterfaceVersion = i;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != Controller2Cb.class) {
                return false;
            }
            return Objects.equals(getCallbackBinder(), ((Controller2Cb) obj).getCallbackBinder());
        }

        public IBinder getCallbackBinder() {
            return this.iController.asBinder();
        }

        public int hashCode() {
            return ObjectsCompat.hash(getCallbackBinder());
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onAvailableCommandsChangedFromPlayer(int i, Player.Commands commands) throws RemoteException {
            this.iController.onAvailableCommandsChangedFromPlayer(i, commands.toBundle());
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onAvailableCommandsChangedFromSession(int i, SessionCommands sessionCommands, Player.Commands commands) throws RemoteException {
            this.iController.onAvailableCommandsChangedFromSession(i, sessionCommands.toBundle(), commands.toBundle());
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onChildrenChanged(int i, String str, int i2, @Nullable MediaLibraryService.LibraryParams libraryParams) throws RemoteException {
            this.iController.onChildrenChanged(i, str, i2, libraryParams == null ? null : libraryParams.toBundle());
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onDisconnected(int i) {
            SessionUtil.disconnectIMediaController(this.iController);
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onError(int i, SessionError sessionError) throws RemoteException {
            this.iController.onError(i, sessionError.toBundle());
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onLibraryResult(int i, LibraryResult<?> libraryResult) throws RemoteException {
            this.iController.onLibraryResult(i, libraryResult.toBundle());
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onPeriodicSessionPositionInfoChanged(int i, SessionPositionInfo sessionPositionInfo, boolean z, boolean z2, int i2) throws RemoteException {
            this.iController.onPeriodicSessionPositionInfoChanged(i, sessionPositionInfo.filterByAvailableCommands(z, z2).toBundle(i2));
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onPlayerInfoChanged(int i, PlayerInfo playerInfo, Player.Commands commands, boolean z, boolean z2) throws RemoteException {
            Assertions.checkState(this.controllerInterfaceVersion != 0);
            boolean z3 = z || !commands.contains(17);
            boolean z4 = z2 || !commands.contains(30);
            if (this.controllerInterfaceVersion < 2) {
                this.iController.onPlayerInfoChanged(i, playerInfo.filterByAvailableCommands(commands, z, true).toBundleForRemoteProcess(this.controllerInterfaceVersion), z3);
            } else {
                PlayerInfo filterByAvailableCommands = playerInfo.filterByAvailableCommands(commands, z, z2);
                this.iController.onPlayerInfoChangedWithExclusions(i, this.iController instanceof MediaControllerStub ? filterByAvailableCommands.toBundleInProcess() : filterByAvailableCommands.toBundleForRemoteProcess(this.controllerInterfaceVersion), new PlayerInfo.BundlingExclusions(z3, z4).toBundle());
            }
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onRenderedFirstFrame(int i) throws RemoteException {
            this.iController.onRenderedFirstFrame(i);
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onSearchResultChanged(int i, String str, int i2, @Nullable MediaLibraryService.LibraryParams libraryParams) throws RemoteException {
            this.iController.onSearchResultChanged(i, str, i2, libraryParams == null ? null : libraryParams.toBundle());
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onSessionActivityChanged(int i, @Nullable PendingIntent pendingIntent) throws RemoteException {
            this.iController.onSessionActivityChanged(i, pendingIntent);
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onSessionExtrasChanged(int i, Bundle bundle) throws RemoteException {
            this.iController.onExtrasChanged(i, bundle);
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void onSessionResult(int i, SessionResult sessionResult) throws RemoteException {
            this.iController.onSessionResult(i, sessionResult.toBundle());
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void sendCustomCommand(int i, SessionCommand sessionCommand, Bundle bundle) throws RemoteException {
            this.iController.onCustomCommand(i, sessionCommand.toBundle(), bundle);
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void setCustomLayout(int i, List<CommandButton> list) throws RemoteException {
            this.iController.onSetCustomLayout(i, BundleCollectionUtil.toBundleList(list, new C0503h()));
        }

        @Override // androidx.media3.session.MediaSession.ControllerCb
        public void setMediaButtonPreferences(int i, List<CommandButton> list) throws RemoteException {
            if (this.controllerInterfaceVersion >= 7) {
                this.iController.onSetMediaButtonPreferences(i, BundleCollectionUtil.toBundleList(list, new C0503h()));
            } else {
                this.iController.onSetCustomLayout(i, BundleCollectionUtil.toBundleList(CommandButton.getCustomLayoutFromMediaButtonPreferences(list, true, true), new C0503h()));
            }
        }
    }

    public interface ControllerPlayerTask {
        void run(PlayerWrapper playerWrapper, MediaSession.ControllerInfo controllerInfo);
    }

    public interface MediaItemPlayerTask {
        void run(PlayerWrapper playerWrapper, MediaSession.ControllerInfo controllerInfo, List<MediaItem> list);
    }

    public interface MediaItemsWithStartPositionPlayerTask {
        void run(PlayerWrapper playerWrapper, MediaSession.MediaItemsWithStartPosition mediaItemsWithStartPosition);
    }

    public interface SessionTask<T, K extends MediaSessionImpl> {
        T run(K k, MediaSession.ControllerInfo controllerInfo, int i);
    }

    public MediaSessionStub(MediaSessionImpl mediaSessionImpl) {
        this.sessionImpl = new WeakReference<>(mediaSessionImpl);
        this.connectedControllersManager = new ConnectedControllersManager<>(mediaSessionImpl);
    }

    private <K extends MediaSessionImpl> void dispatchSessionTaskWithSessionCommand(IMediaController iMediaController, int i, int i2, SessionTask<com.google.common.util.concurrent.u<Void>, K> sessionTask) {
        dispatchSessionTaskWithSessionCommand(iMediaController, i, null, i2, sessionTask);
    }

    private String generateUniqueTrackGroupId(TrackGroup trackGroup) {
        StringBuilder sb = new StringBuilder();
        int i = this.nextUniqueTrackGroupIdPrefix;
        this.nextUniqueTrackGroupIdPrefix = i + 1;
        sb.append(Util.intToStringMaxRadix(i));
        sb.append("-");
        sb.append(trackGroup.f27id);
        return sb.toString();
    }

    private static <K extends MediaSessionImpl> SessionTask<com.google.common.util.concurrent.u<SessionResult>, K> handleMediaItemsWhenReady(final SessionTask<com.google.common.util.concurrent.u<List<MediaItem>>, K> sessionTask, final MediaItemPlayerTask mediaItemPlayerTask) {
        return new SessionTask() { // from class: androidx.media3.session.z5
            @Override // androidx.media3.session.MediaSessionStub.SessionTask
            public final Object run(MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
                com.google.common.util.concurrent.u lambda$handleMediaItemsWhenReady$6;
                lambda$handleMediaItemsWhenReady$6 = MediaSessionStub.lambda$handleMediaItemsWhenReady$6(MediaSessionStub.SessionTask.this, mediaItemPlayerTask, mediaSessionImpl, controllerInfo, i);
                return lambda$handleMediaItemsWhenReady$6;
            }
        };
    }

    private static <K extends MediaSessionImpl> SessionTask<com.google.common.util.concurrent.u<SessionResult>, K> handleMediaItemsWithStartPositionWhenReady(SessionTask<com.google.common.util.concurrent.u<MediaSession.MediaItemsWithStartPosition>, K> sessionTask, MediaItemsWithStartPositionPlayerTask mediaItemsWithStartPositionPlayerTask) {
        return new U(sessionTask, mediaItemsWithStartPositionPlayerTask);
    }

    private static <T, K extends MediaSessionImpl> com.google.common.util.concurrent.u<Void> handleSessionTaskWhenReady(final K k, MediaSession.ControllerInfo controllerInfo, int i, SessionTask<com.google.common.util.concurrent.u<T>, K> sessionTask, final Consumer<com.google.common.util.concurrent.u<T>> consumer) {
        if (k.isReleased()) {
            return com.google.common.util.concurrent.r.b;
        }
        final com.google.common.util.concurrent.u<T> run = sessionTask.run(k, controllerInfo, i);
        final com.google.common.util.concurrent.x xVar = new com.google.common.util.concurrent.x();
        run.addListener(new Runnable() { // from class: androidx.media3.session.D4
            @Override // java.lang.Runnable
            public final void run() {
                MediaSessionStub.lambda$handleSessionTaskWhenReady$16(MediaSessionImpl.this, xVar, consumer, run);
            }
        }, com.google.common.util.concurrent.j.a);
        return xVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.common.util.concurrent.u lambda$addMediaItem$34(MediaItem mediaItem, MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        return mediaSessionImpl.onAddMediaItemsOnHandler(controllerInfo, com.google.common.collect.G.n(mediaItem));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.common.util.concurrent.u lambda$addMediaItemWithIndex$36(MediaItem mediaItem, MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        return mediaSessionImpl.onAddMediaItemsOnHandler(controllerInfo, com.google.common.collect.G.n(mediaItem));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addMediaItemWithIndex$37(int i, PlayerWrapper playerWrapper, MediaSession.ControllerInfo controllerInfo, List list) {
        playerWrapper.addMediaItems(maybeCorrectMediaItemIndex(controllerInfo, playerWrapper, i), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.common.util.concurrent.u lambda$addMediaItems$38(List list, MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        return mediaSessionImpl.onAddMediaItemsOnHandler(controllerInfo, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.common.util.concurrent.u lambda$addMediaItemsWithIndex$40(List list, MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        return mediaSessionImpl.onAddMediaItemsOnHandler(controllerInfo, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addMediaItemsWithIndex$41(int i, PlayerWrapper playerWrapper, MediaSession.ControllerInfo controllerInfo, List list) {
        playerWrapper.addMediaItems(maybeCorrectMediaItemIndex(controllerInfo, playerWrapper, i), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$connect$17(MediaSession.ControllerInfo controllerInfo, MediaSessionImpl mediaSessionImpl, IMediaController iMediaController) {
        IMediaController iMediaController2;
        Player.Commands commands;
        boolean z = false;
        try {
            this.pendingControllers.remove(controllerInfo);
            if (mediaSessionImpl.isReleased()) {
                SessionUtil.disconnectIMediaController(iMediaController);
                return;
            }
            IBinder callbackBinder = ((Controller2Cb) Assertions.checkStateNotNull((Controller2Cb) controllerInfo.getControllerCb())).getCallbackBinder();
            MediaSession.ConnectionResult onConnectOnHandler = mediaSessionImpl.onConnectOnHandler(controllerInfo);
            if (!onConnectOnHandler.isAccepted && !controllerInfo.isTrusted()) {
                SessionUtil.disconnectIMediaController(iMediaController);
                return;
            }
            if (!onConnectOnHandler.isAccepted) {
                onConnectOnHandler = MediaSession.ConnectionResult.accept(SessionCommands.EMPTY, Player.Commands.EMPTY);
            }
            if (this.connectedControllersManager.isConnected(controllerInfo)) {
                Log.w(TAG, "Controller " + controllerInfo + " has sent connection request multiple times");
            }
            this.connectedControllersManager.addController(callbackBinder, controllerInfo, onConnectOnHandler.availableSessionCommands, onConnectOnHandler.availablePlayerCommands);
            SequencedFutureManager sequencedFutureManager = this.connectedControllersManager.getSequencedFutureManager(controllerInfo);
            if (sequencedFutureManager == null) {
                Log.w(TAG, "Ignoring connection request from unknown controller info");
                SessionUtil.disconnectIMediaController(iMediaController);
                return;
            }
            PlayerWrapper playerWrapper = mediaSessionImpl.getPlayerWrapper();
            PlayerInfo playerInfo = mediaSessionImpl.getPlayerInfo();
            PlaybackException playbackException = mediaSessionImpl.getPlaybackException();
            if (playbackException == null) {
                commands = onConnectOnHandler.availablePlayerCommands;
            } else {
                this.connectedControllersManager.setPlaybackException(controllerInfo, playbackException, onConnectOnHandler.availablePlayerCommands);
                playerInfo = MediaSessionImpl.createPlayerInfoForCustomPlaybackException(playerInfo, playbackException);
                commands = (Player.Commands) Assertions.checkNotNull(MediaSessionImpl.createPlayerCommandsForCustomErrorState(onConnectOnHandler.availablePlayerCommands));
            }
            Player.Commands commands2 = commands;
            PlayerInfo generateAndCacheUniqueTrackGroupIds = generateAndCacheUniqueTrackGroupIds(playerInfo);
            MediaSession.Token platformToken = mediaSessionImpl.getPlatformToken();
            PendingIntent pendingIntent = onConnectOnHandler.sessionActivity;
            if (pendingIntent == null) {
                pendingIntent = mediaSessionImpl.getSessionActivity();
            }
            com.google.common.collect.G<CommandButton> g = onConnectOnHandler.customLayout;
            if (g == null) {
                g = mediaSessionImpl.getCustomLayout();
            }
            com.google.common.collect.G<CommandButton> g2 = onConnectOnHandler.mediaButtonPreferences;
            if (g2 == null) {
                g2 = mediaSessionImpl.getMediaButtonPreferences();
            }
            com.google.common.collect.G<CommandButton> commandButtonsForMediaItems = mediaSessionImpl.getCommandButtonsForMediaItems();
            SessionCommands sessionCommands = onConnectOnHandler.availableSessionCommands;
            Player.Commands availableCommands = playerWrapper.getAvailableCommands();
            Bundle extras = mediaSessionImpl.getToken().getExtras();
            Bundle bundle = onConnectOnHandler.sessionExtras;
            if (bundle == null) {
                bundle = mediaSessionImpl.getSessionExtras();
            }
            iMediaController2 = iMediaController;
            try {
                ConnectionState connectionState = new ConnectionState(MediaLibraryInfo.VERSION_INT, 5, this, pendingIntent, g, g2, commandButtonsForMediaItems, sessionCommands, commands2, availableCommands, extras, bundle, generateAndCacheUniqueTrackGroupIds, platformToken);
                if (mediaSessionImpl.isReleased()) {
                    SessionUtil.disconnectIMediaController(iMediaController2);
                    return;
                }
                try {
                    iMediaController2.onConnected(sequencedFutureManager.obtainNextSequenceNumber(), iMediaController2 instanceof MediaControllerStub ? connectionState.toBundleInProcess() : connectionState.toBundleForRemoteProcess(controllerInfo.getInterfaceVersion()));
                    z = true;
                } catch (RemoteException unused) {
                }
                if (z) {
                    mediaSessionImpl.onPostConnectOnHandler(controllerInfo);
                }
                if (z) {
                    return;
                }
                SessionUtil.disconnectIMediaController(iMediaController2);
            } catch (Throwable th) {
                th = th;
                if (!z) {
                    SessionUtil.disconnectIMediaController(iMediaController2);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            iMediaController2 = iMediaController;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispatchSessionTaskWithSessionCommand$15(MediaSession.ControllerInfo controllerInfo, SessionCommand sessionCommand, MediaSessionImpl mediaSessionImpl, int i, int i2, SessionTask sessionTask) {
        if (this.connectedControllersManager.isConnected(controllerInfo)) {
            if (sessionCommand != null) {
                if (!this.connectedControllersManager.isSessionCommandAvailable(controllerInfo, sessionCommand)) {
                    sendSessionResult(mediaSessionImpl, controllerInfo, i, new SessionResult(-4));
                    return;
                }
            } else if (!this.connectedControllersManager.isSessionCommandAvailable(controllerInfo, i2)) {
                sendSessionResult(mediaSessionImpl, controllerInfo, i, new SessionResult(-4));
                return;
            }
            sessionTask.run(mediaSessionImpl, controllerInfo, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$flushCommandQueue$64(MediaSession.ControllerInfo controllerInfo) {
        this.connectedControllersManager.flushCommandQueue(controllerInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.common.util.concurrent.u lambda$getChildren$68(String str, int i, int i2, MediaLibraryService.LibraryParams libraryParams, MediaLibrarySessionImpl mediaLibrarySessionImpl, MediaSession.ControllerInfo controllerInfo, int i3) {
        return mediaLibrarySessionImpl.onGetChildrenOnHandler(controllerInfo, str, i, i2, libraryParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.common.util.concurrent.u lambda$getItem$67(String str, MediaLibrarySessionImpl mediaLibrarySessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        return mediaLibrarySessionImpl.onGetItemOnHandler(controllerInfo, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.common.util.concurrent.u lambda$getLibraryRoot$66(MediaLibraryService.LibraryParams libraryParams, MediaLibrarySessionImpl mediaLibrarySessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        return mediaLibrarySessionImpl.onGetLibraryRootOnHandler(controllerInfo, libraryParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.common.util.concurrent.u lambda$getSearchResult$70(String str, int i, int i2, MediaLibraryService.LibraryParams libraryParams, MediaLibrarySessionImpl mediaLibrarySessionImpl, MediaSession.ControllerInfo controllerInfo, int i3) {
        return mediaLibrarySessionImpl.onGetSearchResultOnHandler(controllerInfo, str, i, i2, libraryParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$handleMediaItemsWhenReady$4(MediaSessionImpl mediaSessionImpl, MediaItemPlayerTask mediaItemPlayerTask, MediaSession.ControllerInfo controllerInfo, List list) {
        if (mediaSessionImpl.isReleased()) {
            return;
        }
        mediaItemPlayerTask.run(mediaSessionImpl.getPlayerWrapper(), controllerInfo, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.common.util.concurrent.u lambda$handleMediaItemsWhenReady$5(final MediaSessionImpl mediaSessionImpl, final MediaSession.ControllerInfo controllerInfo, final MediaItemPlayerTask mediaItemPlayerTask, final List list) throws Exception {
        return Util.postOrRunWithCompletion(mediaSessionImpl.getApplicationHandler(), mediaSessionImpl.callWithControllerForCurrentRequestSet(controllerInfo, new Runnable() { // from class: androidx.media3.session.w5
            @Override // java.lang.Runnable
            public final void run() {
                MediaSessionStub.lambda$handleMediaItemsWhenReady$4(MediaSessionImpl.this, mediaItemPlayerTask, controllerInfo, list);
            }
        }), new SessionResult(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.common.util.concurrent.u lambda$handleMediaItemsWhenReady$6(SessionTask sessionTask, final MediaItemPlayerTask mediaItemPlayerTask, final MediaSessionImpl mediaSessionImpl, final MediaSession.ControllerInfo controllerInfo, int i) {
        return mediaSessionImpl.isReleased() ? com.google.common.util.concurrent.o.d(new SessionResult(-100)) : Util.transformFutureAsync((com.google.common.util.concurrent.u) sessionTask.run(mediaSessionImpl, controllerInfo, i), new com.google.common.util.concurrent.h() { // from class: androidx.media3.session.I4
            @Override // com.google.common.util.concurrent.h
            public final com.google.common.util.concurrent.u apply(Object obj) {
                com.google.common.util.concurrent.u lambda$handleMediaItemsWhenReady$5;
                lambda$handleMediaItemsWhenReady$5 = MediaSessionStub.lambda$handleMediaItemsWhenReady$5(MediaSessionImpl.this, controllerInfo, mediaItemPlayerTask, (List) obj);
                return lambda$handleMediaItemsWhenReady$5;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$handleMediaItemsWithStartPositionWhenReady$7(MediaSessionImpl mediaSessionImpl, MediaItemsWithStartPositionPlayerTask mediaItemsWithStartPositionPlayerTask, MediaSession.MediaItemsWithStartPosition mediaItemsWithStartPosition) {
        if (mediaSessionImpl.isReleased()) {
            return;
        }
        mediaItemsWithStartPositionPlayerTask.run(mediaSessionImpl.getPlayerWrapper(), mediaItemsWithStartPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.common.util.concurrent.u lambda$handleMediaItemsWithStartPositionWhenReady$8(final MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, final MediaItemsWithStartPositionPlayerTask mediaItemsWithStartPositionPlayerTask, final MediaSession.MediaItemsWithStartPosition mediaItemsWithStartPosition) throws Exception {
        return Util.postOrRunWithCompletion(mediaSessionImpl.getApplicationHandler(), mediaSessionImpl.callWithControllerForCurrentRequestSet(controllerInfo, new Runnable() { // from class: androidx.media3.session.U4
            @Override // java.lang.Runnable
            public final void run() {
                MediaSessionStub.lambda$handleMediaItemsWithStartPositionWhenReady$7(MediaSessionImpl.this, mediaItemsWithStartPositionPlayerTask, mediaItemsWithStartPosition);
            }
        }), new SessionResult(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.common.util.concurrent.u lambda$handleMediaItemsWithStartPositionWhenReady$9(SessionTask sessionTask, final MediaItemsWithStartPositionPlayerTask mediaItemsWithStartPositionPlayerTask, final MediaSessionImpl mediaSessionImpl, final MediaSession.ControllerInfo controllerInfo, int i) {
        return mediaSessionImpl.isReleased() ? com.google.common.util.concurrent.o.d(new SessionResult(-100)) : Util.transformFutureAsync((com.google.common.util.concurrent.u) sessionTask.run(mediaSessionImpl, controllerInfo, i), new com.google.common.util.concurrent.h() { // from class: androidx.media3.session.z4
            @Override // com.google.common.util.concurrent.h
            public final com.google.common.util.concurrent.u apply(Object obj) {
                com.google.common.util.concurrent.u lambda$handleMediaItemsWithStartPositionWhenReady$8;
                lambda$handleMediaItemsWithStartPositionWhenReady$8 = MediaSessionStub.lambda$handleMediaItemsWithStartPositionWhenReady$8(MediaSessionImpl.this, controllerInfo, mediaItemsWithStartPositionPlayerTask, (MediaSession.MediaItemsWithStartPosition) obj);
                return lambda$handleMediaItemsWithStartPositionWhenReady$8;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$handleSessionTaskWhenReady$16(MediaSessionImpl mediaSessionImpl, com.google.common.util.concurrent.x xVar, Consumer consumer, com.google.common.util.concurrent.u uVar) {
        if (mediaSessionImpl.isReleased()) {
            xVar.set(null);
            return;
        }
        try {
            consumer.accept(uVar);
            xVar.set(null);
        } catch (Throwable th) {
            xVar.setException(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.common.util.concurrent.u lambda$onCustomCommand$24(SessionCommand sessionCommand, Bundle bundle, MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        return mediaSessionImpl.onCustomCommandOnHandler(controllerInfo, sessionCommand, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playForControllerInfo$19(MediaSession.ControllerInfo controllerInfo, PlayerWrapper playerWrapper) {
        MediaSessionImpl mediaSessionImpl = this.sessionImpl.get();
        if (mediaSessionImpl == null || mediaSessionImpl.isReleased()) {
            return;
        }
        mediaSessionImpl.handleMediaControllerPlayRequest(controllerInfo, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.common.util.concurrent.u lambda$queueSessionTaskWithPlayerCommandForControllerInfo$13(SessionTask sessionTask, MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        return (com.google.common.util.concurrent.u) sessionTask.run(mediaSessionImpl, controllerInfo, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queueSessionTaskWithPlayerCommandForControllerInfo$14(final MediaSession.ControllerInfo controllerInfo, int i, final MediaSessionImpl mediaSessionImpl, final int i2, final SessionTask sessionTask) {
        if (!this.connectedControllersManager.isPlayerCommandAvailable(controllerInfo, i)) {
            sendSessionResult(mediaSessionImpl, controllerInfo, i2, new SessionResult(-4));
            return;
        }
        int onPlayerCommandRequestOnHandler = mediaSessionImpl.onPlayerCommandRequestOnHandler(controllerInfo, i);
        if (onPlayerCommandRequestOnHandler != 0) {
            sendSessionResult(mediaSessionImpl, controllerInfo, i2, new SessionResult(onPlayerCommandRequestOnHandler));
        } else if (i != 27) {
            this.connectedControllersManager.addToCommandQueue(controllerInfo, i, new ConnectedControllersManager.AsyncCommand() { // from class: androidx.media3.session.G4
                @Override // androidx.media3.session.ConnectedControllersManager.AsyncCommand
                public final com.google.common.util.concurrent.u run() {
                    com.google.common.util.concurrent.u lambda$queueSessionTaskWithPlayerCommandForControllerInfo$13;
                    lambda$queueSessionTaskWithPlayerCommandForControllerInfo$13 = MediaSessionStub.lambda$queueSessionTaskWithPlayerCommandForControllerInfo$13(MediaSessionStub.SessionTask.this, mediaSessionImpl, controllerInfo, i2);
                    return lambda$queueSessionTaskWithPlayerCommandForControllerInfo$13;
                }
            });
        } else {
            mediaSessionImpl.callWithControllerForCurrentRequestSet(controllerInfo, new Runnable() { // from class: androidx.media3.session.E4
                @Override // java.lang.Runnable
                public final void run() {
                    MediaSessionStub.SessionTask.this.run(mediaSessionImpl, controllerInfo, i2);
                }
            }).run();
            this.connectedControllersManager.addToCommandQueue(controllerInfo, i, new F4());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$18(IMediaController iMediaController) {
        this.connectedControllersManager.removeController((ConnectedControllersManager<IBinder>) iMediaController.asBinder());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeMediaItem$42(int i, PlayerWrapper playerWrapper, MediaSession.ControllerInfo controllerInfo) {
        playerWrapper.removeMediaItem(maybeCorrectMediaItemIndex(controllerInfo, playerWrapper, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeMediaItems$43(int i, int i2, PlayerWrapper playerWrapper, MediaSession.ControllerInfo controllerInfo) {
        playerWrapper.removeMediaItems(maybeCorrectMediaItemIndex(controllerInfo, playerWrapper, i), maybeCorrectMediaItemIndex(controllerInfo, playerWrapper, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.common.util.concurrent.u lambda$replaceMediaItem$46(MediaItem mediaItem, MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        return mediaSessionImpl.onAddMediaItemsOnHandler(controllerInfo, com.google.common.collect.G.n(mediaItem));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$replaceMediaItem$47(int i, PlayerWrapper playerWrapper, MediaSession.ControllerInfo controllerInfo, List list) {
        if (list.size() == 1) {
            playerWrapper.replaceMediaItem(maybeCorrectMediaItemIndex(controllerInfo, playerWrapper, i), (MediaItem) list.get(0));
        } else {
            playerWrapper.replaceMediaItems(maybeCorrectMediaItemIndex(controllerInfo, playerWrapper, i), maybeCorrectMediaItemIndex(controllerInfo, playerWrapper, i + 1), list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.common.util.concurrent.u lambda$replaceMediaItems$48(com.google.common.collect.G g, MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        return mediaSessionImpl.onAddMediaItemsOnHandler(controllerInfo, g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$replaceMediaItems$49(int i, int i2, PlayerWrapper playerWrapper, MediaSession.ControllerInfo controllerInfo, List list) {
        playerWrapper.replaceMediaItems(maybeCorrectMediaItemIndex(controllerInfo, playerWrapper, i), maybeCorrectMediaItemIndex(controllerInfo, playerWrapper, i2), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.common.util.concurrent.u lambda$search$69(String str, MediaLibraryService.LibraryParams libraryParams, MediaLibrarySessionImpl mediaLibrarySessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        return mediaLibrarySessionImpl.onSearchOnHandler(controllerInfo, str, libraryParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$seekToDefaultPositionWithMediaItemIndex$21(int i, PlayerWrapper playerWrapper, MediaSession.ControllerInfo controllerInfo) {
        playerWrapper.seekToDefaultPosition(maybeCorrectMediaItemIndex(controllerInfo, playerWrapper, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$seekToWithMediaItemIndex$23(int i, long j, PlayerWrapper playerWrapper, MediaSession.ControllerInfo controllerInfo) {
        playerWrapper.seekTo(maybeCorrectMediaItemIndex(controllerInfo, playerWrapper, i), j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void lambda$sendLibraryResultWhenReady$10(MediaSession.ControllerInfo controllerInfo, int i, com.google.common.util.concurrent.u uVar) {
        LibraryResult ofError;
        try {
            ofError = (LibraryResult) Assertions.checkNotNull((LibraryResult) uVar.get(), "LibraryResult must not be null");
        } catch (InterruptedException e) {
            e = e;
            Log.w(TAG, "Library operation failed", e);
            ofError = LibraryResult.ofError(-1);
        } catch (CancellationException e2) {
            Log.w(TAG, "Library operation cancelled", e2);
            ofError = LibraryResult.ofError(1);
        } catch (ExecutionException e3) {
            e = e3;
            Log.w(TAG, "Library operation failed", e);
            ofError = LibraryResult.ofError(-1);
        }
        sendLibraryResult(controllerInfo, i, ofError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.common.util.concurrent.u lambda$sendLibraryResultWhenReady$11(SessionTask sessionTask, MediaLibrarySessionImpl mediaLibrarySessionImpl, final MediaSession.ControllerInfo controllerInfo, final int i) {
        return handleSessionTaskWhenReady(mediaLibrarySessionImpl, controllerInfo, i, sessionTask, new Consumer() { // from class: androidx.media3.session.A4
            @Override // androidx.media3.common.util.Consumer
            public final void accept(Object obj) {
                MediaSessionStub.lambda$sendLibraryResultWhenReady$10(MediaSession.ControllerInfo.this, i, (com.google.common.util.concurrent.u) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.common.util.concurrent.u lambda$sendSessionResultSuccess$1(ControllerPlayerTask controllerPlayerTask, MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        if (mediaSessionImpl.isReleased()) {
            return com.google.common.util.concurrent.r.b;
        }
        controllerPlayerTask.run(mediaSessionImpl.getPlayerWrapper(), controllerInfo);
        sendSessionResult(mediaSessionImpl, controllerInfo, i, new SessionResult(0));
        return com.google.common.util.concurrent.r.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void lambda$sendSessionResultWhenReady$2(MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i, com.google.common.util.concurrent.u uVar) {
        SessionResult sessionResult;
        try {
            sessionResult = (SessionResult) Assertions.checkNotNull((SessionResult) uVar.get(), "SessionResult must not be null");
        } catch (InterruptedException e) {
            e = e;
            Log.w(TAG, "Session operation failed", e);
            sessionResult = new SessionResult(!(e.getCause() instanceof UnsupportedOperationException) ? -6 : -1);
        } catch (CancellationException e2) {
            Log.w(TAG, "Session operation cancelled", e2);
            sessionResult = new SessionResult(1);
        } catch (ExecutionException e3) {
            e = e3;
            Log.w(TAG, "Session operation failed", e);
            sessionResult = new SessionResult(!(e.getCause() instanceof UnsupportedOperationException) ? -6 : -1);
        }
        sendSessionResult(mediaSessionImpl, controllerInfo, i, sessionResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.common.util.concurrent.u lambda$sendSessionResultWhenReady$3(SessionTask sessionTask, final MediaSessionImpl mediaSessionImpl, final MediaSession.ControllerInfo controllerInfo, final int i) {
        return handleSessionTaskWhenReady(mediaSessionImpl, controllerInfo, i, sessionTask, new Consumer() { // from class: androidx.media3.session.v5
            @Override // androidx.media3.common.util.Consumer
            public final void accept(Object obj) {
                MediaSessionStub.lambda$sendSessionResultWhenReady$2(MediaSessionImpl.this, controllerInfo, i, (com.google.common.util.concurrent.u) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.common.util.concurrent.u lambda$setMediaItemWithResetPosition$30(MediaItem mediaItem, boolean z, MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        return mediaSessionImpl.onSetMediaItemsOnHandler(controllerInfo, com.google.common.collect.G.n(mediaItem), z ? -1 : mediaSessionImpl.getPlayerWrapper().getCurrentMediaItemIndex(), z ? -9223372036854775807L : mediaSessionImpl.getPlayerWrapper().getCurrentPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.common.util.concurrent.u lambda$setMediaItemWithStartPosition$29(MediaItem mediaItem, long j, MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        return mediaSessionImpl.onSetMediaItemsOnHandler(controllerInfo, com.google.common.collect.G.n(mediaItem), 0, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.common.util.concurrent.u lambda$setMediaItemsWithResetPosition$31(List list, boolean z, MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        return mediaSessionImpl.onSetMediaItemsOnHandler(controllerInfo, list, z ? -1 : mediaSessionImpl.getPlayerWrapper().getCurrentMediaItemIndex(), z ? -9223372036854775807L : mediaSessionImpl.getPlayerWrapper().getCurrentPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.common.util.concurrent.u lambda$setMediaItemsWithStartIndex$32(List list, int i, long j, MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i2) {
        int currentMediaItemIndex = i == -1 ? mediaSessionImpl.getPlayerWrapper().getCurrentMediaItemIndex() : i;
        if (i == -1) {
            j = mediaSessionImpl.getPlayerWrapper().getCurrentPosition();
        }
        return mediaSessionImpl.onSetMediaItemsOnHandler(controllerInfo, list, currentMediaItemIndex, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.common.util.concurrent.u lambda$setRating$26(Rating rating, MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        return mediaSessionImpl.onSetRatingOnHandler(controllerInfo, rating);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.common.util.concurrent.u lambda$setRatingWithMediaId$25(String str, Rating rating, MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        return mediaSessionImpl.onSetRatingOnHandler(controllerInfo, str, rating);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTrackSelectionParameters$65(TrackSelectionParameters trackSelectionParameters, PlayerWrapper playerWrapper) {
        playerWrapper.setTrackSelectionParameters(updateOverridesUsingUniqueTrackGroupIds(trackSelectionParameters));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.common.util.concurrent.u lambda$subscribe$71(String str, MediaLibraryService.LibraryParams libraryParams, MediaLibrarySessionImpl mediaLibrarySessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        return mediaLibrarySessionImpl.onSubscribeOnHandler(controllerInfo, str, libraryParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.common.util.concurrent.u lambda$unsubscribe$72(String str, MediaLibrarySessionImpl mediaLibrarySessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        return mediaLibrarySessionImpl.onUnsubscribeOnHandler(controllerInfo, str);
    }

    private int maybeCorrectMediaItemIndex(MediaSession.ControllerInfo controllerInfo, PlayerWrapper playerWrapper, int i) {
        return (playerWrapper.isCommandAvailable(17) && !this.connectedControllersManager.isPlayerCommandAvailable(controllerInfo, 17) && this.connectedControllersManager.isPlayerCommandAvailable(controllerInfo, 16)) ? i + playerWrapper.getCurrentMediaItemIndex() : i;
    }

    private <K extends MediaSessionImpl> void queueSessionTaskWithPlayerCommand(IMediaController iMediaController, int i, int i2, SessionTask<com.google.common.util.concurrent.u<Void>, K> sessionTask) {
        MediaSession.ControllerInfo controller = this.connectedControllersManager.getController(iMediaController.asBinder());
        if (controller != null) {
            queueSessionTaskWithPlayerCommandForControllerInfo(controller, i, i2, sessionTask);
        }
    }

    private <K extends MediaSessionImpl> void queueSessionTaskWithPlayerCommandForControllerInfo(final MediaSession.ControllerInfo controllerInfo, final int i, final int i2, final SessionTask<com.google.common.util.concurrent.u<Void>, K> sessionTask) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final MediaSessionImpl mediaSessionImpl = this.sessionImpl.get();
            if (mediaSessionImpl != null && !mediaSessionImpl.isReleased()) {
                Util.postOrRun(mediaSessionImpl.getApplicationHandler(), new Runnable() { // from class: androidx.media3.session.f5
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSessionStub.this.lambda$queueSessionTaskWithPlayerCommandForControllerInfo$14(controllerInfo, i2, mediaSessionImpl, i, sessionTask);
                    }
                });
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    private static void sendLibraryResult(MediaSession.ControllerInfo controllerInfo, int i, LibraryResult<?> libraryResult) {
        try {
            ((MediaSession.ControllerCb) Assertions.checkStateNotNull(controllerInfo.getControllerCb())).onLibraryResult(i, libraryResult);
        } catch (RemoteException e) {
            Log.w(TAG, "Failed to send result to browser " + controllerInfo, e);
        }
    }

    private static <V, K extends MediaLibrarySessionImpl> SessionTask<com.google.common.util.concurrent.u<Void>, K> sendLibraryResultWhenReady(final SessionTask<com.google.common.util.concurrent.u<LibraryResult<V>>, K> sessionTask) {
        return new SessionTask() { // from class: androidx.media3.session.r5
            @Override // androidx.media3.session.MediaSessionStub.SessionTask
            public final Object run(MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
                com.google.common.util.concurrent.u lambda$sendLibraryResultWhenReady$11;
                lambda$sendLibraryResultWhenReady$11 = MediaSessionStub.lambda$sendLibraryResultWhenReady$11(MediaSessionStub.SessionTask.this, (MediaLibrarySessionImpl) mediaSessionImpl, controllerInfo, i);
                return lambda$sendLibraryResultWhenReady$11;
            }
        };
    }

    private static void sendSessionResult(MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i, SessionResult sessionResult) {
        try {
            ((MediaSession.ControllerCb) Assertions.checkStateNotNull(controllerInfo.getControllerCb())).onSessionResult(i, sessionResult);
            mediaSessionImpl.triggerPlayerInfoUpdate();
        } catch (RemoteException e) {
            Log.w(TAG, "Failed to send result to controller " + controllerInfo, e);
        }
    }

    private static <K extends MediaSessionImpl> SessionTask<com.google.common.util.concurrent.u<Void>, K> sendSessionResultSuccess(Consumer<PlayerWrapper> consumer) {
        return sendSessionResultSuccess(new C0556p1(consumer));
    }

    private static <K extends MediaSessionImpl> SessionTask<com.google.common.util.concurrent.u<Void>, K> sendSessionResultWhenReady(SessionTask<com.google.common.util.concurrent.u<SessionResult>, K> sessionTask) {
        return new C0455a0(sessionTask);
    }

    private TrackSelectionParameters updateOverridesUsingUniqueTrackGroupIds(TrackSelectionParameters trackSelectionParameters) {
        if (trackSelectionParameters.overrides.isEmpty()) {
            return trackSelectionParameters;
        }
        TrackSelectionParameters.Builder clearOverrides = trackSelectionParameters.buildUpon().clearOverrides();
        com.google.common.collect.y0<TrackSelectionOverride> it = trackSelectionParameters.overrides.values().iterator();
        while (it.hasNext()) {
            TrackSelectionOverride next = it.next();
            TrackGroup trackGroup = (TrackGroup) this.trackGroupIdMap.i().get(next.mediaTrackGroup.f27id);
            if (trackGroup == null || next.mediaTrackGroup.length != trackGroup.length) {
                clearOverrides.addOverride(next);
            } else {
                clearOverrides.addOverride(new TrackSelectionOverride(trackGroup, next.trackIndices));
            }
        }
        return clearOverrides.build();
    }

    @Override // androidx.media3.session.IMediaSession
    public void addMediaItem(@Nullable IMediaController iMediaController, int i, @Nullable Bundle bundle) {
        if (iMediaController == null || bundle == null) {
            return;
        }
        try {
            queueSessionTaskWithPlayerCommand(iMediaController, i, 20, sendSessionResultWhenReady(handleMediaItemsWhenReady(new C0501g4(MediaItem.fromBundle(bundle)), new k5())));
        } catch (RuntimeException e) {
            Log.w(TAG, "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void addMediaItemWithIndex(@Nullable IMediaController iMediaController, int i, final int i2, @Nullable Bundle bundle) {
        if (iMediaController == null || bundle == null || i2 < 0) {
            return;
        }
        try {
            queueSessionTaskWithPlayerCommand(iMediaController, i, 20, sendSessionResultWhenReady(handleMediaItemsWhenReady(new C0591v0(MediaItem.fromBundle(bundle)), new MediaItemPlayerTask() { // from class: androidx.media3.session.H4
                @Override // androidx.media3.session.MediaSessionStub.MediaItemPlayerTask
                public final void run(PlayerWrapper playerWrapper, MediaSession.ControllerInfo controllerInfo, List list) {
                    MediaSessionStub.this.lambda$addMediaItemWithIndex$37(i2, playerWrapper, controllerInfo, list);
                }
            })));
        } catch (RuntimeException e) {
            Log.w(TAG, "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void addMediaItems(@Nullable IMediaController iMediaController, int i, @Nullable IBinder iBinder) {
        if (iMediaController == null || iBinder == null) {
            return;
        }
        try {
            queueSessionTaskWithPlayerCommand(iMediaController, i, 20, sendSessionResultWhenReady(handleMediaItemsWhenReady(new C0487e4(BundleCollectionUtil.fromBundleList(new C0536m(), BundleListRetriever.getList(iBinder))), new C0516i5())));
        } catch (RuntimeException e) {
            Log.w(TAG, "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void addMediaItemsWithIndex(@Nullable IMediaController iMediaController, int i, final int i2, @Nullable IBinder iBinder) {
        if (iMediaController == null || iBinder == null || i2 < 0) {
            return;
        }
        try {
            queueSessionTaskWithPlayerCommand(iMediaController, i, 20, sendSessionResultWhenReady(handleMediaItemsWhenReady(new J0(BundleCollectionUtil.fromBundleList(new C0536m(), BundleListRetriever.getList(iBinder))), new MediaItemPlayerTask() { // from class: androidx.media3.session.S4
                @Override // androidx.media3.session.MediaSessionStub.MediaItemPlayerTask
                public final void run(PlayerWrapper playerWrapper, MediaSession.ControllerInfo controllerInfo, List list) {
                    MediaSessionStub.this.lambda$addMediaItemsWithIndex$41(i2, playerWrapper, controllerInfo, list);
                }
            })));
        } catch (RuntimeException e) {
            Log.w(TAG, "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void clearMediaItems(@Nullable IMediaController iMediaController, int i) {
        if (iMediaController == null) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 20, sendSessionResultSuccess(new B5()));
    }

    public void connect(@Nullable final IMediaController iMediaController, @Nullable final MediaSession.ControllerInfo controllerInfo) {
        if (iMediaController == null || controllerInfo == null) {
            SessionUtil.disconnectIMediaController(iMediaController);
            return;
        }
        final MediaSessionImpl mediaSessionImpl = this.sessionImpl.get();
        if (mediaSessionImpl == null || mediaSessionImpl.isReleased()) {
            SessionUtil.disconnectIMediaController(iMediaController);
        } else {
            this.pendingControllers.add(controllerInfo);
            Util.postOrRun(mediaSessionImpl.getApplicationHandler(), new Runnable() { // from class: androidx.media3.session.Z4
                @Override // java.lang.Runnable
                public final void run() {
                    MediaSessionStub.this.lambda$connect$17(controllerInfo, mediaSessionImpl, iMediaController);
                }
            });
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void decreaseDeviceVolume(@Nullable IMediaController iMediaController, int i) {
        if (iMediaController == null) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 26, sendSessionResultSuccess(new C0523j5()));
    }

    @Override // androidx.media3.session.IMediaSession
    public void decreaseDeviceVolumeWithFlags(@Nullable IMediaController iMediaController, int i, final int i2) {
        if (iMediaController == null) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 34, sendSessionResultSuccess((Consumer<PlayerWrapper>) new Consumer() { // from class: androidx.media3.session.R4
            @Override // androidx.media3.common.util.Consumer
            public final void accept(Object obj) {
                ((PlayerWrapper) obj).decreaseDeviceVolume(i2);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void flushCommandQueue(@Nullable IMediaController iMediaController) {
        if (iMediaController == null) {
            return;
        }
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            MediaSessionImpl mediaSessionImpl = this.sessionImpl.get();
            if (mediaSessionImpl != null && !mediaSessionImpl.isReleased()) {
                final MediaSession.ControllerInfo controller = this.connectedControllersManager.getController(iMediaController.asBinder());
                if (controller != null) {
                    Util.postOrRun(mediaSessionImpl.getApplicationHandler(), new Runnable() { // from class: androidx.media3.session.V4
                        @Override // java.lang.Runnable
                        public final void run() {
                            MediaSessionStub.this.lambda$flushCommandQueue$64(controller);
                        }
                    });
                }
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public PlayerInfo generateAndCacheUniqueTrackGroupIds(PlayerInfo playerInfo) {
        com.google.common.collect.G<Tracks.Group> groups = playerInfo.currentTracks.getGroups();
        G.a aVar = new G.a();
        D.a aVar2 = new D.a(4);
        for (int i = 0; i < groups.size(); i++) {
            Tracks.Group group = groups.get(i);
            TrackGroup mediaTrackGroup = group.getMediaTrackGroup();
            String str = this.trackGroupIdMap.get(mediaTrackGroup);
            if (str == null) {
                str = generateUniqueTrackGroupId(mediaTrackGroup);
            }
            aVar2.i(mediaTrackGroup, str);
            aVar.c(group.copyWithId(str));
        }
        this.trackGroupIdMap = aVar2.c();
        PlayerInfo copyWithCurrentTracks = playerInfo.copyWithCurrentTracks(new Tracks(aVar.g()));
        if (copyWithCurrentTracks.trackSelectionParameters.overrides.isEmpty()) {
            return copyWithCurrentTracks;
        }
        TrackSelectionParameters.Builder clearOverrides = copyWithCurrentTracks.trackSelectionParameters.buildUpon().clearOverrides();
        com.google.common.collect.y0<TrackSelectionOverride> it = copyWithCurrentTracks.trackSelectionParameters.overrides.values().iterator();
        while (it.hasNext()) {
            TrackSelectionOverride next = it.next();
            TrackGroup trackGroup = next.mediaTrackGroup;
            String str2 = this.trackGroupIdMap.get(trackGroup);
            if (str2 != null) {
                clearOverrides.addOverride(new TrackSelectionOverride(trackGroup.copyWithId(str2), next.trackIndices));
            } else {
                clearOverrides.addOverride(next);
            }
        }
        return copyWithCurrentTracks.copyWithTrackSelectionParameters(clearOverrides.build());
    }

    @Override // androidx.media3.session.IMediaSession
    public void getChildren(@Nullable IMediaController iMediaController, int i, @Nullable final String str, final int i2, final int i3, @Nullable Bundle bundle) {
        final MediaLibraryService.LibraryParams fromBundle;
        if (iMediaController == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            Log.w(TAG, "getChildren(): Ignoring empty parentId");
            return;
        }
        if (i2 < 0) {
            Log.w(TAG, "getChildren(): Ignoring negative page");
            return;
        }
        if (i3 < 1) {
            Log.w(TAG, "getChildren(): Ignoring pageSize less than 1");
            return;
        }
        if (bundle == null) {
            fromBundle = null;
        } else {
            try {
                fromBundle = MediaLibraryService.LibraryParams.fromBundle(bundle);
            } catch (RuntimeException e) {
                Log.w(TAG, "Ignoring malformed Bundle for LibraryParams", e);
                return;
            }
        }
        dispatchSessionTaskWithSessionCommand(iMediaController, i, SessionCommand.COMMAND_CODE_LIBRARY_GET_CHILDREN, sendLibraryResultWhenReady(new SessionTask() { // from class: androidx.media3.session.v4
            @Override // androidx.media3.session.MediaSessionStub.SessionTask
            public final Object run(MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i4) {
                com.google.common.util.concurrent.u lambda$getChildren$68;
                lambda$getChildren$68 = MediaSessionStub.lambda$getChildren$68(str, i2, i3, fromBundle, (MediaLibrarySessionImpl) mediaSessionImpl, controllerInfo, i4);
                return lambda$getChildren$68;
            }
        }));
    }

    public ConnectedControllersManager<IBinder> getConnectedControllersManager() {
        return this.connectedControllersManager;
    }

    @Override // androidx.media3.session.IMediaSession
    public void getItem(@Nullable IMediaController iMediaController, int i, @Nullable String str) {
        if (iMediaController == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            Log.w(TAG, "getItem(): Ignoring empty mediaId");
        } else {
            dispatchSessionTaskWithSessionCommand(iMediaController, i, SessionCommand.COMMAND_CODE_LIBRARY_GET_ITEM, sendLibraryResultWhenReady(new A(str)));
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void getLibraryRoot(@Nullable IMediaController iMediaController, int i, @Nullable Bundle bundle) {
        MediaLibraryService.LibraryParams fromBundle;
        if (iMediaController == null) {
            return;
        }
        if (bundle == null) {
            fromBundle = null;
        } else {
            try {
                fromBundle = MediaLibraryService.LibraryParams.fromBundle(bundle);
            } catch (RuntimeException e) {
                Log.w(TAG, "Ignoring malformed Bundle for LibraryParams", e);
                return;
            }
        }
        dispatchSessionTaskWithSessionCommand(iMediaController, i, 50000, sendLibraryResultWhenReady(new C0538m1(fromBundle)));
    }

    @Override // androidx.media3.session.IMediaSession
    public void getSearchResult(@Nullable IMediaController iMediaController, int i, @Nullable final String str, final int i2, final int i3, @Nullable Bundle bundle) {
        final MediaLibraryService.LibraryParams fromBundle;
        if (iMediaController == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            Log.w(TAG, "getSearchResult(): Ignoring empty query");
            return;
        }
        if (i2 < 0) {
            Log.w(TAG, "getSearchResult(): Ignoring negative page");
            return;
        }
        if (i3 < 1) {
            Log.w(TAG, "getSearchResult(): Ignoring pageSize less than 1");
            return;
        }
        if (bundle == null) {
            fromBundle = null;
        } else {
            try {
                fromBundle = MediaLibraryService.LibraryParams.fromBundle(bundle);
            } catch (RuntimeException e) {
                Log.w(TAG, "Ignoring malformed Bundle for LibraryParams", e);
                return;
            }
        }
        dispatchSessionTaskWithSessionCommand(iMediaController, i, SessionCommand.COMMAND_CODE_LIBRARY_GET_SEARCH_RESULT, sendLibraryResultWhenReady(new SessionTask() { // from class: androidx.media3.session.l5
            @Override // androidx.media3.session.MediaSessionStub.SessionTask
            public final Object run(MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i4) {
                com.google.common.util.concurrent.u lambda$getSearchResult$70;
                lambda$getSearchResult$70 = MediaSessionStub.lambda$getSearchResult$70(str, i2, i3, fromBundle, (MediaLibrarySessionImpl) mediaSessionImpl, controllerInfo, i4);
                return lambda$getSearchResult$70;
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void increaseDeviceVolume(@Nullable IMediaController iMediaController, int i) {
        if (iMediaController == null) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 26, sendSessionResultSuccess(new L4()));
    }

    @Override // androidx.media3.session.IMediaSession
    public void increaseDeviceVolumeWithFlags(@Nullable IMediaController iMediaController, int i, final int i2) {
        if (iMediaController == null) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 34, sendSessionResultSuccess((Consumer<PlayerWrapper>) new Consumer() { // from class: androidx.media3.session.T4
            @Override // androidx.media3.common.util.Consumer
            public final void accept(Object obj) {
                ((PlayerWrapper) obj).increaseDeviceVolume(i2);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void moveMediaItem(@Nullable IMediaController iMediaController, int i, final int i2, final int i3) {
        if (iMediaController == null || i2 < 0 || i3 < 0) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 20, sendSessionResultSuccess((Consumer<PlayerWrapper>) new Consumer() { // from class: androidx.media3.session.u5
            @Override // androidx.media3.common.util.Consumer
            public final void accept(Object obj) {
                ((PlayerWrapper) obj).moveMediaItem(i2, i3);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void moveMediaItems(@Nullable IMediaController iMediaController, int i, final int i2, final int i3, final int i4) {
        if (iMediaController == null || i2 < 0 || i3 < i2 || i4 < 0) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 20, sendSessionResultSuccess((Consumer<PlayerWrapper>) new Consumer() { // from class: androidx.media3.session.X4
            @Override // androidx.media3.common.util.Consumer
            public final void accept(Object obj) {
                ((PlayerWrapper) obj).moveMediaItems(i2, i3, i4);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void onControllerResult(@Nullable IMediaController iMediaController, int i, @Nullable Bundle bundle) {
        if (iMediaController == null || bundle == null) {
            return;
        }
        try {
            SessionResult fromBundle = SessionResult.fromBundle(bundle);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                SequencedFutureManager sequencedFutureManager = this.connectedControllersManager.getSequencedFutureManager((ConnectedControllersManager<IBinder>) iMediaController.asBinder());
                if (sequencedFutureManager == null) {
                    return;
                }
                sequencedFutureManager.setFutureResult(i, fromBundle);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        } catch (RuntimeException e) {
            Log.w(TAG, "Ignoring malformed Bundle for SessionResult", e);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void onCustomCommand(@Nullable IMediaController iMediaController, int i, @Nullable Bundle bundle, @Nullable Bundle bundle2) {
        if (iMediaController == null || bundle == null || bundle2 == null) {
            return;
        }
        try {
            SessionCommand fromBundle = SessionCommand.fromBundle(bundle);
            dispatchSessionTaskWithSessionCommand(iMediaController, i, fromBundle, sendSessionResultWhenReady(new M1(fromBundle, bundle2)));
        } catch (RuntimeException e) {
            Log.w(TAG, "Ignoring malformed Bundle for SessionCommand", e);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void pause(@Nullable IMediaController iMediaController, int i) {
        MediaSession.ControllerInfo controller;
        if (iMediaController == null || (controller = this.connectedControllersManager.getController(iMediaController.asBinder())) == null) {
            return;
        }
        pauseForControllerInfo(controller, i);
    }

    public void pauseForControllerInfo(MediaSession.ControllerInfo controllerInfo, int i) {
        queueSessionTaskWithPlayerCommandForControllerInfo(controllerInfo, i, 1, sendSessionResultSuccess(new C4()));
    }

    @Override // androidx.media3.session.IMediaSession
    public void play(@Nullable IMediaController iMediaController, int i) {
        MediaSession.ControllerInfo controller;
        if (iMediaController == null || (controller = this.connectedControllersManager.getController(iMediaController.asBinder())) == null) {
            return;
        }
        playForControllerInfo(controller, i);
    }

    public void playForControllerInfo(MediaSession.ControllerInfo controllerInfo, int i) {
        queueSessionTaskWithPlayerCommandForControllerInfo(controllerInfo, i, 1, sendSessionResultSuccess(new P1(this, controllerInfo)));
    }

    @Override // androidx.media3.session.IMediaSession
    public void prepare(@Nullable IMediaController iMediaController, int i) {
        if (iMediaController == null) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 2, sendSessionResultSuccess(new p5()));
    }

    public void release() {
        for (MediaSession.ControllerInfo controllerInfo : this.connectedControllersManager.getConnectedControllers()) {
            this.connectedControllersManager.removeController(controllerInfo);
            MediaSession.ControllerCb controllerCb = controllerInfo.getControllerCb();
            if (controllerCb != null) {
                controllerCb.onDisconnected(0);
            }
        }
        Iterator<MediaSession.ControllerInfo> it = this.pendingControllers.iterator();
        while (it.hasNext()) {
            MediaSession.ControllerCb controllerCb2 = it.next().getControllerCb();
            if (controllerCb2 != null) {
                controllerCb2.onDisconnected(0);
            }
        }
        this.pendingControllers.clear();
        this.sessionImpl.clear();
    }

    @Override // androidx.media3.session.IMediaSession
    public void removeMediaItem(@Nullable IMediaController iMediaController, int i, final int i2) {
        if (iMediaController == null || i2 < 0) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 20, sendSessionResultSuccess(new ControllerPlayerTask() { // from class: androidx.media3.session.x5
            @Override // androidx.media3.session.MediaSessionStub.ControllerPlayerTask
            public final void run(PlayerWrapper playerWrapper, MediaSession.ControllerInfo controllerInfo) {
                MediaSessionStub.this.lambda$removeMediaItem$42(i2, playerWrapper, controllerInfo);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void removeMediaItems(@Nullable IMediaController iMediaController, int i, final int i2, final int i3) {
        if (iMediaController == null || i2 < 0 || i3 < i2) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 20, sendSessionResultSuccess(new ControllerPlayerTask() { // from class: androidx.media3.session.t4
            @Override // androidx.media3.session.MediaSessionStub.ControllerPlayerTask
            public final void run(PlayerWrapper playerWrapper, MediaSession.ControllerInfo controllerInfo) {
                MediaSessionStub.this.lambda$removeMediaItems$43(i2, i3, playerWrapper, controllerInfo);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void replaceMediaItem(@Nullable IMediaController iMediaController, int i, final int i2, @Nullable Bundle bundle) {
        if (iMediaController == null || bundle == null || i2 < 0) {
            return;
        }
        try {
            queueSessionTaskWithPlayerCommand(iMediaController, i, 20, sendSessionResultWhenReady(handleMediaItemsWhenReady(new B0(MediaItem.fromBundle(bundle), 2), new MediaItemPlayerTask() { // from class: androidx.media3.session.M4
                @Override // androidx.media3.session.MediaSessionStub.MediaItemPlayerTask
                public final void run(PlayerWrapper playerWrapper, MediaSession.ControllerInfo controllerInfo, List list) {
                    MediaSessionStub.this.lambda$replaceMediaItem$47(i2, playerWrapper, controllerInfo, list);
                }
            })));
        } catch (RuntimeException e) {
            Log.w(TAG, "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void replaceMediaItems(@Nullable IMediaController iMediaController, int i, final int i2, final int i3, @Nullable IBinder iBinder) {
        if (iMediaController == null || iBinder == null || i2 < 0 || i3 < i2) {
            return;
        }
        try {
            queueSessionTaskWithPlayerCommand(iMediaController, i, 20, sendSessionResultWhenReady(handleMediaItemsWhenReady(new C0599w2(BundleCollectionUtil.fromBundleList(new C0536m(), BundleListRetriever.getList(iBinder))), new MediaItemPlayerTask() { // from class: androidx.media3.session.x4
                @Override // androidx.media3.session.MediaSessionStub.MediaItemPlayerTask
                public final void run(PlayerWrapper playerWrapper, MediaSession.ControllerInfo controllerInfo, List list) {
                    MediaSessionStub.this.lambda$replaceMediaItems$49(i2, i3, playerWrapper, controllerInfo, list);
                }
            })));
        } catch (RuntimeException e) {
            Log.w(TAG, "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void search(@Nullable IMediaController iMediaController, int i, @Nullable final String str, @Nullable Bundle bundle) {
        final MediaLibraryService.LibraryParams fromBundle;
        if (iMediaController == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            Log.w(TAG, "search(): Ignoring empty query");
            return;
        }
        if (bundle == null) {
            fromBundle = null;
        } else {
            try {
                fromBundle = MediaLibraryService.LibraryParams.fromBundle(bundle);
            } catch (RuntimeException e) {
                Log.w(TAG, "Ignoring malformed Bundle for LibraryParams", e);
                return;
            }
        }
        dispatchSessionTaskWithSessionCommand(iMediaController, i, SessionCommand.COMMAND_CODE_LIBRARY_SEARCH, sendLibraryResultWhenReady(new SessionTask() { // from class: androidx.media3.session.C5
            @Override // androidx.media3.session.MediaSessionStub.SessionTask
            public final Object run(MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i2) {
                com.google.common.util.concurrent.u lambda$search$69;
                lambda$search$69 = MediaSessionStub.lambda$search$69(str, fromBundle, (MediaLibrarySessionImpl) mediaSessionImpl, controllerInfo, i2);
                return lambda$search$69;
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void seekBack(@Nullable IMediaController iMediaController, int i) {
        MediaSession.ControllerInfo controller;
        if (iMediaController == null || (controller = this.connectedControllersManager.getController(iMediaController.asBinder())) == null) {
            return;
        }
        seekBackForControllerInfo(controller, i);
    }

    public void seekBackForControllerInfo(MediaSession.ControllerInfo controllerInfo, int i) {
        queueSessionTaskWithPlayerCommandForControllerInfo(controllerInfo, i, 11, sendSessionResultSuccess(new N4()));
    }

    @Override // androidx.media3.session.IMediaSession
    public void seekForward(IMediaController iMediaController, int i) {
        MediaSession.ControllerInfo controller;
        if (iMediaController == null || (controller = this.connectedControllersManager.getController(iMediaController.asBinder())) == null) {
            return;
        }
        seekForwardForControllerInfo(controller, i);
    }

    public void seekForwardForControllerInfo(MediaSession.ControllerInfo controllerInfo, int i) {
        queueSessionTaskWithPlayerCommandForControllerInfo(controllerInfo, i, 12, sendSessionResultSuccess(new C0460a5()));
    }

    @Override // androidx.media3.session.IMediaSession
    public void seekTo(@Nullable IMediaController iMediaController, int i, final long j) {
        if (iMediaController == null) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 5, sendSessionResultSuccess((Consumer<PlayerWrapper>) new Consumer() { // from class: androidx.media3.session.A5
            @Override // androidx.media3.common.util.Consumer
            public final void accept(Object obj) {
                ((PlayerWrapper) obj).seekTo(j);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void seekToDefaultPosition(@Nullable IMediaController iMediaController, int i) {
        if (iMediaController == null) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 4, sendSessionResultSuccess(new q5()));
    }

    @Override // androidx.media3.session.IMediaSession
    public void seekToDefaultPositionWithMediaItemIndex(@Nullable IMediaController iMediaController, int i, final int i2) {
        if (iMediaController == null || i2 < 0) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 10, sendSessionResultSuccess(new ControllerPlayerTask() { // from class: androidx.media3.session.y4
            @Override // androidx.media3.session.MediaSessionStub.ControllerPlayerTask
            public final void run(PlayerWrapper playerWrapper, MediaSession.ControllerInfo controllerInfo) {
                MediaSessionStub.this.lambda$seekToDefaultPositionWithMediaItemIndex$21(i2, playerWrapper, controllerInfo);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void seekToNext(@Nullable IMediaController iMediaController, int i) {
        MediaSession.ControllerInfo controller;
        if (iMediaController == null || (controller = this.connectedControllersManager.getController(iMediaController.asBinder())) == null) {
            return;
        }
        seekToNextForControllerInfo(controller, i);
    }

    public void seekToNextForControllerInfo(MediaSession.ControllerInfo controllerInfo, int i) {
        queueSessionTaskWithPlayerCommandForControllerInfo(controllerInfo, i, 9, sendSessionResultSuccess(new C0467b5()));
    }

    @Override // androidx.media3.session.IMediaSession
    public void seekToNextMediaItem(@Nullable IMediaController iMediaController, int i) {
        if (iMediaController == null) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 8, sendSessionResultSuccess(new K4()));
    }

    @Override // androidx.media3.session.IMediaSession
    public void seekToPrevious(@Nullable IMediaController iMediaController, int i) {
        MediaSession.ControllerInfo controller;
        if (iMediaController == null || (controller = this.connectedControllersManager.getController(iMediaController.asBinder())) == null) {
            return;
        }
        seekToPreviousForControllerInfo(controller, i);
    }

    public void seekToPreviousForControllerInfo(MediaSession.ControllerInfo controllerInfo, int i) {
        queueSessionTaskWithPlayerCommandForControllerInfo(controllerInfo, i, 7, sendSessionResultSuccess(new Q4()));
    }

    @Override // androidx.media3.session.IMediaSession
    public void seekToPreviousMediaItem(@Nullable IMediaController iMediaController, int i) {
        if (iMediaController == null) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 6, sendSessionResultSuccess(new W4()));
    }

    @Override // androidx.media3.session.IMediaSession
    public void seekToWithMediaItemIndex(@Nullable IMediaController iMediaController, int i, final int i2, final long j) {
        if (iMediaController == null || i2 < 0) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 10, sendSessionResultSuccess(new ControllerPlayerTask() { // from class: androidx.media3.session.B4
            @Override // androidx.media3.session.MediaSessionStub.ControllerPlayerTask
            public final void run(PlayerWrapper playerWrapper, MediaSession.ControllerInfo controllerInfo) {
                MediaSessionStub.this.lambda$seekToWithMediaItemIndex$23(i2, j, playerWrapper, controllerInfo);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void setAudioAttributes(@Nullable IMediaController iMediaController, int i, @Nullable Bundle bundle, final boolean z) {
        if (iMediaController == null || bundle == null) {
            return;
        }
        try {
            final AudioAttributes fromBundle = AudioAttributes.fromBundle(bundle);
            queueSessionTaskWithPlayerCommand(iMediaController, i, 35, sendSessionResultSuccess((Consumer<PlayerWrapper>) new Consumer() { // from class: androidx.media3.session.h5
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    ((PlayerWrapper) obj).setAudioAttributes(AudioAttributes.this, z);
                }
            }));
        } catch (RuntimeException e) {
            Log.w(TAG, "Ignoring malformed Bundle for AudioAttributes", e);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void setDeviceMuted(@Nullable IMediaController iMediaController, int i, final boolean z) {
        if (iMediaController == null) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 26, sendSessionResultSuccess((Consumer<PlayerWrapper>) new Consumer() { // from class: androidx.media3.session.O4
            @Override // androidx.media3.common.util.Consumer
            public final void accept(Object obj) {
                ((PlayerWrapper) obj).setDeviceMuted(z);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void setDeviceMutedWithFlags(@Nullable IMediaController iMediaController, int i, final boolean z, final int i2) {
        if (iMediaController == null) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 34, sendSessionResultSuccess((Consumer<PlayerWrapper>) new Consumer() { // from class: androidx.media3.session.s5
            @Override // androidx.media3.common.util.Consumer
            public final void accept(Object obj) {
                ((PlayerWrapper) obj).setDeviceMuted(z, i2);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void setDeviceVolume(@Nullable IMediaController iMediaController, int i, final int i2) {
        if (iMediaController == null || i2 < 0) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 25, sendSessionResultSuccess((Consumer<PlayerWrapper>) new Consumer() { // from class: androidx.media3.session.y5
            @Override // androidx.media3.common.util.Consumer
            public final void accept(Object obj) {
                ((PlayerWrapper) obj).setDeviceVolume(i2);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void setDeviceVolumeWithFlags(@Nullable IMediaController iMediaController, int i, final int i2, final int i3) {
        if (iMediaController == null || i2 < 0) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 33, sendSessionResultSuccess((Consumer<PlayerWrapper>) new Consumer() { // from class: androidx.media3.session.e5
            @Override // androidx.media3.common.util.Consumer
            public final void accept(Object obj) {
                ((PlayerWrapper) obj).setDeviceVolume(i2, i3);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void setMediaItem(@Nullable IMediaController iMediaController, int i, @Nullable Bundle bundle) {
        setMediaItemWithResetPosition(iMediaController, i, bundle, true);
    }

    @Override // androidx.media3.session.IMediaSession
    public void setMediaItemWithResetPosition(@Nullable IMediaController iMediaController, int i, @Nullable Bundle bundle, final boolean z) {
        if (iMediaController == null || bundle == null) {
            return;
        }
        try {
            final MediaItem fromBundle = MediaItem.fromBundle(bundle);
            queueSessionTaskWithPlayerCommand(iMediaController, i, 31, sendSessionResultWhenReady(handleMediaItemsWithStartPositionWhenReady(new SessionTask() { // from class: androidx.media3.session.P4
                @Override // androidx.media3.session.MediaSessionStub.SessionTask
                public final Object run(MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i2) {
                    com.google.common.util.concurrent.u lambda$setMediaItemWithResetPosition$30;
                    lambda$setMediaItemWithResetPosition$30 = MediaSessionStub.lambda$setMediaItemWithResetPosition$30(MediaItem.this, z, mediaSessionImpl, controllerInfo, i2);
                    return lambda$setMediaItemWithResetPosition$30;
                }
            }, new C0589u4())));
        } catch (RuntimeException e) {
            Log.w(TAG, "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void setMediaItemWithStartPosition(@Nullable IMediaController iMediaController, int i, @Nullable Bundle bundle, final long j) {
        if (iMediaController == null || bundle == null) {
            return;
        }
        try {
            final MediaItem fromBundle = MediaItem.fromBundle(bundle);
            queueSessionTaskWithPlayerCommand(iMediaController, i, 31, sendSessionResultWhenReady(handleMediaItemsWithStartPositionWhenReady(new SessionTask() { // from class: androidx.media3.session.t5
                @Override // androidx.media3.session.MediaSessionStub.SessionTask
                public final Object run(MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i2) {
                    com.google.common.util.concurrent.u lambda$setMediaItemWithStartPosition$29;
                    lambda$setMediaItemWithStartPosition$29 = MediaSessionStub.lambda$setMediaItemWithStartPosition$29(MediaItem.this, j, mediaSessionImpl, controllerInfo, i2);
                    return lambda$setMediaItemWithStartPosition$29;
                }
            }, new C0589u4())));
        } catch (RuntimeException e) {
            Log.w(TAG, "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void setMediaItems(@Nullable IMediaController iMediaController, int i, @Nullable IBinder iBinder) {
        setMediaItemsWithResetPosition(iMediaController, i, iBinder, true);
    }

    @Override // androidx.media3.session.IMediaSession
    public void setMediaItemsWithResetPosition(@Nullable IMediaController iMediaController, int i, @Nullable IBinder iBinder, final boolean z) {
        if (iMediaController == null || iBinder == null) {
            return;
        }
        try {
            final com.google.common.collect.G fromBundleList = BundleCollectionUtil.fromBundleList(new C0536m(), BundleListRetriever.getList(iBinder));
            queueSessionTaskWithPlayerCommand(iMediaController, i, 20, sendSessionResultWhenReady(handleMediaItemsWithStartPositionWhenReady(new SessionTask() { // from class: androidx.media3.session.D5
                @Override // androidx.media3.session.MediaSessionStub.SessionTask
                public final Object run(MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i2) {
                    com.google.common.util.concurrent.u lambda$setMediaItemsWithResetPosition$31;
                    lambda$setMediaItemsWithResetPosition$31 = MediaSessionStub.lambda$setMediaItemsWithResetPosition$31(fromBundleList, z, mediaSessionImpl, controllerInfo, i2);
                    return lambda$setMediaItemsWithResetPosition$31;
                }
            }, new C0589u4())));
        } catch (RuntimeException e) {
            Log.w(TAG, "Ignoring malformed Bundle for MediaItem", e);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void setMediaItemsWithStartIndex(@Nullable IMediaController iMediaController, int i, @Nullable IBinder iBinder, final int i2, final long j) {
        if (iMediaController == null || iBinder == null) {
            return;
        }
        if (i2 == -1 || i2 >= 0) {
            try {
                final com.google.common.collect.G fromBundleList = BundleCollectionUtil.fromBundleList(new C0536m(), BundleListRetriever.getList(iBinder));
                queueSessionTaskWithPlayerCommand(iMediaController, i, 20, sendSessionResultWhenReady(handleMediaItemsWithStartPositionWhenReady(new SessionTask() { // from class: androidx.media3.session.Y4
                    @Override // androidx.media3.session.MediaSessionStub.SessionTask
                    public final Object run(MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i3) {
                        com.google.common.util.concurrent.u lambda$setMediaItemsWithStartIndex$32;
                        lambda$setMediaItemsWithStartIndex$32 = MediaSessionStub.lambda$setMediaItemsWithStartIndex$32(fromBundleList, i2, j, mediaSessionImpl, controllerInfo, i3);
                        return lambda$setMediaItemsWithStartIndex$32;
                    }
                }, new C0589u4())));
            } catch (RuntimeException e) {
                Log.w(TAG, "Ignoring malformed Bundle for MediaItem", e);
            }
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void setPlayWhenReady(@Nullable IMediaController iMediaController, int i, boolean z) {
        if (iMediaController == null) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 1, sendSessionResultSuccess(new C3(z)));
    }

    @Override // androidx.media3.session.IMediaSession
    public void setPlaybackParameters(@Nullable IMediaController iMediaController, int i, @Nullable Bundle bundle) {
        if (iMediaController == null || bundle == null) {
            return;
        }
        try {
            queueSessionTaskWithPlayerCommand(iMediaController, i, 13, sendSessionResultSuccess(new G0(PlaybackParameters.fromBundle(bundle))));
        } catch (RuntimeException e) {
            Log.w(TAG, "Ignoring malformed Bundle for PlaybackParameters", e);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void setPlaybackSpeed(@Nullable IMediaController iMediaController, int i, float f) {
        if (iMediaController == null || f <= 0.0f) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 13, sendSessionResultSuccess(new F1(f)));
    }

    @Override // androidx.media3.session.IMediaSession
    public void setPlaylistMetadata(@Nullable IMediaController iMediaController, int i, @Nullable Bundle bundle) {
        if (iMediaController == null || bundle == null) {
            return;
        }
        try {
            queueSessionTaskWithPlayerCommand(iMediaController, i, 19, sendSessionResultSuccess(new C0469c0(MediaMetadata.fromBundle(bundle))));
        } catch (RuntimeException e) {
            Log.w(TAG, "Ignoring malformed Bundle for MediaMetadata", e);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void setRating(@Nullable IMediaController iMediaController, int i, @Nullable Bundle bundle) {
        if (iMediaController == null || bundle == null) {
            return;
        }
        try {
            dispatchSessionTaskWithSessionCommand(iMediaController, i, SessionCommand.COMMAND_CODE_SESSION_SET_RATING, sendSessionResultWhenReady(new C0618z3(Rating.fromBundle(bundle))));
        } catch (RuntimeException e) {
            Log.w(TAG, "Ignoring malformed Bundle for Rating", e);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void setRatingWithMediaId(@Nullable IMediaController iMediaController, int i, @Nullable final String str, @Nullable Bundle bundle) {
        if (iMediaController == null || str == null || bundle == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            Log.w(TAG, "setRatingWithMediaId(): Ignoring empty mediaId");
            return;
        }
        try {
            final Rating fromBundle = Rating.fromBundle(bundle);
            dispatchSessionTaskWithSessionCommand(iMediaController, i, SessionCommand.COMMAND_CODE_SESSION_SET_RATING, sendSessionResultWhenReady(new SessionTask() { // from class: androidx.media3.session.c5
                @Override // androidx.media3.session.MediaSessionStub.SessionTask
                public final Object run(MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i2) {
                    com.google.common.util.concurrent.u lambda$setRatingWithMediaId$25;
                    lambda$setRatingWithMediaId$25 = MediaSessionStub.lambda$setRatingWithMediaId$25(str, fromBundle, mediaSessionImpl, controllerInfo, i2);
                    return lambda$setRatingWithMediaId$25;
                }
            }));
        } catch (RuntimeException e) {
            Log.w(TAG, "Ignoring malformed Bundle for Rating", e);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void setRepeatMode(@Nullable IMediaController iMediaController, int i, final int i2) {
        if (iMediaController == null) {
            return;
        }
        if (i2 == 2 || i2 == 0 || i2 == 1) {
            queueSessionTaskWithPlayerCommand(iMediaController, i, 15, sendSessionResultSuccess((Consumer<PlayerWrapper>) new Consumer() { // from class: androidx.media3.session.g5
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    ((PlayerWrapper) obj).setRepeatMode(i2);
                }
            }));
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void setShuffleModeEnabled(@Nullable IMediaController iMediaController, int i, final boolean z) {
        if (iMediaController == null) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 14, sendSessionResultSuccess((Consumer<PlayerWrapper>) new Consumer() { // from class: androidx.media3.session.n5
            @Override // androidx.media3.common.util.Consumer
            public final void accept(Object obj) {
                ((PlayerWrapper) obj).setShuffleModeEnabled(z);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void setTrackSelectionParameters(@Nullable IMediaController iMediaController, int i, @Nullable Bundle bundle) {
        if (iMediaController == null || bundle == null) {
            return;
        }
        try {
            final TrackSelectionParameters fromBundle = TrackSelectionParameters.fromBundle(bundle);
            queueSessionTaskWithPlayerCommand(iMediaController, i, 29, sendSessionResultSuccess((Consumer<PlayerWrapper>) new Consumer() { // from class: androidx.media3.session.J4
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    MediaSessionStub.this.lambda$setTrackSelectionParameters$65(fromBundle, (PlayerWrapper) obj);
                }
            }));
        } catch (RuntimeException e) {
            Log.w(TAG, "Ignoring malformed Bundle for TrackSelectionParameters", e);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void setVideoSurface(@Nullable IMediaController iMediaController, int i, @Nullable Surface surface) {
        if (iMediaController == null) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 27, sendSessionResultSuccess(new V(surface)));
    }

    @Override // androidx.media3.session.IMediaSession
    public void setVolume(@Nullable IMediaController iMediaController, int i, final float f) {
        if (iMediaController == null || f < 0.0f || f > 1.0f) {
            return;
        }
        queueSessionTaskWithPlayerCommand(iMediaController, i, 24, sendSessionResultSuccess((Consumer<PlayerWrapper>) new Consumer() { // from class: androidx.media3.session.m5
            @Override // androidx.media3.common.util.Consumer
            public final void accept(Object obj) {
                ((PlayerWrapper) obj).setVolume(f);
            }
        }));
    }

    @Override // androidx.media3.session.IMediaSession
    public void stop(@Nullable IMediaController iMediaController, int i) {
        MediaSession.ControllerInfo controller;
        if (iMediaController == null || (controller = this.connectedControllersManager.getController(iMediaController.asBinder())) == null) {
            return;
        }
        stopForControllerInfo(controller, i);
    }

    public void stopForControllerInfo(MediaSession.ControllerInfo controllerInfo, int i) {
        queueSessionTaskWithPlayerCommandForControllerInfo(controllerInfo, i, 3, sendSessionResultSuccess(new o5()));
    }

    @Override // androidx.media3.session.IMediaSession
    public void subscribe(@Nullable IMediaController iMediaController, int i, @Nullable String str, @Nullable Bundle bundle) {
        MediaLibraryService.LibraryParams fromBundle;
        if (iMediaController == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            Log.w(TAG, "subscribe(): Ignoring empty parentId");
            return;
        }
        if (bundle == null) {
            fromBundle = null;
        } else {
            try {
                fromBundle = MediaLibraryService.LibraryParams.fromBundle(bundle);
            } catch (RuntimeException e) {
                Log.w(TAG, "Ignoring malformed Bundle for LibraryParams", e);
                return;
            }
        }
        dispatchSessionTaskWithSessionCommand(iMediaController, i, SessionCommand.COMMAND_CODE_LIBRARY_SUBSCRIBE, sendLibraryResultWhenReady(new C0483e0(str, fromBundle)));
    }

    @Override // androidx.media3.session.IMediaSession
    public void unsubscribe(@Nullable IMediaController iMediaController, int i, @Nullable String str) {
        if (iMediaController == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            Log.w(TAG, "unsubscribe(): Ignoring empty parentId");
        } else {
            dispatchSessionTaskWithSessionCommand(iMediaController, i, SessionCommand.COMMAND_CODE_LIBRARY_UNSUBSCRIBE, sendLibraryResultWhenReady(new C0497g0(str)));
        }
    }

    private <K extends MediaSessionImpl> void dispatchSessionTaskWithSessionCommand(IMediaController iMediaController, int i, SessionCommand sessionCommand, SessionTask<com.google.common.util.concurrent.u<Void>, K> sessionTask) {
        dispatchSessionTaskWithSessionCommand(iMediaController, i, sessionCommand, 0, sessionTask);
    }

    private static <K extends MediaSessionImpl> SessionTask<com.google.common.util.concurrent.u<Void>, K> sendSessionResultSuccess(ControllerPlayerTask controllerPlayerTask) {
        return new E3(controllerPlayerTask);
    }

    private <K extends MediaSessionImpl> void dispatchSessionTaskWithSessionCommand(IMediaController iMediaController, final int i, @Nullable final SessionCommand sessionCommand, final int i2, final SessionTask<com.google.common.util.concurrent.u<Void>, K> sessionTask) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final MediaSessionImpl mediaSessionImpl = this.sessionImpl.get();
            if (mediaSessionImpl != null && !mediaSessionImpl.isReleased()) {
                final MediaSession.ControllerInfo controller = this.connectedControllersManager.getController(iMediaController.asBinder());
                if (controller == null) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                } else {
                    Util.postOrRun(mediaSessionImpl.getApplicationHandler(), new Runnable() { // from class: androidx.media3.session.d5
                        @Override // java.lang.Runnable
                        public final void run() {
                            MediaSessionStub.this.lambda$dispatchSessionTaskWithSessionCommand$15(controller, sessionCommand, mediaSessionImpl, i, i2, sessionTask);
                        }
                    });
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void connect(@Nullable IMediaController iMediaController, int i, @Nullable Bundle bundle) {
        if (iMediaController == null || bundle == null) {
            return;
        }
        try {
            ConnectionRequest fromBundle = ConnectionRequest.fromBundle(bundle);
            int callingUid = Binder.getCallingUid();
            int callingPid = Binder.getCallingPid();
            long clearCallingIdentity = Binder.clearCallingIdentity();
            if (callingPid == 0) {
                callingPid = fromBundle.pid;
            }
            try {
                MediaSessionManager.RemoteUserInfo remoteUserInfo = new MediaSessionManager.RemoteUserInfo(fromBundle.packageName, callingPid, callingUid);
                MediaSessionImpl mediaSessionImpl = this.sessionImpl.get();
                boolean z = mediaSessionImpl != null && MediaSessionManager.getSessionManager(mediaSessionImpl.getContext()).isTrustedForMediaControl(remoteUserInfo);
                int i2 = fromBundle.libraryVersion;
                int i3 = fromBundle.controllerInterfaceVersion;
                connect(iMediaController, new MediaSession.ControllerInfo(remoteUserInfo, i2, i3, z, new Controller2Cb(iMediaController, i3), fromBundle.connectionHints, fromBundle.maxCommandsForMediaItems));
                Binder.restoreCallingIdentity(clearCallingIdentity);
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th;
            }
        } catch (RuntimeException e) {
            Log.w(TAG, "Ignoring malformed Bundle for ConnectionRequest", e);
        }
    }

    @Override // androidx.media3.session.IMediaSession
    public void release(@Nullable final IMediaController iMediaController, int i) {
        if (iMediaController == null) {
            return;
        }
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            MediaSessionImpl mediaSessionImpl = this.sessionImpl.get();
            if (mediaSessionImpl != null && !mediaSessionImpl.isReleased()) {
                Util.postOrRun(mediaSessionImpl.getApplicationHandler(), new Runnable() { // from class: androidx.media3.session.w4
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaSessionStub.this.lambda$release$18(iMediaController);
                    }
                });
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }
}
