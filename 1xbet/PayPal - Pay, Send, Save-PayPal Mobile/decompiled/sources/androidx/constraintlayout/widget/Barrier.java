package androidx.constraintlayout.widget;

/* loaded from: classes7.dex */
public class Barrier extends androidx.constraintlayout.widget.ConstraintHelper {
    public static final int BOTTOM = 3;
    public static final int END = 6;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int START = 5;
    public static final int TOP = 2;
    private int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private androidx.constraintlayout.core.widgets.Barrier getHighSpeedVideoSizes;

    public Barrier(android.content.Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public int getType() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setType(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, int i, boolean z) {
        this.Camera2StreamConfigurationMap = i;
        if (z) {
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i2 == 5) {
                this.Camera2StreamConfigurationMap = 1;
            } else if (i2 == 6) {
                this.Camera2StreamConfigurationMap = 0;
            }
        } else {
            int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i3 == 5) {
                this.Camera2StreamConfigurationMap = 0;
            } else if (i3 == 6) {
                this.Camera2StreamConfigurationMap = 1;
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.Barrier) {
            ((androidx.constraintlayout.core.widgets.Barrier) constraintWidget).setBarrierType(this.Camera2StreamConfigurationMap);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void resolveRtl(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, boolean z) {
        getHighResolutionOutputSizeshNQ4ISI(constraintWidget, this.getHighResolutionOutputSizeshNQ4ISI, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void init(android.util.AttributeSet attributeSet) {
        super.init(attributeSet);
        this.getHighSpeedVideoSizes = new androidx.constraintlayout.core.widgets.Barrier();
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.getHighSpeedVideoSizes.setAllowsGoneWidget(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_barrierMargin) {
                    this.getHighSpeedVideoSizes.setMargin(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mHelperWidget = this.getHighSpeedVideoSizes;
        validateParams();
    }

    public void setAllowsGoneWidget(boolean z) {
        this.getHighSpeedVideoSizes.setAllowsGoneWidget(z);
    }

    @java.lang.Deprecated
    public boolean allowsGoneWidget() {
        return this.getHighSpeedVideoSizes.getAllowsGoneWidget();
    }

    public boolean getAllowsGoneWidget() {
        return this.getHighSpeedVideoSizes.getAllowsGoneWidget();
    }

    public void setDpMargin(int i) {
        this.getHighSpeedVideoSizes.setMargin((int) ((i * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public int getMargin() {
        return this.getHighSpeedVideoSizes.getMargin();
    }

    public void setMargin(int i) {
        this.getHighSpeedVideoSizes.setMargin(i);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void loadParameters(androidx.constraintlayout.widget.ConstraintSet.Constraint constraint, androidx.constraintlayout.core.widgets.HelperWidget helperWidget, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams, android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> sparseArray) {
        super.loadParameters(constraint, helperWidget, layoutParams, sparseArray);
        if (helperWidget instanceof androidx.constraintlayout.core.widgets.Barrier) {
            androidx.constraintlayout.core.widgets.Barrier barrier = (androidx.constraintlayout.core.widgets.Barrier) helperWidget;
            getHighResolutionOutputSizeshNQ4ISI(barrier, constraint.layout.mBarrierDirection, ((androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) helperWidget.getParent()).isRtl());
            barrier.setAllowsGoneWidget(constraint.layout.mBarrierAllowsGoneWidgets);
            barrier.setMargin(constraint.layout.mBarrierMargin);
        }
    }
}
