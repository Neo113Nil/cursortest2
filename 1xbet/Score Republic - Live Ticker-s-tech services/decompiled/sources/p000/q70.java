package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class q70 implements lv0 {

    /* JADX INFO: renamed from: b */
    public static final C0709sy f6395b = C0709sy.m4607a();

    /* JADX INFO: renamed from: a */
    public final s70 f6396a;

    public q70(s70 s70Var) {
        this.f6396a = s70Var;
    }

    /* JADX INFO: renamed from: a */
    public final s70 m4040a(AbstractC0860x0 abstractC0860x0, C0709sy c0709sy) {
        s70 s70VarM4497k = this.f6396a.m4497k();
        try {
            ey0 ey0Var = ey0.f2207c;
            ey0Var.getClass();
            r51 r51VarM1525a = ey0Var.m1525a(s70VarM4497k.getClass());
            C0212fi c0212fi = (C0212fi) abstractC0860x0.f8729l;
            if (c0212fi == null) {
                c0212fi = new C0212fi(abstractC0860x0);
            }
            r51VarM1525a.mo4253f(s70VarM4497k, c0212fi, c0709sy);
            r51VarM1525a.mo4249b(s70VarM4497k);
            return s70VarM4497k;
        } catch (hf0 e) {
            if (e.f3197j) {
                throw new hf0(e.getMessage(), e);
            }
            throw e;
        } catch (if1 e2) {
            throw new hf0(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof hf0) {
                throw ((hf0) e3.getCause());
            }
            throw new hf0(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof hf0) {
                throw ((hf0) e4.getCause());
            }
            throw e4;
        }
    }
}
