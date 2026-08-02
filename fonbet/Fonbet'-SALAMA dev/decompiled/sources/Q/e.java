package Q;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public abstract class e {
    public static g a(boolean z4, int i7, int i8, int i9, int i10, boolean z7, String str, String str2) {
        new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z4).setColumnIndex(i7).setRowIndex(i8).setColumnSpan(i9).setRowSpan(i10).setSelected(z7).setRowTitle(str).setColumnTitle(str2).build();
        return new g();
    }

    public static h b(AccessibilityNodeInfo accessibilityNodeInfo, int i7, int i8) {
        AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i7, i8);
        if (child != null) {
            return new h(child, 0);
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

    public static h f(AccessibilityNodeInfo accessibilityNodeInfo, int i7) {
        AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(i7);
        if (parent != null) {
            return new h(parent, 0);
        }
        return null;
    }

    public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z4) {
        accessibilityNodeInfo.setTextSelectable(z4);
    }

    public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }
}
