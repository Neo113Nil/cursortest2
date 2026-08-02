package androidx.constraintlayout.widget;

/* loaded from: classes7.dex */
public class Group extends androidx.constraintlayout.widget.ConstraintHelper {
    public Group(android.content.Context context) {
        super(context);
    }

    public Group(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void init(android.util.AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mUseViewMeasure = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        applyLayoutFeatures();
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
    protected void applyLayoutFeaturesInConstraintSet(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        applyLayoutFeatures(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePostLayout(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.coroutineCreation.setWidth(0);
        layoutParams.coroutineCreation.setHeight(0);
    }
}
