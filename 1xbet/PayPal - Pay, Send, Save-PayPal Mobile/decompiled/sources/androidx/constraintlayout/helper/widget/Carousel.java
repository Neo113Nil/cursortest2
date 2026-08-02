package androidx.constraintlayout.helper.widget;

/* loaded from: classes7.dex */
public class Carousel extends androidx.constraintlayout.motion.widget.MotionHelper {
    public static final int TOUCH_UP_CARRY_ON = 2;
    public static final int TOUCH_UP_IMMEDIATE_STOP = 1;
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    androidx.constraintlayout.motion.widget.MotionLayout getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    private int getInputFormats;
    int getInputSizeshNQ4ISI;
    private androidx.constraintlayout.helper.widget.Carousel.Adapter getOutputFormats;
    java.lang.Runnable getOutputMinFrameDuration;
    private int getOutputMinFrameDurationlomOqCM;
    private boolean getOutputSizes;
    private int getOutputSizeshNQ4ISI;
    private float getOutputStallDuration;
    private int getOutputStallDurationlomOqCM;
    private final java.util.ArrayList<android.view.View> getValidOutputFormatsForInputhNQ4ISI;
    private int isOutputSupportedFor;
    private int isOutputSupportedForhNQ4ISI;
    private int toString;
    private float unwrapAs;

    public interface Adapter {
        int count();

        void onNewItem(int i);

        void populate(android.view.View view, int i);
    }

