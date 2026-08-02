package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;
import p000.C0617qg;
import p000.C0691sg;
import p000.ph0;
import p000.uh0;
import p000.xh0;
import p000.yh0;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements uh0 {

    /* JADX INFO: renamed from: j */
    public final xh0 f545j;

    /* JADX INFO: renamed from: k */
    public final C0617qg f546k;

    public ReflectiveGenericLifecycleObserver(xh0 xh0Var) {
        this.f545j = xh0Var;
        C0691sg c0691sg = C0691sg.f7112c;
        Class<?> cls = xh0Var.getClass();
        C0617qg c0617qg = (C0617qg) c0691sg.f7113a.get(cls);
        this.f546k = c0617qg == null ? c0691sg.m4520a(cls, null) : c0617qg;
    }

    @Override // p000.uh0
    /* JADX INFO: renamed from: d */
    public final void mo328d(yh0 yh0Var, ph0 ph0Var) {
        HashMap map = this.f546k.f6487a;
        List list = (List) map.get(ph0Var);
        xh0 xh0Var = this.f545j;
        C0617qg.m4096a(list, yh0Var, ph0Var, xh0Var);
        C0617qg.m4096a((List) map.get(ph0.ON_ANY), yh0Var, ph0Var, xh0Var);
    }
}
