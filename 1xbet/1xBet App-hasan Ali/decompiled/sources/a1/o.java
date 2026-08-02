package a1;

import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedDispatcher;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public abstract class o {
    public static String a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static final void c(w wVar, I1.l lVar) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (!AbstractC2107A.A(lVar) || (findOnBackInvokedDispatcher = wVar.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, lVar);
    }

    public static final void d(w wVar, I1.l lVar) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (!AbstractC2107A.A(lVar) || (findOnBackInvokedDispatcher = wVar.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(lVar);
    }
}
