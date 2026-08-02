package androidx.constraintlayout.widget;

/* loaded from: classes7.dex */
public class ReactiveGuide extends android.view.View implements androidx.constraintlayout.widget.SharedValues.SharedValuesListener {
    private int Camera2StreamConfigurationMap;
    private boolean getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public ReactiveGuide(android.content.Context context) {
        super(context);
        this.Camera2StreamConfigurationMap = -1;
        this.getHighSpeedVideoSizes = false;
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.getHighSpeedVideoFpsRanges = true;
        super.setVisibility(8);
        Camera2StreamConfigurationMap(null);
    }

    public ReactiveGuide(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Camera2StreamConfigurationMap = -1;
        this.getHighSpeedVideoSizes = false;
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.getHighSpeedVideoFpsRanges = true;
        super.setVisibility(8);
        Camera2StreamConfigurationMap(attributeSet);
    }

    public ReactiveGuide(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Camera2StreamConfigurationMap = -1;
        this.getHighSpeedVideoSizes = false;
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.getHighSpeedVideoFpsRanges = true;
        super.setVisibility(8);
        Camera2StreamConfigurationMap(attributeSet);
    }

    public ReactiveGuide(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.Camera2StreamConfigurationMap = -1;
        this.getHighSpeedVideoSizes = false;
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.getHighSpeedVideoFpsRanges = true;
        super.setVisibility(8);
        Camera2StreamConfigurationMap(attributeSet);
    }

    private void Camera2StreamConfigurationMap(android.util.AttributeSet attributeSet) {
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.ConstraintLayout_ReactiveGuide);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_valueId) {
                    this.Camera2StreamConfigurationMap = obtainStyledAttributes.getResourceId(index, this.Camera2StreamConfigurationMap);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange) {
                    this.getHighSpeedVideoSizes = obtainStyledAttributes.getBoolean(index, this.getHighSpeedVideoSizes);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToConstraintSet) {
                    this.getHighSpeedVideoFpsRangesFor = obtainStyledAttributes.getResourceId(index, this.getHighSpeedVideoFpsRangesFor);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToAllConstraintSets) {
                    this.getHighSpeedVideoFpsRanges = obtainStyledAttributes.getBoolean(index, this.getHighSpeedVideoFpsRanges);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.Camera2StreamConfigurationMap != -1) {
            androidx.constraintlayout.widget.ConstraintLayout.getSharedValues().addListener(this.Camera2StreamConfigurationMap, this);
        }
    }

    public int getAttributeId() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setAttributeId(int i) {
        androidx.constraintlayout.widget.SharedValues sharedValues = androidx.constraintlayout.widget.ConstraintLayout.getSharedValues();
        int i2 = this.Camera2StreamConfigurationMap;
        if (i2 != -1) {
            sharedValues.removeListener(i2, this);
        }
        this.Camera2StreamConfigurationMap = i;
        if (i != -1) {
            sharedValues.addListener(i, this);
        }
    }

    public int getApplyToConstraintSetId() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setApplyToConstraintSetId(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public boolean isAnimatingChange() {
        return this.getHighSpeedVideoSizes;
    }

    public void setAnimateChange(boolean z) {
        this.getHighSpeedVideoSizes = z;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.guideBegin = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i) {
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.guideEnd = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f) {
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.guidePercent = f;
        setLayoutParams(layoutParams);
    }

    @Override // androidx.constraintlayout.widget.SharedValues.SharedValuesListener
    public void onNewValue(int i, int i2, int i3) {
        setGuidelineBegin(i2);
        int id = getId();
        if (id <= 0 || !(getParent() instanceof androidx.constraintlayout.motion.widget.MotionLayout)) {
            return;
        }
        androidx.constraintlayout.motion.widget.MotionLayout motionLayout = (androidx.constraintlayout.motion.widget.MotionLayout) getParent();
        int currentState = motionLayout.getCurrentState();
        int i4 = this.getHighSpeedVideoFpsRangesFor;
        if (i4 != 0) {
            currentState = i4;
        }
        int i5 = 0;
        if (this.getHighSpeedVideoSizes) {
            if (this.getHighSpeedVideoFpsRanges) {
                int[] constraintSetIds = motionLayout.getConstraintSetIds();
                while (i5 < constraintSetIds.length) {
                    int i6 = constraintSetIds[i5];
                    if (i6 != currentState) {
                        androidx.constraintlayout.widget.ConstraintSet constraintSet = motionLayout.getConstraintSet(i6);
                        constraintSet.setGuidelineEnd(id, i2);
                        motionLayout.updateState(i6, constraintSet);
                    }
                    i5++;
                }
            }
            androidx.constraintlayout.widget.ConstraintSet cloneConstraintSet = motionLayout.cloneConstraintSet(currentState);
            cloneConstraintSet.setGuidelineEnd(id, i2);
            motionLayout.updateStateAnimate(currentState, cloneConstraintSet, 1000);
            return;
        }
        if (this.getHighSpeedVideoFpsRanges) {
            int[] constraintSetIds2 = motionLayout.getConstraintSetIds();
            while (i5 < constraintSetIds2.length) {
                int i7 = constraintSetIds2[i5];
                androidx.constraintlayout.widget.ConstraintSet constraintSet2 = motionLayout.getConstraintSet(i7);
                constraintSet2.setGuidelineEnd(id, i2);
                motionLayout.updateState(i7, constraintSet2);
                i5++;
            }
            return;
        }
        androidx.constraintlayout.widget.ConstraintSet constraintSet3 = motionLayout.getConstraintSet(currentState);
        constraintSet3.setGuidelineEnd(id, i2);
        motionLayout.updateState(currentState, constraintSet3);
    }
}
