package androidx.constraintlayout.core.state.helpers;

/* loaded from: classes7.dex */
public class GuidelineReference implements androidx.constraintlayout.core.state.helpers.Facade, androidx.constraintlayout.core.state.Reference {
    private androidx.constraintlayout.core.widgets.Guideline getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private java.lang.Object getHighSpeedVideoFpsRangesFor;
    final androidx.constraintlayout.core.state.State getHighSpeedVideoSizes;
    private int getOutputFormats = -1;
    private int Camera2StreamConfigurationMap = -1;
    private float getInputSizeshNQ4ISI = 0.0f;

    @Override // androidx.constraintlayout.core.state.Reference
    public androidx.constraintlayout.core.state.helpers.Facade getFacade() {
        return null;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setKey(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public java.lang.Object getKey() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public GuidelineReference(androidx.constraintlayout.core.state.State state) {
        this.getHighSpeedVideoSizes = state;
    }

    public androidx.constraintlayout.core.state.helpers.GuidelineReference start(java.lang.Object obj) {
        this.getOutputFormats = this.getHighSpeedVideoSizes.convertDimension(obj);
        this.Camera2StreamConfigurationMap = -1;
        this.getInputSizeshNQ4ISI = 0.0f;
        return this;
    }

    public androidx.constraintlayout.core.state.helpers.GuidelineReference end(java.lang.Object obj) {
        this.getOutputFormats = -1;
        this.Camera2StreamConfigurationMap = this.getHighSpeedVideoSizes.convertDimension(obj);
        this.getInputSizeshNQ4ISI = 0.0f;
        return this;
    }

    public androidx.constraintlayout.core.state.helpers.GuidelineReference percent(float f) {
        this.getOutputFormats = -1;
        this.Camera2StreamConfigurationMap = -1;
        this.getInputSizeshNQ4ISI = f;
        return this;
    }

    public void setOrientation(int i) {
        this.getHighSpeedVideoFpsRanges = i;
    }

    public int getOrientation() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.constraintlayout.core.state.helpers.Facade, androidx.constraintlayout.core.state.Reference
    public void apply() {
        this.getHighResolutionOutputSizeshNQ4ISI.setOrientation(this.getHighSpeedVideoFpsRanges);
        int i = this.getOutputFormats;
        if (i != -1) {
            this.getHighResolutionOutputSizeshNQ4ISI.setGuideBegin(i);
            return;
        }
        int i2 = this.Camera2StreamConfigurationMap;
        if (i2 != -1) {
            this.getHighResolutionOutputSizeshNQ4ISI.setGuideEnd(i2);
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI.setGuidePercent(this.getInputSizeshNQ4ISI);
        }
    }

    @Override // androidx.constraintlayout.core.state.helpers.Facade, androidx.constraintlayout.core.state.Reference
    public androidx.constraintlayout.core.widgets.ConstraintWidget getConstraintWidget() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new androidx.constraintlayout.core.widgets.Guideline();
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setConstraintWidget(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.Guideline) {
            this.getHighResolutionOutputSizeshNQ4ISI = (androidx.constraintlayout.core.widgets.Guideline) constraintWidget;
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        }
    }
}
