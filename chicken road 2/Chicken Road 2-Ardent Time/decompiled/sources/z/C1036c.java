package z;

/* renamed from: z.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1036c {

    /* renamed from: c, reason: collision with root package name */
    public static final z.C1036c f8510c;

    /* renamed from: d, reason: collision with root package name */
    public static final z.C1036c f8511d;

    /* renamed from: e, reason: collision with root package name */
    public static final z.C1036c f8512e;

    /* renamed from: f, reason: collision with root package name */
    public static final z.C1036c f8513f;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f8514a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8515b;

    static {
        new z.C1036c(null, 1, null);
        new z.C1036c(null, 2, null);
        new z.C1036c(null, 4, null);
        new z.C1036c(null, 8, null);
        new z.C1036c(null, 16, null);
        new z.C1036c(null, 32, null);
        new z.C1036c(null, 64, null);
        new z.C1036c(null, 128, null);
        new z.C1036c(null, 256, z.AbstractC1043j.class);
        new z.C1036c(null, 512, z.AbstractC1043j.class);
        new z.C1036c(null, 1024, z.AbstractC1044k.class);
        new z.C1036c(null, 2048, z.AbstractC1044k.class);
        f8510c = new z.C1036c(null, io.appmetrica.analytics.coreutils.internal.io.Base64Utils.IO_BUFFER_SIZE, null);
        f8511d = new z.C1036c(null, 8192, null);
        new z.C1036c(null, 16384, null);
        new z.C1036c(null, 32768, null);
        new z.C1036c(null, 65536, null);
        new z.C1036c(null, 131072, z.o.class);
        new z.C1036c(null, 262144, null);
        new z.C1036c(null, 524288, null);
        new z.C1036c(null, 1048576, null);
        new z.C1036c(null, 2097152, z.p.class);
        int i2 = android.os.Build.VERSION.SDK_INT;
        new z.C1036c(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, android.R.id.accessibilityActionShowOnScreen, null);
        new z.C1036c(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, android.R.id.accessibilityActionScrollToPosition, z.AbstractC1046m.class);
        f8512e = new z.C1036c(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, android.R.id.accessibilityActionScrollUp, null);
        new z.C1036c(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, android.R.id.accessibilityActionScrollLeft, null);
        f8513f = new z.C1036c(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, android.R.id.accessibilityActionScrollDown, null);
        new z.C1036c(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, android.R.id.accessibilityActionScrollRight, null);
        new z.C1036c(i2 >= 29 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, android.R.id.accessibilityActionPageUp, null);
        new z.C1036c(i2 >= 29 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, android.R.id.accessibilityActionPageDown, null);
        new z.C1036c(i2 >= 29 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, android.R.id.accessibilityActionPageLeft, null);
        new z.C1036c(i2 >= 29 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, android.R.id.accessibilityActionPageRight, null);
        new z.C1036c(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, android.R.id.accessibilityActionContextClick, null);
        new z.C1036c(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, android.R.id.accessibilityActionSetProgress, z.n.class);
        new z.C1036c(i2 >= 26 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, android.R.id.accessibilityActionMoveWindow, z.AbstractC1045l.class);
        new z.C1036c(i2 >= 28 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, android.R.id.accessibilityActionShowTooltip, null);
        new z.C1036c(i2 >= 28 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, android.R.id.accessibilityActionHideTooltip, null);
        new z.C1036c(i2 >= 30 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, android.R.id.accessibilityActionPressAndHold, null);
        new z.C1036c(i2 >= 30 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, android.R.id.accessibilityActionImeEnter, null);
        new z.C1036c(i2 >= 32 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, android.R.id.accessibilityActionDragStart, null);
        new z.C1036c(i2 >= 32 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, android.R.id.accessibilityActionDragDrop, null);
        new z.C1036c(i2 >= 32 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, android.R.id.accessibilityActionDragCancel, null);
        new z.C1036c(i2 >= 33 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, android.R.id.accessibilityActionShowTextSuggestions, null);
        new z.C1036c(i2 >= 34 ? z.AbstractC1039f.a() : null, android.R.id.accessibilityActionScrollInDirection, null);
    }

    public C1036c(java.lang.Object obj, int i2, java.lang.Class cls) {
        this.f8515b = i2;
        if (obj == null) {
            this.f8514a = new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(i2, null);
        } else {
            this.f8514a = obj;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof z.C1036c)) {
            return false;
        }
        java.lang.Object obj2 = ((z.C1036c) obj).f8514a;
        java.lang.Object obj3 = this.f8514a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        java.lang.Object obj = this.f8514a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AccessibilityActionCompat: ");
        java.lang.String b2 = z.C1041h.b(this.f8515b);
        if (b2.equals("ACTION_UNKNOWN")) {
            java.lang.Object obj = this.f8514a;
            if (((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                b2 = ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(b2);
        return sb.toString();
    }
}
