package androidx.constraintlayout.core.widgets;

/* loaded from: classes.dex */
public class ConstraintWidget {
    public static final int ANCHOR_BASELINE = 4;
    public static final int ANCHOR_BOTTOM = 3;
    public static final int ANCHOR_LEFT = 0;
    public static final int ANCHOR_RIGHT = 1;
    public static final int ANCHOR_TOP = 2;
    public static final int BOTH = 2;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static float DEFAULT_BIAS = 0.5f;
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
    public static final int VERTICAL = 1;
    public static final int VISIBLE = 0;
    public static final int WRAP_BEHAVIOR_HORIZONTAL_ONLY = 1;
    public static final int WRAP_BEHAVIOR_INCLUDED = 0;
    public static final int WRAP_BEHAVIOR_SKIPPED = 3;
    public static final int WRAP_BEHAVIOR_VERTICAL_ONLY = 2;
    private int AMEXKernel;
    private boolean AMEXKernelCallback;
    private boolean AMEXKernelJNI;
    private int AMEXKernelProvider;
    private boolean[] AMEXKernela;
    float ArtificialStackFrames;
    private boolean Camera2StreamConfigurationMap;
    boolean CoroutineDebuggingKt;
    androidx.constraintlayout.core.widgets.ConstraintWidget _BOUNDARY;
    boolean _CREATION;

    /* renamed from: a, reason: collision with root package name */
    int f2724a;
    boolean accessartificialFrame;
    float b;
    private boolean c;
    boolean coroutineBoundary;
    int coroutineCreation;
    int d;
    private boolean exchange;
    public androidx.constraintlayout.core.state.WidgetFrame frame;
    private int free;
    private java.lang.String freeTransaction;
    boolean getARTIFICIAL_FRAME_PACKAGE_NAME;
    private java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    androidx.constraintlayout.core.widgets.ConstraintAnchor getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    int getInputFormats;
    androidx.constraintlayout.core.widgets.ConstraintAnchor getInputSizeshNQ4ISI;
    int getOutputFormats;
    int getOutputMinFrameDuration;
    boolean getOutputMinFrameDurationlomOqCM;
    int getOutputSizes;
    int getOutputSizeshNQ4ISI;
    float getOutputStallDuration;
    boolean getOutputStallDurationlomOqCM;
    androidx.constraintlayout.core.widgets.ConstraintWidget getValidOutputFormatsForInputhNQ4ISI;
    public androidx.constraintlayout.core.widgets.analyzer.ChainRun horizontalChainRun;
    public int horizontalGroup;
    private int init;
    int isOutputSupportedFor;
    boolean isOutputSupportedForhNQ4ISI;
    public boolean[] isTerminalWidget;
    private java.lang.String kernelVersion;
    private int[] l;
    protected java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> mAnchors;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor mBaseline;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor mBottom;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor mCenter;
    public float mCircleConstraintAngle;
    public float mDimensionRatio;
    protected int mDimensionRatioSide;
    public int mHorizontalResolution;
    public androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun mHorizontalRun;
    public boolean mIsHeightWrapContent;
    public boolean mIsWidthWrapContent;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor mLeft;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor[] mListAnchors;
    public androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[] mListDimensionBehaviors;
    protected androidx.constraintlayout.core.widgets.ConstraintWidget[] mListNextMatchConstraintsWidget;
    public int mMatchConstraintDefaultHeight;
    public int mMatchConstraintDefaultWidth;
    public int mMatchConstraintMaxHeight;
    public int mMatchConstraintMaxWidth;
    public int mMatchConstraintMinHeight;
    public int mMatchConstraintMinWidth;
    public float mMatchConstraintPercentHeight;
    public float mMatchConstraintPercentWidth;
    protected int mMinHeight;
    protected int mMinWidth;
    protected androidx.constraintlayout.core.widgets.ConstraintWidget[] mNextChainWidget;
    protected int mOffsetX;
    protected int mOffsetY;
    public androidx.constraintlayout.core.widgets.ConstraintWidget mParent;
    public int[] mResolvedMatchConstraintDefault;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor mRight;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor mTop;
    public int mVerticalResolution;
    public androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun mVerticalRun;
    public float[] mWeight;
    protected int mX;
    protected int mY;
    public boolean measured;
    private boolean release;
    private boolean requestGoOnline;
    private int requestPINEntry;
    private boolean resetTransaction;
    private boolean rsaCipher;
    public androidx.constraintlayout.core.widgets.analyzer.WidgetRun[] run;
    private boolean sha1;
    private int startTransaction;
    public java.lang.String stringId;
    int toString;
    boolean unwrapAs;
    private boolean updateUI;
    private int version;
    public androidx.constraintlayout.core.widgets.analyzer.ChainRun verticalChainRun;
    public int verticalGroup;

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public androidx.constraintlayout.core.widgets.analyzer.WidgetRun getRun(int i) {
        if (i == 0) {
            return this.mHorizontalRun;
        }
        if (i == 1) {
            return this.mVerticalRun;
        }
        return null;
    }

    public void setFinalFrame(int i, int i2, int i3, int i4, int i5, int i6) {
        setFrame(i, i2, i3, i4);
        setBaselineDistance(i5);
        if (i6 == 0) {
            this.rsaCipher = true;
            this.sha1 = false;
        } else if (i6 == 1) {
            this.rsaCipher = false;
            this.sha1 = true;
        } else if (i6 == 2) {
            this.rsaCipher = true;
            this.sha1 = true;
        } else {
            this.rsaCipher = false;
            this.sha1 = false;
        }
    }

    public void setFinalLeft(int i) {
        this.mLeft.setFinalValue(i);
        this.mX = i;
    }

    public void setFinalTop(int i) {
        this.mTop.setFinalValue(i);
        this.mY = i;
    }

    public void resetSolvingPassFlag() {
        this.release = false;
        this.AMEXKernelJNI = false;
    }

    public boolean isHorizontalSolvingPassDone() {
        return this.release;
    }

    public boolean isVerticalSolvingPassDone() {
        return this.AMEXKernelJNI;
    }

    public void markHorizontalSolvingPassDone() {
        this.release = true;
    }

    public void markVerticalSolvingPassDone() {
        this.AMEXKernelJNI = true;
    }

    public void setFinalHorizontal(int i, int i2) {
        if (this.rsaCipher) {
            return;
        }
        this.mLeft.setFinalValue(i);
        this.mRight.setFinalValue(i2);
        this.mX = i;
        this.d = i2 - i;
        this.rsaCipher = true;
    }

    public void setFinalVertical(int i, int i2) {
        if (this.sha1) {
            return;
        }
        this.mTop.setFinalValue(i);
        this.mBottom.setFinalValue(i2);
        this.mY = i;
        this.getOutputSizeshNQ4ISI = i2 - i;
        if (this.c) {
            this.mBaseline.setFinalValue(i + this.getHighSpeedVideoFpsRangesFor);
        }
        this.sha1 = true;
    }

    public void setFinalBaseline(int i) {
        if (this.c) {
            int i2 = i - this.getHighSpeedVideoFpsRangesFor;
            int i3 = this.getOutputSizeshNQ4ISI;
            this.mY = i2;
            this.mTop.setFinalValue(i2);
            this.mBottom.setFinalValue(i3 + i2);
            this.mBaseline.setFinalValue(i);
            this.sha1 = true;
        }
    }

    public boolean isResolvedHorizontally() {
        if (this.rsaCipher) {
            return true;
        }
        return this.mLeft.hasFinalValue() && this.mRight.hasFinalValue();
    }

    public boolean isResolvedVertically() {
        if (this.sha1) {
            return true;
        }
        return this.mTop.hasFinalValue() && this.mBottom.hasFinalValue();
    }