    public Carousel(android.content.Context context) {
        super(context);
        this.getOutputFormats = null;
        this.getValidOutputFormatsForInputhNQ4ISI = new java.util.ArrayList<>();
        this.isOutputSupportedFor = 0;
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.getOutputStallDurationlomOqCM = -1;
        this.getOutputSizes = false;
        this.getInputFormats = -1;
        this.getOutputMinFrameDurationlomOqCM = -1;
        this.getInputSizeshNQ4ISI = -1;
        this.getHighSpeedVideoFpsRanges = -1;
        this.getOutputStallDuration = 0.9f;
        this.isOutputSupportedForhNQ4ISI = 0;
        this.getOutputSizeshNQ4ISI = 4;
        this.toString = 1;
        this.unwrapAs = 2.0f;
        this.getHighSpeedVideoSizesFor = -1;
        this.Camera2StreamConfigurationMap = 200;
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
        this.getOutputMinFrameDuration = new java.lang.Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1
            @Override // java.lang.Runnable
            public void run() {
                androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoSizes.setProgress(0.0f);
                androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoFpsRanges();
                androidx.constraintlayout.helper.widget.Carousel.this.getOutputFormats.onNewItem(androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoFpsRangesFor);
                float velocity = androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoSizes.getVelocity();
                if (androidx.constraintlayout.helper.widget.Carousel.this.toString != 2 || velocity <= androidx.constraintlayout.helper.widget.Carousel.this.unwrapAs || androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoFpsRangesFor >= androidx.constraintlayout.helper.widget.Carousel.this.getOutputFormats.count() - 1) {
                    return;
                }
                float f = androidx.constraintlayout.helper.widget.Carousel.this.getOutputStallDuration;
                if (androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoFpsRangesFor != 0 || androidx.constraintlayout.helper.widget.Carousel.this.isOutputSupportedFor <= androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoFpsRangesFor) {
                    if (androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoFpsRangesFor != androidx.constraintlayout.helper.widget.Carousel.this.getOutputFormats.count() - 1 || androidx.constraintlayout.helper.widget.Carousel.this.isOutputSupportedFor >= androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoFpsRangesFor) {
                        final float f2 = velocity * f;
                        androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoSizes.post(new java.lang.Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoSizes.touchAnimateTo(5, 1.0f, f2);
                            }
                        });
                    }
                }
            }
        };
    }

    public Carousel(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getOutputFormats = null;
        this.getValidOutputFormatsForInputhNQ4ISI = new java.util.ArrayList<>();
        this.isOutputSupportedFor = 0;
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.getOutputStallDurationlomOqCM = -1;
        this.getOutputSizes = false;
        this.getInputFormats = -1;
        this.getOutputMinFrameDurationlomOqCM = -1;
        this.getInputSizeshNQ4ISI = -1;
        this.getHighSpeedVideoFpsRanges = -1;
        this.getOutputStallDuration = 0.9f;
        this.isOutputSupportedForhNQ4ISI = 0;
        this.getOutputSizeshNQ4ISI = 4;
        this.toString = 1;
        this.unwrapAs = 2.0f;
        this.getHighSpeedVideoSizesFor = -1;
        this.Camera2StreamConfigurationMap = 200;
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
        this.getOutputMinFrameDuration = new java.lang.Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1
            @Override // java.lang.Runnable
            public void run() {
                androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoSizes.setProgress(0.0f);
                androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoFpsRanges();
                androidx.constraintlayout.helper.widget.Carousel.this.getOutputFormats.onNewItem(androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoFpsRangesFor);
                float velocity = androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoSizes.getVelocity();
                if (androidx.constraintlayout.helper.widget.Carousel.this.toString != 2 || velocity <= androidx.constraintlayout.helper.widget.Carousel.this.unwrapAs || androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoFpsRangesFor >= androidx.constraintlayout.helper.widget.Carousel.this.getOutputFormats.count() - 1) {
                    return;
                }
                float f = androidx.constraintlayout.helper.widget.Carousel.this.getOutputStallDuration;
                if (androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoFpsRangesFor != 0 || androidx.constraintlayout.helper.widget.Carousel.this.isOutputSupportedFor <= androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoFpsRangesFor) {
                    if (androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoFpsRangesFor != androidx.constraintlayout.helper.widget.Carousel.this.getOutputFormats.count() - 1 || androidx.constraintlayout.helper.widget.Carousel.this.isOutputSupportedFor >= androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoFpsRangesFor) {
                        final float f2 = velocity * f;
                        androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoSizes.post(new java.lang.Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoSizes.touchAnimateTo(5, 1.0f, f2);
                            }
                        });
                    }
                }
            }
        };
        getHighSpeedVideoFpsRangesFor(context, attributeSet);
    }

    public Carousel(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getOutputFormats = null;
        this.getValidOutputFormatsForInputhNQ4ISI = new java.util.ArrayList<>();
        this.isOutputSupportedFor = 0;
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.getOutputStallDurationlomOqCM = -1;
        this.getOutputSizes = false;
        this.getInputFormats = -1;
        this.getOutputMinFrameDurationlomOqCM = -1;
        this.getInputSizeshNQ4ISI = -1;
        this.getHighSpeedVideoFpsRanges = -1;
        this.getOutputStallDuration = 0.9f;
        this.isOutputSupportedForhNQ4ISI = 0;
        this.getOutputSizeshNQ4ISI = 4;
        this.toString = 1;
        this.unwrapAs = 2.0f;
        this.getHighSpeedVideoSizesFor = -1;
        this.Camera2StreamConfigurationMap = 200;
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
        this.getOutputMinFrameDuration = new java.lang.Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1
            @Override // java.lang.Runnable
            public void run() {
                androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoSizes.setProgress(0.0f);
                androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoFpsRanges();
                androidx.constraintlayout.helper.widget.Carousel.this.getOutputFormats.onNewItem(androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoFpsRangesFor);
                float velocity = androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoSizes.getVelocity();
                if (androidx.constraintlayout.helper.widget.Carousel.this.toString != 2 || velocity <= androidx.constraintlayout.helper.widget.Carousel.this.unwrapAs || androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoFpsRangesFor >= androidx.constraintlayout.helper.widget.Carousel.this.getOutputFormats.count() - 1) {
                    return;
                }
                float f = androidx.constraintlayout.helper.widget.Carousel.this.getOutputStallDuration;
                if (androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoFpsRangesFor != 0 || androidx.constraintlayout.helper.widget.Carousel.this.isOutputSupportedFor <= androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoFpsRangesFor) {
                    if (androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoFpsRangesFor != androidx.constraintlayout.helper.widget.Carousel.this.getOutputFormats.count() - 1 || androidx.constraintlayout.helper.widget.Carousel.this.isOutputSupportedFor >= androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoFpsRangesFor) {
                        final float f2 = velocity * f;
                        androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoSizes.post(new java.lang.Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                androidx.constraintlayout.helper.widget.Carousel.this.getHighSpeedVideoSizes.touchAnimateTo(5, 1.0f, f2);
                            }
                        });
                    }
                }
            }
        };
        getHighSpeedVideoFpsRangesFor(context, attributeSet);
    }

    private void getHighSpeedVideoFpsRangesFor(android.content.Context context, android.util.AttributeSet attributeSet) {
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.Carousel);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.Carousel_carousel_firstView) {
                    this.getOutputStallDurationlomOqCM = obtainStyledAttributes.getResourceId(index, this.getOutputStallDurationlomOqCM);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Carousel_carousel_backwardTransition) {
                    this.getInputFormats = obtainStyledAttributes.getResourceId(index, this.getInputFormats);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Carousel_carousel_forwardTransition) {
                    this.getOutputMinFrameDurationlomOqCM = obtainStyledAttributes.getResourceId(index, this.getOutputMinFrameDurationlomOqCM);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Carousel_carousel_emptyViewsBehavior) {
                    this.getOutputSizeshNQ4ISI = obtainStyledAttributes.getInt(index, this.getOutputSizeshNQ4ISI);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Carousel_carousel_previousState) {
                    this.getInputSizeshNQ4ISI = obtainStyledAttributes.getResourceId(index, this.getInputSizeshNQ4ISI);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Carousel_carousel_nextState) {
                    this.getHighSpeedVideoFpsRanges = obtainStyledAttributes.getResourceId(index, this.getHighSpeedVideoFpsRanges);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Carousel_carousel_touchUp_dampeningFactor) {
                    this.getOutputStallDuration = obtainStyledAttributes.getFloat(index, this.getOutputStallDuration);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Carousel_carousel_touchUpMode) {
                    this.toString = obtainStyledAttributes.getInt(index, this.toString);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Carousel_carousel_touchUp_velocityThreshold) {
                    this.unwrapAs = obtainStyledAttributes.getFloat(index, this.unwrapAs);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Carousel_carousel_infinite) {
                    this.getOutputSizes = obtainStyledAttributes.getBoolean(index, this.getOutputSizes);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setAdapter(androidx.constraintlayout.helper.widget.Carousel.Adapter adapter) {
        this.getOutputFormats = adapter;
    }

    public void setInfinite(boolean z) {
        this.getOutputSizes = z;
    }

    public boolean isInfinite() {
        return this.getOutputSizes;
    }

    public int getCount() {
        androidx.constraintlayout.helper.widget.Carousel.Adapter adapter = this.getOutputFormats;
        if (adapter != null) {
            return adapter.count();
        }
        return 0;
    }

    public int getCurrentIndex() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void transitionToIndex(int i, int i2) {
        this.getHighSpeedVideoSizesFor = java.lang.Math.max(0, java.lang.Math.min(getCount() - 1, i));
        int max = java.lang.Math.max(0, i2);
        this.Camera2StreamConfigurationMap = max;
        this.getHighSpeedVideoSizes.setTransitionDuration(max);
        if (i < this.getHighSpeedVideoFpsRangesFor) {
            this.getHighSpeedVideoSizes.transitionToState(this.getInputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
        } else {
            this.getHighSpeedVideoSizes.transitionToState(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
        }
    }

    public void jumpToIndex(int i) {
        this.getHighSpeedVideoFpsRangesFor = java.lang.Math.max(0, java.lang.Math.min(getCount() - 1, i));
        refresh();
    }

    public void refresh() {
        int size = this.getValidOutputFormatsForInputhNQ4ISI.size();
        for (int i = 0; i < size; i++) {
            android.view.View view = this.getValidOutputFormatsForInputhNQ4ISI.get(i);
            if (this.getOutputFormats.count() == 0) {
                getHighResolutionOutputSizeshNQ4ISI(view, this.getOutputSizeshNQ4ISI);
            } else {
                getHighResolutionOutputSizeshNQ4ISI(view, 0);
            }
        }
        this.getHighSpeedVideoSizes.rebuildScene();
        getHighSpeedVideoFpsRanges();
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionChange(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int i, int i2, float f) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionCompleted(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int i) {
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        this.isOutputSupportedFor = i2;
        if (i == this.getHighSpeedVideoFpsRanges) {
            this.getHighSpeedVideoFpsRangesFor = i2 + 1;
        } else if (i == this.getInputSizeshNQ4ISI) {
            this.getHighSpeedVideoFpsRangesFor = i2 - 1;
        }
        if (this.getOutputSizes) {
            if (this.getHighSpeedVideoFpsRangesFor >= this.getOutputFormats.count()) {
                this.getHighSpeedVideoFpsRangesFor = 0;
            }
            if (this.getHighSpeedVideoFpsRangesFor < 0) {
                this.getHighSpeedVideoFpsRangesFor = this.getOutputFormats.count() - 1;
            }
        } else {
            if (this.getHighSpeedVideoFpsRangesFor >= this.getOutputFormats.count()) {
                this.getHighSpeedVideoFpsRangesFor = this.getOutputFormats.count() - 1;
            }
            if (this.getHighSpeedVideoFpsRangesFor < 0) {
                this.getHighSpeedVideoFpsRangesFor = 0;
            }
        }
        if (this.isOutputSupportedFor != this.getHighSpeedVideoFpsRangesFor) {
            this.getHighSpeedVideoSizes.post(this.getOutputMinFrameDuration);
        }
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI(int i, boolean z) {
        androidx.constraintlayout.motion.widget.MotionLayout motionLayout;
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition;
        if (i == -1 || (motionLayout = this.getHighSpeedVideoSizes) == null || (transition = motionLayout.getTransition(i)) == null || z == transition.isEnabled()) {
            return false;
        }
        transition.setEnabled(z);
        return true;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.getValidOutputFormatsForInputhNQ4ISI.clear();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof androidx.constraintlayout.motion.widget.MotionLayout) {
            androidx.constraintlayout.motion.widget.MotionLayout motionLayout = (androidx.constraintlayout.motion.widget.MotionLayout) getParent();
            this.getValidOutputFormatsForInputhNQ4ISI.clear();
            for (int i = 0; i < this.mCount; i++) {
                int i2 = this.mIds[i];
                android.view.View viewById = motionLayout.getViewById(i2);
                if (this.getOutputStallDurationlomOqCM == i2) {
                    this.isOutputSupportedForhNQ4ISI = i;
                }
                this.getValidOutputFormatsForInputhNQ4ISI.add(viewById);
            }
            this.getHighSpeedVideoSizes = motionLayout;
            if (this.toString == 2) {
                androidx.constraintlayout.motion.widget.MotionScene.Transition transition = motionLayout.getTransition(this.getOutputMinFrameDurationlomOqCM);
                if (transition != null) {
                    transition.setOnTouchUp(5);
                }
                androidx.constraintlayout.motion.widget.MotionScene.Transition transition2 = this.getHighSpeedVideoSizes.getTransition(this.getInputFormats);
                if (transition2 != null) {
                    transition2.setOnTouchUp(5);
                }
            }
            getHighSpeedVideoFpsRanges();
        }
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI(android.view.View view, int i) {
        androidx.constraintlayout.motion.widget.MotionLayout motionLayout = this.getHighSpeedVideoSizes;
        if (motionLayout == null) {
            return false;
        }
        boolean z = false;
        for (int i2 : motionLayout.getConstraintSetIds()) {
            z |= getHighSpeedVideoFpsRangesFor(i2, view, i);
        }
        return z;
    }

    private boolean getHighSpeedVideoFpsRangesFor(int i, android.view.View view, int i2) {
        androidx.constraintlayout.widget.ConstraintSet.Constraint constraint;
        androidx.constraintlayout.widget.ConstraintSet constraintSet = this.getHighSpeedVideoSizes.getConstraintSet(i);
        if (constraintSet == null || (constraint = constraintSet.getConstraint(view.getId())) == null) {
            return false;
        }
        constraint.propertySet.mVisibilityMode = 1;
        view.setVisibility(i2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighSpeedVideoFpsRanges() {
        androidx.constraintlayout.helper.widget.Carousel.Adapter adapter = this.getOutputFormats;
        if (adapter == null || this.getHighSpeedVideoSizes == null || adapter.count() == 0) {
            return;
        }
        int size = this.getValidOutputFormatsForInputhNQ4ISI.size();
        for (int i = 0; i < size; i++) {
            android.view.View view = this.getValidOutputFormatsForInputhNQ4ISI.get(i);
            int i2 = (this.getHighSpeedVideoFpsRangesFor + i) - this.isOutputSupportedForhNQ4ISI;
            if (this.getOutputSizes) {
                if (i2 < 0) {
                    int i3 = this.getOutputSizeshNQ4ISI;
                    if (i3 != 4) {
                        getHighResolutionOutputSizeshNQ4ISI(view, i3);
                    } else {
                        getHighResolutionOutputSizeshNQ4ISI(view, 0);
                    }
                    if (i2 % this.getOutputFormats.count() == 0) {
                        this.getOutputFormats.populate(view, 0);
                    } else {
                        androidx.constraintlayout.helper.widget.Carousel.Adapter adapter2 = this.getOutputFormats;
                        adapter2.populate(view, adapter2.count() + (i2 % this.getOutputFormats.count()));
                    }
                } else if (i2 >= this.getOutputFormats.count()) {
                    if (i2 == this.getOutputFormats.count()) {
                        i2 = 0;
                    } else if (i2 > this.getOutputFormats.count()) {
                        i2 %= this.getOutputFormats.count();
                    }
                    int i4 = this.getOutputSizeshNQ4ISI;
                    if (i4 != 4) {
                        getHighResolutionOutputSizeshNQ4ISI(view, i4);
                    } else {
                        getHighResolutionOutputSizeshNQ4ISI(view, 0);
                    }
                    this.getOutputFormats.populate(view, i2);
                } else {
                    getHighResolutionOutputSizeshNQ4ISI(view, 0);
                    this.getOutputFormats.populate(view, i2);
                }
            } else if (i2 < 0) {
                getHighResolutionOutputSizeshNQ4ISI(view, this.getOutputSizeshNQ4ISI);
            } else if (i2 >= this.getOutputFormats.count()) {
                getHighResolutionOutputSizeshNQ4ISI(view, this.getOutputSizeshNQ4ISI);
            } else {
                getHighResolutionOutputSizeshNQ4ISI(view, 0);
                this.getOutputFormats.populate(view, i2);
            }
        }
        int i5 = this.getHighSpeedVideoSizesFor;
        if (i5 != -1 && i5 != this.getHighSpeedVideoFpsRangesFor) {
            this.getHighSpeedVideoSizes.post(new java.lang.Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.constraintlayout.helper.widget.Carousel carousel = androidx.constraintlayout.helper.widget.Carousel.this;
                    carousel.getHighSpeedVideoSizes.setTransitionDuration(carousel.Camera2StreamConfigurationMap);
                    if (carousel.getHighSpeedVideoSizesFor < carousel.getHighSpeedVideoFpsRangesFor) {
                        carousel.getHighSpeedVideoSizes.transitionToState(carousel.getInputSizeshNQ4ISI, carousel.Camera2StreamConfigurationMap);
                    } else {
                        carousel.getHighSpeedVideoSizes.transitionToState(carousel.getHighSpeedVideoFpsRanges, carousel.Camera2StreamConfigurationMap);
                    }
                }
            });
        } else if (i5 == this.getHighSpeedVideoFpsRangesFor) {
            this.getHighSpeedVideoSizesFor = -1;
        }
        if (this.getInputFormats == -1 || this.getOutputMinFrameDurationlomOqCM == -1 || this.getOutputSizes) {
            return;
        }
        int count = this.getOutputFormats.count();
        if (this.getHighSpeedVideoFpsRangesFor == 0) {
            getHighResolutionOutputSizeshNQ4ISI(this.getInputFormats, false);
        } else {
            getHighResolutionOutputSizeshNQ4ISI(this.getInputFormats, true);
            this.getHighSpeedVideoSizes.setTransition(this.getInputFormats);
        }
        if (this.getHighSpeedVideoFpsRangesFor == count - 1) {
            getHighResolutionOutputSizeshNQ4ISI(this.getOutputMinFrameDurationlomOqCM, false);
        } else {
            getHighResolutionOutputSizeshNQ4ISI(this.getOutputMinFrameDurationlomOqCM, true);
            this.getHighSpeedVideoSizes.setTransition(this.getOutputMinFrameDurationlomOqCM);
        }
    }
}
