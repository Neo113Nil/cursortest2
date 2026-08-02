package p000;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class y90 implements InterfaceC0931yy {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9227a = 1;

    /* JADX INFO: renamed from: b */
    public final oy0 f9228b;

    /* JADX INFO: renamed from: c */
    public final oy0 f9229c;

    public y90(oy0 oy0Var, v90 v90Var) {
        this.f9228b = oy0Var;
        this.f9229c = v90Var;
    }

    @Override // p000.ny0
    public final Object get() {
        int i = this.f9227a;
        oy0 oy0Var = this.f9229c;
        oy0 oy0Var2 = this.f9228b;
        switch (i) {
            case 0:
                AbstractC0727tf c0359jh = (AbstractC0727tf) ((C0032ao) oy0Var2).get();
                Iterator it = Arrays.asList(new up0((np0) ((C0605q4) oy0Var).get())).iterator();
                while (it.hasNext()) {
                    c0359jh = new C0359jh(c0359jh, (up0) it.next());
                }
                return new jd0(c0359jh, C0095ce.f1224h.m921c(AbstractC0249gh.f2735c, EnumC0138dh.f1645j));
            default:
                return new xz0((by0) oy0Var2.get(), (kc1) oy0Var.get());
        }
    }

    public y90(x90 x90Var, C0032ao c0032ao, C0605q4 c0605q4) {
        this.f9228b = c0032ao;
        this.f9229c = c0605q4;
    }
}
