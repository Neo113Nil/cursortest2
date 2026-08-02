package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes4.dex */
public final class b extends AccessibilityDelegateCompat {
    public final /* synthetic */ AppBarLayout a;
    public final /* synthetic */ CoordinatorLayout b;
    public final /* synthetic */ AppBarLayout.BaseBehavior c;

    public b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.c = baseBehavior;
        this.a = appBarLayout;
        this.b = coordinatorLayout;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.a;
        if (appBarLayout.f() == 0) {
            return;
        }
        CoordinatorLayout coordinatorLayout = this.b;
        AppBarLayout.BaseBehavior baseBehavior = this.c;
        View j = AppBarLayout.BaseBehavior.j(baseBehavior, coordinatorLayout);
        if (j == null) {
            return;
        }
        baseBehavior.getClass();
        int childCount = appBarLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((AppBarLayout.c) appBarLayout.getChildAt(i).getLayoutParams()).a != 0) {
                if (baseBehavior.b() != (-appBarLayout.f())) {
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    accessibilityNodeInfoCompat.setScrollable(true);
                }
                if (baseBehavior.b() != 0) {
                    if (!j.canScrollVertically(-1)) {
                        accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                        accessibilityNodeInfoCompat.setScrollable(true);
                        return;
                    } else {
                        if ((-appBarLayout.c()) != 0) {
                            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                            accessibilityNodeInfoCompat.setScrollable(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        AppBarLayout appBarLayout = this.a;
        if (i == 4096) {
            appBarLayout.getClass();
            appBarLayout.e = (ViewCompat.isLaidOut(appBarLayout) ? 4 : 0) | 10;
            appBarLayout.requestLayout();
            return true;
        }
        if (i != 8192) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.c;
        if (baseBehavior.b() != 0) {
            CoordinatorLayout coordinatorLayout = this.b;
            if (!AppBarLayout.BaseBehavior.j(baseBehavior, coordinatorLayout).canScrollVertically(-1)) {
                appBarLayout.getClass();
                appBarLayout.e = (ViewCompat.isLaidOut(appBarLayout) ? 4 : 0) | 9;
                appBarLayout.requestLayout();
                return true;
            }
            int i2 = -appBarLayout.c();
            if (i2 != 0) {
                baseBehavior.l(coordinatorLayout, appBarLayout, i2, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
