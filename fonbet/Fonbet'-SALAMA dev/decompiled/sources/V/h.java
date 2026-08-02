package V;

import P.C0346b;
import P.U;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import androidx.drawerlayout.widget.DrawerLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class h extends C0346b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6627d;

    public /* synthetic */ h(int i7) {
        this.f6627d = i7;
    }

    @Override // P.C0346b
    public void b(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f6627d) {
            case 0:
                super.b(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            default:
                super.b(view, accessibilityEvent);
                break;
        }
    }

    @Override // P.C0346b
    public final void c(View view, Q.h hVar) {
        int scrollRange;
        View.AccessibilityDelegate accessibilityDelegate = this.f5047a;
        switch (this.f6627d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = hVar.f5735a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityNodeInfo.setClassName(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    accessibilityNodeInfo.setScrollable(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) Q.c.f5729f.f5732a);
                        accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) Q.c.f5730g.f5732a);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) Q.c.f5728e.f5732a);
                        accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) Q.c.f5731h.f5732a);
                        break;
                    }
                }
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = hVar.f5735a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                int[] iArr = DrawerLayout.f9269R;
                WeakHashMap weakHashMap = U.f5037a;
                if (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) {
                    accessibilityNodeInfo2.setParent(null);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if (r6 != 16908346) goto L11;
     */
    @Override // P.C0346b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean e(View view, int i7, Bundle bundle) {
        switch (this.f6627d) {
            case 0:
                if (super.e(view, i7, bundle)) {
                    return true;
                }
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                if (nestedScrollView.isEnabled()) {
                    int height = nestedScrollView.getHeight();
                    Rect rect = new Rect();
                    if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                        height = rect.height();
                    }
                    if (i7 != 4096) {
                        if (i7 != 8192 && i7 != 16908344) {
                            break;
                        } else {
                            int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                            if (max != nestedScrollView.getScrollY()) {
                                nestedScrollView.p(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                                return true;
                            }
                        }
                    }
                    int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                    if (min != nestedScrollView.getScrollY()) {
                        nestedScrollView.p(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
                        return true;
                    }
                }
                return false;
            default:
                return super.e(view, i7, bundle);
        }
    }
}
