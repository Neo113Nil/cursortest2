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

/* JADX INFO: loaded from: classes.dex */
public final class d extends C0346b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f3495d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
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
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
        this.f5047a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoObtain);
        Rect rect = this.f3495d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect);
        accessibilityNodeInfo.setBoundsInScreen(rect);
        accessibilityNodeInfo.setVisibleToUser(accessibilityNodeInfoObtain.isVisibleToUser());
        accessibilityNodeInfo.setPackageName(accessibilityNodeInfoObtain.getPackageName());
        accessibilityNodeInfo.setClassName(accessibilityNodeInfoObtain.getClassName());
        accessibilityNodeInfo.setContentDescription(accessibilityNodeInfoObtain.getContentDescription());
        accessibilityNodeInfo.setEnabled(accessibilityNodeInfoObtain.isEnabled());
        accessibilityNodeInfo.setClickable(accessibilityNodeInfoObtain.isClickable());
        accessibilityNodeInfo.setFocusable(accessibilityNodeInfoObtain.isFocusable());
        accessibilityNodeInfo.setFocused(accessibilityNodeInfoObtain.isFocused());
        accessibilityNodeInfo.setAccessibilityFocused(accessibilityNodeInfoObtain.isAccessibilityFocused());
        accessibilityNodeInfo.setSelected(accessibilityNodeInfoObtain.isSelected());
        accessibilityNodeInfo.setLongClickable(accessibilityNodeInfoObtain.isLongClickable());
        accessibilityNodeInfo.addAction(accessibilityNodeInfoObtain.getActions());
        accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities());
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
