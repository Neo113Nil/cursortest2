package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.Hashtable;
import sg.bigo.ads.L0.C4983c;

/* loaded from: classes3.dex */
public class AutoNextLineLinearLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public int f12707a;
    public int b;
    public int c;
    public int d;
    public final Hashtable e;

    public AutoNextLineLinearLayout(Context context) {
        super(context);
        this.e = new Hashtable();
    }

    public final int a(int i, int i2) {
        if (i <= 0) {
            return getPaddingLeft();
        }
        int i3 = i2 - 1;
        return getChildAt(i3).getMeasuredWidth() + a(i - 1, i3) + 30;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LinearLayout.LayoutParams(0, 0);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C4983c c4983c = (C4983c) this.e.get(childAt);
            if (c4983c != null) {
                childAt.layout(c4983c.f12406a, c4983c.b, c4983c.c, c4983c.d);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        this.f12707a = 0;
        this.b = 0;
        this.c = 5;
        this.d = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            childAt.measure(0, 0);
            int measuredWidth = childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int measuredHeight = childAt.getMeasuredHeight();
            i3 += measuredWidth;
            C4983c c4983c = new C4983c();
            int a2 = a(i6 - i4, i6);
            this.f12707a = a2;
            this.b = childAt.getMeasuredWidth() + a2;
            if (i3 >= size) {
                this.f12707a = 0;
                this.b = childAt.getMeasuredWidth();
                this.c = i5 + measuredHeight + layoutParams.topMargin;
                i4 = i6;
                i3 = measuredWidth;
            }
            int measuredHeight2 = childAt.getMeasuredHeight() + this.c + layoutParams.bottomMargin;
            this.d = measuredHeight2;
            i5 = this.c;
            c4983c.f12406a = this.f12707a;
            c4983c.b = i5 + 3;
            c4983c.c = this.b;
            c4983c.d = measuredHeight2;
            this.e.put(childAt, c4983c);
        }
        setMeasuredDimension(size, this.d);
    }

    public AutoNextLineLinearLayout(Context context, int i, int i2) {
        super(context);
        this.e = new Hashtable();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new LinearLayout.LayoutParams(0, 0);
    }

    public AutoNextLineLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new Hashtable();
    }
}
