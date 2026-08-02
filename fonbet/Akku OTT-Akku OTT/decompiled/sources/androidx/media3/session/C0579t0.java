package androidx.media3.session;

import androidx.media3.common.Player;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.session.MediaController;

/* renamed from: androidx.media3.session.t0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0579t0 implements ListenerSet.Event, Consumer {
    public final /* synthetic */ Object a;

    public /* synthetic */ C0579t0(Object obj) {
        this.a = obj;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((MediaControllerImplBase) this.a).lambda$onAvailableCommandsChangedFromSession$112((MediaController.Listener) obj);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        MediaControllerImplBase.lambda$notifyPlayerInfoListenersWithReasons$91((PlayerInfo) this.a, (Player.Listener) obj);
    }
}
