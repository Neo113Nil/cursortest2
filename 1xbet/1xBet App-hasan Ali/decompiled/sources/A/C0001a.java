package A;

import com.google.android.gms.internal.ads.AbstractC1668us;
import com.google.android.gms.internal.ads.C1407p;
import com.google.android.gms.internal.ads.C1601tE;
import com.google.android.gms.internal.ads.C1603tG;
import com.google.android.gms.internal.ads.C1667ur;
import com.google.android.gms.internal.ads.NG;
import com.google.android.gms.internal.ads.RF;

/* renamed from: A.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0001a {

    /* renamed from: a, reason: collision with root package name */
    public int f31a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f32b;

    /* renamed from: c, reason: collision with root package name */
    public Object f33c;

    public static boolean l(RF rf) {
        return rf.f11402r != 0;
    }

    public int a() {
        return l((RF) this.f33c) ? 1 : 0;
    }

    public void b() {
        RF rf = (RF) this.f33c;
        if (l(rf)) {
            rf.i0();
        }
    }

    public void c() {
        RF rf = (RF) this.f33c;
        AbstractC1668us.a0(rf.f11402r == 0);
        rf.d();
        this.f32b = false;
    }

    public void d(long j5, long j6) {
        RF rf = (RF) this.f33c;
        if (l(rf)) {
            rf.o(j5, j6);
        }
    }

    public void e(C1407p[] c1407pArr, NG ng, long j5, long j6, C1603tG c1603tG) {
        ((RF) this.f33c).k(c1407pArr, ng, j5, j6, c1603tG);
    }

    public void f() {
        if (this.f32b) {
            RF rf = (RF) this.f33c;
            AbstractC1668us.a0(rf.f11402r == 0);
            C1667ur c1667ur = rf.f11392m;
            c1667ur.f15915m = null;
            c1667ur.f15914l = null;
            rf.e();
            this.f32b = false;
        }
    }

    public void g(Object obj) {
        RF rf = (RF) this.f33c;
        if (rf.f11390l == 2) {
            rf.c(1, obj);
        }
    }

    public boolean h(C1601tE c1601tE) {
        NG ng = c1601tE.f15653c[this.f31a];
        RF rf = (RF) this.f33c;
        boolean z3 = ng != rf.f11404s;
        return z3 || (!z3 && rf.m()) || rf.q() || rf.p();
    }

    public boolean i(C1601tE c1601tE) {
        NG ng = c1601tE.f15653c[this.f31a];
        RF rf = (RF) this.f33c;
        if (rf.f11404s == ng) {
            return ng == null || rf.m();
        }
        return false;
    }

    public boolean j() {
        return ((RF) this.f33c).m();
    }

    public boolean k(C1601tE c1601tE) {
        RF rf = null;
        if (c1601tE != null) {
            NG ng = c1601tE.f15653c[this.f31a];
            if (ng != null) {
                RF rf2 = (RF) this.f33c;
                if (rf2.f11404s == ng) {
                    rf = rf2;
                }
            }
        }
        return rf != null;
    }
}
