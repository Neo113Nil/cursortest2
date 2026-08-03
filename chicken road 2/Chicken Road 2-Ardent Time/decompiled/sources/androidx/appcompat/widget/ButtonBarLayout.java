package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class ButtonBarLayout extends android.widget.LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2036a;

    /* renamed from: b, reason: collision with root package name */
    public int f2037b;

    public ButtonBarLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2037b = -1;
        int[] iArr = c.AbstractC0095a.f2539h;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        this.f2036a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    private void setStacked(boolean z2) {
        setOrientation(z2 ? 1 : 0);
        setGravity(z2 ? 5 : 80);
        android.view.View findViewById = findViewById(com.watchfacestudio.huasi_urx110.R.id.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z2 ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return java.lang.Math.max(0, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        boolean z2;
        int i5;
        int size = android.view.View.MeasureSpec.getSize(i2);
        if (this.f2036a) {
            if (size > this.f2037b && getOrientation() == 1) {
                setStacked(false);
            }
            this.f2037b = size;
        }
        if ((getOrientation() == 1) || android.view.View.MeasureSpec.getMode(i2) != 1073741824) {
            i4 = i2;
            z2 = false;
        } else {
            i4 = android.view.View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z2 = true;
        }
        super.onMeasure(i4, i3);
        if (this.f2036a && getOrientation() != 1 && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z2 = true;
        }
        if (z2) {
            super.onMeasure(i2, i3);
        }
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            i5 = -1;
            if (i6 >= childCount) {
                i6 = -1;
                break;
            } else if (getChildAt(i6).getVisibility() == 0) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 >= 0) {
            android.view.View childAt = getChildAt(i6);
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if ((getOrientation() == 1 ? 1 : 0) != 0) {
                int i7 = i6 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i7 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i7).getVisibility() == 0) {
                        i5 = i7;
                        break;
                    }
                    i7++;
                }
                r3 = i5 >= 0 ? getChildAt(i5).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                r3 = getPaddingBottom() + measuredHeight;
            }
        }
        java.lang.reflect.Field field = y.x.f8478a;
        if (getMinimumHeight() != r3) {
            setMinimumHeight(r3);
        }
    }

    public void setAllowStacking(boolean z2) {
        if (this.f2036a != z2) {
            this.f2036a = z2;
            if (!z2 && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
