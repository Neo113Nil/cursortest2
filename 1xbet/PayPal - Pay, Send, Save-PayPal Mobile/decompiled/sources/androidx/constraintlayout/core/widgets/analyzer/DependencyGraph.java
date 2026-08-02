package androidx.constraintlayout.core.widgets.analyzer;

/* loaded from: classes7.dex */
public class DependencyGraph {
    private androidx.constraintlayout.core.widgets.ConstraintWidgetContainer getHighResolutionOutputSizeshNQ4ISI;
    private androidx.constraintlayout.core.widgets.ConstraintWidgetContainer getHighSpeedVideoSizesFor;
    private boolean getHighSpeedVideoSizes = true;
    private boolean getInputFormats = true;
    private java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> getOutputMinFrameDuration = new java.util.ArrayList<>();
    private java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.RunGroup> getOutputFormats = new java.util.ArrayList<>();
    private androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer getHighSpeedVideoFpsRangesFor = null;
    private androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure Camera2StreamConfigurationMap = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure();
    java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.RunGroup> getHighSpeedVideoFpsRanges = new java.util.ArrayList<>();

    public DependencyGraph(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer) {
        this.getHighSpeedVideoSizesFor = constraintWidgetContainer;
        this.getHighResolutionOutputSizeshNQ4ISI = constraintWidgetContainer;
    }

    public void setMeasurer(androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer measurer) {
        this.getHighSpeedVideoFpsRangesFor = measurer;
    }

    private int getHighSpeedVideoFpsRangesFor(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer, int i) {
        long wrapDimension;
        int size = this.getHighSpeedVideoFpsRanges.size();
        long j = 0;
        int i2 = 0;
        long j2 = 0;
        while (i2 < size) {
            androidx.constraintlayout.core.widgets.analyzer.RunGroup runGroup = this.getHighSpeedVideoFpsRanges.get(i2);
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun = runGroup.getHighResolutionOutputSizeshNQ4ISI;
            if (!(widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.ChainRun) ? !(i != 0 ? (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun) : (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun)) : ((androidx.constraintlayout.core.widgets.analyzer.ChainRun) widgetRun).orientation != i) {
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode = i == 0 ? constraintWidgetContainer.mHorizontalRun.start : constraintWidgetContainer.mVerticalRun.start;
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode2 = i == 0 ? constraintWidgetContainer.mHorizontalRun.end : constraintWidgetContainer.mVerticalRun.end;
                boolean contains = runGroup.getHighResolutionOutputSizeshNQ4ISI.start.getHighSpeedVideoSizesFor.contains(dependencyNode);
                boolean contains2 = runGroup.getHighResolutionOutputSizeshNQ4ISI.end.getHighSpeedVideoSizesFor.contains(dependencyNode2);
                long wrapDimension2 = runGroup.getHighResolutionOutputSizeshNQ4ISI.getWrapDimension();
                if (contains && contains2) {
                    long Camera2StreamConfigurationMap = runGroup.Camera2StreamConfigurationMap(runGroup.getHighResolutionOutputSizeshNQ4ISI.start, j);
                    long highResolutionOutputSizeshNQ4ISI = runGroup.getHighResolutionOutputSizeshNQ4ISI(runGroup.getHighResolutionOutputSizeshNQ4ISI.end, j);
                    long j3 = Camera2StreamConfigurationMap - wrapDimension2;
                    if (j3 >= (-runGroup.getHighResolutionOutputSizeshNQ4ISI.end.Camera2StreamConfigurationMap)) {
                        j3 += runGroup.getHighResolutionOutputSizeshNQ4ISI.end.Camera2StreamConfigurationMap;
                    }
                    long j4 = ((-highResolutionOutputSizeshNQ4ISI) - wrapDimension2) - runGroup.getHighResolutionOutputSizeshNQ4ISI.start.Camera2StreamConfigurationMap;
                    if (j4 >= runGroup.getHighResolutionOutputSizeshNQ4ISI.start.Camera2StreamConfigurationMap) {
                        j4 -= runGroup.getHighResolutionOutputSizeshNQ4ISI.start.Camera2StreamConfigurationMap;
                    }
                    float biasPercent = runGroup.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor.getBiasPercent(i);
                    float f = biasPercent > 0.0f ? (long) ((j4 / biasPercent) + (j3 / (1.0f - biasPercent))) : 0L;
                    wrapDimension = (runGroup.getHighResolutionOutputSizeshNQ4ISI.start.Camera2StreamConfigurationMap + ((((long) ((f * biasPercent) + 0.5f)) + wrapDimension2) + ((long) ((f * (1.0f - biasPercent)) + 0.5f)))) - runGroup.getHighResolutionOutputSizeshNQ4ISI.end.Camera2StreamConfigurationMap;
                } else if (contains) {
                    wrapDimension = java.lang.Math.max(runGroup.Camera2StreamConfigurationMap(runGroup.getHighResolutionOutputSizeshNQ4ISI.start, runGroup.getHighResolutionOutputSizeshNQ4ISI.start.Camera2StreamConfigurationMap), runGroup.getHighResolutionOutputSizeshNQ4ISI.start.Camera2StreamConfigurationMap + wrapDimension2);
                } else if (contains2) {
                    wrapDimension = java.lang.Math.max(-runGroup.getHighResolutionOutputSizeshNQ4ISI(runGroup.getHighResolutionOutputSizeshNQ4ISI.end, runGroup.getHighResolutionOutputSizeshNQ4ISI.end.Camera2StreamConfigurationMap), (-runGroup.getHighResolutionOutputSizeshNQ4ISI.end.Camera2StreamConfigurationMap) + wrapDimension2);
                } else {
                    wrapDimension = (runGroup.getHighResolutionOutputSizeshNQ4ISI.start.Camera2StreamConfigurationMap + runGroup.getHighResolutionOutputSizeshNQ4ISI.getWrapDimension()) - runGroup.getHighResolutionOutputSizeshNQ4ISI.end.Camera2StreamConfigurationMap;
                }
            } else {
                wrapDimension = j;
            }
            j2 = java.lang.Math.max(j2, wrapDimension);
            i2++;
            j = 0;
        }
        return (int) j2;
    }

