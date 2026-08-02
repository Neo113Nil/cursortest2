package androidx.constraintlayout.motion.widget;

/* loaded from: classes7.dex */
public class MotionHelper extends androidx.constraintlayout.widget.ConstraintHelper implements androidx.constraintlayout.motion.widget.MotionHelperInterface {
    private float Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRangesFor;
    protected android.view.View[] views;

    public boolean isDecorator() {
        return false;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public void onFinishedMotionScene(androidx.constraintlayout.motion.widget.MotionLayout motionLayout) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public void onPostDraw(android.graphics.Canvas canvas) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public void onPreDraw(android.graphics.Canvas canvas) {
    }

    public void onPreSetup(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> hashMap) {
    }

    public void onTransitionChange(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int i, int i2, float f) {
    }

    public void onTransitionCompleted(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int i) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionStarted(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int i, int i2) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionTrigger(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int i, boolean z, float f) {
    }

    public void setProgress(android.view.View view, float f) {
    }

    public MotionHelper(android.content.Context context) {
        super(context);
        this.getHighSpeedVideoFpsRangesFor = false;
        this.getHighResolutionOutputSizeshNQ4ISI = false;
    }

    public MotionHelper(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getHighSpeedVideoFpsRangesFor = false;
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        init(attributeSet);
    }

    public MotionHelper(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getHighSpeedVideoFpsRangesFor = false;
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        init(attributeSet);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void init(android.util.AttributeSet attributeSet) {
        super.init(attributeSet);
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.MotionHelper);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.MotionHelper_onShow) {
                    this.getHighSpeedVideoFpsRangesFor = obtainStyledAttributes.getBoolean(index, this.getHighSpeedVideoFpsRangesFor);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionHelper_onHide) {
                    this.getHighResolutionOutputSizeshNQ4ISI = obtainStyledAttributes.getBoolean(index, this.getHighResolutionOutputSizeshNQ4ISI);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public boolean isUsedOnShow() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelperInterface
    public boolean isUseOnHide() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.constraintlayout.motion.widget.Animatable
    public float getProgress() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.constraintlayout.motion.widget.Animatable
    public void setProgress(float f) {
        this.Camera2StreamConfigurationMap = f;
        int i = 0;
        if (this.mCount > 0) {
            this.views = getViews((androidx.constraintlayout.widget.ConstraintLayout) getParent());
            while (i < this.mCount) {
                setProgress(this.views[i], f);
                i++;
            }
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            android.view.View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof androidx.constraintlayout.motion.widget.MotionHelper)) {
                setProgress(childAt, f);
            }
            i++;
        }
    }
}
