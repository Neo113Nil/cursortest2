package C;

/* loaded from: classes.dex */
public final class h extends y.C1014b {
    @Override // y.C1014b
    public final void a(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) view;
        accessibilityEvent.setClassName(android.widget.ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
    }

    @Override // y.C1014b
    public final void b(android.view.View view, z.C1041h c1041h) {
        int scrollRange;
        android.view.View.AccessibilityDelegate accessibilityDelegate = this.f8454a;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = c1041h.f8517a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) view;
        accessibilityNodeInfo.setClassName("android.widget.ScrollView");
        if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
            return;
        }
        accessibilityNodeInfo.setScrollable(true);
        if (nestedScrollView.getScrollY() > 0) {
            accessibilityNodeInfo.addAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) z.C1036c.f8511d.f8514a);
            accessibilityNodeInfo.addAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) z.C1036c.f8512e.f8514a);
        }
        if (nestedScrollView.getScrollY() < scrollRange) {
            accessibilityNodeInfo.addAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) z.C1036c.f8510c.f8514a);
            accessibilityNodeInfo.addAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) z.C1036c.f8513f.f8514a);
        }
    }

    @Override // y.C1014b
    public final boolean c(android.view.View view, int i2, android.os.Bundle bundle) {
        if (super.c(view, i2, bundle)) {
            return true;
        }
        androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        int height = nestedScrollView.getHeight();
        android.graphics.Rect rect = new android.graphics.Rect();
        if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
            height = rect.height();
        }
        if (i2 != 4096) {
            if (i2 == 8192 || i2 == 16908344) {
                int max = java.lang.Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.t(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                return true;
            }
            if (i2 != 16908346) {
                return false;
            }
        }
        int min = java.lang.Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
        if (min == nestedScrollView.getScrollY()) {
            return false;
        }
        nestedScrollView.t(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
        return true;
    }
}
