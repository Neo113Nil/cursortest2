package F;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public abstract class f {
    public static h a(boolean z, int i2, int i3, int i6, int i7, boolean z5, String str, String str2) {
        new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z).setColumnIndex(i2).setRowIndex(i3).setColumnSpan(i6).setRowSpan(i7).setSelected(z5).setRowTitle(str).setColumnTitle(str2).build();
        return new h();
    }

    public static i b(AccessibilityNodeInfo accessibilityNodeInfo, int i2, int i3) {
        AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i2, i3);
        if (child != null) {
            return new i(child, 0);
        }
        return null;
    }

    public static String c(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
    }

    public static String d(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
    }

    public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtraRenderingInfo();
    }

    public static i f(AccessibilityNodeInfo accessibilityNodeInfo, int i2) {
        AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(i2);
        if (parent != null) {
            return new i(parent, 0);
        }
        return null;
    }

    public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setTextSelectable(z);
    }

    public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }
}