    public void defineTerminalWidgets(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2) {
        if (this.getHighSpeedVideoSizes) {
            buildGraph();
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintWidget> it = this.getHighSpeedVideoSizesFor.mChildren.iterator();
            boolean z = false;
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.ConstraintWidget next = it.next();
                next.isTerminalWidget[0] = true;
                next.isTerminalWidget[1] = true;
                if (next instanceof androidx.constraintlayout.core.widgets.Barrier) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            java.util.Iterator<androidx.constraintlayout.core.widgets.analyzer.RunGroup> it2 = this.getHighSpeedVideoFpsRanges.iterator();
            while (it2.hasNext()) {
                androidx.constraintlayout.core.widgets.analyzer.RunGroup next2 = it2.next();
                boolean z2 = dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z3 = dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (z2) {
                    androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun = next2.getHighResolutionOutputSizeshNQ4ISI;
                    if (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun) {
                        next2.getHighResolutionOutputSizeshNQ4ISI(widgetRun, 0);
                    }
                }
                if (z3) {
                    androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun2 = next2.getHighResolutionOutputSizeshNQ4ISI;
                    if (widgetRun2 instanceof androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun) {
                        next2.getHighResolutionOutputSizeshNQ4ISI(widgetRun2, 1);
                    }
                }
            }
        }
    }

