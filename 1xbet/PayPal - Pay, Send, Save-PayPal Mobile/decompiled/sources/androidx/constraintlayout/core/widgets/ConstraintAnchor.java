package androidx.constraintlayout.core.widgets;

/* loaded from: classes7.dex */
public class ConstraintAnchor {
    private boolean Camera2StreamConfigurationMap;
    androidx.constraintlayout.core.SolverVariable getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    public final androidx.constraintlayout.core.widgets.ConstraintWidget mOwner;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor mTarget;
    public final androidx.constraintlayout.core.widgets.ConstraintAnchor.Type mType;
    private java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> getHighSpeedVideoFpsRanges = null;
    public int mMargin = 0;
    int getHighResolutionOutputSizeshNQ4ISI = Integer.MIN_VALUE;

    public enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public void findDependents(int i, java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetGroup> arrayList, androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroup) {
        java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> hashSet = this.getHighSpeedVideoFpsRanges;
        if (hashSet != null) {
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.analyzer.Grouping.findDependents(it.next().mOwner, i, arrayList, widgetGroup);
            }
        }
    }

    public java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> getDependents() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public boolean hasDependents() {
        java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> hashSet = this.getHighSpeedVideoFpsRanges;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean hasCenteredDependents() {
        java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> hashSet = this.getHighSpeedVideoFpsRanges;
        if (hashSet == null) {
            return false;
        }
        java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().getOpposite().isConnected()) {
                return true;
            }
        }
        return false;
    }

    public void setFinalValue(int i) {
        this.getHighSpeedVideoSizes = i;
        this.Camera2StreamConfigurationMap = true;
    }

    public int getFinalValue() {
        if (this.Camera2StreamConfigurationMap) {
            return this.getHighSpeedVideoSizes;
        }
        return 0;
    }

    public void resetFinalResolution() {
        this.Camera2StreamConfigurationMap = false;
        this.getHighSpeedVideoSizes = 0;
    }

    public boolean hasFinalValue() {
        return this.Camera2StreamConfigurationMap;
    }

    public void copyFrom(androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor, java.util.HashMap<androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.ConstraintWidget> hashMap) {
        java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> hashSet;
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor2 = this.mTarget;
        if (constraintAnchor2 != null && (hashSet = constraintAnchor2.getHighSpeedVideoFpsRanges) != null) {
            hashSet.remove(this);
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor3 = constraintAnchor.mTarget;
        if (constraintAnchor3 != null) {
            this.mTarget = hashMap.get(constraintAnchor.mTarget.mOwner).getAnchor(constraintAnchor3.getType());
        } else {
            this.mTarget = null;
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor4 = this.mTarget;
        if (constraintAnchor4 != null) {
            if (constraintAnchor4.getHighSpeedVideoFpsRanges == null) {
                constraintAnchor4.getHighSpeedVideoFpsRanges = new java.util.HashSet<>();
            }
            this.mTarget.getHighSpeedVideoFpsRanges.add(this);
        }
        this.mMargin = constraintAnchor.mMargin;
        this.getHighResolutionOutputSizeshNQ4ISI = constraintAnchor.getHighResolutionOutputSizeshNQ4ISI;
    }

    public ConstraintAnchor(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type type) {
        this.mOwner = constraintWidget;
        this.mType = type;
    }

    public androidx.constraintlayout.core.SolverVariable getSolverVariable() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void resetSolverVariable(androidx.constraintlayout.core.Cache cache) {
        androidx.constraintlayout.core.SolverVariable solverVariable = this.getHighSpeedVideoFpsRangesFor;
        if (solverVariable == null) {
            this.getHighSpeedVideoFpsRangesFor = new androidx.constraintlayout.core.SolverVariable(androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED, (java.lang.String) null);
        } else {
            solverVariable.reset();
        }
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getOwner() {
        return this.mOwner;
    }

    public androidx.constraintlayout.core.widgets.ConstraintAnchor.Type getType() {
        return this.mType;
    }

    public int getMargin() {
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor;
        if (this.mOwner.getVisibility() == 8) {
            return 0;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI != Integer.MIN_VALUE && (constraintAnchor = this.mTarget) != null && constraintAnchor.mOwner.getVisibility() == 8) {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
        return this.mMargin;
    }

    public androidx.constraintlayout.core.widgets.ConstraintAnchor getTarget() {
        return this.mTarget;
    }

    public void reset() {
        java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> hashSet;
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor = this.mTarget;
        if (constraintAnchor != null && (hashSet = constraintAnchor.getHighSpeedVideoFpsRanges) != null) {
            hashSet.remove(this);
            if (this.mTarget.getHighSpeedVideoFpsRanges.size() == 0) {
                this.mTarget.getHighSpeedVideoFpsRanges = null;
            }
        }
        this.getHighSpeedVideoFpsRanges = null;
        this.mTarget = null;
        this.mMargin = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = Integer.MIN_VALUE;
        this.Camera2StreamConfigurationMap = false;
        this.getHighSpeedVideoSizes = 0;
    }

    public boolean connect(androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor, int i, int i2, boolean z) {
        if (constraintAnchor == null) {
            reset();
            return true;
        }
        if (!z && !isValidConnection(constraintAnchor)) {
            return false;
        }
        this.mTarget = constraintAnchor;
        if (constraintAnchor.getHighSpeedVideoFpsRanges == null) {
            constraintAnchor.getHighSpeedVideoFpsRanges = new java.util.HashSet<>();
        }
        java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> hashSet = this.mTarget.getHighSpeedVideoFpsRanges;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.mMargin = i;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        return true;
    }

    public boolean connect(androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor, int i) {
        return connect(constraintAnchor, i, Integer.MIN_VALUE, false);
    }

    public boolean isConnected() {
        return this.mTarget != null;
    }

    public boolean isValidConnection(androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor) {
        if (constraintAnchor == null) {
            return false;
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor.Type type = constraintAnchor.getType();
        androidx.constraintlayout.core.widgets.ConstraintAnchor.Type type2 = this.mType;
        if (type == type2) {
            return type2 != androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE || (constraintAnchor.getOwner().hasBaseline() && getOwner().hasBaseline());
        }
        switch (type2) {
            case NONE:
            case CENTER_X:
            case CENTER_Y:
                return false;
            case LEFT:
            case RIGHT:
                boolean z = type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT || type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT;
                return constraintAnchor.getOwner() instanceof androidx.constraintlayout.core.widgets.Guideline ? z || type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X : z;
            case TOP:
            case BOTTOM:
                boolean z2 = type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP || type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM;
                return constraintAnchor.getOwner() instanceof androidx.constraintlayout.core.widgets.Guideline ? z2 || type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y : z2;
            case BASELINE:
                return (type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT || type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT) ? false : true;
            case CENTER:
                return (type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE || type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X || type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y) ? false : true;
            default:
                throw new java.lang.AssertionError(this.mType.name());
        }
    }

    public boolean isSideAnchor() {
        switch (this.mType) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return false;
            case LEFT:
            case TOP:
            case RIGHT:
            case BOTTOM:
                return true;
            default:
                throw new java.lang.AssertionError(this.mType.name());
        }
    }

    public boolean isSimilarDimensionConnection(androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor) {
        androidx.constraintlayout.core.widgets.ConstraintAnchor.Type type = constraintAnchor.getType();
        androidx.constraintlayout.core.widgets.ConstraintAnchor.Type type2 = this.mType;
        if (type == type2) {
            return true;
        }
        switch (type2) {
            case NONE:
                return false;
            case LEFT:
            case RIGHT:
            case CENTER_X:
                return type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT || type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT || type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X;
            case TOP:
            case BOTTOM:
            case BASELINE:
            case CENTER_Y:
                return type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP || type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM || type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y || type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE;
            case CENTER:
                return type != androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE;
            default:
                throw new java.lang.AssertionError(this.mType.name());
        }
    }

    public void setMargin(int i) {
        if (isConnected()) {
            this.mMargin = i;
        }
    }

    public void setGoneMargin(int i) {
        if (isConnected()) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }
    }

    public boolean isVerticalAnchor() {
        switch (this.mType) {
            case NONE:
            case TOP:
            case BOTTOM:
            case BASELINE:
            case CENTER_Y:
                return true;
            case LEFT:
            case RIGHT:
            case CENTER:
            case CENTER_X:
                return false;
            default:
                throw new java.lang.AssertionError(this.mType.name());
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.mOwner.getDebugName());
        sb.append(io.ktor.sse.ServerSentEventKt.COLON);
        sb.append(this.mType.toString());
        return sb.toString();
    }

    public boolean isConnectionAllowed(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor) {
        return isConnectionAllowed(constraintWidget);
    }

    public boolean isConnectionAllowed(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        if (Camera2StreamConfigurationMap(constraintWidget, new java.util.HashSet<>())) {
            return false;
        }
        androidx.constraintlayout.core.widgets.ConstraintWidget parent = getOwner().getParent();
        return parent == constraintWidget || constraintWidget.getParent() == parent;
    }

    private boolean Camera2StreamConfigurationMap(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintWidget> hashSet) {
        if (hashSet.contains(constraintWidget)) {
            return false;
        }
        hashSet.add(constraintWidget);
        if (constraintWidget == getOwner()) {
            return true;
        }
        java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> anchors = constraintWidget.getAnchors();
        int size = anchors.size();
        for (int i = 0; i < size; i++) {
            androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor = anchors.get(i);
            if (constraintAnchor.isSimilarDimensionConnection(this) && constraintAnchor.isConnected() && Camera2StreamConfigurationMap(constraintAnchor.getTarget().getOwner(), hashSet)) {
                return true;
            }
        }
        return false;
    }

    public final androidx.constraintlayout.core.widgets.ConstraintAnchor getOpposite() {
        switch (this.mType) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return null;
            case LEFT:
                return this.mOwner.mRight;
            case TOP:
                return this.mOwner.mBottom;
            case RIGHT:
                return this.mOwner.mLeft;
            case BOTTOM:
                return this.mOwner.mTop;
            default:
                throw new java.lang.AssertionError(this.mType.name());
        }
    }
}
