package androidx.appcompat.widget;

import Gl.C3124a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static int h(View view) {
        int i11 = androidx.core.view.Y.f42258g;
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

    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int a11;
        int i15;
        int i16;
        int paddingLeft = getPaddingLeft();
        int i17 = i13 - i11;
        int paddingRight = i17 - getPaddingRight();
        int paddingRight2 = (i17 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i18 = gravity & 112;
        int i19 = gravity & 8388615;
        int paddingTop = i18 != 16 ? i18 != 80 ? getPaddingTop() : ((getPaddingTop() + i14) - i12) - measuredHeight : (((i14 - i12) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) childAt.getLayoutParams();
                int i22 = ((LinearLayout.LayoutParams) aVar).gravity;
                if (i22 < 0) {
                    i22 = i19;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i22, getLayoutDirection()) & 7;
                if (absoluteGravity == 1) {
                    a11 = C3124a.a(paddingRight2, measuredWidth, 2, paddingLeft) + ((LinearLayout.LayoutParams) aVar).leftMargin;
                    i15 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                } else if (absoluteGravity != 5) {
                    i16 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                    if (hasDividerBeforeChildAt(i21)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i23 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    childAt.layout(i16, i23, measuredWidth + i16, i23 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin + i23;
                } else {
                    a11 = paddingRight - measuredWidth;
                    i15 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                }
                i16 = a11 - i15;
                if (hasDividerBeforeChildAt(i21)) {
                }
                int i232 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                childAt.layout(i16, i232, measuredWidth + i16, i232 + measuredHeight2);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin + i232;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected final void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        AlertDialogLayout alertDialogLayout = this;
        int childCount = alertDialogLayout.getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = alertDialogLayout.getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                int id2 = childAt.getId();
                if (id2 == R.id.topPanel) {
                    view = childAt;
                } else if (id2 == R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id2 != R.id.contentPanel && id2 != R.id.customPanel) || view3 != null) {
                        super.onMeasure(i11, i12);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i11);
        int paddingBottom = alertDialogLayout.getPaddingBottom() + alertDialogLayout.getPaddingTop();
        if (view != null) {
            view.measure(i11, 0);
            paddingBottom += view.getMeasuredHeight();
            i13 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i13 = 0;
        }
        if (view2 != null) {
            view2.measure(i11, 0);
            i14 = h(view2);
            i15 = view2.getMeasuredHeight() - i14;
            paddingBottom += i14;
            i13 = View.combineMeasuredStates(i13, view2.getMeasuredState());
        } else {
            i14 = 0;
            i15 = 0;
        }
        if (view3 != null) {
            view3.measure(i11, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            i16 = view3.getMeasuredHeight();
            paddingBottom += i16;
            i13 = View.combineMeasuredStates(i13, view3.getMeasuredState());
        } else {
            i16 = 0;
        }
        int i18 = size - paddingBottom;
        if (view2 != null) {
            int i19 = paddingBottom - i14;
            int min = Math.min(i18, i15);
            if (min > 0) {
                i18 -= min;
                i14 += min;
            }
            view2.measure(i11, View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
            paddingBottom = i19 + view2.getMeasuredHeight();
            i13 = View.combineMeasuredStates(i13, view2.getMeasuredState());
        }
        if (view3 != null && i18 > 0) {
            view3.measure(i11, View.MeasureSpec.makeMeasureSpec(i16 + i18, mode));
            paddingBottom = (paddingBottom - i16) + view3.getMeasuredHeight();
            i13 = View.combineMeasuredStates(i13, view3.getMeasuredState());
        }
        int i21 = 0;
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt2 = alertDialogLayout.getChildAt(i22);
            if (childAt2.getVisibility() != 8) {
                i21 = Math.max(i21, childAt2.getMeasuredWidth());
            }
        }
        int i23 = i12;
        alertDialogLayout.setMeasuredDimension(View.resolveSizeAndState(alertDialogLayout.getPaddingRight() + alertDialogLayout.getPaddingLeft() + i21, i11, i13), View.resolveSizeAndState(paddingBottom, i23, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(alertDialogLayout.getMeasuredWidth(), 1073741824);
            int i24 = 0;
            while (i24 < childCount) {
                View childAt3 = alertDialogLayout.getChildAt(i24);
                if (childAt3.getVisibility() != 8) {
                    LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) aVar).width == -1) {
                        int i25 = ((LinearLayout.LayoutParams) aVar).height;
                        ((LinearLayout.LayoutParams) aVar).height = childAt3.getMeasuredHeight();
                        alertDialogLayout.measureChildWithMargins(childAt3, makeMeasureSpec, 0, i23, 0);
                        ((LinearLayout.LayoutParams) aVar).height = i25;
                    }
                }
                i24++;
                alertDialogLayout = this;
                i23 = i12;
            }
        }
    }
}
