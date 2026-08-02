package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.ArrayRow;
import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;

/* loaded from: classes.dex */
class Chain {
    private static final boolean DEBUG = false;

    public static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, int i) {
        int i2;
        ChainHead[] chainHeadArr;
        int i3;
        if (i == 0) {
            i2 = constraintWidgetContainer.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer.mHorizontalChainsArray;
            i3 = 0;
        } else {
            i2 = constraintWidgetContainer.mVerticalChainsSize;
            chainHeadArr = constraintWidgetContainer.mVerticalChainsArray;
            i3 = 2;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            ChainHead chainHead = chainHeadArr[i4];
            chainHead.define();
            applyChainConstraints(constraintWidgetContainer, linearSystem, i, i3, chainHead);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r8 == 2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0031, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0041, code lost:
    
        if (r8 == 2) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x024b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0397 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01bf  */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [androidx.constraintlayout.solver.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r4v45, types: [androidx.constraintlayout.solver.widgets.ConstraintWidget] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, int i, int i2, ChainHead chainHead) {
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        ArrayList<ConstraintWidget> arrayList;
        ConstraintWidget constraintWidget;
        LinearSystem linearSystem2;
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintWidget constraintWidget2;
        ConstraintAnchor constraintAnchor4;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        ConstraintWidget constraintWidget3;
        int i3;
        ConstraintAnchor constraintAnchor5;
        SolverVariable solverVariable3;
        SolverVariable solverVariable4;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5;
        int i4;
        SolverVariable solverVariable5;
        float f2;
        int size;
        int i5;
        float f3;
        ArrayList<ConstraintWidget> arrayList2;
        boolean z4;
        boolean z5;
        int i6;
        ConstraintWidget constraintWidget6 = chainHead.mFirst;
        ConstraintWidget constraintWidget7 = chainHead.mLast;
        ConstraintWidget constraintWidget8 = chainHead.mFirstVisibleWidget;
        ConstraintWidget constraintWidget9 = chainHead.mLastVisibleWidget;
        ConstraintWidget constraintWidget10 = chainHead.mHead;
        float f4 = chainHead.mTotalWeight;
        boolean z6 = constraintWidgetContainer.mListDimensionBehaviors[i] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (i == 0) {
            int i7 = constraintWidget10.mHorizontalChainStyle;
            z = i7 == 0;
            z2 = i7 == 1;
        } else {
            int i8 = constraintWidget10.mVerticalChainStyle;
            z = i8 == 0;
            z2 = i8 == 1;
        }
        ?? r13 = constraintWidget6;
        boolean z7 = false;
        while (true) {
            f = f4;
            if (z7) {
                break;
            }
            ConstraintAnchor constraintAnchor6 = r13.mListAnchors[i2];
            int i9 = z3 ? 1 : 4;
            int margin = constraintAnchor6.getMargin();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = r13.mListDimensionBehaviors[i];
            boolean z8 = z6;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            boolean z9 = dimensionBehaviour == dimensionBehaviour2 && r13.mResolvedMatchConstraintDefault[i] == 0;
            boolean z10 = z3;
            ConstraintAnchor constraintAnchor7 = constraintAnchor6.mTarget;
            if (constraintAnchor7 != null && r13 != constraintWidget6) {
                margin = constraintAnchor7.getMargin() + margin;
            }
            int i10 = margin;
            if (z10 && r13 != constraintWidget6 && r13 != constraintWidget8) {
                i9 = 5;
            }
            boolean z11 = z9;
            ConstraintAnchor constraintAnchor8 = constraintAnchor6.mTarget;
            if (constraintAnchor8 != null) {
                if (r13 == constraintWidget8) {
                    z4 = z7;
                    z5 = z;
                    linearSystem.addGreaterThan(constraintAnchor6.mSolverVariable, constraintAnchor8.mSolverVariable, i10, 6);
                } else {
                    z4 = z7;
                    z5 = z;
                    linearSystem.addGreaterThan(constraintAnchor6.mSolverVariable, constraintAnchor8.mSolverVariable, i10, 8);
                }
                linearSystem.addEquality(constraintAnchor6.mSolverVariable, constraintAnchor6.mTarget.mSolverVariable, i10, (!z11 || z10) ? i9 : 5);
            } else {
                z4 = z7;
                z5 = z;
            }
            if (z8) {
                if (r13.getVisibility() == 8 || r13.mListDimensionBehaviors[i] != dimensionBehaviour2) {
                    i6 = 0;
                } else {
                    ConstraintAnchor[] constraintAnchorArr = r13.mListAnchors;
                    i6 = 0;
                    linearSystem.addGreaterThan(constraintAnchorArr[i2 + 1].mSolverVariable, constraintAnchorArr[i2].mSolverVariable, 0, 5);
                }
                linearSystem.addGreaterThan(r13.mListAnchors[i2].mSolverVariable, constraintWidgetContainer.mListAnchors[i2].mSolverVariable, i6, 8);
            }
            ConstraintAnchor constraintAnchor9 = r13.mListAnchors[i2 + 1].mTarget;
            if (constraintAnchor9 != null) {
                ?? r4 = constraintAnchor9.mOwner;
                ConstraintAnchor constraintAnchor10 = r4.mListAnchors[i2].mTarget;
                if (constraintAnchor10 != null && constraintAnchor10.mOwner == r13) {
                    r21 = r4;
                }
            }
            if (r21 != null) {
                r13 = r21;
                z7 = z4;
            } else {
                z7 = true;
            }
            f4 = f;
            z6 = z8;
            z3 = z10;
            z = z5;
            r13 = r13;
        }
        boolean z12 = z6;
        boolean z13 = z3;
        boolean z14 = z;
        if (constraintWidget9 != null) {
            int i11 = i2 + 1;
            if (constraintWidget7.mListAnchors[i11].mTarget != null) {
                ConstraintAnchor constraintAnchor11 = constraintWidget9.mListAnchors[i11];
                if (constraintWidget9.mListDimensionBehaviors[i] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget9.mResolvedMatchConstraintDefault[i] == 0 && !z13) {
                    ConstraintAnchor constraintAnchor12 = constraintAnchor11.mTarget;
                    if (constraintAnchor12.mOwner == constraintWidgetContainer) {
                        linearSystem.addEquality(constraintAnchor11.mSolverVariable, constraintAnchor12.mSolverVariable, -constraintAnchor11.getMargin(), 5);
                        linearSystem.addLowerThan(constraintAnchor11.mSolverVariable, constraintWidget7.mListAnchors[i11].mTarget.mSolverVariable, -constraintAnchor11.getMargin(), 6);
                        if (z12) {
                            int i12 = i2 + 1;
                            SolverVariable solverVariable6 = constraintWidgetContainer.mListAnchors[i12].mSolverVariable;
                            ConstraintAnchor constraintAnchor13 = constraintWidget7.mListAnchors[i12];
                            linearSystem.addGreaterThan(solverVariable6, constraintAnchor13.mSolverVariable, constraintAnchor13.getMargin(), 8);
                        }
                        arrayList = chainHead.mWeightedMatchConstraintsWidgets;
                        if (arrayList != null && (size = arrayList.size()) > 1) {
                            float f5 = (chainHead.mHasUndefinedWeights || chainHead.mHasComplexMatchWeights) ? f : chainHead.mWidgetsMatchCount;
                            float f6 = 0.0f;
                            float f7 = 0.0f;
                            ConstraintWidget constraintWidget11 = null;
                            i5 = 0;
                            while (i5 < size) {
                                ConstraintWidget constraintWidget12 = arrayList.get(i5);
                                float f8 = constraintWidget12.mWeight[i];
                                if (f8 >= f6) {
                                    f3 = f6;
                                } else if (chainHead.mHasComplexMatchWeights) {
                                    ConstraintAnchor[] constraintAnchorArr2 = constraintWidget12.mListAnchors;
                                    f3 = f6;
                                    linearSystem.addEquality(constraintAnchorArr2[i2 + 1].mSolverVariable, constraintAnchorArr2[i2].mSolverVariable, 0, 4);
                                    arrayList2 = arrayList;
                                    i5++;
                                    f6 = f3;
                                    arrayList = arrayList2;
                                } else {
                                    f3 = f6;
                                    f8 = 1.0f;
                                }
                                float f9 = f8;
                                if (f9 == f3) {
                                    ConstraintAnchor[] constraintAnchorArr3 = constraintWidget12.mListAnchors;
                                    linearSystem.addEquality(constraintAnchorArr3[i2 + 1].mSolverVariable, constraintAnchorArr3[i2].mSolverVariable, 0, 8);
                                    arrayList2 = arrayList;
                                    i5++;
                                    f6 = f3;
                                    arrayList = arrayList2;
                                } else {
                                    if (constraintWidget11 != null) {
                                        ConstraintAnchor[] constraintAnchorArr4 = constraintWidget11.mListAnchors;
                                        SolverVariable solverVariable7 = constraintAnchorArr4[i2].mSolverVariable;
                                        int i13 = i2 + 1;
                                        SolverVariable solverVariable8 = constraintAnchorArr4[i13].mSolverVariable;
                                        ConstraintAnchor[] constraintAnchorArr5 = constraintWidget12.mListAnchors;
                                        arrayList2 = arrayList;
                                        SolverVariable solverVariable9 = constraintAnchorArr5[i2].mSolverVariable;
                                        SolverVariable solverVariable10 = constraintAnchorArr5[i13].mSolverVariable;
                                        ArrayRow createRow = linearSystem.createRow();
                                        createRow.createRowEqualMatchDimensions(f7, f5, f9, solverVariable7, solverVariable8, solverVariable9, solverVariable10);
                                        linearSystem.addConstraint(createRow);
                                    } else {
                                        arrayList2 = arrayList;
                                    }
                                    constraintWidget11 = constraintWidget12;
                                    f7 = f9;
                                    i5++;
                                    f6 = f3;
                                    arrayList = arrayList2;
                                }
                            }
                        }
                        if (constraintWidget8 == null && (constraintWidget8 == constraintWidget9 || z13)) {
                            ConstraintAnchor constraintAnchor14 = constraintWidget6.mListAnchors[i2];
                            int i14 = i2 + 1;
                            ConstraintAnchor constraintAnchor15 = constraintWidget7.mListAnchors[i14];
                            ConstraintAnchor constraintAnchor16 = constraintAnchor14.mTarget;
                            SolverVariable solverVariable11 = constraintAnchor16 != null ? constraintAnchor16.mSolverVariable : null;
                            ConstraintAnchor constraintAnchor17 = constraintAnchor15.mTarget;
                            SolverVariable solverVariable12 = constraintAnchor17 != null ? constraintAnchor17.mSolverVariable : null;
                            ConstraintAnchor constraintAnchor18 = constraintWidget8.mListAnchors[i2];
                            ConstraintAnchor constraintAnchor19 = constraintWidget9.mListAnchors[i14];
                            if (solverVariable11 != null && solverVariable12 != null) {
                                if (i == 0) {
                                    f2 = constraintWidget10.mHorizontalBiasPercent;
                                } else {
                                    f2 = constraintWidget10.mVerticalBiasPercent;
                                }
                                linearSystem.addCentering(constraintAnchor18.mSolverVariable, solverVariable11, constraintAnchor18.getMargin(), f2, solverVariable12, constraintAnchor19.mSolverVariable, constraintAnchor19.getMargin(), 7);
                            }
                        } else if (z14 || constraintWidget8 == null) {
                            int i15 = 8;
                            if (z2 && constraintWidget8 != null) {
                                int i16 = chainHead.mWidgetsMatchCount;
                                boolean z15 = i16 <= 0 && chainHead.mWidgetsCount == i16;
                                ConstraintWidget constraintWidget13 = constraintWidget8;
                                constraintWidget = constraintWidget13;
                                while (constraintWidget != null) {
                                    ConstraintWidget constraintWidget14 = constraintWidget.mNextChainWidget[i];
                                    while (constraintWidget14 != null && constraintWidget14.getVisibility() == i15) {
                                        constraintWidget14 = constraintWidget14.mNextChainWidget[i];
                                    }
                                    if (constraintWidget == constraintWidget8 || constraintWidget == constraintWidget9 || constraintWidget14 == null) {
                                        constraintWidget2 = constraintWidget13;
                                    } else {
                                        if (constraintWidget14 == constraintWidget9) {
                                            constraintWidget14 = null;
                                        }
                                        ConstraintAnchor constraintAnchor20 = constraintWidget.mListAnchors[i2];
                                        SolverVariable solverVariable13 = constraintAnchor20.mSolverVariable;
                                        ConstraintAnchor constraintAnchor21 = constraintAnchor20.mTarget;
                                        if (constraintAnchor21 != null) {
                                            SolverVariable solverVariable14 = constraintAnchor21.mSolverVariable;
                                        }
                                        int i17 = i2 + 1;
                                        SolverVariable solverVariable15 = constraintWidget13.mListAnchors[i17].mSolverVariable;
                                        int margin2 = constraintAnchor20.getMargin();
                                        int margin3 = constraintWidget.mListAnchors[i17].getMargin();
                                        if (constraintWidget14 != null) {
                                            constraintAnchor4 = constraintWidget14.mListAnchors[i2];
                                            solverVariable = constraintAnchor4.mSolverVariable;
                                            ConstraintAnchor constraintAnchor22 = constraintAnchor4.mTarget;
                                            solverVariable2 = constraintAnchor22 != null ? constraintAnchor22.mSolverVariable : null;
                                        } else {
                                            constraintAnchor4 = constraintWidget9.mListAnchors[i2];
                                            solverVariable = constraintAnchor4 != null ? constraintAnchor4.mSolverVariable : null;
                                            solverVariable2 = constraintWidget.mListAnchors[i17].mSolverVariable;
                                        }
                                        if (constraintAnchor4 != null) {
                                            margin3 += constraintAnchor4.getMargin();
                                        }
                                        int i18 = margin3;
                                        int margin4 = constraintWidget13.mListAnchors[i17].getMargin() + margin2;
                                        ConstraintWidget constraintWidget15 = constraintWidget14;
                                        SolverVariable solverVariable16 = solverVariable;
                                        int i19 = z15 ? 8 : 4;
                                        if (solverVariable13 == null || solverVariable15 == null || solverVariable16 == null || solverVariable2 == null) {
                                            constraintWidget2 = constraintWidget13;
                                            constraintWidget3 = constraintWidget15;
                                        } else {
                                            constraintWidget3 = constraintWidget15;
                                            SolverVariable solverVariable17 = solverVariable2;
                                            constraintWidget2 = constraintWidget13;
                                            linearSystem.addCentering(solverVariable13, solverVariable15, margin4, 0.5f, solverVariable16, solverVariable17, i18, i19);
                                        }
                                        constraintWidget14 = constraintWidget3;
                                    }
                                    if (constraintWidget.getVisibility() != 8) {
                                        constraintWidget2 = constraintWidget;
                                    }
                                    constraintWidget = constraintWidget14;
                                    constraintWidget13 = constraintWidget2;
                                    i15 = 8;
                                }
                                linearSystem2 = linearSystem;
                                ConstraintAnchor constraintAnchor23 = constraintWidget8.mListAnchors[i2];
                                constraintAnchor = constraintWidget6.mListAnchors[i2].mTarget;
                                int i20 = i2 + 1;
                                constraintAnchor2 = constraintWidget9.mListAnchors[i20];
                                constraintAnchor3 = constraintWidget7.mListAnchors[i20].mTarget;
                                if (constraintAnchor != null) {
                                    if (constraintWidget8 != constraintWidget9) {
                                        linearSystem2.addEquality(constraintAnchor23.mSolverVariable, constraintAnchor.mSolverVariable, constraintAnchor23.getMargin(), 5);
                                    } else if (constraintAnchor3 != null) {
                                        linearSystem2.addCentering(constraintAnchor23.mSolverVariable, constraintAnchor.mSolverVariable, constraintAnchor23.getMargin(), 0.5f, constraintAnchor2.mSolverVariable, constraintAnchor3.mSolverVariable, constraintAnchor2.getMargin(), 5);
                                    }
                                }
                                if (constraintAnchor3 != null && constraintWidget8 != constraintWidget9) {
                                    linearSystem2.addEquality(constraintAnchor2.mSolverVariable, constraintAnchor3.mSolverVariable, -constraintAnchor2.getMargin(), 5);
                                }
                                if ((z14 && !z2) || constraintWidget8 == null || constraintWidget8 == constraintWidget9) {
                                    return;
                                }
                                ConstraintAnchor[] constraintAnchorArr6 = constraintWidget8.mListAnchors;
                                ConstraintAnchor constraintAnchor24 = constraintAnchorArr6[i2];
                                int i21 = i2 + 1;
                                ConstraintAnchor constraintAnchor25 = constraintWidget9.mListAnchors[i21];
                                ConstraintAnchor constraintAnchor26 = constraintAnchor24.mTarget;
                                solverVariable5 = constraintAnchor26 != null ? constraintAnchor26.mSolverVariable : null;
                                ConstraintAnchor constraintAnchor27 = constraintAnchor25.mTarget;
                                SolverVariable solverVariable18 = constraintAnchor27 != null ? constraintAnchor27.mSolverVariable : null;
                                if (constraintWidget7 != constraintWidget9) {
                                    ConstraintAnchor constraintAnchor28 = constraintWidget7.mListAnchors[i21].mTarget;
                                    solverVariable18 = constraintAnchor28 != null ? constraintAnchor28.mSolverVariable : null;
                                }
                                if (constraintWidget8 == constraintWidget9) {
                                    constraintAnchor25 = constraintAnchorArr6[i21];
                                }
                                if (solverVariable5 == null || solverVariable18 == null) {
                                    return;
                                }
                                linearSystem2.addCentering(constraintAnchor24.mSolverVariable, solverVariable5, constraintAnchor24.getMargin(), 0.5f, solverVariable18, constraintAnchor25.mSolverVariable, constraintWidget9.mListAnchors[i21].getMargin(), 5);
                                return;
                            }
                        } else {
                            int i22 = chainHead.mWidgetsMatchCount;
                            boolean z16 = i22 > 0 && chainHead.mWidgetsCount == i22;
                            ConstraintWidget constraintWidget16 = constraintWidget8;
                            ConstraintWidget constraintWidget17 = constraintWidget16;
                            while (constraintWidget16 != null) {
                                ConstraintWidget constraintWidget18 = constraintWidget16.mNextChainWidget[i];
                                while (true) {
                                    if (constraintWidget18 == null) {
                                        i3 = 8;
                                        break;
                                    }
                                    i3 = 8;
                                    if (constraintWidget18.getVisibility() != 8) {
                                        break;
                                    } else {
                                        constraintWidget18 = constraintWidget18.mNextChainWidget[i];
                                    }
                                }
                                if (constraintWidget18 != null || constraintWidget16 == constraintWidget9) {
                                    ConstraintAnchor constraintAnchor29 = constraintWidget16.mListAnchors[i2];
                                    SolverVariable solverVariable19 = constraintAnchor29.mSolverVariable;
                                    ConstraintAnchor constraintAnchor30 = constraintAnchor29.mTarget;
                                    SolverVariable solverVariable20 = constraintAnchor30 != null ? constraintAnchor30.mSolverVariable : null;
                                    if (constraintWidget17 != constraintWidget16) {
                                        solverVariable20 = constraintWidget17.mListAnchors[i2 + 1].mSolverVariable;
                                    } else if (constraintWidget16 == constraintWidget8 && constraintWidget17 == constraintWidget16) {
                                        ConstraintAnchor constraintAnchor31 = constraintWidget6.mListAnchors[i2].mTarget;
                                        solverVariable20 = constraintAnchor31 != null ? constraintAnchor31.mSolverVariable : null;
                                    }
                                    int margin5 = constraintAnchor29.getMargin();
                                    int i23 = i2 + 1;
                                    int margin6 = constraintWidget16.mListAnchors[i23].getMargin();
                                    if (constraintWidget18 != null) {
                                        constraintAnchor5 = constraintWidget18.mListAnchors[i2];
                                        solverVariable3 = constraintAnchor5.mSolverVariable;
                                        solverVariable4 = constraintWidget16.mListAnchors[i23].mSolverVariable;
                                    } else {
                                        constraintAnchor5 = constraintWidget7.mListAnchors[i23].mTarget;
                                        solverVariable3 = constraintAnchor5 != null ? constraintAnchor5.mSolverVariable : null;
                                        solverVariable4 = constraintWidget16.mListAnchors[i23].mSolverVariable;
                                    }
                                    if (constraintAnchor5 != null) {
                                        margin6 += constraintAnchor5.getMargin();
                                    }
                                    if (constraintWidget17 != null) {
                                        margin5 += constraintWidget17.mListAnchors[i23].getMargin();
                                    }
                                    if (solverVariable19 == null || solverVariable20 == null || solverVariable3 == null || solverVariable4 == null) {
                                        constraintWidget4 = constraintWidget18;
                                        constraintWidget5 = constraintWidget16;
                                        i4 = 8;
                                    } else {
                                        if (constraintWidget16 == constraintWidget8) {
                                            margin5 = constraintWidget8.mListAnchors[i2].getMargin();
                                        }
                                        if (constraintWidget16 == constraintWidget9) {
                                            margin6 = constraintWidget9.mListAnchors[i23].getMargin();
                                        }
                                        constraintWidget4 = constraintWidget18;
                                        constraintWidget5 = constraintWidget16;
                                        i4 = 8;
                                        linearSystem.addCentering(solverVariable19, solverVariable20, margin5, 0.5f, solverVariable3, solverVariable4, margin6, z16 ? 8 : 5);
                                    }
                                } else {
                                    constraintWidget4 = constraintWidget18;
                                    constraintWidget5 = constraintWidget16;
                                    i4 = i3;
                                }
                                if (constraintWidget5.getVisibility() != i4) {
                                    constraintWidget17 = constraintWidget5;
                                }
                                constraintWidget16 = constraintWidget4;
                            }
                        }
                        linearSystem2 = linearSystem;
                        if (z14) {
                        }
                        ConstraintAnchor[] constraintAnchorArr62 = constraintWidget8.mListAnchors;
                        ConstraintAnchor constraintAnchor242 = constraintAnchorArr62[i2];
                        int i212 = i2 + 1;
                        ConstraintAnchor constraintAnchor252 = constraintWidget9.mListAnchors[i212];
                        ConstraintAnchor constraintAnchor262 = constraintAnchor242.mTarget;
                        if (constraintAnchor262 != null) {
                        }
                        ConstraintAnchor constraintAnchor272 = constraintAnchor252.mTarget;
                        if (constraintAnchor272 != null) {
                        }
                        if (constraintWidget7 != constraintWidget9) {
                        }
                        if (constraintWidget8 == constraintWidget9) {
                        }
                        if (solverVariable5 == null) {
                            return;
                        } else {
                            return;
                        }
                    }
                }
                if (z13) {
                    ConstraintAnchor constraintAnchor32 = constraintAnchor11.mTarget;
                    if (constraintAnchor32.mOwner == constraintWidgetContainer) {
                        linearSystem.addEquality(constraintAnchor11.mSolverVariable, constraintAnchor32.mSolverVariable, -constraintAnchor11.getMargin(), 4);
                    }
                }
                linearSystem.addLowerThan(constraintAnchor11.mSolverVariable, constraintWidget7.mListAnchors[i11].mTarget.mSolverVariable, -constraintAnchor11.getMargin(), 6);
                if (z12) {
                }
                arrayList = chainHead.mWeightedMatchConstraintsWidgets;
                if (arrayList != null) {
                    if (chainHead.mHasUndefinedWeights) {
                    }
                    float f62 = 0.0f;
                    float f72 = 0.0f;
                    ConstraintWidget constraintWidget112 = null;
                    i5 = 0;
                    while (i5 < size) {
                    }
                }
                if (constraintWidget8 == null) {
                }
                if (z14) {
                }
                int i152 = 8;
                if (z2) {
                    int i162 = chainHead.mWidgetsMatchCount;
                    if (i162 <= 0) {
                    }
                    ConstraintWidget constraintWidget132 = constraintWidget8;
                    constraintWidget = constraintWidget132;
                    while (constraintWidget != null) {
                    }
                    linearSystem2 = linearSystem;
                    ConstraintAnchor constraintAnchor232 = constraintWidget8.mListAnchors[i2];
                    constraintAnchor = constraintWidget6.mListAnchors[i2].mTarget;
                    int i202 = i2 + 1;
                    constraintAnchor2 = constraintWidget9.mListAnchors[i202];
                    constraintAnchor3 = constraintWidget7.mListAnchors[i202].mTarget;
                    if (constraintAnchor != null) {
                    }
                    if (constraintAnchor3 != null) {
                        linearSystem2.addEquality(constraintAnchor2.mSolverVariable, constraintAnchor3.mSolverVariable, -constraintAnchor2.getMargin(), 5);
                    }
                    if (z14) {
                    }
                    ConstraintAnchor[] constraintAnchorArr622 = constraintWidget8.mListAnchors;
                    ConstraintAnchor constraintAnchor2422 = constraintAnchorArr622[i2];
                    int i2122 = i2 + 1;
                    ConstraintAnchor constraintAnchor2522 = constraintWidget9.mListAnchors[i2122];
                    ConstraintAnchor constraintAnchor2622 = constraintAnchor2422.mTarget;
                    if (constraintAnchor2622 != null) {
                    }
                    ConstraintAnchor constraintAnchor2722 = constraintAnchor2522.mTarget;
                    if (constraintAnchor2722 != null) {
                    }
                    if (constraintWidget7 != constraintWidget9) {
                    }
                    if (constraintWidget8 == constraintWidget9) {
                    }
                    if (solverVariable5 == null) {
                    }
                }
                linearSystem2 = linearSystem;
                if (z14) {
                }
                ConstraintAnchor[] constraintAnchorArr6222 = constraintWidget8.mListAnchors;
                ConstraintAnchor constraintAnchor24222 = constraintAnchorArr6222[i2];
                int i21222 = i2 + 1;
                ConstraintAnchor constraintAnchor25222 = constraintWidget9.mListAnchors[i21222];
                ConstraintAnchor constraintAnchor26222 = constraintAnchor24222.mTarget;
                if (constraintAnchor26222 != null) {
                }
                ConstraintAnchor constraintAnchor27222 = constraintAnchor25222.mTarget;
                if (constraintAnchor27222 != null) {
                }
                if (constraintWidget7 != constraintWidget9) {
                }
                if (constraintWidget8 == constraintWidget9) {
                }
                if (solverVariable5 == null) {
                }
            }
        }
        if (z12) {
        }
        arrayList = chainHead.mWeightedMatchConstraintsWidgets;
        if (arrayList != null) {
        }
        if (constraintWidget8 == null) {
        }
        if (z14) {
        }
        int i1522 = 8;
        if (z2) {
        }
        linearSystem2 = linearSystem;
        if (z14) {
        }
        ConstraintAnchor[] constraintAnchorArr62222 = constraintWidget8.mListAnchors;
        ConstraintAnchor constraintAnchor242222 = constraintAnchorArr62222[i2];
        int i212222 = i2 + 1;
        ConstraintAnchor constraintAnchor252222 = constraintWidget9.mListAnchors[i212222];
        ConstraintAnchor constraintAnchor262222 = constraintAnchor242222.mTarget;
        if (constraintAnchor262222 != null) {
        }
        ConstraintAnchor constraintAnchor272222 = constraintAnchor252222.mTarget;
        if (constraintAnchor272222 != null) {
        }
        if (constraintWidget7 != constraintWidget9) {
        }
        if (constraintWidget8 == constraintWidget9) {
        }
        if (solverVariable5 == null) {
        }
    }
}
