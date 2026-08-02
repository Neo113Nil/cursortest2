package o1;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import j1.AbstractC2017a;
import n1.AbstractC2176q;

/* renamed from: o1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2216c {

    /* renamed from: c, reason: collision with root package name */
    public static final C2216c f18607c;

    /* renamed from: d, reason: collision with root package name */
    public static final C2216c f18608d;

    /* renamed from: e, reason: collision with root package name */
    public static final C2216c f18609e;
    public static final C2216c f;

    /* renamed from: g, reason: collision with root package name */
    public static final C2216c f18610g;

    /* renamed from: h, reason: collision with root package name */
    public static final C2216c f18611h;
    public static final C2216c i;

    /* renamed from: j, reason: collision with root package name */
    public static final C2216c f18612j;

    /* renamed from: a, reason: collision with root package name */
    public final Object f18613a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18614b;

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0213, code lost:
    
        if ((r4 < 36 ? r4 * 100000 : android.os.Build.VERSION.SDK_INT_FULL) >= 3600001) goto L71;
     */
    static {
        boolean z3 = true;
        new C2216c(null, 1, null, null);
        new C2216c(null, 2, null, null);
        new C2216c(null, 4, null, null);
        new C2216c(null, 8, null, null);
        new C2216c(null, 16, null, null);
        new C2216c(null, 32, null, null);
        f18607c = new C2216c(null, 64, null, null);
        f18608d = new C2216c(null, 128, null, null);
        new C2216c(null, 256, null, h.class);
        new C2216c(null, 512, null, h.class);
        new C2216c(null, 1024, null, i.class);
        new C2216c(null, 2048, null, i.class);
        f18609e = new C2216c(null, 4096, null, null);
        f = new C2216c(null, 8192, null, null);
        new C2216c(null, 16384, null, null);
        new C2216c(null, 32768, null, null);
        new C2216c(null, 65536, null, null);
        new C2216c(null, 131072, null, m.class);
        new C2216c(null, 262144, null, null);
        new C2216c(null, 524288, null, null);
        new C2216c(null, 1048576, null, null);
        new C2216c(null, 2097152, null, n.class);
        new C2216c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null);
        new C2216c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, k.class);
        f18610g = new C2216c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null);
        f18611h = new C2216c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null);
        i = new C2216c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null);
        f18612j = new C2216c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null);
        int i5 = Build.VERSION.SDK_INT;
        new C2216c(i5 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null);
        new C2216c(i5 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null);
        new C2216c(i5 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null);
        new C2216c(i5 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null);
        new C2216c(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null);
        new C2216c(i5 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, l.class);
        new C2216c(i5 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, j.class);
        new C2216c(i5 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null);
        new C2216c(i5 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null);
        new C2216c(i5 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null);
        new C2216c(i5 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null);
        new C2216c(i5 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null);
        new C2216c(i5 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null);
        new C2216c(i5 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null);
        new C2216c(i5 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null);
        new C2216c(i5 >= 34 ? AbstractC2176q.a() : null, R.id.accessibilityActionScrollInDirection, null, null);
        int i6 = AbstractC2017a.f17483a;
        if (i5 >= 36) {
        }
        z3 = false;
        new C2216c(z3 ? AbstractC2217d.a() : null, R.id.ALT, null, null);
    }

    public C2216c(String str, int i5) {
        this(null, i5, str, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C2216c)) {
            return false;
        }
        Object obj2 = ((C2216c) obj).f18613a;
        Object obj3 = this.f18613a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f18613a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String c5 = C2218e.c(this.f18614b);
        if (c5.equals("ACTION_UNKNOWN")) {
            Object obj = this.f18613a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                c5 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(c5);
        return sb.toString();
    }

    public C2216c(Object obj, int i5, String str, Class cls) {
        this.f18614b = i5;
        if (obj == null) {
            this.f18613a = new AccessibilityNodeInfo.AccessibilityAction(i5, str);
        } else {
            this.f18613a = obj;
        }
    }
}