    public void resetFinalResolution() {
        this.rsaCipher = false;
        this.sha1 = false;
        this.release = false;
        this.AMEXKernelJNI = false;
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            this.mAnchors.get(i).resetFinalResolution();
        }
    }

    public void ensureMeasureRequested() {
        this.requestGoOnline = true;
    }

    public boolean hasDependencies() {
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            if (this.mAnchors.get(i).hasDependents()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasDanglingDimension(int i) {
        if (i == 0) {
            return (this.mLeft.mTarget != null ? 1 : 0) + (this.mRight.mTarget != null ? 1 : 0) < 2;
        }
        return ((this.mTop.mTarget != null ? 1 : 0) + (this.mBottom.mTarget != null ? 1 : 0)) + (this.mBaseline.mTarget != null ? 1 : 0) < 2;
    }

    public boolean hasResolvedTargets(int i, int i2) {
        if (i == 0) {
            if (this.mLeft.mTarget != null && this.mLeft.mTarget.hasFinalValue() && this.mRight.mTarget != null && this.mRight.mTarget.hasFinalValue()) {
                return (this.mRight.mTarget.getFinalValue() - this.mRight.getMargin()) - (this.mLeft.mTarget.getFinalValue() + this.mLeft.getMargin()) >= i2;
            }
        } else if (this.mTop.mTarget != null && this.mTop.mTarget.hasFinalValue() && this.mBottom.mTarget != null && this.mBottom.mTarget.hasFinalValue()) {
            if ((this.mBottom.mTarget.getFinalValue() - this.mBottom.getMargin()) - (this.mTop.mTarget.getFinalValue() + this.mTop.getMargin()) >= i2) {
                return true;
            }
        }
        return false;
    }

    public boolean isInVirtualLayout() {
        return this.exchange;
    }

    public void setInVirtualLayout(boolean z) {
        this.exchange = z;
    }

    public int getMaxHeight() {
        return this.l[1];
    }

    public int getMaxWidth() {
        return this.l[0];
    }

    public void setMaxWidth(int i) {
        this.l[0] = i;
    }

    public void setMaxHeight(int i) {
        this.l[1] = i;
    }

    public boolean isSpreadWidth() {
        return this.mMatchConstraintDefaultWidth == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinWidth == 0 && this.mMatchConstraintMaxWidth == 0 && this.mListDimensionBehaviors[0] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean isSpreadHeight() {
        return this.mMatchConstraintDefaultHeight == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinHeight == 0 && this.mMatchConstraintMaxHeight == 0 && this.mListDimensionBehaviors[1] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public void setHasBaseline(boolean z) {
        this.c = z;
    }

    public boolean getHasBaseline() {
        return this.c;
    }

    public boolean isInPlaceholder() {
        return this.resetTransaction;
    }

    public void setInPlaceholder(boolean z) {
        this.resetTransaction = z;
    }

    protected void setInBarrier(int i, boolean z) {
        this.AMEXKernela[i] = z;
    }

    public boolean isInBarrier(int i) {
        return this.AMEXKernela[i];
    }

    public void setMeasureRequested(boolean z) {
        this.requestGoOnline = z;
    }

    public boolean isMeasureRequested() {
        return this.requestGoOnline && this.free != 8;
    }

    public void setWrapBehaviorInParent(int i) {
        if (i < 0 || i > 3) {
            return;
        }
        this.AMEXKernelProvider = i;
    }

    public int getWrapBehaviorInParent() {
        return this.AMEXKernelProvider;
    }

    public int getLastHorizontalMeasureSpec() {
        return this.startTransaction;
    }

    public int getLastVerticalMeasureSpec() {
        return this.requestPINEntry;
    }

    public void setLastMeasureSpec(int i, int i2) {
        this.startTransaction = i;
        this.requestPINEntry = i2;
        setMeasureRequested(false);
    }

    public void reset() {
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.getHighSpeedVideoSizes.reset();
        this.getInputSizeshNQ4ISI.reset();
        this.mCenter.reset();
        this.mParent = null;
        this.mCircleConstraintAngle = Float.NaN;
        this.d = 0;
        this.getOutputSizeshNQ4ISI = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        float f = DEFAULT_BIAS;
        this.getOutputStallDuration = f;
        this.b = f;
        this.mListDimensionBehaviors[0] = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors[1] = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.init = 0;
        this.free = 0;
        this.freeTransaction = null;
        this.isOutputSupportedForhNQ4ISI = false;
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = false;
        this.getOutputSizes = 0;
        this.f2724a = 0;
        this.getOutputMinFrameDurationlomOqCM = false;
        this._CREATION = false;
        float[] fArr = this.mWeight;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        int[] iArr = this.l;
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
        this.accessartificialFrame = false;
        this.coroutineCreation = -1;
        this.ArtificialStackFrames = 1.0f;
        this.getOutputStallDurationlomOqCM = false;
        boolean[] zArr = this.isTerminalWidget;
        zArr[0] = true;
        zArr[1] = true;
        this.exchange = false;
        boolean[] zArr2 = this.AMEXKernela;
        zArr2[0] = false;
        zArr2[1] = false;
        this.requestGoOnline = true;
        int[] iArr2 = this.mResolvedMatchConstraintDefault;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.version = -1;
        this.AMEXKernel = -1;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.StringBuilder sb, java.lang.String str, androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.mTarget == null) {
            return;
        }
        sb.append(str);
        sb.append(" : [ '");
        sb.append(constraintAnchor.mTarget);
        sb.append("',");
        sb.append(constraintAnchor.mMargin);
        sb.append(",");
        sb.append(constraintAnchor.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(",");
        sb.append(" ] ,\n");
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.StringBuilder sb, java.lang.String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    private static void Camera2StreamConfigurationMap(java.lang.StringBuilder sb, java.lang.String str, int i, int i2) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.StringBuilder sb, java.lang.String str, float f, int i) {
        if (f == 0.0f) {
            return;
        }
        sb.append(str);
        sb.append(" :  [");
        sb.append(f);
        sb.append(",");
        sb.append(i);
        sb.append("],\n");
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.StringBuilder sb, java.lang.String str, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2) {
        sb.append(str);
        sb.append(" :  {\n");
        Camera2StreamConfigurationMap(sb, io.ktor.http.ContentDisposition.Parameters.Size, i, Integer.MIN_VALUE);
        Camera2StreamConfigurationMap(sb, com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, i2, 0);
        Camera2StreamConfigurationMap(sb, com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, i3, Integer.MAX_VALUE);
        Camera2StreamConfigurationMap(sb, "matchMin", i5, 0);
        Camera2StreamConfigurationMap(sb, "matchDef", i6, 0);
        Camera2StreamConfigurationMap(sb, "matchPercent", i6, 1);
        getHighResolutionOutputSizeshNQ4ISI(sb, "matchConstraintPercent", f, 1.0f);
        getHighResolutionOutputSizeshNQ4ISI(sb, "weight", f2, 1.0f);
        Camera2StreamConfigurationMap(sb, "override", i4, 1);
        sb.append("},\n");
    }

    public java.lang.StringBuilder serialize(java.lang.StringBuilder sb) {
        sb.append("{\n");
        getHighResolutionOutputSizeshNQ4ISI(sb, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, this.mLeft);
        getHighResolutionOutputSizeshNQ4ISI(sb, com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, this.mTop);
        getHighResolutionOutputSizeshNQ4ISI(sb, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, this.mRight);
        getHighResolutionOutputSizeshNQ4ISI(sb, com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, this.mBottom);
        getHighResolutionOutputSizeshNQ4ISI(sb, "baseline", this.mBaseline);
        getHighResolutionOutputSizeshNQ4ISI(sb, "centerX", this.getHighSpeedVideoSizes);
        getHighResolutionOutputSizeshNQ4ISI(sb, "centerY", this.getInputSizeshNQ4ISI);
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor = this.mCenter;
        float f = this.mCircleConstraintAngle;
        if (constraintAnchor.mTarget != null && !java.lang.Float.isNaN(f)) {
            sb.append("circle : [ '");
            sb.append(constraintAnchor.mTarget);
            sb.append("',");
            sb.append(constraintAnchor.mMargin);
            sb.append(",");
            sb.append(f);
            sb.append(",");
            sb.append(" ] ,\n");
        }
        getHighResolutionOutputSizeshNQ4ISI(sb, "width", this.d, this.mMinWidth, this.l[0], this.version, this.mMatchConstraintMinWidth, this.mMatchConstraintDefaultWidth, this.mMatchConstraintPercentWidth, this.mWeight[0]);
        getHighResolutionOutputSizeshNQ4ISI(sb, "height", this.getOutputSizeshNQ4ISI, this.mMinHeight, this.l[1], this.AMEXKernel, this.mMatchConstraintMinHeight, this.mMatchConstraintDefaultHeight, this.mMatchConstraintPercentHeight, this.mWeight[1]);
        getHighSpeedVideoFpsRanges(sb, "dimensionRatio", this.mDimensionRatio, this.mDimensionRatioSide);
        getHighResolutionOutputSizeshNQ4ISI(sb, "horizontalBias", this.getOutputStallDuration, DEFAULT_BIAS);
        getHighResolutionOutputSizeshNQ4ISI(sb, "verticalBias", this.b, DEFAULT_BIAS);
        sb.append("}\n");
        return sb;
    }

    public boolean oppositeDimensionDependsOn(int i) {
        char c = i == 0 ? (char) 1 : (char) 0;
        androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
        return dimensionBehaviourArr[i] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && dimensionBehaviourArr[c] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean oppositeDimensionsTied() {
        return this.mListDimensionBehaviors[0] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.mListDimensionBehaviors[1] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
    }

    public boolean hasDimensionOverride() {
        return (this.version == -1 && this.AMEXKernel == -1) ? false : true;
    }

    public ConstraintWidget() {
        this.measured = false;
        this.run = new androidx.constraintlayout.core.widgets.analyzer.WidgetRun[2];
        this.mHorizontalRun = null;
        this.mVerticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.accessartificialFrame = false;
        this.requestGoOnline = true;
        this.updateUI = false;
        this.AMEXKernelCallback = true;
        this.version = -1;
        this.AMEXKernel = -1;
        this.frame = new androidx.constraintlayout.core.state.WidgetFrame(this);
        this.rsaCipher = false;
        this.sha1 = false;
        this.release = false;
        this.AMEXKernelJNI = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.AMEXKernelProvider = 0;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.coroutineCreation = -1;
        this.ArtificialStackFrames = 1.0f;
        this.l = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = Float.NaN;
        this.c = false;
        this.exchange = false;
        this.startTransaction = 0;
        this.requestPINEntry = 0;
        this.mLeft = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT);
        this.mTop = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP);
        this.mRight = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT);
        this.mBottom = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE);
        this.getHighSpeedVideoSizes = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X);
        this.getInputSizeshNQ4ISI = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y);
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new androidx.constraintlayout.core.widgets.ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new java.util.ArrayList<>();
        this.AMEXKernela = new boolean[2];
        this.mListDimensionBehaviors = new androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[]{androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED};
        this.mParent = null;
        this.d = 0;
        this.getOutputSizeshNQ4ISI = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.isOutputSupportedFor = 0;
        this.toString = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.getHighSpeedVideoFpsRangesFor = 0;
        float f = DEFAULT_BIAS;
        this.getOutputStallDuration = f;
        this.b = f;
        this.init = 0;
        this.free = 0;
        this.Camera2StreamConfigurationMap = false;
        this.kernelVersion = null;
        this.freeTransaction = null;
        this.getOutputStallDurationlomOqCM = false;
        this.getOutputSizes = 0;
        this.f2724a = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new androidx.constraintlayout.core.widgets.ConstraintWidget[]{null, null};
        this.mNextChainWidget = new androidx.constraintlayout.core.widgets.ConstraintWidget[]{null, null};
        this.getValidOutputFormatsForInputhNQ4ISI = null;
        this._BOUNDARY = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        getHighSpeedVideoFpsRangesFor();
    }

    public ConstraintWidget(java.lang.String str) {
        this.measured = false;
        this.run = new androidx.constraintlayout.core.widgets.analyzer.WidgetRun[2];
        this.mHorizontalRun = null;
        this.mVerticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.accessartificialFrame = false;
        this.requestGoOnline = true;
        this.updateUI = false;
        this.AMEXKernelCallback = true;
        this.version = -1;
        this.AMEXKernel = -1;
        this.frame = new androidx.constraintlayout.core.state.WidgetFrame(this);
        this.rsaCipher = false;
        this.sha1 = false;
        this.release = false;
        this.AMEXKernelJNI = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.AMEXKernelProvider = 0;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.coroutineCreation = -1;
        this.ArtificialStackFrames = 1.0f;
        this.l = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = Float.NaN;
        this.c = false;
        this.exchange = false;
        this.startTransaction = 0;
        this.requestPINEntry = 0;
        this.mLeft = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT);
        this.mTop = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP);
        this.mRight = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT);
        this.mBottom = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE);
        this.getHighSpeedVideoSizes = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X);
        this.getInputSizeshNQ4ISI = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y);
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new androidx.constraintlayout.core.widgets.ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new java.util.ArrayList<>();
        this.AMEXKernela = new boolean[2];
        this.mListDimensionBehaviors = new androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[]{androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED};
        this.mParent = null;
        this.d = 0;
        this.getOutputSizeshNQ4ISI = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.isOutputSupportedFor = 0;
        this.toString = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.getHighSpeedVideoFpsRangesFor = 0;
        float f = DEFAULT_BIAS;
        this.getOutputStallDuration = f;
        this.b = f;
        this.init = 0;
        this.free = 0;
        this.Camera2StreamConfigurationMap = false;
        this.kernelVersion = null;
        this.freeTransaction = null;
        this.getOutputStallDurationlomOqCM = false;
        this.getOutputSizes = 0;
        this.f2724a = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new androidx.constraintlayout.core.widgets.ConstraintWidget[]{null, null};
        this.mNextChainWidget = new androidx.constraintlayout.core.widgets.ConstraintWidget[]{null, null};
        this.getValidOutputFormatsForInputhNQ4ISI = null;
        this._BOUNDARY = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        getHighSpeedVideoFpsRangesFor();
        setDebugName(str);
    }

    public ConstraintWidget(int i, int i2, int i3, int i4) {
        this.measured = false;
        this.run = new androidx.constraintlayout.core.widgets.analyzer.WidgetRun[2];
        this.mHorizontalRun = null;
        this.mVerticalRun = null;
        this.isTerminalWidget = new boolean[]{true, true};
        this.accessartificialFrame = false;
        this.requestGoOnline = true;
        this.updateUI = false;
        this.AMEXKernelCallback = true;
        this.version = -1;
        this.AMEXKernel = -1;
        this.frame = new androidx.constraintlayout.core.state.WidgetFrame(this);
        this.rsaCipher = false;
        this.sha1 = false;
        this.release = false;
        this.AMEXKernelJNI = false;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.AMEXKernelProvider = 0;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.coroutineCreation = -1;
        this.ArtificialStackFrames = 1.0f;
        this.l = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.mCircleConstraintAngle = Float.NaN;
        this.c = false;
        this.exchange = false;
        this.startTransaction = 0;
        this.requestPINEntry = 0;
        this.mLeft = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT);
        this.mTop = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP);
        this.mRight = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT);
        this.mBottom = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM);
        this.mBaseline = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE);
        this.getHighSpeedVideoSizes = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X);
        this.getInputSizeshNQ4ISI = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y);
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor = new androidx.constraintlayout.core.widgets.ConstraintAnchor(this, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER);
        this.mCenter = constraintAnchor;
        this.mListAnchors = new androidx.constraintlayout.core.widgets.ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, constraintAnchor};
        this.mAnchors = new java.util.ArrayList<>();
        this.AMEXKernela = new boolean[2];
        this.mListDimensionBehaviors = new androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[]{androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED};
        this.mParent = null;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.isOutputSupportedFor = 0;
        this.toString = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.getHighSpeedVideoFpsRangesFor = 0;
        float f = DEFAULT_BIAS;
        this.getOutputStallDuration = f;
        this.b = f;
        this.init = 0;
        this.free = 0;
        this.Camera2StreamConfigurationMap = false;
        this.kernelVersion = null;
        this.freeTransaction = null;
        this.getOutputStallDurationlomOqCM = false;
        this.getOutputSizes = 0;
        this.f2724a = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new androidx.constraintlayout.core.widgets.ConstraintWidget[]{null, null};
        this.mNextChainWidget = new androidx.constraintlayout.core.widgets.ConstraintWidget[]{null, null};
        this.getValidOutputFormatsForInputhNQ4ISI = null;
        this._BOUNDARY = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        this.mX = i;
        this.mY = i2;
        this.d = i3;
        this.getOutputSizeshNQ4ISI = i4;
        getHighSpeedVideoFpsRangesFor();
    }

    public ConstraintWidget(java.lang.String str, int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4);
        setDebugName(str);
    }

    public ConstraintWidget(int i, int i2) {
        this(0, 0, i, i2);
    }

    public void ensureWidgetRuns() {
        if (this.mHorizontalRun == null) {
            this.mHorizontalRun = new androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun(this);
        }
        if (this.mVerticalRun == null) {
            this.mVerticalRun = new androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun(this);
        }
    }

    public ConstraintWidget(java.lang.String str, int i, int i2) {
        this(i, i2);
        setDebugName(str);
    }

    public void resetSolverVariables(androidx.constraintlayout.core.Cache cache) {
        this.mLeft.resetSolverVariable(cache);
        this.mTop.resetSolverVariable(cache);
        this.mRight.resetSolverVariable(cache);
        this.mBottom.resetSolverVariable(cache);
        this.mBaseline.resetSolverVariable(cache);
        this.mCenter.resetSolverVariable(cache);
        this.getHighSpeedVideoSizes.resetSolverVariable(cache);
        this.getInputSizeshNQ4ISI.resetSolverVariable(cache);
    }

    private void getHighSpeedVideoFpsRangesFor() {
        this.mAnchors.add(this.mLeft);
        this.mAnchors.add(this.mTop);
        this.mAnchors.add(this.mRight);
        this.mAnchors.add(this.mBottom);
        this.mAnchors.add(this.getHighSpeedVideoSizes);
        this.mAnchors.add(this.getInputSizeshNQ4ISI);
        this.mAnchors.add(this.mCenter);
        this.mAnchors.add(this.mBaseline);
    }

    public boolean isRoot() {
        return this.mParent == null;
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getParent() {
        return this.mParent;
    }

    public void setParent(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        this.mParent = constraintWidget;
    }

    public void setWidthWrapContent(boolean z) {
        this.mIsWidthWrapContent = z;
    }

    public boolean isWidthWrapContent() {
        return this.mIsWidthWrapContent;
    }

    public void setHeightWrapContent(boolean z) {
        this.mIsHeightWrapContent = z;
    }

    public boolean isHeightWrapContent() {
        return this.mIsHeightWrapContent;
    }

    public void connectCircularConstraint(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, float f, int i) {
        immediateConnect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER, constraintWidget, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER, i, 0);
        this.mCircleConstraintAngle = f;
    }

    public java.lang.String getType() {
        return this.freeTransaction;
    }

    public void setType(java.lang.String str) {
        this.freeTransaction = str;
    }

    public void setVisibility(int i) {
        this.free = i;
    }

    public int getVisibility() {
        return this.free;
    }

    public void setAnimated(boolean z) {
        this.Camera2StreamConfigurationMap = z;
    }

    public boolean isAnimated() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.lang.String getDebugName() {
        return this.kernelVersion;
    }

    public void setDebugName(java.lang.String str) {
        this.kernelVersion = str;
    }

    public void setDebugSolverName(androidx.constraintlayout.core.LinearSystem linearSystem, java.lang.String str) {
        this.kernelVersion = str;
        androidx.constraintlayout.core.SolverVariable createObjectVariable = linearSystem.createObjectVariable(this.mLeft);
        androidx.constraintlayout.core.SolverVariable createObjectVariable2 = linearSystem.createObjectVariable(this.mTop);
        androidx.constraintlayout.core.SolverVariable createObjectVariable3 = linearSystem.createObjectVariable(this.mRight);
        androidx.constraintlayout.core.SolverVariable createObjectVariable4 = linearSystem.createObjectVariable(this.mBottom);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(".left");
        createObjectVariable.setName(sb.toString());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append(".top");
        createObjectVariable2.setName(sb2.toString());
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(str);
        sb3.append(".right");
        createObjectVariable3.setName(sb3.toString());
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(str);
        sb4.append(".bottom");
        createObjectVariable4.setName(sb4.toString());
        androidx.constraintlayout.core.SolverVariable createObjectVariable5 = linearSystem.createObjectVariable(this.mBaseline);
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
        sb5.append(str);
        sb5.append(".baseline");
        createObjectVariable5.setName(sb5.toString());
    }

    public void createObjectVariables(androidx.constraintlayout.core.LinearSystem linearSystem) {
        linearSystem.createObjectVariable(this.mLeft);
        linearSystem.createObjectVariable(this.mTop);
        linearSystem.createObjectVariable(this.mRight);
        linearSystem.createObjectVariable(this.mBottom);
        if (this.getHighSpeedVideoFpsRangesFor > 0) {
            linearSystem.createObjectVariable(this.mBaseline);
        }
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String str2 = "";
        if (this.freeTransaction != null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("type: ");
            sb2.append(this.freeTransaction);
            sb2.append(" ");
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        if (this.kernelVersion != null) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("id: ");
            sb3.append(this.kernelVersion);
            sb3.append(" ");
            str2 = sb3.toString();
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.mX);
        sb.append(", ");
        sb.append(this.mY);
        sb.append(") - (");
        sb.append(this.d);
        sb.append(" x ");
        sb.append(this.getOutputSizeshNQ4ISI);
        sb.append(")");
        return sb.toString();
    }

    public int getX() {
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.mParent;
        if (constraintWidget != null && (constraintWidget instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer)) {
            return ((androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) constraintWidget).init + this.mX;
        }
        return this.mX;
    }

    public int getY() {
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.mParent;
        if (constraintWidget != null && (constraintWidget instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer)) {
            return ((androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) constraintWidget).release + this.mY;
        }
        return this.mY;
    }

    public int getWidth() {
        if (this.free == 8) {
            return 0;
        }
        return this.d;
    }

    public int getOptimizerWrapWidth() {
        int i = this.d;
        int i2 = 0;
        if (this.mListDimensionBehaviors[0] != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            return i;
        }
        if (this.mMatchConstraintDefaultWidth == 1) {
            i2 = java.lang.Math.max(this.mMatchConstraintMinWidth, i);
        } else {
            int i3 = this.mMatchConstraintMinWidth;
            if (i3 > 0) {
                this.d = i3;
                i2 = i3;
            }
        }
        int i4 = this.mMatchConstraintMaxWidth;
        return (i4 <= 0 || i4 >= i2) ? i2 : i4;
    }

    public int getOptimizerWrapHeight() {
        int i = this.getOutputSizeshNQ4ISI;
        if (this.mListDimensionBehaviors[1] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            if (this.mMatchConstraintDefaultHeight == 1) {
                i = java.lang.Math.max(this.mMatchConstraintMinHeight, i);
            } else {
                i = this.mMatchConstraintMinHeight;
                if (i > 0) {
                    this.getOutputSizeshNQ4ISI = i;
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

    public int getHeight() {
        if (this.free == 8) {
            return 0;
        }
        return this.getOutputSizeshNQ4ISI;
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

    protected int getRootX() {
        return this.mX + this.mOffsetX;
    }

    protected int getRootY() {
        return this.mY + this.mOffsetY;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getLeft() {
        return getX();
    }

    public int getTop() {
        return getY();
    }

    public int getRight() {
        return getX() + this.d;
    }

    public int getBottom() {
        return getY() + this.getOutputSizeshNQ4ISI;
    }

    public int getHorizontalMargin() {
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor = this.mLeft;
        int i = constraintAnchor != null ? constraintAnchor.mMargin : 0;
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor2 = this.mRight;
        return constraintAnchor2 != null ? i + constraintAnchor2.mMargin : i;
    }

    public int getVerticalMargin() {
        int i = this.mLeft != null ? this.mTop.mMargin : 0;
        return this.mRight != null ? i + this.mBottom.mMargin : i;
    }

    public float getHorizontalBiasPercent() {
        return this.getOutputStallDuration;
    }

    public float getVerticalBiasPercent() {
        return this.b;
    }

    public float getBiasPercent(int i) {
        if (i == 0) {
            return this.getOutputStallDuration;
        }
        if (i == 1) {
            return this.b;
        }
        return -1.0f;
    }

    public boolean hasBaseline() {
        return this.c;
    }

    public int getBaselineDistance() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.lang.Object getCompanionWidget() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> getAnchors() {
        return this.mAnchors;
    }

    public void setX(int i) {
        this.mX = i;
    }

    public void setY(int i) {
        this.mY = i;
    }

    public void setOrigin(int i, int i2) {
        this.mX = i;
        this.mY = i2;
    }

    public void setOffset(int i, int i2) {
        this.mOffsetX = i;
        this.mOffsetY = i2;
    }

    /* renamed from: androidx.constraintlayout.core.widgets.ConstraintWidget$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
        }
    }

    public void setGoneMargin(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type type, int i) {
        int i2 = androidx.constraintlayout.core.widgets.ConstraintWidget.AnonymousClass1.getHighSpeedVideoFpsRanges[type.ordinal()];
        if (i2 == 1) {
            this.mLeft.getHighResolutionOutputSizeshNQ4ISI = i;
            return;
        }
        if (i2 == 2) {
            this.mTop.getHighResolutionOutputSizeshNQ4ISI = i;
            return;
        }
        if (i2 == 3) {
            this.mRight.getHighResolutionOutputSizeshNQ4ISI = i;
        } else if (i2 == 4) {
            this.mBottom.getHighResolutionOutputSizeshNQ4ISI = i;
        } else {
            if (i2 != 5) {
                return;
            }
            this.mBaseline.getHighResolutionOutputSizeshNQ4ISI = i;
        }
    }

    public void setWidth(int i) {
        this.d = i;
        int i2 = this.mMinWidth;
        if (i < i2) {
            this.d = i2;
        }
    }

    public void setHeight(int i) {
        this.getOutputSizeshNQ4ISI = i;
        int i2 = this.mMinHeight;
        if (i < i2) {
            this.getOutputSizeshNQ4ISI = i2;
        }
    }

    public void setLength(int i, int i2) {
        if (i2 == 0) {
            setWidth(i);
        } else if (i2 == 1) {
            setHeight(i);
        }
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

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0082 -> B:31:0x0083). Please report as a decompilation issue!!! */
    public void setDimensionRatio(java.lang.String str) {
        float f;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.mDimensionRatio = 0.0f;
            return;
        }
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i2 = -1;
        int i3 = 0;
        if (indexOf > 0 && indexOf < length - 1) {
            java.lang.String substring = str.substring(0, indexOf);
            if (substring.equalsIgnoreCase("W")) {
                i2 = 0;
            } else if (substring.equalsIgnoreCase("H")) {
                i2 = 1;
            }
            i3 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 >= 0 && indexOf2 < length - 1) {
            java.lang.String substring2 = str.substring(i3, indexOf2);
            java.lang.String substring3 = str.substring(indexOf2 + 1);
            if (substring2.length() > 0 && substring3.length() > 0) {
                float parseFloat = java.lang.Float.parseFloat(substring2);
                float parseFloat2 = java.lang.Float.parseFloat(substring3);
                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                    if (i2 == 1) {
                        f = java.lang.Math.abs(parseFloat2 / parseFloat);
                    } else {
                        f = java.lang.Math.abs(parseFloat / parseFloat2);
                    }
                }
            }
            f = i;
        } else {
            java.lang.String substring4 = str.substring(i3);
            if (substring4.length() > 0) {
                f = java.lang.Float.parseFloat(substring4);
            }
            f = i;
        }
        i = (f > i ? 1 : (f == i ? 0 : -1));
        if (i > 0) {
            this.mDimensionRatio = f;
            this.mDimensionRatioSide = i2;
        }
    }

    public void setDimensionRatio(float f, int i) {
        this.mDimensionRatio = f;
        this.mDimensionRatioSide = i;
    }

    public float getDimensionRatio() {
        return this.mDimensionRatio;
    }

    public int getDimensionRatioSide() {
        return this.mDimensionRatioSide;
    }

    public void setHorizontalBiasPercent(float f) {
        this.getOutputStallDuration = f;
    }

    public void setVerticalBiasPercent(float f) {
        this.b = f;
    }

    public void setMinWidth(int i) {
        if (i < 0) {
            this.mMinWidth = 0;
        } else {
            this.mMinWidth = i;
        }
    }

    public void setMinHeight(int i) {
        if (i < 0) {
            this.mMinHeight = 0;
        } else {
            this.mMinHeight = i;
        }
    }

    public void setDimension(int i, int i2) {
        this.d = i;
        int i3 = this.mMinWidth;
        if (i < i3) {
            this.d = i3;
        }
        this.getOutputSizeshNQ4ISI = i2;
        int i4 = this.mMinHeight;
        if (i2 < i4) {
            this.getOutputSizeshNQ4ISI = i4;
        }
    }

    public void setFrame(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.mX = i;
        this.mY = i2;
        if (this.free == 8) {
            this.d = 0;
            this.getOutputSizeshNQ4ISI = 0;
            return;
        }
        if (this.mListDimensionBehaviors[0] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED && i7 < (i6 = this.d)) {
            i7 = i6;
        }
        if (this.mListDimensionBehaviors[1] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED && i8 < (i5 = this.getOutputSizeshNQ4ISI)) {
            i8 = i5;
        }
        this.d = i7;
        this.getOutputSizeshNQ4ISI = i8;
        int i9 = this.mMinHeight;
        if (i8 < i9) {
            this.getOutputSizeshNQ4ISI = i9;
        }
        int i10 = this.mMinWidth;
        if (i7 < i10) {
            this.d = i10;
        }
        if (this.mMatchConstraintMaxWidth > 0 && this.mListDimensionBehaviors[0] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            this.d = java.lang.Math.min(this.d, this.mMatchConstraintMaxWidth);
        }
        if (this.mMatchConstraintMaxHeight > 0 && this.mListDimensionBehaviors[1] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            this.getOutputSizeshNQ4ISI = java.lang.Math.min(this.getOutputSizeshNQ4ISI, this.mMatchConstraintMaxHeight);
        }
        int i11 = this.d;
        if (i7 != i11) {
            this.version = i11;
        }
        int i12 = this.getOutputSizeshNQ4ISI;
        if (i8 != i12) {
            this.AMEXKernel = i12;
        }
    }

    public void setFrame(int i, int i2, int i3) {
        if (i3 == 0) {
            setHorizontalDimension(i, i2);
        } else if (i3 == 1) {
            setVerticalDimension(i, i2);
        }
    }

    public void setHorizontalDimension(int i, int i2) {
        this.mX = i;
        int i3 = i2 - i;
        this.d = i3;
        int i4 = this.mMinWidth;
        if (i3 < i4) {
            this.d = i4;
        }
    }

    public void setVerticalDimension(int i, int i2) {
        this.mY = i;
        int i3 = i2 - i;
        this.getOutputSizeshNQ4ISI = i3;
        int i4 = this.mMinHeight;
        if (i3 < i4) {
            this.getOutputSizeshNQ4ISI = i4;
        }
    }

    public void setBaselineDistance(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
        this.c = i > 0;
    }

    public void setCompanionWidget(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
    }

    public void setContainerItemSkip(int i) {
        if (i >= 0) {
            this.init = i;
        } else {
            this.init = 0;
        }
    }

    public int getContainerItemSkip() {
        return this.init;
    }

    public void setHorizontalWeight(float f) {
        this.mWeight[0] = f;
    }

    public void setVerticalWeight(float f) {
        this.mWeight[1] = f;
    }

    public void setHorizontalChainStyle(int i) {
        this.getOutputSizes = i;
    }

    public int getHorizontalChainStyle() {
        return this.getOutputSizes;
    }

    public void setVerticalChainStyle(int i) {
        this.f2724a = i;
    }

    public int getVerticalChainStyle() {
        return this.f2724a;
    }

    public boolean allowedInBarrier() {
        return this.free != 8;
    }

    public void immediateConnect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type type, androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type type2, int i, int i2) {
        getAnchor(type).connect(constraintWidget.getAnchor(type2), i, i2, true);
    }

    public void connect(androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor2, int i) {
        if (constraintAnchor.getOwner() == this) {
            connect(constraintAnchor.getType(), constraintAnchor2.getOwner(), constraintAnchor2.getType(), i);
        }
    }

    public void connect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type type, androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type type2) {
        connect(type, constraintWidget, type2, 0);
    }

    public void connect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type type, androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type type2, int i) {
        boolean z;
        if (type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER) {
            if (type2 == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER) {
                androidx.constraintlayout.core.widgets.ConstraintAnchor anchor = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT);
                androidx.constraintlayout.core.widgets.ConstraintAnchor anchor2 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT);
                androidx.constraintlayout.core.widgets.ConstraintAnchor anchor3 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP);
                androidx.constraintlayout.core.widgets.ConstraintAnchor anchor4 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM);
                boolean z2 = true;
                if ((anchor == null || !anchor.isConnected()) && (anchor2 == null || !anchor2.isConnected())) {
                    connect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT, constraintWidget, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT, 0);
                    connect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT, constraintWidget, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT, 0);
                    z = true;
                } else {
                    z = false;
                }
                if ((anchor3 == null || !anchor3.isConnected()) && (anchor4 == null || !anchor4.isConnected())) {
                    connect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP, constraintWidget, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP, 0);
                    connect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM, constraintWidget, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM, 0);
                } else {
                    z2 = false;
                }
                if (z && z2) {
                    getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER).connect(constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER), 0);
                    return;
                } else if (z) {
                    getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X).connect(constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X), 0);
                    return;
                } else {
                    if (z2) {
                        getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y).connect(constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y), 0);
                        return;
                    }
                    return;
                }
            }
            if (type2 == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT || type2 == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT) {
                connect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT, constraintWidget, type2, 0);
                connect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
                getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER).connect(constraintWidget.getAnchor(type2), 0);
                return;
            } else {
                if (type2 == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP || type2 == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM) {
                    connect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP, constraintWidget, type2, 0);
                    connect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                    getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER).connect(constraintWidget.getAnchor(type2), 0);
                    return;
                }
                return;
            }
        }
        if (type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X && (type2 == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT || type2 == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT)) {
            androidx.constraintlayout.core.widgets.ConstraintAnchor anchor5 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT);
            androidx.constraintlayout.core.widgets.ConstraintAnchor anchor6 = constraintWidget.getAnchor(type2);
            androidx.constraintlayout.core.widgets.ConstraintAnchor anchor7 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT);
            anchor5.connect(anchor6, 0);
            anchor7.connect(anchor6, 0);
            getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X).connect(anchor6, 0);
            return;
        }
        if (type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y && (type2 == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP || type2 == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM)) {
            androidx.constraintlayout.core.widgets.ConstraintAnchor anchor8 = constraintWidget.getAnchor(type2);
            getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP).connect(anchor8, 0);
            getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM).connect(anchor8, 0);
            getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y).connect(anchor8, 0);
            return;
        }
        if (type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X && type2 == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X) {
            getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT).connect(constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT), 0);
            getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT).connect(constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT), 0);
            getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X).connect(constraintWidget.getAnchor(type2), 0);
            return;
        }
        if (type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y && type2 == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y) {
            getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP).connect(constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP), 0);
            getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM).connect(constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM), 0);
            getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y).connect(constraintWidget.getAnchor(type2), 0);
            return;
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor9 = getAnchor(type);
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor10 = constraintWidget.getAnchor(type2);
        if (anchor9.isValidConnection(anchor10)) {
            if (type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE) {
                androidx.constraintlayout.core.widgets.ConstraintAnchor anchor11 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP);
                androidx.constraintlayout.core.widgets.ConstraintAnchor anchor12 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM);
                if (anchor11 != null) {
                    anchor11.reset();
                }
                if (anchor12 != null) {
                    anchor12.reset();
                }
            } else if (type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP || type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM) {
                androidx.constraintlayout.core.widgets.ConstraintAnchor anchor13 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE);
                if (anchor13 != null) {
                    anchor13.reset();
                }
                androidx.constraintlayout.core.widgets.ConstraintAnchor anchor14 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER);
                if (anchor14.getTarget() != anchor10) {
                    anchor14.reset();
                }
                androidx.constraintlayout.core.widgets.ConstraintAnchor opposite = getAnchor(type).getOpposite();
                androidx.constraintlayout.core.widgets.ConstraintAnchor anchor15 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y);
                if (anchor15.isConnected()) {
                    opposite.reset();
                    anchor15.reset();
                }
            } else if (type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT || type == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT) {
                androidx.constraintlayout.core.widgets.ConstraintAnchor anchor16 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER);
                if (anchor16.getTarget() != anchor10) {
                    anchor16.reset();
                }
                androidx.constraintlayout.core.widgets.ConstraintAnchor opposite2 = getAnchor(type).getOpposite();
                androidx.constraintlayout.core.widgets.ConstraintAnchor anchor17 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X);
                if (anchor17.isConnected()) {
                    opposite2.reset();
                    anchor17.reset();
                }
            }
            anchor9.connect(anchor10, i);
        }
    }

    public void resetAllConstraints() {
        resetAnchors();
        setVerticalBiasPercent(DEFAULT_BIAS);
        setHorizontalBiasPercent(DEFAULT_BIAS);
    }

    public void resetAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor) {
        if (getParent() != null && (getParent() instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) && ((androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            return;
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT);
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor2 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT);
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor3 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP);
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor4 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM);
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor5 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER);
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor6 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X);
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor7 = getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y);
        if (constraintAnchor == anchor5) {
            if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                anchor.reset();
                anchor2.reset();
            }
            if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
                anchor3.reset();
                anchor4.reset();
            }
            this.getOutputStallDuration = 0.5f;
            this.b = 0.5f;
        } else if (constraintAnchor == anchor6) {
            if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget().getOwner() == anchor2.getTarget().getOwner()) {
                anchor.reset();
                anchor2.reset();
            }
            this.getOutputStallDuration = 0.5f;
        } else if (constraintAnchor == anchor7) {
            if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget().getOwner() == anchor4.getTarget().getOwner()) {
                anchor3.reset();
                anchor4.reset();
            }
            this.b = 0.5f;
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
        androidx.constraintlayout.core.widgets.ConstraintWidget parent = getParent();
        if (parent != null && (parent instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) && ((androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) getParent()).handlesInternalConstraints()) {
            return;
        }
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            this.mAnchors.get(i).reset();
        }
    }

    public androidx.constraintlayout.core.widgets.ConstraintAnchor getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type type) {
        switch (androidx.constraintlayout.core.widgets.ConstraintWidget.AnonymousClass1.getHighSpeedVideoFpsRanges[type.ordinal()]) {
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
                return this.getHighSpeedVideoSizes;
            case 8:
                return this.getInputSizeshNQ4ISI;
            case 9:
                return null;
            default:
                throw new java.lang.AssertionError(type.name());
        }
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour getHorizontalDimensionBehaviour() {
        return this.mListDimensionBehaviors[0];
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour getVerticalDimensionBehaviour() {
        return this.mListDimensionBehaviors[1];
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour getDimensionBehaviour(int i) {
        if (i == 0) {
            return getHorizontalDimensionBehaviour();
        }
        if (i == 1) {
            return getVerticalDimensionBehaviour();
        }
        return null;
    }

    public void setHorizontalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[0] = dimensionBehaviour;
    }

    public void setVerticalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour) {
        this.mListDimensionBehaviors[1] = dimensionBehaviour;
    }

    public boolean isInHorizontalChain() {
        if (this.mLeft.mTarget == null || this.mLeft.mTarget.mTarget != this.mLeft) {
            return this.mRight.mTarget != null && this.mRight.mTarget.mTarget == this.mRight;
        }
        return true;
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getPreviousChainMember(int i) {
        if (i == 0) {
            if (this.mLeft.mTarget == null) {
                return null;
            }
            androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor = this.mLeft.mTarget.mTarget;
            androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor2 = this.mLeft;
            if (constraintAnchor == constraintAnchor2) {
                return constraintAnchor2.mTarget.mOwner;
            }
            return null;
        }
        if (i != 1 || this.mTop.mTarget == null) {
            return null;
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor3 = this.mTop.mTarget.mTarget;
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor4 = this.mTop;
        if (constraintAnchor3 == constraintAnchor4) {
            return constraintAnchor4.mTarget.mOwner;
        }
        return null;
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getNextChainMember(int i) {
        if (i == 0) {
            if (this.mRight.mTarget == null) {
                return null;
            }
            androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor = this.mRight.mTarget.mTarget;
            androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor2 = this.mRight;
            if (constraintAnchor == constraintAnchor2) {
                return constraintAnchor2.mTarget.mOwner;
            }
            return null;
        }
        if (i != 1 || this.mBottom.mTarget == null) {
            return null;
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor3 = this.mBottom.mTarget.mTarget;
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor4 = this.mBottom;
        if (constraintAnchor3 == constraintAnchor4) {
            return constraintAnchor4.mTarget.mOwner;
        }
        return null;
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getHorizontalChainControlWidget() {
        if (!isInHorizontalChain()) {
            return null;
        }
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            androidx.constraintlayout.core.widgets.ConstraintAnchor anchor = constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT);
            androidx.constraintlayout.core.widgets.ConstraintAnchor target = anchor == null ? null : anchor.getTarget();
            androidx.constraintlayout.core.widgets.ConstraintWidget owner = target == null ? null : target.getOwner();
            if (owner == getParent()) {
                return constraintWidget;
            }
            androidx.constraintlayout.core.widgets.ConstraintAnchor target2 = owner == null ? null : owner.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT).getTarget();
            if (target2 == null || target2.getOwner() == constraintWidget) {
                constraintWidget = owner;
            } else {
                constraintWidget2 = constraintWidget;
            }
        }
        return constraintWidget2;
    }

    public boolean isInVerticalChain() {
        if (this.mTop.mTarget == null || this.mTop.mTarget.mTarget != this.mTop) {
            return this.mBottom.mTarget != null && this.mBottom.mTarget.mTarget == this.mBottom;
        }
        return true;
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getVerticalChainControlWidget() {
        if (!isInVerticalChain()) {
            return null;
        }
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = null;
        while (constraintWidget2 == null && constraintWidget != null) {
            androidx.constraintlayout.core.widgets.ConstraintAnchor anchor = constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP);
            androidx.constraintlayout.core.widgets.ConstraintAnchor target = anchor == null ? null : anchor.getTarget();
            androidx.constraintlayout.core.widgets.ConstraintWidget owner = target == null ? null : target.getOwner();
            if (owner == getParent()) {
                return constraintWidget;
            }
            androidx.constraintlayout.core.widgets.ConstraintAnchor target2 = owner == null ? null : owner.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM).getTarget();
            if (target2 == null || target2.getOwner() == constraintWidget) {
                constraintWidget = owner;
            } else {
                constraintWidget2 = constraintWidget;
            }
        }
        return constraintWidget2;
    }

    private boolean getHighSpeedVideoFpsRanges(int i) {
        int i2 = i * 2;
        if (this.mListAnchors[i2].mTarget == null) {
            return false;
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor = this.mListAnchors[i2].mTarget.mTarget;
        androidx.constraintlayout.core.widgets.ConstraintAnchor[] constraintAnchorArr = this.mListAnchors;
        if (constraintAnchor == constraintAnchorArr[i2]) {
            return false;
        }
        int i3 = i2 + 1;
        return constraintAnchorArr[i3].mTarget != null && this.mListAnchors[i3].mTarget.mTarget == this.mListAnchors[i3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0526 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:244:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b8  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void addToSolver(androidx.constraintlayout.core.LinearSystem linearSystem, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2;
        boolean z5;
        boolean z6;
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z7;
        int i10;
        boolean z8;
        boolean z9;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        androidx.constraintlayout.core.SolverVariable solverVariable;
        androidx.constraintlayout.core.SolverVariable solverVariable2;
        androidx.constraintlayout.core.SolverVariable solverVariable3;
        androidx.constraintlayout.core.SolverVariable solverVariable4;
        androidx.constraintlayout.core.SolverVariable solverVariable5;
        androidx.constraintlayout.core.LinearSystem linearSystem2;
        androidx.constraintlayout.core.SolverVariable solverVariable6;
        androidx.constraintlayout.core.SolverVariable solverVariable7;
        androidx.constraintlayout.core.SolverVariable solverVariable8;
        int i12;
        int i13;
        ?? r11;
        int i14;
        androidx.constraintlayout.core.SolverVariable solverVariable9;
        androidx.constraintlayout.core.SolverVariable solverVariable10;
        boolean z15;
        boolean z16;
        androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun verticalWidgetRun;
        boolean z17;
        androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun horizontalWidgetRun;
        int i15;
        int i16;
        boolean isInHorizontalChain;
        boolean isInVerticalChain;
        androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun horizontalWidgetRun2;
        boolean[] zArr;
        androidx.constraintlayout.core.SolverVariable createObjectVariable = linearSystem.createObjectVariable(this.mLeft);
        androidx.constraintlayout.core.SolverVariable createObjectVariable2 = linearSystem.createObjectVariable(this.mRight);
        androidx.constraintlayout.core.SolverVariable createObjectVariable3 = linearSystem.createObjectVariable(this.mTop);
        androidx.constraintlayout.core.SolverVariable createObjectVariable4 = linearSystem.createObjectVariable(this.mBottom);
        androidx.constraintlayout.core.SolverVariable createObjectVariable5 = linearSystem.createObjectVariable(this.mBaseline);
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget3 = this.mParent;
        if (constraintWidget3 != null) {
            boolean z18 = constraintWidget3 != null && constraintWidget3.mListDimensionBehaviors[0] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget4 = this.mParent;
            boolean z19 = constraintWidget4 != null && constraintWidget4.mListDimensionBehaviors[1] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            int i17 = this.AMEXKernelProvider;
            if (i17 == 1) {
                z2 = z18;
                z3 = false;
            } else if (i17 == 2) {
                z3 = z19;
                z2 = false;
            } else if (i17 != 3) {
                z2 = z18;
                z3 = z19;
            }
            if (this.free == 8 && !this.Camera2StreamConfigurationMap && !hasDependencies()) {
                zArr = this.AMEXKernela;
                if (!zArr[0] && !zArr[1]) {
                    return;
                }
            }
            z4 = this.rsaCipher;
            if (!z4 || this.sha1) {
                if (z4) {
                    linearSystem.addEquality(createObjectVariable, this.mX);
                    linearSystem.addEquality(createObjectVariable2, this.mX + this.d);
                    if (z2 && (constraintWidget2 = this.mParent) != null) {
                        if (this.AMEXKernelCallback) {
                            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) constraintWidget2;
                            constraintWidgetContainer.addHorizontalWrapMinVariable(this.mLeft);
                            constraintWidgetContainer.addHorizontalWrapMaxVariable(this.mRight);
                        } else {
                            linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget2.mRight), createObjectVariable2, 0, 5);
                        }
                    }
                }
                if (this.sha1) {
                    linearSystem.addEquality(createObjectVariable3, this.mY);
                    linearSystem.addEquality(createObjectVariable4, this.mY + this.getOutputSizeshNQ4ISI);
                    if (this.mBaseline.hasDependents()) {
                        linearSystem.addEquality(createObjectVariable5, this.mY + this.getHighSpeedVideoFpsRangesFor);
                    }
                    if (z3 && (constraintWidget = this.mParent) != null) {
                        if (this.AMEXKernelCallback) {
                            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer2 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) constraintWidget;
                            constraintWidgetContainer2.Camera2StreamConfigurationMap(this.mTop);
                            constraintWidgetContainer2.getHighSpeedVideoFpsRanges(this.mBottom);
                        } else {
                            linearSystem.addGreaterThan(linearSystem.createObjectVariable(constraintWidget.mBottom), createObjectVariable4, 0, 5);
                        }
                    }
                }
                if (this.rsaCipher && this.sha1) {
                    this.rsaCipher = false;
                    this.sha1 = false;
                    return;
                }
            }
            if (androidx.constraintlayout.core.LinearSystem.sMetrics != null) {
                androidx.constraintlayout.core.LinearSystem.sMetrics.widgets++;
            }
            if (!z && (horizontalWidgetRun2 = this.mHorizontalRun) != null && this.mVerticalRun != null && horizontalWidgetRun2.start.resolved && this.mHorizontalRun.end.resolved && this.mVerticalRun.start.resolved && this.mVerticalRun.end.resolved) {
                if (androidx.constraintlayout.core.LinearSystem.sMetrics != null) {
                    androidx.constraintlayout.core.LinearSystem.sMetrics.graphSolved++;
                }
                linearSystem.addEquality(createObjectVariable, this.mHorizontalRun.start.value);
                linearSystem.addEquality(createObjectVariable2, this.mHorizontalRun.end.value);
                linearSystem.addEquality(createObjectVariable3, this.mVerticalRun.start.value);
                linearSystem.addEquality(createObjectVariable4, this.mVerticalRun.end.value);
                linearSystem.addEquality(createObjectVariable5, this.mVerticalRun.baseline.value);
                if (this.mParent != null) {
                    if (z2 && this.isTerminalWidget[0] && !isInHorizontalChain()) {
                        linearSystem.addGreaterThan(linearSystem.createObjectVariable(this.mParent.mRight), createObjectVariable2, 0, 8);
                    }
                    if (z3 && this.isTerminalWidget[1] && !isInVerticalChain()) {
                        linearSystem.addGreaterThan(linearSystem.createObjectVariable(this.mParent.mBottom), createObjectVariable4, 0, 8);
                    }
                }
                this.rsaCipher = false;
                this.sha1 = false;
                return;
            }
            if (androidx.constraintlayout.core.LinearSystem.sMetrics != null) {
                androidx.constraintlayout.core.LinearSystem.sMetrics.linearSolved++;
            }
            if (this.mParent == null) {
                if (getHighSpeedVideoFpsRanges(0)) {
                    androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer3 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) this.mParent;
                    int i18 = constraintWidgetContainer3.mHorizontalChainsSize;
                    androidx.constraintlayout.core.widgets.ChainHead[] chainHeadArr = constraintWidgetContainer3.kernelVersion;
                    if (i18 + 1 >= chainHeadArr.length) {
                        constraintWidgetContainer3.kernelVersion = (androidx.constraintlayout.core.widgets.ChainHead[]) java.util.Arrays.copyOf(chainHeadArr, chainHeadArr.length * 2);
                    }
                    constraintWidgetContainer3.kernelVersion[constraintWidgetContainer3.mHorizontalChainsSize] = new androidx.constraintlayout.core.widgets.ChainHead(this, 0, constraintWidgetContainer3.isRtl());
                    i16 = 1;
                    constraintWidgetContainer3.mHorizontalChainsSize++;
                    isInHorizontalChain = true;
                } else {
                    i16 = 1;
                    isInHorizontalChain = isInHorizontalChain();
                }
                if (getHighSpeedVideoFpsRanges(i16)) {
                    androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer4 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) this.mParent;
                    int i19 = constraintWidgetContainer4.mVerticalChainsSize;
                    androidx.constraintlayout.core.widgets.ChainHead[] chainHeadArr2 = constraintWidgetContainer4.AMEXKernela;
                    if (i19 + i16 >= chainHeadArr2.length) {
                        constraintWidgetContainer4.AMEXKernela = (androidx.constraintlayout.core.widgets.ChainHead[]) java.util.Arrays.copyOf(chainHeadArr2, chainHeadArr2.length * 2);
                    }
                    constraintWidgetContainer4.AMEXKernela[constraintWidgetContainer4.mVerticalChainsSize] = new androidx.constraintlayout.core.widgets.ChainHead(this, 1, constraintWidgetContainer4.isRtl());
                    constraintWidgetContainer4.mVerticalChainsSize++;
                    isInVerticalChain = true;
                } else {
                    isInVerticalChain = isInVerticalChain();
                }
                if (!isInHorizontalChain && z2 && this.free != 8 && this.mLeft.mTarget == null && this.mRight.mTarget == null) {
                    linearSystem.addGreaterThan(linearSystem.createObjectVariable(this.mParent.mRight), createObjectVariable2, 0, 1);
                }
                if (!isInVerticalChain && z3 && this.free != 8 && this.mTop.mTarget == null && this.mBottom.mTarget == null && this.mBaseline == null) {
                    linearSystem.addGreaterThan(linearSystem.createObjectVariable(this.mParent.mBottom), createObjectVariable4, 0, 1);
                }
                z6 = isInHorizontalChain;
                z5 = isInVerticalChain;
            } else {
                z5 = false;
                z6 = false;
            }
            i = this.d;
            i2 = this.mMinWidth;
            if (i < i2) {
                i = i2;
            }
            i3 = this.getOutputSizeshNQ4ISI;
            i4 = this.mMinHeight;
            if (i3 < i4) {
                i3 = i4;
            }
            boolean z20 = this.mListDimensionBehaviors[0] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            boolean z21 = this.mListDimensionBehaviors[1] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            this.coroutineCreation = this.mDimensionRatioSide;
            f = this.mDimensionRatio;
            this.ArtificialStackFrames = f;
            int i20 = this.mMatchConstraintDefaultWidth;
            int i21 = this.mMatchConstraintDefaultHeight;
            i5 = i;
            if (f > 0.0f || this.free == 8) {
                i6 = i5;
            } else {
                if (this.mListDimensionBehaviors[0] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i20 == 0) {
                    i20 = 3;
                }
                if (this.mListDimensionBehaviors[1] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i21 == 0) {
                    i21 = 3;
                }
                if (this.mListDimensionBehaviors[0] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.mListDimensionBehaviors[1] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i20 == 3 && i21 == 3) {
                    setupDimensionRatio(z2, z3, z20, z21);
                } else if (this.mListDimensionBehaviors[0] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i20 == 3) {
                    this.coroutineCreation = 0;
                    i6 = (int) (this.ArtificialStackFrames * this.getOutputSizeshNQ4ISI);
                    if (this.mListDimensionBehaviors[1] != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        i20 = 4;
                    } else {
                        i7 = i3;
                        i8 = i20;
                        i9 = i21;
                        z7 = true;
                        int[] iArr = this.mResolvedMatchConstraintDefault;
                        iArr[0] = i8;
                        iArr[1] = i9;
                        this.accessartificialFrame = z7;
                        if (z7) {
                            i10 = -1;
                        } else {
                            int i22 = this.coroutineCreation;
                            i10 = -1;
                            if (i22 == 0 || i22 == -1) {
                                z8 = true;
                                boolean z22 = !z7 && ((i15 = this.coroutineCreation) == 1 || i15 == i10);
                                z9 = this.mListDimensionBehaviors[0] != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && (this instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer);
                                i11 = z9 ? 0 : i6;
                                z10 = !this.mCenter.isConnected();
                                boolean[] zArr2 = this.AMEXKernela;
                                z11 = zArr2[0];
                                boolean z23 = zArr2[1];
                                if (this.mHorizontalResolution != 2 && !this.rsaCipher) {
                                    if (z || (horizontalWidgetRun = this.mHorizontalRun) == null || !horizontalWidgetRun.start.resolved || !this.mHorizontalRun.end.resolved) {
                                        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget5 = this.mParent;
                                        androidx.constraintlayout.core.SolverVariable createObjectVariable6 = constraintWidget5 == null ? linearSystem.createObjectVariable(constraintWidget5.mRight) : null;
                                        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget6 = this.mParent;
                                        androidx.constraintlayout.core.SolverVariable createObjectVariable7 = constraintWidget6 == null ? linearSystem.createObjectVariable(constraintWidget6.mLeft) : null;
                                        boolean z24 = this.isTerminalWidget[0];
                                        androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = this.mListDimensionBehaviors;
                                        z12 = z2;
                                        z13 = z3;
                                        z14 = z7;
                                        solverVariable = createObjectVariable5;
                                        solverVariable2 = createObjectVariable4;
                                        solverVariable3 = createObjectVariable3;
                                        solverVariable4 = createObjectVariable2;
                                        solverVariable5 = createObjectVariable;
                                        getHighSpeedVideoFpsRanges(linearSystem, true, z2, z3, z24, createObjectVariable7, createObjectVariable6, dimensionBehaviourArr[0], z9, this.mLeft, this.mRight, this.mX, i11, this.mMinWidth, this.l[0], this.getOutputStallDuration, z8, dimensionBehaviourArr[1] != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT, z6, z5, z11, i8, i9, this.mMatchConstraintMinWidth, this.mMatchConstraintMaxWidth, this.mMatchConstraintPercentWidth, z10);
                                        if (z || (verticalWidgetRun = this.mVerticalRun) == null || !verticalWidgetRun.start.resolved || !this.mVerticalRun.end.resolved) {
                                            linearSystem2 = linearSystem;
                                            solverVariable6 = solverVariable;
                                            solverVariable7 = solverVariable2;
                                            solverVariable8 = solverVariable3;
                                            i12 = 8;
                                            i13 = 0;
                                            r11 = 1;
                                            i14 = 1;
                                        } else {
                                            linearSystem2 = linearSystem;
                                            solverVariable8 = solverVariable3;
                                            linearSystem2.addEquality(solverVariable8, this.mVerticalRun.start.value);
                                            solverVariable7 = solverVariable2;
                                            linearSystem2.addEquality(solverVariable7, this.mVerticalRun.end.value);
                                            solverVariable6 = solverVariable;
                                            linearSystem2.addEquality(solverVariable6, this.mVerticalRun.baseline.value);
                                            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget7 = this.mParent;
                                            if (constraintWidget7 == null || z5 || !z13) {
                                                i12 = 8;
                                                i13 = 0;
                                                z17 = true;
                                            } else {
                                                z17 = true;
                                                z17 = true;
                                                if (this.isTerminalWidget[1]) {
                                                    i12 = 8;
                                                    i13 = 0;
                                                    linearSystem2.addGreaterThan(linearSystem2.createObjectVariable(constraintWidget7.mBottom), solverVariable7, 0, 8);
                                                } else {
                                                    i12 = 8;
                                                    i13 = 0;
                                                }
                                            }
                                            i14 = i13;
                                            r11 = z17;
                                        }
                                        if (this.mVerticalResolution == 2 || i14 == 0 || this.sha1) {
                                            solverVariable9 = solverVariable7;
                                            solverVariable10 = solverVariable8;
                                        } else {
                                            z15 = (this.mListDimensionBehaviors[r11] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || !(this instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer)) ? i13 : r11;
                                            if (z15) {
                                                i7 = i13;
                                            }
                                            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget8 = this.mParent;
                                            androidx.constraintlayout.core.SolverVariable createObjectVariable8 = constraintWidget8 == null ? linearSystem2.createObjectVariable(constraintWidget8.mBottom) : null;
                                            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget9 = this.mParent;
                                            androidx.constraintlayout.core.SolverVariable createObjectVariable9 = constraintWidget9 == null ? linearSystem2.createObjectVariable(constraintWidget9.mTop) : null;
                                            if (this.getHighSpeedVideoFpsRangesFor <= 0 || this.free == i12) {
                                                if (this.mBaseline.mTarget == null) {
                                                    linearSystem2.addEquality(solverVariable6, solverVariable8, getBaselineDistance(), i12);
                                                    linearSystem2.addEquality(solverVariable6, linearSystem2.createObjectVariable(this.mBaseline.mTarget), this.mBaseline.getMargin(), i12);
                                                    if (z13) {
                                                        linearSystem2.addGreaterThan(createObjectVariable8, linearSystem2.createObjectVariable(this.mBottom), i13, 5);
                                                    }
                                                    z16 = i13;
                                                    boolean z25 = this.isTerminalWidget[r11];
                                                    androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = this.mListDimensionBehaviors;
                                                    solverVariable9 = solverVariable7;
                                                    solverVariable10 = solverVariable8;
                                                    getHighSpeedVideoFpsRanges(linearSystem, false, z13, z12, z25, createObjectVariable9, createObjectVariable8, dimensionBehaviourArr2[r11], z15, this.mTop, this.mBottom, this.mY, i7, this.mMinHeight, this.l[r11], this.b, z22, dimensionBehaviourArr2[0] != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT, z5, z6, z23, i9, i8, this.mMatchConstraintMinHeight, this.mMatchConstraintMaxHeight, this.mMatchConstraintPercentHeight, z16);
                                                } else if (this.free == i12) {
                                                    linearSystem2.addEquality(solverVariable6, solverVariable8, this.mBaseline.getMargin(), i12);
                                                } else {
                                                    linearSystem2.addEquality(solverVariable6, solverVariable8, getBaselineDistance(), i12);
                                                }
                                            }
                                            z16 = z10;
                                            boolean z252 = this.isTerminalWidget[r11];
                                            androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr22 = this.mListDimensionBehaviors;
                                            solverVariable9 = solverVariable7;
                                            solverVariable10 = solverVariable8;
                                            getHighSpeedVideoFpsRanges(linearSystem, false, z13, z12, z252, createObjectVariable9, createObjectVariable8, dimensionBehaviourArr22[r11], z15, this.mTop, this.mBottom, this.mY, i7, this.mMinHeight, this.l[r11], this.b, z22, dimensionBehaviourArr22[0] != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT, z5, z6, z23, i9, i8, this.mMatchConstraintMinHeight, this.mMatchConstraintMaxHeight, this.mMatchConstraintPercentHeight, z16);
                                        }
                                        if (z14) {
                                            if (this.coroutineCreation == 1) {
                                                linearSystem.addRatio(solverVariable9, solverVariable10, solverVariable4, solverVariable5, this.ArtificialStackFrames, 8);
                                            } else {
                                                linearSystem.addRatio(solverVariable4, solverVariable5, solverVariable9, solverVariable10, this.ArtificialStackFrames, 8);
                                            }
                                        }
                                        if (this.mCenter.isConnected()) {
                                            linearSystem.addCenterPoint(this, this.mCenter.getTarget().getOwner(), (float) java.lang.Math.toRadians(this.mCircleConstraintAngle + 90.0f), this.mCenter.getMargin());
                                        }
                                        this.rsaCipher = false;
                                        this.sha1 = false;
                                        if (androidx.constraintlayout.core.LinearSystem.sMetrics != null) {
                                            androidx.constraintlayout.core.LinearSystem.sMetrics.mEquations = linearSystem.getNumEquations();
                                            androidx.constraintlayout.core.LinearSystem.sMetrics.mVariables = linearSystem.getNumVariables();
                                            return;
                                        }
                                        return;
                                    }
                                    if (z) {
                                        linearSystem.addEquality(createObjectVariable, this.mHorizontalRun.start.value);
                                        linearSystem.addEquality(createObjectVariable2, this.mHorizontalRun.end.value);
                                        if (this.mParent != null && z2 && this.isTerminalWidget[0] && !isInHorizontalChain()) {
                                            linearSystem.addGreaterThan(linearSystem.createObjectVariable(this.mParent.mRight), createObjectVariable2, 0, 8);
                                        }
                                    }
                                }
                                z12 = z2;
                                z13 = z3;
                                z14 = z7;
                                solverVariable = createObjectVariable5;
                                solverVariable2 = createObjectVariable4;
                                solverVariable3 = createObjectVariable3;
                                solverVariable4 = createObjectVariable2;
                                solverVariable5 = createObjectVariable;
                                if (z) {
                                }
                                linearSystem2 = linearSystem;
                                solverVariable6 = solverVariable;
                                solverVariable7 = solverVariable2;
                                solverVariable8 = solverVariable3;
                                i12 = 8;
                                i13 = 0;
                                r11 = 1;
                                i14 = 1;
                                if (this.mVerticalResolution == 2) {
                                    if (this.mListDimensionBehaviors[r11] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                                    }
                                    if (z15) {
                                    }
                                    androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget82 = this.mParent;
                                    if (constraintWidget82 == null) {
                                    }
                                    androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget92 = this.mParent;
                                    if (constraintWidget92 == null) {
                                    }
                                    if (this.getHighSpeedVideoFpsRangesFor <= 0) {
                                    }
                                    if (this.mBaseline.mTarget == null) {
                                    }
                                }
                                solverVariable9 = solverVariable7;
                                solverVariable10 = solverVariable8;
                                if (z14) {
                                }
                                if (this.mCenter.isConnected()) {
                                }
                                this.rsaCipher = false;
                                this.sha1 = false;
                                if (androidx.constraintlayout.core.LinearSystem.sMetrics != null) {
                                }
                            }
                        }
                        z8 = false;
                        if (z7) {
                        }
                        if (this.mListDimensionBehaviors[0] != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        }
                        if (z9) {
                        }
                        z10 = !this.mCenter.isConnected();
                        boolean[] zArr22 = this.AMEXKernela;
                        z11 = zArr22[0];
                        boolean z232 = zArr22[1];
                        if (this.mHorizontalResolution != 2) {
                            if (z) {
                            }
                            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget52 = this.mParent;
                            if (constraintWidget52 == null) {
                            }
                            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget62 = this.mParent;
                            if (constraintWidget62 == null) {
                            }
                            boolean z242 = this.isTerminalWidget[0];
                            androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr3 = this.mListDimensionBehaviors;
                            z12 = z2;
                            z13 = z3;
                            z14 = z7;
                            solverVariable = createObjectVariable5;
                            solverVariable2 = createObjectVariable4;
                            solverVariable3 = createObjectVariable3;
                            solverVariable4 = createObjectVariable2;
                            solverVariable5 = createObjectVariable;
                            getHighSpeedVideoFpsRanges(linearSystem, true, z2, z3, z242, createObjectVariable7, createObjectVariable6, dimensionBehaviourArr3[0], z9, this.mLeft, this.mRight, this.mX, i11, this.mMinWidth, this.l[0], this.getOutputStallDuration, z8, dimensionBehaviourArr3[1] != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT, z6, z5, z11, i8, i9, this.mMatchConstraintMinWidth, this.mMatchConstraintMaxWidth, this.mMatchConstraintPercentWidth, z10);
                            if (z) {
                            }
                            linearSystem2 = linearSystem;
                            solverVariable6 = solverVariable;
                            solverVariable7 = solverVariable2;
                            solverVariable8 = solverVariable3;
                            i12 = 8;
                            i13 = 0;
                            r11 = 1;
                            i14 = 1;
                            if (this.mVerticalResolution == 2) {
                            }
                            solverVariable9 = solverVariable7;
                            solverVariable10 = solverVariable8;
                            if (z14) {
                            }
                            if (this.mCenter.isConnected()) {
                            }
                            this.rsaCipher = false;
                            this.sha1 = false;
                            if (androidx.constraintlayout.core.LinearSystem.sMetrics != null) {
                            }
                        }
                        z12 = z2;
                        z13 = z3;
                        z14 = z7;
                        solverVariable = createObjectVariable5;
                        solverVariable2 = createObjectVariable4;
                        solverVariable3 = createObjectVariable3;
                        solverVariable4 = createObjectVariable2;
                        solverVariable5 = createObjectVariable;
                        if (z) {
                        }
                        linearSystem2 = linearSystem;
                        solverVariable6 = solverVariable;
                        solverVariable7 = solverVariable2;
                        solverVariable8 = solverVariable3;
                        i12 = 8;
                        i13 = 0;
                        r11 = 1;
                        i14 = 1;
                        if (this.mVerticalResolution == 2) {
                        }
                        solverVariable9 = solverVariable7;
                        solverVariable10 = solverVariable8;
                        if (z14) {
                        }
                        if (this.mCenter.isConnected()) {
                        }
                        this.rsaCipher = false;
                        this.sha1 = false;
                        if (androidx.constraintlayout.core.LinearSystem.sMetrics != null) {
                        }
                    }
                } else if (this.mListDimensionBehaviors[1] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i21 == 3) {
                    this.coroutineCreation = 1;
                    if (this.mDimensionRatioSide == -1) {
                        this.ArtificialStackFrames = 1.0f / this.ArtificialStackFrames;
                    }
                    i3 = (int) (this.ArtificialStackFrames * this.d);
                    if (this.mListDimensionBehaviors[0] != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        i6 = i5;
                        i21 = 4;
                    }
                }
                i7 = i3;
                i8 = i20;
                i9 = i21;
                i6 = i5;
                z7 = true;
                int[] iArr2 = this.mResolvedMatchConstraintDefault;
                iArr2[0] = i8;
                iArr2[1] = i9;
                this.accessartificialFrame = z7;
                if (z7) {
                }
                z8 = false;
                if (z7) {
                }
                if (this.mListDimensionBehaviors[0] != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                }
                if (z9) {
                }
                z10 = !this.mCenter.isConnected();
                boolean[] zArr222 = this.AMEXKernela;
                z11 = zArr222[0];
                boolean z2322 = zArr222[1];
                if (this.mHorizontalResolution != 2) {
                }
                z12 = z2;
                z13 = z3;
                z14 = z7;
                solverVariable = createObjectVariable5;
                solverVariable2 = createObjectVariable4;
                solverVariable3 = createObjectVariable3;
                solverVariable4 = createObjectVariable2;
                solverVariable5 = createObjectVariable;
                if (z) {
                }
                linearSystem2 = linearSystem;
                solverVariable6 = solverVariable;
                solverVariable7 = solverVariable2;
                solverVariable8 = solverVariable3;
                i12 = 8;
                i13 = 0;
                r11 = 1;
                i14 = 1;
                if (this.mVerticalResolution == 2) {
                }
                solverVariable9 = solverVariable7;
                solverVariable10 = solverVariable8;
                if (z14) {
                }
                if (this.mCenter.isConnected()) {
                }
                this.rsaCipher = false;
                this.sha1 = false;
                if (androidx.constraintlayout.core.LinearSystem.sMetrics != null) {
                }
            }
            i7 = i3;
            i8 = i20;
            i9 = i21;
            z7 = false;
            int[] iArr22 = this.mResolvedMatchConstraintDefault;
            iArr22[0] = i8;
            iArr22[1] = i9;
            this.accessartificialFrame = z7;
            if (z7) {
            }
            z8 = false;
            if (z7) {
            }
            if (this.mListDimensionBehaviors[0] != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
            }
            if (z9) {
            }
            z10 = !this.mCenter.isConnected();
            boolean[] zArr2222 = this.AMEXKernela;
            z11 = zArr2222[0];
            boolean z23222 = zArr2222[1];
            if (this.mHorizontalResolution != 2) {
            }
            z12 = z2;
            z13 = z3;
            z14 = z7;
            solverVariable = createObjectVariable5;
            solverVariable2 = createObjectVariable4;
            solverVariable3 = createObjectVariable3;
            solverVariable4 = createObjectVariable2;
            solverVariable5 = createObjectVariable;
            if (z) {
            }
            linearSystem2 = linearSystem;
            solverVariable6 = solverVariable;
            solverVariable7 = solverVariable2;
            solverVariable8 = solverVariable3;
            i12 = 8;
            i13 = 0;
            r11 = 1;
            i14 = 1;
            if (this.mVerticalResolution == 2) {
            }
            solverVariable9 = solverVariable7;
            solverVariable10 = solverVariable8;
            if (z14) {
            }
            if (this.mCenter.isConnected()) {
            }
            this.rsaCipher = false;
            this.sha1 = false;
            if (androidx.constraintlayout.core.LinearSystem.sMetrics != null) {
            }
        }
        z2 = false;
        z3 = false;
        if (this.free == 8) {
            zArr = this.AMEXKernela;
            if (!zArr[0]) {
                return;
            }
        }
        z4 = this.rsaCipher;
        if (!z4) {
        }
        if (z4) {
        }
        if (this.sha1) {
        }
        if (this.rsaCipher) {
            this.rsaCipher = false;
            this.sha1 = false;
            return;
        }
        if (androidx.constraintlayout.core.LinearSystem.sMetrics != null) {
        }
        if (!z) {
        }
        if (androidx.constraintlayout.core.LinearSystem.sMetrics != null) {
        }
        if (this.mParent == null) {
        }
        i = this.d;
        i2 = this.mMinWidth;
        if (i < i2) {
        }
        i3 = this.getOutputSizeshNQ4ISI;
        i4 = this.mMinHeight;
        if (i3 < i4) {
        }
        if (this.mListDimensionBehaviors[0] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
        }
        if (this.mListDimensionBehaviors[1] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
        }
        this.coroutineCreation = this.mDimensionRatioSide;
        f = this.mDimensionRatio;
        this.ArtificialStackFrames = f;
        int i202 = this.mMatchConstraintDefaultWidth;
        int i212 = this.mMatchConstraintDefaultHeight;
        i5 = i;
        if (f > 0.0f) {
        }
        i6 = i5;
        i7 = i3;
        i8 = i202;
        i9 = i212;
        z7 = false;
        int[] iArr222 = this.mResolvedMatchConstraintDefault;
        iArr222[0] = i8;
        iArr222[1] = i9;
        this.accessartificialFrame = z7;
        if (z7) {
        }
        z8 = false;
        if (z7) {
        }
        if (this.mListDimensionBehaviors[0] != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
        }
        if (z9) {
        }
        z10 = !this.mCenter.isConnected();
        boolean[] zArr22222 = this.AMEXKernela;
        z11 = zArr22222[0];
        boolean z232222 = zArr22222[1];
        if (this.mHorizontalResolution != 2) {
        }
        z12 = z2;
        z13 = z3;
        z14 = z7;
        solverVariable = createObjectVariable5;
        solverVariable2 = createObjectVariable4;
        solverVariable3 = createObjectVariable3;
        solverVariable4 = createObjectVariable2;
        solverVariable5 = createObjectVariable;
        if (z) {
        }
        linearSystem2 = linearSystem;
        solverVariable6 = solverVariable;
        solverVariable7 = solverVariable2;
        solverVariable8 = solverVariable3;
        i12 = 8;
        i13 = 0;
        r11 = 1;
        i14 = 1;
        if (this.mVerticalResolution == 2) {
        }
        solverVariable9 = solverVariable7;
        solverVariable10 = solverVariable8;
        if (z14) {
        }
        if (this.mCenter.isConnected()) {
        }
        this.rsaCipher = false;
        this.sha1 = false;
        if (androidx.constraintlayout.core.LinearSystem.sMetrics != null) {
        }
    }

    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return (this instanceof androidx.constraintlayout.core.widgets.VirtualLayout) || (this instanceof androidx.constraintlayout.core.widgets.Guideline);
    }

    public void setupDimensionRatio(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.coroutineCreation == -1) {
            if (z3 && !z4) {
                this.coroutineCreation = 0;
            } else if (!z3 && z4) {
                this.coroutineCreation = 1;
                if (this.mDimensionRatioSide == -1) {
                    this.ArtificialStackFrames = 1.0f / this.ArtificialStackFrames;
                }
            }
        }
        if (this.coroutineCreation == 0 && (!this.mTop.isConnected() || !this.mBottom.isConnected())) {
            this.coroutineCreation = 1;
        } else if (this.coroutineCreation == 1 && (!this.mLeft.isConnected() || !this.mRight.isConnected())) {
            this.coroutineCreation = 0;
        }
        if (this.coroutineCreation == -1 && (!this.mTop.isConnected() || !this.mBottom.isConnected() || !this.mLeft.isConnected() || !this.mRight.isConnected())) {
            if (this.mTop.isConnected() && this.mBottom.isConnected()) {
                this.coroutineCreation = 0;
            } else if (this.mLeft.isConnected() && this.mRight.isConnected()) {
                this.ArtificialStackFrames = 1.0f / this.ArtificialStackFrames;
                this.coroutineCreation = 1;
            }
        }
        if (this.coroutineCreation == -1) {
            int i = this.mMatchConstraintMinWidth;
            if (i > 0 && this.mMatchConstraintMinHeight == 0) {
                this.coroutineCreation = 0;
            } else {
                if (i != 0 || this.mMatchConstraintMinHeight <= 0) {
                    return;
                }
                this.ArtificialStackFrames = 1.0f / this.ArtificialStackFrames;
                this.coroutineCreation = 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x04be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getHighSpeedVideoFpsRanges(androidx.constraintlayout.core.LinearSystem linearSystem, boolean z, boolean z2, boolean z3, boolean z4, androidx.constraintlayout.core.SolverVariable solverVariable, androidx.constraintlayout.core.SolverVariable solverVariable2, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour, boolean z5, androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor2, int i, int i2, int i3, int i4, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i5, int i6, int i7, int i8, float f2, boolean z11) {
        int i9;
        androidx.constraintlayout.core.SolverVariable solverVariable3;
        boolean z12;
        int i10;
        boolean z13;
        int i11;
        boolean z14;
        boolean z15;
        int i12;
        boolean z16;
        int i13;
        int i14;
        androidx.constraintlayout.core.SolverVariable solverVariable4;
        boolean z17;
        int i15;
        androidx.constraintlayout.core.SolverVariable solverVariable5;
        int i16;
        androidx.constraintlayout.core.SolverVariable solverVariable6;
        boolean z18;
        int i17;
        boolean z19;
        boolean z20;
        androidx.constraintlayout.core.SolverVariable createObjectVariable;
        androidx.constraintlayout.core.SolverVariable createObjectVariable2;
        int i18;
        androidx.constraintlayout.core.SolverVariable solverVariable7;
        int i19;
        int i20;
        boolean z21;
        int i21;
        boolean z22;
        boolean z23;
        androidx.constraintlayout.core.SolverVariable solverVariable8;
        int i22;
        boolean z24;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget;
        androidx.constraintlayout.core.SolverVariable solverVariable9;
        int i23;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2;
        androidx.constraintlayout.core.SolverVariable solverVariable10;
        boolean z25;
        androidx.constraintlayout.core.SolverVariable solverVariable11;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget3;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z26;
        int i28;
        boolean z27;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        boolean z28;
        boolean z29;
        int i34;
        int i35;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget4;
        int i36;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget5;
        int i37 = i8;
        androidx.constraintlayout.core.SolverVariable createObjectVariable3 = linearSystem.createObjectVariable(constraintAnchor);
        androidx.constraintlayout.core.SolverVariable createObjectVariable4 = linearSystem.createObjectVariable(constraintAnchor2);
        androidx.constraintlayout.core.SolverVariable createObjectVariable5 = linearSystem.createObjectVariable(constraintAnchor.getTarget());
        androidx.constraintlayout.core.SolverVariable createObjectVariable6 = linearSystem.createObjectVariable(constraintAnchor2.getTarget());
        if (androidx.constraintlayout.core.LinearSystem.getMetrics() != null) {
            androidx.constraintlayout.core.LinearSystem.getMetrics().nonresolvedWidgets++;
        }
        boolean isConnected = constraintAnchor.isConnected();
        boolean isConnected2 = constraintAnchor2.isConnected();
        boolean isConnected3 = this.mCenter.isConnected();
        int i38 = isConnected2 ? (isConnected ? 1 : 0) + 1 : isConnected ? 1 : 0;
        if (isConnected3) {
            i38++;
        }
        if (z6) {
            solverVariable3 = createObjectVariable6;
            i9 = 3;
        } else {
            i9 = i5;
            solverVariable3 = createObjectVariable6;
        }
        int ordinal = dimensionBehaviour.ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal == 2) {
            if (i9 != 4) {
                z12 = true;
                i10 = this.version;
                if (i10 == -1 && z) {
                    this.version = -1;
                    z13 = false;
                } else {
                    i10 = i2;
                    z13 = z12;
                }
                i11 = this.AMEXKernel;
                if (i11 != -1 || z) {
                    z14 = z13;
                } else {
                    this.AMEXKernel = -1;
                    i10 = i11;
                    z14 = false;
                }
                int i39 = i10;
                if (this.free != 8) {
                    i12 = 0;
                    z15 = false;
                } else {
                    z15 = z14;
                    i12 = i39;
                }
                if (z11) {
                    z16 = isConnected2;
                    i13 = 8;
                } else {
                    if (!isConnected && !isConnected2 && !isConnected3) {
                        linearSystem.addEquality(createObjectVariable3, i);
                    } else if (isConnected && !isConnected2) {
                        z16 = isConnected2;
                        i13 = 8;
                        linearSystem.addEquality(createObjectVariable3, createObjectVariable5, constraintAnchor.getMargin(), 8);
                    }
                    z16 = isConnected2;
                    i13 = 8;
                }
                if (z15) {
                    if (z5) {
                        linearSystem.addEquality(createObjectVariable4, createObjectVariable3, 0, 3);
                        if (i3 > 0) {
                            linearSystem.addGreaterThan(createObjectVariable4, createObjectVariable3, i3, 8);
                        }
                        if (i4 < Integer.MAX_VALUE) {
                            linearSystem.addLowerThan(createObjectVariable4, createObjectVariable3, i4, 8);
                        }
                    } else {
                        linearSystem.addEquality(createObjectVariable4, createObjectVariable3, i12, i13);
                    }
                    z20 = z4;
                    i17 = i7;
                    i14 = i38;
                    solverVariable6 = createObjectVariable5;
                    solverVariable4 = createObjectVariable4;
                    z19 = z15;
                    solverVariable5 = solverVariable3;
                    i16 = 2;
                } else if (i38 == 2 || z6 || !(i9 == 1 || i9 == 0)) {
                    int i40 = i7 == -2 ? i12 : i7;
                    int i41 = i37 == -2 ? i12 : i37;
                    if (i12 > 0 && i9 != 1) {
                        i12 = 0;
                    }
                    if (i40 > 0) {
                        linearSystem.addGreaterThan(createObjectVariable4, createObjectVariable3, i40, 8);
                        i12 = java.lang.Math.max(i12, i40);
                    }
                    if (i41 > 0) {
                        if (!z2 || i9 != 1) {
                            linearSystem.addLowerThan(createObjectVariable4, createObjectVariable3, i41, 8);
                        }
                        i12 = java.lang.Math.min(i12, i41);
                    }
                    if (i9 == 1) {
                        if (z2) {
                            linearSystem.addEquality(createObjectVariable4, createObjectVariable3, i12, 8);
                        } else if (z8) {
                            linearSystem.addEquality(createObjectVariable4, createObjectVariable3, i12, 5);
                            linearSystem.addLowerThan(createObjectVariable4, createObjectVariable3, i12, 8);
                        } else {
                            linearSystem.addEquality(createObjectVariable4, createObjectVariable3, i12, 5);
                            linearSystem.addLowerThan(createObjectVariable4, createObjectVariable3, i12, 8);
                        }
                        z20 = z4;
                        i37 = i41;
                        i14 = i38;
                        solverVariable4 = createObjectVariable4;
                        z19 = z15;
                        i17 = i40;
                        solverVariable5 = solverVariable3;
                        i16 = 2;
                        solverVariable6 = createObjectVariable5;
                    } else {
                        if (i9 == 2) {
                            if (constraintAnchor.getType() == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP || constraintAnchor.getType() == androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM) {
                                createObjectVariable = linearSystem.createObjectVariable(this.mParent.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP));
                                createObjectVariable2 = linearSystem.createObjectVariable(this.mParent.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM));
                            } else {
                                createObjectVariable = linearSystem.createObjectVariable(this.mParent.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT));
                                createObjectVariable2 = linearSystem.createObjectVariable(this.mParent.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT));
                            }
                            z17 = z15;
                            solverVariable5 = solverVariable3;
                            i16 = 2;
                            i15 = i40;
                            solverVariable6 = createObjectVariable5;
                            i14 = i38;
                            solverVariable4 = createObjectVariable4;
                            linearSystem.addConstraint(linearSystem.createRow().createRowDimensionRatio(createObjectVariable4, createObjectVariable3, createObjectVariable2, createObjectVariable, f2));
                            if (z2) {
                                z17 = false;
                            }
                            z18 = z4;
                        } else {
                            i14 = i38;
                            solverVariable4 = createObjectVariable4;
                            z17 = z15;
                            i15 = i40;
                            solverVariable5 = solverVariable3;
                            i16 = 2;
                            solverVariable6 = createObjectVariable5;
                            z18 = true;
                        }
                        i17 = i15;
                        i37 = i41;
                        z19 = z17;
                        z20 = z18;
                    }
                } else {
                    int max = java.lang.Math.max(i7, i12);
                    if (i37 > 0) {
                        max = java.lang.Math.min(i37, max);
                    }
                    linearSystem.addEquality(createObjectVariable4, createObjectVariable3, max, 8);
                    z20 = z4;
                    i17 = i7;
                    i14 = i38;
                    solverVariable6 = createObjectVariable5;
                    z19 = false;
                    solverVariable5 = solverVariable3;
                    i16 = 2;
                    solverVariable4 = createObjectVariable4;
                }
                if (z11 || z8) {
                    androidx.constraintlayout.core.SolverVariable solverVariable12 = solverVariable4;
                    if (i14 >= i16 && z2 && z20) {
                        linearSystem.addGreaterThan(createObjectVariable3, solverVariable, 0, 8);
                        boolean z30 = z || this.mBaseline.mTarget == null;
                        if (!z && this.mBaseline.mTarget != null) {
                            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget6 = this.mBaseline.mTarget.mOwner;
                            if (constraintWidget6.mDimensionRatio == 0.0f || constraintWidget6.mListDimensionBehaviors[0] != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget6.mListDimensionBehaviors[1] != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                                return;
                            }
                        } else if (!z30) {
                            return;
                        }
                        linearSystem.addGreaterThan(solverVariable2, solverVariable12, 0, 8);
                        return;
                    }
                    return;
                }
                if (!isConnected && !z16 && !isConnected3) {
                    solverVariable11 = solverVariable4;
                    i25 = 5;
                    i26 = 0;
                } else if (!isConnected || z16) {
                    if (!isConnected && z16) {
                        linearSystem.addEquality(solverVariable4, solverVariable5, -constraintAnchor2.getMargin(), 8);
                        if (z2) {
                            if (this.updateUI && createObjectVariable3.isFinalValue && (constraintWidget4 = this.mParent) != null) {
                                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) constraintWidget4;
                                if (z) {
                                    constraintWidgetContainer.addHorizontalWrapMinVariable(constraintAnchor);
                                } else {
                                    constraintWidgetContainer.Camera2StreamConfigurationMap(constraintAnchor);
                                }
                            } else {
                                i25 = 5;
                                linearSystem.addGreaterThan(createObjectVariable3, solverVariable, 0, 5);
                                i26 = 0;
                                solverVariable11 = solverVariable4;
                            }
                        }
                    } else if (isConnected && z16) {
                        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget7 = constraintAnchor.mTarget.mOwner;
                        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget8 = constraintAnchor2.mTarget.mOwner;
                        androidx.constraintlayout.core.widgets.ConstraintWidget parent = getParent();
                        int i42 = 6;
                        if (!z19) {
                            i18 = i9;
                            if (solverVariable6.isFinalValue && solverVariable5.isFinalValue) {
                                linearSystem.addCentering(createObjectVariable3, solverVariable6, constraintAnchor.getMargin(), f, solverVariable5, solverVariable4, constraintAnchor2.getMargin(), 8);
                                if (z2 && z20) {
                                    if (constraintAnchor2.mTarget != null) {
                                        i22 = constraintAnchor2.getMargin();
                                        solverVariable8 = solverVariable2;
                                    } else {
                                        solverVariable8 = solverVariable2;
                                        i22 = 0;
                                    }
                                    if (solverVariable5 != solverVariable8) {
                                        linearSystem.addGreaterThan(solverVariable8, solverVariable4, i22, 5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            solverVariable7 = solverVariable2;
                            i19 = 6;
                            i20 = 5;
                            z21 = true;
                            i21 = 4;
                            z22 = true;
                            z23 = false;
                        } else if (i9 == 0) {
                            if (i37 != 0 || i17 != 0) {
                                z29 = false;
                                i34 = 5;
                                i35 = 5;
                                z21 = true;
                                z22 = true;
                            } else if (solverVariable6.isFinalValue && solverVariable5.isFinalValue) {
                                linearSystem.addEquality(createObjectVariable3, solverVariable6, constraintAnchor.getMargin(), 8);
                                linearSystem.addEquality(solverVariable4, solverVariable5, -constraintAnchor2.getMargin(), 8);
                                return;
                            } else {
                                z21 = false;
                                z22 = false;
                                i34 = 8;
                                i35 = 8;
                                z29 = true;
                            }
                            if ((constraintWidget7 instanceof androidx.constraintlayout.core.widgets.Barrier) || (constraintWidget8 instanceof androidx.constraintlayout.core.widgets.Barrier)) {
                                i34 = 4;
                            }
                            solverVariable7 = solverVariable2;
                            z23 = z29;
                            i21 = i34;
                            i20 = i35;
                            i18 = i9;
                            i19 = 6;
                        } else {
                            if (i9 == 2) {
                                i29 = ((constraintWidget7 instanceof androidx.constraintlayout.core.widgets.Barrier) || (constraintWidget8 instanceof androidx.constraintlayout.core.widgets.Barrier)) ? 4 : 5;
                                i20 = 5;
                            } else if (i9 == 1) {
                                i20 = 8;
                                i29 = 4;
                            } else if (i9 == 3) {
                                i18 = i9;
                                if (this.coroutineCreation == -1) {
                                    i32 = z9 ? z2 ? 5 : 4 : 8;
                                    i30 = 5;
                                    i20 = 8;
                                } else {
                                    if (!z6) {
                                        if (i37 > 0) {
                                            i30 = 5;
                                        } else if (i37 != 0 || i17 != 0) {
                                            i30 = 4;
                                        } else if (z9) {
                                            i20 = (constraintWidget7 == parent || constraintWidget8 == parent) ? 5 : 4;
                                            i31 = 4;
                                        } else {
                                            i30 = 8;
                                        }
                                        i32 = 6;
                                        i20 = 5;
                                    } else if (i6 == 2 || i6 == 1) {
                                        i31 = 4;
                                        i20 = 5;
                                    } else {
                                        i31 = 5;
                                        i20 = 8;
                                    }
                                    i29 = i31;
                                    i33 = 6;
                                    z27 = true;
                                    z21 = true;
                                    z28 = true;
                                    z23 = z28;
                                    z22 = z27;
                                    i19 = i33;
                                    i21 = i29;
                                    solverVariable7 = solverVariable2;
                                }
                                i33 = i32;
                                z21 = true;
                                z28 = true;
                                i29 = i30;
                                z27 = true;
                                z23 = z28;
                                z22 = z27;
                                i19 = i33;
                                i21 = i29;
                                solverVariable7 = solverVariable2;
                            } else {
                                i18 = i9;
                                z27 = false;
                                i20 = 5;
                                i29 = 4;
                                z21 = false;
                                i33 = 6;
                                z28 = false;
                                z23 = z28;
                                z22 = z27;
                                i19 = i33;
                                i21 = i29;
                                solverVariable7 = solverVariable2;
                            }
                            i18 = i9;
                            z27 = true;
                            z21 = true;
                            i33 = 6;
                            z28 = false;
                            z23 = z28;
                            z22 = z27;
                            i19 = i33;
                            i21 = i29;
                            solverVariable7 = solverVariable2;
                        }
                        if (z22 && solverVariable6 == solverVariable5 && constraintWidget7 != parent) {
                            z22 = false;
                            z24 = false;
                        } else {
                            z24 = true;
                        }
                        if (z21) {
                            if (z19 || z7 || z9 || solverVariable6 != solverVariable || solverVariable5 != solverVariable7) {
                                z25 = z2;
                                i27 = i19;
                                z26 = z24;
                                i28 = i20;
                            } else {
                                z25 = false;
                                i28 = 8;
                                i27 = 8;
                                z26 = false;
                            }
                            i23 = i18;
                            constraintWidget2 = parent;
                            constraintWidget = constraintWidget8;
                            androidx.constraintlayout.core.SolverVariable solverVariable13 = solverVariable4;
                            solverVariable9 = solverVariable4;
                            solverVariable10 = createObjectVariable3;
                            linearSystem.addCentering(createObjectVariable3, solverVariable6, constraintAnchor.getMargin(), f, solverVariable5, solverVariable13, constraintAnchor2.getMargin(), i27);
                            i20 = i28;
                            z24 = z26;
                        } else {
                            constraintWidget = constraintWidget8;
                            solverVariable9 = solverVariable4;
                            i23 = i18;
                            constraintWidget2 = parent;
                            solverVariable10 = createObjectVariable3;
                            z25 = z2;
                        }
                        if (this.free != 8 || constraintAnchor2.hasDependents()) {
                            if (z22) {
                                if (z25 && solverVariable6 != solverVariable5 && !z19 && ((constraintWidget7 instanceof androidx.constraintlayout.core.widgets.Barrier) || (constraintWidget instanceof androidx.constraintlayout.core.widgets.Barrier))) {
                                    i20 = 6;
                                }
                                linearSystem.addGreaterThan(solverVariable10, solverVariable6, constraintAnchor.getMargin(), i20);
                                solverVariable11 = solverVariable9;
                                linearSystem.addLowerThan(solverVariable11, solverVariable5, -constraintAnchor2.getMargin(), i20);
                            } else {
                                solverVariable11 = solverVariable9;
                            }
                            if (!z25 || !z10 || (constraintWidget7 instanceof androidx.constraintlayout.core.widgets.Barrier) || (constraintWidget instanceof androidx.constraintlayout.core.widgets.Barrier)) {
                                constraintWidget3 = constraintWidget2;
                            } else {
                                constraintWidget3 = constraintWidget2;
                                if (constraintWidget != constraintWidget3) {
                                    i24 = 6;
                                    i20 = 6;
                                    z24 = true;
                                    if (z24) {
                                        if (z23 && (!z9 || z3)) {
                                            if (constraintWidget7 != constraintWidget3 && constraintWidget != constraintWidget3) {
                                                i42 = i24;
                                            }
                                            if ((constraintWidget7 instanceof androidx.constraintlayout.core.widgets.Guideline) || (constraintWidget instanceof androidx.constraintlayout.core.widgets.Guideline)) {
                                                i42 = 5;
                                            }
                                            if ((constraintWidget7 instanceof androidx.constraintlayout.core.widgets.Barrier) || (constraintWidget instanceof androidx.constraintlayout.core.widgets.Barrier)) {
                                                i42 = 5;
                                            }
                                            i24 = java.lang.Math.max(z9 ? 5 : i42, i24);
                                        }
                                        if (z25) {
                                            i24 = java.lang.Math.min(i20, i24);
                                            if (z6 && !z9 && (constraintWidget7 == constraintWidget3 || constraintWidget == constraintWidget3)) {
                                                i24 = 4;
                                            }
                                        }
                                        linearSystem.addEquality(solverVariable10, solverVariable6, constraintAnchor.getMargin(), i24);
                                        linearSystem.addEquality(solverVariable11, solverVariable5, -constraintAnchor2.getMargin(), i24);
                                    }
                                    if (z25) {
                                        int margin = solverVariable == solverVariable6 ? constraintAnchor.getMargin() : 0;
                                        if (solverVariable6 != solverVariable) {
                                            linearSystem.addGreaterThan(solverVariable10, solverVariable, margin, 5);
                                        }
                                    }
                                    if (z25 || !z19 || i3 != 0 || i17 != 0) {
                                        i25 = 5;
                                        i26 = 0;
                                    } else if (z19 && i23 == 3) {
                                        i26 = 0;
                                        linearSystem.addGreaterThan(solverVariable11, solverVariable10, 0, 8);
                                        i25 = 5;
                                    } else {
                                        i26 = 0;
                                        i25 = 5;
                                        linearSystem.addGreaterThan(solverVariable11, solverVariable10, 0, 5);
                                    }
                                    i36 = i25;
                                    if (z25 || !z20) {
                                        return;
                                    }
                                    if (constraintAnchor2.mTarget != null) {
                                        i26 = constraintAnchor2.getMargin();
                                    }
                                    if (solverVariable5 != solverVariable2) {
                                        if (this.updateUI && solverVariable11.isFinalValue && (constraintWidget5 = this.mParent) != null) {
                                            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer2 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) constraintWidget5;
                                            if (z) {
                                                constraintWidgetContainer2.addHorizontalWrapMaxVariable(constraintAnchor2);
                                                return;
                                            } else {
                                                constraintWidgetContainer2.getHighSpeedVideoFpsRanges(constraintAnchor2);
                                                return;
                                            }
                                        }
                                        linearSystem.addGreaterThan(solverVariable2, solverVariable11, i26, i36);
                                        return;
                                    }
                                    return;
                                }
                            }
                            i24 = i21;
                            if (z24) {
                            }
                            if (z25) {
                            }
                            if (z25) {
                            }
                            i25 = 5;
                            i26 = 0;
                            i36 = i25;
                            if (z25) {
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                    i26 = 0;
                    solverVariable11 = solverVariable4;
                    i25 = 5;
                } else {
                    i36 = (z2 && (constraintAnchor.mTarget.mOwner instanceof androidx.constraintlayout.core.widgets.Barrier)) ? 8 : 5;
                    z25 = z2;
                    i26 = 0;
                    solverVariable11 = solverVariable4;
                    if (z25) {
                    }
                }
                z25 = z2;
                i36 = i25;
                if (z25) {
                }
            }
        }
        z12 = false;
        i10 = this.version;
        if (i10 == -1) {
        }
        i10 = i2;
        z13 = z12;
        i11 = this.AMEXKernel;
        if (i11 != -1) {
        }
        z14 = z13;
        int i392 = i10;
        if (this.free != 8) {
        }
        if (z11) {
        }
        if (z15) {
        }
        if (z11) {
        }
        androidx.constraintlayout.core.SolverVariable solverVariable122 = solverVariable4;
        if (i14 >= i16) {
        }
    }

    public void updateFromSolver(androidx.constraintlayout.core.LinearSystem linearSystem, boolean z) {
        androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun verticalWidgetRun;
        androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun horizontalWidgetRun;
        int objectVariableValue = linearSystem.getObjectVariableValue(this.mLeft);
        int objectVariableValue2 = linearSystem.getObjectVariableValue(this.mTop);
        int objectVariableValue3 = linearSystem.getObjectVariableValue(this.mRight);
        int objectVariableValue4 = linearSystem.getObjectVariableValue(this.mBottom);
        if (z && (horizontalWidgetRun = this.mHorizontalRun) != null && horizontalWidgetRun.start.resolved && this.mHorizontalRun.end.resolved) {
            objectVariableValue = this.mHorizontalRun.start.value;
            objectVariableValue3 = this.mHorizontalRun.end.value;
        }
        if (z && (verticalWidgetRun = this.mVerticalRun) != null && verticalWidgetRun.start.resolved && this.mVerticalRun.end.resolved) {
            objectVariableValue2 = this.mVerticalRun.start.value;
            objectVariableValue4 = this.mVerticalRun.end.value;
        }
        if (objectVariableValue3 - objectVariableValue < 0 || objectVariableValue4 - objectVariableValue2 < 0 || objectVariableValue == Integer.MIN_VALUE || objectVariableValue == Integer.MAX_VALUE || objectVariableValue2 == Integer.MIN_VALUE || objectVariableValue2 == Integer.MAX_VALUE || objectVariableValue3 == Integer.MIN_VALUE || objectVariableValue3 == Integer.MAX_VALUE || objectVariableValue4 == Integer.MIN_VALUE || objectVariableValue4 == Integer.MAX_VALUE) {
            objectVariableValue = 0;
            objectVariableValue4 = 0;
            objectVariableValue2 = 0;
            objectVariableValue3 = 0;
        }
        setFrame(objectVariableValue, objectVariableValue2, objectVariableValue3, objectVariableValue4);
    }

    public void copy(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, java.util.HashMap<androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.ConstraintWidget> hashMap) {
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
        this.coroutineCreation = constraintWidget.coroutineCreation;
        this.ArtificialStackFrames = constraintWidget.ArtificialStackFrames;
        int[] iArr3 = constraintWidget.l;
        this.l = java.util.Arrays.copyOf(iArr3, iArr3.length);
        this.mCircleConstraintAngle = constraintWidget.mCircleConstraintAngle;
        this.c = constraintWidget.c;
        this.resetTransaction = constraintWidget.resetTransaction;
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.getHighSpeedVideoSizes.reset();
        this.getInputSizeshNQ4ISI.reset();
        this.mCenter.reset();
        this.mListDimensionBehaviors = (androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[]) java.util.Arrays.copyOf(this.mListDimensionBehaviors, 2);
        this.mParent = this.mParent == null ? null : hashMap.get(constraintWidget.mParent);
        this.d = constraintWidget.d;
        this.getOutputSizeshNQ4ISI = constraintWidget.getOutputSizeshNQ4ISI;
        this.mDimensionRatio = constraintWidget.mDimensionRatio;
        this.mDimensionRatioSide = constraintWidget.mDimensionRatioSide;
        this.mX = constraintWidget.mX;
        this.mY = constraintWidget.mY;
        this.isOutputSupportedFor = constraintWidget.isOutputSupportedFor;
        this.toString = constraintWidget.toString;
        this.mOffsetX = constraintWidget.mOffsetX;
        this.mOffsetY = constraintWidget.mOffsetY;
        this.getHighSpeedVideoFpsRangesFor = constraintWidget.getHighSpeedVideoFpsRangesFor;
        this.mMinWidth = constraintWidget.mMinWidth;
        this.mMinHeight = constraintWidget.mMinHeight;
        this.getOutputStallDuration = constraintWidget.getOutputStallDuration;
        this.b = constraintWidget.b;
        this.getHighResolutionOutputSizeshNQ4ISI = constraintWidget.getHighResolutionOutputSizeshNQ4ISI;
        this.init = constraintWidget.init;
        this.free = constraintWidget.free;
        this.Camera2StreamConfigurationMap = constraintWidget.Camera2StreamConfigurationMap;
        this.kernelVersion = constraintWidget.kernelVersion;
        this.freeTransaction = constraintWidget.freeTransaction;
        this.getOutputFormats = constraintWidget.getOutputFormats;
        this.getHighSpeedVideoSizesFor = constraintWidget.getHighSpeedVideoSizesFor;
        this.getOutputMinFrameDuration = constraintWidget.getOutputMinFrameDuration;
        this.getInputFormats = constraintWidget.getInputFormats;
        this.unwrapAs = constraintWidget.unwrapAs;
        this.CoroutineDebuggingKt = constraintWidget.CoroutineDebuggingKt;
        this.coroutineBoundary = constraintWidget.coroutineBoundary;
        this.getHighSpeedVideoFpsRanges = constraintWidget.getHighSpeedVideoFpsRanges;
        this.isOutputSupportedForhNQ4ISI = constraintWidget.isOutputSupportedForhNQ4ISI;
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = constraintWidget.getARTIFICIAL_FRAME_PACKAGE_NAME;
        this.getOutputSizes = constraintWidget.getOutputSizes;
        this.f2724a = constraintWidget.f2724a;
        this.getOutputMinFrameDurationlomOqCM = constraintWidget.getOutputMinFrameDurationlomOqCM;
        this._CREATION = constraintWidget._CREATION;
        float[] fArr = this.mWeight;
        float[] fArr2 = constraintWidget.mWeight;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        androidx.constraintlayout.core.widgets.ConstraintWidget[] constraintWidgetArr = this.mListNextMatchConstraintsWidget;
        androidx.constraintlayout.core.widgets.ConstraintWidget[] constraintWidgetArr2 = constraintWidget.mListNextMatchConstraintsWidget;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        androidx.constraintlayout.core.widgets.ConstraintWidget[] constraintWidgetArr3 = this.mNextChainWidget;
        androidx.constraintlayout.core.widgets.ConstraintWidget[] constraintWidgetArr4 = constraintWidget.mNextChainWidget;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = constraintWidget.getValidOutputFormatsForInputhNQ4ISI;
        this.getValidOutputFormatsForInputhNQ4ISI = constraintWidget2 == null ? null : hashMap.get(constraintWidget2);
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget3 = constraintWidget._BOUNDARY;
        this._BOUNDARY = constraintWidget3 != null ? hashMap.get(constraintWidget3) : null;
    }

    public void updateFromRuns(boolean z, boolean z2) {
        int i;
        int i2;
        boolean isResolved = z & this.mHorizontalRun.isResolved();
        boolean isResolved2 = z2 & this.mVerticalRun.isResolved();
        int i3 = this.mHorizontalRun.start.value;
        int i4 = this.mVerticalRun.start.value;
        int i5 = this.mHorizontalRun.end.value;
        int i6 = this.mVerticalRun.end.value;
        if (i5 - i3 < 0 || i6 - i4 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        int i7 = i5 - i3;
        int i8 = i6 - i4;
        if (isResolved) {
            this.mX = i3;
        }
        if (isResolved2) {
            this.mY = i4;
        }
        if (this.free == 8) {
            this.d = 0;
            this.getOutputSizeshNQ4ISI = 0;
            return;
        }
        if (isResolved) {
            if (this.mListDimensionBehaviors[0] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED && i7 < (i2 = this.d)) {
                i7 = i2;
            }
            this.d = i7;
            int i9 = this.mMinWidth;
            if (i7 < i9) {
                this.d = i9;
            }
        }
        if (isResolved2) {
            if (this.mListDimensionBehaviors[1] == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED && i8 < (i = this.getOutputSizeshNQ4ISI)) {
                i8 = i;
            }
            this.getOutputSizeshNQ4ISI = i8;
            int i10 = this.mMinHeight;
            if (i8 < i10) {
                this.getOutputSizeshNQ4ISI = i10;
            }
        }
    }

    public void addChildrenToSolverByDependency(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer, androidx.constraintlayout.core.LinearSystem linearSystem, java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintWidget> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            androidx.constraintlayout.core.widgets.Optimizer.getHighSpeedVideoFpsRanges(constraintWidgetContainer, linearSystem, this);
            hashSet.remove(this);
            addToSolver(linearSystem, constraintWidgetContainer.optimizeFor(64));
        }
        if (i == 0) {
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> dependents = this.mLeft.getDependents();
            if (dependents != null) {
                java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it = dependents.iterator();
                while (it.hasNext()) {
                    it.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
                }
            }
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> dependents2 = this.mRight.getDependents();
            if (dependents2 != null) {
                java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it2 = dependents2.iterator();
                while (it2.hasNext()) {
                    it2.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
                }
                return;
            }
            return;
        }
        java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> dependents3 = this.mTop.getDependents();
        if (dependents3 != null) {
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it3 = dependents3.iterator();
            while (it3.hasNext()) {
                it3.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
        java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> dependents4 = this.mBottom.getDependents();
        if (dependents4 != null) {
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it4 = dependents4.iterator();
            while (it4.hasNext()) {
                it4.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
        java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> dependents5 = this.mBaseline.getDependents();
        if (dependents5 != null) {
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it5 = dependents5.iterator();
            while (it5.hasNext()) {
                it5.next().mOwner.addChildrenToSolverByDependency(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
    }

    public void getSceneString(java.lang.StringBuilder sb) {
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("  ");
        sb2.append(this.stringId);
        sb2.append(":{\n");
        sb.append(sb2.toString());
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("    actualWidth:");
        sb3.append(this.d);
        sb.append(sb3.toString());
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("    actualHeight:");
        sb4.append(this.getOutputSizeshNQ4ISI);
        sb.append(sb4.toString());
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("    actualLeft:");
        sb5.append(this.mX);
        sb.append(sb5.toString());
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("    actualTop:");
        sb6.append(this.mY);
        sb.append(sb6.toString());
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        Camera2StreamConfigurationMap(sb, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, this.mLeft);
        Camera2StreamConfigurationMap(sb, com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, this.mTop);
        Camera2StreamConfigurationMap(sb, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, this.mRight);
        Camera2StreamConfigurationMap(sb, com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, this.mBottom);
        Camera2StreamConfigurationMap(sb, "baseline", this.mBaseline);
        Camera2StreamConfigurationMap(sb, "centerX", this.getHighSpeedVideoSizes);
        Camera2StreamConfigurationMap(sb, "centerY", this.getInputSizeshNQ4ISI);
        int i = this.d;
        int i2 = this.mMinWidth;
        int i3 = this.l[0];
        int i4 = this.mMatchConstraintMinWidth;
        int i5 = this.mMatchConstraintDefaultWidth;
        float f = this.mMatchConstraintPercentWidth;
        androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.mListDimensionBehaviors[0];
        float f2 = this.mWeight[0];
        getHighSpeedVideoSizes(sb, "    width", i, i2, i3, i4, i5, f, dimensionBehaviour);
        int i6 = this.getOutputSizeshNQ4ISI;
        int i7 = this.mMinHeight;
        int i8 = this.l[1];
        int i9 = this.mMatchConstraintMinHeight;
        int i10 = this.mMatchConstraintDefaultHeight;
        float f3 = this.mMatchConstraintPercentHeight;
        androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.mListDimensionBehaviors[1];
        float f4 = this.mWeight[1];
        getHighSpeedVideoSizes(sb, "    height", i6, i7, i8, i9, i10, f3, dimensionBehaviour2);
        getHighSpeedVideoFpsRanges(sb, "    dimensionRatio", this.mDimensionRatio, this.mDimensionRatioSide);
        getHighResolutionOutputSizeshNQ4ISI(sb, "    horizontalBias", this.getOutputStallDuration, DEFAULT_BIAS);
        getHighResolutionOutputSizeshNQ4ISI(sb, "    verticalBias", this.b, DEFAULT_BIAS);
        Camera2StreamConfigurationMap(sb, "    horizontalChainStyle", this.getOutputSizes, 0);
        Camera2StreamConfigurationMap(sb, "    verticalChainStyle", this.f2724a, 0);
        sb.append("  }");
    }

    private static void getHighSpeedVideoSizes(java.lang.StringBuilder sb, java.lang.String str, int i, int i2, int i3, int i4, int i5, float f, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour) {
        sb.append(str);
        sb.append(" :  {\n");
        java.lang.String obj = dimensionBehaviour.toString();
        if (!androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED.toString().equals(obj)) {
            sb.append("      behavior");
            sb.append(" :   ");
            sb.append(obj);
            sb.append(",\n");
        }
        Camera2StreamConfigurationMap(sb, "      size", i, 0);
        Camera2StreamConfigurationMap(sb, "      min", i2, 0);
        Camera2StreamConfigurationMap(sb, "      max", i3, Integer.MAX_VALUE);
        Camera2StreamConfigurationMap(sb, "      matchMin", i4, 0);
        Camera2StreamConfigurationMap(sb, "      matchDef", i5, 0);
        getHighResolutionOutputSizeshNQ4ISI(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    private static void Camera2StreamConfigurationMap(java.lang.StringBuilder sb, java.lang.String str, androidx.constraintlayout.core.widgets.ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.mTarget == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(constraintAnchor.mTarget);
        sb.append("'");
        if (constraintAnchor.getHighResolutionOutputSizeshNQ4ISI != Integer.MIN_VALUE || constraintAnchor.mMargin != 0) {
            sb.append(",");
            sb.append(constraintAnchor.mMargin);
            if (constraintAnchor.getHighResolutionOutputSizeshNQ4ISI != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(constraintAnchor.getHighResolutionOutputSizeshNQ4ISI);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }
}
