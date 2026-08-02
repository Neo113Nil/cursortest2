package p000;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class sv1 implements w22 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mw1 f7221a;

    public sv1(mw1 mw1Var) {
        this.f7221a = mw1Var;
    }

    @Override // p000.w22
    /* JADX INFO: renamed from: c */
    public final long mo2296c() {
        return this.f7221a.m3437f();
    }

    @Override // p000.w22
    /* JADX INFO: renamed from: d */
    public final String mo2297d() {
        bv1 bv1Var = new bv1();
        mw1 mw1Var = this.f7221a;
        mw1Var.m3434b(new ew1(mw1Var, bv1Var, 3, false));
        return (String) bv1.m783d(bv1Var.m784c(500L), String.class);
    }

    @Override // p000.w22
    /* JADX INFO: renamed from: e */
    public final void mo2298e(String str, String str2, Bundle bundle) {
        mw1 mw1Var = this.f7221a;
        mw1Var.m3434b(new yv1(mw1Var, str, str2, bundle, true));
    }

    @Override // p000.w22
    /* JADX INFO: renamed from: f */
    public final void mo2299f(String str, String str2, Bundle bundle) {
        mw1 mw1Var = this.f7221a;
        mw1Var.m3434b(new aw1(mw1Var, str, str2, bundle));
    }

    @Override // p000.w22
    /* JADX INFO: renamed from: g */
    public final String mo2300g() {
        bv1 bv1Var = new bv1();
        mw1 mw1Var = this.f7221a;
        mw1Var.m3434b(new ew1(mw1Var, bv1Var, 4, false));
        return (String) bv1.m783d(bv1Var.m784c(500L), String.class);
    }

    @Override // p000.w22
    /* JADX INFO: renamed from: h */
    public final List mo2301h(String str, String str2) {
        return this.f7221a.m3436e(str, str2);
    }

    @Override // p000.w22
    /* JADX INFO: renamed from: i */
    public final void mo2302i(Bundle bundle) {
        mw1 mw1Var = this.f7221a;
        mw1Var.m3434b(new zv1(mw1Var, bundle));
    }

    @Override // p000.w22
    /* JADX INFO: renamed from: j */
    public final int mo2303j(String str) {
        return this.f7221a.m3433a(str);
    }

    @Override // p000.w22
    /* JADX INFO: renamed from: k */
    public final String mo2304k() {
        bv1 bv1Var = new bv1();
        mw1 mw1Var = this.f7221a;
        mw1Var.m3434b(new ew1(mw1Var, bv1Var, 1));
        return (String) bv1.m783d(bv1Var.m784c(50L), String.class);
    }

    @Override // p000.w22
    /* JADX INFO: renamed from: l */
    public final void mo2305l(String str) {
        mw1 mw1Var = this.f7221a;
        mw1Var.m3434b(new cw1(mw1Var, str, 1));
    }

    @Override // p000.w22
    /* JADX INFO: renamed from: m */
    public final String mo2306m() {
        bv1 bv1Var = new bv1();
        mw1 mw1Var = this.f7221a;
        mw1Var.m3434b(new ew1(mw1Var, bv1Var, 0));
        return (String) bv1.m783d(bv1Var.m784c(500L), String.class);
    }

    @Override // p000.w22
    /* JADX INFO: renamed from: n */
    public final Map mo2307n(String str, String str2, boolean z) {
        bv1 bv1Var = new bv1();
        mw1 mw1Var = this.f7221a;
        mw1Var.m3434b(new yv1(mw1Var, str, str2, z, bv1Var));
        Bundle bundleM784c = bv1Var.m784c(5000L);
        if (bundleM784c == null || bundleM784c.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleM784c.size());
        for (String str3 : bundleM784c.keySet()) {
            Object obj = bundleM784c.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    @Override // p000.w22
    /* JADX INFO: renamed from: o */
    public final void mo2308o(String str) {
        mw1 mw1Var = this.f7221a;
        mw1Var.m3434b(new cw1(mw1Var, str, 0));
    }
}
