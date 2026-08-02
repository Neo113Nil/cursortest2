package p000;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c32 implements nb1, InterfaceC0350j8 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f1082j;

    /* JADX INFO: renamed from: k */
    public final Object f1083k;

    public c32() {
        this.f1082j = 3;
        this.f1083k = new AtomicInteger();
    }

    /* JADX INFO: renamed from: a */
    public l52 m845a(String str, boolean z) {
        return new l52(str, (p90) this.f1083k, z);
    }

    @Override // p000.InterfaceC0350j8
    public ListenableFuture call() {
        ListenableFuture listenableFutureM2990a;
        int i = this.f1082j;
        Object obj = this.f1083k;
        switch (i) {
            case 5:
                e92 e92Var = (e92) obj;
                w61 w61Var = e92Var.f2023d;
                try {
                    return k70.m2993d(e92Var.m1395b((Uri) k70.m2991b(e92Var.f2021b)));
                } catch (IOException e) {
                    cx0 cx0Var = e92Var.f2025f;
                    cx0Var.getClass();
                    if ((e instanceof o82) || (e.getCause() instanceof o82)) {
                        return k70.m2992c(e);
                    }
                    h92 h92Var = (h92) cx0Var.f1486j;
                    h92Var.getClass();
                    int i2 = 4;
                    if (e.getCause() instanceof mp1) {
                        jc0 jc0VarM2993d = k70.m2993d(h92Var.f3134a);
                        c92 c92Var = new c92(e92Var, 2);
                        int i3 = ja2.f3889a;
                        listenableFutureM2990a = k70.m2990a(k70.m2996g(jc0VarM2993d, new n72(i2, s92.m4509a(), c92Var), w61Var), IOException.class, new l62(5, e), EnumC0113ct.f1449j);
                    } else {
                        listenableFutureM2990a = k70.m2992c(e);
                    }
                    c92 c92Var2 = new c92(e92Var, 1);
                    int i4 = ja2.f3889a;
                    return k70.m2996g(listenableFutureM2990a, new n72(i2, s92.m4509a(), c92Var2), w61Var);
                }
            default:
                return (AbstractC0269h0) obj;
        }
    }

    @Override // p000.nb1
    public Object get() {
        int i = this.f1082j;
        Object obj = this.f1083k;
        switch (i) {
            case 0:
                Object obj2 = x22.f8759j;
                return (s72) ((su0) ((nb1) obj).get()).mo1041c();
            default:
                b82 b82Var = (b82) obj;
                mq0 mq0Var = (mq0) b82Var.f770c.get();
                mq0Var.getClass();
                b42 b42Var = (b42) b82Var.f769b.get();
                b42Var.getClass();
                e22 e22Var = b42Var.f710a;
                m81 m81VarM3350b = m81.m3350b();
                m81VarM3350b.f5010l = new an0(19, e22Var);
                m81VarM3350b.f5011m = new C0451lz[]{AbstractC0477mo.f5109f};
                m81VarM3350b.f5009k = false;
                C0305i c0305iM590b = b42.m590b(e22Var.m2002b(0, m81VarM3350b.m3354a()));
                yq1 yq1Var = yq1.f9435n;
                int i2 = AbstractRunnableC0378k.f4237u;
                C0341j c0341j = new C0341j(c0305iM590b, y32.class, yq1Var);
                c0305iM590b.mo995c(c0341j, vk1.m5169f(mq0Var, c0341j));
                C0002a1 c0002a1M2995f = k70.m2995f(c0341j, new q62(2, b82Var), mq0Var);
                c0002a1M2995f.mo995c(new cm1(14, c0002a1M2995f), mq0Var);
                return c0002a1M2995f;
        }
    }

    public /* synthetic */ c32(int i, Object obj) {
        this.f1082j = i;
        this.f1083k = obj;
    }
}
