package o1;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import k0.C2023c;

/* loaded from: classes.dex */
public class f extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final C2023c f18619a;

    public f(C2023c c2023c) {
        this.f18619a = c2023c;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        C2218e s2 = this.f18619a.s(i);
        if (s2 == null) {
            return null;
        }
        return s2.f18616a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f18619a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        C2218e t5 = this.f18619a.t(i);
        if (t5 == null) {
            return null;
        }
        return t5.f18616a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i5, Bundle bundle) {
        return this.f18619a.x(i, i5, bundle);
    }
}
