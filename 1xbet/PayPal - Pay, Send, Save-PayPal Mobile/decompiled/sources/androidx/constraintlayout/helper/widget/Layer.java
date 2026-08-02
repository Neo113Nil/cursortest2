package androidx.constraintlayout.helper.widget;

/* loaded from: classes7.dex */
public class Layer extends androidx.constraintlayout.widget.ConstraintHelper {
    androidx.constraintlayout.widget.ConstraintLayout Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    android.view.View[] getHighSpeedVideoSizes;
    private float getHighSpeedVideoSizesFor;
    private float getInputFormats;
    private float getInputSizeshNQ4ISI;
    private float getOutputFormats;
    private float getOutputMinFrameDuration;
    private float getOutputMinFrameDurationlomOqCM;
    private float getOutputStallDuration;
    protected float mComputedCenterX;
    protected float mComputedCenterY;
    protected float mComputedMaxX;
    protected float mComputedMaxY;
    protected float mComputedMinX;
    protected float mComputedMinY;

    public Layer(android.content.Context context) {
        super(context);
        this.getInputSizeshNQ4ISI = Float.NaN;
        this.getHighSpeedVideoSizesFor = Float.NaN;
        this.getInputFormats = Float.NaN;
        this.getOutputFormats = 1.0f;
        this.getOutputMinFrameDuration = 1.0f;
        this.mComputedCenterX = Float.NaN;
        this.mComputedCenterY = Float.NaN;
        this.mComputedMaxX = Float.NaN;
        this.mComputedMaxY = Float.NaN;
        this.mComputedMinX = Float.NaN;
        this.mComputedMinY = Float.NaN;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getHighSpeedVideoSizes = null;
        this.getOutputStallDuration = 0.0f;
        this.getOutputMinFrameDurationlomOqCM = 0.0f;
    }

