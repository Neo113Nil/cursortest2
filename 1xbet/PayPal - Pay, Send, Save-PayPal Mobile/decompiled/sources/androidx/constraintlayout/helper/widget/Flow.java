package androidx.constraintlayout.helper.widget;

/* loaded from: classes7.dex */
public class Flow extends androidx.constraintlayout.widget.VirtualLayout {
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static final int HORIZONTAL = 0;
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    public static final int VERTICAL = 1;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_NONE = 0;
    private androidx.constraintlayout.core.widgets.Flow getHighSpeedVideoFpsRanges;

    public Flow(android.content.Context context) {
        super(context);
    }

    public Flow(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void resolveRtl(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, boolean z) {
        this.getHighSpeedVideoFpsRanges.applyRtl(z);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onMeasure(int i, int i2) {
        onMeasure(this.getHighSpeedVideoFpsRanges, i, i2);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public void onMeasure(androidx.constraintlayout.core.widgets.VirtualLayout virtualLayout, int i, int i2) {
        int mode = android.view.View.MeasureSpec.getMode(i);
        int size = android.view.View.MeasureSpec.getSize(i);
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        if (virtualLayout != null) {
            virtualLayout.measure(mode, size, mode2, size2);
            setMeasuredDimension(virtualLayout.getMeasuredWidth(), virtualLayout.getMeasuredHeight());
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void loadParameters(androidx.constraintlayout.widget.ConstraintSet.Constraint constraint, androidx.constraintlayout.core.widgets.HelperWidget helperWidget, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams, android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> sparseArray) {
        super.loadParameters(constraint, helperWidget, layoutParams, sparseArray);
        if (helperWidget instanceof androidx.constraintlayout.core.widgets.Flow) {
            androidx.constraintlayout.core.widgets.Flow flow = (androidx.constraintlayout.core.widgets.Flow) helperWidget;
            if (layoutParams.orientation != -1) {
                flow.setOrientation(layoutParams.orientation);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public void init(android.util.AttributeSet attributeSet) {
        super.init(attributeSet);
        this.getHighSpeedVideoFpsRanges = new androidx.constraintlayout.core.widgets.Flow();
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_orientation) {
                    this.getHighSpeedVideoFpsRanges.setOrientation(obtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_padding) {
                    this.getHighSpeedVideoFpsRanges.setPadding(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_paddingStart) {
                    this.getHighSpeedVideoFpsRanges.setPaddingStart(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_paddingEnd) {
                    this.getHighSpeedVideoFpsRanges.setPaddingEnd(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_paddingLeft) {
                    this.getHighSpeedVideoFpsRanges.setPaddingLeft(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_paddingTop) {
                    this.getHighSpeedVideoFpsRanges.setPaddingTop(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_paddingRight) {
                    this.getHighSpeedVideoFpsRanges.setPaddingRight(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_paddingBottom) {
                    this.getHighSpeedVideoFpsRanges.setPaddingBottom(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_wrapMode) {
                    this.getHighSpeedVideoFpsRanges.setWrapMode(obtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.getHighSpeedVideoFpsRanges.setHorizontalStyle(obtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.getHighSpeedVideoFpsRanges.setVerticalStyle(obtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.getHighSpeedVideoFpsRanges.setFirstHorizontalStyle(obtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.getHighSpeedVideoFpsRanges.setLastHorizontalStyle(obtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.getHighSpeedVideoFpsRanges.setFirstVerticalStyle(obtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.getHighSpeedVideoFpsRanges.setLastVerticalStyle(obtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.getHighSpeedVideoFpsRanges.setHorizontalBias(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.getHighSpeedVideoFpsRanges.setFirstHorizontalBias(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.getHighSpeedVideoFpsRanges.setLastHorizontalBias(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.getHighSpeedVideoFpsRanges.setFirstVerticalBias(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.getHighSpeedVideoFpsRanges.setLastVerticalBias(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_verticalBias) {
                    this.getHighSpeedVideoFpsRanges.setVerticalBias(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.getHighSpeedVideoFpsRanges.setHorizontalAlign(obtainStyledAttributes.getInt(index, 2));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.getHighSpeedVideoFpsRanges.setVerticalAlign(obtainStyledAttributes.getInt(index, 2));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.getHighSpeedVideoFpsRanges.setHorizontalGap(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_verticalGap) {
                    this.getHighSpeedVideoFpsRanges.setVerticalGap(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.getHighSpeedVideoFpsRanges.setMaxElementsWrap(obtainStyledAttributes.getInt(index, -1));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mHelperWidget = this.getHighSpeedVideoFpsRanges;
        validateParams();
    }

    public void setOrientation(int i) {
        this.getHighSpeedVideoFpsRanges.setOrientation(i);
        requestLayout();
    }

    public void setPadding(int i) {
        this.getHighSpeedVideoFpsRanges.setPadding(i);
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.getHighSpeedVideoFpsRanges.setPaddingLeft(i);
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.getHighSpeedVideoFpsRanges.setPaddingTop(i);
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.getHighSpeedVideoFpsRanges.setPaddingRight(i);
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.getHighSpeedVideoFpsRanges.setPaddingBottom(i);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.getHighSpeedVideoFpsRanges.setLastHorizontalStyle(i);
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.getHighSpeedVideoFpsRanges.setLastVerticalStyle(i);
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.getHighSpeedVideoFpsRanges.setLastHorizontalBias(f);
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.getHighSpeedVideoFpsRanges.setLastVerticalBias(f);
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.getHighSpeedVideoFpsRanges.setWrapMode(i);
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.getHighSpeedVideoFpsRanges.setHorizontalStyle(i);
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.getHighSpeedVideoFpsRanges.setVerticalStyle(i);
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.getHighSpeedVideoFpsRanges.setHorizontalBias(f);
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.getHighSpeedVideoFpsRanges.setVerticalBias(f);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.getHighSpeedVideoFpsRanges.setFirstHorizontalStyle(i);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.getHighSpeedVideoFpsRanges.setFirstVerticalStyle(i);
        requestLayout();
    }

    public void setFirstHorizontalBias(float f) {
        this.getHighSpeedVideoFpsRanges.setFirstHorizontalBias(f);
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.getHighSpeedVideoFpsRanges.setFirstVerticalBias(f);
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.getHighSpeedVideoFpsRanges.setHorizontalAlign(i);
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.getHighSpeedVideoFpsRanges.setVerticalAlign(i);
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.getHighSpeedVideoFpsRanges.setHorizontalGap(i);
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.getHighSpeedVideoFpsRanges.setVerticalGap(i);
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.getHighSpeedVideoFpsRanges.setMaxElementsWrap(i);
        requestLayout();
    }
}
