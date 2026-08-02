package p000;

import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ma0 extends g51 {

    /* JADX INFO: renamed from: a */
    public final Handler f5015a;

    public ma0(Handler handler) {
        this.f5015a = handler;
    }

    @Override // p000.g51
    /* JADX INFO: renamed from: a */
    public final f51 mo1301a() {
        return new ka0(this.f5015a);
    }

    @Override // p000.g51
    /* JADX INFO: renamed from: c */
    public final InterfaceC0187eu mo1988c(Runnable runnable) {
        if (TimeUnit.NANOSECONDS == null) {
            C0270h1.m2192h("unit == null");
            return null;
        }
        Handler handler = this.f5015a;
        la0 la0Var = new la0(handler, runnable);
        handler.postDelayed(la0Var, 0L);
        return la0Var;
    }
}
