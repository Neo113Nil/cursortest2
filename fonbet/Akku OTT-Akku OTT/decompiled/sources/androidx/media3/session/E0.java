package androidx.media3.session;

import androidx.media3.common.Player;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.session.MediaControllerImplLegacy;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class E0 implements ListenerSet.Event, MediaSessionImpl.RemoteControllerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ E0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$100((PlayerInfo) this.b, (Player.Listener) obj);
                break;
            default:
                MediaControllerImplLegacy.lambda$updateControllerInfo$24((MediaControllerImplLegacy.ControllerInfo) this.b, (Player.Listener) obj);
                break;
        }
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(MediaSession.ControllerCb controllerCb, int i) {
        controllerCb.onVideoSizeChanged(i, (VideoSize) this.b);
    }
}
