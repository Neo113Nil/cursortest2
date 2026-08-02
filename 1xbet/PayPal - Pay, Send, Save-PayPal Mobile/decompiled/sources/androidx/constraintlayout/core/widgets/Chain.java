package androidx.constraintlayout.core.widgets;

/* loaded from: classes7.dex */
public class Chain {
    public static final boolean USE_CHAIN_OPTIMIZATION = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:174:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03e1  */
    /* JADX WARN: Type inference failed for: r2v45, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v5, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void applyChainConstraints(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer, androidx.constraintlayout.core.LinearSystem linearSystem, java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> arrayList, int i) {
        int i2;
        androidx.constraintlayout.core.widgets.ChainHead[] chainHeadArr;
        int i3;
        int i4;
        float f;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        androidx.constraintlayout.core.SolverVariable solverVariable;
        int i6;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget3;
        int i7;
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor;
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor2;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget4;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget5;
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor3;
        androidx.constraintlayout.core.SolverVariable solverVariable2;
        androidx.constraintlayout.core.SolverVariable solverVariable3;
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor4;
        androidx.constraintlayout.core.SolverVariable solverVariable4;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget6;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget7;
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor5;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget8;
        androidx.constraintlayout.core.SolverVariable solverVariable5;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget9;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget10;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget11;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget12;
        float f2;
        int size;
        java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> arrayList2;
        boolean z7;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget13;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget14;
        int i8;
        androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer2 = constraintWidgetContainer;
        java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> arrayList3 = arrayList;
        if (i == 0) {
            i2 = constraintWidgetContainer2.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer2.kernelVersion;
            i3 = 0;
            i4 = 0;
        } else {
            i2 = constraintWidgetContainer2.mVerticalChainsSize;
            chainHeadArr = constraintWidgetContainer2.AMEXKernela;
            i3 = 0;
            i4 = 2;
        }
        while (i3 < i2) {
            androidx.constraintlayout.core.widgets.ChainHead chainHead = chainHeadArr[i3];
            chainHead.define();
            if (arrayList3 == null || arrayList3.contains(chainHead.mFirst)) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget15 = chainHead.mFirst;
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget16 = chainHead.mLast;
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget17 = chainHead.mFirstVisibleWidget;
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget18 = chainHead.mLastVisibleWidget;
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget19 = chainHead.mHead;
                float f3 = chainHead.mTotalWeight;
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget20 = chainHead.mFirstMatchConstraintWidget;
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget21 = chainHead.mLastMatchConstraintWidget;
                boolean z8 = constraintWidgetContainer2.mListDimensionBehaviors[i] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (i == 0) {
                    f = f3;
                    z = constraintWidget19.getOutputSizes == 0;
                    boolean z9 = constraintWidget19.getOutputSizes == 1;
                    int i9 = i3;
                    if (constraintWidget19.getOutputSizes == 2) {
                        z3 = z9;
                        i5 = i9;
                        z4 = z3;
                        z5 = z;
                        z6 = true;
                    } else {
                        z2 = z9;
                        i5 = i9;
                        z4 = z2;
                        z5 = z;
                        z6 = false;
                    }
                } else {
                    f = f3;
                    boolean z10 = constraintWidget19.f2724a == 0;
                    boolean z11 = constraintWidget19.f2724a == 1;
                    i5 = i3;
                    if (constraintWidget19.f2724a == 2) {
                        z = z10;
                        z3 = z11;
                        z4 = z3;
                        z5 = z;
                        z6 = true;
                    } else {
                        z = z10;
                        z2 = z11;
                        z4 = z2;
                        z5 = z;
                        z6 = false;
                    }
                }
                ?? r9 = constraintWidget15;
                boolean z12 = false;
                while (true) {
                    solverVariable = null;
                    if (z12) {
                        break;
                    }
                    androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor6 = r9.mListAnchors[i4];
                    int i10 = z6 ? 1 : 4;
                    int margin = constraintAnchor6.getMargin();
                    boolean z13 = z12;
                    int i11 = i2;
                    boolean z14 = r9.mListDimensionBehaviors[i] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && r9.mResolvedMatchConstraintDefault[i] == 0;
                    if (constraintAnchor6.mTarget != null && r9 != constraintWidget15) {
                        margin += constraintAnchor6.mTarget.getMargin();
                    }
                    int i12 = margin;
                    if (!z6 || r9 == constraintWidget15 || r9 == constraintWidget17) {
                        z7 = z4;
                    } else {
                        z7 = z4;
                        i10 = 8;
                    }
                    if (constraintAnchor6.mTarget != null) {
                        if (r9 == constraintWidget17) {
                            constraintWidget13 = constraintWidget19;
                            constraintWidget14 = constraintWidget15;
                            linearSystem.addGreaterThan(constraintAnchor6.getHighSpeedVideoFpsRangesFor, constraintAnchor6.mTarget.getHighSpeedVideoFpsRangesFor, i12, 6);
                        } else {
                            constraintWidget13 = constraintWidget19;
                            constraintWidget14 = constraintWidget15;
                            linearSystem.addGreaterThan(constraintAnchor6.getHighSpeedVideoFpsRangesFor, constraintAnchor6.mTarget.getHighSpeedVideoFpsRangesFor, i12, 8);
                        }
                        if (z14 && !z6) {
                            i10 = 5;
                        }
                        linearSystem.addEquality(constraintAnchor6.getHighSpeedVideoFpsRangesFor, constraintAnchor6.mTarget.getHighSpeedVideoFpsRangesFor, i12, (r9 == constraintWidget17 && z6 && r9.isInBarrier(i)) ? 5 : i10);
                    } else {
                        constraintWidget13 = constraintWidget19;
                        constraintWidget14 = constraintWidget15;
                    }
                    if (z8) {
                        if (r9.getVisibility() == 8 || r9.mListDimensionBehaviors[i] != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                            i8 = 0;
                        } else {
                            i8 = 0;
                            linearSystem.addGreaterThan(r9.mListAnchors[i4 + 1].getHighSpeedVideoFpsRangesFor, r9.mListAnchors[i4].getHighSpeedVideoFpsRangesFor, 0, 5);
                        }
                        linearSystem.addGreaterThan(r9.mListAnchors[i4].getHighSpeedVideoFpsRangesFor, constraintWidgetContainer2.mListAnchors[i4].getHighSpeedVideoFpsRangesFor, i8, 8);
                    }
                    androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor7 = r9.mListAnchors[i4 + 1].mTarget;
                    if (constraintAnchor7 != null) {
                        ?? r2 = constraintAnchor7.mOwner;
                        if (r2.mListAnchors[i4].mTarget != null && r2.mListAnchors[i4].mTarget.mOwner == r9) {
                            solverVariable = r2;
                        }
                    }
                    if (solverVariable == null) {
                        z12 = true;
                    } else {
                        r9 = solverVariable;
                        z12 = z13;
                    }
                    z4 = z7;
                    i2 = i11;
                    constraintWidget19 = constraintWidget13;
                    constraintWidget15 = constraintWidget14;
                    r9 = r9;
                }
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget22 = constraintWidget19;
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget23 = constraintWidget15;
                boolean z15 = z4;
                i6 = i2;
                if (constraintWidget18 != null) {
                    int i13 = i4 + 1;
                    if (constraintWidget16.mListAnchors[i13].mTarget != null) {
                        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor8 = constraintWidget18.mListAnchors[i13];
                        if (constraintWidget18.mListDimensionBehaviors[i] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget18.mResolvedMatchConstraintDefault[i] == 0 && !z6 && constraintAnchor8.mTarget.mOwner == constraintWidgetContainer2) {
                            linearSystem.addEquality(constraintAnchor8.getHighSpeedVideoFpsRangesFor, constraintAnchor8.mTarget.getHighSpeedVideoFpsRangesFor, -constraintAnchor8.getMargin(), 5);
                        } else if (z6 && constraintAnchor8.mTarget.mOwner == constraintWidgetContainer2) {
                            linearSystem.addEquality(constraintAnchor8.getHighSpeedVideoFpsRangesFor, constraintAnchor8.mTarget.getHighSpeedVideoFpsRangesFor, -constraintAnchor8.getMargin(), 4);
                        }
                        linearSystem.addLowerThan(constraintAnchor8.getHighSpeedVideoFpsRangesFor, constraintWidget16.mListAnchors[i13].mTarget.getHighSpeedVideoFpsRangesFor, -constraintAnchor8.getMargin(), 6);
                    }
                }
                if (z8) {
                    int i14 = i4 + 1;
                    linearSystem.addGreaterThan(constraintWidgetContainer2.mListAnchors[i14].getHighSpeedVideoFpsRangesFor, constraintWidget16.mListAnchors[i14].getHighSpeedVideoFpsRangesFor, constraintWidget16.mListAnchors[i14].getMargin(), 8);
                }
                java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> arrayList4 = chainHead.mWeightedMatchConstraintsWidgets;
                if (arrayList4 != null && (size = arrayList4.size()) > 1) {
                    if (chainHead.mHasUndefinedWeights && !chainHead.mHasComplexMatchWeights) {
                        f = chainHead.mWidgetsMatchCount;
                    }
                    float f4 = 0.0f;
                    float f5 = 0.0f;
                    androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget24 = null;
                    int i15 = 0;
                    while (i15 < size) {
                        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget25 = arrayList4.get(i15);
                        float f6 = constraintWidget25.mWeight[i];
                        if (f6 < f4) {
                            if (chainHead.mHasComplexMatchWeights) {
                                linearSystem.addEquality(constraintWidget25.mListAnchors[i4 + 1].getHighSpeedVideoFpsRangesFor, constraintWidget25.mListAnchors[i4].getHighSpeedVideoFpsRangesFor, 0, 4);
                                arrayList2 = arrayList4;
                                i15++;
                                arrayList4 = arrayList2;
                                f4 = 0.0f;
                            } else {
                                f6 = 1.0f;
                            }
                        }
                        if (f6 == 0.0f) {
                            linearSystem.addEquality(constraintWidget25.mListAnchors[i4 + 1].getHighSpeedVideoFpsRangesFor, constraintWidget25.mListAnchors[i4].getHighSpeedVideoFpsRangesFor, 0, 8);
                            arrayList2 = arrayList4;
                            i15++;
                            arrayList4 = arrayList2;
                            f4 = 0.0f;
                        } else {
                            if (constraintWidget24 != null) {
                                androidx.constraintlayout.core.SolverVariable solverVariable6 = constraintWidget24.mListAnchors[i4].getHighSpeedVideoFpsRangesFor;
                                int i16 = i4 + 1;
                                androidx.constraintlayout.core.SolverVariable solverVariable7 = constraintWidget24.mListAnchors[i16].getHighSpeedVideoFpsRangesFor;
                                androidx.constraintlayout.core.SolverVariable solverVariable8 = constraintWidget25.mListAnchors[i4].getHighSpeedVideoFpsRangesFor;
                                androidx.constraintlayout.core.SolverVariable solverVariable9 = constraintWidget25.mListAnchors[i16].getHighSpeedVideoFpsRangesFor;
                                arrayList2 = arrayList4;
                                androidx.constraintlayout.core.ArrayRow createRow = linearSystem.createRow();
                                createRow.createRowEqualMatchDimensions(f5, f, f6, solverVariable6, solverVariable7, solverVariable8, solverVariable9);
                                linearSystem.addConstraint(createRow);
                            } else {
                                arrayList2 = arrayList4;
                            }
                            constraintWidget24 = constraintWidget25;
                            f5 = f6;
                            i15++;
                            arrayList4 = arrayList2;
                            f4 = 0.0f;
                        }
                    }
                }
                if (constraintWidget17 == null || !(constraintWidget17 == constraintWidget18 || z6)) {
                    constraintWidget = constraintWidget18;
                    constraintWidget2 = constraintWidget17;
                    constraintWidget3 = constraintWidget16;
                    i7 = i5;
                    androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget26 = constraintWidget23;
                    if (z5 && constraintWidget2 != null) {
                        boolean z16 = chainHead.mWidgetsMatchCount > 0 && chainHead.mWidgetsCount == chainHead.mWidgetsMatchCount;
                        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget27 = constraintWidget2;
                        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget28 = constraintWidget27;
                        while (constraintWidget28 != null) {
                            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget29 = constraintWidget28.mNextChainWidget[i];
                            while (constraintWidget29 != null && constraintWidget29.getVisibility() == 8) {
                                constraintWidget29 = constraintWidget29.mNextChainWidget[i];
                            }
                            if (constraintWidget29 != null || constraintWidget28 == constraintWidget) {
                                androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor9 = constraintWidget28.mListAnchors[i4];
                                androidx.constraintlayout.core.SolverVariable solverVariable10 = constraintAnchor9.getHighSpeedVideoFpsRangesFor;
                                androidx.constraintlayout.core.SolverVariable solverVariable11 = constraintAnchor9.mTarget != null ? constraintAnchor9.mTarget.getHighSpeedVideoFpsRangesFor : null;
                                if (constraintWidget27 != constraintWidget28) {
                                    solverVariable11 = constraintWidget27.mListAnchors[i4 + 1].getHighSpeedVideoFpsRangesFor;
                                } else if (constraintWidget28 == constraintWidget2) {
                                    solverVariable11 = constraintWidget26.mListAnchors[i4].mTarget != null ? constraintWidget26.mListAnchors[i4].mTarget.getHighSpeedVideoFpsRangesFor : null;
                                }
                                int margin2 = constraintAnchor9.getMargin();
                                int i17 = i4 + 1;
                                int margin3 = constraintWidget28.mListAnchors[i17].getMargin();
                                if (constraintWidget29 != null) {
                                    constraintAnchor5 = constraintWidget29.mListAnchors[i4];
                                    constraintWidget7 = constraintWidget26;
                                    solverVariable5 = constraintAnchor5.getHighSpeedVideoFpsRangesFor;
                                } else {
                                    constraintWidget7 = constraintWidget26;
                                    constraintAnchor5 = constraintWidget3.mListAnchors[i17].mTarget;
                                    if (constraintAnchor5 != null) {
                                        solverVariable5 = constraintAnchor5.getHighSpeedVideoFpsRangesFor;
                                    } else {
                                        constraintWidget8 = constraintWidget29;
                                        solverVariable5 = null;
                                        androidx.constraintlayout.core.SolverVariable solverVariable12 = constraintWidget28.mListAnchors[i17].getHighSpeedVideoFpsRangesFor;
                                        if (constraintAnchor5 != null) {
                                            margin3 += constraintAnchor5.getMargin();
                                        }
                                        int margin4 = margin2 + constraintWidget27.mListAnchors[i17].getMargin();
                                        if (solverVariable10 != null || solverVariable11 == null || solverVariable5 == null || solverVariable12 == null) {
                                            constraintWidget9 = constraintWidget28;
                                            constraintWidget10 = constraintWidget8;
                                            constraintWidget11 = constraintWidget7;
                                            constraintWidget12 = constraintWidget27;
                                        } else {
                                            if (constraintWidget28 == constraintWidget2) {
                                                margin4 = constraintWidget2.mListAnchors[i4].getMargin();
                                            }
                                            int i18 = margin4;
                                            androidx.constraintlayout.core.SolverVariable solverVariable13 = solverVariable5;
                                            constraintWidget10 = constraintWidget8;
                                            constraintWidget12 = constraintWidget27;
                                            constraintWidget11 = constraintWidget7;
                                            constraintWidget9 = constraintWidget28;
                                            linearSystem.addCentering(solverVariable10, solverVariable11, i18, 0.5f, solverVariable13, solverVariable12, constraintWidget28 == constraintWidget ? constraintWidget.mListAnchors[i17].getMargin() : margin3, z16 ? 8 : 5);
                                        }
                                    }
                                }
                                constraintWidget8 = constraintWidget29;
                                androidx.constraintlayout.core.SolverVariable solverVariable122 = constraintWidget28.mListAnchors[i17].getHighSpeedVideoFpsRangesFor;
                                if (constraintAnchor5 != null) {
                                }
                                int margin42 = margin2 + constraintWidget27.mListAnchors[i17].getMargin();
                                if (solverVariable10 != null) {
                                }
                                constraintWidget9 = constraintWidget28;
                                constraintWidget10 = constraintWidget8;
                                constraintWidget11 = constraintWidget7;
                                constraintWidget12 = constraintWidget27;
                            } else {
                                constraintWidget11 = constraintWidget26;
                                constraintWidget10 = constraintWidget29;
                                constraintWidget12 = constraintWidget27;
                                constraintWidget9 = constraintWidget28;
                            }
                            constraintWidget27 = constraintWidget9.getVisibility() != 8 ? constraintWidget9 : constraintWidget12;
                            constraintWidget28 = constraintWidget10;
                            constraintWidget26 = constraintWidget11;
                        }
                    } else if (z15 && constraintWidget2 != null) {
                        boolean z17 = chainHead.mWidgetsMatchCount > 0 && chainHead.mWidgetsCount == chainHead.mWidgetsMatchCount;
                        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget30 = constraintWidget2;
                        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget31 = constraintWidget30;
                        while (constraintWidget30 != null) {
                            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget32 = constraintWidget30.mNextChainWidget[i];
                            while (constraintWidget32 != null && constraintWidget32.getVisibility() == 8) {
                                constraintWidget32 = constraintWidget32.mNextChainWidget[i];
                            }
                            if (constraintWidget30 == constraintWidget2 || constraintWidget30 == constraintWidget || constraintWidget32 == null) {
                                constraintWidget4 = constraintWidget31;
                                constraintWidget5 = constraintWidget32;
                            } else {
                                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget33 = constraintWidget32 == constraintWidget ? null : constraintWidget32;
                                androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor10 = constraintWidget30.mListAnchors[i4];
                                androidx.constraintlayout.core.SolverVariable solverVariable14 = constraintAnchor10.getHighSpeedVideoFpsRangesFor;
                                if (constraintAnchor10.mTarget != null) {
                                    androidx.constraintlayout.core.SolverVariable solverVariable15 = constraintAnchor10.mTarget.getHighSpeedVideoFpsRangesFor;
                                }
                                int i19 = i4 + 1;
                                androidx.constraintlayout.core.SolverVariable solverVariable16 = constraintWidget31.mListAnchors[i19].getHighSpeedVideoFpsRangesFor;
                                int margin5 = constraintAnchor10.getMargin();
                                int margin6 = constraintWidget30.mListAnchors[i19].getMargin();
                                if (constraintWidget33 != null) {
                                    constraintAnchor4 = constraintWidget33.mListAnchors[i4];
                                    solverVariable4 = constraintAnchor4.getHighSpeedVideoFpsRangesFor;
                                    solverVariable3 = constraintAnchor4.mTarget != null ? constraintAnchor4.mTarget.getHighSpeedVideoFpsRangesFor : null;
                                } else {
                                    androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor11 = constraintWidget.mListAnchors[i4];
                                    if (constraintAnchor11 != null) {
                                        solverVariable2 = constraintAnchor11.getHighSpeedVideoFpsRangesFor;
                                        constraintAnchor3 = constraintAnchor11;
                                    } else {
                                        constraintAnchor3 = constraintAnchor11;
                                        solverVariable2 = null;
                                    }
                                    androidx.constraintlayout.core.SolverVariable solverVariable17 = solverVariable2;
                                    solverVariable3 = constraintWidget30.mListAnchors[i19].getHighSpeedVideoFpsRangesFor;
                                    constraintAnchor4 = constraintAnchor3;
                                    solverVariable4 = solverVariable17;
                                }
                                if (constraintAnchor4 != null) {
                                    margin6 += constraintAnchor4.getMargin();
                                }
                                int i20 = margin6;
                                int margin7 = constraintWidget31.mListAnchors[i19].getMargin();
                                int i21 = z17 ? 8 : 4;
                                if (solverVariable14 == null || solverVariable16 == null || solverVariable4 == null || solverVariable3 == null) {
                                    constraintWidget6 = constraintWidget33;
                                    constraintWidget4 = constraintWidget31;
                                } else {
                                    androidx.constraintlayout.core.SolverVariable solverVariable18 = solverVariable4;
                                    constraintWidget6 = constraintWidget33;
                                    constraintWidget4 = constraintWidget31;
                                    linearSystem.addCentering(solverVariable14, solverVariable16, margin7 + margin5, 0.5f, solverVariable18, solverVariable3, i20, i21);
                                }
                                constraintWidget5 = constraintWidget6;
                            }
                            constraintWidget31 = constraintWidget30.getVisibility() == 8 ? constraintWidget4 : constraintWidget30;
                            constraintWidget30 = constraintWidget5;
                        }
                        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor12 = constraintWidget2.mListAnchors[i4];
                        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor13 = constraintWidget26.mListAnchors[i4].mTarget;
                        int i22 = i4 + 1;
                        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor14 = constraintWidget.mListAnchors[i22];
                        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor15 = constraintWidget3.mListAnchors[i22].mTarget;
                        if (constraintAnchor13 != null) {
                            if (constraintWidget2 != constraintWidget) {
                                linearSystem.addEquality(constraintAnchor12.getHighSpeedVideoFpsRangesFor, constraintAnchor13.getHighSpeedVideoFpsRangesFor, constraintAnchor12.getMargin(), 5);
                                constraintAnchor2 = constraintAnchor15;
                                constraintAnchor = constraintAnchor14;
                            } else if (constraintAnchor15 != null) {
                                constraintAnchor = constraintAnchor14;
                                linearSystem.addCentering(constraintAnchor12.getHighSpeedVideoFpsRangesFor, constraintAnchor13.getHighSpeedVideoFpsRangesFor, constraintAnchor12.getMargin(), 0.5f, constraintAnchor14.getHighSpeedVideoFpsRangesFor, constraintAnchor15.getHighSpeedVideoFpsRangesFor, constraintAnchor14.getMargin(), 5);
                                constraintAnchor2 = constraintAnchor15;
                            }
                            if (constraintAnchor2 != null && constraintWidget2 != constraintWidget) {
                                linearSystem.addEquality(constraintAnchor.getHighSpeedVideoFpsRangesFor, constraintAnchor2.getHighSpeedVideoFpsRangesFor, -constraintAnchor.getMargin(), 5);
                            }
                        }
                        constraintAnchor = constraintAnchor14;
                        constraintAnchor2 = constraintAnchor15;
                        if (constraintAnchor2 != null) {
                            linearSystem.addEquality(constraintAnchor.getHighSpeedVideoFpsRangesFor, constraintAnchor2.getHighSpeedVideoFpsRangesFor, -constraintAnchor.getMargin(), 5);
                        }
                    }
                } else {
                    androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor16 = constraintWidget23.mListAnchors[i4];
                    int i23 = i4 + 1;
                    androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor17 = constraintWidget16.mListAnchors[i23];
                    androidx.constraintlayout.core.SolverVariable solverVariable19 = constraintAnchor16.mTarget != null ? constraintAnchor16.mTarget.getHighSpeedVideoFpsRangesFor : null;
                    androidx.constraintlayout.core.SolverVariable solverVariable20 = constraintAnchor17.mTarget != null ? constraintAnchor17.mTarget.getHighSpeedVideoFpsRangesFor : null;
                    androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor18 = constraintWidget17.mListAnchors[i4];
                    if (constraintWidget18 != null) {
                        constraintAnchor17 = constraintWidget18.mListAnchors[i23];
                    }
                    if (solverVariable19 == null || solverVariable20 == null) {
                        constraintWidget = constraintWidget18;
                        constraintWidget2 = constraintWidget17;
                        i7 = i5;
                        constraintWidget3 = constraintWidget16;
                    } else {
                        if (i == 0) {
                            f2 = constraintWidget22.getOutputStallDuration;
                        } else {
                            f2 = constraintWidget22.b;
                        }
                        constraintWidget = constraintWidget18;
                        constraintWidget2 = constraintWidget17;
                        i7 = i5;
                        linearSystem.addCentering(constraintAnchor18.getHighSpeedVideoFpsRangesFor, solverVariable19, constraintAnchor18.getMargin(), f2, solverVariable20, constraintAnchor17.getHighSpeedVideoFpsRangesFor, constraintAnchor17.getMargin(), 7);
                        constraintWidget3 = constraintWidget16;
                    }
                }
                if ((z5 || z15) && constraintWidget2 != null && constraintWidget2 != constraintWidget) {
                    androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor19 = constraintWidget2.mListAnchors[i4];
                    androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget34 = constraintWidget == null ? constraintWidget2 : constraintWidget;
                    int i24 = i4 + 1;
                    androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor20 = constraintWidget34.mListAnchors[i24];
                    androidx.constraintlayout.core.SolverVariable solverVariable21 = constraintAnchor19.mTarget != null ? constraintAnchor19.mTarget.getHighSpeedVideoFpsRangesFor : null;
                    androidx.constraintlayout.core.SolverVariable solverVariable22 = constraintAnchor20.mTarget != null ? constraintAnchor20.mTarget.getHighSpeedVideoFpsRangesFor : null;
                    if (constraintWidget3 != constraintWidget34) {
                        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor21 = constraintWidget3.mListAnchors[i24];
                        if (constraintAnchor21.mTarget != null) {
                            solverVariable22 = constraintAnchor21.mTarget.getHighSpeedVideoFpsRangesFor;
                        }
                        if (constraintWidget2 == constraintWidget34) {
                            constraintAnchor19 = constraintWidget2.mListAnchors[i4];
                            constraintAnchor20 = constraintWidget2.mListAnchors[i24];
                        }
                        if (solverVariable21 != null && solverVariable != null) {
                            linearSystem.addCentering(constraintAnchor19.getHighSpeedVideoFpsRangesFor, solverVariable21, constraintAnchor19.getMargin(), 0.5f, solverVariable, constraintAnchor20.getHighSpeedVideoFpsRangesFor, constraintWidget34.mListAnchors[i24].getMargin(), 5);
                        }
                    }
                    solverVariable = solverVariable22;
                    if (constraintWidget2 == constraintWidget34) {
                    }
                    if (solverVariable21 != null) {
                        linearSystem.addCentering(constraintAnchor19.getHighSpeedVideoFpsRangesFor, solverVariable21, constraintAnchor19.getMargin(), 0.5f, solverVariable, constraintAnchor20.getHighSpeedVideoFpsRangesFor, constraintWidget34.mListAnchors[i24].getMargin(), 5);
                    }
                }
            } else {
                i7 = i3;
                i6 = i2;
            }
            i3 = i7 + 1;
            constraintWidgetContainer2 = constraintWidgetContainer;
            arrayList3 = arrayList;
            i2 = i6;
        }
    }
}
