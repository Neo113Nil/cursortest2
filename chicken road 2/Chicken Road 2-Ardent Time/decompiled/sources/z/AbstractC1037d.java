package z;

/* renamed from: z.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1037d {
    public static java.lang.Object a(int i2, float f2, float f3, float f4) {
        return new android.view.accessibility.AccessibilityNodeInfo.RangeInfo(i2, f2, f3, f4);
    }

    public static java.lang.CharSequence b(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void c(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, java.lang.CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
