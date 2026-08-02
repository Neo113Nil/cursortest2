package androidx.appcompat.widget;

/* loaded from: classes5.dex */
public class ButtonBarLayout extends android.widget.LinearLayout {
    private boolean Camera2StreamConfigurationMap;
    private int getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;

    public ButtonBarLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getHighSpeedVideoFpsRangesFor = -1;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.ButtonBarLayout);
        androidx.core.view.ViewCompat.saveAttributeDataForStyleable(this, context, androidx.appcompat.R.styleable.ButtonBarLayout, attributeSet, obtainStyledAttributes, 0, 0);
        this.getHighSpeedVideoSizes = obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.getHighSpeedVideoSizes != z) {
            this.getHighSpeedVideoSizes = z;
            if (!z && this.Camera2StreamConfigurationMap) {
                getHighSpeedVideoFpsRanges(false);
            }
            requestLayout();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r1 != false) goto L24;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int size = android.view.View.MeasureSpec.getSize(i);
        int i5 = 0;
        if (this.getHighSpeedVideoSizes) {
            if (size > this.getHighSpeedVideoFpsRangesFor && this.Camera2StreamConfigurationMap) {
                getHighSpeedVideoFpsRanges(false);
            }
            this.getHighSpeedVideoFpsRangesFor = size;
        }
        if (this.Camera2StreamConfigurationMap || android.view.View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = android.view.View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.getHighSpeedVideoSizes && !this.Camera2StreamConfigurationMap && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            getHighSpeedVideoFpsRanges(true);
        }
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            i4 = -1;
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
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (!this.Camera2StreamConfigurationMap) {
                i5 = paddingTop + getPaddingBottom();
            } else {
                int i7 = i6 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i7 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i7).getVisibility() == 0) {
                        i4 = i7;
                        break;
                    }
                    i7++;
                }
                if (i4 >= 0) {
                    paddingTop += getChildAt(i4).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i5 = paddingTop;
            }
        }
        if (androidx.core.view.ViewCompat.getMinimumHeight(this) != i5) {
            setMinimumHeight(i5);
            if (i2 == 0) {
                super.onMeasure(i, i2);
            }
        }
    }

    private void getHighSpeedVideoFpsRanges(boolean z) {
        if (this.Camera2StreamConfigurationMap != z) {
            if (!z || this.getHighSpeedVideoSizes) {
                this.Camera2StreamConfigurationMap = z;
                setOrientation(z ? 1 : 0);
                setGravity(z ? androidx.core.view.GravityCompat.END : 80);
                android.view.View findViewById = findViewById(androidx.appcompat.R.id.spacer);
                if (findViewById != null) {
                    findViewById.setVisibility(z ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }
}
