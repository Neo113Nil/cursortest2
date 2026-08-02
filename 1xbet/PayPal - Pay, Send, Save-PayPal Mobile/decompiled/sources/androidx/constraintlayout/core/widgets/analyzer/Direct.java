package androidx.constraintlayout.core.widgets.analyzer;

/* loaded from: classes7.dex */
public class Direct {
    private static androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure getHighSpeedVideoFpsRangesFor = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure();
    private static int getHighSpeedVideoSizes = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;

    public static void solvingPass(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer measurer) {
        androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = constraintWidgetContainer.getHorizontalDimensionBehaviour();
        androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour verticalDimensionBehaviour = constraintWidgetContainer.getVerticalDimensionBehaviour();
        getHighSpeedVideoSizes = 0;
        getHighResolutionOutputSizeshNQ4ISI = 0;
        constraintWidgetContainer.resetFinalResolution();
        java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> children = constraintWidgetContainer.getChildren();
        int size = children.size();
        for (int i = 0; i < size; i++) {
            children.get(i).resetFinalResolution();
        }
        boolean isRtl = constraintWidgetContainer.isRtl();
        if (horizontalDimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED) {
            constraintWidgetContainer.setFinalHorizontal(0, constraintWidgetContainer.getWidth());
        } else {
            constraintWidgetContainer.setFinalLeft(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = children.get(i2);
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.Guideline) {
                androidx.constraintlayout.core.widgets.Guideline guideline = (androidx.constraintlayout.core.widgets.Guideline) constraintWidget;
                if (guideline.getOrientation() == 1) {
                    if (guideline.getRelativeBegin() != -1) {
                        guideline.setFinalValue(guideline.getRelativeBegin());
                    } else if (guideline.getRelativeEnd() != -1 && constraintWidgetContainer.isResolvedHorizontally()) {
                        guideline.setFinalValue(constraintWidgetContainer.getWidth() - guideline.getRelativeEnd());
                    } else if (constraintWidgetContainer.isResolvedHorizontally()) {
                        guideline.setFinalValue((int) ((guideline.getRelativePercent() * constraintWidgetContainer.getWidth()) + 0.5f));
                    }
                    z = true;
                }
            } else if ((constraintWidget instanceof androidx.constraintlayout.core.widgets.Barrier) && ((androidx.constraintlayout.core.widgets.Barrier) constraintWidget).getOrientation() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = children.get(i3);
                if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.Guideline) {
                    androidx.constraintlayout.core.widgets.Guideline guideline2 = (androidx.constraintlayout.core.widgets.Guideline) constraintWidget2;
                    if (guideline2.getOrientation() == 1) {
                        getHighSpeedVideoFpsRanges(0, guideline2, measurer, isRtl);
                    }
                }
            }
        }
        getHighSpeedVideoFpsRanges(0, constraintWidgetContainer, measurer, isRtl);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget3 = children.get(i4);
                if (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.Barrier) {
                    androidx.constraintlayout.core.widgets.Barrier barrier = (androidx.constraintlayout.core.widgets.Barrier) constraintWidget3;
                    if (barrier.getOrientation() == 0 && barrier.allSolved()) {
                        getHighSpeedVideoFpsRanges(1, barrier, measurer, isRtl);
                    }
                }
            }
        }
        if (verticalDimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED) {
            constraintWidgetContainer.setFinalVertical(0, constraintWidgetContainer.getHeight());
        } else {
            constraintWidgetContainer.setFinalTop(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget4 = children.get(i5);
            if (constraintWidget4 instanceof androidx.constraintlayout.core.widgets.Guideline) {
                androidx.constraintlayout.core.widgets.Guideline guideline3 = (androidx.constraintlayout.core.widgets.Guideline) constraintWidget4;
                if (guideline3.getOrientation() == 0) {
                    if (guideline3.getRelativeBegin() != -1) {
                        guideline3.setFinalValue(guideline3.getRelativeBegin());
                    } else if (guideline3.getRelativeEnd() != -1 && constraintWidgetContainer.isResolvedVertically()) {
                        guideline3.setFinalValue(constraintWidgetContainer.getHeight() - guideline3.getRelativeEnd());
                    } else if (constraintWidgetContainer.isResolvedVertically()) {
                        guideline3.setFinalValue((int) ((guideline3.getRelativePercent() * constraintWidgetContainer.getHeight()) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((constraintWidget4 instanceof androidx.constraintlayout.core.widgets.Barrier) && ((androidx.constraintlayout.core.widgets.Barrier) constraintWidget4).getOrientation() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget5 = children.get(i6);
                if (constraintWidget5 instanceof androidx.constraintlayout.core.widgets.Guideline) {
                    androidx.constraintlayout.core.widgets.Guideline guideline4 = (androidx.constraintlayout.core.widgets.Guideline) constraintWidget5;
                    if (guideline4.getOrientation() == 0) {
                        getHighSpeedVideoFpsRanges(1, guideline4, measurer);
                    }
                }
            }
        }
        getHighSpeedVideoFpsRanges(0, constraintWidgetContainer, measurer);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget6 = children.get(i7);
                if (constraintWidget6 instanceof androidx.constraintlayout.core.widgets.Barrier) {
                    androidx.constraintlayout.core.widgets.Barrier barrier2 = (androidx.constraintlayout.core.widgets.Barrier) constraintWidget6;
                    if (barrier2.getOrientation() == 1 && barrier2.allSolved()) {
                        getHighSpeedVideoFpsRanges(1, barrier2, measurer);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget7 = children.get(i8);
            if (constraintWidget7.isMeasureRequested() && Camera2StreamConfigurationMap(constraintWidget7)) {
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer.measure(0, constraintWidget7, measurer, getHighSpeedVideoFpsRangesFor, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS);
                if (constraintWidget7 instanceof androidx.constraintlayout.core.widgets.Guideline) {
                    if (((androidx.constraintlayout.core.widgets.Guideline) constraintWidget7).getOrientation() == 0) {
                        getHighSpeedVideoFpsRanges(0, constraintWidget7, measurer);
                    } else {
                        getHighSpeedVideoFpsRanges(0, constraintWidget7, measurer, isRtl);
                    }
                } else {
                    getHighSpeedVideoFpsRanges(0, constraintWidget7, measurer, isRtl);
                    getHighSpeedVideoFpsRanges(0, constraintWidget7, measurer);
                }
            }
        }
    }

    public static java.lang.String ls(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("+-(");
        sb2.append(i);
        sb2.append(") ");
        sb.append(sb2.toString());
        return sb.toString();
    }

    private static void getHighSpeedVideoFpsRanges(int i, androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer measurer, boolean z) {
        if (constraintWidget.isHorizontalSolvingPassDone()) {
            return;
        }
        boolean z2 = true;
        getHighSpeedVideoSizes++;
        if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) && constraintWidget.isMeasureRequested()) {
            int i2 = i + 1;
            if (Camera2StreamConfigurationMap(constraintWidget)) {
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer.measure(i2, constraintWidget, measurer, new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure(), androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS);
            }
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor = constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT);
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor2 = constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT);
        int finalValue = anchor.getFinalValue();
        int finalValue2 = anchor2.getFinalValue();
        if (anchor.getDependents() != null && anchor.hasFinalValue()) {
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it = anchor.getDependents().iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.ConstraintAnchor next = it.next();
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = next.mOwner;
                int i3 = i + 1;
                boolean Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(constraintWidget2);
                if (constraintWidget2.isMeasureRequested() && Camera2StreamConfigurationMap) {
                    androidx.constraintlayout.core.widgets.ConstraintWidgetContainer.measure(i3, constraintWidget2, measurer, new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure(), androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS);
                }
                boolean z3 = ((next == constraintWidget2.mLeft && constraintWidget2.mRight.mTarget != null && constraintWidget2.mRight.mTarget.hasFinalValue()) || (next == constraintWidget2.mRight && constraintWidget2.mLeft.mTarget != null && constraintWidget2.mLeft.mTarget.hasFinalValue())) ? z2 : false;
                if (constraintWidget2.getHorizontalDimensionBehaviour() != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || Camera2StreamConfigurationMap) {
                    if (!constraintWidget2.isMeasureRequested()) {
                        if (next == constraintWidget2.mLeft && constraintWidget2.mRight.mTarget == null) {
                            int margin = constraintWidget2.mLeft.getMargin() + finalValue;
                            constraintWidget2.setFinalHorizontal(margin, constraintWidget2.getWidth() + margin);
                            getHighSpeedVideoFpsRanges(i3, constraintWidget2, measurer, z);
                        } else if (next == constraintWidget2.mRight && constraintWidget2.mLeft.mTarget == null) {
                            int margin2 = finalValue - constraintWidget2.mRight.getMargin();
                            constraintWidget2.setFinalHorizontal(margin2 - constraintWidget2.getWidth(), margin2);
                            getHighSpeedVideoFpsRanges(i3, constraintWidget2, measurer, z);
                        } else if (z3 && !constraintWidget2.isInHorizontalChain()) {
                            getHighResolutionOutputSizeshNQ4ISI(i3, measurer, constraintWidget2, z);
                        }
                    }
                } else if (constraintWidget2.getHorizontalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget2.mMatchConstraintMaxWidth >= 0 && constraintWidget2.mMatchConstraintMinWidth >= 0 && ((constraintWidget2.getVisibility() == 8 || (constraintWidget2.mMatchConstraintDefaultWidth == 0 && constraintWidget2.getDimensionRatio() == 0.0f)) && !constraintWidget2.isInHorizontalChain() && !constraintWidget2.isInVirtualLayout() && z3 && !constraintWidget2.isInHorizontalChain())) {
                    getHighSpeedVideoFpsRanges(i3, constraintWidget, measurer, constraintWidget2, z);
                }
                z2 = true;
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.Guideline) {
            return;
        }
        if (anchor2.getDependents() != null && anchor2.hasFinalValue()) {
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it2 = anchor2.getDependents().iterator();
            while (it2.hasNext()) {
                androidx.constraintlayout.core.widgets.ConstraintAnchor next2 = it2.next();
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget3 = next2.mOwner;
                int i4 = i + 1;
                boolean Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(constraintWidget3);
                if (constraintWidget3.isMeasureRequested() && Camera2StreamConfigurationMap2) {
                    androidx.constraintlayout.core.widgets.ConstraintWidgetContainer.measure(i4, constraintWidget3, measurer, new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure(), androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS);
                }
                boolean z4 = (next2 == constraintWidget3.mLeft && constraintWidget3.mRight.mTarget != null && constraintWidget3.mRight.mTarget.hasFinalValue()) || (next2 == constraintWidget3.mRight && constraintWidget3.mLeft.mTarget != null && constraintWidget3.mLeft.mTarget.hasFinalValue());
                if (constraintWidget3.getHorizontalDimensionBehaviour() != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || Camera2StreamConfigurationMap2) {
                    if (!constraintWidget3.isMeasureRequested()) {
                        if (next2 == constraintWidget3.mLeft && constraintWidget3.mRight.mTarget == null) {
                            int margin3 = constraintWidget3.mLeft.getMargin() + finalValue2;
                            constraintWidget3.setFinalHorizontal(margin3, constraintWidget3.getWidth() + margin3);
                            getHighSpeedVideoFpsRanges(i4, constraintWidget3, measurer, z);
                        } else if (next2 == constraintWidget3.mRight && constraintWidget3.mLeft.mTarget == null) {
                            int margin4 = finalValue2 - constraintWidget3.mRight.getMargin();
                            constraintWidget3.setFinalHorizontal(margin4 - constraintWidget3.getWidth(), margin4);
                            getHighSpeedVideoFpsRanges(i4, constraintWidget3, measurer, z);
                        } else if (z4 && !constraintWidget3.isInHorizontalChain()) {
                            getHighResolutionOutputSizeshNQ4ISI(i4, measurer, constraintWidget3, z);
                        }
                    }
                } else if (constraintWidget3.getHorizontalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget3.mMatchConstraintMaxWidth >= 0 && constraintWidget3.mMatchConstraintMinWidth >= 0 && (constraintWidget3.getVisibility() == 8 || (constraintWidget3.mMatchConstraintDefaultWidth == 0 && constraintWidget3.getDimensionRatio() == 0.0f))) {
                    if (!constraintWidget3.isInHorizontalChain() && !constraintWidget3.isInVirtualLayout() && z4 && !constraintWidget3.isInHorizontalChain()) {
                        getHighSpeedVideoFpsRanges(i4, constraintWidget, measurer, constraintWidget3, z);
                    }
                }
            }
        }
        constraintWidget.markHorizontalSolvingPassDone();
    }

    private static void getHighSpeedVideoFpsRanges(int i, androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer measurer) {
        if (constraintWidget.isVerticalSolvingPassDone()) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI++;
        if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) && constraintWidget.isMeasureRequested()) {
            int i2 = i + 1;
            if (Camera2StreamConfigurationMap(constraintWidget)) {
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer.measure(i2, constraintWidget, measurer, new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure(), androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS);
            }
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor = constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP);
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor2 = constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM);
        int finalValue = anchor.getFinalValue();
        int finalValue2 = anchor2.getFinalValue();
        if (anchor.getDependents() != null && anchor.hasFinalValue()) {
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it = anchor.getDependents().iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.ConstraintAnchor next = it.next();
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = next.mOwner;
                int i3 = i + 1;
                boolean Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(constraintWidget2);
                if (constraintWidget2.isMeasureRequested() && Camera2StreamConfigurationMap) {
                    androidx.constraintlayout.core.widgets.ConstraintWidgetContainer.measure(i3, constraintWidget2, measurer, new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure(), androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS);
                }
                boolean z = (next == constraintWidget2.mTop && constraintWidget2.mBottom.mTarget != null && constraintWidget2.mBottom.mTarget.hasFinalValue()) || (next == constraintWidget2.mBottom && constraintWidget2.mTop.mTarget != null && constraintWidget2.mTop.mTarget.hasFinalValue());
                if (constraintWidget2.getVerticalDimensionBehaviour() != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || Camera2StreamConfigurationMap) {
                    if (!constraintWidget2.isMeasureRequested()) {
                        if (next == constraintWidget2.mTop && constraintWidget2.mBottom.mTarget == null) {
                            int margin = constraintWidget2.mTop.getMargin() + finalValue;
                            constraintWidget2.setFinalVertical(margin, constraintWidget2.getHeight() + margin);
                            getHighSpeedVideoFpsRanges(i3, constraintWidget2, measurer);
                        } else if (next == constraintWidget2.mBottom && constraintWidget2.mTop.mTarget == null) {
                            int margin2 = finalValue - constraintWidget2.mBottom.getMargin();
                            constraintWidget2.setFinalVertical(margin2 - constraintWidget2.getHeight(), margin2);
                            getHighSpeedVideoFpsRanges(i3, constraintWidget2, measurer);
                        } else if (z && !constraintWidget2.isInVerticalChain()) {
                            getHighSpeedVideoFpsRangesFor(i3, measurer, constraintWidget2);
                        }
                    }
                } else if (constraintWidget2.getVerticalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget2.mMatchConstraintMaxHeight >= 0 && constraintWidget2.mMatchConstraintMinHeight >= 0 && (constraintWidget2.getVisibility() == 8 || (constraintWidget2.mMatchConstraintDefaultHeight == 0 && constraintWidget2.getDimensionRatio() == 0.0f))) {
                    if (!constraintWidget2.isInVerticalChain() && !constraintWidget2.isInVirtualLayout() && z && !constraintWidget2.isInVerticalChain()) {
                        getHighSpeedVideoFpsRanges(i3, constraintWidget, measurer, constraintWidget2);
                    }
                }
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.Guideline) {
            return;
        }
        if (anchor2.getDependents() != null && anchor2.hasFinalValue()) {
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it2 = anchor2.getDependents().iterator();
            while (it2.hasNext()) {
                androidx.constraintlayout.core.widgets.ConstraintAnchor next2 = it2.next();
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget3 = next2.mOwner;
                int i4 = i + 1;
                boolean Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(constraintWidget3);
                if (constraintWidget3.isMeasureRequested() && Camera2StreamConfigurationMap2) {
                    androidx.constraintlayout.core.widgets.ConstraintWidgetContainer.measure(i4, constraintWidget3, measurer, new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure(), androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS);
                }
                boolean z2 = (next2 == constraintWidget3.mTop && constraintWidget3.mBottom.mTarget != null && constraintWidget3.mBottom.mTarget.hasFinalValue()) || (next2 == constraintWidget3.mBottom && constraintWidget3.mTop.mTarget != null && constraintWidget3.mTop.mTarget.hasFinalValue());
                if (constraintWidget3.getVerticalDimensionBehaviour() != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || Camera2StreamConfigurationMap2) {
                    if (!constraintWidget3.isMeasureRequested()) {
                        if (next2 == constraintWidget3.mTop && constraintWidget3.mBottom.mTarget == null) {
                            int margin3 = constraintWidget3.mTop.getMargin() + finalValue2;
                            constraintWidget3.setFinalVertical(margin3, constraintWidget3.getHeight() + margin3);
                            getHighSpeedVideoFpsRanges(i4, constraintWidget3, measurer);
                        } else if (next2 == constraintWidget3.mBottom && constraintWidget3.mTop.mTarget == null) {
                            int margin4 = finalValue2 - constraintWidget3.mBottom.getMargin();
                            constraintWidget3.setFinalVertical(margin4 - constraintWidget3.getHeight(), margin4);
                            getHighSpeedVideoFpsRanges(i4, constraintWidget3, measurer);
                        } else if (z2 && !constraintWidget3.isInVerticalChain()) {
                            getHighSpeedVideoFpsRangesFor(i4, measurer, constraintWidget3);
                        }
                    }
                } else if (constraintWidget3.getVerticalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget3.mMatchConstraintMaxHeight >= 0 && constraintWidget3.mMatchConstraintMinHeight >= 0 && (constraintWidget3.getVisibility() == 8 || (constraintWidget3.mMatchConstraintDefaultHeight == 0 && constraintWidget3.getDimensionRatio() == 0.0f))) {
                    if (!constraintWidget3.isInVerticalChain() && !constraintWidget3.isInVirtualLayout() && z2 && !constraintWidget3.isInVerticalChain()) {
                        getHighSpeedVideoFpsRanges(i4, constraintWidget, measurer, constraintWidget3);
                    }
                }
            }
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor3 = constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE);
        if (anchor3.getDependents() != null && anchor3.hasFinalValue()) {
            int finalValue3 = anchor3.getFinalValue();
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it3 = anchor3.getDependents().iterator();
            while (it3.hasNext()) {
                androidx.constraintlayout.core.widgets.ConstraintAnchor next3 = it3.next();
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget4 = next3.mOwner;
                int i5 = i + 1;
                boolean Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(constraintWidget4);
                if (constraintWidget4.isMeasureRequested() && Camera2StreamConfigurationMap3) {
                    androidx.constraintlayout.core.widgets.ConstraintWidgetContainer.measure(i5, constraintWidget4, measurer, new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure(), androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS);
                }
                if (constraintWidget4.getVerticalDimensionBehaviour() != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || Camera2StreamConfigurationMap3) {
                    if (!constraintWidget4.isMeasureRequested() && next3 == constraintWidget4.mBaseline) {
                        constraintWidget4.setFinalBaseline(next3.getMargin() + finalValue3);
                        getHighSpeedVideoFpsRanges(i5, constraintWidget4, measurer);
                    }
                }
            }
        }
        constraintWidget.markVerticalSolvingPassDone();
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer measurer, androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, boolean z) {
        float horizontalBiasPercent = constraintWidget.getHorizontalBiasPercent();
        int finalValue = constraintWidget.mLeft.mTarget.getFinalValue();
        int finalValue2 = constraintWidget.mRight.mTarget.getFinalValue();
        int margin = constraintWidget.mLeft.getMargin();
        int margin2 = constraintWidget.mRight.getMargin();
        if (finalValue == finalValue2) {
            horizontalBiasPercent = 0.5f;
        } else {
            finalValue += margin;
            finalValue2 -= margin2;
        }
        int width = constraintWidget.getWidth();
        int i2 = (finalValue2 - finalValue) - width;
        if (finalValue > finalValue2) {
            i2 = (finalValue - finalValue2) - width;
        }
        int i3 = ((int) (i2 > 0 ? (horizontalBiasPercent * i2) + 0.5f : horizontalBiasPercent * i2)) + finalValue;
        int i4 = i3 + width;
        if (finalValue > finalValue2) {
            i4 = i3 - width;
        }
        constraintWidget.setFinalHorizontal(i3, i4);
        getHighSpeedVideoFpsRanges(i + 1, constraintWidget, measurer, z);
    }

    private static void getHighSpeedVideoFpsRangesFor(int i, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer measurer, androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        float verticalBiasPercent = constraintWidget.getVerticalBiasPercent();
        int finalValue = constraintWidget.mTop.mTarget.getFinalValue();
        int finalValue2 = constraintWidget.mBottom.mTarget.getFinalValue();
        int margin = constraintWidget.mTop.getMargin();
        int margin2 = constraintWidget.mBottom.getMargin();
        if (finalValue == finalValue2) {
            verticalBiasPercent = 0.5f;
        } else {
            finalValue += margin;
            finalValue2 -= margin2;
        }
        int height = constraintWidget.getHeight();
        int i2 = (finalValue2 - finalValue) - height;
        if (finalValue > finalValue2) {
            i2 = (finalValue - finalValue2) - height;
        }
        int i3 = (int) (i2 > 0 ? (verticalBiasPercent * i2) + 0.5f : verticalBiasPercent * i2);
        int i4 = finalValue + i3;
        int i5 = i4 + height;
        if (finalValue > finalValue2) {
            i4 = finalValue - i3;
            i5 = i4 - height;
        }
        constraintWidget.setFinalVertical(i4, i5);
        getHighSpeedVideoFpsRanges(i + 1, constraintWidget, measurer);
    }

    private static void getHighSpeedVideoFpsRanges(int i, androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer measurer, androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2, boolean z) {
        int width;
        float horizontalBiasPercent = constraintWidget2.getHorizontalBiasPercent();
        int finalValue = constraintWidget2.mLeft.mTarget.getFinalValue() + constraintWidget2.mLeft.getMargin();
        int finalValue2 = constraintWidget2.mRight.mTarget.getFinalValue() - constraintWidget2.mRight.getMargin();
        if (finalValue2 >= finalValue) {
            int width2 = constraintWidget2.getWidth();
            if (constraintWidget2.getVisibility() != 8) {
                if (constraintWidget2.mMatchConstraintDefaultWidth == 2) {
                    if (constraintWidget instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) {
                        width = constraintWidget.getWidth();
                    } else {
                        width = constraintWidget.getParent().getWidth();
                    }
                    width2 = (int) (constraintWidget2.getHorizontalBiasPercent() * 0.5f * width);
                } else if (constraintWidget2.mMatchConstraintDefaultWidth == 0) {
                    width2 = finalValue2 - finalValue;
                }
                width2 = java.lang.Math.max(constraintWidget2.mMatchConstraintMinWidth, width2);
                if (constraintWidget2.mMatchConstraintMaxWidth > 0) {
                    width2 = java.lang.Math.min(constraintWidget2.mMatchConstraintMaxWidth, width2);
                }
            }
            int i2 = finalValue + ((int) ((horizontalBiasPercent * ((finalValue2 - finalValue) - width2)) + 0.5f));
            constraintWidget2.setFinalHorizontal(i2, width2 + i2);
            getHighSpeedVideoFpsRanges(i + 1, constraintWidget2, measurer, z);
        }
    }

    private static void getHighSpeedVideoFpsRanges(int i, androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer measurer, androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2) {
        int height;
        float verticalBiasPercent = constraintWidget2.getVerticalBiasPercent();
        int finalValue = constraintWidget2.mTop.mTarget.getFinalValue() + constraintWidget2.mTop.getMargin();
        int finalValue2 = constraintWidget2.mBottom.mTarget.getFinalValue() - constraintWidget2.mBottom.getMargin();
        if (finalValue2 >= finalValue) {
            int height2 = constraintWidget2.getHeight();
            if (constraintWidget2.getVisibility() != 8) {
                if (constraintWidget2.mMatchConstraintDefaultHeight == 2) {
                    if (constraintWidget instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) {
                        height = constraintWidget.getHeight();
                    } else {
                        height = constraintWidget.getParent().getHeight();
                    }
                    height2 = (int) (verticalBiasPercent * 0.5f * height);
                } else if (constraintWidget2.mMatchConstraintDefaultHeight == 0) {
                    height2 = finalValue2 - finalValue;
                }
                height2 = java.lang.Math.max(constraintWidget2.mMatchConstraintMinHeight, height2);
                if (constraintWidget2.mMatchConstraintMaxHeight > 0) {
                    height2 = java.lang.Math.min(constraintWidget2.mMatchConstraintMaxHeight, height2);
                }
            }
            int i2 = finalValue + ((int) ((verticalBiasPercent * ((finalValue2 - finalValue) - height2)) + 0.5f));
            constraintWidget2.setFinalVertical(i2, height2 + i2);
            getHighSpeedVideoFpsRanges(i + 1, constraintWidget2, measurer);
        }
    }

    private static boolean Camera2StreamConfigurationMap(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = constraintWidget.getHorizontalDimensionBehaviour();
        androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour verticalDimensionBehaviour = constraintWidget.getVerticalDimensionBehaviour();
        androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer = constraintWidget.getParent() != null ? (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) constraintWidget.getParent() : null;
        if (constraintWidgetContainer != null) {
            constraintWidgetContainer.getHorizontalDimensionBehaviour();
            androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (constraintWidgetContainer != null) {
            constraintWidgetContainer.getVerticalDimensionBehaviour();
            androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
        }
        boolean z = horizontalDimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED || constraintWidget.isResolvedHorizontally() || horizontalDimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (horizontalDimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultWidth == 0 && constraintWidget.mDimensionRatio == 0.0f && constraintWidget.hasDanglingDimension(0)) || (horizontalDimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultWidth == 1 && constraintWidget.hasResolvedTargets(0, constraintWidget.getWidth()));
        boolean z2 = verticalDimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED || constraintWidget.isResolvedVertically() || verticalDimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (verticalDimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultHeight == 0 && constraintWidget.mDimensionRatio == 0.0f && constraintWidget.hasDanglingDimension(1)) || (verticalDimensionBehaviour == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultHeight == 1 && constraintWidget.hasResolvedTargets(1, constraintWidget.getHeight()));
        if (constraintWidget.mDimensionRatio <= 0.0f || !(z || z2)) {
            return z && z2;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d9, code lost:
    
        if (r4.mListAnchors[r23].mTarget.mOwner == r0) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0151  */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean solveChain(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer, androidx.constraintlayout.core.LinearSystem linearSystem, int i, int i2, androidx.constraintlayout.core.widgets.ChainHead chainHead, boolean z, boolean z2, boolean z3) {
        int finalValue;
        int finalValue2;
        int finalValue3;
        int i3;
        int height;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget;
        float verticalBiasPercent;
        boolean z4;
        int height2;
        if (z3) {
            return false;
        }
        if (i == 0) {
            if (!constraintWidgetContainer.isResolvedHorizontally()) {
                return false;
            }
        } else if (!constraintWidgetContainer.isResolvedVertically()) {
            return false;
        }
        boolean isRtl = constraintWidgetContainer.isRtl();
        androidx.constraintlayout.core.widgets.ConstraintWidget first = chainHead.getFirst();
        androidx.constraintlayout.core.widgets.ConstraintWidget last = chainHead.getLast();
        androidx.constraintlayout.core.widgets.ConstraintWidget firstVisibleWidget = chainHead.getFirstVisibleWidget();
        androidx.constraintlayout.core.widgets.ConstraintWidget lastVisibleWidget = chainHead.getLastVisibleWidget();
        androidx.constraintlayout.core.widgets.ConstraintWidget head = chainHead.getHead();
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor = first.mListAnchors[i2];
        int i4 = i2 + 1;
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor2 = last.mListAnchors[i4];
        if (constraintAnchor.mTarget == null || constraintAnchor2.mTarget == null || !constraintAnchor.mTarget.hasFinalValue() || !constraintAnchor2.mTarget.hasFinalValue() || firstVisibleWidget == null || lastVisibleWidget == null || (finalValue3 = (finalValue2 = constraintAnchor2.mTarget.getFinalValue() - lastVisibleWidget.mListAnchors[i4].getMargin()) - (finalValue = constraintAnchor.mTarget.getFinalValue() + firstVisibleWidget.mListAnchors[i2].getMargin())) <= 0) {
            return false;
        }
        androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure measure = new androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure();
        boolean z5 = false;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = first;
        while (true) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget3 = null;
            if (z5) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget4 = first;
                if (i5 == 0 || i5 != i6 || finalValue3 < i7) {
                    return false;
                }
                int i8 = finalValue3 - i7;
                if (z) {
                    i8 /= i5 + 1;
                } else if (z2 && i5 > 2) {
                    i3 = 1;
                    i8 = (i8 / i5) - 1;
                    if (i5 != i3) {
                        if (i == 0) {
                            verticalBiasPercent = head.getHorizontalBiasPercent();
                        } else {
                            verticalBiasPercent = head.getVerticalBiasPercent();
                        }
                        int i9 = (int) (finalValue + 0.5f + (i8 * verticalBiasPercent));
                        if (i == 0) {
                            firstVisibleWidget.setFinalHorizontal(i9, firstVisibleWidget.getWidth() + i9);
                        } else {
                            firstVisibleWidget.setFinalVertical(i9, firstVisibleWidget.getHeight() + i9);
                        }
                        getHighSpeedVideoFpsRanges(1, firstVisibleWidget, constraintWidgetContainer.getMeasurer(), isRtl);
                        return true;
                    }
                    if (!z) {
                        if (!z2) {
                            return true;
                        }
                        if (i5 != 2) {
                            return false;
                        }
                        if (i == 0) {
                            firstVisibleWidget.setFinalHorizontal(finalValue, firstVisibleWidget.getWidth() + finalValue);
                            lastVisibleWidget.setFinalHorizontal(finalValue2 - lastVisibleWidget.getWidth(), finalValue2);
                            getHighSpeedVideoFpsRanges(1, firstVisibleWidget, constraintWidgetContainer.getMeasurer(), isRtl);
                            getHighSpeedVideoFpsRanges(1, lastVisibleWidget, constraintWidgetContainer.getMeasurer(), isRtl);
                            return true;
                        }
                        firstVisibleWidget.setFinalVertical(finalValue, firstVisibleWidget.getHeight() + finalValue);
                        lastVisibleWidget.setFinalVertical(finalValue2 - lastVisibleWidget.getHeight(), finalValue2);
                        getHighSpeedVideoFpsRanges(1, firstVisibleWidget, constraintWidgetContainer.getMeasurer());
                        getHighSpeedVideoFpsRanges(1, lastVisibleWidget, constraintWidgetContainer.getMeasurer());
                        return true;
                    }
                    int i10 = finalValue + i8;
                    androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget5 = constraintWidget4;
                    boolean z6 = false;
                    ?? r2 = i3;
                    while (!z6) {
                        if (constraintWidget5.getVisibility() != 8) {
                            int margin = i10 + constraintWidget5.mListAnchors[i2].getMargin();
                            if (i == 0) {
                                constraintWidget5.setFinalHorizontal(margin, constraintWidget5.getWidth() + margin);
                                getHighSpeedVideoFpsRanges(1, constraintWidget5, constraintWidgetContainer.getMeasurer(), isRtl);
                                height = constraintWidget5.getWidth();
                            } else {
                                constraintWidget5.setFinalVertical(margin, constraintWidget5.getHeight() + margin);
                                getHighSpeedVideoFpsRanges(1, constraintWidget5, constraintWidgetContainer.getMeasurer());
                                height = constraintWidget5.getHeight();
                            }
                            i10 = margin + height + constraintWidget5.mListAnchors[i4].getMargin() + i8;
                        } else if (i == 0) {
                            constraintWidget5.setFinalHorizontal(i10, i10);
                            getHighSpeedVideoFpsRanges((int) r2, constraintWidget5, constraintWidgetContainer.getMeasurer(), isRtl);
                        } else {
                            constraintWidget5.setFinalVertical(i10, i10);
                            getHighSpeedVideoFpsRanges(r2, constraintWidget5, constraintWidgetContainer.getMeasurer());
                        }
                        constraintWidget5.addToSolver(linearSystem, false);
                        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor3 = constraintWidget5.mListAnchors[i4].mTarget;
                        if (constraintAnchor3 != null) {
                            constraintWidget = constraintAnchor3.mOwner;
                            if (constraintWidget.mListAnchors[i2].mTarget != null) {
                            }
                        }
                        constraintWidget = null;
                        if (constraintWidget == null) {
                            z6 = true;
                        } else {
                            constraintWidget5 = constraintWidget;
                        }
                        r2 = 1;
                    }
                    return r2;
                }
                i3 = 1;
                if (i5 != i3) {
                }
            } else {
                if (!Camera2StreamConfigurationMap(constraintWidget2)) {
                    return false;
                }
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget6 = first;
                if (constraintWidget2.mListDimensionBehaviors[i] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    return false;
                }
                if (constraintWidget2.isMeasureRequested()) {
                    z4 = z5;
                    androidx.constraintlayout.core.widgets.ConstraintWidgetContainer.measure(1, constraintWidget2, constraintWidgetContainer.getMeasurer(), measure, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS);
                } else {
                    z4 = z5;
                }
                int margin2 = constraintWidget2.mListAnchors[i2].getMargin();
                if (i == 0) {
                    height2 = constraintWidget2.getWidth();
                } else {
                    height2 = constraintWidget2.getHeight();
                }
                i7 = i7 + margin2 + height2 + constraintWidget2.mListAnchors[i4].getMargin();
                i6++;
                if (constraintWidget2.getVisibility() != 8) {
                    i5++;
                }
                androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor4 = constraintWidget2.mListAnchors[i4].mTarget;
                if (constraintAnchor4 != null) {
                    androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget7 = constraintAnchor4.mOwner;
                    if (constraintWidget7.mListAnchors[i2].mTarget != null && constraintWidget7.mListAnchors[i2].mTarget.mOwner == constraintWidget2) {
                        constraintWidget3 = constraintWidget7;
                    }
                }
                if (constraintWidget3 != null) {
                    constraintWidget2 = constraintWidget3;
                    z5 = z4;
                } else {
                    z5 = true;
                }
                first = constraintWidget6;
            }
        }
    }
}
