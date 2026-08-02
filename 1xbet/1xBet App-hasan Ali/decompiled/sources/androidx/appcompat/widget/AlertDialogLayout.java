package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import game.betting133.sports1xbet.R;
import java.lang.reflect.Field;
import n.W;
import n.X;
import n1.C;

/* loaded from: classes.dex */
public class AlertDialogLayout extends X {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int h(View view) {
        Field field = C.f18360a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return h(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    @Override // n.X, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z3, int i, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int paddingLeft = getPaddingLeft();
        int i11 = i6 - i;
        int paddingRight = i11 - getPaddingRight();
        int paddingRight2 = (i11 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i12 = gravity & 112;
        int i13 = gravity & 8388615;
        int paddingTop = i12 != 16 ? i12 != 80 ? getPaddingTop() : ((getPaddingTop() + i7) - i5) - measuredHeight : (((i7 - i5) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                W w5 = (W) childAt.getLayoutParams();
                int i15 = ((LinearLayout.LayoutParams) w5).gravity;
                if (i15 < 0) {
                    i15 = i13;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i15, getLayoutDirection()) & 7;
                if (absoluteGravity == 1) {
                    i8 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) w5).leftMargin;
                    i9 = ((LinearLayout.LayoutParams) w5).rightMargin;
                } else if (absoluteGravity != 5) {
                    i10 = ((LinearLayout.LayoutParams) w5).leftMargin + paddingLeft;
                    if (g(i14)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i16 = paddingTop + ((LinearLayout.LayoutParams) w5).topMargin;
                    childAt.layout(i10, i16, measuredWidth + i10, i16 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) w5).bottomMargin + i16;
                } else {
                    i8 = paddingRight - measuredWidth;
                    i9 = ((LinearLayout.LayoutParams) w5).rightMargin;
                }
                i10 = i8 - i9;
                if (g(i14)) {
                }
                int i162 = paddingTop + ((LinearLayout.LayoutParams) w5).topMargin;
                childAt.layout(i10, i162, measuredWidth + i10, i162 + measuredHeight2);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) w5).bottomMargin + i162;
            }
        }
    }

    @Override // n.X, android.view.View
    public final void onMeasure(int i, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        AlertDialogLayout alertDialogLayout = this;
        int childCount = alertDialogLayout.getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = alertDialogLayout.getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id == R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id != R.id.contentPanel && id != R.id.customPanel) || view3 != null) {
                        super.onMeasure(i, i5);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingBottom = alertDialogLayout.getPaddingBottom() + alertDialogLayout.getPaddingTop();
        if (view != null) {
            view.measure(i, 0);
            paddingBottom += view.getMeasuredHeight();
            i6 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i6 = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            i7 = h(view2);
            i8 = view2.getMeasuredHeight() - i7;
            paddingBottom += i7;
            i6 = View.combineMeasuredStates(i6, view2.getMeasuredState());
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (view3 != null) {
            view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            i9 = view3.getMeasuredHeight();
            paddingBottom += i9;
            i6 = View.combineMeasuredStates(i6, view3.getMeasuredState());
        } else {
            i9 = 0;
        }
        int i11 = size - paddingBottom;
        if (view2 != null) {
            int i12 = paddingBottom - i7;
            int min = Math.min(i11, i8);
            if (min > 0) {
                i11 -= min;
                i7 += min;
            }
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
            paddingBottom = i12 + view2.getMeasuredHeight();
            i6 = View.combineMeasuredStates(i6, view2.getMeasuredState());
        }
        if (view3 != null && i11 > 0) {
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(i9 + i11, mode));
            paddingBottom = (paddingBottom - i9) + view3.getMeasuredHeight();
            i6 = View.combineMeasuredStates(i6, view3.getMeasuredState());
        }
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt2 = alertDialogLayout.getChildAt(i14);
            if (childAt2.getVisibility() != 8) {
                i13 = Math.max(i13, childAt2.getMeasuredWidth());
            }
        }
        int i15 = i5;
        alertDialogLayout.setMeasuredDimension(View.resolveSizeAndState(alertDialogLayout.getPaddingRight() + alertDialogLayout.getPaddingLeft() + i13, i, i6), View.resolveSizeAndState(paddingBottom, i15, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(alertDialogLayout.getMeasuredWidth(), 1073741824);
            int i16 = 0;
            while (i16 < childCount) {
                View childAt3 = alertDialogLayout.getChildAt(i16);
                if (childAt3.getVisibility() != 8) {
                    W w5 = (W) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) w5).width == -1) {
                        int i17 = ((LinearLayout.LayoutParams) w5).height;
                        ((LinearLayout.LayoutParams) w5).height = childAt3.getMeasuredHeight();
                        alertDialogLayout.measureChildWithMargins(childAt3, makeMeasureSpec, 0, i15, 0);
                        ((LinearLayout.LayoutParams) w5).height = i17;
                    }
                }
                i16++;
                alertDialogLayout = this;
                i15 = i5;
            }
        }
    }
}
