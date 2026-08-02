package p000;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class yo1 implements cq1 {

    /* JADX INFO: renamed from: a */
    public final zo1 f9423a;

    static {
        so1 so1Var = so1.f7176a;
        int i = fo1.f2465a;
    }

    public yo1(zo1 zo1Var) {
        this.f9423a = zo1Var;
    }

    /* JADX INFO: renamed from: a */
    public final zo1 m5821a(InputStream inputStream, so1 so1Var) throws mp1 {
        AbstractC0860x0 abstractC0860x0M5486K = AbstractC0860x0.m5486K(inputStream, 4096);
        int i = zo1.zzd;
        zo1 zo1VarM5967i = this.f9423a.m5967i();
        try {
            hq1 hq1VarM1495a = eq1.f2165c.m1495a(zo1VarM5967i.getClass());
            C0212fi c0212fi = (C0212fi) abstractC0860x0M5486K.f8729l;
            if (c0212fi == null) {
                c0212fi = new C0212fi(abstractC0860x0M5486K, (byte) 0);
            }
            hq1VarM1495a.mo470g(zo1VarM5967i, c0212fi, so1Var);
            hq1VarM1495a.mo472i(zo1VarM5967i);
            abstractC0860x0M5486K.mo3248P(0);
            if (zo1.m5962q(zo1VarM5967i, true)) {
                return zo1VarM5967i;
            }
            throw new lq1().m3275a();
        } catch (lq1 e) {
            throw e.m3275a();
        } catch (mp1 e2) {
            if (e2.f5126j) {
                throw new mp1(e2.getMessage(), e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof mp1) {
                throw ((mp1) e3.getCause());
            }
            throw new mp1(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof mp1) {
                throw ((mp1) e4.getCause());
            }
            throw e4;
        }
    }
}