    public boolean directMeasure(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (this.getHighSpeedVideoSizes || this.getInputFormats) {
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintWidget> it = this.getHighSpeedVideoSizesFor.mChildren.iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.ConstraintWidget next = it.next();
                next.ensureWidgetRuns();
                next.measured = false;
                next.mHorizontalRun.Camera2StreamConfigurationMap();
                next.mVerticalRun.Camera2StreamConfigurationMap();
            }
            this.getHighSpeedVideoSizesFor.ensureWidgetRuns();
            this.getHighSpeedVideoSizesFor.measured = false;
            this.getHighSpeedVideoSizesFor.mHorizontalRun.Camera2StreamConfigurationMap();
            this.getHighSpeedVideoSizesFor.mVerticalRun.Camera2StreamConfigurationMap();
            this.getInputFormats = false;
        }
        Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI);
        this.getHighSpeedVideoSizesFor.setX(0);
        this.getHighSpeedVideoSizesFor.setY(0);
        androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.getHighSpeedVideoSizesFor.getDimensionBehaviour(0);
        androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.getHighSpeedVideoSizesFor.getDimensionBehaviour(1);
        if (this.getHighSpeedVideoSizes) {
            buildGraph();
        }
        int x = this.getHighSpeedVideoSizesFor.getX();
        int y = this.getHighSpeedVideoSizesFor.getY();
        this.getHighSpeedVideoSizesFor.mHorizontalRun.start.resolve(x);
        this.getHighSpeedVideoSizesFor.mVerticalRun.start.resolve(y);
        measureWidgets();
        if (dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
            if (z) {
                java.util.Iterator<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> it2 = this.getOutputMinFrameDuration.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!it2.next().getHighSpeedVideoSizes()) {
                        z = false;
                        break;
                    }
                }
            }
            if (z && dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.getHighSpeedVideoSizesFor.setHorizontalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED);
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer = this.getHighSpeedVideoSizesFor;
                constraintWidgetContainer.setWidth(getHighSpeedVideoFpsRangesFor(constraintWidgetContainer, 0));
                this.getHighSpeedVideoSizesFor.mHorizontalRun.getHighSpeedVideoFpsRangesFor.resolve(this.getHighSpeedVideoSizesFor.getWidth());
            }
            if (z && dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.getHighSpeedVideoSizesFor.setVerticalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED);
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer2 = this.getHighSpeedVideoSizesFor;
                constraintWidgetContainer2.setHeight(getHighSpeedVideoFpsRangesFor(constraintWidgetContainer2, 1));
                this.getHighSpeedVideoSizesFor.mVerticalRun.getHighSpeedVideoFpsRangesFor.resolve(this.getHighSpeedVideoSizesFor.getHeight());
            }
        }
        if (this.getHighSpeedVideoSizesFor.mListDimensionBehaviors[0] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED || this.getHighSpeedVideoSizesFor.mListDimensionBehaviors[0] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int width = this.getHighSpeedVideoSizesFor.getWidth() + x;
            this.getHighSpeedVideoSizesFor.mHorizontalRun.end.resolve(width);
            this.getHighSpeedVideoSizesFor.mHorizontalRun.getHighSpeedVideoFpsRangesFor.resolve(width - x);
            measureWidgets();
            if (this.getHighSpeedVideoSizesFor.mListDimensionBehaviors[1] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED || this.getHighSpeedVideoSizesFor.mListDimensionBehaviors[1] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int height = this.getHighSpeedVideoSizesFor.getHeight() + y;
                this.getHighSpeedVideoSizesFor.mVerticalRun.end.resolve(height);
                this.getHighSpeedVideoSizesFor.mVerticalRun.getHighSpeedVideoFpsRangesFor.resolve(height - y);
            }
            measureWidgets();
            z2 = true;
        } else {
            z2 = false;
        }
        java.util.Iterator<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> it3 = this.getOutputMinFrameDuration.iterator();
        while (it3.hasNext()) {
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun next2 = it3.next();
            if (next2.getHighSpeedVideoSizesFor != this.getHighSpeedVideoSizesFor || next2.getHighResolutionOutputSizeshNQ4ISI) {
                next2.applyToWidget();
            }
        }
        java.util.Iterator<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> it4 = this.getOutputMinFrameDuration.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z3 = true;
                break;
            }
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun next3 = it4.next();
            if (z2 || next3.getHighSpeedVideoSizesFor != this.getHighSpeedVideoSizesFor) {
                if (!next3.start.resolved) {
                    break;
                }
                if (!next3.end.resolved) {
                    if (!(next3 instanceof androidx.constraintlayout.core.widgets.analyzer.GuidelineReference)) {
                        break;
                    }
                }
                if (!next3.getHighSpeedVideoFpsRangesFor.resolved && !(next3 instanceof androidx.constraintlayout.core.widgets.analyzer.ChainRun) && !(next3 instanceof androidx.constraintlayout.core.widgets.analyzer.GuidelineReference)) {
                    break;
                }
            }
        }
        this.getHighSpeedVideoSizesFor.setHorizontalDimensionBehaviour(dimensionBehaviour);
        this.getHighSpeedVideoSizesFor.setVerticalDimensionBehaviour(dimensionBehaviour2);
        return z3;
    }

    public boolean directMeasureSetup(boolean z) {
        if (this.getHighSpeedVideoSizes) {
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintWidget> it = this.getHighSpeedVideoSizesFor.mChildren.iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.ConstraintWidget next = it.next();
                next.ensureWidgetRuns();
                next.measured = false;
                next.mHorizontalRun.getHighSpeedVideoFpsRangesFor.resolved = false;
                next.mHorizontalRun.getHighResolutionOutputSizeshNQ4ISI = false;
                next.mHorizontalRun.Camera2StreamConfigurationMap();
                next.mVerticalRun.getHighSpeedVideoFpsRangesFor.resolved = false;
                next.mVerticalRun.getHighResolutionOutputSizeshNQ4ISI = false;
                next.mVerticalRun.Camera2StreamConfigurationMap();
            }
            this.getHighSpeedVideoSizesFor.ensureWidgetRuns();
            this.getHighSpeedVideoSizesFor.measured = false;
            this.getHighSpeedVideoSizesFor.mHorizontalRun.getHighSpeedVideoFpsRangesFor.resolved = false;
            this.getHighSpeedVideoSizesFor.mHorizontalRun.getHighResolutionOutputSizeshNQ4ISI = false;
            this.getHighSpeedVideoSizesFor.mHorizontalRun.Camera2StreamConfigurationMap();
            this.getHighSpeedVideoSizesFor.mVerticalRun.getHighSpeedVideoFpsRangesFor.resolved = false;
            this.getHighSpeedVideoSizesFor.mVerticalRun.getHighResolutionOutputSizeshNQ4ISI = false;
            this.getHighSpeedVideoSizesFor.mVerticalRun.Camera2StreamConfigurationMap();
            buildGraph();
        }
        Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI);
        this.getHighSpeedVideoSizesFor.setX(0);
        this.getHighSpeedVideoSizesFor.setY(0);
        this.getHighSpeedVideoSizesFor.mHorizontalRun.start.resolve(0);
        this.getHighSpeedVideoSizesFor.mVerticalRun.start.resolve(0);
        return true;
    }

    public boolean directMeasureWithOrientation(boolean z, int i) {
        boolean z2;
        boolean z3 = false;
        androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.getHighSpeedVideoSizesFor.getDimensionBehaviour(0);
        androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.getHighSpeedVideoSizesFor.getDimensionBehaviour(1);
        int x = this.getHighSpeedVideoSizesFor.getX();
        int y = this.getHighSpeedVideoSizesFor.getY();
        if (z && (dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
            java.util.Iterator<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> it = this.getOutputMinFrameDuration.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun next = it.next();
                if (next.orientation == i && !next.getHighSpeedVideoSizes()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    this.getHighSpeedVideoSizesFor.setHorizontalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED);
                    androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer = this.getHighSpeedVideoSizesFor;
                    constraintWidgetContainer.setWidth(getHighSpeedVideoFpsRangesFor(constraintWidgetContainer, 0));
                    this.getHighSpeedVideoSizesFor.mHorizontalRun.getHighSpeedVideoFpsRangesFor.resolve(this.getHighSpeedVideoSizesFor.getWidth());
                }
            } else if (z && dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.getHighSpeedVideoSizesFor.setVerticalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED);
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer2 = this.getHighSpeedVideoSizesFor;
                constraintWidgetContainer2.setHeight(getHighSpeedVideoFpsRangesFor(constraintWidgetContainer2, 1));
                this.getHighSpeedVideoSizesFor.mVerticalRun.getHighSpeedVideoFpsRangesFor.resolve(this.getHighSpeedVideoSizesFor.getHeight());
            }
        }
        if (i == 0) {
            if (this.getHighSpeedVideoSizesFor.mListDimensionBehaviors[0] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED || this.getHighSpeedVideoSizesFor.mListDimensionBehaviors[0] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int width = this.getHighSpeedVideoSizesFor.getWidth() + x;
                this.getHighSpeedVideoSizesFor.mHorizontalRun.end.resolve(width);
                this.getHighSpeedVideoSizesFor.mHorizontalRun.getHighSpeedVideoFpsRangesFor.resolve(width - x);
                z2 = true;
            }
            z2 = false;
        } else {
            if (this.getHighSpeedVideoSizesFor.mListDimensionBehaviors[1] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED || this.getHighSpeedVideoSizesFor.mListDimensionBehaviors[1] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int height = this.getHighSpeedVideoSizesFor.getHeight() + y;
                this.getHighSpeedVideoSizesFor.mVerticalRun.end.resolve(height);
                this.getHighSpeedVideoSizesFor.mVerticalRun.getHighSpeedVideoFpsRangesFor.resolve(height - y);
                z2 = true;
            }
            z2 = false;
        }
        measureWidgets();
        java.util.Iterator<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> it2 = this.getOutputMinFrameDuration.iterator();
        while (it2.hasNext()) {
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun next2 = it2.next();
            if (next2.orientation == i && (next2.getHighSpeedVideoSizesFor != this.getHighSpeedVideoSizesFor || next2.getHighResolutionOutputSizeshNQ4ISI)) {
                next2.applyToWidget();
            }
        }
        java.util.Iterator<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> it3 = this.getOutputMinFrameDuration.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z3 = true;
                break;
            }
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun next3 = it3.next();
            if (next3.orientation == i && (z2 || next3.getHighSpeedVideoSizesFor != this.getHighSpeedVideoSizesFor)) {
                if (!next3.start.resolved) {
                    break;
                }
                if (!next3.end.resolved) {
                    break;
                }
                if (!(next3 instanceof androidx.constraintlayout.core.widgets.analyzer.ChainRun) && !next3.getHighSpeedVideoFpsRangesFor.resolved) {
                    break;
                }
            }
        }
        this.getHighSpeedVideoSizesFor.setHorizontalDimensionBehaviour(dimensionBehaviour);
        this.getHighSpeedVideoSizesFor.setVerticalDimensionBehaviour(dimensionBehaviour2);
        return z3;
    }

    private void Camera2StreamConfigurationMap(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        this.Camera2StreamConfigurationMap.horizontalBehavior = dimensionBehaviour;
        this.Camera2StreamConfigurationMap.verticalBehavior = dimensionBehaviour2;
        this.Camera2StreamConfigurationMap.horizontalDimension = i;
        this.Camera2StreamConfigurationMap.verticalDimension = i2;
        this.getHighSpeedVideoFpsRangesFor.measure(constraintWidget, this.Camera2StreamConfigurationMap);
        constraintWidget.setWidth(this.Camera2StreamConfigurationMap.measuredWidth);
        constraintWidget.setHeight(this.Camera2StreamConfigurationMap.measuredHeight);
        constraintWidget.setHasBaseline(this.Camera2StreamConfigurationMap.measuredHasBaseline);
        constraintWidget.setBaselineDistance(this.Camera2StreamConfigurationMap.measuredBaseline);
    }

    private boolean Camera2StreamConfigurationMap(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer) {
        int i;
        androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintWidget> it = constraintWidgetContainer.mChildren.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.widgets.ConstraintWidget next = it.next();
            androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = next.mListDimensionBehaviors[0];
            androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = next.mListDimensionBehaviors[1];
            if (next.getVisibility() == 8) {
                next.measured = true;
            } else {
                if (next.mMatchConstraintPercentWidth < 1.0f && dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    next.mMatchConstraintDefaultWidth = 2;
                }
                if (next.mMatchConstraintPercentHeight < 1.0f && dimensionBehaviour3 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    next.mMatchConstraintDefaultHeight = 2;
                }
                if (next.getDimensionRatio() > 0.0f) {
                    if (dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && (dimensionBehaviour3 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour3 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED)) {
                        next.mMatchConstraintDefaultWidth = 3;
                    } else if (dimensionBehaviour3 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && (dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED)) {
                        next.mMatchConstraintDefaultHeight = 3;
                    } else if (dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && dimensionBehaviour3 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        if (next.mMatchConstraintDefaultWidth == 0) {
                            next.mMatchConstraintDefaultWidth = 3;
                        }
                        if (next.mMatchConstraintDefaultHeight == 0) {
                            next.mMatchConstraintDefaultHeight = 3;
                        }
                    }
                }
                if (dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && next.mMatchConstraintDefaultWidth == 1 && (next.mLeft.mTarget == null || next.mRight.mTarget == null)) {
                    dimensionBehaviour2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviour2;
                androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = (dimensionBehaviour3 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && next.mMatchConstraintDefaultHeight == 1 && (next.mTop.mTarget == null || next.mBottom.mTarget == null)) ? androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT : dimensionBehaviour3;
                next.mHorizontalRun.mDimensionBehavior = dimensionBehaviour4;
                next.mHorizontalRun.matchConstraintsType = next.mMatchConstraintDefaultWidth;
                next.mVerticalRun.mDimensionBehavior = dimensionBehaviour5;
                next.mVerticalRun.matchConstraintsType = next.mMatchConstraintDefaultHeight;
                if ((dimensionBehaviour4 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT || dimensionBehaviour4 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour4 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (dimensionBehaviour5 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT || dimensionBehaviour5 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour5 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
                    int width = next.getWidth();
                    if (dimensionBehaviour4 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                        i = (constraintWidgetContainer.getWidth() - next.mLeft.mMargin) - next.mRight.mMargin;
                        dimensionBehaviour4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
                    } else {
                        i = width;
                    }
                    int height = next.getHeight();
                    if (dimensionBehaviour5 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                        int height2 = constraintWidgetContainer.getHeight();
                        int i2 = next.mTop.mMargin;
                        int i3 = next.mBottom.mMargin;
                        dimensionBehaviour = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
                        height = (height2 - i2) - i3;
                    } else {
                        dimensionBehaviour = dimensionBehaviour5;
                    }
                    Camera2StreamConfigurationMap(next, dimensionBehaviour4, i, dimensionBehaviour, height);
                    next.mHorizontalRun.getHighSpeedVideoFpsRangesFor.resolve(next.getWidth());
                    next.mVerticalRun.getHighSpeedVideoFpsRangesFor.resolve(next.getHeight());
                    next.measured = true;
                } else {
                    if (dimensionBehaviour4 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && (dimensionBehaviour5 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour5 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED)) {
                        if (next.mMatchConstraintDefaultWidth == 3) {
                            if (dimensionBehaviour5 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                                Camera2StreamConfigurationMap(next, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0);
                            }
                            int height3 = next.getHeight();
                            int i4 = (int) ((height3 * next.mDimensionRatio) + 0.5f);
                            androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
                            Camera2StreamConfigurationMap(next, dimensionBehaviour6, i4, dimensionBehaviour6, height3);
                            next.mHorizontalRun.getHighSpeedVideoFpsRangesFor.resolve(next.getWidth());
                            next.mVerticalRun.getHighSpeedVideoFpsRangesFor.resolve(next.getHeight());
                            next.measured = true;
                        } else if (next.mMatchConstraintDefaultWidth == 1) {
                            Camera2StreamConfigurationMap(next, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0, dimensionBehaviour5, 0);
                            next.mHorizontalRun.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI = next.getWidth();
                        } else if (next.mMatchConstraintDefaultWidth == 2) {
                            if (constraintWidgetContainer.mListDimensionBehaviors[0] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED || constraintWidgetContainer.mListDimensionBehaviors[0] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                                Camera2StreamConfigurationMap(next, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED, (int) ((next.mMatchConstraintPercentWidth * constraintWidgetContainer.getWidth()) + 0.5f), dimensionBehaviour5, next.getHeight());
                                next.mHorizontalRun.getHighSpeedVideoFpsRangesFor.resolve(next.getWidth());
                                next.mVerticalRun.getHighSpeedVideoFpsRangesFor.resolve(next.getHeight());
                                next.measured = true;
                            }
                        } else if (next.mListAnchors[0].mTarget == null || next.mListAnchors[1].mTarget == null) {
                            Camera2StreamConfigurationMap(next, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0, dimensionBehaviour5, 0);
                            next.mHorizontalRun.getHighSpeedVideoFpsRangesFor.resolve(next.getWidth());
                            next.mVerticalRun.getHighSpeedVideoFpsRangesFor.resolve(next.getHeight());
                            next.measured = true;
                        }
                    }
                    if (dimensionBehaviour5 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && (dimensionBehaviour4 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour4 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED)) {
                        if (next.mMatchConstraintDefaultHeight == 3) {
                            if (dimensionBehaviour4 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                                Camera2StreamConfigurationMap(next, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0);
                            }
                            int width2 = next.getWidth();
                            float f = next.mDimensionRatio;
                            if (next.getDimensionRatioSide() == -1) {
                                f = 1.0f / f;
                            }
                            androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
                            Camera2StreamConfigurationMap(next, dimensionBehaviour7, width2, dimensionBehaviour7, (int) ((width2 * f) + 0.5f));
                            next.mHorizontalRun.getHighSpeedVideoFpsRangesFor.resolve(next.getWidth());
                            next.mVerticalRun.getHighSpeedVideoFpsRangesFor.resolve(next.getHeight());
                            next.measured = true;
                        } else if (next.mMatchConstraintDefaultHeight == 1) {
                            Camera2StreamConfigurationMap(next, dimensionBehaviour4, 0, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0);
                            next.mVerticalRun.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI = next.getHeight();
                        } else if (next.mMatchConstraintDefaultHeight == 2) {
                            if (constraintWidgetContainer.mListDimensionBehaviors[1] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED || constraintWidgetContainer.mListDimensionBehaviors[1] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                                Camera2StreamConfigurationMap(next, dimensionBehaviour4, next.getWidth(), androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED, (int) ((next.mMatchConstraintPercentHeight * constraintWidgetContainer.getHeight()) + 0.5f));
                                next.mHorizontalRun.getHighSpeedVideoFpsRangesFor.resolve(next.getWidth());
                                next.mVerticalRun.getHighSpeedVideoFpsRangesFor.resolve(next.getHeight());
                                next.measured = true;
                            }
                        } else if (next.mListAnchors[2].mTarget == null || next.mListAnchors[3].mTarget == null) {
                            Camera2StreamConfigurationMap(next, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0, dimensionBehaviour5, 0);
                            next.mHorizontalRun.getHighSpeedVideoFpsRangesFor.resolve(next.getWidth());
                            next.mVerticalRun.getHighSpeedVideoFpsRangesFor.resolve(next.getHeight());
                            next.measured = true;
                        }
                    }
                    if (dimensionBehaviour4 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && dimensionBehaviour5 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        if (next.mMatchConstraintDefaultWidth == 1 || next.mMatchConstraintDefaultHeight == 1) {
                            Camera2StreamConfigurationMap(next, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, 0);
                            next.mHorizontalRun.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI = next.getWidth();
                            next.mVerticalRun.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI = next.getHeight();
                        } else if (next.mMatchConstraintDefaultHeight == 2 && next.mMatchConstraintDefaultWidth == 2 && constraintWidgetContainer.mListDimensionBehaviors[0] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED && constraintWidgetContainer.mListDimensionBehaviors[1] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED) {
                            float f2 = next.mMatchConstraintPercentWidth;
                            int height4 = (int) ((next.mMatchConstraintPercentHeight * constraintWidgetContainer.getHeight()) + 0.5f);
                            androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
                            Camera2StreamConfigurationMap(next, dimensionBehaviour8, (int) ((f2 * constraintWidgetContainer.getWidth()) + 0.5f), dimensionBehaviour8, height4);
                            next.mHorizontalRun.getHighSpeedVideoFpsRangesFor.resolve(next.getWidth());
                            next.mVerticalRun.getHighSpeedVideoFpsRangesFor.resolve(next.getHeight());
                            next.measured = true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public void measureWidgets() {
        java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintWidget> it = this.getHighSpeedVideoSizesFor.mChildren.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.widgets.ConstraintWidget next = it.next();
            if (!next.measured) {
                boolean z = false;
                androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour = next.mListDimensionBehaviors[0];
                androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = next.mListDimensionBehaviors[1];
                int i = next.mMatchConstraintDefaultWidth;
                int i2 = next.mMatchConstraintDefaultHeight;
                boolean z2 = dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i == 1);
                if (dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                boolean z3 = next.mHorizontalRun.getHighSpeedVideoFpsRangesFor.resolved;
                boolean z4 = next.mVerticalRun.getHighSpeedVideoFpsRangesFor.resolved;
                if (z3 && z4) {
                    Camera2StreamConfigurationMap(next, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED, next.mHorizontalRun.getHighSpeedVideoFpsRangesFor.value, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED, next.mVerticalRun.getHighSpeedVideoFpsRangesFor.value);
                    next.measured = true;
                } else if (z3 && z) {
                    Camera2StreamConfigurationMap(next, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED, next.mHorizontalRun.getHighSpeedVideoFpsRangesFor.value, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, next.mVerticalRun.getHighSpeedVideoFpsRangesFor.value);
                    if (dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        next.mVerticalRun.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI = next.getHeight();
                    } else {
                        next.mVerticalRun.getHighSpeedVideoFpsRangesFor.resolve(next.getHeight());
                        next.measured = true;
                    }
                } else if (z4 && z2) {
                    Camera2StreamConfigurationMap(next, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT, next.mHorizontalRun.getHighSpeedVideoFpsRangesFor.value, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED, next.mVerticalRun.getHighSpeedVideoFpsRangesFor.value);
                    if (dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        next.mHorizontalRun.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI = next.getWidth();
                    } else {
                        next.mHorizontalRun.getHighSpeedVideoFpsRangesFor.resolve(next.getWidth());
                        next.measured = true;
                    }
                }
                if (next.measured && next.mVerticalRun.Camera2StreamConfigurationMap != null) {
                    next.mVerticalRun.Camera2StreamConfigurationMap.resolve(next.getBaselineDistance());
                }
            }
        }
    }

    public void invalidateGraph() {
        this.getHighSpeedVideoSizes = true;
    }

    public void invalidateMeasures() {
        this.getInputFormats = true;
    }

    public void buildGraph() {
        buildGraph(this.getOutputMinFrameDuration);
        this.getHighSpeedVideoFpsRanges.clear();
        androidx.constraintlayout.core.widgets.analyzer.RunGroup.getHighSpeedVideoFpsRangesFor = 0;
        getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizesFor.mHorizontalRun, 0, this.getHighSpeedVideoFpsRanges);
        getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizesFor.mVerticalRun, 1, this.getHighSpeedVideoFpsRanges);
        this.getHighSpeedVideoSizes = false;
    }

    public void buildGraph(java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> arrayList) {
        arrayList.clear();
        androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun horizontalWidgetRun = this.getHighResolutionOutputSizeshNQ4ISI.mHorizontalRun;
        java.util.HashSet hashSet = null;
        horizontalWidgetRun.getHighSpeedVideoSizes = null;
        horizontalWidgetRun.start.clear();
        horizontalWidgetRun.end.clear();
        horizontalWidgetRun.getHighSpeedVideoFpsRangesFor.clear();
        horizontalWidgetRun.getHighResolutionOutputSizeshNQ4ISI = false;
        this.getHighResolutionOutputSizeshNQ4ISI.mVerticalRun.getHighSpeedVideoFpsRanges();
        arrayList.add(this.getHighResolutionOutputSizeshNQ4ISI.mHorizontalRun);
        arrayList.add(this.getHighResolutionOutputSizeshNQ4ISI.mVerticalRun);
        java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintWidget> it = this.getHighResolutionOutputSizeshNQ4ISI.mChildren.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.widgets.ConstraintWidget next = it.next();
            if (next instanceof androidx.constraintlayout.core.widgets.Guideline) {
                arrayList.add(new androidx.constraintlayout.core.widgets.analyzer.GuidelineReference(next));
            } else {
                if (next.isInHorizontalChain()) {
                    if (next.horizontalChainRun == null) {
                        next.horizontalChainRun = new androidx.constraintlayout.core.widgets.analyzer.ChainRun(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new java.util.HashSet();
                    }
                    hashSet.add(next.horizontalChainRun);
                } else {
                    arrayList.add(next.mHorizontalRun);
                }
                if (next.isInVerticalChain()) {
                    if (next.verticalChainRun == null) {
                        next.verticalChainRun = new androidx.constraintlayout.core.widgets.analyzer.ChainRun(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new java.util.HashSet();
                    }
                    hashSet.add(next.verticalChainRun);
                } else {
                    arrayList.add(next.mVerticalRun);
                }
                if (next instanceof androidx.constraintlayout.core.widgets.HelperWidget) {
                    arrayList.add(new androidx.constraintlayout.core.widgets.analyzer.HelperReferences(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        java.util.Iterator<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().getHighSpeedVideoFpsRanges();
        }
        java.util.Iterator<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun next2 = it3.next();
            if (next2.getHighSpeedVideoSizesFor != this.getHighResolutionOutputSizeshNQ4ISI) {
                next2.getHighResolutionOutputSizeshNQ4ISI();
            }
        }
    }

    private void getHighSpeedVideoFpsRangesFor(androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode, int i, int i2, androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode2, java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.RunGroup> arrayList, androidx.constraintlayout.core.widgets.analyzer.RunGroup runGroup) {
        androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun = dependencyNode.getHighResolutionOutputSizeshNQ4ISI;
        if (widgetRun.getHighSpeedVideoSizes != null || widgetRun == this.getHighSpeedVideoSizesFor.mHorizontalRun || widgetRun == this.getHighSpeedVideoSizesFor.mVerticalRun) {
            return;
        }
        if (runGroup == null) {
            runGroup = new androidx.constraintlayout.core.widgets.analyzer.RunGroup(widgetRun, i2);
            arrayList.add(runGroup);
        }
        widgetRun.getHighSpeedVideoSizes = runGroup;
        runGroup.getInputFormats.add(widgetRun);
        runGroup.getHighSpeedVideoSizesFor = widgetRun;
        for (androidx.constraintlayout.core.widgets.analyzer.Dependency dependency : widgetRun.start.getHighSpeedVideoSizes) {
            if (dependency instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode) {
                getHighSpeedVideoFpsRangesFor((androidx.constraintlayout.core.widgets.analyzer.DependencyNode) dependency, i, 0, dependencyNode2, arrayList, runGroup);
            }
        }
        for (androidx.constraintlayout.core.widgets.analyzer.Dependency dependency2 : widgetRun.end.getHighSpeedVideoSizes) {
            if (dependency2 instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode) {
                getHighSpeedVideoFpsRangesFor((androidx.constraintlayout.core.widgets.analyzer.DependencyNode) dependency2, i, 1, dependencyNode2, arrayList, runGroup);
            }
        }
        if (i == 1 && (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun)) {
            for (androidx.constraintlayout.core.widgets.analyzer.Dependency dependency3 : ((androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun) widgetRun).baseline.getHighSpeedVideoSizes) {
                if (dependency3 instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode) {
                    getHighSpeedVideoFpsRangesFor((androidx.constraintlayout.core.widgets.analyzer.DependencyNode) dependency3, i, 2, dependencyNode2, arrayList, runGroup);
                }
            }
        }
        for (androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode3 : widgetRun.start.getHighSpeedVideoSizesFor) {
            if (dependencyNode3 == dependencyNode2) {
                runGroup.getHighSpeedVideoFpsRanges = true;
            }
            getHighSpeedVideoFpsRangesFor(dependencyNode3, i, 0, dependencyNode2, arrayList, runGroup);
        }
        for (androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode4 : widgetRun.end.getHighSpeedVideoSizesFor) {
            if (dependencyNode4 == dependencyNode2) {
                runGroup.getHighSpeedVideoFpsRanges = true;
            }
            getHighSpeedVideoFpsRangesFor(dependencyNode4, i, 1, dependencyNode2, arrayList, runGroup);
        }
        if (i == 1 && (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun)) {
            java.util.Iterator<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> it = ((androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun) widgetRun).baseline.getHighSpeedVideoSizesFor.iterator();
            while (it.hasNext()) {
                getHighSpeedVideoFpsRangesFor(it.next(), i, 2, dependencyNode2, arrayList, runGroup);
            }
        }
    }

    private void getHighSpeedVideoFpsRangesFor(androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun, int i, java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.RunGroup> arrayList) {
        for (androidx.constraintlayout.core.widgets.analyzer.Dependency dependency : widgetRun.start.getHighSpeedVideoSizes) {
            if (dependency instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode) {
                getHighSpeedVideoFpsRangesFor((androidx.constraintlayout.core.widgets.analyzer.DependencyNode) dependency, i, 0, widgetRun.end, arrayList, null);
            } else if (dependency instanceof androidx.constraintlayout.core.widgets.analyzer.WidgetRun) {
                getHighSpeedVideoFpsRangesFor(((androidx.constraintlayout.core.widgets.analyzer.WidgetRun) dependency).start, i, 0, widgetRun.end, arrayList, null);
            }
        }
        for (androidx.constraintlayout.core.widgets.analyzer.Dependency dependency2 : widgetRun.end.getHighSpeedVideoSizes) {
            if (dependency2 instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode) {
                getHighSpeedVideoFpsRangesFor((androidx.constraintlayout.core.widgets.analyzer.DependencyNode) dependency2, i, 1, widgetRun.start, arrayList, null);
            } else if (dependency2 instanceof androidx.constraintlayout.core.widgets.analyzer.WidgetRun) {
                getHighSpeedVideoFpsRangesFor(((androidx.constraintlayout.core.widgets.analyzer.WidgetRun) dependency2).end, i, 1, widgetRun.start, arrayList, null);
            }
        }
        if (i == 1) {
            for (androidx.constraintlayout.core.widgets.analyzer.Dependency dependency3 : ((androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun) widgetRun).baseline.getHighSpeedVideoSizes) {
                if (dependency3 instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode) {
                    getHighSpeedVideoFpsRangesFor((androidx.constraintlayout.core.widgets.analyzer.DependencyNode) dependency3, i, 2, null, arrayList, null);
                }
            }
        }
    }
}
