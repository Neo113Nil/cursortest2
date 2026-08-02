package I0;

import P.C0346b;
import P.U;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class d extends C0346b {

    /* renamed from: d, reason: collision with root package name */
    public final Rect f3495d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SlidingPaneLayout f3496e;

    public d(SlidingPaneLayout slidingPaneLayout) {
        this.f3496e = slidingPaneLayout;
    }

    @Override // P.C0346b
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
    }

    @Override // P.C0346b
    public final void c(View view, Q.h hVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f5735a;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
        this.f5047a.onInitializeAccessibilityNodeInfo(view, obtain);
        Rect rect = this.f3495d;
        obtain.getBoundsInScreen(rect);
        accessibilityNodeInfo.setBoundsInScreen(rect);
        accessibilityNodeInfo.setVisibleToUser(obtain.isVisibleToUser());
        accessibilityNodeInfo.setPackageName(obtain.getPackageName());
        accessibilityNodeInfo.setClassName(obtain.getClassName());
        accessibilityNodeInfo.setContentDescription(obtain.getContentDescription());
        accessibilityNodeInfo.setEnabled(obtain.isEnabled());
        accessibilityNodeInfo.setClickable(obtain.isClickable());
        accessibilityNodeInfo.setFocusable(obtain.isFocusable());
        accessibilityNodeInfo.setFocused(obtain.isFocused());
        accessibilityNodeInfo.setAccessibilityFocused(obtain.isAccessibilityFocused());
        accessibilityNodeInfo.setSelected(obtain.isSelected());
        accessibilityNodeInfo.setLongClickable(obtain.isLongClickable());
        accessibilityNodeInfo.addAction(obtain.getActions());
        accessibilityNodeInfo.setMovementGranularities(obtain.getMovementGranularities());
        accessibilityNodeInfo.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
        accessibilityNodeInfo.setSource(view);
        WeakHashMap weakHashMap = U.f5037a;
        Object parentForAccessibility = view.getParentForAccessibility();
        if (parentForAccessibility instanceof View) {
            accessibilityNodeInfo.setParent((View) parentForAccessibility);
        }
        SlidingPaneLayout slidingPaneLayout = this.f3496e;
        int childCount = slidingPaneLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = slidingPaneLayout.getChildAt(i7);
            if (!slidingPaneLayout.a(childAt) && childAt.getVisibility() == 0) {
                childAt.setImportantForAccessibility(1);
                accessibilityNodeInfo.addChild(childAt);
            }
        }
    }

    @Override // P.C0346b
    public final boolean d(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (this.f3496e.a(view)) {
            return false;
        }
        return this.f5047a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
