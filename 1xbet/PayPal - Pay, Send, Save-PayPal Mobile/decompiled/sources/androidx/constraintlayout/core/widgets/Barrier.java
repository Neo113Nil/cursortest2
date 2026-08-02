package androidx.constraintlayout.core.widgets;

/* loaded from: classes7.dex */
public class Barrier extends androidx.constraintlayout.core.widgets.HelperWidget {
    public static final int BOTTOM = 3;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int TOP = 2;
    private int init = 0;
    private boolean getHighResolutionOutputSizeshNQ4ISI = true;
    private int AMEXKernel = 0;
    boolean Camera2StreamConfigurationMap = false;

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean allowedInBarrier() {
        return true;
    }

    public Barrier() {
    }

    public Barrier(java.lang.String str) {
        setDebugName(str);
    }

    public int getBarrierType() {
        return this.init;
    }

    public void setBarrierType(int i) {
        this.init = i;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    @java.lang.Deprecated
    public boolean allowsGoneWidget() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public boolean getAllowsGoneWidget() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedHorizontally() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedVertically() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, java.util.HashMap<androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.ConstraintWidget> hashMap) {
        super.copy(constraintWidget, hashMap);
        androidx.constraintlayout.core.widgets.Barrier barrier = (androidx.constraintlayout.core.widgets.Barrier) constraintWidget;
        this.init = barrier.init;
        this.getHighResolutionOutputSizeshNQ4ISI = barrier.getHighResolutionOutputSizeshNQ4ISI;
        this.AMEXKernel = barrier.AMEXKernel;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[Barrier] ");
        sb.append(getDebugName());
        sb.append(" {");
        java.lang.String obj = sb.toString();
        for (int i = 0; i < this.mWidgetsCount; i++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.mWidgets[i];
            if (i > 0) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(obj);
                sb2.append(", ");
                obj = sb2.toString();
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(obj);
            sb3.append(constraintWidget.getDebugName());
            obj = sb3.toString();
        }
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(obj);
        sb4.append("}");
        return sb4.toString();
    }

