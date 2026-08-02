package androidx.media3.session;

import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionImpl;
import androidx.media3.session.MediaSessionStub;

/* renamed from: androidx.media3.session.v0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0591v0 implements ListenerSet.Event, MediaSessionImpl.RemoteControllerTask, MediaSessionStub.SessionTask {
    public final /* synthetic */ Object a;

    public /* synthetic */ C0591v0(Object obj) {
        this.a = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$93((PlayerInfo) this.a, (Player.Listener) obj);
    }

    @Override // androidx.media3.session.MediaSessionStub.SessionTask
    public Object run(MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo, int i) {
        com.google.common.util.concurrent.u lambda$addMediaItemWithIndex$36;
        lambda$addMediaItemWithIndex$36 = MediaSessionStub.lambda$addMediaItemWithIndex$36((MediaItem) this.a, mediaSessionImpl, controllerInfo, i);
        return lambda$addMediaItemWithIndex$36;
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(MediaSession.ControllerCb controllerCb, int i) {
        controllerCb.onMediaMetadataChanged(i, (MediaMetadata) this.a);
    }
}
