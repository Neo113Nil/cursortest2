package p000;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ka0 extends f51 {

    /* JADX INFO: renamed from: j */
    public final Handler f4329j;

    /* JADX INFO: renamed from: k */
    public volatile boolean f4330k;

    public ka0(Handler handler) {
        this.f4329j = handler;
    }

    @Override // p000.f51
    /* JADX INFO: renamed from: a */
    public final InterfaceC0187eu mo1498a(Runnable runnable, TimeUnit timeUnit) {
        EnumC0336iw enumC0336iw = EnumC0336iw.f3682j;
        if (TimeUnit.NANOSECONDS == null) {
            C0270h1.m2192h("unit == null");
            return null;
        }
        if (this.f4330k) {
            return enumC0336iw;
        }
        Handler handler = this.f4329j;
        la0 la0Var = new la0(handler, runnable);
        Message messageObtain = Message.obtain(handler, la0Var);
        messageObtain.obj = this;
        this.f4329j.sendMessageDelayed(messageObtain, 0L);
        if (!this.f4330k) {
            return la0Var;
        }
        this.f4329j.removeCallbacks(la0Var);
        return enumC0336iw;
    }

    @Override // p000.InterfaceC0187eu
    /* JADX INFO: renamed from: c */
    public final void mo480c() {
        this.f4330k = true;
        this.f4329j.removeCallbacksAndMessages(this);
    }
}
