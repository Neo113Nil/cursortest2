package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import h.AbstractC1174a;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8316a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8317b;

    /* renamed from: c, reason: collision with root package name */
    public int f8318c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8318c = -1;
        int[] iArr = AbstractC1174a.f13333l;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        P.U.g(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f8316a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f8316a);
        }
    }

    private void setStacked(boolean z4) {
        if (this.f8317b != z4) {
            if (!z4 || this.f8316a) {
                this.f8317b = z4;
                setOrientation(z4 ? 1 : 0);
                setGravity(z4 ? 8388613 : 80);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    findViewById.setVisibility(z4 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        boolean z4;
        int i10;
        int size = View.MeasureSpec.getSize(i7);
        int i11 = 0;
        if (this.f8316a) {
            if (size > this.f8318c && this.f8317b) {
                setStacked(false);
            }
            this.f8318c = size;
        }
        if (this.f8317b || View.MeasureSpec.getMode(i7) != 1073741824) {
            i9 = i7;
            z4 = false;
        } else {
            i9 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z4 = true;
        }
        super.onMeasure(i9, i8);
        if (this.f8316a && !this.f8317b && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z4 = true;
        }
        if (z4) {
            super.onMeasure(i7, i8);
        }
        int childCount = getChildCount();
        int i12 = 0;
        while (true) {
            i10 = -1;
            if (i12 >= childCount) {
                i12 = -1;
                break;
            } else if (getChildAt(i12).getVisibility() == 0) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            View childAt = getChildAt(i12);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f8317b) {
                int i13 = i12 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i13 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i13).getVisibility() == 0) {
                        i10 = i13;
                        break;
                    }
                    i13++;
                }
                i11 = i10 >= 0 ? getChildAt(i10).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i11 = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = P.U.f5037a;
        if (getMinimumHeight() != i11) {
            setMinimumHeight(i11);
            if (i8 == 0) {
                super.onMeasure(i7, i8);
            }
        }
    }

    public void setAllowStacking(boolean z4) {
        if (this.f8316a != z4) {
            this.f8316a = z4;
            if (!z4 && this.f8317b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
