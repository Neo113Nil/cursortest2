package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import sg.bigo.ads.L0.d;
import sg.bigo.ads.U.r;

/* loaded from: classes3.dex */
public class FixContentFrameLayout extends RoundedFrameLayout {
    public boolean m;

    public FixContentFrameLayout(Context context) {
        this(context, null);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        r rVar;
        if (!this.m) {
            super.onMeasure(i, i2);
            return;
        }
        int defaultSize = View.getDefaultSize(Integer.MIN_VALUE, i);
        int defaultSize2 = View.getDefaultSize(Integer.MIN_VALUE, i2);
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.f12407a <= 0 || dVar.b <= 0) {
                    rVar = new r(defaultSize, defaultSize2);
                } else {
                    dVar.setMargins(0, 0, 0, 0);
                    rVar = r.a(dVar.f12407a, dVar.b, defaultSize, defaultSize2);
                }
                i3 = Math.max(i3, rVar.f12567a);
                i4 = Math.max(i4, rVar.b);
                childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, rVar.f12567a), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, rVar.b), 1073741824));
            }
        }
        setMeasuredDimension(i3, i4);
    }

    public void setFixContent(boolean z) {
        if (z) {
            setPadding(0, 0, 0, 0);
        }
        if (z != this.m) {
            this.m = z;
            requestLayout();
        }
    }

    public FixContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new d();
    }

    public FixContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setFixContent(true);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d();
    }
}
