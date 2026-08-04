package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.salamadev.nabilalawadi.kisaskoran.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8318c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8318c = -1;
        int[] iArr = p051h.a.f13339l;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        P.U.g(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        this.f8316a = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
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
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z4 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        int iMakeMeasureSpec;
        boolean z4;
        int i9;
        int size = View.MeasureSpec.getSize(i7);
        int paddingBottom = 0;
        if (this.f8316a) {
            if (size > this.f8318c && this.f8317b) {
                setStacked(false);
            }
            this.f8318c = size;
        }
        if (this.f8317b || View.MeasureSpec.getMode(i7) != 1073741824) {
            iMakeMeasureSpec = i7;
            z4 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z4 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i8);
        if (this.f8316a && !this.f8317b && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z4 = true;
        }
        if (z4) {
            super.onMeasure(i7, i8);
        }
        int childCount = getChildCount();
        int i10 = 0;
        while (true) {
            i9 = -1;
            if (i10 >= childCount) {
                i10 = -1;
                break;
            } else if (getChildAt(i10).getVisibility() == 0) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 >= 0) {
            View childAt = getChildAt(i10);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f8317b) {
                int childCount2 = getChildCount();
                for (int i11 = i10 + 1; i11 < childCount2; i11++) {
                    if (getChildAt(i11).getVisibility() == 0) {
                        i9 = i11;
                        break;
                    }
                }
                paddingBottom = i9 >= 0 ? getChildAt(i9).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = P.U.f5037a;
        if (getMinimumHeight() != paddingBottom) {
            setMinimumHeight(paddingBottom);
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
