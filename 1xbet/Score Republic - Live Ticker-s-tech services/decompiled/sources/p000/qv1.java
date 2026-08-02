package p000;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class qv1 extends pw1 {

    /* JADX INFO: renamed from: k */
    public final C0089c8 f6622k;

    /* JADX INFO: renamed from: l */
    public final C0089c8 f6623l;

    /* JADX INFO: renamed from: m */
    public long f6624m;

    public qv1(f02 f02Var) {
        super(f02Var);
        this.f6623l = new C0089c8(0);
        this.f6622k = new C0089c8(0);
    }

    /* JADX INFO: renamed from: B */
    public final void m4200B(String str, long j) {
        f02 f02Var = (f02) this.f7192j;
        if (str == null || str.length() == 0) {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5312a("Ad unit id must be a non-empty string");
        } else {
            a02 a02Var = f02Var.f2248p;
            f02.m1560m(a02Var);
            a02Var.m6J(new im1(this, str, j, 0));
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m4201C(String str, long j) {
        f02 f02Var = (f02) this.f7192j;
        if (str == null || str.length() == 0) {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5312a("Ad unit id must be a non-empty string");
        } else {
            a02 a02Var = f02Var.f2248p;
            f02.m1560m(a02Var);
            a02Var.m6J(new im1(this, str, j, 1));
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m4202D(long j) {
        l32 l32Var = ((f02) this.f7192j).f2253u;
        f02.m1559l(l32Var);
        f32 f32VarM3160E = l32Var.m3160E(false);
        C0089c8 c0089c8 = this.f6622k;
        for (String str : (C0941z7) c0089c8.keySet()) {
            m4204F(str, j - ((Long) c0089c8.get(str)).longValue(), f32VarM3160E);
        }
        if (!c0089c8.isEmpty()) {
            m4203E(j - this.f6624m, f32VarM3160E);
        }
        m4205G(j);
    }

    /* JADX INFO: renamed from: E */
    public final void m4203E(long j, f32 f32Var) {
        f02 f02Var = (f02) this.f7192j;
        if (f32Var == null) {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4608w.m5312a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            ky1 ky1Var2 = f02Var.f2247o;
            f02.m1560m(ky1Var2);
            ky1Var2.f4608w.m5313b(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            f72.m1696x0(f32Var, bundle, true);
            v22 v22Var = f02Var.f2254v;
            f02.m1559l(v22Var);
            v22Var.m5026H("am", "_xa", bundle);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m4204F(String str, long j, f32 f32Var) {
        f02 f02Var = (f02) this.f7192j;
        if (f32Var == null) {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4608w.m5312a("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                ky1 ky1Var2 = f02Var.f2247o;
                f02.m1560m(ky1Var2);
                ky1Var2.f4608w.m5313b(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            f72.m1696x0(f32Var, bundle, true);
            v22 v22Var = f02Var.f2254v;
            f02.m1559l(v22Var);
            v22Var.m5026H("am", "_xu", bundle);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m4205G(long j) {
        C0089c8 c0089c8 = this.f6622k;
        Iterator it = ((C0941z7) c0089c8.keySet()).iterator();
        while (it.hasNext()) {
            c0089c8.put((String) it.next(), Long.valueOf(j));
        }
        if (c0089c8.isEmpty()) {
            return;
        }
        this.f6624m = j;
    }
}
