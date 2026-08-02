package androidx.constraintlayout.core.widgets;

/* loaded from: classes7.dex */
public class Optimizer {
    public static final int OPTIMIZATION_BARRIER = 2;
    public static final int OPTIMIZATION_CACHE_MEASURES = 256;
    public static final int OPTIMIZATION_CHAIN = 4;
    public static final int OPTIMIZATION_DEPENDENCY_ORDERING = 512;
    public static final int OPTIMIZATION_DIMENSIONS = 8;
    public static final int OPTIMIZATION_DIRECT = 1;
    public static final int OPTIMIZATION_GRAPH = 64;
    public static final int OPTIMIZATION_GRAPH_WRAP = 128;
    public static final int OPTIMIZATION_GROUPING = 1024;
    public static final int OPTIMIZATION_GROUPS = 32;
    public static final int OPTIMIZATION_NONE = 0;
    public static final int OPTIMIZATION_RATIO = 16;
    public static final int OPTIMIZATION_STANDARD = 257;
    static boolean[] getHighSpeedVideoSizes = new boolean[3];

    public static final boolean enabled(int i, int i2) {
        return (i & i2) == i2;
    }

    static void getHighSpeedVideoFpsRanges(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer, androidx.constraintlayout.core.LinearSystem linearSystem, androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        constraintWidget.mHorizontalResolution = -1;
        constraintWidget.mVerticalResolution = -1;
        if (constraintWidgetContainer.mListDimensionBehaviors[0] != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && constraintWidget.mListDimensionBehaviors[0] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i = constraintWidget.mLeft.mMargin;
            int width = constraintWidgetContainer.getWidth() - constraintWidget.mRight.mMargin;
            constraintWidget.mLeft.getHighSpeedVideoFpsRangesFor = linearSystem.createObjectVariable(constraintWidget.mLeft);
            constraintWidget.mRight.getHighSpeedVideoFpsRangesFor = linearSystem.createObjectVariable(constraintWidget.mRight);
            linearSystem.addEquality(constraintWidget.mLeft.getHighSpeedVideoFpsRangesFor, i);
            linearSystem.addEquality(constraintWidget.mRight.getHighSpeedVideoFpsRangesFor, width);
            constraintWidget.mHorizontalResolution = 2;
            constraintWidget.setHorizontalDimension(i, width);
        }
        if (constraintWidgetContainer.mListDimensionBehaviors[1] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || constraintWidget.mListDimensionBehaviors[1] != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            return;
        }
        int i2 = constraintWidget.mTop.mMargin;
        int height = constraintWidgetContainer.getHeight() - constraintWidget.mBottom.mMargin;
        constraintWidget.mTop.getHighSpeedVideoFpsRangesFor = linearSystem.createObjectVariable(constraintWidget.mTop);
        constraintWidget.mBottom.getHighSpeedVideoFpsRangesFor = linearSystem.createObjectVariable(constraintWidget.mBottom);
        linearSystem.addEquality(constraintWidget.mTop.getHighSpeedVideoFpsRangesFor, i2);
        linearSystem.addEquality(constraintWidget.mBottom.getHighSpeedVideoFpsRangesFor, height);
        if (constraintWidget.getHighSpeedVideoFpsRangesFor > 0 || constraintWidget.getVisibility() == 8) {
            constraintWidget.mBaseline.getHighSpeedVideoFpsRangesFor = linearSystem.createObjectVariable(constraintWidget.mBaseline);
            linearSystem.addEquality(constraintWidget.mBaseline.getHighSpeedVideoFpsRangesFor, constraintWidget.getHighSpeedVideoFpsRangesFor + i2);
        }
        constraintWidget.mVerticalResolution = 2;
        constraintWidget.setVerticalDimension(i2, height);
    }
}
