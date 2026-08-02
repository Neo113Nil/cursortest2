package androidx.media3.session;

import androidx.media3.common.Player;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.session.MediaController;

/* loaded from: classes3.dex */
public final /* synthetic */ class L0 implements ListenerSet.Event, Consumer {
    public final /* synthetic */ Object a;

    public /* synthetic */ L0(Object obj) {
        this.a = obj;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((MediaController) this.a).lambda$release$0((MediaController.Listener) obj);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$82((PlayerInfo) this.a, (Player.Listener) obj);
    }
}
