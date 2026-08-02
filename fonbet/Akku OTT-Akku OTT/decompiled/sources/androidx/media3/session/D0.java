package androidx.media3.session;

import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.session.MediaControllerImplLegacy;

/* loaded from: classes3.dex */
public final /* synthetic */ class D0 implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ D0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$99((PlayerInfo) this.b, (Player.Listener) obj);
                break;
            default:
                MediaControllerImplLegacy.lambda$updateControllerInfo$23((MediaControllerImplLegacy.ControllerInfo) this.b, (Player.Listener) obj);
                break;
        }
    }
}
