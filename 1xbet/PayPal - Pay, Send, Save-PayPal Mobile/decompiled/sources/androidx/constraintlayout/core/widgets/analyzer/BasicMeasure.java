package androidx.constraintlayout.core.widgets.analyzer;

/* loaded from: classes7.dex */
public class BasicMeasure {
    public static final int AT_MOST = Integer.MIN_VALUE;
    public static final int EXACTLY = 1073741824;
    public static final int FIXED = -3;
    public static final int MATCH_PARENT = -1;
    public static final int UNSPECIFIED = 0;
    public static final int WRAP_CONTENT = -2;
    private final java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> Camera2StreamConfigurationMap = new java.util.ArrayList<>();
    private androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure getHighResolutionOutputSizeshNQ4ISI = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure();
    private androidx.constraintlayout.core.widgets.ConstraintWidgetContainer getHighSpeedVideoFpsRangesFor;

    /* loaded from: classes.dex */
    public static class Measure {
        public static int SELF_DIMENSIONS = 0;
        public static int TRY_GIVEN_DIMENSIONS = 1;
        public static int USE_GIVEN_DIMENSIONS = 2;
        public androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour horizontalBehavior;
        public int horizontalDimension;
        public int measureStrategy;
        public int measuredBaseline;
        public boolean measuredHasBaseline;
        public int measuredHeight;
        public boolean measuredNeedsSolverPass;
        public int measuredWidth;
        public androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour verticalBehavior;
        public int verticalDimension;
    }

    /* loaded from: classes.dex */
    public interface Measurer {
        void didMeasures();

        void measure(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure measure);
    }

    public void updateHierarchy(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer) {
        this.Camera2StreamConfigurationMap.clear();
        int size = constraintWidgetContainer.mChildren.size();
        for (int i = 0; i < size; i++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = constraintWidgetContainer.mChildren.get(i);
            if (constraintWidget.getHorizontalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.getVerticalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                this.Camera2StreamConfigurationMap.add(constraintWidget);
            }
        }
        constraintWidgetContainer.invalidateGraph();
    }