    public Layer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getInputSizeshNQ4ISI = Float.NaN;
        this.getHighSpeedVideoSizesFor = Float.NaN;
        this.getInputFormats = Float.NaN;
        this.getOutputFormats = 1.0f;
        this.getOutputMinFrameDuration = 1.0f;
        this.mComputedCenterX = Float.NaN;
        this.mComputedCenterY = Float.NaN;
        this.mComputedMaxX = Float.NaN;
        this.mComputedMaxY = Float.NaN;
        this.mComputedMinX = Float.NaN;
        this.mComputedMinY = Float.NaN;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getHighSpeedVideoSizes = null;
        this.getOutputStallDuration = 0.0f;
        this.getOutputMinFrameDurationlomOqCM = 0.0f;
    }

    public Layer(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getInputSizeshNQ4ISI = Float.NaN;
        this.getHighSpeedVideoSizesFor = Float.NaN;
        this.getInputFormats = Float.NaN;
        this.getOutputFormats = 1.0f;
        this.getOutputMinFrameDuration = 1.0f;
        this.mComputedCenterX = Float.NaN;
        this.mComputedCenterY = Float.NaN;
        this.mComputedMaxX = Float.NaN;
        this.mComputedMaxY = Float.NaN;
        this.mComputedMinX = Float.NaN;
        this.mComputedMinY = Float.NaN;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getHighSpeedVideoSizes = null;
        this.getOutputStallDuration = 0.0f;
        this.getOutputMinFrameDurationlomOqCM = 0.0f;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void init(android.util.AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mUseViewMeasure = false;
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_visibility) {
                    this.getHighSpeedVideoFpsRanges = true;
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_android_elevation) {
                    this.getHighSpeedVideoFpsRangesFor = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Camera2StreamConfigurationMap = (androidx.constraintlayout.widget.ConstraintLayout) getParent();
        if (this.getHighSpeedVideoFpsRanges || this.getHighSpeedVideoFpsRangesFor) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.mCount; i++) {
                android.view.View viewById = this.Camera2StreamConfigurationMap.getViewById(this.mIds[i]);
                if (viewById != null) {
                    if (this.getHighSpeedVideoFpsRanges) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.getHighSpeedVideoFpsRangesFor && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePreDraw(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        this.Camera2StreamConfigurationMap = constraintLayout;
        float rotation = getRotation();
        if (rotation == 0.0f) {
            if (java.lang.Float.isNaN(this.getInputFormats)) {
                return;
            }
            this.getInputFormats = rotation;
            return;
        }
        this.getInputFormats = rotation;
    }

    @Override // android.view.View
    public void setRotation(float f) {
        this.getInputFormats = f;
        getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        this.getOutputFormats = f;
        getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        this.getOutputMinFrameDuration = f;
        getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // android.view.View
    public void setPivotX(float f) {
        this.getInputSizeshNQ4ISI = f;
        getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // android.view.View
    public void setPivotY(float f) {
        this.getHighSpeedVideoSizesFor = f;
        getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        this.getOutputStallDuration = f;
        getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        this.getOutputMinFrameDurationlomOqCM = f;
        getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        applyLayoutFeatures();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        applyLayoutFeatures();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePostLayout(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        getHighSpeedVideoFpsRangesFor();
        this.mComputedCenterX = Float.NaN;
        this.mComputedCenterY = Float.NaN;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) getLayoutParams()).getConstraintWidget();
        constraintWidget.setWidth(0);
        constraintWidget.setHeight(0);
        calcCenters();
        layout(((int) this.mComputedMinX) - getPaddingLeft(), ((int) this.mComputedMinY) - getPaddingTop(), ((int) this.mComputedMaxX) + getPaddingRight(), ((int) this.mComputedMaxY) + getPaddingBottom());
        getHighResolutionOutputSizeshNQ4ISI();
    }

    private void getHighSpeedVideoFpsRangesFor() {
        if (this.Camera2StreamConfigurationMap == null || this.mCount == 0) {
            return;
        }
        android.view.View[] viewArr = this.getHighSpeedVideoSizes;
        if (viewArr == null || viewArr.length != this.mCount) {
            this.getHighSpeedVideoSizes = new android.view.View[this.mCount];
        }
        for (int i = 0; i < this.mCount; i++) {
            this.getHighSpeedVideoSizes[i] = this.Camera2StreamConfigurationMap.getViewById(this.mIds[i]);
        }
    }

    protected void calcCenters() {
        if (this.Camera2StreamConfigurationMap != null) {
            if (this.getHighResolutionOutputSizeshNQ4ISI || java.lang.Float.isNaN(this.mComputedCenterX) || java.lang.Float.isNaN(this.mComputedCenterY)) {
                if (java.lang.Float.isNaN(this.getInputSizeshNQ4ISI) || java.lang.Float.isNaN(this.getHighSpeedVideoSizesFor)) {
                    android.view.View[] views = getViews(this.Camera2StreamConfigurationMap);
                    int left = views[0].getLeft();
                    int top = views[0].getTop();
                    int right = views[0].getRight();
                    int bottom = views[0].getBottom();
                    for (int i = 0; i < this.mCount; i++) {
                        android.view.View view = views[i];
                        left = java.lang.Math.min(left, view.getLeft());
                        top = java.lang.Math.min(top, view.getTop());
                        right = java.lang.Math.max(right, view.getRight());
                        bottom = java.lang.Math.max(bottom, view.getBottom());
                    }
                    this.mComputedMaxX = right;
                    this.mComputedMaxY = bottom;
                    this.mComputedMinX = left;
                    this.mComputedMinY = top;
                    if (java.lang.Float.isNaN(this.getInputSizeshNQ4ISI)) {
                        this.mComputedCenterX = (left + right) / 2;
                    } else {
                        this.mComputedCenterX = this.getInputSizeshNQ4ISI;
                    }
                    if (java.lang.Float.isNaN(this.getHighSpeedVideoSizesFor)) {
                        this.mComputedCenterY = (top + bottom) / 2;
                        return;
                    } else {
                        this.mComputedCenterY = this.getHighSpeedVideoSizesFor;
                        return;
                    }
                }
                this.mComputedCenterY = this.getHighSpeedVideoSizesFor;
                this.mComputedCenterX = this.getInputSizeshNQ4ISI;
            }
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        if (this.Camera2StreamConfigurationMap != null) {
            if (this.getHighSpeedVideoSizes == null) {
                getHighSpeedVideoFpsRangesFor();
            }
            calcCenters();
            double radians = java.lang.Float.isNaN(this.getInputFormats) ? 0.0d : java.lang.Math.toRadians(this.getInputFormats);
            float sin = (float) java.lang.Math.sin(radians);
            float cos = (float) java.lang.Math.cos(radians);
            float f = this.getOutputFormats;
            float f2 = this.getOutputMinFrameDuration;
            float f3 = -f2;
            for (int i = 0; i < this.mCount; i++) {
                android.view.View view = this.getHighSpeedVideoSizes[i];
                int left = (view.getLeft() + view.getRight()) / 2;
                int top = (view.getTop() + view.getBottom()) / 2;
                float f4 = left - this.mComputedCenterX;
                float f5 = top - this.mComputedCenterY;
                float f6 = this.getOutputStallDuration;
                float f7 = this.getOutputMinFrameDurationlomOqCM;
                view.setTranslationX(((((f * cos) * f4) + ((f3 * sin) * f5)) - f4) + f6);
                view.setTranslationY((((f4 * (f * sin)) + ((f2 * cos) * f5)) - f5) + f7);
                view.setScaleY(this.getOutputMinFrameDuration);
                view.setScaleX(this.getOutputFormats);
                if (!java.lang.Float.isNaN(this.getInputFormats)) {
                    view.setRotation(this.getInputFormats);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void applyLayoutFeaturesInConstraintSet(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        applyLayoutFeatures(constraintLayout);
    }
}
