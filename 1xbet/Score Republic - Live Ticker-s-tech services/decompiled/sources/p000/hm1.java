package p000;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class hm1 extends tu1 {

    /* JADX INFO: renamed from: a */
    public final f02 f3258a;

    /* JADX INFO: renamed from: b */
    public final v22 f3259b;

    public hm1(f02 f02Var) {
        p80.m3863h(f02Var);
        this.f3258a = f02Var;
        v22 v22Var = f02Var.f2254v;
        f02.m1559l(v22Var);
        this.f3259b = v22Var;
    }

    @Override // p000.w22
    /* JADX INFO: renamed from: c */
    public final long mo2296c() {
        f72 f72Var = this.f3258a.f2250r;
        f02.m1558k(f72Var);
        return f72Var.m1741z0();
    }

    @Override // p000.w22
    /* JADX INFO: renamed from: d */
    public final String mo2297d() {
        l32 l32Var = ((f02) this.f3259b.f7192j).f2253u;
        f02.m1559l(l32Var);
        f32 f32Var = l32Var.f4658l;
        if (f32Var != null) {
            return f32Var.f2295a;
        }
        return null;
    }

    @Override // p000.w22
    /* JADX INFO: renamed from: e */
    public final void mo2298e(String str, String str2, Bundle bundle) {
        this.f3259b.m5023E(str, str2, bundle);
    }

    @Override // p000.w22
    /* JADX INFO: renamed from: f */
    public final void mo2299f(String str, String str2, Bundle bundle) {
        v22 v22Var = this.f3258a.f2254v;
        f02.m1559l(v22Var);
        v22Var.m5033O(str, str2, bundle);
    }

    @Override // p000.w22
    /* JADX INFO: renamed from: g */
    public final String mo2300g() {
        l32 l32Var = ((f02) this.f3259b.f7192j).f2253u;
        f02.m1559l(l32Var);
        f32 f32Var = l32Var.f4658l;
        if (f32Var != null) {
            return f32Var.f2296b;
        }
        return null;
    }

    @Override // p000.w22
    /* JADX INFO: renamed from: h */
    public final List mo2301h(String str, String str2) {
        v22 v22Var = this.f3259b;
        f02 f02Var = (f02) v22Var.f7192j;
        a02 a02Var = f02Var.f2248p;
        ky1 ky1Var = f02Var.f2247o;
        f02.m1560m(a02Var);
        if (a02Var.m3G()) {
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5312a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (u90.m4898g()) {
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5312a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        a02 a02Var2 = f02Var.f2248p;
        f02.m1560m(a02Var2);
        a02Var2.m7K(atomicReference, 5000L, "get conditional user properties", new RunnableC0452m(v22Var, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return f72.m1694v0(list);
        }
        f02.m1560m(ky1Var);
        ky1Var.f4600o.m5313b(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // p000.w22
    /* JADX INFO: renamed from: i */
    public final void mo2302i(Bundle bundle) {
        v22 v22Var = this.f3259b;
        ((f02) v22Var.f7192j).f2252t.getClass();
        v22Var.m5032N(bundle, System.currentTimeMillis());
    }

    @Override // p000.w22
    /* JADX INFO: renamed from: j */
    public final int mo2303j(String str) {
        v22 v22Var = this.f3259b;
        v22Var.getClass();
        p80.m3860e(str);
        ((f02) v22Var.f7192j).getClass();
        return 25;
    }

    @Override // p000.w22
    /* JADX INFO: renamed from: k */
    public final String mo2304k() {
        return (String) this.f3259b.f8014p.get();
    }

    @Override // p000.w22
    /* JADX INFO: renamed from: l */
    public final void mo2305l(String str) {
        f02 f02Var = this.f3258a;
        qv1 qv1Var = f02Var.f2255w;
        f02.m1557j(qv1Var);
        f02Var.f2252t.getClass();
        qv1Var.m4201C(str, SystemClock.elapsedRealtime());
    }

    @Override // p000.w22
    /* JADX INFO: renamed from: m */
    public final String mo2306m() {
        return this.f3259b.m5034P();
    }

    @Override // p000.w22
    /* JADX INFO: renamed from: n */
    public final Map mo2307n(String str, String str2, boolean z) {
        v22 v22Var = this.f3259b;
        f02 f02Var = (f02) v22Var.f7192j;
        a02 a02Var = f02Var.f2248p;
        ky1 ky1Var = f02Var.f2247o;
        f02.m1560m(a02Var);
        if (a02Var.m3G()) {
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5312a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (u90.m4898g()) {
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5312a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        a02 a02Var2 = f02Var.f2248p;
        f02.m1560m(a02Var2);
        a02Var2.m7K(atomicReference, 5000L, "get user properties", new z12(v22Var, atomicReference, str, str2, z));
        List<b72> list = (List) atomicReference.get();
        if (list == null) {
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5313b(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        C0089c8 c0089c8 = new C0089c8(list.size());
        for (b72 b72Var : list) {
            Object objM600b = b72Var.m600b();
            if (objM600b != null) {
                c0089c8.put(b72Var.f749k, objM600b);
            }
        }
        return c0089c8;
    }

    @Override // p000.w22
    /* JADX INFO: renamed from: o */
    public final void mo2308o(String str) {
        f02 f02Var = this.f3258a;
        qv1 qv1Var = f02Var.f2255w;
        f02.m1557j(qv1Var);
        f02Var.f2252t.getClass();
        qv1Var.m4200B(str, SystemClock.elapsedRealtime());
    }
}
