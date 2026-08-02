package androidx.constraintlayout.core.widgets.analyzer;

/* loaded from: classes7.dex */
class GuidelineReference extends androidx.constraintlayout.core.widgets.analyzer.WidgetRun {
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    final boolean getHighSpeedVideoSizes() {
        return false;
    }

    GuidelineReference(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        super(constraintWidget);
        androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun horizontalWidgetRun = constraintWidget.mHorizontalRun;
        horizontalWidgetRun.getHighSpeedVideoSizes = null;
        horizontalWidgetRun.start.clear();
        horizontalWidgetRun.end.clear();
        horizontalWidgetRun.getHighSpeedVideoFpsRangesFor.clear();
        horizontalWidgetRun.getHighResolutionOutputSizeshNQ4ISI = false;
        constraintWidget.mVerticalRun.getHighSpeedVideoFpsRanges();
        this.orientation = ((androidx.constraintlayout.core.widgets.Guideline) constraintWidget).getOrientation();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    final void getHighSpeedVideoFpsRanges() {
        this.start.clear();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    final void Camera2StreamConfigurationMap() {
        this.start.resolved = false;
        this.end.resolved = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(androidx.constraintlayout.core.widgets.analyzer.Dependency dependency) {
        if (!this.start.readyToSolve || this.start.resolved) {
            return;
        }
        this.start.resolve((int) ((this.start.getHighSpeedVideoSizesFor.get(0).value * ((androidx.constraintlayout.core.widgets.Guideline) this.getHighSpeedVideoSizesFor).getRelativePercent()) + 0.5f));
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    final void getHighResolutionOutputSizeshNQ4ISI() {
        androidx.constraintlayout.core.widgets.Guideline guideline = (androidx.constraintlayout.core.widgets.Guideline) this.getHighSpeedVideoSizesFor;
        int relativeBegin = guideline.getRelativeBegin();
        int relativeEnd = guideline.getRelativeEnd();
        guideline.getRelativePercent();
        if (guideline.getOrientation() == 1) {
            if (relativeBegin != -1) {
                this.start.getHighSpeedVideoSizesFor.add(this.getHighSpeedVideoSizesFor.mParent.mHorizontalRun.start);
                this.getHighSpeedVideoSizesFor.mParent.mHorizontalRun.start.getHighSpeedVideoSizes.add(this.start);
                this.start.Camera2StreamConfigurationMap = relativeBegin;
            } else if (relativeEnd != -1) {
                this.start.getHighSpeedVideoSizesFor.add(this.getHighSpeedVideoSizesFor.mParent.mHorizontalRun.end);
                this.getHighSpeedVideoSizesFor.mParent.mHorizontalRun.end.getHighSpeedVideoSizes.add(this.start);
                this.start.Camera2StreamConfigurationMap = -relativeEnd;
            } else {
                this.start.delegateToWidgetRun = true;
                this.start.getHighSpeedVideoSizesFor.add(this.getHighSpeedVideoSizesFor.mParent.mHorizontalRun.end);
                this.getHighSpeedVideoSizesFor.mParent.mHorizontalRun.end.getHighSpeedVideoSizes.add(this.start);
            }
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode = this.getHighSpeedVideoSizesFor.mHorizontalRun.start;
            this.start.getHighSpeedVideoSizes.add(dependencyNode);
            dependencyNode.getHighSpeedVideoSizesFor.add(this.start);
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode2 = this.getHighSpeedVideoSizesFor.mHorizontalRun.end;
            this.start.getHighSpeedVideoSizes.add(dependencyNode2);
            dependencyNode2.getHighSpeedVideoSizesFor.add(this.start);
            return;
        }
        if (relativeBegin != -1) {
            this.start.getHighSpeedVideoSizesFor.add(this.getHighSpeedVideoSizesFor.mParent.mVerticalRun.start);
            this.getHighSpeedVideoSizesFor.mParent.mVerticalRun.start.getHighSpeedVideoSizes.add(this.start);
            this.start.Camera2StreamConfigurationMap = relativeBegin;
        } else if (relativeEnd != -1) {
            this.start.getHighSpeedVideoSizesFor.add(this.getHighSpeedVideoSizesFor.mParent.mVerticalRun.end);
            this.getHighSpeedVideoSizesFor.mParent.mVerticalRun.end.getHighSpeedVideoSizes.add(this.start);
            this.start.Camera2StreamConfigurationMap = -relativeEnd;
        } else {
            this.start.delegateToWidgetRun = true;
            this.start.getHighSpeedVideoSizesFor.add(this.getHighSpeedVideoSizesFor.mParent.mVerticalRun.end);
            this.getHighSpeedVideoSizesFor.mParent.mVerticalRun.end.getHighSpeedVideoSizes.add(this.start);
        }
        androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode3 = this.getHighSpeedVideoSizesFor.mVerticalRun.start;
        this.start.getHighSpeedVideoSizes.add(dependencyNode3);
        dependencyNode3.getHighSpeedVideoSizesFor.add(this.start);
        androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode4 = this.getHighSpeedVideoSizesFor.mVerticalRun.end;
        this.start.getHighSpeedVideoSizes.add(dependencyNode4);
        dependencyNode4.getHighSpeedVideoSizesFor.add(this.start);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        if (((androidx.constraintlayout.core.widgets.Guideline) this.getHighSpeedVideoSizesFor).getOrientation() == 1) {
            this.getHighSpeedVideoSizesFor.setX(this.start.value);
        } else {
            this.getHighSpeedVideoSizesFor.setY(this.start.value);
        }
    }
}
