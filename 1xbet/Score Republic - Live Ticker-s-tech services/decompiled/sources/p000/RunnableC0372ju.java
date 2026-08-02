package p000;

import java.util.Objects;

/* JADX INFO: renamed from: ju */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0372ju implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f4095j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f4096k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f4097l;

    public RunnableC0372ju(v22 v22Var, boolean z) {
        this.f4095j = 2;
        this.f4096k = z;
        Objects.requireNonNull(v22Var);
        this.f4097l = v22Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4095j) {
            case 0:
                C0409ku c0409ku = (C0409ku) ((RunnableC0529o2) this.f4097l).f5578l;
                if (this.f4096k) {
                    c0409ku.f4573r = true;
                    if (c0409ku.f4570o > 0) {
                        na1 na1Var = c0409ku.f4572q;
                        na1Var.f5351b = false;
                        na1Var.m3510b();
                    }
                }
                c0409ku.f4578w = false;
                break;
            case 1:
                l81 l81Var = (l81) this.f4097l;
                boolean z = this.f4096k;
                zg1.m5891b();
                C0809vn c0809vn = l81Var.f4711a;
                boolean z2 = c0809vn.f8223k;
                c0809vn.f8223k = z;
                if (z2 != z) {
                    ((k81) c0809vn.f8224l).mo2999a(z);
                }
                break;
            default:
                v22 v22Var = (v22) this.f4097l;
                f02 f02Var = (f02) v22Var.f7192j;
                boolean zM1565d = f02Var.m1565d();
                boolean z3 = f02Var.f2235H != null && f02Var.f2235H.booleanValue();
                boolean z4 = this.f4096k;
                f02Var.f2235H = Boolean.valueOf(z4);
                if (z3 == z4) {
                    ky1 ky1Var = f02Var.f2247o;
                    f02.m1560m(ky1Var);
                    ky1Var.f4608w.m5313b(Boolean.valueOf(z4), "Default data collection state already set to");
                }
                if (f02Var.m1565d() == zM1565d) {
                    ky1 ky1Var2 = f02Var.f2247o;
                    f02.m1560m(ky1Var2);
                    ky1Var2.f4605t.m5314c(Boolean.valueOf(z4), Boolean.valueOf(zM1565d), "Default data collection is different than actual status");
                } else if (f02Var.m1565d() != (f02Var.f2235H != null && f02Var.f2235H.booleanValue())) {
                    ky1 ky1Var3 = f02Var.f2247o;
                    f02.m1560m(ky1Var3);
                    ky1Var3.f4605t.m5314c(Boolean.valueOf(z4), Boolean.valueOf(zM1565d), "Default data collection is different than actual status");
                }
                v22Var.m5037S();
                break;
        }
    }

    public /* synthetic */ RunnableC0372ju(int i, Object obj, boolean z) {
        this.f4095j = i;
        this.f4097l = obj;
        this.f4096k = z;
    }
}
