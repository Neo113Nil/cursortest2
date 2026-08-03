package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class AlertDialogLayout extends h.AbstractC0135D {
    public AlertDialogLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public static int h(android.view.View view) {
        java.lang.reflect.Field field = y.x.f8478a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return h(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    @Override // h.AbstractC0135D, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int paddingLeft = getPaddingLeft();
        int i9 = i4 - i2;
        int paddingRight = i9 - getPaddingRight();
        int paddingRight2 = (i9 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i10 = gravity & 112;
        int i11 = gravity & 8388615;
        int paddingTop = i10 != 16 ? i10 != 80 ? getPaddingTop() : ((getPaddingTop() + i5) - i3) - measuredHeight : (((i5 - i3) - measuredHeight) / 2) + getPaddingTop();
        android.graphics.drawable.Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i12 = 0; i12 < childCount; i12++) {
            android.view.View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                h.C0134C c0134c = (h.C0134C) childAt.getLayoutParams();
                int i13 = c0134c.f3043b;
                if (i13 < 0) {
                    i13 = i11;
                }
                java.lang.reflect.Field field = y.x.f8478a;
                int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i13, getLayoutDirection()) & 7;
                if (absoluteGravity == 1) {
                    i6 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((android.view.ViewGroup.MarginLayoutParams) c0134c).leftMargin;
                    i7 = ((android.view.ViewGroup.MarginLayoutParams) c0134c).rightMargin;
                } else if (absoluteGravity != 5) {
                    i8 = ((android.view.ViewGroup.MarginLayoutParams) c0134c).leftMargin + paddingLeft;
                    if (g(i12)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i14 = paddingTop + ((android.view.ViewGroup.MarginLayoutParams) c0134c).topMargin;
                    childAt.layout(i8, i14, measuredWidth + i8, i14 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((android.view.ViewGroup.MarginLayoutParams) c0134c).bottomMargin + i14;
                } else {
                    i6 = paddingRight - measuredWidth;
                    i7 = ((android.view.ViewGroup.MarginLayoutParams) c0134c).rightMargin;
                }
                i8 = i6 - i7;
                if (g(i12)) {
                }
                int i142 = paddingTop + ((android.view.ViewGroup.MarginLayoutParams) c0134c).topMargin;
                childAt.layout(i8, i142, measuredWidth + i8, i142 + measuredHeight2);
                paddingTop = measuredHeight2 + ((android.view.ViewGroup.MarginLayoutParams) c0134c).bottomMargin + i142;
            }
        }
    }

    @Override // h.AbstractC0135D, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int childCount = getChildCount();
        android.view.View view = null;
        android.view.View view2 = null;
        android.view.View view3 = null;
        for (int i8 = 0; i8 < childCount; i8++) {
            android.view.View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == com.watchfacestudio.huasi_urx110.R.id.topPanel) {
                    view = childAt;
                } else if (id == com.watchfacestudio.huasi_urx110.R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id != com.watchfacestudio.huasi_urx110.R.id.contentPanel && id != com.watchfacestudio.huasi_urx110.R.id.customPanel) || view3 != null) {
                        super.onMeasure(i2, i3);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = android.view.View.MeasureSpec.getMode(i3);
        int size = android.view.View.MeasureSpec.getSize(i3);
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (view != null) {
            view.measure(i2, 0);
            paddingBottom += view.getMeasuredHeight();
            i4 = android.view.View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i4 = 0;
        }
        if (view2 != null) {
            view2.measure(i2, 0);
            i5 = h(view2);
            i6 = view2.getMeasuredHeight() - i5;
            paddingBottom += i5;
            i4 = android.view.View.combineMeasuredStates(i4, view2.getMeasuredState());
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (view3 != null) {
            view3.measure(i2, mode == 0 ? 0 : android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, size - paddingBottom), mode));
            i7 = view3.getMeasuredHeight();
            paddingBottom += i7;
            i4 = android.view.View.combineMeasuredStates(i4, view3.getMeasuredState());
        } else {
            i7 = 0;
        }
        int i9 = size - paddingBottom;
        if (view2 != null) {
            int i10 = paddingBottom - i5;
            int min = java.lang.Math.min(i9, i6);
            if (min > 0) {
                i9 -= min;
                i5 += min;
            }
            view2.measure(i2, android.view.View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
            paddingBottom = i10 + view2.getMeasuredHeight();
            i4 = android.view.View.combineMeasuredStates(i4, view2.getMeasuredState());
        }
        if (view3 != null && i9 > 0) {
            view3.measure(i2, android.view.View.MeasureSpec.makeMeasureSpec(i7 + i9, mode));
            paddingBottom = (paddingBottom - i7) + view3.getMeasuredHeight();
            i4 = android.view.View.combineMeasuredStates(i4, view3.getMeasuredState());
        }
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            android.view.View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8) {
                i11 = java.lang.Math.max(i11, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(android.view.View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + i11, i2, i4), android.view.View.resolveSizeAndState(paddingBottom, i3, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i13 = 0; i13 < childCount; i13++) {
                android.view.View childAt3 = getChildAt(i13);
                if (childAt3.getVisibility() != 8) {
                    h.C0134C c0134c = (h.C0134C) childAt3.getLayoutParams();
                    if (((android.view.ViewGroup.MarginLayoutParams) c0134c).width == -1) {
                        int i14 = ((android.view.ViewGroup.MarginLayoutParams) c0134c).height;
                        ((android.view.ViewGroup.MarginLayoutParams) c0134c).height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, makeMeasureSpec, 0, i3, 0);
                        ((android.view.ViewGroup.MarginLayoutParams) c0134c).height = i14;
                    }
                }
            }
        }
    }
}
