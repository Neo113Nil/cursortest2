package androidx.appcompat.widget;

/* loaded from: classes5.dex */
public class AlertDialogLayout extends androidx.appcompat.widget.LinearLayoutCompat {
    public AlertDialogLayout(android.content.Context context) {
        super(context);
    }

    public AlertDialogLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop;
        int i5;
        int i6;
        int i7;
        int paddingLeft = getPaddingLeft();
        int i8 = i3 - i;
        int paddingRight = getPaddingRight();
        int paddingRight2 = getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i9 = gravity & 112;
        if (i9 == 16) {
            paddingTop = getPaddingTop() + (((i4 - i2) - measuredHeight) / 2);
        } else if (i9 == 80) {
            paddingTop = ((getPaddingTop() + i4) - i2) - measuredHeight;
        } else {
            paddingTop = getPaddingTop();
        }
        android.graphics.drawable.Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i10 = 0; i10 < childCount; i10++) {
            android.view.View childAt = getChildAt(i10);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                androidx.appcompat.widget.LinearLayoutCompat.LayoutParams layoutParams = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) childAt.getLayoutParams();
                int i11 = layoutParams.gravity;
                if (i11 < 0) {
                    i11 = 8388615 & gravity;
                }
                int absoluteGravity = androidx.core.view.GravityCompat.getAbsoluteGravity(i11, getLayoutDirection()) & 7;
                if (absoluteGravity == 1) {
                    i5 = ((((i8 - paddingLeft) - paddingRight2) - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                    i6 = layoutParams.rightMargin;
                } else if (absoluteGravity == 5) {
                    i5 = (i8 - paddingRight) - measuredWidth;
                    i6 = layoutParams.rightMargin;
                } else {
                    i7 = layoutParams.leftMargin + paddingLeft;
                    if (hasDividerBeforeChildAt(i10)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i12 = paddingTop + layoutParams.topMargin;
                    childAt.layout(i7, i12, measuredWidth + i7, measuredHeight2 + i12);
                    paddingTop = i12 + measuredHeight2 + layoutParams.bottomMargin;
                }
                i7 = i5 - i6;
                if (hasDividerBeforeChildAt(i10)) {
                }
                int i122 = paddingTop + layoutParams.topMargin;
                childAt.layout(i7, i122, measuredWidth + i7, measuredHeight2 + i122);
                paddingTop = i122 + measuredHeight2 + layoutParams.bottomMargin;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
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
                if (id == androidx.appcompat.R.id.topPanel) {
                    view = childAt;
                } else if (id == androidx.appcompat.R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id != androidx.appcompat.R.id.contentPanel && id != androidx.appcompat.R.id.customPanel) || view3 != null) {
                        super.onMeasure(i, i2);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = android.view.View.MeasureSpec.getMode(i2);
        int size = android.view.View.MeasureSpec.getSize(i2);
        int mode2 = android.view.View.MeasureSpec.getMode(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i, 0);
            paddingTop += view.getMeasuredHeight();
            i3 = android.view.View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i3 = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            android.view.View view4 = view2;
            while (true) {
                i5 = androidx.core.view.ViewCompat.getMinimumHeight(view4);
                if (i5 > 0) {
                    break;
                }
                if (!(view4 instanceof android.view.ViewGroup)) {
                    break;
                }
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view4;
                if (viewGroup.getChildCount() != 1) {
                    break;
                } else {
                    view4 = viewGroup.getChildAt(0);
                }
            }
            i5 = 0;
            i4 = view2.getMeasuredHeight() - i5;
            paddingTop += i5;
            i3 = android.view.View.combineMeasuredStates(i3, view2.getMeasuredState());
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (view3 != null) {
            view3.measure(i, mode == 0 ? 0 : android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, size - paddingTop), mode));
            i6 = view3.getMeasuredHeight();
            paddingTop += i6;
            i3 = android.view.View.combineMeasuredStates(i3, view3.getMeasuredState());
        } else {
            i6 = 0;
        }
        int i9 = size - paddingTop;
        if (view2 != null) {
            int min = java.lang.Math.min(i9, i4);
            if (min > 0) {
                i9 -= min;
                i7 = min + i5;
            } else {
                i7 = i5;
            }
            view2.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
            paddingTop = (paddingTop - i5) + view2.getMeasuredHeight();
            i3 = android.view.View.combineMeasuredStates(i3, view2.getMeasuredState());
        }
        if (view3 != null && i9 > 0) {
            view3.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(i9 + i6, mode));
            paddingTop = (paddingTop - i6) + view3.getMeasuredHeight();
            i3 = android.view.View.combineMeasuredStates(i3, view3.getMeasuredState());
        }
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            android.view.View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                i10 = java.lang.Math.max(i10, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(android.view.View.resolveSizeAndState(i10 + getPaddingLeft() + getPaddingRight(), i, i3), android.view.View.resolveSizeAndState(paddingTop, i2, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i12 = 0; i12 < childCount; i12++) {
                android.view.View childAt3 = getChildAt(i12);
                if (childAt3.getVisibility() != 8) {
                    androidx.appcompat.widget.LinearLayoutCompat.LayoutParams layoutParams = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) childAt3.getLayoutParams();
                    if (layoutParams.width == -1) {
                        int i13 = layoutParams.height;
                        layoutParams.height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, makeMeasureSpec, 0, i2, 0);
                        layoutParams.height = i13;
                    }
                }
            }
        }
    }
}
