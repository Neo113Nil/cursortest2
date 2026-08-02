package androidx.media3.session;

import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionImpl;
import androidx.media3.session.MediaSessionStub;

/* renamed from: androidx.media3.session.g0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0497g0 implements ListenerSet.Event, MediaSessionImpl.RemoteControllerTask, MediaSessionStub.SessionTask {
    public final /* synthetic */ Object a;

    public /* synthetic */ C0497g0(Object obj) {
        this.a = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((Player.Listener) obj).onPlaylistMetadataChanged((MediaMetadata) this.a);
    }

    @Override // androidx.media3.session.MediaSessionStub.SessionTask
    public Object run(MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        com.google.common.util.concurrent.u lambda$unsubscribe$72;
        lambda$unsubscribe$72 = MediaSessionStub.lambda$unsubscribe$72((String) this.a, (MediaLibrarySessionImpl) mediaSessionImpl, controllerInfo, i);
        return lambda$unsubscribe$72;
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(MediaSession.ControllerCb controllerCb, int i) {
        ((MediaSessionImpl) this.a).lambda$handleAvailablePlayerCommandsChanged$23(controllerCb, i);
    }
}
