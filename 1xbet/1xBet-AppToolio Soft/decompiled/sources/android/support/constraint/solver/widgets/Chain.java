package android.support.constraint.solver.widgets;

import android.support.constraint.solver.ArrayRow;
import android.support.constraint.solver.LinearSystem;
import android.support.constraint.solver.SolverVariable;
import android.support.constraint.solver.widgets.ConstraintWidget;
import java.util.ArrayList;

/* loaded from: classes.dex */
class Chain {
    private static final boolean DEBUG = false;

    Chain() {
    }

    static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, int i) {
        int i2;
        int i3;
        ChainHead[] chainHeadArr;
        if (i == 0) {
            int i4 = constraintWidgetContainer.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer.mHorizontalChainsArray;
            i3 = i4;
            i2 = 0;
        } else {
            i2 = 2;
            i3 = constraintWidgetContainer.mVerticalChainsSize;
            chainHeadArr = constraintWidgetContainer.mVerticalChainsArray;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            ChainHead chainHead = chainHeadArr[i5];
            chainHead.define();
            if (constraintWidgetContainer.optimizeFor(4)) {
                if (!Optimizer.applyChainOptimized(constraintWidgetContainer, linearSystem, i, i2, chainHead)) {
                    applyChainConstraints(constraintWidgetContainer, linearSystem, i, i2, chainHead);
                }
            } else {
                applyChainConstraints(constraintWidgetContainer, linearSystem, i, i2, chainHead);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, int i, int i2, ChainHead chainHead) {
        boolean z;
        ConstraintWidget constraintWidget;
        boolean z2;
        boolean z3;
        boolean z4;
        ArrayList<ConstraintWidget> arrayList;
        ConstraintWidget constraintWidget2;
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        int i3;
        ConstraintWidget constraintWidget3;
        int i4;
        ConstraintAnchor constraintAnchor4;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        ConstraintWidget constraintWidget4;
        ConstraintAnchor constraintAnchor5;
        SolverVariable solverVariable3;
        SolverVariable solverVariable4;
        ConstraintWidget constraintWidget5;
        SolverVariable solverVariable5;
        SolverVariable solverVariable6;
        float f;
        int size;
        int i5;
        float f2;
        ArrayList<ConstraintWidget> arrayList2;
        int i6;
        float f3;
        int i7;
        boolean z5;
        ConstraintWidget constraintWidget6;
        boolean z6;
        int i8;
        ConstraintWidget constraintWidget7 = chainHead.mFirst;
        ConstraintWidget constraintWidget8 = chainHead.mLast;
        ConstraintWidget constraintWidget9 = chainHead.mFirstVisibleWidget;
        ConstraintWidget constraintWidget10 = chainHead.mLastVisibleWidget;
        ConstraintWidget constraintWidget11 = chainHead.mHead;
        float f4 = chainHead.mTotalWeight;
        ConstraintWidget constraintWidget12 = chainHead.mFirstMatchConstraintWidget;
        ConstraintWidget constraintWidget13 = chainHead.mLastMatchConstraintWidget;
        boolean z7 = constraintWidgetContainer.mListDimensionBehaviors[i] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (i == 0) {
            z = constraintWidget11.mHorizontalChainStyle == 0;
            constraintWidget = constraintWidget7;
            z2 = constraintWidget11.mHorizontalChainStyle == 1;
            z3 = constraintWidget11.mHorizontalChainStyle == 2;
            z4 = false;
        } else {
            z = constraintWidget11.mVerticalChainStyle == 0;
            constraintWidget = constraintWidget7;
            z2 = constraintWidget11.mVerticalChainStyle == 1;
            z3 = constraintWidget11.mVerticalChainStyle == 2;
            z4 = false;
        }
        while (true) {
            ConstraintWidget constraintWidget14 = null;
            if (z4) {
                break;
            }
            ConstraintAnchor constraintAnchor6 = constraintWidget.mListAnchors[i2];
            int i9 = (z7 || z3) ? 1 : 4;
            int margin = constraintAnchor6.getMargin();
            int margin2 = (constraintAnchor6.mTarget == null || constraintWidget == constraintWidget7) ? margin : margin + constraintAnchor6.mTarget.getMargin();
            if (z3 && constraintWidget != constraintWidget7 && constraintWidget != constraintWidget9) {
                f3 = f4;
                z5 = z4;
                i7 = 6;
            } else if (z && z7) {
                f3 = f4;
                z5 = z4;
                i7 = 4;
            } else {
                f3 = f4;
                i7 = i9;
                z5 = z4;
            }
            if (constraintAnchor6.mTarget != null) {
                if (constraintWidget == constraintWidget9) {
                    z6 = z;
                    constraintWidget6 = constraintWidget11;
                    linearSystem.addGreaterThan(constraintAnchor6.mSolverVariable, constraintAnchor6.mTarget.mSolverVariable, margin2, 5);
                } else {
                    constraintWidget6 = constraintWidget11;
                    z6 = z;
                    linearSystem.addGreaterThan(constraintAnchor6.mSolverVariable, constraintAnchor6.mTarget.mSolverVariable, margin2, 6);
                }
                linearSystem.addEquality(constraintAnchor6.mSolverVariable, constraintAnchor6.mTarget.mSolverVariable, margin2, i7);
            } else {
                constraintWidget6 = constraintWidget11;
                z6 = z;
            }
            if (z7) {
                if (constraintWidget.getVisibility() == 8 || constraintWidget.mListDimensionBehaviors[i] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i8 = 0;
                } else {
                    i8 = 0;
                    linearSystem.addGreaterThan(constraintWidget.mListAnchors[i2 + 1].mSolverVariable, constraintWidget.mListAnchors[i2].mSolverVariable, 0, 5);
                }
                linearSystem.addGreaterThan(constraintWidget.mListAnchors[i2].mSolverVariable, constraintWidgetContainer.mListAnchors[i2].mSolverVariable, i8, 6);
            }
            ConstraintAnchor constraintAnchor7 = constraintWidget.mListAnchors[i2 + 1].mTarget;
            if (constraintAnchor7 != null) {
                ConstraintWidget constraintWidget15 = constraintAnchor7.mOwner;
                if (constraintWidget15.mListAnchors[i2].mTarget != null && constraintWidget15.mListAnchors[i2].mTarget.mOwner == constraintWidget) {
                    constraintWidget14 = constraintWidget15;
                }
            }
            if (constraintWidget14 != null) {
                constraintWidget = constraintWidget14;
                z4 = z5;
            } else {
                z4 = true;
            }
            f4 = f3;
            z = z6;
            constraintWidget11 = constraintWidget6;
        }
        ConstraintWidget constraintWidget16 = constraintWidget11;
        float f5 = f4;
        boolean z8 = z;
        if (constraintWidget10 != null) {
            int i10 = i2 + 1;
            if (constraintWidget8.mListAnchors[i10].mTarget != null) {
                ConstraintAnchor constraintAnchor8 = constraintWidget10.mListAnchors[i10];
                linearSystem.addLowerThan(constraintAnchor8.mSolverVariable, constraintWidget8.mListAnchors[i10].mTarget.mSolverVariable, -constraintAnchor8.getMargin(), 5);
                if (z7) {
                    int i11 = i2 + 1;
                    linearSystem.addGreaterThan(constraintWidgetContainer.mListAnchors[i11].mSolverVariable, constraintWidget8.mListAnchors[i11].mSolverVariable, constraintWidget8.mListAnchors[i11].getMargin(), 6);
                }
                arrayList = chainHead.mWeightedMatchConstraintsWidgets;
                if (arrayList != null && (size = arrayList.size()) > 1) {
                    float f6 = (chainHead.mHasUndefinedWeights || chainHead.mHasComplexMatchWeights) ? f5 : chainHead.mWidgetsMatchCount;
                    float f7 = 0.0f;
                    ConstraintWidget constraintWidget17 = null;
                    i5 = 0;
                    float f8 = 0.0f;
                    while (i5 < size) {
                        ConstraintWidget constraintWidget18 = arrayList.get(i5);
                        float f9 = constraintWidget18.mWeight[i];
                        if (f9 >= f7) {
                            f2 = 0.0f;
                        } else if (chainHead.mHasComplexMatchWeights) {
                            linearSystem.addEquality(constraintWidget18.mListAnchors[i2 + 1].mSolverVariable, constraintWidget18.mListAnchors[i2].mSolverVariable, 0, 4);
                            arrayList2 = arrayList;
                            i6 = size;
                            i5++;
                            size = i6;
                            arrayList = arrayList2;
                            f7 = 0.0f;
                        } else {
                            f9 = 1.0f;
                            f2 = 0.0f;
                        }
                        if (f9 == f2) {
                            linearSystem.addEquality(constraintWidget18.mListAnchors[i2 + 1].mSolverVariable, constraintWidget18.mListAnchors[i2].mSolverVariable, 0, 6);
                            arrayList2 = arrayList;
                            i6 = size;
                            i5++;
                            size = i6;
                            arrayList = arrayList2;
                            f7 = 0.0f;
                        } else {
                            if (constraintWidget17 != null) {
                                SolverVariable solverVariable7 = constraintWidget17.mListAnchors[i2].mSolverVariable;
                                int i12 = i2 + 1;
                                SolverVariable solverVariable8 = constraintWidget17.mListAnchors[i12].mSolverVariable;
                                SolverVariable solverVariable9 = constraintWidget18.mListAnchors[i2].mSolverVariable;
                                arrayList2 = arrayList;
                                SolverVariable solverVariable10 = constraintWidget18.mListAnchors[i12].mSolverVariable;
                                i6 = size;
                                ArrayRow createRow = linearSystem.createRow();
                                createRow.createRowEqualMatchDimensions(f8, f6, f9, solverVariable7, solverVariable8, solverVariable9, solverVariable10);
                                linearSystem.addConstraint(createRow);
                            } else {
                                arrayList2 = arrayList;
                                i6 = size;
                            }
                            f8 = f9;
                            constraintWidget17 = constraintWidget18;
                            i5++;
                            size = i6;
                            arrayList = arrayList2;
                            f7 = 0.0f;
                        }
                    }
                }
                if (constraintWidget9 == null && (constraintWidget9 == constraintWidget10 || z3)) {
                    ConstraintAnchor constraintAnchor9 = constraintWidget7.mListAnchors[i2];
                    int i13 = i2 + 1;
                    ConstraintAnchor constraintAnchor10 = constraintWidget8.mListAnchors[i13];
                    SolverVariable solverVariable11 = constraintWidget7.mListAnchors[i2].mTarget != null ? constraintWidget7.mListAnchors[i2].mTarget.mSolverVariable : null;
                    SolverVariable solverVariable12 = constraintWidget8.mListAnchors[i13].mTarget != null ? constraintWidget8.mListAnchors[i13].mTarget.mSolverVariable : null;
                    if (constraintWidget9 == constraintWidget10) {
                        constraintAnchor9 = constraintWidget9.mListAnchors[i2];
                        constraintAnchor10 = constraintWidget9.mListAnchors[i13];
                    }
                    if (solverVariable11 != null && solverVariable12 != null) {
                        if (i == 0) {
                            f = constraintWidget16.mHorizontalBiasPercent;
                        } else {
                            f = constraintWidget16.mVerticalBiasPercent;
                        }
                        linearSystem.addCentering(constraintAnchor9.mSolverVariable, solverVariable11, constraintAnchor9.getMargin(), f, solverVariable12, constraintAnchor10.mSolverVariable, constraintAnchor10.getMargin(), 5);
                    }
                } else if (z8 || constraintWidget9 == null) {
                    int i14 = 8;
                    if (z2 && constraintWidget9 != null) {
                        boolean z9 = chainHead.mWidgetsMatchCount <= 0 && chainHead.mWidgetsCount == chainHead.mWidgetsMatchCount;
                        constraintWidget2 = constraintWidget9;
                        ConstraintWidget constraintWidget19 = constraintWidget2;
                        while (constraintWidget2 != null) {
                            ConstraintWidget constraintWidget20 = constraintWidget2.mNextChainWidget[i];
                            while (constraintWidget20 != null && constraintWidget20.getVisibility() == i14) {
                                constraintWidget20 = constraintWidget20.mNextChainWidget[i];
                            }
                            if (constraintWidget2 == constraintWidget9 || constraintWidget2 == constraintWidget10 || constraintWidget20 == null) {
                                constraintWidget3 = constraintWidget19;
                                i4 = 8;
                            } else {
                                ConstraintWidget constraintWidget21 = constraintWidget20 == constraintWidget10 ? null : constraintWidget20;
                                ConstraintAnchor constraintAnchor11 = constraintWidget2.mListAnchors[i2];
                                SolverVariable solverVariable13 = constraintAnchor11.mSolverVariable;
                                if (constraintAnchor11.mTarget != null) {
                                    SolverVariable solverVariable14 = constraintAnchor11.mTarget.mSolverVariable;
                                }
                                int i15 = i2 + 1;
                                SolverVariable solverVariable15 = constraintWidget19.mListAnchors[i15].mSolverVariable;
                                int margin3 = constraintAnchor11.getMargin();
                                int margin4 = constraintWidget2.mListAnchors[i15].getMargin();
                                if (constraintWidget21 != null) {
                                    constraintAnchor4 = constraintWidget21.mListAnchors[i2];
                                    solverVariable = constraintAnchor4.mSolverVariable;
                                    solverVariable2 = constraintAnchor4.mTarget != null ? constraintAnchor4.mTarget.mSolverVariable : null;
                                } else {
                                    constraintAnchor4 = constraintWidget2.mListAnchors[i15].mTarget;
                                    solverVariable = constraintAnchor4 != null ? constraintAnchor4.mSolverVariable : null;
                                    solverVariable2 = constraintWidget2.mListAnchors[i15].mSolverVariable;
                                }
                                int margin5 = constraintAnchor4 != null ? margin4 + constraintAnchor4.getMargin() : margin4;
                                int margin6 = constraintWidget19 != null ? margin3 + constraintWidget19.mListAnchors[i15].getMargin() : margin3;
                                int i16 = z9 ? 6 : 4;
                                if (solverVariable13 == null || solverVariable15 == null || solverVariable == null || solverVariable2 == null) {
                                    constraintWidget4 = constraintWidget21;
                                    constraintWidget3 = constraintWidget19;
                                    i4 = 8;
                                } else {
                                    constraintWidget4 = constraintWidget21;
                                    int i17 = margin5;
                                    constraintWidget3 = constraintWidget19;
                                    i4 = 8;
                                    linearSystem.addCentering(solverVariable13, solverVariable15, margin6, 0.5f, solverVariable, solverVariable2, i17, i16);
                                }
                                constraintWidget20 = constraintWidget4;
                            }
                            if (constraintWidget2.getVisibility() == i4) {
                                constraintWidget2 = constraintWidget3;
                            }
                            constraintWidget19 = constraintWidget2;
                            i14 = 8;
                            constraintWidget2 = constraintWidget20;
                        }
                        ConstraintAnchor constraintAnchor12 = constraintWidget9.mListAnchors[i2];
                        constraintAnchor = constraintWidget7.mListAnchors[i2].mTarget;
                        int i18 = i2 + 1;
                        constraintAnchor2 = constraintWidget10.mListAnchors[i18];
                        constraintAnchor3 = constraintWidget8.mListAnchors[i18].mTarget;
                        if (constraintAnchor != null) {
                            i3 = 5;
                        } else if (constraintWidget9 != constraintWidget10) {
                            i3 = 5;
                            linearSystem.addEquality(constraintAnchor12.mSolverVariable, constraintAnchor.mSolverVariable, constraintAnchor12.getMargin(), 5);
                        } else {
                            i3 = 5;
                            if (constraintAnchor3 != null) {
                                linearSystem.addCentering(constraintAnchor12.mSolverVariable, constraintAnchor.mSolverVariable, constraintAnchor12.getMargin(), 0.5f, constraintAnchor2.mSolverVariable, constraintAnchor3.mSolverVariable, constraintAnchor2.getMargin(), 5);
                            }
                        }
                        if (constraintAnchor3 != null && constraintWidget9 != constraintWidget10) {
                            linearSystem.addEquality(constraintAnchor2.mSolverVariable, constraintAnchor3.mSolverVariable, -constraintAnchor2.getMargin(), i3);
                        }
                    }
                } else {
                    boolean z10 = chainHead.mWidgetsMatchCount > 0 && chainHead.mWidgetsCount == chainHead.mWidgetsMatchCount;
                    ConstraintWidget constraintWidget22 = constraintWidget9;
                    ConstraintWidget constraintWidget23 = constraintWidget22;
                    while (constraintWidget22 != null) {
                        ConstraintWidget constraintWidget24 = constraintWidget22.mNextChainWidget[i];
                        while (constraintWidget24 != null && constraintWidget24.getVisibility() == 8) {
                            constraintWidget24 = constraintWidget24.mNextChainWidget[i];
                        }
                        if (constraintWidget24 != null || constraintWidget22 == constraintWidget10) {
                            ConstraintAnchor constraintAnchor13 = constraintWidget22.mListAnchors[i2];
                            SolverVariable solverVariable16 = constraintAnchor13.mSolverVariable;
                            SolverVariable solverVariable17 = constraintAnchor13.mTarget != null ? constraintAnchor13.mTarget.mSolverVariable : null;
                            if (constraintWidget23 != constraintWidget22) {
                                solverVariable17 = constraintWidget23.mListAnchors[i2 + 1].mSolverVariable;
                            } else if (constraintWidget22 == constraintWidget9 && constraintWidget23 == constraintWidget22) {
                                solverVariable17 = constraintWidget7.mListAnchors[i2].mTarget != null ? constraintWidget7.mListAnchors[i2].mTarget.mSolverVariable : null;
                            }
                            int margin7 = constraintAnchor13.getMargin();
                            int i19 = i2 + 1;
                            int margin8 = constraintWidget22.mListAnchors[i19].getMargin();
                            if (constraintWidget24 != null) {
                                constraintAnchor5 = constraintWidget24.mListAnchors[i2];
                                solverVariable3 = constraintAnchor5.mSolverVariable;
                                solverVariable4 = constraintWidget22.mListAnchors[i19].mSolverVariable;
                            } else {
                                constraintAnchor5 = constraintWidget8.mListAnchors[i19].mTarget;
                                solverVariable3 = constraintAnchor5 != null ? constraintAnchor5.mSolverVariable : null;
                                solverVariable4 = constraintWidget22.mListAnchors[i19].mSolverVariable;
                            }
                            if (constraintAnchor5 != null) {
                                margin8 += constraintAnchor5.getMargin();
                            }
                            if (constraintWidget23 != null) {
                                margin7 += constraintWidget23.mListAnchors[i19].getMargin();
                            }
                            if (solverVariable16 == null || solverVariable17 == null || solverVariable3 == null || solverVariable4 == null) {
                                constraintWidget5 = constraintWidget24;
                            } else {
                                int margin9 = constraintWidget22 == constraintWidget9 ? constraintWidget9.mListAnchors[i2].getMargin() : margin7;
                                int margin10 = constraintWidget22 == constraintWidget10 ? constraintWidget10.mListAnchors[i19].getMargin() : margin8;
                                int i20 = margin9;
                                SolverVariable solverVariable18 = solverVariable3;
                                SolverVariable solverVariable19 = solverVariable4;
                                int i21 = margin10;
                                constraintWidget5 = constraintWidget24;
                                linearSystem.addCentering(solverVariable16, solverVariable17, i20, 0.5f, solverVariable18, solverVariable19, i21, z10 ? 6 : 4);
                            }
                        } else {
                            constraintWidget5 = constraintWidget24;
                        }
                        if (constraintWidget22.getVisibility() != 8) {
                            constraintWidget23 = constraintWidget22;
                        }
                        constraintWidget22 = constraintWidget5;
                    }
                }
                if ((!z8 || z2) && constraintWidget9 != null) {
                    ConstraintAnchor constraintAnchor14 = constraintWidget9.mListAnchors[i2];
                    int i22 = i2 + 1;
                    ConstraintAnchor constraintAnchor15 = constraintWidget10.mListAnchors[i22];
                    solverVariable5 = constraintAnchor14.mTarget == null ? constraintAnchor14.mTarget.mSolverVariable : null;
                    SolverVariable solverVariable20 = constraintAnchor15.mTarget == null ? constraintAnchor15.mTarget.mSolverVariable : null;
                    if (constraintWidget8 == constraintWidget10) {
                        ConstraintAnchor constraintAnchor16 = constraintWidget8.mListAnchors[i22];
                        solverVariable6 = constraintAnchor16.mTarget != null ? constraintAnchor16.mTarget.mSolverVariable : null;
                    } else {
                        solverVariable6 = solverVariable20;
                    }
                    if (constraintWidget9 == constraintWidget10) {
                        constraintAnchor14 = constraintWidget9.mListAnchors[i2];
                        constraintAnchor15 = constraintWidget9.mListAnchors[i22];
                    }
                    if (solverVariable5 != null || solverVariable6 == null) {
                    }
                    int margin11 = constraintAnchor14.getMargin();
                    if (constraintWidget10 != null) {
                        constraintWidget8 = constraintWidget10;
                    }
                    linearSystem.addCentering(constraintAnchor14.mSolverVariable, solverVariable5, margin11, 0.5f, solverVariable6, constraintAnchor15.mSolverVariable, constraintWidget8.mListAnchors[i22].getMargin(), 5);
                    return;
                }
                return;
            }
        }
        if (z7) {
        }
        arrayList = chainHead.mWeightedMatchConstraintsWidgets;
        if (arrayList != null) {
            if (chainHead.mHasUndefinedWeights) {
            }
            float f72 = 0.0f;
            ConstraintWidget constraintWidget172 = null;
            i5 = 0;
            float f82 = 0.0f;
            while (i5 < size) {
            }
        }
        if (constraintWidget9 == null) {
        }
        if (z8) {
        }
        int i142 = 8;
        if (z2) {
            if (chainHead.mWidgetsMatchCount <= 0) {
            }
            constraintWidget2 = constraintWidget9;
            ConstraintWidget constraintWidget192 = constraintWidget2;
            while (constraintWidget2 != null) {
            }
            ConstraintAnchor constraintAnchor122 = constraintWidget9.mListAnchors[i2];
            constraintAnchor = constraintWidget7.mListAnchors[i2].mTarget;
            int i182 = i2 + 1;
            constraintAnchor2 = constraintWidget10.mListAnchors[i182];
            constraintAnchor3 = constraintWidget8.mListAnchors[i182].mTarget;
            if (constraintAnchor != null) {
            }
            if (constraintAnchor3 != null) {
                linearSystem.addEquality(constraintAnchor2.mSolverVariable, constraintAnchor3.mSolverVariable, -constraintAnchor2.getMargin(), i3);
            }
        }
        if (z8) {
        }
        ConstraintAnchor constraintAnchor142 = constraintWidget9.mListAnchors[i2];
        int i222 = i2 + 1;
        ConstraintAnchor constraintAnchor152 = constraintWidget10.mListAnchors[i222];
        if (constraintAnchor142.mTarget == null) {
        }
        if (constraintAnchor152.mTarget == null) {
        }
        if (constraintWidget8 == constraintWidget10) {
        }
        if (constraintWidget9 == constraintWidget10) {
        }
        if (solverVariable5 != null) {
        }
    }
}
