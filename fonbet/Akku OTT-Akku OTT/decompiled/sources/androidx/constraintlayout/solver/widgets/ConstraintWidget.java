package androidx.constraintlayout.solver.widgets;

import androidx.compose.runtime.C0211b;
import androidx.concurrent.futures.a;
import androidx.constraintlayout.solver.Cache;
import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.Metrics;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.analyzer.ChainRun;
import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun;
import androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ConstraintWidget {
    public static final int ANCHOR_BASELINE = 4;
    public static final int ANCHOR_BOTTOM = 3;
    public static final int ANCHOR_LEFT = 0;
    public static final int ANCHOR_RIGHT = 1;
    public static final int ANCHOR_TOP = 2;
    private static final boolean AUTOTAG_CENTER = false;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static float DEFAULT_BIAS = 0.5f;
    static final int DIMENSION_HORIZONTAL = 0;
    static final int DIMENSION_VERTICAL = 1;
    protected static final int DIRECT = 2;
    public static final int GONE = 8;
    public static final int HORIZONTAL = 0;
    public static final int INVISIBLE = 4;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_RATIO = 3;
    public static final int MATCH_CONSTRAINT_RATIO_RESOLVED = 4;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    protected static final int SOLVER = 1;
    public static final int UNKNOWN = -1;
    private static final boolean USE_WRAP_DIMENSION_FOR_SPREAD = false;
    public static final int VERTICAL = 1;
    public static final int VISIBLE = 0;
    private static final int WRAP = -2;
    private boolean hasBaseline;
    public ChainRun horizontalChainRun;
    public HorizontalWidgetRun horizontalRun;
    private boolean inPlaceholder;
    public boolean[] isTerminalWidget;
    protected ArrayList<ConstraintAnchor> mAnchors;
    ConstraintAnchor mBaseline;
    int mBaselineDistance;
    public ConstraintAnchor mBottom;
    boolean mBottomHasCentered;
    ConstraintAnchor mCenter;
    ConstraintAnchor mCenterX;
    ConstraintAnchor mCenterY;
    private float mCircleConstraintAngle;
    private Object mCompanionWidget;
    private int mContainerItemSkip;
    private String mDebugName;
    public float mDimensionRatio;
    protected int mDimensionRatioSide;
    int mDistToBottom;
    int mDistToLeft;
    int mDistToRight;
    int mDistToTop;
    boolean mGroupsToSolver;
    int mHeight;
    float mHorizontalBiasPercent;
    boolean mHorizontalChainFixedPosition;
    int mHorizontalChainStyle;
    ConstraintWidget mHorizontalNextWidget;
    public int mHorizontalResolution;
    boolean mHorizontalWrapVisited;
    private boolean mInVirtuaLayout;
    public boolean mIsHeightWrapContent;
    private boolean[] mIsInBarrier;
    public boolean mIsWidthWrapContent;
    public ConstraintAnchor mLeft;
    boolean mLeftHasCentered;
    public ConstraintAnchor[] mListAnchors;
    public DimensionBehaviour[] mListDimensionBehaviors;
    protected ConstraintWidget[] mListNextMatchConstraintsWidget;
    public int mMatchConstraintDefaultHeight;
    public int mMatchConstraintDefaultWidth;
    public int mMatchConstraintMaxHeight;
    public int mMatchConstraintMaxWidth;
    public int mMatchConstraintMinHeight;
    public int mMatchConstraintMinWidth;
    public float mMatchConstraintPercentHeight;
    public float mMatchConstraintPercentWidth;
    private int[] mMaxDimension;
    protected int mMinHeight;
    protected int mMinWidth;
    protected ConstraintWidget[] mNextChainWidget;
    protected int mOffsetX;
    protected int mOffsetY;
    boolean mOptimizerMeasurable;
    public ConstraintWidget mParent;
    int mRelX;
    int mRelY;
    float mResolvedDimensionRatio;
    int mResolvedDimensionRatioSide;
    boolean mResolvedHasRatio;
    public int[] mResolvedMatchConstraintDefault;
    public ConstraintAnchor mRight;
    boolean mRightHasCentered;
    public ConstraintAnchor mTop;
    boolean mTopHasCentered;
    private String mType;
    float mVerticalBiasPercent;
    boolean mVerticalChainFixedPosition;
    int mVerticalChainStyle;
    ConstraintWidget mVerticalNextWidget;
    public int mVerticalResolution;
    boolean mVerticalWrapVisited;
    private int mVisibility;
    public float[] mWeight;
    int mWidth;
    protected int mX;
    protected int mY;
    public boolean measured;
    public WidgetRun[] run;
    public ChainRun verticalChainRun;
    public VerticalWidgetRun verticalRun;
    public int[] wrapMeasure;

    /* renamed from: androidx.constraintlayout.solver.widgets.ConstraintWidget$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type;
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour;

        static {
            int[] iArr = new int[DimensionBehaviour.values().length];
            $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour = iArr;
            try {
                iArr[DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour[DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour[DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour[DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ConstraintAnchor.Type.values().length];
            $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type = iArr2;
            try {
                iArr2[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public ConstraintWidget() {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.horizontalRun = new HorizontalWidgetRun(this);
        this.verticalRun = new VerticalWidgetRun(this);
        this.isTerminalWidget = new boolean[]{true, true};
        this.wrapMeasure = new int[]{0, 0, 0, 0};
        this.mResolvedHasRatio = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = 0.0f;
        this.hasBaseline = false;
        this.mInVirtuaLayout = false;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mOptimizerMeasurable = false;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        addAnchors();
    }

    private void addAnchors() {
        this.mAnchors.add(this.mLeft);
        this.mAnchors.add(this.mTop);
        this.mAnchors.add(this.mRight);
        this.mAnchors.add(this.mBottom);
        this.mAnchors.add(this.mCenterX);
        this.mAnchors.add(this.mCenterY);
        this.mAnchors.add(this.mCenter);
        this.mAnchors.add(this.mBaseline);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void applyConstraints(LinearSystem linearSystem, boolean z, boolean z2, boolean z3, boolean z4, SolverVariable solverVariable, SolverVariable solverVariable2, DimensionBehaviour dimensionBehaviour, boolean z5, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i, int i2, int i3, int i4, float f, boolean z6, boolean z7, boolean z8, boolean z9, int i5, int i6, int i7, int i8, float f2, boolean z10) {
        int i9;
        boolean z11;
        int i10;
        SolverVariable solverVariable3;
        int i11;
        int i12;
        SolverVariable solverVariable4;
        int i13;
        SolverVariable solverVariable5;
        int i14;
        boolean z12;
        boolean z13;
        int i15;
        SolverVariable createObjectVariable;
        SolverVariable createObjectVariable2;
        SolverVariable solverVariable6;
        int i16;
        int i17;
        boolean z14;
        ConstraintAnchor constraintAnchor3;
        int i18;
        boolean z15;
        boolean z16;
        int i19;
        int i20;
        boolean z17;
        boolean z18;
        boolean z19;
        ConstraintWidget constraintWidget;
        SolverVariable solverVariable7;
        SolverVariable solverVariable8;
        int i21;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        int i22;
        int i23;
        boolean z20;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z21;
        LinearSystem linearSystem2 = linearSystem;
        SolverVariable createObjectVariable3 = linearSystem2.createObjectVariable(constraintAnchor);
        SolverVariable createObjectVariable4 = linearSystem2.createObjectVariable(constraintAnchor2);
        SolverVariable createObjectVariable5 = linearSystem2.createObjectVariable(constraintAnchor.getTarget());
        SolverVariable createObjectVariable6 = linearSystem2.createObjectVariable(constraintAnchor2.getTarget());
        if (LinearSystem.getMetrics() != null) {
            LinearSystem.getMetrics().nonresolvedWidgets++;
        }
        boolean isConnected = constraintAnchor.isConnected();
        boolean isConnected2 = constraintAnchor2.isConnected();
        boolean isConnected3 = this.mCenter.isConnected();
        int i28 = isConnected2 ? (isConnected ? 1 : 0) + 1 : isConnected ? 1 : 0;
        if (isConnected3) {
            i28++;
        }
        int i29 = z6 ? 3 : i5;
        int i30 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour[dimensionBehaviour.ordinal()];
        if (i30 == 1 || i30 == 2 || i30 == 3 || i30 != 4) {
            i9 = i29;
        } else {
            i9 = i29;
            if (i9 != 4) {
                z11 = true;
                if (this.mVisibility != 8) {
                    i10 = 0;
                    z11 = false;
                } else {
                    i10 = i2;
                }
                if (z10) {
                    solverVariable3 = createObjectVariable6;
                    i11 = 8;
                } else {
                    if (!isConnected && !isConnected2 && !isConnected3) {
                        linearSystem2.addEquality(createObjectVariable3, i);
                    } else if (isConnected && !isConnected2) {
                        solverVariable3 = createObjectVariable6;
                        i11 = 8;
                        linearSystem2.addEquality(createObjectVariable3, createObjectVariable5, constraintAnchor.getMargin(), 8);
                    }
                    solverVariable3 = createObjectVariable6;
                    i11 = 8;
                }
                if (z11) {
                    if (z5) {
                        linearSystem2.addEquality(createObjectVariable4, createObjectVariable3, 0, 3);
                        if (i3 > 0) {
                            linearSystem2.addGreaterThan(createObjectVariable4, createObjectVariable3, i3, 8);
                        }
                        if (i4 < Integer.MAX_VALUE) {
                            linearSystem2.addLowerThan(createObjectVariable4, createObjectVariable3, i4, 8);
                        }
                    } else {
                        linearSystem2.addEquality(createObjectVariable4, createObjectVariable3, i10, i11);
                    }
                    i15 = i8;
                    solverVariable4 = createObjectVariable4;
                    i13 = i28;
                    z12 = z11;
                    solverVariable5 = solverVariable3;
                    z13 = z4;
                } else {
                    if (i28 == 2 || z6 || !(i9 == 1 || i9 == 0)) {
                        int i31 = i7 == -2 ? i10 : i7;
                        int i32 = i8 == -2 ? i10 : i8;
                        if (i10 > 0 && i9 != 1) {
                            i10 = 0;
                        }
                        if (i31 > 0) {
                            linearSystem2.addGreaterThan(createObjectVariable4, createObjectVariable3, i31, 8);
                            i10 = Math.max(i10, i31);
                        }
                        if (i32 > 0) {
                            if (!z2 || i9 != 1) {
                                linearSystem2.addLowerThan(createObjectVariable4, createObjectVariable3, i32, 8);
                            }
                            i10 = Math.min(i10, i32);
                        }
                        if (i9 == 1) {
                            if (z2) {
                                linearSystem2.addEquality(createObjectVariable4, createObjectVariable3, i10, 8);
                            } else if (z7) {
                                linearSystem2.addEquality(createObjectVariable4, createObjectVariable3, i10, 5);
                                linearSystem2.addLowerThan(createObjectVariable4, createObjectVariable3, i10, 8);
                            } else {
                                linearSystem2.addEquality(createObjectVariable4, createObjectVariable3, i10, 5);
                                linearSystem2.addLowerThan(createObjectVariable4, createObjectVariable3, i10, 8);
                            }
                            solverVariable4 = createObjectVariable4;
                            z12 = z11;
                            solverVariable5 = solverVariable3;
                            z13 = z4;
                            i14 = i31;
                            i15 = i32;
                            i13 = i28;
                        } else {
                            if (i9 == 2) {
                                ConstraintAnchor.Type type = constraintAnchor.getType();
                                ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
                                if (type == type2 || constraintAnchor.getType() == ConstraintAnchor.Type.BOTTOM) {
                                    createObjectVariable = linearSystem2.createObjectVariable(this.mParent.getAnchor(type2));
                                    createObjectVariable2 = linearSystem2.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.BOTTOM));
                                } else {
                                    createObjectVariable = linearSystem2.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.LEFT));
                                    createObjectVariable2 = linearSystem2.createObjectVariable(this.mParent.getAnchor(ConstraintAnchor.Type.RIGHT));
                                }
                                SolverVariable solverVariable9 = createObjectVariable2;
                                solverVariable4 = createObjectVariable4;
                                i12 = i32;
                                i13 = i28;
                                solverVariable5 = solverVariable3;
                                linearSystem2.addConstraint(linearSystem2.createRow().createRowDimensionRatio(solverVariable4, createObjectVariable3, solverVariable9, createObjectVariable, f2));
                                z13 = z4;
                                i14 = i31;
                                z12 = false;
                            } else {
                                i12 = i32;
                                solverVariable4 = createObjectVariable4;
                                i13 = i28;
                                solverVariable5 = solverVariable3;
                                i14 = i31;
                                z12 = z11;
                                z13 = true;
                            }
                            i15 = i12;
                        }
                        if (!z10) {
                            solverVariable6 = solverVariable2;
                            i16 = 8;
                            i17 = 2;
                        } else {
                            if (!z7) {
                                if ((isConnected || isConnected2 || isConnected3) && (!isConnected || isConnected2)) {
                                    if (!isConnected && isConnected2) {
                                        linearSystem2.addEquality(solverVariable4, solverVariable5, -constraintAnchor2.getMargin(), 8);
                                        if (z2) {
                                            linearSystem2.addGreaterThan(createObjectVariable3, solverVariable, 0, 5);
                                        }
                                    } else if (isConnected && isConnected2) {
                                        ConstraintWidget constraintWidget4 = constraintAnchor.mTarget.mOwner;
                                        ConstraintWidget constraintWidget5 = constraintAnchor2.mTarget.mOwner;
                                        ConstraintWidget parent = getParent();
                                        int i33 = 6;
                                        if (z12) {
                                            if (i9 == 0) {
                                                if (i15 == 0 && i14 == 0) {
                                                    i27 = 8;
                                                    i19 = 8;
                                                    z21 = false;
                                                    z17 = true;
                                                } else {
                                                    i27 = 5;
                                                    i19 = 5;
                                                    z21 = true;
                                                    z17 = false;
                                                }
                                                if ((constraintWidget4 instanceof Barrier) || (constraintWidget5 instanceof Barrier)) {
                                                    i18 = 6;
                                                    z16 = z21;
                                                    i19 = 4;
                                                } else {
                                                    i18 = 6;
                                                    z16 = z21;
                                                }
                                                i20 = i27;
                                                z15 = false;
                                            } else if (i9 == 1) {
                                                i18 = 6;
                                                z15 = true;
                                                z16 = true;
                                                i19 = 4;
                                                i20 = 8;
                                                z17 = false;
                                            } else if (i9 == 3) {
                                                if (this.mResolvedDimensionRatioSide == -1) {
                                                    i18 = z8 ? z2 ? 5 : 4 : 8;
                                                    z15 = true;
                                                    z16 = true;
                                                    i19 = 5;
                                                    i20 = 8;
                                                } else if (z6) {
                                                    if (i6 == 2 || i6 == 1) {
                                                        i25 = 5;
                                                        i26 = 4;
                                                    } else {
                                                        i25 = 8;
                                                        i26 = 5;
                                                    }
                                                    i20 = i25;
                                                    i19 = i26;
                                                    i18 = 6;
                                                    z15 = true;
                                                    z16 = true;
                                                } else {
                                                    if (i15 > 0) {
                                                        i18 = 6;
                                                        z15 = true;
                                                        z16 = true;
                                                        i19 = 5;
                                                    } else if (i15 != 0 || i14 != 0) {
                                                        i18 = 6;
                                                        z15 = true;
                                                        z16 = true;
                                                        i19 = 4;
                                                    } else if (z8) {
                                                        i20 = (constraintWidget4 == parent || constraintWidget5 == parent) ? 5 : 4;
                                                        i18 = 6;
                                                        z15 = true;
                                                        z16 = true;
                                                        i19 = 4;
                                                    } else {
                                                        i18 = 6;
                                                        z15 = true;
                                                        z16 = true;
                                                        i19 = 8;
                                                    }
                                                    i20 = 5;
                                                }
                                                z17 = true;
                                            } else {
                                                i18 = 6;
                                                z15 = false;
                                                z16 = false;
                                            }
                                            if (z15 || createObjectVariable5 != solverVariable5 || constraintWidget4 == parent) {
                                                z18 = z15;
                                                z19 = true;
                                            } else {
                                                z18 = false;
                                                z19 = false;
                                            }
                                            if (z16) {
                                                linearSystem2 = linearSystem;
                                                constraintWidget = parent;
                                                solverVariable7 = solverVariable5;
                                                solverVariable8 = createObjectVariable5;
                                                i21 = 8;
                                                constraintWidget2 = constraintWidget4;
                                                constraintWidget3 = constraintWidget5;
                                            } else {
                                                if (this.mVisibility == 8) {
                                                    i18 = 4;
                                                }
                                                constraintWidget = parent;
                                                SolverVariable solverVariable10 = solverVariable5;
                                                i21 = 8;
                                                int i34 = i18;
                                                constraintWidget3 = constraintWidget5;
                                                solverVariable8 = createObjectVariable5;
                                                linearSystem2 = linearSystem;
                                                constraintWidget2 = constraintWidget4;
                                                SolverVariable solverVariable11 = solverVariable4;
                                                linearSystem2.addCentering(createObjectVariable3, solverVariable8, constraintAnchor.getMargin(), f, solverVariable10, solverVariable11, constraintAnchor2.getMargin(), i34);
                                                createObjectVariable3 = createObjectVariable3;
                                                solverVariable7 = solverVariable10;
                                                solverVariable4 = solverVariable11;
                                            }
                                            if (this.mVisibility != i21) {
                                                return;
                                            }
                                            if (z18) {
                                                int i35 = (!z2 || solverVariable8 == solverVariable7 || z12 || !((constraintWidget2 instanceof Barrier) || (constraintWidget3 instanceof Barrier))) ? i20 : 6;
                                                linearSystem2.addGreaterThan(createObjectVariable3, solverVariable8, constraintAnchor.getMargin(), i35);
                                                linearSystem2.addLowerThan(solverVariable4, solverVariable7, -constraintAnchor2.getMargin(), i35);
                                                i20 = i35;
                                            }
                                            if (!z2 || !z9 || (constraintWidget2 instanceof Barrier) || (constraintWidget3 instanceof Barrier)) {
                                                i22 = i19;
                                                i23 = i20;
                                                z20 = z19;
                                            } else {
                                                i22 = 6;
                                                i23 = 6;
                                                z20 = true;
                                            }
                                            if (z20) {
                                                if (z17 && (!z8 || z3)) {
                                                    if (constraintWidget2 != constraintWidget && constraintWidget3 != constraintWidget) {
                                                        i33 = i22;
                                                    }
                                                    if ((constraintWidget2 instanceof Guideline) || (constraintWidget3 instanceof Guideline)) {
                                                        i33 = 5;
                                                    }
                                                    if ((constraintWidget2 instanceof Barrier) || (constraintWidget3 instanceof Barrier)) {
                                                        i33 = 5;
                                                    }
                                                    i22 = Math.max(z8 ? 5 : i33, i22);
                                                }
                                                if (z2) {
                                                    i22 = Math.min(i23, i22);
                                                    if (z6 && !z8 && (constraintWidget2 == constraintWidget || constraintWidget3 == constraintWidget)) {
                                                        i24 = 4;
                                                        linearSystem2.addEquality(createObjectVariable3, solverVariable8, constraintAnchor.getMargin(), i24);
                                                        linearSystem2.addEquality(solverVariable4, solverVariable7, -constraintAnchor2.getMargin(), i24);
                                                    }
                                                }
                                                i24 = i22;
                                                linearSystem2.addEquality(createObjectVariable3, solverVariable8, constraintAnchor.getMargin(), i24);
                                                linearSystem2.addEquality(solverVariable4, solverVariable7, -constraintAnchor2.getMargin(), i24);
                                            }
                                            if (z2) {
                                                int margin = solverVariable == solverVariable8 ? constraintAnchor.getMargin() : 0;
                                                if (solverVariable8 != solverVariable) {
                                                    linearSystem2.addGreaterThan(createObjectVariable3, solverVariable, margin, 5);
                                                }
                                            }
                                            if (z2 && z12 && i3 == 0 && i14 == 0) {
                                                if (z12 && i9 == 3) {
                                                    linearSystem2.addGreaterThan(solverVariable4, createObjectVariable3, 0, i21);
                                                } else {
                                                    linearSystem2.addGreaterThan(solverVariable4, createObjectVariable3, 0, 5);
                                                }
                                            }
                                            if (z2 || !z13) {
                                                return;
                                            }
                                            int margin2 = constraintAnchor2.mTarget != null ? constraintAnchor2.getMargin() : 0;
                                            if (solverVariable7 != solverVariable2) {
                                                linearSystem2.addGreaterThan(solverVariable2, solverVariable4, margin2, 5);
                                                return;
                                            }
                                            return;
                                        }
                                        i18 = 6;
                                        z15 = true;
                                        z16 = true;
                                        i19 = 4;
                                        i20 = 5;
                                        z17 = false;
                                        if (z15) {
                                        }
                                        z18 = z15;
                                        z19 = true;
                                        if (z16) {
                                        }
                                        if (this.mVisibility != i21) {
                                        }
                                    }
                                }
                                solverVariable7 = solverVariable5;
                                if (z2) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                            solverVariable6 = solverVariable2;
                            i17 = 2;
                            i16 = 8;
                        }
                        if (i13 < i17 && z2 && z13) {
                            linearSystem2.addGreaterThan(createObjectVariable3, solverVariable, 0, i16);
                            boolean z22 = z || this.mBaseline.mTarget == null;
                            if (z || (constraintAnchor3 = this.mBaseline.mTarget) == null) {
                                z14 = z22;
                            } else {
                                ConstraintWidget constraintWidget6 = constraintAnchor3.mOwner;
                                if (constraintWidget6.mDimensionRatio != 0.0f) {
                                    DimensionBehaviour[] dimensionBehaviourArr = constraintWidget6.mListDimensionBehaviors;
                                    DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
                                    DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
                                    if (dimensionBehaviour2 == dimensionBehaviour3 && dimensionBehaviourArr[1] == dimensionBehaviour3) {
                                        z14 = true;
                                    }
                                }
                                z14 = false;
                            }
                            if (z14) {
                                linearSystem2.addGreaterThan(solverVariable6, solverVariable4, 0, i16);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    int max = Math.max(i7, i10);
                    if (i8 > 0) {
                        max = Math.min(i8, max);
                    }
                    linearSystem2.addEquality(createObjectVariable4, createObjectVariable3, max, 8);
                    z13 = z4;
                    i15 = i8;
                    solverVariable4 = createObjectVariable4;
                    i13 = i28;
                    solverVariable5 = solverVariable3;
                    z12 = false;
                }
                i14 = i7;
                if (!z10) {
                }
                if (i13 < i17) {
                    return;
                } else {
                    return;
                }
            }
        }
        z11 = false;
        if (this.mVisibility != 8) {
        }
        if (z10) {
        }
        if (z11) {
        }
        i14 = i7;
        if (!z10) {
        }
        if (i13 < i17) {
        }
    }

    private boolean isChainHead(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        int i2 = i * 2;
        ConstraintAnchor[] constraintAnchorArr = this.mListAnchors;
        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i2];
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        return (constraintAnchor4 == null || constraintAnchor4.mTarget == constraintAnchor3 || (constraintAnchor2 = (constraintAnchor = constraintAnchorArr[i2 + 1]).mTarget) == null || constraintAnchor2.mTarget != constraintAnchor) ? false : true;
    }

    public boolean addFirst() {
        return (this instanceof VirtualLayout) || (this instanceof Guideline);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0257 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void addToSolver(LinearSystem linearSystem) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        int i2;
        int i3;
        boolean z5;
        boolean z6;
        SolverVariable solverVariable3;
        boolean z7;
        SolverVariable solverVariable4;
        DimensionBehaviour dimensionBehaviour;
        SolverVariable solverVariable5;
        SolverVariable solverVariable6;
        int i4;
        boolean z8;
        boolean z9;
        DependencyNode dependencyNode;
        SolverVariable solverVariable7;
        SolverVariable solverVariable8;
        SolverVariable solverVariable9;
        int i5;
        ?? r9;
        int i6;
        int i7;
        SolverVariable solverVariable10;
        SolverVariable solverVariable11;
        LinearSystem linearSystem2;
        int i8;
        boolean z10;
        boolean z11;
        int i9;
        int i10;
        boolean isInHorizontalChain;
        boolean isInVerticalChain;
        LinearSystem linearSystem3 = linearSystem;
        SolverVariable createObjectVariable = linearSystem3.createObjectVariable(this.mLeft);
        SolverVariable createObjectVariable2 = linearSystem3.createObjectVariable(this.mRight);
        SolverVariable createObjectVariable3 = linearSystem3.createObjectVariable(this.mTop);
        SolverVariable createObjectVariable4 = linearSystem3.createObjectVariable(this.mBottom);
        SolverVariable createObjectVariable5 = linearSystem3.createObjectVariable(this.mBaseline);
        Metrics metrics = LinearSystem.sMetrics;
        if (metrics != null) {
            metrics.widgets++;
        }
        HorizontalWidgetRun horizontalWidgetRun = this.horizontalRun;
        DependencyNode dependencyNode2 = horizontalWidgetRun.start;
        if (dependencyNode2.resolved && horizontalWidgetRun.end.resolved) {
            VerticalWidgetRun verticalWidgetRun = this.verticalRun;
            if (verticalWidgetRun.start.resolved && verticalWidgetRun.end.resolved) {
                if (metrics != null) {
                    metrics.graphSolved++;
                }
                linearSystem3.addEquality(createObjectVariable, dependencyNode2.value);
                linearSystem3.addEquality(createObjectVariable2, this.horizontalRun.end.value);
                linearSystem3.addEquality(createObjectVariable3, this.verticalRun.start.value);
                linearSystem3.addEquality(createObjectVariable4, this.verticalRun.end.value);
                linearSystem3.addEquality(createObjectVariable5, this.verticalRun.baseline.value);
                ConstraintWidget constraintWidget = this.mParent;
                if (constraintWidget != null) {
                    boolean z12 = constraintWidget != null && constraintWidget.mListDimensionBehaviors[0] == DimensionBehaviour.WRAP_CONTENT;
                    boolean z13 = constraintWidget != null && constraintWidget.mListDimensionBehaviors[1] == DimensionBehaviour.WRAP_CONTENT;
                    if (z12 && this.isTerminalWidget[0] && !isInHorizontalChain()) {
                        linearSystem3.addGreaterThan(linearSystem3.createObjectVariable(this.mParent.mRight), createObjectVariable2, 0, 8);
                    }
                    if (z13 && this.isTerminalWidget[1] && !isInVerticalChain()) {
                        linearSystem3.addGreaterThan(linearSystem3.createObjectVariable(this.mParent.mBottom), createObjectVariable4, 0, 8);
                        return;
                    }
                }
                return;
            }
        }
        if (metrics != null) {
            metrics.linearSolved++;
        }
        ConstraintWidget constraintWidget2 = this.mParent;
        if (constraintWidget2 != null) {
            z2 = constraintWidget2 != null && constraintWidget2.mListDimensionBehaviors[0] == DimensionBehaviour.WRAP_CONTENT;
            z = constraintWidget2 != null && constraintWidget2.mListDimensionBehaviors[1] == DimensionBehaviour.WRAP_CONTENT;
            if (isChainHead(0)) {
                ((ConstraintWidgetContainer) this.mParent).addChain(this, 0);
                isInHorizontalChain = true;
            } else {
                isInHorizontalChain = isInHorizontalChain();
            }
            if (isChainHead(1)) {
                ((ConstraintWidgetContainer) this.mParent).addChain(this, 1);
                isInVerticalChain = true;
            } else {
                isInVerticalChain = isInVerticalChain();
            }
            if (!isInHorizontalChain && z2 && this.mVisibility != 8 && this.mLeft.mTarget == null && this.mRight.mTarget == null) {
                linearSystem3.addGreaterThan(linearSystem3.createObjectVariable(this.mParent.mRight), createObjectVariable2, 0, 1);
            }
            if (!isInVerticalChain && z && this.mVisibility != 8 && this.mTop.mTarget == null && this.mBottom.mTarget == null && this.mBaseline == null) {
                linearSystem3.addGreaterThan(linearSystem3.createObjectVariable(this.mParent.mBottom), createObjectVariable4, 0, 1);
            }
            z3 = isInHorizontalChain;
            z4 = isInVerticalChain;
        } else {
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
        }
        int i11 = this.mWidth;
        int i12 = this.mMinWidth;
        if (i11 >= i12) {
            i12 = i11;
        }
        int i13 = this.mHeight;
        int i14 = this.mMinHeight;
        if (i13 >= i14) {
            i14 = i13;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z14 = dimensionBehaviour2 != dimensionBehaviour3;
        DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[1];
        boolean z15 = dimensionBehaviour4 != dimensionBehaviour3;
        int i15 = this.mDimensionRatioSide;
        this.mResolvedDimensionRatioSide = i15;
        int i16 = i12;
        float f = this.mDimensionRatio;
        this.mResolvedDimensionRatio = f;
        int i17 = this.mMatchConstraintDefaultWidth;
        int i18 = this.mMatchConstraintDefaultHeight;
        if (f > 0.0f) {
            i = i14;
            if (this.mVisibility != 8) {
                int i19 = (dimensionBehaviour2 == dimensionBehaviour3 && i17 == 0) ? 3 : i17;
                int i20 = (dimensionBehaviour4 == dimensionBehaviour3 && i18 == 0) ? 3 : i18;
                if (dimensionBehaviour2 == dimensionBehaviour3 && dimensionBehaviour4 == dimensionBehaviour3 && i19 == 3) {
                    solverVariable = createObjectVariable2;
                    i10 = i20;
                    if (i10 == 3) {
                        setupDimensionRatio(z2, z, z14, z15);
                        i2 = i19;
                        solverVariable2 = createObjectVariable4;
                        i3 = i10;
                        z5 = true;
                        int[] iArr = this.mResolvedMatchConstraintDefault;
                        iArr[0] = i2;
                        iArr[1] = i3;
                        this.mResolvedHasRatio = z5;
                        if (!z5 && ((i9 = this.mResolvedDimensionRatioSide) == 0 || i9 == -1)) {
                            z6 = true;
                            DimensionBehaviour dimensionBehaviour5 = this.mListDimensionBehaviors[0];
                            DimensionBehaviour dimensionBehaviour6 = DimensionBehaviour.WRAP_CONTENT;
                            boolean z16 = dimensionBehaviour5 != dimensionBehaviour6 && (this instanceof ConstraintWidgetContainer);
                            int i21 = z16 ? 0 : i16;
                            boolean z17 = !this.mCenter.isConnected();
                            boolean[] zArr = this.mIsInBarrier;
                            boolean z18 = zArr[0];
                            boolean z19 = zArr[1];
                            if (this.mHorizontalResolution != 2) {
                                HorizontalWidgetRun horizontalWidgetRun2 = this.horizontalRun;
                                DependencyNode dependencyNode3 = horizontalWidgetRun2.start;
                                if (dependencyNode3.resolved && horizontalWidgetRun2.end.resolved) {
                                    linearSystem3.addEquality(createObjectVariable, dependencyNode3.value);
                                    SolverVariable solverVariable12 = solverVariable;
                                    linearSystem3.addEquality(solverVariable12, this.horizontalRun.end.value);
                                    if (this.mParent != null && z2 && this.isTerminalWidget[0] && !isInHorizontalChain()) {
                                        linearSystem3.addGreaterThan(linearSystem3.createObjectVariable(this.mParent.mRight), solverVariable12, 0, 8);
                                    }
                                    solverVariable3 = createObjectVariable;
                                    z7 = z5;
                                    solverVariable4 = solverVariable2;
                                    solverVariable = solverVariable12;
                                } else {
                                    SolverVariable solverVariable13 = solverVariable;
                                    ConstraintWidget constraintWidget3 = this.mParent;
                                    SolverVariable createObjectVariable6 = constraintWidget3 != null ? linearSystem3.createObjectVariable(constraintWidget3.mRight) : null;
                                    ConstraintWidget constraintWidget4 = this.mParent;
                                    i4 = i2;
                                    SolverVariable solverVariable14 = solverVariable2;
                                    z8 = z;
                                    solverVariable3 = createObjectVariable;
                                    z7 = z5;
                                    z9 = z2;
                                    solverVariable5 = createObjectVariable5;
                                    solverVariable6 = createObjectVariable3;
                                    dimensionBehaviour = dimensionBehaviour6;
                                    solverVariable4 = solverVariable14;
                                    solverVariable = solverVariable13;
                                    linearSystem3 = linearSystem;
                                    applyConstraints(linearSystem3, true, z9, z8, this.isTerminalWidget[0], constraintWidget4 != null ? linearSystem3.createObjectVariable(constraintWidget4.mLeft) : null, createObjectVariable6, this.mListDimensionBehaviors[0], z16, this.mLeft, this.mRight, this.mX, i21, this.mMinWidth, this.mMaxDimension[0], this.mHorizontalBiasPercent, z6, z3, z4, z18, i4, i3, this.mMatchConstraintMinWidth, this.mMatchConstraintMaxWidth, this.mMatchConstraintPercentWidth, z17);
                                    VerticalWidgetRun verticalWidgetRun2 = this.verticalRun;
                                    dependencyNode = verticalWidgetRun2.start;
                                    if (dependencyNode.resolved || !verticalWidgetRun2.end.resolved) {
                                        solverVariable7 = solverVariable6;
                                        solverVariable8 = solverVariable4;
                                        solverVariable9 = solverVariable5;
                                        i5 = 0;
                                        r9 = 1;
                                        i6 = 8;
                                        i7 = 1;
                                    } else {
                                        int i22 = dependencyNode.value;
                                        solverVariable7 = solverVariable6;
                                        linearSystem3.addEquality(solverVariable7, i22);
                                        solverVariable8 = solverVariable4;
                                        linearSystem3.addEquality(solverVariable8, this.verticalRun.end.value);
                                        solverVariable9 = solverVariable5;
                                        linearSystem3.addEquality(solverVariable9, this.verticalRun.baseline.value);
                                        ConstraintWidget constraintWidget5 = this.mParent;
                                        if (constraintWidget5 == null || z4 || !z8) {
                                            i5 = 0;
                                            z10 = true;
                                        } else {
                                            z10 = true;
                                            z11 = true;
                                            if (this.isTerminalWidget[1]) {
                                                i5 = 0;
                                                i6 = 8;
                                                linearSystem3.addGreaterThan(linearSystem3.createObjectVariable(constraintWidget5.mBottom), solverVariable8, 0, 8);
                                                i7 = i5;
                                                r9 = z11;
                                            } else {
                                                i5 = 0;
                                            }
                                        }
                                        i6 = 8;
                                        z11 = z10;
                                        i7 = i5;
                                        r9 = z11;
                                    }
                                    if ((this.mVerticalResolution != 2 ? i5 : i7) == 0) {
                                        boolean z20 = (this.mListDimensionBehaviors[r9] == dimensionBehaviour && (this instanceof ConstraintWidgetContainer)) ? r9 : i5;
                                        int i23 = z20 ? i5 : i;
                                        boolean z21 = (z7 && ((i8 = this.mResolvedDimensionRatioSide) == r9 || i8 == -1)) ? r9 : i5;
                                        ConstraintWidget constraintWidget6 = this.mParent;
                                        SolverVariable createObjectVariable7 = constraintWidget6 != null ? linearSystem3.createObjectVariable(constraintWidget6.mBottom) : null;
                                        ConstraintWidget constraintWidget7 = this.mParent;
                                        SolverVariable createObjectVariable8 = constraintWidget7 != null ? linearSystem3.createObjectVariable(constraintWidget7.mTop) : null;
                                        if (this.mBaselineDistance > 0 || this.mVisibility == i6) {
                                            linearSystem3.addEquality(solverVariable9, solverVariable7, getBaselineDistance(), i6);
                                            ConstraintAnchor constraintAnchor = this.mBaseline.mTarget;
                                            if (constraintAnchor != null) {
                                                linearSystem3.addEquality(solverVariable9, linearSystem3.createObjectVariable(constraintAnchor), i5, i6);
                                                if (z8) {
                                                    linearSystem3.addGreaterThan(createObjectVariable7, linearSystem3.createObjectVariable(this.mBottom), i5, 5);
                                                }
                                                z17 = i5;
                                            } else if (this.mVisibility == i6) {
                                                linearSystem3.addEquality(solverVariable9, solverVariable7, i5, i6);
                                            }
                                        }
                                        solverVariable10 = solverVariable7;
                                        solverVariable11 = solverVariable8;
                                        applyConstraints(linearSystem, false, z8, z9, this.isTerminalWidget[r9], createObjectVariable8, createObjectVariable7, this.mListDimensionBehaviors[r9], z20, this.mTop, this.mBottom, this.mY, i23, this.mMinHeight, this.mMaxDimension[r9], this.mVerticalBiasPercent, z21, z4, z3, z19, i3, i4, this.mMatchConstraintMinHeight, this.mMatchConstraintMaxHeight, this.mMatchConstraintPercentHeight, z17);
                                    } else {
                                        solverVariable10 = solverVariable7;
                                        solverVariable11 = solverVariable8;
                                    }
                                    if (z7) {
                                        if (this.mResolvedDimensionRatioSide != 1) {
                                            linearSystem.addRatio(solverVariable, solverVariable3, solverVariable11, solverVariable10, this.mResolvedDimensionRatio, 8);
                                            linearSystem2 = linearSystem;
                                            if (this.mCenter.isConnected()) {
                                                linearSystem2.addCenterPoint(this, this.mCenter.getTarget().getOwner(), (float) Math.toRadians(this.mCircleConstraintAngle + 90.0f), this.mCenter.getMargin());
                                                return;
                                            }
                                            return;
                                        }
                                        linearSystem.addRatio(solverVariable11, solverVariable10, solverVariable, solverVariable3, this.mResolvedDimensionRatio, 8);
                                    }
                                    linearSystem2 = linearSystem;
                                    if (this.mCenter.isConnected()) {
                                    }
                                }
                            } else {
                                solverVariable3 = createObjectVariable;
                                z7 = z5;
                                solverVariable4 = solverVariable2;
                            }
                            z8 = z;
                            z9 = z2;
                            dimensionBehaviour = dimensionBehaviour6;
                            solverVariable6 = createObjectVariable3;
                            solverVariable5 = createObjectVariable5;
                            i4 = i2;
                            VerticalWidgetRun verticalWidgetRun22 = this.verticalRun;
                            dependencyNode = verticalWidgetRun22.start;
                            if (dependencyNode.resolved) {
                            }
                            solverVariable7 = solverVariable6;
                            solverVariable8 = solverVariable4;
                            solverVariable9 = solverVariable5;
                            i5 = 0;
                            r9 = 1;
                            i6 = 8;
                            i7 = 1;
                            if ((this.mVerticalResolution != 2 ? i5 : i7) == 0) {
                            }
                            if (z7) {
                            }
                            linearSystem2 = linearSystem;
                            if (this.mCenter.isConnected()) {
                            }
                        }
                        z6 = false;
                        DimensionBehaviour dimensionBehaviour52 = this.mListDimensionBehaviors[0];
                        DimensionBehaviour dimensionBehaviour62 = DimensionBehaviour.WRAP_CONTENT;
                        if (dimensionBehaviour52 != dimensionBehaviour62) {
                        }
                        if (z16) {
                        }
                        boolean z172 = !this.mCenter.isConnected();
                        boolean[] zArr2 = this.mIsInBarrier;
                        boolean z182 = zArr2[0];
                        boolean z192 = zArr2[1];
                        if (this.mHorizontalResolution != 2) {
                        }
                        z8 = z;
                        z9 = z2;
                        dimensionBehaviour = dimensionBehaviour62;
                        solverVariable6 = createObjectVariable3;
                        solverVariable5 = createObjectVariable5;
                        i4 = i2;
                        VerticalWidgetRun verticalWidgetRun222 = this.verticalRun;
                        dependencyNode = verticalWidgetRun222.start;
                        if (dependencyNode.resolved) {
                        }
                        solverVariable7 = solverVariable6;
                        solverVariable8 = solverVariable4;
                        solverVariable9 = solverVariable5;
                        i5 = 0;
                        r9 = 1;
                        i6 = 8;
                        i7 = 1;
                        if ((this.mVerticalResolution != 2 ? i5 : i7) == 0) {
                        }
                        if (z7) {
                        }
                        linearSystem2 = linearSystem;
                        if (this.mCenter.isConnected()) {
                        }
                    }
                } else {
                    solverVariable = createObjectVariable2;
                    i10 = i20;
                }
                if (dimensionBehaviour2 == dimensionBehaviour3 && i19 == 3) {
                    this.mResolvedDimensionRatioSide = 0;
                    i16 = (int) (f * i13);
                    if (dimensionBehaviour4 != dimensionBehaviour3) {
                        i2 = 4;
                        solverVariable2 = createObjectVariable4;
                        i3 = i10;
                    } else {
                        i2 = i19;
                        solverVariable2 = createObjectVariable4;
                        i3 = i10;
                        z5 = true;
                        int[] iArr2 = this.mResolvedMatchConstraintDefault;
                        iArr2[0] = i2;
                        iArr2[1] = i3;
                        this.mResolvedHasRatio = z5;
                        if (!z5) {
                        }
                        z6 = false;
                        DimensionBehaviour dimensionBehaviour522 = this.mListDimensionBehaviors[0];
                        DimensionBehaviour dimensionBehaviour622 = DimensionBehaviour.WRAP_CONTENT;
                        if (dimensionBehaviour522 != dimensionBehaviour622) {
                        }
                        if (z16) {
                        }
                        boolean z1722 = !this.mCenter.isConnected();
                        boolean[] zArr22 = this.mIsInBarrier;
                        boolean z1822 = zArr22[0];
                        boolean z1922 = zArr22[1];
                        if (this.mHorizontalResolution != 2) {
                        }
                        z8 = z;
                        z9 = z2;
                        dimensionBehaviour = dimensionBehaviour622;
                        solverVariable6 = createObjectVariable3;
                        solverVariable5 = createObjectVariable5;
                        i4 = i2;
                        VerticalWidgetRun verticalWidgetRun2222 = this.verticalRun;
                        dependencyNode = verticalWidgetRun2222.start;
                        if (dependencyNode.resolved) {
                        }
                        solverVariable7 = solverVariable6;
                        solverVariable8 = solverVariable4;
                        solverVariable9 = solverVariable5;
                        i5 = 0;
                        r9 = 1;
                        i6 = 8;
                        i7 = 1;
                        if ((this.mVerticalResolution != 2 ? i5 : i7) == 0) {
                        }
                        if (z7) {
                        }
                        linearSystem2 = linearSystem;
                        if (this.mCenter.isConnected()) {
                        }
                    }
                } else {
                    if (dimensionBehaviour4 == dimensionBehaviour3 && i10 == 3) {
                        this.mResolvedDimensionRatioSide = 1;
                        if (i15 == -1) {
                            this.mResolvedDimensionRatio = 1.0f / f;
                        }
                        int i24 = (int) (this.mResolvedDimensionRatio * i11);
                        if (dimensionBehaviour2 != dimensionBehaviour3) {
                            i3 = 4;
                            solverVariable2 = createObjectVariable4;
                            i = i24;
                            i2 = i19;
                        } else {
                            i = i24;
                        }
                    }
                    i2 = i19;
                    solverVariable2 = createObjectVariable4;
                    i3 = i10;
                    z5 = true;
                    int[] iArr22 = this.mResolvedMatchConstraintDefault;
                    iArr22[0] = i2;
                    iArr22[1] = i3;
                    this.mResolvedHasRatio = z5;
                    if (!z5) {
                        z6 = true;
                        DimensionBehaviour dimensionBehaviour5222 = this.mListDimensionBehaviors[0];
                        DimensionBehaviour dimensionBehaviour6222 = DimensionBehaviour.WRAP_CONTENT;
                        if (dimensionBehaviour5222 != dimensionBehaviour6222) {
                        }
                        if (z16) {
                        }
                        boolean z17222 = !this.mCenter.isConnected();
                        boolean[] zArr222 = this.mIsInBarrier;
                        boolean z18222 = zArr222[0];
                        boolean z19222 = zArr222[1];
                        if (this.mHorizontalResolution != 2) {
                        }
                        z8 = z;
                        z9 = z2;
                        dimensionBehaviour = dimensionBehaviour6222;
                        solverVariable6 = createObjectVariable3;
                        solverVariable5 = createObjectVariable5;
                        i4 = i2;
                        VerticalWidgetRun verticalWidgetRun22222 = this.verticalRun;
                        dependencyNode = verticalWidgetRun22222.start;
                        if (dependencyNode.resolved) {
                        }
                        solverVariable7 = solverVariable6;
                        solverVariable8 = solverVariable4;
                        solverVariable9 = solverVariable5;
                        i5 = 0;
                        r9 = 1;
                        i6 = 8;
                        i7 = 1;
                        if ((this.mVerticalResolution != 2 ? i5 : i7) == 0) {
                        }
                        if (z7) {
                        }
                        linearSystem2 = linearSystem;
                        if (this.mCenter.isConnected()) {
                        }
                    }
                    z6 = false;
                    DimensionBehaviour dimensionBehaviour52222 = this.mListDimensionBehaviors[0];
                    DimensionBehaviour dimensionBehaviour62222 = DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour52222 != dimensionBehaviour62222) {
                    }
                    if (z16) {
                    }
                    boolean z172222 = !this.mCenter.isConnected();
                    boolean[] zArr2222 = this.mIsInBarrier;
                    boolean z182222 = zArr2222[0];
                    boolean z192222 = zArr2222[1];
                    if (this.mHorizontalResolution != 2) {
                    }
                    z8 = z;
                    z9 = z2;
                    dimensionBehaviour = dimensionBehaviour62222;
                    solverVariable6 = createObjectVariable3;
                    solverVariable5 = createObjectVariable5;
                    i4 = i2;
                    VerticalWidgetRun verticalWidgetRun222222 = this.verticalRun;
                    dependencyNode = verticalWidgetRun222222.start;
                    if (dependencyNode.resolved) {
                    }
                    solverVariable7 = solverVariable6;
                    solverVariable8 = solverVariable4;
                    solverVariable9 = solverVariable5;
                    i5 = 0;
                    r9 = 1;
                    i6 = 8;
                    i7 = 1;
                    if ((this.mVerticalResolution != 2 ? i5 : i7) == 0) {
                    }
                    if (z7) {
                    }
                    linearSystem2 = linearSystem;
                    if (this.mCenter.isConnected()) {
                    }
                }
                z5 = false;
                int[] iArr222 = this.mResolvedMatchConstraintDefault;
                iArr222[0] = i2;
                iArr222[1] = i3;
                this.mResolvedHasRatio = z5;
                if (!z5) {
                }
                z6 = false;
                DimensionBehaviour dimensionBehaviour522222 = this.mListDimensionBehaviors[0];
                DimensionBehaviour dimensionBehaviour622222 = DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour522222 != dimensionBehaviour622222) {
                }
                if (z16) {
                }
                boolean z1722222 = !this.mCenter.isConnected();
                boolean[] zArr22222 = this.mIsInBarrier;
                boolean z1822222 = zArr22222[0];
                boolean z1922222 = zArr22222[1];
                if (this.mHorizontalResolution != 2) {
                }
                z8 = z;
                z9 = z2;
                dimensionBehaviour = dimensionBehaviour622222;
                solverVariable6 = createObjectVariable3;
                solverVariable5 = createObjectVariable5;
                i4 = i2;
                VerticalWidgetRun verticalWidgetRun2222222 = this.verticalRun;
                dependencyNode = verticalWidgetRun2222222.start;
                if (dependencyNode.resolved) {
                }
                solverVariable7 = solverVariable6;
                solverVariable8 = solverVariable4;
                solverVariable9 = solverVariable5;
                i5 = 0;
                r9 = 1;
                i6 = 8;
                i7 = 1;
                if ((this.mVerticalResolution != 2 ? i5 : i7) == 0) {
                }
                if (z7) {
                }
                linearSystem2 = linearSystem;
                if (this.mCenter.isConnected()) {
                }
            }
        } else {
            i = i14;
        }
        solverVariable = createObjectVariable2;
        solverVariable2 = createObjectVariable4;
        i2 = i17;
        i3 = i18;
        z5 = false;
        int[] iArr2222 = this.mResolvedMatchConstraintDefault;
        iArr2222[0] = i2;
        iArr2222[1] = i3;
        this.mResolvedHasRatio = z5;
        if (!z5) {
        }
        z6 = false;
        DimensionBehaviour dimensionBehaviour5222222 = this.mListDimensionBehaviors[0];
        DimensionBehaviour dimensionBehaviour6222222 = DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour5222222 != dimensionBehaviour6222222) {
        }
        if (z16) {
        }
        boolean z17222222 = !this.mCenter.isConnected();
        boolean[] zArr222222 = this.mIsInBarrier;
        boolean z18222222 = zArr222222[0];
        boolean z19222222 = zArr222222[1];
        if (this.mHorizontalResolution != 2) {
        }
        z8 = z;
        z9 = z2;
        dimensionBehaviour = dimensionBehaviour6222222;
        solverVariable6 = createObjectVariable3;
        solverVariable5 = createObjectVariable5;
        i4 = i2;
        VerticalWidgetRun verticalWidgetRun22222222 = this.verticalRun;
        dependencyNode = verticalWidgetRun22222222.start;
        if (dependencyNode.resolved) {
        }
        solverVariable7 = solverVariable6;
        solverVariable8 = solverVariable4;
        solverVariable9 = solverVariable5;
        i5 = 0;
        r9 = 1;
        i6 = 8;
        i7 = 1;
        if ((this.mVerticalResolution != 2 ? i5 : i7) == 0) {
        }
        if (z7) {
        }
        linearSystem2 = linearSystem;
        if (this.mCenter.isConnected()) {
        }
    }

    public boolean allowedInBarrier() {
        return this.mVisibility != 8;
    }

    public void connect(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        if (constraintAnchor.getOwner() == this) {
            connect(constraintAnchor.getType(), constraintAnchor2.getOwner(), constraintAnchor2.getType(), i);
        }
    }

    public void connectCircularConstraint(ConstraintWidget constraintWidget, float f, int i) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.CENTER;
        immediateConnect(type, constraintWidget, type, i, 0);
        this.mCircleConstraintAngle = f;
    }

    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        this.mHorizontalResolution = constraintWidget.mHorizontalResolution;
        this.mVerticalResolution = constraintWidget.mVerticalResolution;
        this.mMatchConstraintDefaultWidth = constraintWidget.mMatchConstraintDefaultWidth;
        this.mMatchConstraintDefaultHeight = constraintWidget.mMatchConstraintDefaultHeight;
        int[] iArr = this.mResolvedMatchConstraintDefault;
        int[] iArr2 = constraintWidget.mResolvedMatchConstraintDefault;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.mMatchConstraintMinWidth = constraintWidget.mMatchConstraintMinWidth;
        this.mMatchConstraintMaxWidth = constraintWidget.mMatchConstraintMaxWidth;
        this.mMatchConstraintMinHeight = constraintWidget.mMatchConstraintMinHeight;
        this.mMatchConstraintMaxHeight = constraintWidget.mMatchConstraintMaxHeight;
        this.mMatchConstraintPercentHeight = constraintWidget.mMatchConstraintPercentHeight;
        this.mIsWidthWrapContent = constraintWidget.mIsWidthWrapContent;
        this.mIsHeightWrapContent = constraintWidget.mIsHeightWrapContent;
        this.mResolvedDimensionRatioSide = constraintWidget.mResolvedDimensionRatioSide;
        this.mResolvedDimensionRatio = constraintWidget.mResolvedDimensionRatio;
        int[] iArr3 = constraintWidget.mMaxDimension;
        this.mMaxDimension = Arrays.copyOf(iArr3, iArr3.length);
        this.mCircleConstraintAngle = constraintWidget.mCircleConstraintAngle;
        this.hasBaseline = constraintWidget.hasBaseline;
        this.inPlaceholder = constraintWidget.inPlaceholder;
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.mCenterX.reset();
        this.mCenterY.reset();
        this.mCenter.reset();
        this.mListDimensionBehaviors = (DimensionBehaviour[]) Arrays.copyOf(this.mListDimensionBehaviors, 2);
        this.mParent = this.mParent == null ? null : hashMap.get(constraintWidget.mParent);
        this.mWidth = constraintWidget.mWidth;
        this.mHeight = constraintWidget.mHeight;
        this.mDimensionRatio = constraintWidget.mDimensionRatio;
        this.mDimensionRatioSide = constraintWidget.mDimensionRatioSide;
        this.mX = constraintWidget.mX;
        this.mY = constraintWidget.mY;
        this.mRelX = constraintWidget.mRelX;
        this.mRelY = constraintWidget.mRelY;
        this.mOffsetX = constraintWidget.mOffsetX;
        this.mOffsetY = constraintWidget.mOffsetY;
        this.mBaselineDistance = constraintWidget.mBaselineDistance;
        this.mMinWidth = constraintWidget.mMinWidth;
        this.mMinHeight = constraintWidget.mMinHeight;
        this.mHorizontalBiasPercent = constraintWidget.mHorizontalBiasPercent;
        this.mVerticalBiasPercent = constraintWidget.mVerticalBiasPercent;
        this.mCompanionWidget = constraintWidget.mCompanionWidget;
        this.mContainerItemSkip = constraintWidget.mContainerItemSkip;
        this.mVisibility = constraintWidget.mVisibility;
        this.mDebugName = constraintWidget.mDebugName;
        this.mType = constraintWidget.mType;
        this.mDistToTop = constraintWidget.mDistToTop;
        this.mDistToLeft = constraintWidget.mDistToLeft;
        this.mDistToRight = constraintWidget.mDistToRight;
        this.mDistToBottom = constraintWidget.mDistToBottom;
        this.mLeftHasCentered = constraintWidget.mLeftHasCentered;
        this.mRightHasCentered = constraintWidget.mRightHasCentered;
        this.mTopHasCentered = constraintWidget.mTopHasCentered;
        this.mBottomHasCentered = constraintWidget.mBottomHasCentered;
        this.mHorizontalWrapVisited = constraintWidget.mHorizontalWrapVisited;
        this.mVerticalWrapVisited = constraintWidget.mVerticalWrapVisited;
        this.mOptimizerMeasurable = constraintWidget.mOptimizerMeasurable;
        this.mGroupsToSolver = constraintWidget.mGroupsToSolver;
        this.mHorizontalChainStyle = constraintWidget.mHorizontalChainStyle;
        this.mVerticalChainStyle = constraintWidget.mVerticalChainStyle;
        this.mHorizontalChainFixedPosition = constraintWidget.mHorizontalChainFixedPosition;
        this.mVerticalChainFixedPosition = constraintWidget.mVerticalChainFixedPosition;
        float[] fArr = this.mWeight;
        float[] fArr2 = constraintWidget.mWeight;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        ConstraintWidget[] constraintWidgetArr = this.mListNextMatchConstraintsWidget;
        ConstraintWidget[] constraintWidgetArr2 = constraintWidget.mListNextMatchConstraintsWidget;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        ConstraintWidget[] constraintWidgetArr3 = this.mNextChainWidget;
        ConstraintWidget[] constraintWidgetArr4 = constraintWidget.mNextChainWidget;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        ConstraintWidget constraintWidget2 = constraintWidget.mHorizontalNextWidget;
        this.mHorizontalNextWidget = constraintWidget2 == null ? null : hashMap.get(constraintWidget2);
        ConstraintWidget constraintWidget3 = constraintWidget.mVerticalNextWidget;
        this.mVerticalNextWidget = constraintWidget3 != null ? hashMap.get(constraintWidget3) : null;
    }

    public void createObjectVariables(LinearSystem linearSystem) {
        linearSystem.createObjectVariable(this.mLeft);
        linearSystem.createObjectVariable(this.mTop);
        linearSystem.createObjectVariable(this.mRight);
        linearSystem.createObjectVariable(this.mBottom);
        if (this.mBaselineDistance > 0) {
            linearSystem.createObjectVariable(this.mBaseline);
        }
    }

    public ConstraintAnchor getAnchor(ConstraintAnchor.Type type) {
        switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[type.ordinal()]) {
            case 1:
                return this.mLeft;
            case 2:
                return this.mTop;
            case 3:
                return this.mRight;
            case 4:
                return this.mBottom;
            case 5:
                return this.mBaseline;
            case 6:
                return this.mCenter;
            case 7:
                return this.mCenterX;
            case 8:
                return this.mCenterY;
            case 9:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    public ArrayList<ConstraintAnchor> getAnchors() {
        return this.mAnchors;
    }

    public int getBaselineDistance() {
        return this.mBaselineDistance;
    }

    public float getBiasPercent(int i) {
        if (i == 0) {
            return this.mHorizontalBiasPercent;
        }
        if (i == 1) {
            return this.mVerticalBiasPercent;
        }
        return -1.0f;
    }

    public int getBottom() {
        return getY() + this.mHeight;
    }

    public Object getCompanionWidget() {
        return this.mCompanionWidget;
    }

    public int getContainerItemSkip() {
        return this.mContainerItemSkip;
    }

    public String getDebugName() {
        return this.mDebugName;
    }

    public DimensionBehaviour getDimensionBehaviour(int i) {
        if (i == 0) {
            return getHorizontalDimensionBehaviour();
        }
        if (i == 1) {
            return getVerticalDimensionBehaviour();
        }
        return null;
    }

    public float getDimensionRatio() {
        return this.mDimensionRatio;
    }

    public int getDimensionRatioSide() {
        return this.mDimensionRatioSide;
    }

    public boolean getHasBaseline() {
        return this.hasBaseline;
    }

    public int getHeight() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mHeight;
    }

    public float getHorizontalBiasPercent() {
        return this.mHorizontalBiasPercent;
    }

    public ConstraintWidget getHorizontalChainControlWidget() {
        if (!isInHorizontalChain()) {
            return null;
        }
        ConstraintWidget constraintWidget = this;
        ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            ConstraintAnchor anchor = constraintWidget.getAnchor(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor target = anchor == null ? null : anchor.getTarget();
            ConstraintWidget owner = target == null ? null : target.getOwner();
            if (owner == getParent()) {
                return constraintWidget;
            }
            ConstraintAnchor target2 = owner == null ? null : owner.getAnchor(ConstraintAnchor.Type.RIGHT).getTarget();
            if (target2 == null || target2.getOwner() == constraintWidget) {
                constraintWidget = owner;
            } else {
                constraintWidget2 = constraintWidget;
            }
        }
        return constraintWidget2;
    }

    public int getHorizontalChainStyle() {
        return this.mHorizontalChainStyle;
    }

    public DimensionBehaviour getHorizontalDimensionBehaviour() {
        return this.mListDimensionBehaviors[0];
    }

    public int getHorizontalMargin() {
        ConstraintAnchor constraintAnchor = this.mLeft;
        int i = constraintAnchor != null ? constraintAnchor.mMargin : 0;
        ConstraintAnchor constraintAnchor2 = this.mRight;
        return constraintAnchor2 != null ? i + constraintAnchor2.mMargin : i;
    }

    public int getLeft() {
        return getX();
    }

    public int getLength(int i) {
        if (i == 0) {
            return getWidth();
        }
        if (i == 1) {
            return getHeight();
        }
        return 0;
    }

    public int getMaxHeight() {
        return this.mMaxDimension[1];
    }

    public int getMaxWidth() {
        return this.mMaxDimension[0];
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public ConstraintWidget getNextChainMember(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i != 0) {
            if (i == 1 && (constraintAnchor2 = (constraintAnchor = this.mBottom).mTarget) != null && constraintAnchor2.mTarget == constraintAnchor) {
                return constraintAnchor2.mOwner;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.mRight;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        if (constraintAnchor4 == null || constraintAnchor4.mTarget != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.mOwner;
    }

    public int getOptimizerWrapHeight() {
        int i = this.mHeight;
        if (this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            if (this.mMatchConstraintDefaultHeight == 1) {
                i = Math.max(this.mMatchConstraintMinHeight, i);
            } else {
                i = this.mMatchConstraintMinHeight;
                if (i > 0) {
                    this.mHeight = i;
                } else {
                    i = 0;
                }
            }
            int i2 = this.mMatchConstraintMaxHeight;
            if (i2 > 0 && i2 < i) {
                return i2;
            }
        }
        return i;
    }

    public int getOptimizerWrapWidth() {
        int i = this.mWidth;
        int i2 = 0;
        if (this.mListDimensionBehaviors[0] != DimensionBehaviour.MATCH_CONSTRAINT) {
            return i;
        }
        if (this.mMatchConstraintDefaultWidth == 1) {
            i2 = Math.max(this.mMatchConstraintMinWidth, i);
        } else {
            int i3 = this.mMatchConstraintMinWidth;
            if (i3 > 0) {
                this.mWidth = i3;
                i2 = i3;
            }
        }
        int i4 = this.mMatchConstraintMaxWidth;
        return (i4 <= 0 || i4 >= i2) ? i2 : i4;
    }

    public ConstraintWidget getParent() {
        return this.mParent;
    }

    public ConstraintWidget getPreviousChainMember(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i != 0) {
            if (i == 1 && (constraintAnchor2 = (constraintAnchor = this.mTop).mTarget) != null && constraintAnchor2.mTarget == constraintAnchor) {
                return constraintAnchor2.mOwner;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.mLeft;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        if (constraintAnchor4 == null || constraintAnchor4.mTarget != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.mOwner;
    }

    public int getRelativePositioning(int i) {
        if (i == 0) {
            return this.mRelX;
        }
        if (i == 1) {
            return this.mRelY;
        }
        return 0;
    }

    public int getRight() {
        return getX() + this.mWidth;
    }

    public int getRootX() {
        return this.mX + this.mOffsetX;
    }

    public int getRootY() {
        return this.mY + this.mOffsetY;
    }

    public WidgetRun getRun(int i) {
        if (i == 0) {
            return this.horizontalRun;
        }
        if (i == 1) {
            return this.verticalRun;
        }
        return null;
    }

    public int getTop() {
        return getY();
    }

    public String getType() {
        return this.mType;
    }

    public float getVerticalBiasPercent() {
        return this.mVerticalBiasPercent;
    }

    public ConstraintWidget getVerticalChainControlWidget() {
        if (!isInVerticalChain()) {
            return null;
        }
        ConstraintWidget constraintWidget = this;
        ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            ConstraintAnchor anchor = constraintWidget.getAnchor(ConstraintAnchor.Type.TOP);
            ConstraintAnchor target = anchor == null ? null : anchor.getTarget();
            ConstraintWidget owner = target == null ? null : target.getOwner();
            if (owner == getParent()) {
                return constraintWidget;
            }
            ConstraintAnchor target2 = owner == null ? null : owner.getAnchor(ConstraintAnchor.Type.BOTTOM).getTarget();
            if (target2 == null || target2.getOwner() == constraintWidget) {
                constraintWidget = owner;
            } else {
                constraintWidget2 = constraintWidget;
            }
        }
        return constraintWidget2;
    }

    public int getVerticalChainStyle() {
        return this.mVerticalChainStyle;
    }

    public DimensionBehaviour getVerticalDimensionBehaviour() {
        return this.mListDimensionBehaviors[1];
    }

    public int getVerticalMargin() {
        int i = this.mLeft != null ? this.mTop.mMargin : 0;
        return this.mRight != null ? i + this.mBottom.mMargin : i;
    }

    public int getVisibility() {
        return this.mVisibility;
    }

    public int getWidth() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mWidth;
    }

    public int getX() {
        ConstraintWidget constraintWidget = this.mParent;
        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.mX : ((ConstraintWidgetContainer) constraintWidget).mPaddingLeft + this.mX;
    }

    public int getY() {
        ConstraintWidget constraintWidget = this.mParent;
        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.mY : ((ConstraintWidgetContainer) constraintWidget).mPaddingTop + this.mY;
    }

    public boolean hasBaseline() {
        return this.hasBaseline;
    }

    public void immediateConnect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i, int i2) {
        getAnchor(type).connect(constraintWidget.getAnchor(type2), i, i2, true);
    }

    public boolean isHeightWrapContent() {
        return this.mIsHeightWrapContent;
    }

    public boolean isInHorizontalChain() {
        ConstraintAnchor constraintAnchor = this.mLeft;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 != null && constraintAnchor2.mTarget == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.mRight;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        return constraintAnchor4 != null && constraintAnchor4.mTarget == constraintAnchor3;
    }

    public boolean isInPlaceholder() {
        return this.inPlaceholder;
    }

    public boolean isInVerticalChain() {
        ConstraintAnchor constraintAnchor = this.mTop;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 != null && constraintAnchor2.mTarget == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.mBottom;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.mTarget;
        return constraintAnchor4 != null && constraintAnchor4.mTarget == constraintAnchor3;
    }

    public boolean isInVirtualLayout() {
        return this.mInVirtuaLayout;
    }

    public boolean isRoot() {
        return this.mParent == null;
    }

    public boolean isSpreadHeight() {
        return this.mMatchConstraintDefaultHeight == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinHeight == 0 && this.mMatchConstraintMaxHeight == 0 && this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean isSpreadWidth() {
        return this.mMatchConstraintDefaultWidth == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinWidth == 0 && this.mMatchConstraintMaxWidth == 0 && this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean isWidthWrapContent() {
        return this.mIsWidthWrapContent;
    }

    public void reset() {
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.mCenterX.reset();
        this.mCenterY.reset();
        this.mCenter.reset();
        this.mParent = null;
        this.mCircleConstraintAngle = 0.0f;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.mCompanionWidget = null;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mType = null;
        this.mHorizontalWrapVisited = false;
        this.mVerticalWrapVisited = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mHorizontalChainFixedPosition = false;
        this.mVerticalChainFixedPosition = false;
        float[] fArr = this.mWeight;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        int[] iArr = this.mMaxDimension;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mMatchConstraintMaxWidth = Integer.MAX_VALUE;
        this.mMatchConstraintMaxHeight = Integer.MAX_VALUE;
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMinHeight = 0;
        this.mResolvedHasRatio = false;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mOptimizerMeasurable = false;
        this.mGroupsToSolver = false;
        boolean[] zArr = this.isTerminalWidget;
        zArr[0] = true;
        zArr[1] = true;
        this.mInVirtuaLayout = false;
        boolean[] zArr2 = this.mIsInBarrier;
        zArr2[0] = false;
        zArr2[1] = false;
    }

    public void resetAllConstraints() {
        resetAnchors();
        setVerticalBiasPercent(DEFAULT_BIAS);
        setHorizontalBiasPercent(DEFAULT_BIAS);
    }

    public void resetAnchor(ConstraintAnchor constraintAnchor) {
        if (getParent() != null && (getParent() instanceof ConstraintWidgetContainer) && ((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            return;
        }
        ConstraintAnchor anchor = getAnchor(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor anchor2 = getAnchor(ConstraintAnchor.Type.RIGHT);
        ConstraintAnchor anchor3 = getAnchor(ConstraintAnchor.Type.TOP);
        ConstraintAnchor anchor4 = getAnchor(ConstraintAnchor.Type.BOTTOM);
        ConstraintAnchor anchor5 = getAnchor(ConstraintAnchor.Type.CENTER);
        ConstraintAnchor anchor6 = getAnchor(ConstraintAnchor.Type.CENTER_X);
        ConstraintAnchor anchor7 = getAnchor(ConstraintAnchor.Type.CENTER_Y);
        if (constraintAnchor == anchor5) {
            if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                anchor.reset();
                anchor2.reset();
            }
            if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
                anchor3.reset();
                anchor4.reset();
            }
            this.mHorizontalBiasPercent = 0.5f;
            this.mVerticalBiasPercent = 0.5f;
        } else if (constraintAnchor == anchor6) {
            if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget().getOwner() == anchor2.getTarget().getOwner()) {
                anchor.reset();
                anchor2.reset();
            }
            this.mHorizontalBiasPercent = 0.5f;
        } else if (constraintAnchor == anchor7) {
            if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget().getOwner() == anchor4.getTarget().getOwner()) {
                anchor3.reset();
                anchor4.reset();
            }
            this.mVerticalBiasPercent = 0.5f;
        } else if (constraintAnchor == anchor || constraintAnchor == anchor2) {
            if (anchor.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                anchor5.reset();
            }
        } else if ((constraintAnchor == anchor3 || constraintAnchor == anchor4) && anchor3.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
            anchor5.reset();
        }
        constraintAnchor.reset();
    }

    public void resetAnchors() {
        ConstraintWidget parent = getParent();
        if (parent != null && (parent instanceof ConstraintWidgetContainer) && ((ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            return;
        }
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            this.mAnchors.get(i).reset();
        }
    }

    public void resetSolverVariables(Cache cache) {
        this.mLeft.resetSolverVariable(cache);
        this.mTop.resetSolverVariable(cache);
        this.mRight.resetSolverVariable(cache);
        this.mBottom.resetSolverVariable(cache);
        this.mBaseline.resetSolverVariable(cache);
        this.mCenter.resetSolverVariable(cache);
        this.mCenterX.resetSolverVariable(cache);
        this.mCenterY.resetSolverVariable(cache);
    }

    public void setBaselineDistance(int i) {
        this.mBaselineDistance = i;
        this.hasBaseline = i > 0;
    }

    public void setCompanionWidget(Object obj) {
        this.mCompanionWidget = obj;
    }

    public void setContainerItemSkip(int i) {
        if (i >= 0) {
            this.mContainerItemSkip = i;
        } else {
            this.mContainerItemSkip = 0;
        }
    }

    public void setDebugName(String str) {
        this.mDebugName = str;
    }

    public void setDebugSolverName(LinearSystem linearSystem, String str) {
        this.mDebugName = str;
        SolverVariable createObjectVariable = linearSystem.createObjectVariable(this.mLeft);
        SolverVariable createObjectVariable2 = linearSystem.createObjectVariable(this.mTop);
        SolverVariable createObjectVariable3 = linearSystem.createObjectVariable(this.mRight);
        SolverVariable createObjectVariable4 = linearSystem.createObjectVariable(this.mBottom);
        createObjectVariable.setName(str + ".left");
        createObjectVariable2.setName(str + ".top");
        createObjectVariable3.setName(str + ".right");
        createObjectVariable4.setName(str + ".bottom");
        if (this.mBaselineDistance > 0) {
            linearSystem.createObjectVariable(this.mBaseline).setName(str + ".baseline");
        }
    }

    public void setDimension(int i, int i2) {
        this.mWidth = i;
        int i3 = this.mMinWidth;
        if (i < i3) {
            this.mWidth = i3;
        }
        this.mHeight = i2;
        int i4 = this.mMinHeight;
        if (i2 < i4) {
            this.mHeight = i4;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0086 -> B:31:0x0087). Please report as a decompilation issue!!! */
    public void setDimensionRatio(String str) {
        float f;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.mDimensionRatio = 0.0f;
            return;
        }
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i2 = -1;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            i2 = substring.equalsIgnoreCase(ExifInterface.LONGITUDE_WEST) ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
            r3 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 < 0 || indexOf2 >= length - 1) {
            String substring2 = str.substring(r3);
            if (substring2.length() > 0) {
                f = Float.parseFloat(substring2);
            }
            f = i;
        } else {
            String substring3 = str.substring(r3, indexOf2);
            String substring4 = str.substring(indexOf2 + 1);
            if (substring3.length() > 0 && substring4.length() > 0) {
                float parseFloat = Float.parseFloat(substring3);
                float parseFloat2 = Float.parseFloat(substring4);
                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                    f = i2 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                }
            }
            f = i;
        }
        i = (f > i ? 1 : (f == i ? 0 : -1));
        if (i > 0) {
            this.mDimensionRatio = f;
            this.mDimensionRatioSide = i2;
        }
    }

    public void setFrame(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.mX = i;
        this.mY = i2;
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i7 < (i6 = this.mWidth)) {
            i7 = i6;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i8 < (i5 = this.mHeight)) {
            i8 = i5;
        }
        this.mWidth = i7;
        this.mHeight = i8;
        int i9 = this.mMinHeight;
        if (i8 < i9) {
            this.mHeight = i9;
        }
        int i10 = this.mMinWidth;
        if (i7 < i10) {
            this.mWidth = i10;
        }
    }

    public void setGoneMargin(ConstraintAnchor.Type type, int i) {
        int i2 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[type.ordinal()];
        if (i2 == 1) {
            this.mLeft.mGoneMargin = i;
            return;
        }
        if (i2 == 2) {
            this.mTop.mGoneMargin = i;
        } else if (i2 == 3) {
            this.mRight.mGoneMargin = i;
        } else {
            if (i2 != 4) {
                return;
            }
            this.mBottom.mGoneMargin = i;
        }
    }

    public void setHasBaseline(boolean z) {
        this.hasBaseline = z;
    }

    public void setHeight(int i) {
        this.mHeight = i;
        int i2 = this.mMinHeight;
        if (i < i2) {
            this.mHeight = i2;
        }
    }

    public void setHeightWrapContent(boolean z) {
        this.mIsHeightWrapContent = z;
    }

    public void setHorizontalBiasPercent(float f) {
        this.mHorizontalBiasPercent = f;
    }

    public void setHorizontalChainStyle(int i) {
        this.mHorizontalChainStyle = i;
    }

    public void setHorizontalDimension(int i, int i2) {
        this.mX = i;
        int i3 = i2 - i;
        this.mWidth = i3;
        int i4 = this.mMinWidth;
        if (i3 < i4) {
            this.mWidth = i4;
        }
    }

    public void setHorizontalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[0] = dimensionBehaviour;
    }

    public void setHorizontalMatchStyle(int i, int i2, int i3, float f) {
        this.mMatchConstraintDefaultWidth = i;
        this.mMatchConstraintMinWidth = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.mMatchConstraintMaxWidth = i3;
        this.mMatchConstraintPercentWidth = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.mMatchConstraintDefaultWidth = 2;
    }

    public void setHorizontalWeight(float f) {
        this.mWeight[0] = f;
    }

    public void setInBarrier(int i, boolean z) {
        this.mIsInBarrier[i] = z;
    }

    public void setInPlaceholder(boolean z) {
        this.inPlaceholder = z;
    }

    public void setInVirtualLayout(boolean z) {
        this.mInVirtuaLayout = z;
    }

    public void setLength(int i, int i2) {
        if (i2 == 0) {
            setWidth(i);
        } else if (i2 == 1) {
            setHeight(i);
        }
    }

    public void setMaxHeight(int i) {
        this.mMaxDimension[1] = i;
    }

    public void setMaxWidth(int i) {
        this.mMaxDimension[0] = i;
    }

    public void setMinHeight(int i) {
        if (i < 0) {
            this.mMinHeight = 0;
        } else {
            this.mMinHeight = i;
        }
    }

    public void setMinWidth(int i) {
        if (i < 0) {
            this.mMinWidth = 0;
        } else {
            this.mMinWidth = i;
        }
    }

    public void setOffset(int i, int i2) {
        this.mOffsetX = i;
        this.mOffsetY = i2;
    }

    public void setOrigin(int i, int i2) {
        this.mX = i;
        this.mY = i2;
    }

    public void setParent(ConstraintWidget constraintWidget) {
        this.mParent = constraintWidget;
    }

    public void setRelativePositioning(int i, int i2) {
        if (i2 == 0) {
            this.mRelX = i;
        } else if (i2 == 1) {
            this.mRelY = i;
        }
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setVerticalBiasPercent(float f) {
        this.mVerticalBiasPercent = f;
    }

    public void setVerticalChainStyle(int i) {
        this.mVerticalChainStyle = i;
    }

    public void setVerticalDimension(int i, int i2) {
        this.mY = i;
        int i3 = i2 - i;
        this.mHeight = i3;
        int i4 = this.mMinHeight;
        if (i3 < i4) {
            this.mHeight = i4;
        }
    }

    public void setVerticalDimensionBehaviour(DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[1] = dimensionBehaviour;
    }

    public void setVerticalMatchStyle(int i, int i2, int i3, float f) {
        this.mMatchConstraintDefaultHeight = i;
        this.mMatchConstraintMinHeight = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.mMatchConstraintMaxHeight = i3;
        this.mMatchConstraintPercentHeight = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.mMatchConstraintDefaultHeight = 2;
    }

    public void setVerticalWeight(float f) {
        this.mWeight[1] = f;
    }

    public void setVisibility(int i) {
        this.mVisibility = i;
    }

    public void setWidth(int i) {
        this.mWidth = i;
        int i2 = this.mMinWidth;
        if (i < i2) {
            this.mWidth = i2;
        }
    }

    public void setWidthWrapContent(boolean z) {
        this.mIsWidthWrapContent = z;
    }

    public void setX(int i) {
        this.mX = i;
    }

    public void setY(int i) {
        this.mY = i;
    }

    public void setupDimensionRatio(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.mResolvedDimensionRatioSide == -1) {
            if (z3 && !z4) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (!z3 && z4) {
                this.mResolvedDimensionRatioSide = 1;
                if (this.mDimensionRatioSide == -1) {
                    this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                }
            }
        }
        if (this.mResolvedDimensionRatioSide == 0 && (!this.mTop.isConnected() || !this.mBottom.isConnected())) {
            this.mResolvedDimensionRatioSide = 1;
        } else if (this.mResolvedDimensionRatioSide == 1 && (!this.mLeft.isConnected() || !this.mRight.isConnected())) {
            this.mResolvedDimensionRatioSide = 0;
        }
        if (this.mResolvedDimensionRatioSide == -1 && (!this.mTop.isConnected() || !this.mBottom.isConnected() || !this.mLeft.isConnected() || !this.mRight.isConnected())) {
            if (this.mTop.isConnected() && this.mBottom.isConnected()) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (this.mLeft.isConnected() && this.mRight.isConnected()) {
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
        if (this.mResolvedDimensionRatioSide == -1) {
            int i = this.mMatchConstraintMinWidth;
            if (i > 0 && this.mMatchConstraintMinHeight == 0) {
                this.mResolvedDimensionRatioSide = 0;
            } else {
                if (i != 0 || this.mMatchConstraintMinHeight <= 0) {
                    return;
                }
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mType != null ? a.a(new StringBuilder("type: "), this.mType, " ") : "");
        sb.append(this.mDebugName != null ? a.a(new StringBuilder("id: "), this.mDebugName, " ") : "");
        sb.append("(");
        sb.append(this.mX);
        sb.append(", ");
        sb.append(this.mY);
        sb.append(") - (");
        sb.append(this.mWidth);
        sb.append(" x ");
        return C0211b.a(sb, this.mHeight, ")");
    }

    public void updateFromRuns(boolean z, boolean z2) {
        int i;
        int i2;
        boolean isResolved = z & this.horizontalRun.isResolved();
        boolean isResolved2 = z2 & this.verticalRun.isResolved();
        HorizontalWidgetRun horizontalWidgetRun = this.horizontalRun;
        int i3 = horizontalWidgetRun.start.value;
        VerticalWidgetRun verticalWidgetRun = this.verticalRun;
        int i4 = verticalWidgetRun.start.value;
        int i5 = horizontalWidgetRun.end.value;
        int i6 = verticalWidgetRun.end.value;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i3 = 0;
            i6 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (isResolved) {
            this.mX = i3;
        }
        if (isResolved2) {
            this.mY = i4;
        }
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        if (isResolved) {
            if (this.mListDimensionBehaviors[0] == DimensionBehaviour.FIXED && i8 < (i2 = this.mWidth)) {
                i8 = i2;
            }
            this.mWidth = i8;
            int i10 = this.mMinWidth;
            if (i8 < i10) {
                this.mWidth = i10;
            }
        }
        if (isResolved2) {
            if (this.mListDimensionBehaviors[1] == DimensionBehaviour.FIXED && i9 < (i = this.mHeight)) {
                i9 = i;
            }
            this.mHeight = i9;
            int i11 = this.mMinHeight;
            if (i9 < i11) {
                this.mHeight = i11;
            }
        }
    }

    public void updateFromSolver(LinearSystem linearSystem) {
        int objectVariableValue = linearSystem.getObjectVariableValue(this.mLeft);
        int objectVariableValue2 = linearSystem.getObjectVariableValue(this.mTop);
        int objectVariableValue3 = linearSystem.getObjectVariableValue(this.mRight);
        int objectVariableValue4 = linearSystem.getObjectVariableValue(this.mBottom);
        HorizontalWidgetRun horizontalWidgetRun = this.horizontalRun;
        DependencyNode dependencyNode = horizontalWidgetRun.start;
        if (dependencyNode.resolved) {
            DependencyNode dependencyNode2 = horizontalWidgetRun.end;
            if (dependencyNode2.resolved) {
                objectVariableValue = dependencyNode.value;
                objectVariableValue3 = dependencyNode2.value;
            }
        }
        VerticalWidgetRun verticalWidgetRun = this.verticalRun;
        DependencyNode dependencyNode3 = verticalWidgetRun.start;
        if (dependencyNode3.resolved) {
            DependencyNode dependencyNode4 = verticalWidgetRun.end;
            if (dependencyNode4.resolved) {
                objectVariableValue2 = dependencyNode3.value;
                objectVariableValue4 = dependencyNode4.value;
            }
        }
        int i = objectVariableValue4 - objectVariableValue2;
        if (objectVariableValue3 - objectVariableValue < 0 || i < 0 || objectVariableValue == Integer.MIN_VALUE || objectVariableValue == Integer.MAX_VALUE || objectVariableValue2 == Integer.MIN_VALUE || objectVariableValue2 == Integer.MAX_VALUE || objectVariableValue3 == Integer.MIN_VALUE || objectVariableValue3 == Integer.MAX_VALUE || objectVariableValue4 == Integer.MIN_VALUE || objectVariableValue4 == Integer.MAX_VALUE) {
            objectVariableValue = 0;
            objectVariableValue4 = 0;
            objectVariableValue2 = 0;
            objectVariableValue3 = 0;
        }
        setFrame(objectVariableValue, objectVariableValue2, objectVariableValue3, objectVariableValue4);
    }

    public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2) {
        connect(type, constraintWidget, type2, 0);
    }

    public void connect(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i) {
        ConstraintAnchor.Type type3;
        ConstraintAnchor.Type type4;
        boolean z;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.CENTER;
        if (type == type5) {
            if (type2 == type5) {
                ConstraintAnchor.Type type6 = ConstraintAnchor.Type.LEFT;
                ConstraintAnchor anchor = getAnchor(type6);
                ConstraintAnchor.Type type7 = ConstraintAnchor.Type.RIGHT;
                ConstraintAnchor anchor2 = getAnchor(type7);
                ConstraintAnchor.Type type8 = ConstraintAnchor.Type.TOP;
                ConstraintAnchor anchor3 = getAnchor(type8);
                ConstraintAnchor.Type type9 = ConstraintAnchor.Type.BOTTOM;
                ConstraintAnchor anchor4 = getAnchor(type9);
                boolean z2 = true;
                if ((anchor == null || !anchor.isConnected()) && (anchor2 == null || !anchor2.isConnected())) {
                    connect(type6, constraintWidget, type6, 0);
                    connect(type7, constraintWidget, type7, 0);
                    z = true;
                } else {
                    z = false;
                }
                if ((anchor3 == null || !anchor3.isConnected()) && (anchor4 == null || !anchor4.isConnected())) {
                    connect(type8, constraintWidget, type8, 0);
                    connect(type9, constraintWidget, type9, 0);
                } else {
                    z2 = false;
                }
                if (z && z2) {
                    getAnchor(type5).connect(constraintWidget.getAnchor(type5), 0);
                    return;
                }
                if (z) {
                    ConstraintAnchor.Type type10 = ConstraintAnchor.Type.CENTER_X;
                    getAnchor(type10).connect(constraintWidget.getAnchor(type10), 0);
                    return;
                } else {
                    if (z2) {
                        ConstraintAnchor.Type type11 = ConstraintAnchor.Type.CENTER_Y;
                        getAnchor(type11).connect(constraintWidget.getAnchor(type11), 0);
                        return;
                    }
                    return;
                }
            }
            ConstraintAnchor.Type type12 = ConstraintAnchor.Type.LEFT;
            if (type2 != type12 && type2 != ConstraintAnchor.Type.RIGHT) {
                ConstraintAnchor.Type type13 = ConstraintAnchor.Type.TOP;
                if (type2 == type13 || type2 == ConstraintAnchor.Type.BOTTOM) {
                    connect(type13, constraintWidget, type2, 0);
                    connect(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                    getAnchor(type5).connect(constraintWidget.getAnchor(type2), 0);
                    return;
                }
                return;
            }
            connect(type12, constraintWidget, type2, 0);
            connect(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
            getAnchor(type5).connect(constraintWidget.getAnchor(type2), 0);
            return;
        }
        ConstraintAnchor.Type type14 = ConstraintAnchor.Type.CENTER_X;
        if (type == type14 && (type2 == (type4 = ConstraintAnchor.Type.LEFT) || type2 == ConstraintAnchor.Type.RIGHT)) {
            ConstraintAnchor anchor5 = getAnchor(type4);
            ConstraintAnchor anchor6 = constraintWidget.getAnchor(type2);
            ConstraintAnchor anchor7 = getAnchor(ConstraintAnchor.Type.RIGHT);
            anchor5.connect(anchor6, 0);
            anchor7.connect(anchor6, 0);
            getAnchor(type14).connect(anchor6, 0);
            return;
        }
        ConstraintAnchor.Type type15 = ConstraintAnchor.Type.CENTER_Y;
        if (type == type15 && (type2 == (type3 = ConstraintAnchor.Type.TOP) || type2 == ConstraintAnchor.Type.BOTTOM)) {
            ConstraintAnchor anchor8 = constraintWidget.getAnchor(type2);
            getAnchor(type3).connect(anchor8, 0);
            getAnchor(ConstraintAnchor.Type.BOTTOM).connect(anchor8, 0);
            getAnchor(type15).connect(anchor8, 0);
            return;
        }
        if (type == type14 && type2 == type14) {
            ConstraintAnchor.Type type16 = ConstraintAnchor.Type.LEFT;
            getAnchor(type16).connect(constraintWidget.getAnchor(type16), 0);
            ConstraintAnchor.Type type17 = ConstraintAnchor.Type.RIGHT;
            getAnchor(type17).connect(constraintWidget.getAnchor(type17), 0);
            getAnchor(type14).connect(constraintWidget.getAnchor(type2), 0);
            return;
        }
        if (type == type15 && type2 == type15) {
            ConstraintAnchor.Type type18 = ConstraintAnchor.Type.TOP;
            getAnchor(type18).connect(constraintWidget.getAnchor(type18), 0);
            ConstraintAnchor.Type type19 = ConstraintAnchor.Type.BOTTOM;
            getAnchor(type19).connect(constraintWidget.getAnchor(type19), 0);
            getAnchor(type15).connect(constraintWidget.getAnchor(type2), 0);
            return;
        }
        ConstraintAnchor anchor9 = getAnchor(type);
        ConstraintAnchor anchor10 = constraintWidget.getAnchor(type2);
        if (anchor9.isValidConnection(anchor10)) {
            ConstraintAnchor.Type type20 = ConstraintAnchor.Type.BASELINE;
            if (type == type20) {
                ConstraintAnchor anchor11 = getAnchor(ConstraintAnchor.Type.TOP);
                ConstraintAnchor anchor12 = getAnchor(ConstraintAnchor.Type.BOTTOM);
                if (anchor11 != null) {
                    anchor11.reset();
                }
                if (anchor12 != null) {
                    anchor12.reset();
                }
                i = 0;
            } else if (type != ConstraintAnchor.Type.TOP && type != ConstraintAnchor.Type.BOTTOM) {
                if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                    ConstraintAnchor anchor13 = getAnchor(type5);
                    if (anchor13.getTarget() != anchor10) {
                        anchor13.reset();
                    }
                    ConstraintAnchor opposite = getAnchor(type).getOpposite();
                    ConstraintAnchor anchor14 = getAnchor(type14);
                    if (anchor14.isConnected()) {
                        opposite.reset();
                        anchor14.reset();
                    }
                }
            } else {
                ConstraintAnchor anchor15 = getAnchor(type20);
                if (anchor15 != null) {
                    anchor15.reset();
                }
                ConstraintAnchor anchor16 = getAnchor(type5);
                if (anchor16.getTarget() != anchor10) {
                    anchor16.reset();
                }
                ConstraintAnchor opposite2 = getAnchor(type).getOpposite();
                ConstraintAnchor anchor17 = getAnchor(type15);
                if (anchor17.isConnected()) {
                    opposite2.reset();
                    anchor17.reset();
                }
            }
            anchor9.connect(anchor10, i);
        }
    }

    public void setFrame(int i, int i2, int i3) {
        if (i3 == 0) {
            setHorizontalDimension(i, i2);
        } else if (i3 == 1) {
            setVerticalDimension(i, i2);
        }
    }

    public void setDimensionRatio(float f, int i) {
        this.mDimensionRatio = f;
        this.mDimensionRatioSide = i;
    }

    public ConstraintWidget(int i, int i2, int i3, int i4) {
        this.measured = false;
        this.run = new WidgetRun[2];
        this.horizontalRun = new HorizontalWidgetRun(this);
        this.verticalRun = new VerticalWidgetRun(this);
        this.isTerminalWidget = new boolean[]{true, true};
        this.wrapMeasure = new int[]{0, 0, 0, 0};
        this.mResolvedHasRatio = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = 0.0f;
        this.hasBaseline = false;
        this.mInVirtuaLayout = false;
        this.mLeft = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.mTop = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.mRight = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.mParent = null;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mOptimizerMeasurable = false;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mNextChainWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.mX = i;
        this.mY = i2;
        this.mWidth = i3;
        this.mHeight = i4;
        addAnchors();
    }

    public ConstraintWidget(int i, int i2) {
        this(0, 0, i, i2);
    }
}
