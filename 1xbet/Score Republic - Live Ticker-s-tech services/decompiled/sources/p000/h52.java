package p000;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class h52 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f3068j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ long f3069k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ s52 f3070l;

    public h52(s52 s52Var, long j, int i) {
        this.f3068j = i;
        switch (i) {
            case 1:
                this.f3069k = j;
                Objects.requireNonNull(s52Var);
                this.f3070l = s52Var;
                break;
            default:
                this.f3069k = j;
                Objects.requireNonNull(s52Var);
                this.f3070l = s52Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00a9  */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3068j;
        s52 s52Var = this.f3070l;
        switch (i) {
            case 0:
                q52 q52Var = s52Var.f7035o;
                s52Var.mo11z();
                s52Var.m4484E();
                f02 f02Var = (f02) s52Var.f7192j;
                ky1 ky1Var = f02Var.f2247o;
                f02.m1560m(ky1Var);
                wc1 wc1Var = ky1Var.f4608w;
                long j = this.f3069k;
                wc1Var.m5313b(Long.valueOf(j), "Activity resumed, time");
                bt1 bt1Var = f02Var.f2245m;
                if (bt1Var.m770L(null, jx1.f4149S0)) {
                    if (bt1Var.m774P() || s52Var.f7033m) {
                        q52Var.f6390d.mo11z();
                        q52Var.f6389c.m4404c();
                        q52Var.f6387a = j;
                        q52Var.f6388b = j;
                    }
                } else if (bt1Var.m774P()) {
                    q52Var.f6390d.mo11z();
                    q52Var.f6389c.m4404c();
                    q52Var.f6387a = j;
                    q52Var.f6388b = j;
                } else {
                    fz1 fz1Var = f02Var.f2246n;
                    f02.m1558k(fz1Var);
                    if (fz1Var.f2542B.m5852a()) {
                        q52Var.f6390d.mo11z();
                        q52Var.f6389c.m4404c();
                        q52Var.f6387a = j;
                        q52Var.f6388b = j;
                    }
                }
                a81 a81Var = s52Var.f7036p;
                s52 s52Var2 = (s52) a81Var.f64l;
                s52Var2.mo11z();
                k52 k52Var = (k52) a81Var.f63k;
                if (k52Var != null) {
                    s52Var2.f7032l.removeCallbacks(k52Var);
                }
                fz1 fz1Var2 = ((f02) s52Var2.f7192j).f2246n;
                f02.m1558k(fz1Var2);
                fz1Var2.f2542B.m5853b(false);
                s52Var2.mo11z();
                s52Var2.f7033m = false;
                an0 an0Var = s52Var.f7034n;
                s52 s52Var3 = (s52) an0Var.f254k;
                s52Var3.mo11z();
                f02 f02Var2 = (f02) s52Var3.f7192j;
                boolean zM1565d = f02Var2.m1565d();
                wa0 wa0Var = f02Var2.f2252t;
                if (zM1565d) {
                    wa0Var.getClass();
                    an0Var.m302A(System.currentTimeMillis(), f02Var2.f2245m.m770L(null, jx1.f4178e1) ? SystemClock.elapsedRealtime() : 0L);
                    break;
                }
                break;
            default:
                s52Var.mo11z();
                s52Var.m4484E();
                f02 f02Var3 = (f02) s52Var.f7192j;
                ky1 ky1Var2 = f02Var3.f2247o;
                f02.m1560m(ky1Var2);
                wc1 wc1Var2 = ky1Var2.f4608w;
                long j2 = this.f3069k;
                wc1Var2.m5313b(Long.valueOf(j2), "Activity paused, time");
                a81 a81Var2 = s52Var.f7036p;
                s52 s52Var4 = (s52) a81Var2.f64l;
                ((f02) s52Var4.f7192j).f2252t.getClass();
                k52 k52Var2 = new k52(a81Var2, System.currentTimeMillis(), j2);
                a81Var2.f63k = k52Var2;
                s52Var4.f7032l.postDelayed(k52Var2, 2000L);
                if (f02Var3.f2245m.m774P()) {
                    s52Var.f7035o.f6389c.m4404c();
                }
                break;
        }
    }
}
