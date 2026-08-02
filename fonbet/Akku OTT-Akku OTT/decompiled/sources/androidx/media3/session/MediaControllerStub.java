package androidx.media3.session;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.Player;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.session.IMediaController;
import androidx.media3.session.MediaLibraryService;
import androidx.media3.session.PlayerInfo;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
class MediaControllerStub extends IMediaController.Stub {
    private static final String TAG = "MediaControllerStub";
    public static final int VERSION_INT = 7;
    private final WeakReference<MediaControllerImplBase> controller;

    public interface ControllerTask<T extends MediaControllerImplBase> {
        void run(T t);
    }

    public MediaControllerStub(MediaControllerImplBase mediaControllerImplBase) {
        this.controller = new WeakReference<>(mediaControllerImplBase);
    }

    private <T extends MediaControllerImplBase> void dispatchControllerTaskOnHandler(final ControllerTask<T> controllerTask) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final MediaControllerImplBase mediaControllerImplBase = this.controller.get();
            if (mediaControllerImplBase == null) {
                return;
            }
            Util.postOrRun(mediaControllerImplBase.getInstance().applicationHandler, new Runnable() { // from class: androidx.media3.session.j2
                @Override // java.lang.Runnable
                public final void run() {
                    MediaControllerStub.lambda$dispatchControllerTaskOnHandler$16(MediaControllerImplBase.this, controllerTask);
                }
            });
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    private int getSessionInterfaceVersion() {
        SessionToken connectedToken;
        MediaControllerImplBase mediaControllerImplBase = this.controller.get();
        if (mediaControllerImplBase == null || (connectedToken = mediaControllerImplBase.getConnectedToken()) == null) {
            return -1;
        }
        return connectedToken.getInterfaceVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$dispatchControllerTaskOnHandler$16(MediaControllerImplBase mediaControllerImplBase, ControllerTask controllerTask) {
        if (mediaControllerImplBase.isReleased()) {
            return;
        }
        controllerTask.run(mediaControllerImplBase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onDisconnected$1(MediaControllerImplBase mediaControllerImplBase) {
        MediaController mediaControllerImplBase2 = mediaControllerImplBase.getInstance();
        MediaController mediaControllerImplBase3 = mediaControllerImplBase.getInstance();
        Objects.requireNonNull(mediaControllerImplBase3);
        mediaControllerImplBase2.runOnApplicationLooper(new E5(mediaControllerImplBase3, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CommandButton lambda$onSetCustomLayout$2(int i, Bundle bundle) {
        return CommandButton.fromBundle(bundle, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CommandButton lambda$onSetMediaButtonPreferences$4(int i, Bundle bundle) {
        return CommandButton.fromBundle(bundle, i);
    }

    private <T> void setControllerFutureResult(int i, T t) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            MediaControllerImplBase mediaControllerImplBase = this.controller.get();
            if (mediaControllerImplBase == null) {
                return;
            }
            mediaControllerImplBase.setFutureResult(i, t);
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public void destroy() {
        this.controller.clear();
    }

    @Override // androidx.media3.session.IMediaController
    public void onAvailableCommandsChangedFromPlayer(int i, @Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            dispatchControllerTaskOnHandler(new C0526k1(Player.Commands.fromBundle(bundle)));
        } catch (RuntimeException e) {
            Log.w(TAG, "Ignoring malformed Bundle for Commands", e);
        }
    }

    @Override // androidx.media3.session.IMediaController
    public void onAvailableCommandsChangedFromSession(int i, @Nullable Bundle bundle, @Nullable Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        try {
            try {
                dispatchControllerTaskOnHandler(new C0539m2(SessionCommands.fromBundle(bundle), Player.Commands.fromBundle(bundle2)));
            } catch (RuntimeException e) {
                Log.w(TAG, "Ignoring malformed Bundle for Commands", e);
            }
        } catch (RuntimeException e2) {
            Log.w(TAG, "Ignoring malformed Bundle for SessionCommands", e2);
        }
    }

    @Override // androidx.media3.session.IMediaController
    public void onChildrenChanged(int i, @Nullable final String str, final int i2, @Nullable Bundle bundle) {
        final MediaLibraryService.LibraryParams fromBundle;
        if (TextUtils.isEmpty(str)) {
            Log.w(TAG, "onChildrenChanged(): Ignoring empty parentId");
            return;
        }
        if (i2 < 0) {
            androidx.compose.runtime.collection.a.c(i2, "onChildrenChanged(): Ignoring negative itemCount: ", TAG);
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
        dispatchControllerTaskOnHandler(new ControllerTask() { // from class: androidx.media3.session.o2
            @Override // androidx.media3.session.MediaControllerStub.ControllerTask
            public final void run(MediaControllerImplBase mediaControllerImplBase) {
                ((MediaBrowserImplBase) mediaControllerImplBase).notifyChildrenChanged(str, i2, fromBundle);
            }
        });
    }

    @Override // androidx.media3.session.IMediaController
    public void onConnected(int i, @Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            dispatchControllerTaskOnHandler(new O(ConnectionState.fromBundle(bundle)));
        } catch (RuntimeException e) {
            Log.w(TAG, "Malformed Bundle for ConnectionResult. Disconnected from the session.", e);
            onDisconnected(i);
        }
    }

    @Override // androidx.media3.session.IMediaController
    public void onCustomCommand(final int i, @Nullable Bundle bundle, @Nullable final Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            Log.w(TAG, "Ignoring custom command with null args.");
            return;
        }
        try {
            final SessionCommand fromBundle = SessionCommand.fromBundle(bundle);
            dispatchControllerTaskOnHandler(new ControllerTask() { // from class: androidx.media3.session.q2
                @Override // androidx.media3.session.MediaControllerStub.ControllerTask
                public final void run(MediaControllerImplBase mediaControllerImplBase) {
                    mediaControllerImplBase.onCustomCommand(i, fromBundle, bundle2);
                }
            });
        } catch (RuntimeException e) {
            Log.w(TAG, "Ignoring malformed Bundle for SessionCommand", e);
        }
    }

    @Override // androidx.media3.session.IMediaController
    public void onDisconnected(int i) {
        dispatchControllerTaskOnHandler(new C0545n2());
    }

    @Override // androidx.media3.session.IMediaController
    public void onError(int i, Bundle bundle) throws RemoteException {
        try {
            dispatchControllerTaskOnHandler(new Y(i, SessionError.fromBundle(bundle)));
        } catch (RuntimeException e) {
            Log.w(TAG, "Ignoring malformed Bundle for SessionError", e);
        }
    }

    @Override // androidx.media3.session.IMediaController
    public void onExtrasChanged(int i, @Nullable Bundle bundle) {
        if (bundle == null) {
            Log.w(TAG, "Ignoring null Bundle for extras");
        } else {
            dispatchControllerTaskOnHandler(new C0569r2(bundle));
        }
    }

    @Override // androidx.media3.session.IMediaController
    public void onLibraryResult(int i, @Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            setControllerFutureResult(i, LibraryResult.fromUnknownBundle(bundle));
        } catch (RuntimeException e) {
            Log.w(TAG, "Ignoring malformed Bundle for LibraryResult", e);
        }
    }

    @Override // androidx.media3.session.IMediaController
    public void onPeriodicSessionPositionInfoChanged(int i, @Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            dispatchControllerTaskOnHandler(new C0498g1(SessionPositionInfo.fromBundle(bundle)));
        } catch (RuntimeException e) {
            Log.w(TAG, "Ignoring malformed Bundle for SessionPositionInfo", e);
        }
    }

    @Override // androidx.media3.session.IMediaController
    @Deprecated
    public void onPlayerInfoChanged(int i, @Nullable Bundle bundle, boolean z) {
        onPlayerInfoChangedWithExclusions(i, bundle, new PlayerInfo.BundlingExclusions(z, true).toBundle());
    }

    @Override // androidx.media3.session.IMediaController
    public void onPlayerInfoChangedWithExclusions(int i, @Nullable Bundle bundle, @Nullable Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        try {
            int sessionInterfaceVersion = getSessionInterfaceVersion();
            if (sessionInterfaceVersion == -1) {
                return;
            }
            final PlayerInfo fromBundle = PlayerInfo.fromBundle(bundle, sessionInterfaceVersion);
            try {
                final PlayerInfo.BundlingExclusions fromBundle2 = PlayerInfo.BundlingExclusions.fromBundle(bundle2);
                dispatchControllerTaskOnHandler(new ControllerTask() { // from class: androidx.media3.session.i2
                    @Override // androidx.media3.session.MediaControllerStub.ControllerTask
                    public final void run(MediaControllerImplBase mediaControllerImplBase) {
                        mediaControllerImplBase.onPlayerInfoChanged(PlayerInfo.this, fromBundle2);
                    }
                });
            } catch (RuntimeException e) {
                Log.w(TAG, "Ignoring malformed Bundle for BundlingExclusions", e);
            }
        } catch (RuntimeException e2) {
            Log.w(TAG, "Ignoring malformed Bundle for PlayerInfo", e2);
        }
    }

    @Override // androidx.media3.session.IMediaController
    public void onRenderedFirstFrame(int i) {
        dispatchControllerTaskOnHandler(new C0533l2());
    }

    @Override // androidx.media3.session.IMediaController
    public void onSearchResultChanged(int i, @Nullable final String str, final int i2, @Nullable Bundle bundle) throws RuntimeException {
        final MediaLibraryService.LibraryParams fromBundle;
        if (TextUtils.isEmpty(str)) {
            Log.w(TAG, "onSearchResultChanged(): Ignoring empty query");
            return;
        }
        if (i2 < 0) {
            androidx.compose.runtime.collection.a.c(i2, "onSearchResultChanged(): Ignoring negative itemCount: ", TAG);
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
        dispatchControllerTaskOnHandler(new ControllerTask() { // from class: androidx.media3.session.h2
            @Override // androidx.media3.session.MediaControllerStub.ControllerTask
            public final void run(MediaControllerImplBase mediaControllerImplBase) {
                ((MediaBrowserImplBase) mediaControllerImplBase).notifySearchResultChanged(str, i2, fromBundle);
            }
        });
    }

    @Override // androidx.media3.session.IMediaController
    public void onSessionActivityChanged(final int i, @Nullable final PendingIntent pendingIntent) throws RemoteException {
        dispatchControllerTaskOnHandler(new ControllerTask() { // from class: androidx.media3.session.p2
            @Override // androidx.media3.session.MediaControllerStub.ControllerTask
            public final void run(MediaControllerImplBase mediaControllerImplBase) {
                mediaControllerImplBase.onSetSessionActivity(i, pendingIntent);
            }
        });
    }

    @Override // androidx.media3.session.IMediaController
    public void onSessionResult(int i, @Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            setControllerFutureResult(i, SessionResult.fromBundle(bundle));
        } catch (RuntimeException e) {
            Log.w(TAG, "Ignoring malformed Bundle for SessionResult", e);
        }
    }

    @Override // androidx.media3.session.IMediaController
    public void onSetCustomLayout(final int i, @Nullable List<Bundle> list) {
        if (list == null) {
            return;
        }
        try {
            final int sessionInterfaceVersion = getSessionInterfaceVersion();
            if (sessionInterfaceVersion == -1) {
                return;
            }
            final com.google.common.collect.G fromBundleList = BundleCollectionUtil.fromBundleList(new com.google.common.base.f() { // from class: androidx.media3.session.f2
                @Override // com.google.common.base.f
                public final Object apply(Object obj) {
                    CommandButton lambda$onSetCustomLayout$2;
                    lambda$onSetCustomLayout$2 = MediaControllerStub.lambda$onSetCustomLayout$2(sessionInterfaceVersion, (Bundle) obj);
                    return lambda$onSetCustomLayout$2;
                }
            }, list);
            dispatchControllerTaskOnHandler(new ControllerTask() { // from class: androidx.media3.session.g2
                @Override // androidx.media3.session.MediaControllerStub.ControllerTask
                public final void run(MediaControllerImplBase mediaControllerImplBase) {
                    mediaControllerImplBase.onSetCustomLayout(i, fromBundleList);
                }
            });
        } catch (RuntimeException e) {
            Log.w(TAG, "Ignoring malformed Bundle for CommandButton", e);
        }
    }

    @Override // androidx.media3.session.IMediaController
    public void onSetMediaButtonPreferences(final int i, @Nullable List<Bundle> list) {
        if (list == null) {
            return;
        }
        try {
            final int sessionInterfaceVersion = getSessionInterfaceVersion();
            if (sessionInterfaceVersion == -1) {
                return;
            }
            final com.google.common.collect.G fromBundleList = BundleCollectionUtil.fromBundleList(new com.google.common.base.f() { // from class: androidx.media3.session.e2
                @Override // com.google.common.base.f
                public final Object apply(Object obj) {
                    CommandButton lambda$onSetMediaButtonPreferences$4;
                    lambda$onSetMediaButtonPreferences$4 = MediaControllerStub.lambda$onSetMediaButtonPreferences$4(sessionInterfaceVersion, (Bundle) obj);
                    return lambda$onSetMediaButtonPreferences$4;
                }
            }, list);
            dispatchControllerTaskOnHandler(new ControllerTask() { // from class: androidx.media3.session.k2
                @Override // androidx.media3.session.MediaControllerStub.ControllerTask
                public final void run(MediaControllerImplBase mediaControllerImplBase) {
                    mediaControllerImplBase.onSetMediaButtonPreferences(i, fromBundleList);
                }
            });
        } catch (RuntimeException e) {
            Log.w(TAG, "Ignoring malformed Bundle for CommandButton", e);
        }
    }
}