    protected void markWidgets() {
        for (int i = 0; i < this.mWidgetsCount; i++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.mWidgets[i];
            if (this.getHighResolutionOutputSizeshNQ4ISI || constraintWidget.allowedInBarrier()) {
                int i2 = this.init;
                if (i2 == 0 || i2 == 1) {
                    constraintWidget.setInBarrier(0, true);
                } else if (i2 == 2 || i2 == 3) {
                    constraintWidget.setInBarrier(1, true);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(androidx.constraintlayout.core.LinearSystem linearSystem, boolean z) {
        boolean z2;
        int i;
        int i2;
        int i3;
        this.mListAnchors[0] = this.mLeft;
        this.mListAnchors[2] = this.mTop;
        this.mListAnchors[1] = this.mRight;
        this.mListAnchors[3] = this.mBottom;
        for (int i4 = 0; i4 < this.mListAnchors.length; i4++) {
            this.mListAnchors[i4].getHighSpeedVideoFpsRangesFor = linearSystem.createObjectVariable(this.mListAnchors[i4]);
        }
        int i5 = this.init;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor = this.mListAnchors[this.init];
        if (!this.Camera2StreamConfigurationMap) {
            allSolved();
        }
        if (this.Camera2StreamConfigurationMap) {
            this.Camera2StreamConfigurationMap = false;
            int i6 = this.init;
            if (i6 == 0 || i6 == 1) {
                linearSystem.addEquality(this.mLeft.getHighSpeedVideoFpsRangesFor, this.mX);
                linearSystem.addEquality(this.mRight.getHighSpeedVideoFpsRangesFor, this.mX);
                return;
            } else {
                if (i6 == 2 || i6 == 3) {
                    linearSystem.addEquality(this.mTop.getHighSpeedVideoFpsRangesFor, this.mY);
                    linearSystem.addEquality(this.mBottom.getHighSpeedVideoFpsRangesFor, this.mY);
                    return;
                }
                return;
            }
        }
        for (int i7 = 0; i7 < this.mWidgetsCount; i7++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.mWidgets[i7];
            if ((this.getHighResolutionOutputSizeshNQ4ISI || constraintWidget.allowedInBarrier()) && ((((i2 = this.init) == 0 || i2 == 1) && constraintWidget.getHorizontalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mLeft.mTarget != null && constraintWidget.mRight.mTarget != null) || (((i3 = this.init) == 2 || i3 == 3) && constraintWidget.getVerticalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mTop.mTarget != null && constraintWidget.mBottom.mTarget != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = this.mLeft.hasCenteredDependents() || this.mRight.hasCenteredDependents();
        boolean z4 = this.mTop.hasCenteredDependents() || this.mBottom.hasCenteredDependents();
        int i8 = (z2 || !(((i = this.init) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        for (int i9 = 0; i9 < this.mWidgetsCount; i9++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = this.mWidgets[i9];
            if (this.getHighResolutionOutputSizeshNQ4ISI || constraintWidget2.allowedInBarrier()) {
                androidx.constraintlayout.core.SolverVariable createObjectVariable = linearSystem.createObjectVariable(constraintWidget2.mListAnchors[this.init]);
                constraintWidget2.mListAnchors[this.init].getHighSpeedVideoFpsRangesFor = createObjectVariable;
                int i10 = (constraintWidget2.mListAnchors[this.init].mTarget == null || constraintWidget2.mListAnchors[this.init].mTarget.mOwner != this) ? 0 : constraintWidget2.mListAnchors[this.init].mMargin;
                int i11 = this.init;
                if (i11 == 0 || i11 == 2) {
                    linearSystem.addLowerBarrier(constraintAnchor.getHighSpeedVideoFpsRangesFor, createObjectVariable, this.AMEXKernel - i10, z2);
                } else {
                    linearSystem.addGreaterBarrier(constraintAnchor.getHighSpeedVideoFpsRangesFor, createObjectVariable, this.AMEXKernel + i10, z2);
                }
                linearSystem.addEquality(constraintAnchor.getHighSpeedVideoFpsRangesFor, createObjectVariable, this.AMEXKernel + i10, i8);
            }
        }
        int i12 = this.init;
        if (i12 == 0) {
            linearSystem.addEquality(this.mRight.getHighSpeedVideoFpsRangesFor, this.mLeft.getHighSpeedVideoFpsRangesFor, 0, 8);
            linearSystem.addEquality(this.mLeft.getHighSpeedVideoFpsRangesFor, this.mParent.mRight.getHighSpeedVideoFpsRangesFor, 0, 4);
            linearSystem.addEquality(this.mLeft.getHighSpeedVideoFpsRangesFor, this.mParent.mLeft.getHighSpeedVideoFpsRangesFor, 0, 0);
            return;
        }
        if (i12 == 1) {
            linearSystem.addEquality(this.mLeft.getHighSpeedVideoFpsRangesFor, this.mRight.getHighSpeedVideoFpsRangesFor, 0, 8);
            linearSystem.addEquality(this.mLeft.getHighSpeedVideoFpsRangesFor, this.mParent.mLeft.getHighSpeedVideoFpsRangesFor, 0, 4);
            linearSystem.addEquality(this.mLeft.getHighSpeedVideoFpsRangesFor, this.mParent.mRight.getHighSpeedVideoFpsRangesFor, 0, 0);
        } else if (i12 == 2) {
            linearSystem.addEquality(this.mBottom.getHighSpeedVideoFpsRangesFor, this.mTop.getHighSpeedVideoFpsRangesFor, 0, 8);
            linearSystem.addEquality(this.mTop.getHighSpeedVideoFpsRangesFor, this.mParent.mBottom.getHighSpeedVideoFpsRangesFor, 0, 4);
            linearSystem.addEquality(this.mTop.getHighSpeedVideoFpsRangesFor, this.mParent.mTop.getHighSpeedVideoFpsRangesFor, 0, 0);
        } else if (i12 == 3) {
            linearSystem.addEquality(this.mTop.getHighSpeedVideoFpsRangesFor, this.mBottom.getHighSpeedVideoFpsRangesFor, 0, 8);
            linearSystem.addEquality(this.mTop.getHighSpeedVideoFpsRangesFor, this.mParent.mTop.getHighSpeedVideoFpsRangesFor, 0, 4);
            linearSystem.addEquality(this.mTop.getHighSpeedVideoFpsRangesFor, this.mParent.mBottom.getHighSpeedVideoFpsRangesFor, 0, 0);
        }
    }

    public void setMargin(int i) {
        this.AMEXKernel = i;
    }

    public int getMargin() {
        return this.AMEXKernel;
    }

    public int getOrientation() {
        int i = this.init;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    public boolean allSolved() {
        int i;
        int i2;
        boolean z = true;
        for (int i3 = 0; i3 < this.mWidgetsCount; i3++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.mWidgets[i3];
            if ((this.getHighResolutionOutputSizeshNQ4ISI || constraintWidget.allowedInBarrier()) && ((((i = this.init) == 0 || i == 1) && !constraintWidget.isResolvedHorizontally()) || (((i2 = this.init) == 2 || i2 == 3) && !constraintWidget.isResolvedVertically()))) {
                z = false;
            }
        }
        if (!z || this.mWidgetsCount <= 0) {
            return false;
        }
        int i4 = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.mWidgetsCount; i5++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = this.mWidgets[i5];
            if (this.getHighResolutionOutputSizeshNQ4ISI || constraintWidget2.allowedInBarrier()) {
                if (!z2) {
                    int i6 = this.init;
                    if (i6 == 0) {
                        i4 = constraintWidget2.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT).getFinalValue();
                    } else if (i6 == 1) {
                        i4 = constraintWidget2.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT).getFinalValue();
                    } else if (i6 == 2) {
                        i4 = constraintWidget2.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP).getFinalValue();
                    } else if (i6 == 3) {
                        i4 = constraintWidget2.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM).getFinalValue();
                    }
                    z2 = true;
                }
                int i7 = this.init;
                if (i7 == 0) {
                    i4 = java.lang.Math.min(i4, constraintWidget2.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT).getFinalValue());
                } else if (i7 == 1) {
                    i4 = java.lang.Math.max(i4, constraintWidget2.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT).getFinalValue());
                } else if (i7 == 2) {
                    i4 = java.lang.Math.min(i4, constraintWidget2.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP).getFinalValue());
                } else if (i7 == 3) {
                    i4 = java.lang.Math.max(i4, constraintWidget2.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM).getFinalValue());
                }
            }
        }
        int i8 = i4 + this.AMEXKernel;
        int i9 = this.init;
        if (i9 == 0 || i9 == 1) {
            setFinalHorizontal(i8, i8);
        } else {
            setFinalVertical(i8, i8);
        }
        this.Camera2StreamConfigurationMap = true;
        return true;
    }
}
