package n1;

import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;

/* renamed from: n1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2176q {
    public static AccessibilityNodeInfo.AccessibilityAction a() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float b(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    public static void c(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int e(ViewConfiguration viewConfiguration, int i, int i5, int i6) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i5, i6);
    }

    public static int f(ViewConfiguration viewConfiguration, int i, int i5, int i6) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i5, i6);
    }

    public static boolean g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static boolean h(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    public static void i(AccessibilityEvent accessibilityEvent, boolean z3) {
        accessibilityEvent.setAccessibilityDataSensitive(z3);
    }

    public static void j(AccessibilityNodeInfo accessibilityNodeInfo, boolean z3) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z3);
    }

    public static void k(TextView textView, int i, float f) {
        textView.setLineHeight(i, f);
    }
}
