package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import i.C6977a;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private boolean f37613a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f37614b;

    /* renamed from: c, reason: collision with root package name */
    private int f37615c;

    public ButtonBarLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37615c = -1;
        int[] iArr = C6977a.f65657k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        androidx.core.view.Y.B(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        boolean z11 = obtainStyledAttributes.getBoolean(0, true);
        this.f37613a = z11;
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            a(z11);
        }
    }

    private void a(boolean z11) {
        if (this.f37614b != z11) {
            if (!z11 || this.f37613a) {
                this.f37614b = z11;
                setOrientation(z11 ? 1 : 0);
                setGravity(z11 ? 8388613 : 80);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    findViewById.setVisibility(z11 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i11, int i12) {
        int i13;
        boolean z11;
        int i14;
        int size = View.MeasureSpec.getSize(i11);
        boolean z12 = this.f37613a;
        int i15 = 0;
        if (z12) {
            if (size > this.f37615c && this.f37614b) {
                a(false);
            }
            this.f37615c = size;
        }
        if (this.f37614b || View.MeasureSpec.getMode(i11) != 1073741824) {
            i13 = i11;
            z11 = false;
        } else {
            i13 = View.MeasureSpec.makeMeasureSpec(size, LinearLayoutManager.INVALID_OFFSET);
            z11 = true;
        }
        super.onMeasure(i13, i12);
        if (z12 && !this.f37614b && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            a(true);
            z11 = true;
        }
        if (z11) {
            super.onMeasure(i11, i12);
        }
        int childCount = getChildCount();
        int i16 = 0;
        while (true) {
            i14 = -1;
            if (i16 >= childCount) {
                i16 = -1;
                break;
            } else if (getChildAt(i16).getVisibility() == 0) {
                break;
            } else {
                i16++;
            }
        }
        if (i16 >= 0) {
            View childAt = getChildAt(i16);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f37614b) {
                int i17 = i16 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i17 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i17).getVisibility() == 0) {
                        i14 = i17;
                        break;
                    }
                    i17++;
                }
                i15 = i14 >= 0 ? getChildAt(i14).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i15 = getPaddingBottom() + measuredHeight;
            }
        }
        int i18 = androidx.core.view.Y.f42258g;
        if (getMinimumHeight() != i15) {
            setMinimumHeight(i15);
            if (i12 == 0) {
                super.onMeasure(i11, i12);
            }
        }
    }
}
