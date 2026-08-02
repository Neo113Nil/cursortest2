package com.google.android.material.bottomappbar;

import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import com.google.android.material.internal.m;
import com.haryanvi.netstream.R;

/* loaded from: classes4.dex */
public final class a implements Runnable {
    public final /* synthetic */ ActionMenuView a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ BottomAppBar d;

    public a(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.d = bottomAppBar;
        this.a = actionMenuView;
        this.b = i;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BottomAppBar bottomAppBar = this.d;
        bottomAppBar.getClass();
        ActionMenuView actionMenuView = this.a;
        int i = 0;
        if (this.b == 1 && this.c) {
            boolean a = m.a(bottomAppBar);
            int measuredWidth = a ? bottomAppBar.getMeasuredWidth() : 0;
            for (int i2 = 0; i2 < bottomAppBar.getChildCount(); i2++) {
                View childAt = bottomAppBar.getChildAt(i2);
                if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).gravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK) == 8388611) {
                    measuredWidth = a ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
                }
            }
            int right = a ? actionMenuView.getRight() : actionMenuView.getLeft();
            if (bottomAppBar.getNavigationIcon() == null) {
                int dimensionPixelOffset = bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
                if (!a) {
                    dimensionPixelOffset = -dimensionPixelOffset;
                }
                i = dimensionPixelOffset;
            }
            i = measuredWidth - (right + i);
        }
        actionMenuView.setTranslationX(i);
    }
}
