package androidx.constraintlayout.core.widgets.analyzer;

/* loaded from: classes7.dex */
class HelperReferences extends androidx.constraintlayout.core.widgets.analyzer.WidgetRun {
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    final boolean getHighSpeedVideoSizes() {
        return false;
    }

    HelperReferences(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    final void getHighSpeedVideoFpsRanges() {
        this.getHighSpeedVideoSizes = null;
        this.start.clear();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    final void Camera2StreamConfigurationMap() {
        this.start.resolved = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    final void getHighResolutionOutputSizeshNQ4ISI() {
        if (this.getHighSpeedVideoSizesFor instanceof androidx.constraintlayout.core.widgets.Barrier) {
            this.start.delegateToWidgetRun = true;
            androidx.constraintlayout.core.widgets.Barrier barrier = (androidx.constraintlayout.core.widgets.Barrier) this.getHighSpeedVideoSizesFor;
            int barrierType = barrier.getBarrierType();
            boolean allowsGoneWidget = barrier.getAllowsGoneWidget();
            int i = 0;
            if (barrierType == 0) {
                this.start.getOutputFormats = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.LEFT;
                while (i < barrier.mWidgetsCount) {
                    androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = barrier.mWidgets[i];
                    if (allowsGoneWidget || constraintWidget.getVisibility() != 8) {
                        androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode = constraintWidget.mHorizontalRun.start;
                        dependencyNode.getHighSpeedVideoSizes.add(this.start);
                        this.start.getHighSpeedVideoSizesFor.add(dependencyNode);
                    }
                    i++;
                }
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode2 = this.getHighSpeedVideoSizesFor.mHorizontalRun.start;
                this.start.getHighSpeedVideoSizes.add(dependencyNode2);
                dependencyNode2.getHighSpeedVideoSizesFor.add(this.start);
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode3 = this.getHighSpeedVideoSizesFor.mHorizontalRun.end;
                this.start.getHighSpeedVideoSizes.add(dependencyNode3);
                dependencyNode3.getHighSpeedVideoSizesFor.add(this.start);
                return;
            }
            if (barrierType == 1) {
                this.start.getOutputFormats = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.RIGHT;
                while (i < barrier.mWidgetsCount) {
                    androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = barrier.mWidgets[i];
                    if (allowsGoneWidget || constraintWidget2.getVisibility() != 8) {
                        androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode4 = constraintWidget2.mHorizontalRun.end;
                        dependencyNode4.getHighSpeedVideoSizes.add(this.start);
                        this.start.getHighSpeedVideoSizesFor.add(dependencyNode4);
                    }
                    i++;
                }
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode5 = this.getHighSpeedVideoSizesFor.mHorizontalRun.start;
                this.start.getHighSpeedVideoSizes.add(dependencyNode5);
                dependencyNode5.getHighSpeedVideoSizesFor.add(this.start);
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode6 = this.getHighSpeedVideoSizesFor.mHorizontalRun.end;
                this.start.getHighSpeedVideoSizes.add(dependencyNode6);
                dependencyNode6.getHighSpeedVideoSizesFor.add(this.start);
                return;
            }
            if (barrierType == 2) {
                this.start.getOutputFormats = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.TOP;
                while (i < barrier.mWidgetsCount) {
                    androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget3 = barrier.mWidgets[i];
                    if (allowsGoneWidget || constraintWidget3.getVisibility() != 8) {
                        androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode7 = constraintWidget3.mVerticalRun.start;
                        dependencyNode7.getHighSpeedVideoSizes.add(this.start);
                        this.start.getHighSpeedVideoSizesFor.add(dependencyNode7);
                    }
                    i++;
                }
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode8 = this.getHighSpeedVideoSizesFor.mVerticalRun.start;
                this.start.getHighSpeedVideoSizes.add(dependencyNode8);
                dependencyNode8.getHighSpeedVideoSizesFor.add(this.start);
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode9 = this.getHighSpeedVideoSizesFor.mVerticalRun.end;
                this.start.getHighSpeedVideoSizes.add(dependencyNode9);
                dependencyNode9.getHighSpeedVideoSizesFor.add(this.start);
                return;
            }
            if (barrierType == 3) {
                this.start.getOutputFormats = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.BOTTOM;
                while (i < barrier.mWidgetsCount) {
                    androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget4 = barrier.mWidgets[i];
                    if (allowsGoneWidget || constraintWidget4.getVisibility() != 8) {
                        androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode10 = constraintWidget4.mVerticalRun.end;
                        dependencyNode10.getHighSpeedVideoSizes.add(this.start);
                        this.start.getHighSpeedVideoSizesFor.add(dependencyNode10);
                    }
                    i++;
                }
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode11 = this.getHighSpeedVideoSizesFor.mVerticalRun.start;
                this.start.getHighSpeedVideoSizes.add(dependencyNode11);
                dependencyNode11.getHighSpeedVideoSizesFor.add(this.start);
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode12 = this.getHighSpeedVideoSizesFor.mVerticalRun.end;
                this.start.getHighSpeedVideoSizes.add(dependencyNode12);
                dependencyNode12.getHighSpeedVideoSizesFor.add(this.start);
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(androidx.constraintlayout.core.widgets.analyzer.Dependency dependency) {
        androidx.constraintlayout.core.widgets.Barrier barrier = (androidx.constraintlayout.core.widgets.Barrier) this.getHighSpeedVideoSizesFor;
        int barrierType = barrier.getBarrierType();
        java.util.Iterator<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> it = this.start.getHighSpeedVideoSizesFor.iterator();
        int i = 0;
        int i2 = -1;
        while (it.hasNext()) {
            int i3 = it.next().value;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (barrierType == 0 || barrierType == 2) {
            this.start.resolve(i2 + barrier.getMargin());
        } else {
            this.start.resolve(i + barrier.getMargin());
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
        if (this.getHighSpeedVideoSizesFor instanceof androidx.constraintlayout.core.widgets.Barrier) {
            int barrierType = ((androidx.constraintlayout.core.widgets.Barrier) this.getHighSpeedVideoSizesFor).getBarrierType();
            if (barrierType == 0 || barrierType == 1) {
                this.getHighSpeedVideoSizesFor.setX(this.start.value);
            } else {
                this.getHighSpeedVideoSizesFor.setY(this.start.value);
            }
        }
    }
}
