package p000;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class l32 extends mx1 {

    /* JADX INFO: renamed from: l */
    public volatile f32 f4658l;

    /* JADX INFO: renamed from: m */
    public volatile f32 f4659m;

    /* JADX INFO: renamed from: n */
    public f32 f4660n;

    /* JADX INFO: renamed from: o */
    public final ConcurrentHashMap f4661o;

    /* JADX INFO: renamed from: p */
    public xv1 f4662p;

    /* JADX INFO: renamed from: q */
    public volatile boolean f4663q;

    /* JADX INFO: renamed from: r */
    public volatile f32 f4664r;

    /* JADX INFO: renamed from: s */
    public f32 f4665s;

    /* JADX INFO: renamed from: t */
    public boolean f4666t;

    /* JADX INFO: renamed from: u */
    public final Object f4667u;

    public l32(f02 f02Var) {
        super(f02Var);
        this.f4667u = new Object();
        this.f4661o = new ConcurrentHashMap();
    }

    @Override // p000.mx1
    /* JADX INFO: renamed from: D */
    public final boolean mo533D() {
        return false;
    }

    /* JADX INFO: renamed from: E */
    public final f32 m3160E(boolean z) {
        m3446B();
        mo11z();
        f32 f32Var = this.f4660n;
        return (z && f32Var == null) ? this.f4665s : f32Var;
    }

    /* JADX INFO: renamed from: F */
    public final String m3161F(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        f02 f02Var = (f02) this.f7192j;
        int length2 = str2.length();
        f02Var.f2245m.getClass();
        if (length2 <= 500) {
            return str2;
        }
        f02Var.f2245m.getClass();
        return str2.substring(0, 500);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b5  */
    /* JADX INFO: renamed from: G */
    public final void m3162G(f32 f32Var, f32 f32Var2, long j, boolean z, Bundle bundle) {
        boolean z2;
        long j2;
        Bundle bundle2;
        boolean z3 = f32Var.f2299e;
        f02 f02Var = (f02) this.f7192j;
        mo11z();
        boolean z4 = false;
        if (f32Var2 != null) {
            if (f32Var2.f2297c == f32Var.f2297c && Objects.equals(f32Var2.f2296b, f32Var.f2296b) && Objects.equals(f32Var2.f2295a, f32Var.f2295a)) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = true;
        }
        if (z && this.f4660n != null) {
            z4 = true;
        }
        if (z2) {
            Bundle bundle3 = bundle != null ? new Bundle(bundle) : new Bundle();
            f72.m1696x0(f32Var, bundle3, true);
            if (f32Var2 != null) {
                String str = f32Var2.f2295a;
                if (str != null) {
                    bundle3.putString("_pn", str);
                }
                String str2 = f32Var2.f2296b;
                if (str2 != null) {
                    bundle3.putString("_pc", str2);
                }
                bundle3.putLong("_pi", f32Var2.f2297c);
            }
            if (z4) {
                s52 s52Var = f02Var.f2249q;
                f02.m1559l(s52Var);
                q52 q52Var = s52Var.f7035o;
                long j3 = j - q52Var.f6388b;
                q52Var.f6388b = j;
                if (j3 > 0) {
                    f72 f72Var = f02Var.f2250r;
                    f02.m1558k(f72Var);
                    f72Var.m1732n0(bundle3, j3);
                }
            }
            bt1 bt1Var = f02Var.f2245m;
            wa0 wa0Var = f02Var.f2252t;
            if (!bt1Var.m774P()) {
                bundle3.putLong("_mst", 1L);
            }
            String str3 = true != z3 ? "auto" : "app";
            wa0Var.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z3) {
                long j4 = f32Var.f2300f;
                if (j4 != 0) {
                    j2 = j4;
                } else {
                    j2 = jCurrentTimeMillis;
                }
            } else {
                j2 = jCurrentTimeMillis;
            }
            long jElapsedRealtime = f02Var.f2245m.m770L(null, jx1.f4178e1) ? SystemClock.elapsedRealtime() : 0L;
            if (z3) {
                bundle2 = bundle3;
                long j5 = f32Var.f2301g;
                if (j5 != 0) {
                    jElapsedRealtime = j5;
                }
            } else {
                bundle2 = bundle3;
            }
            v22 v22Var = f02Var.f2254v;
            f02.m1559l(v22Var);
            v22Var.m5027I(j2, jElapsedRealtime, bundle2, str3, "_vs");
        }
        if (z4) {
            m3165J(this.f4660n, true, j);
        }
        this.f4660n = f32Var;
        if (z3) {
            this.f4665s = f32Var;
        }
        v42 v42VarM1573p = f02Var.m1573p();
        v42VarM1573p.mo11z();
        v42VarM1573p.m3446B();
        v42VarM1573p.m5067O(new f31(v42VarM1573p, f32Var));
    }

    /* JADX INFO: renamed from: H */
    public final void m3163H(xv1 xv1Var, Bundle bundle) {
        Bundle bundle2;
        if (!((f02) this.f7192j).f2245m.m774P() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f4661o.put(Integer.valueOf(xv1Var.f9090j), new f32(bundle2.getLong("id"), bundle2.getString("name"), bundle2.getString("referrer_name")));
    }

    /* JADX INFO: renamed from: I */
    public final void m3164I(String str, f32 f32Var, boolean z) {
        f32 f32Var2;
        f32 f32Var3 = this.f4658l == null ? this.f4659m : this.f4658l;
        if (f32Var.f2296b == null) {
            f32Var2 = new f32(f32Var.f2295a, str != null ? m3161F(str) : null, f32Var.f2297c, f32Var.f2299e, f32Var.f2300f, f32Var.f2301g);
        } else {
            f32Var2 = f32Var;
        }
        this.f4659m = this.f4658l;
        this.f4658l = f32Var2;
        f02 f02Var = (f02) this.f7192j;
        f02Var.f2252t.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a02 a02Var = f02Var.f2248p;
        f02.m1560m(a02Var);
        a02Var.m6J(new g32(this, f32Var2, f32Var3, jElapsedRealtime, z));
    }

    /* JADX INFO: renamed from: J */
    public final void m3165J(f32 f32Var, boolean z, long j) {
        f02 f02Var = (f02) this.f7192j;
        qv1 qv1Var = f02Var.f2255w;
        f02.m1557j(qv1Var);
        f02Var.f2252t.getClass();
        qv1Var.m4202D(SystemClock.elapsedRealtime());
        boolean z2 = f32Var != null && f32Var.f2298d;
        s52 s52Var = f02Var.f2249q;
        f02.m1559l(s52Var);
        if (!s52Var.f7035o.m4038a(z2, z, j) || f32Var == null) {
            return;
        }
        f32Var.f2298d = false;
    }

    /* JADX INFO: renamed from: K */
    public final f32 m3166K(xv1 xv1Var) {
        p80.m3863h(xv1Var);
        Integer numValueOf = Integer.valueOf(xv1Var.f9090j);
        ConcurrentHashMap concurrentHashMap = this.f4661o;
        f32 f32Var = (f32) concurrentHashMap.get(numValueOf);
        if (f32Var == null) {
            String strM3161F = m3161F(xv1Var.f9091k);
            f72 f72Var = ((f02) this.f7192j).f2250r;
            f02.m1558k(f72Var);
            f32 f32Var2 = new f32(f72Var.m1741z0(), null, strM3161F);
            concurrentHashMap.put(numValueOf, f32Var2);
            f32Var = f32Var2;
        }
        return this.f4664r != null ? this.f4664r : f32Var;
    }
}
