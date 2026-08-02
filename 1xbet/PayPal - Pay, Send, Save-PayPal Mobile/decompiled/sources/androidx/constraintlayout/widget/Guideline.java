package androidx.constraintlayout.widget;

/* loaded from: classes7.dex */
public class Guideline extends android.view.View {
    private boolean getHighSpeedVideoFpsRanges;

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public Guideline(android.content.Context context) {
        super(context);
        this.getHighSpeedVideoFpsRanges = true;
        super.setVisibility(8);
    }

    public Guideline(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getHighSpeedVideoFpsRanges = true;
        super.setVisibility(8);
    }

    public Guideline(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getHighSpeedVideoFpsRanges = true;
        super.setVisibility(8);
    }

    public Guideline(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.getHighSpeedVideoFpsRanges = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.getHighSpeedVideoFpsRanges && layoutParams.guideBegin == i) {
            return;
        }
        layoutParams.guideBegin = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i) {
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.getHighSpeedVideoFpsRanges && layoutParams.guideEnd == i) {
            return;
        }
        layoutParams.guideEnd = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f) {
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.getHighSpeedVideoFpsRanges && layoutParams.guidePercent == f) {
            return;
        }
        layoutParams.guidePercent = f;
        setLayoutParams(layoutParams);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.getHighSpeedVideoFpsRanges = z;
    }
}
