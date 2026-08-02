package p000;

import android.app.Application;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: o4 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0531o4 implements InterfaceC0931yy {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5614a;

    /* JADX INFO: renamed from: b */
    public final Object f5615b;

    /* JADX INFO: renamed from: c */
    public final oy0 f5616c;

    /* JADX INFO: renamed from: d */
    public final oy0 f5617d;

    public /* synthetic */ C0531o4(Object obj, oy0 oy0Var, oy0 oy0Var2, int i) {
        this.f5614a = i;
        this.f5615b = obj;
        this.f5616c = oy0Var;
        this.f5617d = oy0Var2;
    }

    @Override // p000.ny0
    public final Object get() {
        int i = this.f5614a;
        oy0 oy0Var = this.f5617d;
        oy0 oy0Var2 = this.f5616c;
        Object obj = this.f5615b;
        switch (i) {
            case 0:
                x90 x90Var = (x90) ((C0568p4) oy0Var2).get();
                hb1 hb1Var = (hb1) ((C0032ao) oy0Var).get();
                w00 w00Var = (w00) ((qd0) obj).f6471k;
                C0312i6 c0312i6 = new C0312i6(21, false);
                c0312i6.f3447k = x90Var;
                c0312i6.f3448l = new AtomicBoolean(w00Var.m5227g());
                C0337ix c0337ix = (C0337ix) hb1Var;
                c0337ix.m2714a(c0337ix.f3690c, new C0270h1(17));
                return c0312i6;
            case 1:
                return new C0652re((by0) ((oy0) obj).get(), (Application) oy0Var2.get(), (kc1) ((v90) oy0Var).get());
            default:
                g51 g51Var = (g51) ((oy0) obj).get();
                return new p51(g51Var, (g51) oy0Var.get());
        }
    }
}
