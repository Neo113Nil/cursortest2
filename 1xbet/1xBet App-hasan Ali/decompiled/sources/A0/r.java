package A0;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import n1.C2161b;
import o1.C2218e;
import z0.C2731G;

/* loaded from: classes.dex */
public final class r extends C2161b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F f552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2731G f553e;
    public final /* synthetic */ F f;

    public r(F f, C2731G c2731g, F f5) {
        this.f552d = f;
        this.f553e = c2731g;
        this.f = f5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r4.intValue() == r8.getSemanticsOwner().a().f2116g) goto L19;
     */
    @Override // n1.C2161b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(View view, C2218e c2218e) {
        View.AccessibilityDelegate accessibilityDelegate = this.f18414a;
        AccessibilityNodeInfo accessibilityNodeInfo = c2218e.f18616a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        F f = this.f552d;
        N n5 = f.f194C;
        if (n5.q()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        C2731G c2731g = this.f553e;
        C2731G u5 = c2731g.u();
        while (true) {
            if (u5 == null) {
                u5 = null;
                break;
            } else if (u5.f21612O.d(8)) {
                break;
            } else {
                u5 = u5.u();
            }
        }
        Integer valueOf = u5 != null ? Integer.valueOf(u5.f21625l) : null;
        if (valueOf != null) {
        }
        valueOf = -1;
        int intValue = valueOf.intValue();
        F f5 = this.f;
        c2218e.f18617b = intValue;
        accessibilityNodeInfo.setParent(f5, intValue);
        int i = c2731g.f21625l;
        int d5 = n5.f336E.d(i);
        if (d5 != -1) {
            Z0.j C5 = Z.C(f.getAndroidViewsHandler$ui_release(), d5);
            if (C5 != null) {
                accessibilityNodeInfo.setTraversalBefore(C5);
            } else {
                accessibilityNodeInfo.setTraversalBefore(f5, d5);
            }
            F.a(f, i, accessibilityNodeInfo, n5.f338G);
        }
        int d6 = n5.f337F.d(i);
        if (d6 != -1) {
            Z0.j C6 = Z.C(f.getAndroidViewsHandler$ui_release(), d6);
            if (C6 != null) {
                accessibilityNodeInfo.setTraversalAfter(C6);
            } else {
                accessibilityNodeInfo.setTraversalAfter(f5, d6);
            }
            F.a(f, i, accessibilityNodeInfo, n5.f339H);
        }
    }
}
