package z;

/* renamed from: z.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1038e {
    public static z.C1040g a(boolean z2, int i2, int i3, int i4, int i5, boolean z3, java.lang.String str, java.lang.String str2) {
        new android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z2).setColumnIndex(i2).setRowIndex(i3).setColumnSpan(i4).setRowSpan(i5).setSelected(z3).setRowTitle(str).setColumnTitle(str2).build();
        return new z.C1040g();
    }

    public static z.C1041h b(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, int i2, int i3) {
        android.view.accessibility.AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i2, i3);
        if (child != null) {
            return new z.C1041h(child, 0);
        }
        return null;
    }

    public static java.lang.String c(java.lang.Object obj) {
        return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
    }

    public static java.lang.String d(java.lang.Object obj) {
        return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
    }

    public static android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo e(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtraRenderingInfo();
    }

    public static z.C1041h f(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, int i2) {
        android.view.accessibility.AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(i2);
        if (parent != null) {
            return new z.C1041h(parent, 0);
        }
        return null;
    }

    public static java.lang.String g(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean h(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static void i(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, boolean z2) {
        accessibilityNodeInfo.setTextSelectable(z2);
    }

    public static void j(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, java.lang.String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }
}
