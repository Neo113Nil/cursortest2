package androidx.constraintlayout.core.state;

/* loaded from: classes.dex */
public class ConstraintReference implements androidx.constraintlayout.core.state.Reference {
    private float c;
    final androidx.constraintlayout.core.state.State coroutineBoundary;
    private float d;
    private androidx.constraintlayout.core.widgets.ConstraintWidget init;
    private java.lang.Object release;
    private java.lang.Object startTransaction;
    java.lang.String CoroutineDebuggingKt = null;
    androidx.constraintlayout.core.state.helpers.Facade getOutputMinFrameDuration = null;
    int getInputSizeshNQ4ISI = 0;
    int b = 0;
    float getInputFormats = -1.0f;

    /* renamed from: a, reason: collision with root package name */
    float f2721a = -1.0f;
    protected float mHorizontalBias = 0.5f;
    protected float mVerticalBias = 0.5f;
    protected int mMarginLeft = 0;
    protected int mMarginRight = 0;
    protected int mMarginStart = 0;
    protected int mMarginEnd = 0;
    protected int mMarginTop = 0;
    protected int mMarginBottom = 0;
    protected int mMarginLeftGone = 0;
    protected int mMarginRightGone = 0;
    protected int mMarginStartGone = 0;
    protected int mMarginEndGone = 0;
    protected int mMarginTopGone = 0;
    protected int mMarginBottomGone = 0;
    int getOutputStallDuration = 0;
    int getOutputSizeshNQ4ISI = 0;
    float getOutputStallDurationlomOqCM = Float.NaN;
    float getValidOutputFormatsForInputhNQ4ISI = Float.NaN;
    float toString = Float.NaN;
    float unwrapAs = Float.NaN;
    float isOutputSupportedForhNQ4ISI = Float.NaN;
    float ArtificialStackFrames = Float.NaN;
    float _BOUNDARY = Float.NaN;
    float getARTIFICIAL_FRAME_PACKAGE_NAME = Float.NaN;
    float getHighSpeedVideoFpsRanges = Float.NaN;
    float isOutputSupportedFor = Float.NaN;
    float coroutineCreation = Float.NaN;
    int AMEXKernel = 0;
    protected java.lang.Object mLeftToLeft = null;
    protected java.lang.Object mLeftToRight = null;
    protected java.lang.Object mRightToLeft = null;
    protected java.lang.Object mRightToRight = null;
    protected java.lang.Object mStartToStart = null;
    protected java.lang.Object mStartToEnd = null;
    protected java.lang.Object mEndToStart = null;
    protected java.lang.Object mEndToEnd = null;
    protected java.lang.Object mTopToTop = null;
    protected java.lang.Object mTopToBottom = null;
    java.lang.Object accessartificialFrame = null;
    protected java.lang.Object mBottomToTop = null;
    protected java.lang.Object mBottomToBottom = null;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI = null;
    java.lang.Object getHighSpeedVideoSizes = null;
    java.lang.Object getHighSpeedVideoFpsRangesFor = null;
    java.lang.Object Camera2StreamConfigurationMap = null;
    java.lang.Object getHighSpeedVideoSizesFor = null;
    androidx.constraintlayout.core.state.State.Constraint getOutputSizes = null;
    androidx.constraintlayout.core.state.Dimension getOutputFormats = androidx.constraintlayout.core.state.Dimension.createFixed(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
    androidx.constraintlayout.core.state.Dimension _CREATION = androidx.constraintlayout.core.state.Dimension.createFixed(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
    private java.util.HashMap<java.lang.String, java.lang.Integer> kernelVersion = new java.util.HashMap<>();
    private java.util.HashMap<java.lang.String, java.lang.Float> AMEXKernela = new java.util.HashMap<>();
    androidx.constraintlayout.core.motion.utils.TypedBundle getOutputMinFrameDurationlomOqCM = null;

    /* loaded from: classes6.dex */
    public interface ConstraintReferenceFactory {
        androidx.constraintlayout.core.state.ConstraintReference create(androidx.constraintlayout.core.state.State state);
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setKey(java.lang.Object obj) {
        this.release = obj;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public java.lang.Object getKey() {
        return this.release;
    }

    public void setTag(java.lang.String str) {
        this.CoroutineDebuggingKt = str;
    }

    public java.lang.String getTag() {
        return this.CoroutineDebuggingKt;
    }

    public void setView(java.lang.Object obj) {
        this.startTransaction = obj;
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = this.init;
        if (constraintWidget != null) {
            constraintWidget.setCompanionWidget(obj);
        }
    }

    public java.lang.Object getView() {
        return this.startTransaction;
    }

    public void setFacade(androidx.constraintlayout.core.state.helpers.Facade facade) {
        this.getOutputMinFrameDuration = facade;
        if (facade != null) {
            setConstraintWidget(facade.getConstraintWidget());
        }
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public androidx.constraintlayout.core.state.helpers.Facade getFacade() {
        return this.getOutputMinFrameDuration;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setConstraintWidget(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return;
        }
        this.init = constraintWidget;
        constraintWidget.setCompanionWidget(this.startTransaction);
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public androidx.constraintlayout.core.widgets.ConstraintWidget getConstraintWidget() {
        if (this.init == null) {
            androidx.constraintlayout.core.widgets.ConstraintWidget createConstraintWidget = createConstraintWidget();
            this.init = createConstraintWidget;
            createConstraintWidget.setCompanionWidget(this.startTransaction);
        }
        return this.init;
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget createConstraintWidget() {
        return new androidx.constraintlayout.core.widgets.ConstraintWidget(getWidth().getInputSizeshNQ4ISI, getHeight().getInputSizeshNQ4ISI);
    }

    /* loaded from: classes6.dex */
    static class IncorrectConstraintException extends java.lang.Exception {
        private final java.util.ArrayList<java.lang.String> getHighSpeedVideoFpsRangesFor;

        IncorrectConstraintException(java.util.ArrayList<java.lang.String> arrayList) {
            this.getHighSpeedVideoFpsRangesFor = arrayList;
        }

        @Override // java.lang.Throwable
        public java.lang.String getMessage() {
            return toString();
        }

        @Override // java.lang.Throwable
        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("IncorrectConstraintException: ");
            sb.append(this.getHighSpeedVideoFpsRangesFor.toString());
            return sb.toString();
        }
    }

    public void validate() throws androidx.constraintlayout.core.state.ConstraintReference.IncorrectConstraintException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.mLeftToLeft != null && this.mLeftToRight != null) {
            arrayList.add("LeftToLeft and LeftToRight both defined");
        }
        if (this.mRightToLeft != null && this.mRightToRight != null) {
            arrayList.add("RightToLeft and RightToRight both defined");
        }
        if (this.mStartToStart != null && this.mStartToEnd != null) {
            arrayList.add("StartToStart and StartToEnd both defined");
        }
        if (this.mEndToStart != null && this.mEndToEnd != null) {
            arrayList.add("EndToStart and EndToEnd both defined");
        }
        if ((this.mLeftToLeft != null || this.mLeftToRight != null || this.mRightToLeft != null || this.mRightToRight != null) && (this.mStartToStart != null || this.mStartToEnd != null || this.mEndToStart != null || this.mEndToEnd != null)) {
            arrayList.add("Both left/right and start/end constraints defined");
        }
        if (arrayList.size() > 0) {
            throw new androidx.constraintlayout.core.state.ConstraintReference.IncorrectConstraintException(arrayList);
        }
    }

    public ConstraintReference(androidx.constraintlayout.core.state.State state) {
        this.coroutineBoundary = state;
    }

    public void setHorizontalChainStyle(int i) {
        this.getInputSizeshNQ4ISI = i;
    }

    public int getHorizontalChainStyle() {
        return this.getInputSizeshNQ4ISI;
    }

    public void setVerticalChainStyle(int i) {
        this.b = i;
    }

    public int getVerticalChainStyle(int i) {
        return this.b;
    }

    public float getHorizontalChainWeight() {
        return this.getInputFormats;
    }

    public void setHorizontalChainWeight(float f) {
        this.getInputFormats = f;
    }

    public float getVerticalChainWeight() {
        return this.f2721a;
    }

    public void setVerticalChainWeight(float f) {
        this.f2721a = f;
    }

    public androidx.constraintlayout.core.state.ConstraintReference clearVertical() {
        top().clear();
        baseline().clear();
        bottom().clear();
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference clearHorizontal() {
        start().clear();
        end().clear();
        left().clear();
        right().clear();
        return this;
    }

    public float getTranslationX() {
        return this.ArtificialStackFrames;
    }

    public float getTranslationY() {
        return this._BOUNDARY;
    }

    public float getTranslationZ() {
        return this.getARTIFICIAL_FRAME_PACKAGE_NAME;
    }

    public float getScaleX() {
        return this.isOutputSupportedFor;
    }

    public float getScaleY() {
        return this.coroutineCreation;
    }

    public float getAlpha() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public float getPivotX() {
        return this.getOutputStallDurationlomOqCM;
    }

    public float getPivotY() {
        return this.getValidOutputFormatsForInputhNQ4ISI;
    }

    public float getRotationX() {
        return this.toString;
    }

    public float getRotationY() {
        return this.unwrapAs;
    }

    public float getRotationZ() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    public androidx.constraintlayout.core.state.ConstraintReference pivotX(float f) {
        this.getOutputStallDurationlomOqCM = f;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference pivotY(float f) {
        this.getValidOutputFormatsForInputhNQ4ISI = f;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference rotationX(float f) {
        this.toString = f;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference rotationY(float f) {
        this.unwrapAs = f;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference rotationZ(float f) {
        this.isOutputSupportedForhNQ4ISI = f;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference translationX(float f) {
        this.ArtificialStackFrames = f;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference translationY(float f) {
        this._BOUNDARY = f;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference translationZ(float f) {
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = f;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference scaleX(float f) {
        this.isOutputSupportedFor = f;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference scaleY(float f) {
        this.coroutineCreation = f;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference alpha(float f) {
        this.getHighSpeedVideoFpsRanges = f;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference visibility(int i) {
        this.AMEXKernel = i;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference left() {
        if (this.mLeftToLeft != null) {
            this.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.LEFT_TO_LEFT;
            return this;
        }
        this.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.LEFT_TO_RIGHT;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference right() {
        if (this.mRightToLeft != null) {
            this.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.RIGHT_TO_LEFT;
            return this;
        }
        this.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.RIGHT_TO_RIGHT;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference start() {
        if (this.mStartToStart != null) {
            this.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.START_TO_START;
            return this;
        }
        this.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.START_TO_END;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference end() {
        if (this.mEndToStart != null) {
            this.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.END_TO_START;
            return this;
        }
        this.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.END_TO_END;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference top() {
        if (this.mTopToTop != null) {
            this.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.TOP_TO_TOP;
            return this;
        }
        this.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.TOP_TO_BOTTOM;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference bottom() {
        if (this.mBottomToTop != null) {
            this.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_TOP;
            return this;
        }
        this.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_BOTTOM;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference baseline() {
        this.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_BASELINE;
        return this;
    }

    public void addCustomColor(java.lang.String str, int i) {
        this.kernelVersion.put(str, java.lang.Integer.valueOf(i));
    }

    public void addCustomFloat(java.lang.String str, float f) {
        if (this.AMEXKernela == null) {
            this.AMEXKernela = new java.util.HashMap<>();
        }
        this.AMEXKernela.put(str, java.lang.Float.valueOf(f));
    }

    public androidx.constraintlayout.core.state.ConstraintReference leftToLeft(java.lang.Object obj) {
        this.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.LEFT_TO_LEFT;
        this.mLeftToLeft = obj;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference leftToRight(java.lang.Object obj) {
        this.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.LEFT_TO_RIGHT;
        this.mLeftToRight = obj;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference rightToLeft(java.lang.Object obj) {
        this.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.RIGHT_TO_LEFT;
        this.mRightToLeft = obj;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference rightToRight(java.lang.Object obj) {
        this.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.RIGHT_TO_RIGHT;
        this.mRightToRight = obj;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference startToStart(java.lang.Object obj) {
        this.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.START_TO_START;
        this.mStartToStart = obj;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference startToEnd(java.lang.Object obj) {
        this.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.START_TO_END;
        this.mStartToEnd = obj;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference endToStart(java.lang.Object obj) {
        this.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.END_TO_START;
        this.mEndToStart = obj;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference endToEnd(java.lang.Object obj) {
        this.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.END_TO_END;
        this.mEndToEnd = obj;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference topToTop(java.lang.Object obj) {
        this.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.TOP_TO_TOP;
        this.mTopToTop = obj;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference topToBottom(java.lang.Object obj) {
        this.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.TOP_TO_BOTTOM;
        this.mTopToBottom = obj;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference bottomToTop(java.lang.Object obj) {
        this.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_TOP;
        this.mBottomToTop = obj;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference bottomToBottom(java.lang.Object obj) {
        this.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_BOTTOM;
        this.mBottomToBottom = obj;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference baselineToBaseline(java.lang.Object obj) {
        this.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_BASELINE;
        this.getHighSpeedVideoSizes = obj;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference baselineToTop(java.lang.Object obj) {
        this.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_TOP;
        this.getHighSpeedVideoFpsRangesFor = obj;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference baselineToBottom(java.lang.Object obj) {
        this.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_BOTTOM;
        this.Camera2StreamConfigurationMap = obj;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference width(androidx.constraintlayout.core.state.Dimension dimension) {
        return setWidth(dimension);
    }

    public androidx.constraintlayout.core.state.ConstraintReference height(androidx.constraintlayout.core.state.Dimension dimension) {
        return setHeight(dimension);
    }

    public androidx.constraintlayout.core.state.Dimension getWidth() {
        return this.getOutputFormats;
    }

    public androidx.constraintlayout.core.state.ConstraintReference setWidth(androidx.constraintlayout.core.state.Dimension dimension) {
        this.getOutputFormats = dimension;
        return this;
    }

    public androidx.constraintlayout.core.state.Dimension getHeight() {
        return this._CREATION;
    }

    public androidx.constraintlayout.core.state.ConstraintReference setHeight(androidx.constraintlayout.core.state.Dimension dimension) {
        this._CREATION = dimension;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference margin(java.lang.Object obj) {
        return margin(this.coroutineBoundary.convertDimension(obj));
    }

    public androidx.constraintlayout.core.state.ConstraintReference marginGone(java.lang.Object obj) {
        return marginGone(this.coroutineBoundary.convertDimension(obj));
    }

    /* renamed from: androidx.constraintlayout.core.state.ConstraintReference$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[androidx.constraintlayout.core.state.State.Constraint.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[androidx.constraintlayout.core.state.State.Constraint.LEFT_TO_LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.state.State.Constraint.LEFT_TO_RIGHT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.state.State.Constraint.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.state.State.Constraint.RIGHT_TO_RIGHT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.state.State.Constraint.START_TO_START.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.state.State.Constraint.START_TO_END.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.state.State.Constraint.END_TO_START.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.state.State.Constraint.END_TO_END.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.state.State.Constraint.TOP_TO_TOP.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.state.State.Constraint.TOP_TO_BOTTOM.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.state.State.Constraint.TOP_TO_BASELINE.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_TOP.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_BOTTOM.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_BASELINE.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_BOTTOM.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_TOP.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_BASELINE.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.state.State.Constraint.CIRCULAR_CONSTRAINT.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.state.State.Constraint.CENTER_HORIZONTALLY.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.constraintlayout.core.state.State.Constraint.CENTER_VERTICALLY.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
        }
    }

    public androidx.constraintlayout.core.state.ConstraintReference margin(int i) {
        if (this.getOutputSizes != null) {
            switch (androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.getHighSpeedVideoFpsRanges[this.getOutputSizes.ordinal()]) {
                case 1:
                case 2:
                    this.mMarginLeft = i;
                    break;
                case 3:
                case 4:
                    this.mMarginRight = i;
                    break;
                case 5:
                case 6:
                    this.mMarginStart = i;
                    break;
                case 7:
                case 8:
                    this.mMarginEnd = i;
                    break;
                case 9:
                case 10:
                case 11:
                    this.mMarginTop = i;
                    break;
                case 12:
                case 13:
                case 14:
                    this.mMarginBottom = i;
                    break;
                case 15:
                case 16:
                case 17:
                    this.getOutputStallDuration = i;
                    break;
                case 18:
                    this.d = i;
                    break;
            }
            return this;
        }
        this.mMarginLeft = i;
        this.mMarginRight = i;
        this.mMarginStart = i;
        this.mMarginEnd = i;
        this.mMarginTop = i;
        this.mMarginBottom = i;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference marginGone(int i) {
        if (this.getOutputSizes != null) {
            switch (androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.getHighSpeedVideoFpsRanges[this.getOutputSizes.ordinal()]) {
                case 1:
                case 2:
                    this.mMarginLeftGone = i;
                    break;
                case 3:
                case 4:
                    this.mMarginRightGone = i;
                    break;
                case 5:
                case 6:
                    this.mMarginStartGone = i;
                    break;
                case 7:
                case 8:
                    this.mMarginEndGone = i;
                    break;
                case 9:
                case 10:
                case 11:
                    this.mMarginTopGone = i;
                    break;
                case 12:
                case 13:
                case 14:
                    this.mMarginBottomGone = i;
                    break;
                case 15:
                case 16:
                case 17:
                    this.getOutputSizeshNQ4ISI = i;
                    break;
            }
            return this;
        }
        this.mMarginLeftGone = i;
        this.mMarginRightGone = i;
        this.mMarginStartGone = i;
        this.mMarginEndGone = i;
        this.mMarginTopGone = i;
        this.mMarginBottomGone = i;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference horizontalBias(float f) {
        this.mHorizontalBias = f;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference verticalBias(float f) {
        this.mVerticalBias = f;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public androidx.constraintlayout.core.state.ConstraintReference bias(float f) {
        if (this.getOutputSizes != null) {
            int i = androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.getHighSpeedVideoFpsRanges[this.getOutputSizes.ordinal()];
            if (i != 19) {
                if (i != 20) {
                    switch (i) {
                    }
                }
                this.mVerticalBias = f;
                return this;
            }
            this.mHorizontalBias = f;
        }
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference clearAll() {
        this.mLeftToLeft = null;
        this.mLeftToRight = null;
        this.mMarginLeft = 0;
        this.mRightToLeft = null;
        this.mRightToRight = null;
        this.mMarginRight = 0;
        this.mStartToStart = null;
        this.mStartToEnd = null;
        this.mMarginStart = 0;
        this.mEndToStart = null;
        this.mEndToEnd = null;
        this.mMarginEnd = 0;
        this.mTopToTop = null;
        this.mTopToBottom = null;
        this.mMarginTop = 0;
        this.mBottomToTop = null;
        this.mBottomToBottom = null;
        this.mMarginBottom = 0;
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoSizesFor = null;
        this.mHorizontalBias = 0.5f;
        this.mVerticalBias = 0.5f;
        this.mMarginLeftGone = 0;
        this.mMarginRightGone = 0;
        this.mMarginStartGone = 0;
        this.mMarginEndGone = 0;
        this.mMarginTopGone = 0;
        this.mMarginBottomGone = 0;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference clear() {
        if (this.getOutputSizes != null) {
            switch (androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.getHighSpeedVideoFpsRanges[this.getOutputSizes.ordinal()]) {
                case 1:
                case 2:
                    this.mLeftToLeft = null;
                    this.mLeftToRight = null;
                    this.mMarginLeft = 0;
                    this.mMarginLeftGone = 0;
                    break;
                case 3:
                case 4:
                    this.mRightToLeft = null;
                    this.mRightToRight = null;
                    this.mMarginRight = 0;
                    this.mMarginRightGone = 0;
                    break;
                case 5:
                case 6:
                    this.mStartToStart = null;
                    this.mStartToEnd = null;
                    this.mMarginStart = 0;
                    this.mMarginStartGone = 0;
                    break;
                case 7:
                case 8:
                    this.mEndToStart = null;
                    this.mEndToEnd = null;
                    this.mMarginEnd = 0;
                    this.mMarginEndGone = 0;
                    break;
                case 9:
                case 10:
                case 11:
                    this.mTopToTop = null;
                    this.mTopToBottom = null;
                    this.accessartificialFrame = null;
                    this.mMarginTop = 0;
                    this.mMarginTopGone = 0;
                    break;
                case 12:
                case 13:
                case 14:
                    this.mBottomToTop = null;
                    this.mBottomToBottom = null;
                    this.getHighResolutionOutputSizeshNQ4ISI = null;
                    this.mMarginBottom = 0;
                    this.mMarginBottomGone = 0;
                    break;
                case 17:
                    this.getHighSpeedVideoSizes = null;
                    break;
                case 18:
                    this.getHighSpeedVideoSizesFor = null;
                    break;
            }
            return this;
        }
        clearAll();
        return this;
    }

    public void applyWidgetConstraints() {
        getHighSpeedVideoFpsRangesFor(this.init, this.mLeftToLeft, androidx.constraintlayout.core.state.State.Constraint.LEFT_TO_LEFT);
        getHighSpeedVideoFpsRangesFor(this.init, this.mLeftToRight, androidx.constraintlayout.core.state.State.Constraint.LEFT_TO_RIGHT);
        getHighSpeedVideoFpsRangesFor(this.init, this.mRightToLeft, androidx.constraintlayout.core.state.State.Constraint.RIGHT_TO_LEFT);
        getHighSpeedVideoFpsRangesFor(this.init, this.mRightToRight, androidx.constraintlayout.core.state.State.Constraint.RIGHT_TO_RIGHT);
        getHighSpeedVideoFpsRangesFor(this.init, this.mStartToStart, androidx.constraintlayout.core.state.State.Constraint.START_TO_START);
        getHighSpeedVideoFpsRangesFor(this.init, this.mStartToEnd, androidx.constraintlayout.core.state.State.Constraint.START_TO_END);
        getHighSpeedVideoFpsRangesFor(this.init, this.mEndToStart, androidx.constraintlayout.core.state.State.Constraint.END_TO_START);
        getHighSpeedVideoFpsRangesFor(this.init, this.mEndToEnd, androidx.constraintlayout.core.state.State.Constraint.END_TO_END);
        getHighSpeedVideoFpsRangesFor(this.init, this.mTopToTop, androidx.constraintlayout.core.state.State.Constraint.TOP_TO_TOP);
        getHighSpeedVideoFpsRangesFor(this.init, this.mTopToBottom, androidx.constraintlayout.core.state.State.Constraint.TOP_TO_BOTTOM);
        getHighSpeedVideoFpsRangesFor(this.init, this.accessartificialFrame, androidx.constraintlayout.core.state.State.Constraint.TOP_TO_BASELINE);
        getHighSpeedVideoFpsRangesFor(this.init, this.mBottomToTop, androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_TOP);
        getHighSpeedVideoFpsRangesFor(this.init, this.mBottomToBottom, androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_BOTTOM);
        getHighSpeedVideoFpsRangesFor(this.init, this.getHighResolutionOutputSizeshNQ4ISI, androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_BASELINE);
        getHighSpeedVideoFpsRangesFor(this.init, this.getHighSpeedVideoSizes, androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_BASELINE);
        getHighSpeedVideoFpsRangesFor(this.init, this.getHighSpeedVideoFpsRangesFor, androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_TOP);
        getHighSpeedVideoFpsRangesFor(this.init, this.Camera2StreamConfigurationMap, androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_BOTTOM);
        getHighSpeedVideoFpsRangesFor(this.init, this.getHighSpeedVideoSizesFor, androidx.constraintlayout.core.state.State.Constraint.CIRCULAR_CONSTRAINT);
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void apply() {
        if (this.init != null) {
            androidx.constraintlayout.core.state.helpers.Facade facade = this.getOutputMinFrameDuration;
            if (facade != null) {
                facade.apply();
            }
            this.getOutputFormats.apply(this.coroutineBoundary, this.init, 0);
            this._CREATION.apply(this.coroutineBoundary, this.init, 1);
            java.lang.Object obj = this.mLeftToLeft;
            java.lang.Object obj2 = null;
            if (obj == null) {
                obj = null;
            } else if (!(obj instanceof androidx.constraintlayout.core.state.ConstraintReference)) {
                obj = this.coroutineBoundary.getHighSpeedVideoSizes(obj);
            }
            this.mLeftToLeft = obj;
            java.lang.Object obj3 = this.mLeftToRight;
            if (obj3 == null) {
                obj3 = null;
            } else if (!(obj3 instanceof androidx.constraintlayout.core.state.ConstraintReference)) {
                obj3 = this.coroutineBoundary.getHighSpeedVideoSizes(obj3);
            }
            this.mLeftToRight = obj3;
            java.lang.Object obj4 = this.mRightToLeft;
            if (obj4 == null) {
                obj4 = null;
            } else if (!(obj4 instanceof androidx.constraintlayout.core.state.ConstraintReference)) {
                obj4 = this.coroutineBoundary.getHighSpeedVideoSizes(obj4);
            }
            this.mRightToLeft = obj4;
            java.lang.Object obj5 = this.mRightToRight;
            if (obj5 == null) {
                obj5 = null;
            } else if (!(obj5 instanceof androidx.constraintlayout.core.state.ConstraintReference)) {
                obj5 = this.coroutineBoundary.getHighSpeedVideoSizes(obj5);
            }
            this.mRightToRight = obj5;
            java.lang.Object obj6 = this.mStartToStart;
            if (obj6 == null) {
                obj6 = null;
            } else if (!(obj6 instanceof androidx.constraintlayout.core.state.ConstraintReference)) {
                obj6 = this.coroutineBoundary.getHighSpeedVideoSizes(obj6);
            }
            this.mStartToStart = obj6;
            java.lang.Object obj7 = this.mStartToEnd;
            if (obj7 == null) {
                obj7 = null;
            } else if (!(obj7 instanceof androidx.constraintlayout.core.state.ConstraintReference)) {
                obj7 = this.coroutineBoundary.getHighSpeedVideoSizes(obj7);
            }
            this.mStartToEnd = obj7;
            java.lang.Object obj8 = this.mEndToStart;
            if (obj8 == null) {
                obj8 = null;
            } else if (!(obj8 instanceof androidx.constraintlayout.core.state.ConstraintReference)) {
                obj8 = this.coroutineBoundary.getHighSpeedVideoSizes(obj8);
            }
            this.mEndToStart = obj8;
            java.lang.Object obj9 = this.mEndToEnd;
            if (obj9 == null) {
                obj9 = null;
            } else if (!(obj9 instanceof androidx.constraintlayout.core.state.ConstraintReference)) {
                obj9 = this.coroutineBoundary.getHighSpeedVideoSizes(obj9);
            }
            this.mEndToEnd = obj9;
            java.lang.Object obj10 = this.mTopToTop;
            if (obj10 == null) {
                obj10 = null;
            } else if (!(obj10 instanceof androidx.constraintlayout.core.state.ConstraintReference)) {
                obj10 = this.coroutineBoundary.getHighSpeedVideoSizes(obj10);
            }
            this.mTopToTop = obj10;
            java.lang.Object obj11 = this.mTopToBottom;
            if (obj11 == null) {
                obj11 = null;
            } else if (!(obj11 instanceof androidx.constraintlayout.core.state.ConstraintReference)) {
                obj11 = this.coroutineBoundary.getHighSpeedVideoSizes(obj11);
            }
            this.mTopToBottom = obj11;
            java.lang.Object obj12 = this.mBottomToTop;
            if (obj12 == null) {
                obj12 = null;
            } else if (!(obj12 instanceof androidx.constraintlayout.core.state.ConstraintReference)) {
                obj12 = this.coroutineBoundary.getHighSpeedVideoSizes(obj12);
            }
            this.mBottomToTop = obj12;
            java.lang.Object obj13 = this.mBottomToBottom;
            if (obj13 == null) {
                obj13 = null;
            } else if (!(obj13 instanceof androidx.constraintlayout.core.state.ConstraintReference)) {
                obj13 = this.coroutineBoundary.getHighSpeedVideoSizes(obj13);
            }
            this.mBottomToBottom = obj13;
            java.lang.Object obj14 = this.getHighSpeedVideoSizes;
            if (obj14 == null) {
                obj14 = null;
            } else if (!(obj14 instanceof androidx.constraintlayout.core.state.ConstraintReference)) {
                obj14 = this.coroutineBoundary.getHighSpeedVideoSizes(obj14);
            }
            this.getHighSpeedVideoSizes = obj14;
            java.lang.Object obj15 = this.getHighSpeedVideoFpsRangesFor;
            if (obj15 == null) {
                obj15 = null;
            } else if (!(obj15 instanceof androidx.constraintlayout.core.state.ConstraintReference)) {
                obj15 = this.coroutineBoundary.getHighSpeedVideoSizes(obj15);
            }
            this.getHighSpeedVideoFpsRangesFor = obj15;
            java.lang.Object obj16 = this.Camera2StreamConfigurationMap;
            if (obj16 != null) {
                if (!(obj16 instanceof androidx.constraintlayout.core.state.ConstraintReference)) {
                    obj16 = this.coroutineBoundary.getHighSpeedVideoSizes(obj16);
                }
                obj2 = obj16;
            }
            this.Camera2StreamConfigurationMap = obj2;
            applyWidgetConstraints();
            int i = this.getInputSizeshNQ4ISI;
            if (i != 0) {
                this.init.setHorizontalChainStyle(i);
            }
            int i2 = this.b;
            if (i2 != 0) {
                this.init.setVerticalChainStyle(i2);
            }
            float f = this.getInputFormats;
            if (f != -1.0f) {
                this.init.setHorizontalWeight(f);
            }
            float f2 = this.f2721a;
            if (f2 != -1.0f) {
                this.init.setVerticalWeight(f2);
            }
            this.init.setHorizontalBiasPercent(this.mHorizontalBias);
            this.init.setVerticalBiasPercent(this.mVerticalBias);
            this.init.frame.pivotX = this.getOutputStallDurationlomOqCM;
            this.init.frame.pivotY = this.getValidOutputFormatsForInputhNQ4ISI;
            this.init.frame.rotationX = this.toString;
            this.init.frame.rotationY = this.unwrapAs;
            this.init.frame.rotationZ = this.isOutputSupportedForhNQ4ISI;
            this.init.frame.translationX = this.ArtificialStackFrames;
            this.init.frame.translationY = this._BOUNDARY;
            this.init.frame.translationZ = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
            this.init.frame.scaleX = this.isOutputSupportedFor;
            this.init.frame.scaleY = this.coroutineCreation;
            this.init.frame.alpha = this.getHighSpeedVideoFpsRanges;
            this.init.frame.visibility = this.AMEXKernel;
            this.init.setVisibility(this.AMEXKernel);
            this.init.frame.getHighResolutionOutputSizeshNQ4ISI = this.getOutputMinFrameDurationlomOqCM;
            java.util.HashMap<java.lang.String, java.lang.Integer> hashMap = this.kernelVersion;
            if (hashMap != null) {
                for (java.lang.String str : hashMap.keySet()) {
                    this.init.frame.setCustomAttribute(str, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR, this.kernelVersion.get(str).intValue());
                }
            }
            java.util.HashMap<java.lang.String, java.lang.Float> hashMap2 = this.AMEXKernela;
            if (hashMap2 != null) {
                for (java.lang.String str2 : hashMap2.keySet()) {
                    this.init.frame.setCustomAttribute(str2, 901, this.AMEXKernela.get(str2).floatValue());
                }
            }
        }
    }

    private void getHighSpeedVideoFpsRangesFor(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, java.lang.Object obj, androidx.constraintlayout.core.state.State.Constraint constraint) {
        androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = obj instanceof androidx.constraintlayout.core.state.Reference ? ((androidx.constraintlayout.core.state.Reference) obj).getConstraintWidget() : null;
        if (constraintWidget2 != null) {
            int i = androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.getHighSpeedVideoFpsRanges[constraint.ordinal()];
            switch (androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.getHighSpeedVideoFpsRanges[constraint.ordinal()]) {
                case 1:
                    constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT).connect(constraintWidget2.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT), this.mMarginLeft, this.mMarginLeftGone, false);
                    break;
                case 2:
                    constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT).connect(constraintWidget2.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT), this.mMarginLeft, this.mMarginLeftGone, false);
                    break;
                case 3:
                    constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT).connect(constraintWidget2.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT), this.mMarginRight, this.mMarginRightGone, false);
                    break;
                case 4:
                    constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT).connect(constraintWidget2.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT), this.mMarginRight, this.mMarginRightGone, false);
                    break;
                case 5:
                    constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT).connect(constraintWidget2.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT), this.mMarginStart, this.mMarginStartGone, false);
                    break;
                case 6:
                    constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT).connect(constraintWidget2.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT), this.mMarginStart, this.mMarginStartGone, false);
                    break;
                case 7:
                    constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT).connect(constraintWidget2.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT), this.mMarginEnd, this.mMarginEndGone, false);
                    break;
                case 8:
                    constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT).connect(constraintWidget2.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT), this.mMarginEnd, this.mMarginEndGone, false);
                    break;
                case 9:
                    constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP).connect(constraintWidget2.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP), this.mMarginTop, this.mMarginTopGone, false);
                    break;
                case 10:
                    constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP).connect(constraintWidget2.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM), this.mMarginTop, this.mMarginTopGone, false);
                    break;
                case 11:
                    constraintWidget.immediateConnect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP, constraintWidget2, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE, this.mMarginTop, this.mMarginTopGone);
                    break;
                case 12:
                    constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM).connect(constraintWidget2.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP), this.mMarginBottom, this.mMarginBottomGone, false);
                    break;
                case 13:
                    constraintWidget.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM).connect(constraintWidget2.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM), this.mMarginBottom, this.mMarginBottomGone, false);
                    break;
                case 14:
                    constraintWidget.immediateConnect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM, constraintWidget2, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE, this.mMarginBottom, this.mMarginBottomGone);
                    break;
                case 15:
                    constraintWidget.immediateConnect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE, constraintWidget2, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM, this.getOutputStallDuration, this.getOutputSizeshNQ4ISI);
                    break;
                case 16:
                    constraintWidget.immediateConnect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE, constraintWidget2, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP, this.getOutputStallDuration, this.getOutputSizeshNQ4ISI);
                    break;
                case 17:
                    constraintWidget.immediateConnect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE, constraintWidget2, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE, this.getOutputStallDuration, this.getOutputSizeshNQ4ISI);
                    break;
                case 18:
                    constraintWidget.connectCircularConstraint(constraintWidget2, this.c, (int) this.d);
                    break;
            }
        }
    }

    public androidx.constraintlayout.core.state.ConstraintReference centerHorizontally(java.lang.Object obj) {
        if (obj == null) {
            obj = null;
        } else if (!(obj instanceof androidx.constraintlayout.core.state.ConstraintReference)) {
            obj = this.coroutineBoundary.getHighSpeedVideoSizes(obj);
        }
        this.mStartToStart = obj;
        this.mEndToEnd = obj;
        this.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.CENTER_HORIZONTALLY;
        this.mHorizontalBias = 0.5f;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference centerVertically(java.lang.Object obj) {
        if (obj == null) {
            obj = null;
        } else if (!(obj instanceof androidx.constraintlayout.core.state.ConstraintReference)) {
            obj = this.coroutineBoundary.getHighSpeedVideoSizes(obj);
        }
        this.mTopToTop = obj;
        this.mBottomToBottom = obj;
        this.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.CENTER_VERTICALLY;
        this.mVerticalBias = 0.5f;
        return this;
    }

    public androidx.constraintlayout.core.state.ConstraintReference circularConstraint(java.lang.Object obj, float f, float f2) {
        if (obj == null) {
            obj = null;
        } else if (!(obj instanceof androidx.constraintlayout.core.state.ConstraintReference)) {
            obj = this.coroutineBoundary.getHighSpeedVideoSizes(obj);
        }
        this.getHighSpeedVideoSizesFor = obj;
        this.c = f;
        this.d = f2;
        this.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.CIRCULAR_CONSTRAINT;
        return this;
    }
}