    public BasicMeasure(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer) {
        this.getHighSpeedVideoFpsRangesFor = constraintWidgetContainer;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ba A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getHighSpeedVideoSizes(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer) {
        int size = constraintWidgetContainer.mChildren.size();
        boolean optimizeFor = constraintWidgetContainer.optimizeFor(64);
        androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer measurer = constraintWidgetContainer.getMeasurer();
        for (int i = 0; i < size; i++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = constraintWidgetContainer.mChildren.get(i);
            if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.Guideline) && !(constraintWidget instanceof androidx.constraintlayout.core.widgets.Barrier) && !constraintWidget.isInVirtualLayout() && (!optimizeFor || constraintWidget.mHorizontalRun == null || constraintWidget.mVerticalRun == null || !constraintWidget.mHorizontalRun.getHighSpeedVideoFpsRangesFor.resolved || !constraintWidget.mVerticalRun.getHighSpeedVideoFpsRangesFor.resolved)) {
                androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget.getDimensionBehaviour(0);
                androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget.getDimensionBehaviour(1);
                boolean z = dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultWidth != 1 && dimensionBehaviour2 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultHeight != 1;
                if (!z) {
                    if (constraintWidgetContainer.optimizeFor(1) && !(constraintWidget instanceof androidx.constraintlayout.core.widgets.VirtualLayout)) {
                        boolean z2 = (dimensionBehaviour2 != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.mMatchConstraintDefaultHeight != 0 || dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.isInHorizontalChain()) ? dimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultWidth == 0 && dimensionBehaviour2 != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && !constraintWidget.isInHorizontalChain() : true;
                        if ((dimensionBehaviour != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && dimensionBehaviour2 != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) || constraintWidget.mDimensionRatio <= 0.0f) {
                            z = z2;
                        }
                    }
                    getHighSpeedVideoSizes(measurer, constraintWidget, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS);
                    if (constraintWidgetContainer.mMetrics == null) {
                        constraintWidgetContainer.mMetrics.measuredWidgets++;
                    }
                }
                if (z) {
                }
                getHighSpeedVideoSizes(measurer, constraintWidget, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS);
                if (constraintWidgetContainer.mMetrics == null) {
                }
            }
        }
        measurer.didMeasures();
    }

    private void getHighResolutionOutputSizeshNQ4ISI(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer, int i, int i2, int i3) {
        long nanoTime = constraintWidgetContainer.mMetrics != null ? java.lang.System.nanoTime() : 0L;
        int minWidth = constraintWidgetContainer.getMinWidth();
        int minHeight = constraintWidgetContainer.getMinHeight();
        constraintWidgetContainer.setMinWidth(0);
        constraintWidgetContainer.setMinHeight(0);
        constraintWidgetContainer.setWidth(i2);
        constraintWidgetContainer.setHeight(i3);
        constraintWidgetContainer.setMinWidth(minWidth);
        constraintWidgetContainer.setMinHeight(minHeight);
        this.getHighSpeedVideoFpsRangesFor.setPass(i);
        this.getHighSpeedVideoFpsRangesFor.layout();
        if (constraintWidgetContainer.mMetrics != null) {
            long nanoTime2 = java.lang.System.nanoTime();
            constraintWidgetContainer.mMetrics.mSolverPasses++;
            constraintWidgetContainer.mMetrics.measuresLayoutDuration += nanoTime2 - nanoTime;
        }
    }

    public long solverMeasure(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10;
        boolean z;
        long j;
        androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer2;
        int i11;
        long j2;
        int i12;
        androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer measurer;
        int i13;
        int i14;
        int i15;
        boolean z2;
        boolean z3;
        int i16;
        boolean z4;
        androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer3 = constraintWidgetContainer;
        androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer measurer2 = constraintWidgetContainer.getMeasurer();
        int size = constraintWidgetContainer3.mChildren.size();
        int width = constraintWidgetContainer.getWidth();
        int height = constraintWidgetContainer.getHeight();
        boolean enabled = androidx.constraintlayout.core.widgets.Optimizer.enabled(i, 128);
        boolean z5 = enabled || androidx.constraintlayout.core.widgets.Optimizer.enabled(i, 64);
        if (z5) {
            for (int i17 = 0; i17 < size; i17++) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = constraintWidgetContainer3.mChildren.get(i17);
                boolean z6 = (constraintWidget.getHorizontalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && (constraintWidget.getVerticalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.getDimensionRatio() > 0.0f;
                if ((constraintWidget.isInHorizontalChain() && z6) || ((constraintWidget.isInVerticalChain() && z6) || (constraintWidget instanceof androidx.constraintlayout.core.widgets.VirtualLayout) || constraintWidget.isInHorizontalChain() || constraintWidget.isInVerticalChain())) {
                    z5 = false;
                    break;
                }
            }
            z5 = true;
        }
        if (z5 && androidx.constraintlayout.core.LinearSystem.sMetrics != null) {
            androidx.constraintlayout.core.LinearSystem.sMetrics.measures++;
        }
        boolean z7 = z5 & ((i4 == 1073741824 && i6 == 1073741824) || enabled);
        if (z7) {
            int min = java.lang.Math.min(constraintWidgetContainer.getMaxWidth(), i5);
            int min2 = java.lang.Math.min(constraintWidgetContainer.getMaxHeight(), i7);
            if (i4 == 1073741824 && constraintWidgetContainer.getWidth() != min) {
                constraintWidgetContainer3.setWidth(min);
                constraintWidgetContainer.invalidateGraph();
            }
            if (i6 == 1073741824 && constraintWidgetContainer.getHeight() != min2) {
                constraintWidgetContainer3.setHeight(min2);
                constraintWidgetContainer.invalidateGraph();
            }
            if (i4 == 1073741824 && i6 == 1073741824) {
                z4 = constraintWidgetContainer3.directMeasure(enabled);
                i16 = 2;
            } else {
                boolean directMeasureSetup = constraintWidgetContainer3.directMeasureSetup(enabled);
                if (i4 == 1073741824) {
                    directMeasureSetup &= constraintWidgetContainer3.directMeasureWithOrientation(enabled, 0);
                    i16 = 1;
                } else {
                    i16 = 0;
                }
                if (i6 == 1073741824) {
                    z4 = constraintWidgetContainer3.directMeasureWithOrientation(enabled, 1) & directMeasureSetup;
                    i16++;
                } else {
                    z4 = directMeasureSetup;
                }
            }
            if (z4) {
                constraintWidgetContainer3.updateFromRuns(i4 == 1073741824, i6 == 1073741824);
            }
            i10 = i16;
            z = z4;
        } else {
            i10 = 0;
            z = false;
        }
        if (z && i10 == 2) {
            constraintWidgetContainer2 = constraintWidgetContainer3;
            j2 = 0;
        } else {
            int optimizationLevel = constraintWidgetContainer.getOptimizationLevel();
            if (size > 0) {
                getHighSpeedVideoSizes(constraintWidgetContainer);
            }
            long nanoTime = constraintWidgetContainer3.mMetrics != null ? java.lang.System.nanoTime() : 0L;
            updateHierarchy(constraintWidgetContainer);
            int size2 = this.Camera2StreamConfigurationMap.size();
            if (size > 0) {
                getHighResolutionOutputSizeshNQ4ISI(constraintWidgetContainer3, 0, width, height);
            }
            if (size2 > 0) {
                boolean z8 = constraintWidgetContainer.getHorizontalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z9 = constraintWidgetContainer.getVerticalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                int max = java.lang.Math.max(constraintWidgetContainer.getWidth(), this.getHighSpeedVideoFpsRangesFor.getMinWidth());
                int max2 = java.lang.Math.max(constraintWidgetContainer.getHeight(), this.getHighSpeedVideoFpsRangesFor.getMinHeight());
                int i18 = max;
                int i19 = 0;
                boolean z10 = false;
                while (i19 < size2) {
                    long j3 = nanoTime;
                    androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = this.Camera2StreamConfigurationMap.get(i19);
                    if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.VirtualLayout) {
                        int width2 = constraintWidget2.getWidth();
                        i13 = optimizationLevel;
                        int height2 = constraintWidget2.getHeight();
                        i14 = width;
                        boolean highSpeedVideoSizes = getHighSpeedVideoSizes(measurer2, constraintWidget2, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS);
                        i15 = height;
                        if (constraintWidgetContainer3.mMetrics != null) {
                            z2 = z7;
                            constraintWidgetContainer3.mMetrics.measuredMatchWidgets++;
                        } else {
                            z2 = z7;
                        }
                        int width3 = constraintWidget2.getWidth();
                        int height3 = constraintWidget2.getHeight();
                        if (width3 != width2) {
                            constraintWidget2.setWidth(width3);
                            if (z8 && constraintWidget2.getRight() > i18) {
                                i18 = java.lang.Math.max(i18, constraintWidget2.getRight() + constraintWidget2.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT).getMargin());
                            }
                            z3 = true;
                        } else {
                            z3 = z10 | highSpeedVideoSizes;
                        }
                        if (height3 != height2) {
                            constraintWidget2.setHeight(height3);
                            if (z9 && constraintWidget2.getBottom() > max2) {
                                max2 = java.lang.Math.max(max2, constraintWidget2.getBottom() + constraintWidget2.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM).getMargin());
                            }
                            z3 = true;
                        }
                        z10 = ((androidx.constraintlayout.core.widgets.VirtualLayout) constraintWidget2).needSolverPass() | z3;
                    } else {
                        z2 = z7;
                        i13 = optimizationLevel;
                        i14 = width;
                        i15 = height;
                    }
                    i19++;
                    constraintWidgetContainer3 = constraintWidgetContainer;
                    nanoTime = j3;
                    optimizationLevel = i13;
                    width = i14;
                    height = i15;
                    z7 = z2;
                }
                boolean z11 = z7;
                int i20 = optimizationLevel;
                int i21 = width;
                int i22 = height;
                j = nanoTime;
                int i23 = 2;
                int i24 = 0;
                while (true) {
                    if (i24 >= i23) {
                        constraintWidgetContainer2 = constraintWidgetContainer;
                        break;
                    }
                    int i25 = 0;
                    while (i25 < size2) {
                        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget3 = this.Camera2StreamConfigurationMap.get(i25);
                        if (((constraintWidget3 instanceof androidx.constraintlayout.core.widgets.Helper) && !(constraintWidget3 instanceof androidx.constraintlayout.core.widgets.VirtualLayout)) || (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.Guideline) || constraintWidget3.getVisibility() == 8 || ((z11 && constraintWidget3.mHorizontalRun.getHighSpeedVideoFpsRangesFor.resolved && constraintWidget3.mVerticalRun.getHighSpeedVideoFpsRangesFor.resolved) || (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.VirtualLayout))) {
                            i12 = size2;
                            measurer = measurer2;
                        } else {
                            int width4 = constraintWidget3.getWidth();
                            int height4 = constraintWidget3.getHeight();
                            int baselineDistance = constraintWidget3.getBaselineDistance();
                            int i26 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS;
                            if (i24 == 1) {
                                i26 = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.USE_GIVEN_DIMENSIONS;
                            }
                            z10 |= getHighSpeedVideoSizes(measurer2, constraintWidget3, i26);
                            if (constraintWidgetContainer.mMetrics != null) {
                                i12 = size2;
                                measurer = measurer2;
                                constraintWidgetContainer.mMetrics.measuredMatchWidgets++;
                            } else {
                                i12 = size2;
                                measurer = measurer2;
                            }
                            int width5 = constraintWidget3.getWidth();
                            int height5 = constraintWidget3.getHeight();
                            if (width5 != width4) {
                                constraintWidget3.setWidth(width5);
                                if (z8 && constraintWidget3.getRight() > i18) {
                                    i18 = java.lang.Math.max(i18, constraintWidget3.getRight() + constraintWidget3.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT).getMargin());
                                }
                                z10 = true;
                            }
                            if (height5 != height4) {
                                constraintWidget3.setHeight(height5);
                                if (z9 && constraintWidget3.getBottom() > max2) {
                                    max2 = java.lang.Math.max(max2, constraintWidget3.getBottom() + constraintWidget3.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM).getMargin());
                                }
                                z10 = true;
                            }
                            if (constraintWidget3.hasBaseline() && baselineDistance != constraintWidget3.getBaselineDistance()) {
                                z10 = true;
                            }
                        }
                        i25++;
                        size2 = i12;
                        measurer2 = measurer;
                    }
                    constraintWidgetContainer2 = constraintWidgetContainer;
                    int i27 = size2;
                    androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer measurer3 = measurer2;
                    if (!z10) {
                        break;
                    }
                    i24++;
                    getHighResolutionOutputSizeshNQ4ISI(constraintWidgetContainer2, i24, i21, i22);
                    size2 = i27;
                    measurer2 = measurer3;
                    i23 = 2;
                    z10 = false;
                }
                i11 = i20;
            } else {
                j = nanoTime;
                constraintWidgetContainer2 = constraintWidgetContainer3;
                i11 = optimizationLevel;
            }
            constraintWidgetContainer2.setOptimizationLevel(i11);
            j2 = j;
        }
        return constraintWidgetContainer2.mMetrics != null ? java.lang.System.nanoTime() - j2 : j2;
    }

    private boolean getHighSpeedVideoSizes(androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer measurer, androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI.horizontalBehavior = constraintWidget.getHorizontalDimensionBehaviour();
        this.getHighResolutionOutputSizeshNQ4ISI.verticalBehavior = constraintWidget.getVerticalDimensionBehaviour();
        this.getHighResolutionOutputSizeshNQ4ISI.horizontalDimension = constraintWidget.getWidth();
        this.getHighResolutionOutputSizeshNQ4ISI.verticalDimension = constraintWidget.getHeight();
        this.getHighResolutionOutputSizeshNQ4ISI.measuredNeedsSolverPass = false;
        this.getHighResolutionOutputSizeshNQ4ISI.measureStrategy = i;
        boolean z = this.getHighResolutionOutputSizeshNQ4ISI.horizontalBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z2 = this.getHighResolutionOutputSizeshNQ4ISI.verticalBehavior == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z3 = z && constraintWidget.mDimensionRatio > 0.0f;
        boolean z4 = z2 && constraintWidget.mDimensionRatio > 0.0f;
        if (z3 && constraintWidget.mResolvedMatchConstraintDefault[0] == 4) {
            this.getHighResolutionOutputSizeshNQ4ISI.horizontalBehavior = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z4 && constraintWidget.mResolvedMatchConstraintDefault[1] == 4) {
            this.getHighResolutionOutputSizeshNQ4ISI.verticalBehavior = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
        }
        measurer.measure(constraintWidget, this.getHighResolutionOutputSizeshNQ4ISI);
        constraintWidget.setWidth(this.getHighResolutionOutputSizeshNQ4ISI.measuredWidth);
        constraintWidget.setHeight(this.getHighResolutionOutputSizeshNQ4ISI.measuredHeight);
        constraintWidget.setHasBaseline(this.getHighResolutionOutputSizeshNQ4ISI.measuredHasBaseline);
        constraintWidget.setBaselineDistance(this.getHighResolutionOutputSizeshNQ4ISI.measuredBaseline);
        this.getHighResolutionOutputSizeshNQ4ISI.measureStrategy = androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS;
        return this.getHighResolutionOutputSizeshNQ4ISI.measuredNeedsSolverPass;
    }
}
