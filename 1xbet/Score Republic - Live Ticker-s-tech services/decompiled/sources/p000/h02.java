package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class h02 implements Callable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f2991j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f2992k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f2993l;

    public h02(x62 x62Var, z72 z72Var) {
        this.f2991j = 2;
        this.f2993l = z72Var;
        Objects.requireNonNull(x62Var);
        this.f2992k = x62Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f2991j;
        Object obj = this.f2992k;
        Object obj2 = this.f2993l;
        switch (i) {
            case 0:
                b12 b12Var = (b12) obj;
                b12Var.f681b.m5550W();
                qt1 qt1Var = b12Var.f681b.f8823l;
                x62.m5533U(qt1Var);
                return qt1Var.m4197x0((String) obj2);
            case 1:
                b12 b12Var2 = (b12) obj;
                b12Var2.f681b.m5550W();
                return new gt1(b12Var2.f681b.m5582q0(((z72) obj2).f9655j));
            case 2:
                z72 z72Var = (z72) obj2;
                String str = z72Var.f9655j;
                p80.m3863h(str);
                x62 x62Var = (x62) obj;
                l12 l12VarM5557d = x62Var.m5557d(str);
                k12 k12Var = k12.f4250l;
                if (l12VarM5557d.m3157i(k12Var) && l12.m3150c(z72Var.f9641B, 100).m3157i(k12Var)) {
                    return x62Var.m5558d0(z72Var).m4963F();
                }
                x62Var.mo1563b().f4608w.m5312a("Analytics storage consent denied. Returning null app instance id");
                return null;
            default:
                oq0 oq0Var = (oq0) obj2;
                v72 v72Var = (v72) obj;
                x22 x22Var = (x22) oq0Var.f5841l;
                a81 a81Var = new a81(23);
                try {
                    g82 g82Var = (g82) x22Var.f8768f.get();
                    Uri uri = (Uri) oq0Var.f5842m;
                    a81 a81Var2 = new a81(v72Var);
                    a81Var2.f64l = new a81[]{a81Var};
                    break;
                } catch (IOException | RuntimeException e) {
                    AbstractC0477mo.m3412p(Level.WARNING, x22Var.m5498a(), e, "Failed to update snapshot for %s flags may be stale.", (String) oq0Var.f5840k);
                }
                return null;
        }
    }

    public /* synthetic */ h02(b12 b12Var, Object obj, int i) {
        this.f2991j = i;
        this.f2993l = obj;
        this.f2992k = b12Var;
    }

    public /* synthetic */ h02(oq0 oq0Var, v72 v72Var) {
        this.f2991j = 3;
        this.f2993l = oq0Var;
        this.f2992k = v72Var;
    }
}
