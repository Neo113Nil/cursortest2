package androidx.constraintlayout.core.widgets.analyzer;

/* loaded from: classes7.dex */
public class WidgetGroup {
    static int Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;
    java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> getHighSpeedVideoSizesFor = new java.util.ArrayList<>();
    boolean getHighResolutionOutputSizeshNQ4ISI = false;
    java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetGroup.MeasureResult> getHighSpeedVideoFpsRangesFor = null;
    private int getOutputMinFrameDuration = -1;

    public WidgetGroup(int i) {
        int i2 = Camera2StreamConfigurationMap;
        Camera2StreamConfigurationMap = i2 + 1;
        this.getHighSpeedVideoSizes = i2;
        this.getHighSpeedVideoFpsRanges = i;
    }

    public int getOrientation() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public int getId() {
        return this.getHighSpeedVideoSizes;
    }

    public boolean add(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        if (this.getHighSpeedVideoSizesFor.contains(constraintWidget)) {
            return false;
        }
        this.getHighSpeedVideoSizesFor.add(constraintWidget);
        return true;
    }

    public void setAuthoritative(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    public boolean isAuthoritative() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else if (i == 2) {
            str = "Both";
        } else {
            str = "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append("] <");
        java.lang.String obj = sb.toString();
        java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintWidget> it = this.getHighSpeedVideoSizesFor.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.widgets.ConstraintWidget next = it.next();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(obj);
            sb2.append(" ");
            sb2.append(next.getDebugName());
            obj = sb2.toString();
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(obj);
        sb3.append(" >");
        return sb3.toString();
    }

    public void moveTo(int i, androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroup) {
        java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintWidget> it = this.getHighSpeedVideoSizesFor.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.widgets.ConstraintWidget next = it.next();
            widgetGroup.add(next);
            if (i == 0) {
                next.horizontalGroup = widgetGroup.getId();
            } else {
                next.verticalGroup = widgetGroup.getId();
            }
        }
        this.getOutputMinFrameDuration = widgetGroup.getHighSpeedVideoSizes;
    }

    public void clear() {
        this.getHighSpeedVideoSizesFor.clear();
    }

    public int measureWrap(androidx.constraintlayout.core.LinearSystem linearSystem, int i) {
        if (this.getHighSpeedVideoSizesFor.size() == 0) {
            return 0;
        }
        return getHighSpeedVideoSizes(linearSystem, this.getHighSpeedVideoSizesFor, i);
    }

    private int getHighSpeedVideoSizes(androidx.constraintlayout.core.LinearSystem linearSystem, java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> arrayList, int i) {
        int objectVariableValue;
        int objectVariableValue2;
        androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) arrayList.get(0).getParent();
        linearSystem.reset();
        constraintWidgetContainer.addToSolver(linearSystem, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).addToSolver(linearSystem, false);
        }
        if (i == 0 && constraintWidgetContainer.mHorizontalChainsSize > 0) {
            androidx.constraintlayout.core.widgets.Chain.applyChainConstraints(constraintWidgetContainer, linearSystem, arrayList, 0);
        }
        if (i == 1 && constraintWidgetContainer.mVerticalChainsSize > 0) {
            androidx.constraintlayout.core.widgets.Chain.applyChainConstraints(constraintWidgetContainer, linearSystem, arrayList, 1);
        }
        try {
            linearSystem.minimize();
        } catch (java.lang.Exception e) {
            java.io.PrintStream printStream = java.lang.System.err;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(e.toString());
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            sb.append(java.util.Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
            printStream.println(sb.toString());
        }
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.getHighSpeedVideoFpsRangesFor.add(new androidx.constraintlayout.core.widgets.analyzer.WidgetGroup.MeasureResult(arrayList.get(i3), linearSystem, i));
        }
        if (i == 0) {
            objectVariableValue = linearSystem.getObjectVariableValue(constraintWidgetContainer.mLeft);
            objectVariableValue2 = linearSystem.getObjectVariableValue(constraintWidgetContainer.mRight);
            linearSystem.reset();
        } else {
            objectVariableValue = linearSystem.getObjectVariableValue(constraintWidgetContainer.mTop);
            objectVariableValue2 = linearSystem.getObjectVariableValue(constraintWidgetContainer.mBottom);
            linearSystem.reset();
        }
        return objectVariableValue2 - objectVariableValue;
    }

    public void setOrientation(int i) {
        this.getHighSpeedVideoFpsRanges = i;
    }

    public void apply() {
        if (this.getHighSpeedVideoFpsRangesFor == null || !this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        for (int i = 0; i < this.getHighSpeedVideoFpsRangesFor.size(); i++) {
            androidx.constraintlayout.core.widgets.analyzer.WidgetGroup.MeasureResult measureResult = this.getHighSpeedVideoFpsRangesFor.get(i);
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = measureResult.getOutputFormats.get();
            if (constraintWidget != null) {
                constraintWidget.setFinalFrame(measureResult.getHighSpeedVideoSizes, measureResult.getOutputMinFrameDuration, measureResult.getHighSpeedVideoFpsRanges, measureResult.Camera2StreamConfigurationMap, measureResult.getHighResolutionOutputSizeshNQ4ISI, measureResult.getHighSpeedVideoFpsRangesFor);
            }
        }
    }

    public boolean intersectWith(androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroup) {
        for (int i = 0; i < this.getHighSpeedVideoSizesFor.size(); i++) {
            if (widgetGroup.getHighSpeedVideoSizesFor.contains(this.getHighSpeedVideoSizesFor.get(i))) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return this.getHighSpeedVideoSizesFor.size();
    }

    public void cleanup(java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetGroup> arrayList) {
        int size = this.getHighSpeedVideoSizesFor.size();
        if (this.getOutputMinFrameDuration != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroup = arrayList.get(i);
                if (this.getOutputMinFrameDuration == widgetGroup.getHighSpeedVideoSizes) {
                    moveTo(this.getHighSpeedVideoFpsRanges, widgetGroup);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    static class MeasureResult {
        int Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;
        java.lang.ref.WeakReference<androidx.constraintlayout.core.widgets.ConstraintWidget> getOutputFormats;
        int getOutputMinFrameDuration;

        MeasureResult(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.core.LinearSystem linearSystem, int i) {
            this.getOutputFormats = new java.lang.ref.WeakReference<>(constraintWidget);
            this.getHighSpeedVideoSizes = linearSystem.getObjectVariableValue(constraintWidget.mLeft);
            this.getOutputMinFrameDuration = linearSystem.getObjectVariableValue(constraintWidget.mTop);
            this.getHighSpeedVideoFpsRanges = linearSystem.getObjectVariableValue(constraintWidget.mRight);
            this.Camera2StreamConfigurationMap = linearSystem.getObjectVariableValue(constraintWidget.mBottom);
            this.getHighResolutionOutputSizeshNQ4ISI = linearSystem.getObjectVariableValue(constraintWidget.mBaseline);
            this.getHighSpeedVideoFpsRangesFor = i;
        }
    }
}
