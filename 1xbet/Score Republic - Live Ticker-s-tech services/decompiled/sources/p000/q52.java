package p000;

import android.os.Bundle;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class q52 {

    /* JADX INFO: renamed from: a */
    public long f6387a;

    /* JADX INFO: renamed from: b */
    public long f6388b;

    /* JADX INFO: renamed from: c */
    public final m52 f6389c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ s52 f6390d;

    public q52(s52 s52Var) {
        this.f6390d = s52Var;
        f02 f02Var = (f02) s52Var.f7192j;
        this.f6389c = new m52(this, f02Var, 0);
        f02Var.f2252t.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f6387a = jElapsedRealtime;
        this.f6388b = jElapsedRealtime;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4038a(boolean z, boolean z2, long j) {
        s52 s52Var = this.f6390d;
        s52Var.mo11z();
        s52Var.m3446B();
        f02 f02Var = (f02) s52Var.f7192j;
        boolean zM1565d = f02Var.m1565d();
        ky1 ky1Var = f02Var.f2247o;
        if (zM1565d) {
            fz1 fz1Var = f02Var.f2246n;
            f02.m1558k(fz1Var);
            bz1 bz1Var = fz1Var.f2562y;
            f02Var.f2252t.getClass();
            bz1Var.m822b(System.currentTimeMillis());
        }
        long j2 = j - this.f6387a;
        if (!z && j2 < 1000) {
            f02.m1560m(ky1Var);
            ky1Var.f4608w.m5313b(Long.valueOf(j2), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z2) {
            j2 = j - this.f6388b;
            this.f6388b = j;
        }
        f02.m1560m(ky1Var);
        ky1Var.f4608w.m5313b(Long.valueOf(j2), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        boolean z3 = !f02Var.f2245m.m774P();
        l32 l32Var = f02Var.f2253u;
        f02.m1559l(l32Var);
        f72.m1696x0(l32Var.m3160E(z3), bundle, true);
        if (!z2) {
            v22 v22Var = f02Var.f2254v;
            f02.m1559l(v22Var);
            v22Var.m5026H("auto", "_e", bundle);
        }
        this.f6387a = j;
        m52 m52Var = this.f6389c;
        m52Var.m4404c();
        m52Var.m4403b(((Long) jx1.f4205p0.m2715a(null)).longValue());
        return true;
    }
}
