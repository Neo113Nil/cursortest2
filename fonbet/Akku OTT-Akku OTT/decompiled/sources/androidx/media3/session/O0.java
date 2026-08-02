package androidx.media3.session;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class O0 implements ListenerSet.Event, MediaSessionImpl.RemoteControllerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ O0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$85((PlayerInfo) this.b, (Player.Listener) obj);
                break;
            default:
                ((MediaControllerImplLegacy) this.b).lambda$updateControllerInfo$14((Player.Listener) obj);
                break;
        }
    }

    @Override // androidx.media3.session.MediaSessionImpl.RemoteControllerTask
    public void run(MediaSession.ControllerCb controllerCb, int i) {
        controllerCb.setMediaButtonPreferences(i, (com.google.common.collect.G) this.b);
    }
}
