package androidx.constraintlayout.helper.widget;

/* loaded from: classes7.dex */
public class MotionPlaceholder extends androidx.constraintlayout.widget.VirtualLayout {
    androidx.constraintlayout.core.widgets.Placeholder getHighResolutionOutputSizeshNQ4ISI;

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePreLayout(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer, androidx.constraintlayout.core.widgets.Helper helper, android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> sparseArray) {
    }

    public MotionPlaceholder(android.content.Context context) {
        super(context);
    }

    public MotionPlaceholder(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MotionPlaceholder(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MotionPlaceholder(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onMeasure(int i, int i2) {
        onMeasure(this.getHighResolutionOutputSizeshNQ4ISI, i, i2);
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

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public void init(android.util.AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mHelperWidget = new androidx.constraintlayout.core.widgets.Placeholder();
        validateParams();
    }
}
