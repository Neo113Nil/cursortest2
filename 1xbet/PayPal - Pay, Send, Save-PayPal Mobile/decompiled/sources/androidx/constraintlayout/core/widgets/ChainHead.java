package androidx.constraintlayout.core.widgets;

/* loaded from: classes7.dex */
public class ChainHead {
    private boolean Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    private boolean getInputFormats;
    private int getInputSizeshNQ4ISI;
    protected androidx.constraintlayout.core.widgets.ConstraintWidget mFirst;
    protected androidx.constraintlayout.core.widgets.ConstraintWidget mFirstMatchConstraintWidget;
    protected androidx.constraintlayout.core.widgets.ConstraintWidget mFirstVisibleWidget;
    protected boolean mHasComplexMatchWeights;
    protected boolean mHasDefinedWeights;
    protected boolean mHasRatio;
    protected boolean mHasUndefinedWeights;
    protected androidx.constraintlayout.core.widgets.ConstraintWidget mHead;
    protected androidx.constraintlayout.core.widgets.ConstraintWidget mLast;
    protected androidx.constraintlayout.core.widgets.ConstraintWidget mLastMatchConstraintWidget;
    protected androidx.constraintlayout.core.widgets.ConstraintWidget mLastVisibleWidget;
    protected float mTotalWeight = 0.0f;
    protected java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> mWeightedMatchConstraintsWidgets;
    protected int mWidgetsCount;
    protected int mWidgetsMatchCount;

