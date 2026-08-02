package androidx.media3.session;

import androidx.media3.common.Player;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.session.MediaControllerImplLegacy;
import androidx.media3.session.MediaSession;

/* loaded from: classes3.dex */
public final /* synthetic */ class P1 implements ListenerSet.Event, Consumer {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ P1(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((MediaSessionStub) this.a).lambda$playForControllerInfo$19((MediaSession.ControllerInfo) this.b, (PlayerWrapper) obj);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        MediaControllerImplLegacy.lambda$updateControllerInfo$11((MediaControllerImplLegacy.ControllerInfo) this.a, (Integer) this.b, (Player.Listener) obj);
    }
}
