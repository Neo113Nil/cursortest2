package androidx.media3.session;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.session.MediaControllerImplLegacy;
import androidx.media3.session.MediaSession;
import androidx.media3.session.MediaSessionLegacyStub;

/* loaded from: classes3.dex */
public final /* synthetic */ class H0 implements ListenerSet.Event, MediaSessionLegacyStub.SessionTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ H0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$103((PlayerInfo) this.b, (Player.Listener) obj);
                break;
            default:
                MediaControllerImplLegacy.lambda$updateControllerInfo$8((MediaControllerImplLegacy.ControllerInfo) this.b, (Player.Listener) obj);
                break;
        }
    }

    @Override // androidx.media3.session.MediaSessionLegacyStub.SessionTask
    public void run(MediaSession.ControllerInfo controllerInfo) {
        ((MediaSessionLegacyStub) this.b).lambda$onPause$5(controllerInfo);
    }
}
