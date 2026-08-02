package p000;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class a22 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f26j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ long f27k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ v22 f28l;

    public a22(v22 v22Var, long j, int i) {
        this.f26j = i;
        switch (i) {
            case 1:
                this.f27k = j;
                this.f28l = v22Var;
                break;
            default:
                this.f27k = j;
                Objects.requireNonNull(v22Var);
                this.f28l = v22Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f26j;
        long j = this.f27k;
        v22 v22Var = this.f28l;
        switch (i) {
            case 0:
                f02 f02Var = (f02) v22Var.f7192j;
                fz1 fz1Var = f02Var.f2246n;
                f02.m1558k(fz1Var);
                fz1Var.f2557t.m822b(j);
                ky1 ky1Var = f02Var.f2247o;
                f02.m1560m(ky1Var);
                ky1Var.f4607v.m5313b(Long.valueOf(j), "Session timeout duration set");
                break;
            default:
                v22Var.mo11z();
                v22Var.m3446B();
                f02 f02Var2 = (f02) v22Var.f7192j;
                ky1 ky1Var2 = f02Var2.f2247o;
                f02.m1560m(ky1Var2);
                ky1Var2.f4607v.m5312a("Resetting analytics data (FE)");
                s52 s52Var = f02Var2.f2249q;
                f02.m1559l(s52Var);
                s52Var.mo11z();
                q52 q52Var = s52Var.f7035o;
                q52Var.f6389c.m4404c();
                ((f02) q52Var.f6390d.f7192j).f2252t.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                q52Var.f6387a = jElapsedRealtime;
                q52Var.f6388b = jElapsedRealtime;
                f02Var2.m1575r().m5218F();
                boolean z = !f02Var2.m1565d();
                fz1 fz1Var2 = f02Var2.f2246n;
                f02.m1558k(fz1Var2);
                fz1Var2.f2552o.m822b(j);
                f02 f02Var3 = (f02) fz1Var2.f7192j;
                fz1 fz1Var3 = f02Var3.f2246n;
                f02.m1558k(fz1Var3);
                if (!TextUtils.isEmpty(fz1Var3.f2545E.m5181l())) {
                    fz1Var2.f2545E.m5182m(null);
                }
                fz1Var2.f2562y.m822b(0L);
                fz1Var2.f2563z.m822b(0L);
                if (!f02Var3.f2245m.m773O()) {
                    fz1Var2.m1912I(z);
                }
                fz1Var2.f2546F.m5182m(null);
                fz1Var2.f2547G.m822b(0L);
                fz1Var2.f2548H.m1649B(null);
                v42 v42VarM1573p = f02Var2.m1573p();
                v42VarM1573p.mo11z();
                v42VarM1573p.m3446B();
                z72 z72VarM5069Q = v42VarM1573p.m5069Q(false);
                v42VarM1573p.m5065M();
                ((f02) v42VarM1573p.f7192j).m1572o().m534E();
                v42VarM1573p.m5067O(new v32(v42VarM1573p, z72VarM5069Q, 0));
                f02.m1559l(s52Var);
                s52Var.f7034n.m325y();
                v22Var.f8005A = z;
                f02Var2.m1573p().m5057E(new AtomicReference());
                break;
        }
    }
}