    public ChainHead(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, int i, boolean z) {
        this.mFirst = constraintWidget;
        this.getInputSizeshNQ4ISI = i;
        this.getInputFormats = z;
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getFirst() {
        return this.mFirst;
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getFirstVisibleWidget() {
        return this.mFirstVisibleWidget;
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getLast() {
        return this.mLast;
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getLastVisibleWidget() {
        return this.mLastVisibleWidget;
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getHead() {
        return this.mHead;
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getFirstMatchConstraintWidget() {
        return this.mFirstMatchConstraintWidget;
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getLastMatchConstraintWidget() {
        return this.mLastMatchConstraintWidget;
    }

    public float getTotalWeight() {
        return this.mTotalWeight;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0122, code lost:
    
        if (r3.mMatchConstraintMaxHeight == 0) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void define() {
        if (!this.Camera2StreamConfigurationMap) {
            int i = this.getInputSizeshNQ4ISI * 2;
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.mFirst;
            this.getHighSpeedVideoFpsRanges = true;
            boolean z = false;
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = constraintWidget;
            boolean z2 = false;
            while (!z2) {
                this.mWidgetsCount++;
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget3 = null;
                constraintWidget.mNextChainWidget[this.getInputSizeshNQ4ISI] = null;
                constraintWidget.mListNextMatchConstraintsWidget[this.getInputSizeshNQ4ISI] = null;
                if (constraintWidget.getVisibility() != 8) {
                    this.getHighSpeedVideoFpsRangesFor++;
                    if (constraintWidget.getDimensionBehaviour(this.getInputSizeshNQ4ISI) != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        this.getHighSpeedVideoSizes += constraintWidget.getLength(this.getInputSizeshNQ4ISI);
                    }
                    int margin = this.getHighSpeedVideoSizes + constraintWidget.mListAnchors[i].getMargin();
                    this.getHighSpeedVideoSizes = margin;
                    int i2 = i + 1;
                    this.getHighSpeedVideoSizes = margin + constraintWidget.mListAnchors[i2].getMargin();
                    int margin2 = this.getHighResolutionOutputSizeshNQ4ISI + constraintWidget.mListAnchors[i].getMargin();
                    this.getHighResolutionOutputSizeshNQ4ISI = margin2;
                    this.getHighResolutionOutputSizeshNQ4ISI = margin2 + constraintWidget.mListAnchors[i2].getMargin();
                    if (this.mFirstVisibleWidget == null) {
                        this.mFirstVisibleWidget = constraintWidget;
                    }
                    this.mLastVisibleWidget = constraintWidget;
                    if (constraintWidget.mListDimensionBehaviors[this.getInputSizeshNQ4ISI] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        if (constraintWidget.mResolvedMatchConstraintDefault[this.getInputSizeshNQ4ISI] == 0 || constraintWidget.mResolvedMatchConstraintDefault[this.getInputSizeshNQ4ISI] == 3 || constraintWidget.mResolvedMatchConstraintDefault[this.getInputSizeshNQ4ISI] == 2) {
                            this.mWidgetsMatchCount++;
                            float f = constraintWidget.mWeight[this.getInputSizeshNQ4ISI];
                            if (f > 0.0f) {
                                this.mTotalWeight += constraintWidget.mWeight[this.getInputSizeshNQ4ISI];
                            }
                            int i3 = this.getInputSizeshNQ4ISI;
                            if (constraintWidget.getVisibility() != 8 && constraintWidget.mListDimensionBehaviors[i3] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && (constraintWidget.mResolvedMatchConstraintDefault[i3] == 0 || constraintWidget.mResolvedMatchConstraintDefault[i3] == 3)) {
                                if (f < 0.0f) {
                                    this.mHasUndefinedWeights = true;
                                } else {
                                    this.mHasDefinedWeights = true;
                                }
                                if (this.mWeightedMatchConstraintsWidgets == null) {
                                    this.mWeightedMatchConstraintsWidgets = new java.util.ArrayList<>();
                                }
                                this.mWeightedMatchConstraintsWidgets.add(constraintWidget);
                            }
                            if (this.mFirstMatchConstraintWidget == null) {
                                this.mFirstMatchConstraintWidget = constraintWidget;
                            }
                            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget4 = this.mLastMatchConstraintWidget;
                            if (constraintWidget4 != null) {
                                constraintWidget4.mListNextMatchConstraintsWidget[this.getInputSizeshNQ4ISI] = constraintWidget;
                            }
                            this.mLastMatchConstraintWidget = constraintWidget;
                        }
                        if (this.getInputSizeshNQ4ISI == 0) {
                            if (constraintWidget.mMatchConstraintDefaultWidth == 0) {
                                if (constraintWidget.mMatchConstraintMinWidth != 0 || constraintWidget.mMatchConstraintMaxWidth != 0) {
                                    this.getHighSpeedVideoFpsRanges = false;
                                }
                                if (constraintWidget.mDimensionRatio != 0.0f) {
                                    this.getHighSpeedVideoFpsRanges = false;
                                    this.mHasRatio = true;
                                }
                            }
                            this.getHighSpeedVideoFpsRanges = false;
                            if (constraintWidget.mDimensionRatio != 0.0f) {
                            }
                        } else {
                            if (constraintWidget.mMatchConstraintDefaultHeight == 0) {
                                if (constraintWidget.mMatchConstraintMinHeight == 0) {
                                }
                            }
                            this.getHighSpeedVideoFpsRanges = false;
                            if (constraintWidget.mDimensionRatio != 0.0f) {
                            }
                        }
                    }
                }
                if (constraintWidget2 != constraintWidget) {
                    constraintWidget2.mNextChainWidget[this.getInputSizeshNQ4ISI] = constraintWidget;
                }
                androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor = constraintWidget.mListAnchors[i + 1].mTarget;
                if (constraintAnchor != null) {
                    androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget5 = constraintAnchor.mOwner;
                    if (constraintWidget5.mListAnchors[i].mTarget != null && constraintWidget5.mListAnchors[i].mTarget.mOwner == constraintWidget) {
                        constraintWidget3 = constraintWidget5;
                    }
                }
                if (constraintWidget3 == null) {
                    z2 = true;
                    constraintWidget3 = constraintWidget;
                }
                constraintWidget2 = constraintWidget;
                constraintWidget = constraintWidget3;
            }
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget6 = this.mFirstVisibleWidget;
            if (constraintWidget6 != null) {
                this.getHighSpeedVideoSizes -= constraintWidget6.mListAnchors[i].getMargin();
            }
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget7 = this.mLastVisibleWidget;
            if (constraintWidget7 != null) {
                this.getHighSpeedVideoSizes -= constraintWidget7.mListAnchors[i + 1].getMargin();
            }
            this.mLast = constraintWidget;
            if (this.getInputSizeshNQ4ISI == 0 && this.getInputFormats) {
                this.mHead = constraintWidget;
            } else {
                this.mHead = this.mFirst;
            }
            if (this.mHasDefinedWeights && this.mHasUndefinedWeights) {
                z = true;
            }
            this.mHasComplexMatchWeights = z;
        }
        this.Camera2StreamConfigurationMap = true;
    }
}
