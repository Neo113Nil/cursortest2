package androidx.constraintlayout.core.widgets;

/* loaded from: classes.dex */
public class VirtualLayout extends androidx.constraintlayout.core.widgets.HelperWidget {
    private int release = 0;
    private int kernelVersion = 0;
    private int exchange = 0;
    private int startTransaction = 0;
    private int AMEXKernela = 0;
    private int init = 0;
    private int resetTransaction = 0;
    private int requestPINEntry = 0;
    private boolean c = false;
    private int getHighResolutionOutputSizeshNQ4ISI = 0;
    private int Camera2StreamConfigurationMap = 0;
    protected androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure mMeasure = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure();
    androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer AMEXKernel = null;

    public void measure(int i, int i2, int i3, int i4) {
    }

    public void setPadding(int i) {
        this.exchange = i;
        this.release = i;
        this.startTransaction = i;
        this.kernelVersion = i;
        this.AMEXKernela = i;
        this.init = i;
    }

    public void setPaddingStart(int i) {
        this.AMEXKernela = i;
        this.resetTransaction = i;
        this.requestPINEntry = i;
    }

    public void setPaddingEnd(int i) {
        this.init = i;
    }

    public void setPaddingLeft(int i) {
        this.exchange = i;
        this.resetTransaction = i;
    }

    public void applyRtl(boolean z) {
        int i = this.AMEXKernela;
        if (i > 0 || this.init > 0) {
            if (z) {
                this.resetTransaction = this.init;
                this.requestPINEntry = i;
            } else {
                this.resetTransaction = i;
                this.requestPINEntry = this.init;
            }
        }
    }

    public void setPaddingTop(int i) {
        this.release = i;
    }

    public void setPaddingRight(int i) {
        this.startTransaction = i;
        this.requestPINEntry = i;
    }

    public void setPaddingBottom(int i) {
        this.kernelVersion = i;
    }

    public int getPaddingTop() {
        return this.release;
    }

    public int getPaddingBottom() {
        return this.kernelVersion;
    }

    public int getPaddingLeft() {
        return this.resetTransaction;
    }

    public int getPaddingRight() {
        return this.requestPINEntry;
    }

    protected void needsCallbackFromSolver(boolean z) {
        this.c = z;
    }

    public boolean needSolverPass() {
        return this.c;
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.Helper
    public void updateConstraints(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer) {
        captureWidgets();
    }

    public void captureWidgets() {
        for (int i = 0; i < this.mWidgetsCount; i++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.mWidgets[i];
            if (constraintWidget != null) {
                constraintWidget.setInVirtualLayout(true);
            }
        }
    }

    public int getMeasuredWidth() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int getMeasuredHeight() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setMeasure(int i, int i2) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.Camera2StreamConfigurationMap = i2;
    }

    protected boolean measureChildren() {
        androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer measurer = this.mParent != null ? ((androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) this.mParent).getMeasurer() : null;
        if (measurer == null) {
            return false;
        }
        for (int i = 0; i < this.mWidgetsCount; i++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.mWidgets[i];
            if (constraintWidget != null && !(constraintWidget instanceof androidx.constraintlayout.core.widgets.Guideline)) {
                androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget.getDimensionBehaviour(0);
                androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget.getDimensionBehaviour(1);
                if (dimensionBehaviour != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.mMatchConstraintDefaultWidth == 1 || dimensionBehaviour2 != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.mMatchConstraintDefaultHeight == 1) {
                    if (dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        dimensionBehaviour = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    if (dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        dimensionBehaviour2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    }
                    this.mMeasure.horizontalBehavior = dimensionBehaviour;
                    this.mMeasure.verticalBehavior = dimensionBehaviour2;
                    this.mMeasure.horizontalDimension = constraintWidget.getWidth();
                    this.mMeasure.verticalDimension = constraintWidget.getHeight();
                    measurer.measure(constraintWidget, this.mMeasure);
                    constraintWidget.setWidth(this.mMeasure.measuredWidth);
                    constraintWidget.setHeight(this.mMeasure.measuredHeight);
                    constraintWidget.setBaselineDistance(this.mMeasure.measuredBaseline);
                }
            }
        }
        return true;
    }

    protected void measure(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        while (this.AMEXKernel == null && getParent() != null) {
            this.AMEXKernel = ((androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) getParent()).getMeasurer();
        }
        this.mMeasure.horizontalBehavior = dimensionBehaviour;
        this.mMeasure.verticalBehavior = dimensionBehaviour2;
        this.mMeasure.horizontalDimension = i;
        this.mMeasure.verticalDimension = i2;
        this.AMEXKernel.measure(constraintWidget, this.mMeasure);
        constraintWidget.setWidth(this.mMeasure.measuredWidth);
        constraintWidget.setHeight(this.mMeasure.measuredHeight);
        constraintWidget.setHasBaseline(this.mMeasure.measuredHasBaseline);
        constraintWidget.setBaselineDistance(this.mMeasure.measuredBaseline);
    }

    public boolean contains(java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintWidget> hashSet) {
        for (int i = 0; i < this.mWidgetsCount; i++) {
            if (hashSet.contains(this.mWidgets[i])) {
                return true;
            }
        }
        return false;
    }
}
