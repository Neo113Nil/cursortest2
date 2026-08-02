package p000;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: l1 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0417l1 {

    /* JADX INFO: renamed from: c */
    public static final C0417l1 f4623c;

    /* JADX INFO: renamed from: d */
    public static final C0417l1 f4624d;

    /* JADX INFO: renamed from: e */
    public static final C0417l1 f4625e;

    /* JADX INFO: renamed from: f */
    public static final C0417l1 f4626f;

    /* JADX INFO: renamed from: a */
    public final Object f4627a;

    /* JADX INFO: renamed from: b */
    public final int f4628b;

    static {
        new C0417l1(null, 1, null);
        new C0417l1(null, 2, null);
        new C0417l1(null, 4, null);
        new C0417l1(null, 8, null);
        new C0417l1(null, 16, null);
        new C0417l1(null, 32, null);
        new C0417l1(null, 64, null);
        new C0417l1(null, 128, null);
        new C0417l1(null, 256, AbstractC0676s1.class);
        new C0417l1(null, 512, AbstractC0676s1.class);
        new C0417l1(null, 1024, AbstractC0713t1.class);
        new C0417l1(null, 2048, AbstractC0713t1.class);
        f4623c = new C0417l1(null, 4096, null);
        f4624d = new C0417l1(null, 8192, null);
        new C0417l1(null, 16384, null);
        new C0417l1(null, 32768, null);
        new C0417l1(null, 65536, null);
        new C0417l1(null, 131072, AbstractC0861x1.class);
        new C0417l1(null, 262144, null);
        new C0417l1(null, 524288, null);
        new C0417l1(null, 1048576, null);
        new C0417l1(null, 2097152, AbstractC0898y1.class);
        new C0417l1(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null);
        new C0417l1(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, AbstractC0787v1.class);
        f4625e = new C0417l1(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null);
        new C0417l1(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null);
        f4626f = new C0417l1(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null);
        new C0417l1(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null);
        new C0417l1(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, R.id.accessibilityActionPageUp, null);
        new C0417l1(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, R.id.accessibilityActionPageDown, null);
        new C0417l1(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, R.id.accessibilityActionPageLeft, null);
        new C0417l1(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, R.id.accessibilityActionPageRight, null);
        new C0417l1(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null);
        new C0417l1(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, AbstractC0824w1.class);
        new C0417l1(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, AbstractC0750u1.class);
        new C0417l1(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null);
        new C0417l1(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null);
        int i = Build.VERSION.SDK_INT;
        new C0417l1(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null);
        new C0417l1(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null);
        new C0417l1(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null);
        new C0417l1(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null);
        new C0417l1(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null);
        new C0417l1(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null);
        new C0417l1(i >= 34 ? AbstractC0528o1.m3613b() : null, R.id.accessibilityActionScrollInDirection, null);
        int i2 = AbstractC0872xc.f8882a;
        new C0417l1((i < 36 || AbstractC0835wc.m5311a() < 3600001) ? null : AbstractC0602q1.m4024a(), R.id.ALT, null);
    }

    public C0417l1(Object obj, int i, Class cls) {
        this.f4628b = i;
        if (obj == null) {
            this.f4627a = new AccessibilityNodeInfo.AccessibilityAction(i, null);
        } else {
            this.f4627a = obj;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0417l1)) {
            return false;
        }
        Object obj2 = ((C0417l1) obj).f4627a;
        Object obj3 = this.f4627a;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f4627a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strM4231b = C0639r1.m4231b(this.f4628b);
        if (strM4231b.equals("ACTION_UNKNOWN")) {
            Object obj = this.f4627a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strM4231b = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strM4231b);
        return sb.toString();
    }
}
