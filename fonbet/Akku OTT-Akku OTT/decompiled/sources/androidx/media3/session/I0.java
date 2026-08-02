package androidx.media3.session;

import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.session.MediaControllerImplLegacy;

/* loaded from: classes3.dex */
public final /* synthetic */ class I0 implements ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ I0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((Player.Listener) obj).onPlayerErrorChanged((PlaybackException) this.b);
                break;
            default:
                MediaControllerImplLegacy.lambda$updateControllerInfo$9((MediaControllerImplLegacy.ControllerInfo) this.b, (Player.Listener) obj);
                break;
        }
    }
}
