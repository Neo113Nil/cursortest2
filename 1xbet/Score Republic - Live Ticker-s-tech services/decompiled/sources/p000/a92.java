package p000;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class a92 {

    /* JADX INFO: renamed from: a */
    public final String f96a;

    /* JADX INFO: renamed from: b */
    public final C0934z0 f97b;

    /* JADX INFO: renamed from: c */
    public final e92 f98c;

    /* JADX INFO: renamed from: d */
    public final C0312i6 f99d;

    /* JADX INFO: renamed from: e */
    public final C0902y5 f100e;

    /* JADX INFO: renamed from: f */
    public final C0902y5 f101f = new C0902y5(new a81(25, this));

    /* JADX INFO: renamed from: g */
    public final Object f102g;

    /* JADX INFO: renamed from: h */
    public final bx1 f103h;

    /* JADX INFO: renamed from: i */
    public List f104i;

    public a92(e92 e92Var, C0934z0 c0934z0) {
        Object obj = new Object();
        this.f102g = obj;
        this.f104i = new ArrayList();
        this.f98c = e92Var;
        this.f97b = c0934z0;
        this.f96a = e92Var.f2020a;
        this.f100e = new C0902y5(new an0(26, e92Var));
        this.f99d = new C0312i6(26);
        this.f103h = new bx1(7);
        l62 l62Var = new l62(4, this);
        synchronized (obj) {
            this.f104i.add(l62Var);
        }
    }

    /* JADX INFO: renamed from: a */
    public final C0002a1 m148a(q62 q62Var, mq0 mq0Var) {
        l62 l62Var = new l62(3, q62Var);
        int i = ja2.f3889a;
        n72 n72Var = new n72(4, s92.m4509a(), l62Var);
        kd1 kd1Var = la2.f4747a;
        a90.m127k(kd1Var, "ticker");
        kd1Var.mo2848a();
        String strConcat = "Update ".concat(String.valueOf(this.f96a));
        this.f103h.getClass();
        aa2 aa2VarM796c = bx1.m796c(strConcat);
        try {
            AbstractC0269h0 abstractC0269h0M5736s = this.f101f.m5736s();
            C0312i6 c0312i6 = this.f99d;
            c32 c32Var = new c32(6, abstractC0269h0M5736s);
            EnumC0113ct enumC0113ct = EnumC0113ct.f1449j;
            c0312i6.m2537B(c32Var, enumC0113ct);
            ListenableFuture listenableFutureM2537B = c0312i6.m2537B(ja2.m2841a(new f71(this, abstractC0269h0M5736s, n72Var, mq0Var, 19)), enumC0113ct);
            k70.propagateCancellation(listenableFutureM2537B, abstractC0269h0M5736s);
            k70.m2994e(this.f97b);
            C0002a1 c0002a1M2995f = k70.m2995f(listenableFutureM2537B, new h70(), enumC0113ct);
            aa2VarM796c.m168a(c0002a1M2995f);
            aa2VarM796c.close();
            return c0002a1M2995f;
        } catch (Throwable th) {
            try {
                aa2VarM796c.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
