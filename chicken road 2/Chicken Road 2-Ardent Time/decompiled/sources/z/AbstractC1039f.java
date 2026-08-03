package z;

/* renamed from: z.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1039f {
    public static android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction a() {
        return android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static void b(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.graphics.Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static java.lang.CharSequence c(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static long d(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
    }

    public static boolean e(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
    }

    public static boolean f(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static void g(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, boolean z2) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z2);
    }

    public static void h(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.graphics.Rect rect) {
        accessibilityNodeInfo.setBoundsInWindow(rect);
    }

    public static void i(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, java.lang.CharSequence charSequence) {
        accessibilityNodeInfo.setContainerTitle(charSequence);
    }

    public static void j(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, long j2) {
        accessibilityNodeInfo.setMinDurationBetweenContentChanges(java.time.Duration.ofMillis(j2));
    }

    public static void k(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.view.View view, boolean z2) {
        accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z2);
    }

    public static void l(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, boolean z2) {
        accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z2);
    }
}
