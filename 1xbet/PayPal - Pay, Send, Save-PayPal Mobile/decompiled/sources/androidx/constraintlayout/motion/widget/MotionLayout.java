package androidx.constraintlayout.motion.widget;

/* loaded from: classes7.dex */
public class MotionLayout extends androidx.constraintlayout.widget.ConstraintLayout implements androidx.core.view.NestedScrollingParent3 {
    public static final int DEBUG_SHOW_NONE = 0;
    public static final int DEBUG_SHOW_PATH = 2;
    public static final int DEBUG_SHOW_PROGRESS = 1;
    public static boolean IS_IN_EDIT_MODE = false;
    public static final int TOUCH_UP_COMPLETE = 0;
    public static final int TOUCH_UP_COMPLETE_TO_END = 2;
    public static final int TOUCH_UP_COMPLETE_TO_START = 1;
    public static final int TOUCH_UP_DECELERATE = 4;
    public static final int TOUCH_UP_DECELERATE_AND_COMPLETE = 5;
    public static final int TOUCH_UP_NEVER_TO_END = 7;
    public static final int TOUCH_UP_NEVER_TO_START = 6;
    public static final int TOUCH_UP_STOP = 3;
    public static final int VELOCITY_LAYOUT = 1;
    public static final int VELOCITY_POST_LAYOUT = 0;
    public static final int VELOCITY_STATIC_LAYOUT = 3;
    public static final int VELOCITY_STATIC_POST_LAYOUT = 2;
    float AMEXKernel;
    private androidx.constraintlayout.motion.widget.DesignTool AMEXKernelCallback;
    private boolean AMEXKernelJNI;
    private long AMEXKernelProvider;
    androidx.constraintlayout.motion.widget.MotionLayout.TransitionState AMEXKernela;
    int ArtificialStackFrames;
    private int BerTlvEncoder;
    int Camera2StreamConfigurationMap;
    int CoroutineDebuggingKt;
    private float IAuthTabCallback;
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> TransactionOutcomeDecoder;
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> TransactionOutcomeDecoderExternalSyntheticLambda0;
    private int TransactionOutcomeDecoderExternalSyntheticLambda1;
    private int[] TransactionOutcomeDecoderExternalSyntheticLambda2;
    private android.view.View TransactionOutcomeDecoderExternalSyntheticLambda3;
    private int TransactionOutcomeDecoderExternalSyntheticLambda4;
    private int TransactionOutcomeDecoderExternalSyntheticLambda5;
    private int TransactionOutcomeDecoderExternalSyntheticLambda6;
    private androidx.constraintlayout.motion.widget.MotionLayout.StateCache TransactionOutcomeDecoderExternalSyntheticLambda7;
    private androidx.constraintlayout.motion.utils.StopLogic TransactionOutcomeDecodera;
    long _BOUNDARY;
    int _CREATION;

    /* renamed from: a, reason: collision with root package name */
    float f2727a;
    androidx.constraintlayout.motion.widget.MotionScene accessartificialFrame;
    private float aid;
    private boolean apply;
    float b;
    android.graphics.Rect c;
    android.view.animation.Interpolator coroutineBoundary;
    float coroutineCreation;
    java.util.ArrayList<java.lang.Integer> d;
    private java.lang.Runnable decode;
    private int encode;
    int exchange;
    private int free;
    private boolean freeTransaction;
    int getARTIFICIAL_FRAME_PACKAGE_NAME;
    int getHighResolutionOutputSizeshNQ4ISI;
    androidx.constraintlayout.motion.widget.MotionLayout.DevModeDraw getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    boolean getHighSpeedVideoSizesFor;
    boolean getInputFormats;
    int getInputSizeshNQ4ISI;
    private java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener> getInterfaceVersion;
    boolean getOutputFormats;
    java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> getOutputMinFrameDuration;
    android.view.animation.Interpolator getOutputMinFrameDurationlomOqCM;
    float getOutputSizes;
    int getOutputSizeshNQ4ISI;
    int getOutputStallDuration;
    boolean getOutputStallDurationlomOqCM;
    androidx.constraintlayout.motion.widget.MotionLayout.Model getValidOutputFormatsForInputhNQ4ISI;
    float init;
    int isOutputSupportedFor;
    int isOutputSupportedForhNQ4ISI;
    private float kernelID;
    float kernelVersion;
    private android.graphics.RectF l;
    protected boolean mMeasureDuringTransition;
    private float newContext;
    private long onExtraCallbackWithResult;
    private androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener onNavigationEvent;
    private float provide;
    private long release;
    private java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> requestGoOnline;
    private boolean requestPINEntry;
    boolean resetTransaction;
    private int rsaCipher;
    private android.graphics.Matrix setup;
    private boolean sha1;
    private androidx.constraintlayout.core.motion.utils.KeyCache start;
    private int startTransaction;
    float toString;
    java.util.HashMap<android.view.View, androidx.constraintlayout.motion.utils.ViewState> unwrapAs;
    private androidx.constraintlayout.motion.widget.MotionLayout.DecelerateInterpolator updateUI;
    private boolean valueOf;
    private boolean values;
    private boolean version;

    protected interface MotionTracker {
        void addMovement(android.view.MotionEvent motionEvent);

        void clear();

        void computeCurrentVelocity(int i);

        void computeCurrentVelocity(int i, float f);

        float getXVelocity();

        float getXVelocity(int i);

        float getYVelocity();

        float getYVelocity(int i);

        void recycle();
    }

    public interface TransitionListener {
        void onTransitionChange(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int i, int i2, float f);

        void onTransitionCompleted(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int i);

        void onTransitionStarted(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int i, int i2);

        void onTransitionTrigger(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, int i, boolean z, float f);
    }

    enum TransitionState {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(android.view.View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(android.view.View view, float f, float f2) {
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(android.view.View view, int i, int i2, int i3, int i4, int i5) {
    }

    static /* synthetic */ boolean getInputSizeshNQ4ISI(androidx.constraintlayout.motion.widget.MotionLayout motionLayout) {
        motionLayout.sha1 = false;
        return false;
    }

    public MotionLayout(android.content.Context context) {
        super(context);
        this.coroutineBoundary = null;
        this.getOutputSizes = 0.0f;
        this.startTransaction = -1;
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
        this.free = -1;
        this.encode = 0;
        this.BerTlvEncoder = 0;
        this.AMEXKernelJNI = true;
        this.getOutputMinFrameDuration = new java.util.HashMap<>();
        this.release = 0L;
        this.IAuthTabCallback = 1.0f;
        this.kernelVersion = 0.0f;
        this.AMEXKernel = 0.0f;
        this.init = 0.0f;
        this.getOutputFormats = false;
        this.getHighSpeedVideoSizesFor = false;
        this.getHighSpeedVideoSizes = 0;
        this.values = false;
        this.TransactionOutcomeDecodera = new androidx.constraintlayout.motion.utils.StopLogic();
        this.updateUI = new androidx.constraintlayout.motion.widget.MotionLayout.DecelerateInterpolator();
        this.getInputFormats = true;
        this.resetTransaction = false;
        this.version = false;
        this.TransactionOutcomeDecoder = null;
        this.TransactionOutcomeDecoderExternalSyntheticLambda0 = null;
        this.requestGoOnline = null;
        this.getInterfaceVersion = null;
        this.rsaCipher = 0;
        this.AMEXKernelProvider = -1L;
        this.newContext = 0.0f;
        this.TransactionOutcomeDecoderExternalSyntheticLambda1 = 0;
        this.provide = 0.0f;
        this.getOutputStallDurationlomOqCM = false;
        this.mMeasureDuringTransition = false;
        this.start = new androidx.constraintlayout.core.motion.utils.KeyCache();
        this.freeTransaction = false;
        this.decode = null;
        this.TransactionOutcomeDecoderExternalSyntheticLambda2 = null;
        this.CoroutineDebuggingKt = 0;
        this.sha1 = false;
        this.ArtificialStackFrames = 0;
        this.unwrapAs = new java.util.HashMap<>();
        this.c = new android.graphics.Rect();
        this.requestPINEntry = false;
        this.AMEXKernela = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.UNDEFINED;
        this.getValidOutputFormatsForInputhNQ4ISI = new androidx.constraintlayout.motion.widget.MotionLayout.Model();
        this.apply = false;
        this.l = new android.graphics.RectF();
        this.TransactionOutcomeDecoderExternalSyntheticLambda3 = null;
        this.setup = null;
        this.d = new java.util.ArrayList<>();
        getHighResolutionOutputSizeshNQ4ISI((android.util.AttributeSet) null);
    }

    public MotionLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.coroutineBoundary = null;
        this.getOutputSizes = 0.0f;
        this.startTransaction = -1;
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
        this.free = -1;
        this.encode = 0;
        this.BerTlvEncoder = 0;
        this.AMEXKernelJNI = true;
        this.getOutputMinFrameDuration = new java.util.HashMap<>();
        this.release = 0L;
        this.IAuthTabCallback = 1.0f;
        this.kernelVersion = 0.0f;
        this.AMEXKernel = 0.0f;
        this.init = 0.0f;
        this.getOutputFormats = false;
        this.getHighSpeedVideoSizesFor = false;
        this.getHighSpeedVideoSizes = 0;
        this.values = false;
        this.TransactionOutcomeDecodera = new androidx.constraintlayout.motion.utils.StopLogic();
        this.updateUI = new androidx.constraintlayout.motion.widget.MotionLayout.DecelerateInterpolator();
        this.getInputFormats = true;
        this.resetTransaction = false;
        this.version = false;
        this.TransactionOutcomeDecoder = null;
        this.TransactionOutcomeDecoderExternalSyntheticLambda0 = null;
        this.requestGoOnline = null;
        this.getInterfaceVersion = null;
        this.rsaCipher = 0;
        this.AMEXKernelProvider = -1L;
        this.newContext = 0.0f;
        this.TransactionOutcomeDecoderExternalSyntheticLambda1 = 0;
        this.provide = 0.0f;
        this.getOutputStallDurationlomOqCM = false;
        this.mMeasureDuringTransition = false;
        this.start = new androidx.constraintlayout.core.motion.utils.KeyCache();
        this.freeTransaction = false;
        this.decode = null;
        this.TransactionOutcomeDecoderExternalSyntheticLambda2 = null;
        this.CoroutineDebuggingKt = 0;
        this.sha1 = false;
        this.ArtificialStackFrames = 0;
        this.unwrapAs = new java.util.HashMap<>();
        this.c = new android.graphics.Rect();
        this.requestPINEntry = false;
        this.AMEXKernela = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.UNDEFINED;
        this.getValidOutputFormatsForInputhNQ4ISI = new androidx.constraintlayout.motion.widget.MotionLayout.Model();
        this.apply = false;
        this.l = new android.graphics.RectF();
        this.TransactionOutcomeDecoderExternalSyntheticLambda3 = null;
        this.setup = null;
        this.d = new java.util.ArrayList<>();
        getHighResolutionOutputSizeshNQ4ISI(attributeSet);
    }

    public MotionLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.coroutineBoundary = null;
        this.getOutputSizes = 0.0f;
        this.startTransaction = -1;
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
        this.free = -1;
        this.encode = 0;
        this.BerTlvEncoder = 0;
        this.AMEXKernelJNI = true;
        this.getOutputMinFrameDuration = new java.util.HashMap<>();
        this.release = 0L;
        this.IAuthTabCallback = 1.0f;
        this.kernelVersion = 0.0f;
        this.AMEXKernel = 0.0f;
        this.init = 0.0f;
        this.getOutputFormats = false;
        this.getHighSpeedVideoSizesFor = false;
        this.getHighSpeedVideoSizes = 0;
        this.values = false;
        this.TransactionOutcomeDecodera = new androidx.constraintlayout.motion.utils.StopLogic();
        this.updateUI = new androidx.constraintlayout.motion.widget.MotionLayout.DecelerateInterpolator();
        this.getInputFormats = true;
        this.resetTransaction = false;
        this.version = false;
        this.TransactionOutcomeDecoder = null;
        this.TransactionOutcomeDecoderExternalSyntheticLambda0 = null;
        this.requestGoOnline = null;
        this.getInterfaceVersion = null;
        this.rsaCipher = 0;
        this.AMEXKernelProvider = -1L;
        this.newContext = 0.0f;
        this.TransactionOutcomeDecoderExternalSyntheticLambda1 = 0;
        this.provide = 0.0f;
        this.getOutputStallDurationlomOqCM = false;
        this.mMeasureDuringTransition = false;
        this.start = new androidx.constraintlayout.core.motion.utils.KeyCache();
        this.freeTransaction = false;
        this.decode = null;
        this.TransactionOutcomeDecoderExternalSyntheticLambda2 = null;
        this.CoroutineDebuggingKt = 0;
        this.sha1 = false;
        this.ArtificialStackFrames = 0;
        this.unwrapAs = new java.util.HashMap<>();
        this.c = new android.graphics.Rect();
        this.requestPINEntry = false;
        this.AMEXKernela = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.UNDEFINED;
        this.getValidOutputFormatsForInputhNQ4ISI = new androidx.constraintlayout.motion.widget.MotionLayout.Model();
        this.apply = false;
        this.l = new android.graphics.RectF();
        this.TransactionOutcomeDecoderExternalSyntheticLambda3 = null;
        this.setup = null;
        this.d = new java.util.ArrayList<>();
        getHighResolutionOutputSizeshNQ4ISI(attributeSet);
    }

    protected long getNanoTime() {
        return java.lang.System.nanoTime();
    }

    protected androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker obtainVelocityTracker() {
        return androidx.constraintlayout.motion.widget.MotionLayout.MyTracker.getHighResolutionOutputSizeshNQ4ISI();
    }

    public void enableTransition(int i, boolean z) {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = getTransition(i);
        if (z) {
            transition.setEnabled(true);
            return;
        }
        if (transition == this.accessartificialFrame.getHighSpeedVideoFpsRangesFor) {
            java.util.Iterator<androidx.constraintlayout.motion.widget.MotionScene.Transition> it = this.accessartificialFrame.getTransitionsWithState(this.getHighResolutionOutputSizeshNQ4ISI).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                androidx.constraintlayout.motion.widget.MotionScene.Transition next = it.next();
                if (next.isEnabled()) {
                    this.accessartificialFrame.getHighSpeedVideoFpsRangesFor = next;
                    break;
                }
            }
        }
        transition.setEnabled(false);
    }

    final void getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState transitionState) {
        if (transitionState == androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED && this.getHighResolutionOutputSizeshNQ4ISI == -1) {
            return;
        }
        androidx.constraintlayout.motion.widget.MotionLayout.TransitionState transitionState2 = this.AMEXKernela;
        this.AMEXKernela = transitionState;
        if (transitionState2 == androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING && transitionState == androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING) {
            getHighSpeedVideoFpsRanges();
        }
        int ordinal = transitionState2.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            if (transitionState == androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING) {
                getHighSpeedVideoFpsRanges();
            }
            if (transitionState == androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED) {
                fireTransitionCompleted();
                return;
            }
            return;
        }
        if (ordinal == 2 && transitionState == androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED) {
            fireTransitionCompleted();
        }
    }

    static class MyTracker implements androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker {
        private static androidx.constraintlayout.motion.widget.MotionLayout.MyTracker getHighResolutionOutputSizeshNQ4ISI = new androidx.constraintlayout.motion.widget.MotionLayout.MyTracker();
        android.view.VelocityTracker getHighSpeedVideoFpsRangesFor;

        private MyTracker() {
        }

        public static androidx.constraintlayout.motion.widget.MotionLayout.MyTracker getHighResolutionOutputSizeshNQ4ISI() {
            getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor = android.view.VelocityTracker.obtain();
            return getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void recycle() {
            android.view.VelocityTracker velocityTracker = this.getHighSpeedVideoFpsRangesFor;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.getHighSpeedVideoFpsRangesFor = null;
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void clear() {
            android.view.VelocityTracker velocityTracker = this.getHighSpeedVideoFpsRangesFor;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void addMovement(android.view.MotionEvent motionEvent) {
            android.view.VelocityTracker velocityTracker = this.getHighSpeedVideoFpsRangesFor;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void computeCurrentVelocity(int i) {
            android.view.VelocityTracker velocityTracker = this.getHighSpeedVideoFpsRangesFor;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void computeCurrentVelocity(int i, float f) {
            android.view.VelocityTracker velocityTracker = this.getHighSpeedVideoFpsRangesFor;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i, f);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getXVelocity() {
            android.view.VelocityTracker velocityTracker = this.getHighSpeedVideoFpsRangesFor;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getYVelocity() {
            android.view.VelocityTracker velocityTracker = this.getHighSpeedVideoFpsRangesFor;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getXVelocity(int i) {
            android.view.VelocityTracker velocityTracker = this.getHighSpeedVideoFpsRangesFor;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity(i);
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getYVelocity(int i) {
            if (this.getHighSpeedVideoFpsRangesFor != null) {
                return getYVelocity(i);
            }
            return 0.0f;
        }
    }

    public void setTransition(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.TransactionOutcomeDecoderExternalSyntheticLambda7 == null) {
                this.TransactionOutcomeDecoderExternalSyntheticLambda7 = new androidx.constraintlayout.motion.widget.MotionLayout.StateCache();
            }
            this.TransactionOutcomeDecoderExternalSyntheticLambda7.getInputSizeshNQ4ISI = i;
            this.TransactionOutcomeDecoderExternalSyntheticLambda7.Camera2StreamConfigurationMap = i2;
            return;
        }
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.accessartificialFrame;
        if (motionScene != null) {
            this.startTransaction = i;
            this.free = i2;
            motionScene.getHighSpeedVideoFpsRanges(i, i2);
            androidx.constraintlayout.motion.widget.MotionLayout.Model model = this.getValidOutputFormatsForInputhNQ4ISI;
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutWidget;
            model.getHighSpeedVideoFpsRangesFor(this.accessartificialFrame.getHighResolutionOutputSizeshNQ4ISI(i), this.accessartificialFrame.getHighResolutionOutputSizeshNQ4ISI(i2));
            rebuildScene();
            this.AMEXKernel = 0.0f;
            transitionToStart();
        }
    }

    public void setTransition(int i) {
        float f;
        if (this.accessartificialFrame != null) {
            androidx.constraintlayout.motion.widget.MotionScene.Transition transition = getTransition(i);
            this.startTransaction = transition.getStartConstraintSetId();
            this.free = transition.getEndConstraintSetId();
            if (!isAttachedToWindow()) {
                if (this.TransactionOutcomeDecoderExternalSyntheticLambda7 == null) {
                    this.TransactionOutcomeDecoderExternalSyntheticLambda7 = new androidx.constraintlayout.motion.widget.MotionLayout.StateCache();
                }
                this.TransactionOutcomeDecoderExternalSyntheticLambda7.getInputSizeshNQ4ISI = this.startTransaction;
                this.TransactionOutcomeDecoderExternalSyntheticLambda7.Camera2StreamConfigurationMap = this.free;
                return;
            }
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i2 == this.startTransaction) {
                f = 0.0f;
            } else {
                f = i2 == this.free ? 1.0f : Float.NaN;
            }
            this.accessartificialFrame.setTransition(transition);
            androidx.constraintlayout.motion.widget.MotionLayout.Model model = this.getValidOutputFormatsForInputhNQ4ISI;
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutWidget;
            model.getHighSpeedVideoFpsRangesFor(this.accessartificialFrame.getHighResolutionOutputSizeshNQ4ISI(this.startTransaction), this.accessartificialFrame.getHighResolutionOutputSizeshNQ4ISI(this.free));
            rebuildScene();
            if (this.AMEXKernel != f) {
                if (f == 0.0f) {
                    getHighSpeedVideoSizes(true);
                    this.accessartificialFrame.getHighResolutionOutputSizeshNQ4ISI(this.startTransaction).applyTo(this);
                } else if (f == 1.0f) {
                    getHighSpeedVideoSizes(false);
                    this.accessartificialFrame.getHighResolutionOutputSizeshNQ4ISI(this.free).applyTo(this);
                }
            }
            this.AMEXKernel = java.lang.Float.isNaN(f) ? 0.0f : f;
            if (java.lang.Float.isNaN(f)) {
                androidx.constraintlayout.motion.widget.Debug.getLocation();
                transitionToStart();
            } else {
                setProgress(f);
            }
        }
    }

    protected void setTransition(androidx.constraintlayout.motion.widget.MotionScene.Transition transition) {
        this.accessartificialFrame.setTransition(transition);
        getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP);
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition2 = this.accessartificialFrame.getHighSpeedVideoFpsRangesFor;
        if (i == (transition2 == null ? -1 : transition2.getHighResolutionOutputSizeshNQ4ISI)) {
            this.AMEXKernel = 1.0f;
            this.kernelVersion = 1.0f;
            this.init = 1.0f;
        } else {
            this.AMEXKernel = 0.0f;
            this.kernelVersion = 0.0f;
            this.init = 0.0f;
        }
        this.onExtraCallbackWithResult = transition.isTransitionFlag(1) ? -1L : getNanoTime();
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition3 = this.accessartificialFrame.getHighSpeedVideoFpsRangesFor;
        int i2 = transition3 == null ? -1 : transition3.getHighSpeedVideoFpsRangesFor;
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition4 = this.accessartificialFrame.getHighSpeedVideoFpsRangesFor;
        int i3 = transition4 != null ? transition4.getHighResolutionOutputSizeshNQ4ISI : -1;
        if (i2 == this.startTransaction && i3 == this.free) {
            return;
        }
        this.startTransaction = i2;
        this.free = i3;
        this.accessartificialFrame.getHighSpeedVideoFpsRanges(i2, i3);
        androidx.constraintlayout.motion.widget.MotionLayout.Model model = this.getValidOutputFormatsForInputhNQ4ISI;
        androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutWidget;
        model.getHighSpeedVideoFpsRangesFor(this.accessartificialFrame.getHighResolutionOutputSizeshNQ4ISI(this.startTransaction), this.accessartificialFrame.getHighResolutionOutputSizeshNQ4ISI(this.free));
        androidx.constraintlayout.motion.widget.MotionLayout.Model model2 = this.getValidOutputFormatsForInputhNQ4ISI;
        int i4 = this.startTransaction;
        int i5 = this.free;
        model2.getHighSpeedVideoSizesFor = i4;
        model2.getHighResolutionOutputSizeshNQ4ISI = i5;
        this.getValidOutputFormatsForInputhNQ4ISI.getHighSpeedVideoSizes();
        rebuildScene();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void loadLayoutDescription(int i) {
        if (i != 0) {
            try {
                androidx.constraintlayout.motion.widget.MotionScene motionScene = new androidx.constraintlayout.motion.widget.MotionScene(getContext(), this, i);
                this.accessartificialFrame = motionScene;
                int i2 = -1;
                if (this.getHighResolutionOutputSizeshNQ4ISI == -1) {
                    androidx.constraintlayout.motion.widget.MotionScene.Transition transition = motionScene.getHighSpeedVideoFpsRangesFor;
                    this.getHighResolutionOutputSizeshNQ4ISI = transition == null ? -1 : transition.getHighSpeedVideoFpsRangesFor;
                    androidx.constraintlayout.motion.widget.MotionScene.Transition transition2 = this.accessartificialFrame.getHighSpeedVideoFpsRangesFor;
                    this.startTransaction = transition2 == null ? -1 : transition2.getHighSpeedVideoFpsRangesFor;
                    androidx.constraintlayout.motion.widget.MotionScene.Transition transition3 = this.accessartificialFrame.getHighSpeedVideoFpsRangesFor;
                    if (transition3 != null) {
                        i2 = transition3.getHighResolutionOutputSizeshNQ4ISI;
                    }
                    this.free = i2;
                }
                if (isAttachedToWindow()) {
                    try {
                        android.view.Display display = getDisplay();
                        this.TransactionOutcomeDecoderExternalSyntheticLambda6 = display == null ? 0 : display.getRotation();
                        androidx.constraintlayout.motion.widget.MotionScene motionScene2 = this.accessartificialFrame;
                        if (motionScene2 != null) {
                            androidx.constraintlayout.widget.ConstraintSet highResolutionOutputSizeshNQ4ISI = motionScene2.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI);
                            this.accessartificialFrame.getHighSpeedVideoFpsRangesFor(this);
                            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> arrayList = this.requestGoOnline;
                            if (arrayList != null) {
                                java.util.Iterator<androidx.constraintlayout.motion.widget.MotionHelper> it = arrayList.iterator();
                                while (it.hasNext()) {
                                    it.next().onFinishedMotionScene(this);
                                }
                            }
                            if (highResolutionOutputSizeshNQ4ISI != null) {
                                highResolutionOutputSizeshNQ4ISI.applyTo(this);
                            }
                            this.startTransaction = this.getHighResolutionOutputSizeshNQ4ISI;
                        }
                        getHighResolutionOutputSizeshNQ4ISI();
                        androidx.constraintlayout.motion.widget.MotionLayout.StateCache stateCache = this.TransactionOutcomeDecoderExternalSyntheticLambda7;
                        if (stateCache != null) {
                            if (this.requestPINEntry) {
                                post(new java.lang.Runnable() { // from class: androidx.constraintlayout.motion.widget.MotionLayout.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        androidx.constraintlayout.motion.widget.MotionLayout.this.TransactionOutcomeDecoderExternalSyntheticLambda7.getHighSpeedVideoSizes();
                                    }
                                });
                                return;
                            } else {
                                stateCache.getHighSpeedVideoSizes();
                                return;
                            }
                        }
                        androidx.constraintlayout.motion.widget.MotionScene motionScene3 = this.accessartificialFrame;
                        if (motionScene3 == null || motionScene3.getHighSpeedVideoFpsRangesFor == null || this.accessartificialFrame.getHighSpeedVideoFpsRangesFor.getAutoTransition() != 4) {
                            return;
                        }
                        transitionToEnd();
                        getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP);
                        getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING);
                        return;
                    } catch (java.lang.Exception e) {
                        throw new java.lang.IllegalArgumentException("unable to parse MotionScene file", e);
                    }
                }
                this.accessartificialFrame = null;
                return;
            } catch (java.lang.Exception e2) {
                throw new java.lang.IllegalArgumentException("unable to parse MotionScene file", e2);
            }
        }
        this.accessartificialFrame = null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int i, int i2, int i3) {
        getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP);
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.startTransaction = -1;
        this.free = -1;
        if (this.mConstraintLayoutSpec != null) {
            this.mConstraintLayoutSpec.updateConstraints(i, i2, i3);
            return;
        }
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.accessartificialFrame;
        if (motionScene != null) {
            motionScene.getHighResolutionOutputSizeshNQ4ISI(i).applyTo(this);
        }
    }

    public void setInterpolatedProgress(float f) {
        if (this.accessartificialFrame != null) {
            getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING);
            android.view.animation.Interpolator interpolator = this.accessartificialFrame.getInterpolator();
            if (interpolator != null) {
                setProgress(interpolator.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setProgress(float f, float f2) {
        if (!isAttachedToWindow()) {
            if (this.TransactionOutcomeDecoderExternalSyntheticLambda7 == null) {
                this.TransactionOutcomeDecoderExternalSyntheticLambda7 = new androidx.constraintlayout.motion.widget.MotionLayout.StateCache();
            }
            this.TransactionOutcomeDecoderExternalSyntheticLambda7.getOutputFormats = f;
            this.TransactionOutcomeDecoderExternalSyntheticLambda7.getInputFormats = f2;
            return;
        }
        setProgress(f);
        getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING);
        this.getOutputSizes = f2;
        if (f2 != 0.0f) {
            getHighSpeedVideoSizes(f2 > 0.0f ? 1.0f : 0.0f);
        } else {
            if (f == 0.0f || f == 1.0f) {
                return;
            }
            getHighSpeedVideoSizes(f > 0.5f ? 1.0f : 0.0f);
        }
    }

    class StateCache {
        float getOutputFormats = Float.NaN;
        float getInputFormats = Float.NaN;
        int getInputSizeshNQ4ISI = -1;
        int Camera2StreamConfigurationMap = -1;
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI = "motion.progress";
        final java.lang.String getHighSpeedVideoFpsRangesFor = "motion.velocity";
        final java.lang.String getHighSpeedVideoSizes = "motion.StartState";
        final java.lang.String getHighSpeedVideoFpsRanges = "motion.EndState";

        StateCache() {
        }

        final void getHighSpeedVideoSizes() {
            int i = this.getInputSizeshNQ4ISI;
            if (i != -1 || this.Camera2StreamConfigurationMap != -1) {
                if (i == -1) {
                    androidx.constraintlayout.motion.widget.MotionLayout.this.transitionToState(this.Camera2StreamConfigurationMap);
                } else {
                    int i2 = this.Camera2StreamConfigurationMap;
                    if (i2 == -1) {
                        androidx.constraintlayout.motion.widget.MotionLayout.this.setState(i, -1, -1);
                    } else {
                        androidx.constraintlayout.motion.widget.MotionLayout.this.setTransition(i, i2);
                    }
                }
                androidx.constraintlayout.motion.widget.MotionLayout.this.getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP);
            }
            if (java.lang.Float.isNaN(this.getInputFormats)) {
                if (java.lang.Float.isNaN(this.getOutputFormats)) {
                    return;
                }
                androidx.constraintlayout.motion.widget.MotionLayout.this.setProgress(this.getOutputFormats);
            } else {
                androidx.constraintlayout.motion.widget.MotionLayout.this.setProgress(this.getOutputFormats, this.getInputFormats);
                this.getOutputFormats = Float.NaN;
                this.getInputFormats = Float.NaN;
                this.getInputSizeshNQ4ISI = -1;
                this.Camera2StreamConfigurationMap = -1;
            }
        }
    }

    public void setTransitionState(android.os.Bundle bundle) {
        if (this.TransactionOutcomeDecoderExternalSyntheticLambda7 == null) {
            this.TransactionOutcomeDecoderExternalSyntheticLambda7 = new androidx.constraintlayout.motion.widget.MotionLayout.StateCache();
        }
        androidx.constraintlayout.motion.widget.MotionLayout.StateCache stateCache = this.TransactionOutcomeDecoderExternalSyntheticLambda7;
        stateCache.getOutputFormats = bundle.getFloat("motion.progress");
        stateCache.getInputFormats = bundle.getFloat("motion.velocity");
        stateCache.getInputSizeshNQ4ISI = bundle.getInt("motion.StartState");
        stateCache.Camera2StreamConfigurationMap = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.TransactionOutcomeDecoderExternalSyntheticLambda7.getHighSpeedVideoSizes();
        }
    }

    public android.os.Bundle getTransitionState() {
        if (this.TransactionOutcomeDecoderExternalSyntheticLambda7 == null) {
            this.TransactionOutcomeDecoderExternalSyntheticLambda7 = new androidx.constraintlayout.motion.widget.MotionLayout.StateCache();
        }
        androidx.constraintlayout.motion.widget.MotionLayout.StateCache stateCache = this.TransactionOutcomeDecoderExternalSyntheticLambda7;
        stateCache.Camera2StreamConfigurationMap = androidx.constraintlayout.motion.widget.MotionLayout.this.free;
        stateCache.getInputSizeshNQ4ISI = androidx.constraintlayout.motion.widget.MotionLayout.this.startTransaction;
        stateCache.getInputFormats = androidx.constraintlayout.motion.widget.MotionLayout.this.getVelocity();
        stateCache.getOutputFormats = androidx.constraintlayout.motion.widget.MotionLayout.this.getProgress();
        androidx.constraintlayout.motion.widget.MotionLayout.StateCache stateCache2 = this.TransactionOutcomeDecoderExternalSyntheticLambda7;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putFloat("motion.progress", stateCache2.getOutputFormats);
        bundle.putFloat("motion.velocity", stateCache2.getInputFormats);
        bundle.putInt("motion.StartState", stateCache2.getInputSizeshNQ4ISI);
        bundle.putInt("motion.EndState", stateCache2.Camera2StreamConfigurationMap);
        return bundle;
    }

    public void setProgress(float f) {
        if (!isAttachedToWindow()) {
            if (this.TransactionOutcomeDecoderExternalSyntheticLambda7 == null) {
                this.TransactionOutcomeDecoderExternalSyntheticLambda7 = new androidx.constraintlayout.motion.widget.MotionLayout.StateCache();
            }
            this.TransactionOutcomeDecoderExternalSyntheticLambda7.getOutputFormats = f;
            return;
        }
        if (f <= 0.0f) {
            if (this.AMEXKernel == 1.0f && this.getHighResolutionOutputSizeshNQ4ISI == this.free) {
                getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING);
            }
            this.getHighResolutionOutputSizeshNQ4ISI = this.startTransaction;
            if (this.AMEXKernel == 0.0f) {
                getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
            }
        } else if (f >= 1.0f) {
            if (this.AMEXKernel == 0.0f && this.getHighResolutionOutputSizeshNQ4ISI == this.startTransaction) {
                getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING);
            }
            this.getHighResolutionOutputSizeshNQ4ISI = this.free;
            if (this.AMEXKernel == 1.0f) {
                getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
            }
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = -1;
            getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING);
        }
        if (this.accessartificialFrame == null) {
            return;
        }
        this.valueOf = true;
        this.init = f;
        this.kernelVersion = f;
        this.onExtraCallbackWithResult = -1L;
        this.release = -1L;
        this.getOutputMinFrameDurationlomOqCM = null;
        this.getOutputFormats = true;
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r12 != 7) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        if ((r0 + ((r14 * r2) - (((r1 * r2) * r2) / 2.0f))) > 1.0f) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009b, code lost:
    
        r0 = r11.TransactionOutcomeDecodera;
        r1 = r11.AMEXKernel;
        r4 = r11.IAuthTabCallback;
        r2 = r11.accessartificialFrame;
        r5 = r2.getHighSpeedVideoFpsRangesFor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
    
        if (r5 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
    
        if (r5.unwrapAs == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
    
        r5 = r2.getHighSpeedVideoFpsRangesFor.unwrapAs.getOutputFormats;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        r2 = r11.accessartificialFrame;
        r6 = r2.getHighSpeedVideoFpsRangesFor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bc, code lost:
    
        if (r6 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        if (r6.unwrapAs == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c4, code lost:
    
        r6 = r2.getHighSpeedVideoFpsRangesFor.unwrapAs.getOutputSizes;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cf, code lost:
    
        r0.config(r1, r13, r14, r4, r5, r6);
        r11.getOutputSizes = 0.0f;
        r7 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ce, code lost:
    
        r6 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b7, code lost:
    
        r5 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r0 = r11.updateUI;
        r1 = r11.AMEXKernel;
        r2 = r11.accessartificialFrame;
        r4 = r2.getHighSpeedVideoFpsRangesFor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007f, code lost:
    
        if (r4 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0085, code lost:
    
        if (r4.unwrapAs == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0087, code lost:
    
        r8 = r2.getHighSpeedVideoFpsRangesFor.unwrapAs.getOutputFormats;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008f, code lost:
    
        r0.getHighSpeedVideoFpsRanges = r14;
        r0.Camera2StreamConfigurationMap = r1;
        r0.getHighSpeedVideoFpsRangesFor = r8;
        r11.getOutputMinFrameDurationlomOqCM = r11.updateUI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0075, code lost:
    
        if ((r0 + ((r14 * r2) + (((r1 * r2) * r2) / 2.0f))) < 0.0f) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void touchAnimateTo(int i, float f, float f2) {
        float f3;
        if (this.accessartificialFrame == null || this.AMEXKernel == f) {
            return;
        }
        this.values = true;
        this.release = getNanoTime();
        this.IAuthTabCallback = this.accessartificialFrame.getDuration() / 1000.0f;
        this.init = f;
        this.getOutputFormats = true;
        float f4 = 1.0f;
        float f5 = 0.0f;
        if (i != 0 && i != 1 && i != 2) {
            if (i == 4) {
                androidx.constraintlayout.motion.widget.MotionLayout.DecelerateInterpolator decelerateInterpolator = this.updateUI;
                float f6 = this.AMEXKernel;
                androidx.constraintlayout.motion.widget.MotionScene motionScene = this.accessartificialFrame;
                androidx.constraintlayout.motion.widget.MotionScene.Transition transition = motionScene.getHighSpeedVideoFpsRangesFor;
                if (transition != null && transition.unwrapAs != null) {
                    f5 = motionScene.getHighSpeedVideoFpsRangesFor.unwrapAs.getOutputFormats;
                }
                decelerateInterpolator.getHighSpeedVideoFpsRanges = f2;
                decelerateInterpolator.Camera2StreamConfigurationMap = f6;
                decelerateInterpolator.getHighSpeedVideoFpsRangesFor = f5;
                this.getOutputMinFrameDurationlomOqCM = this.updateUI;
            } else if (i == 5) {
                float f7 = this.AMEXKernel;
                androidx.constraintlayout.motion.widget.MotionScene motionScene2 = this.accessartificialFrame;
                androidx.constraintlayout.motion.widget.MotionScene.Transition transition2 = motionScene2.getHighSpeedVideoFpsRangesFor;
                float f8 = (transition2 == null || transition2.unwrapAs == null) ? 0.0f : motionScene2.getHighSpeedVideoFpsRangesFor.unwrapAs.getOutputFormats;
                if (f2 > 0.0f) {
                    float f9 = f2 / f8;
                } else {
                    float f10 = (-f2) / f8;
                }
            } else if (i != 6) {
            }
            this.valueOf = false;
            this.release = getNanoTime();
            invalidate();
        }
        if (i == 1 || i == 7) {
            f3 = 0.0f;
        } else {
            if (i != 2 && i != 6) {
                f4 = f;
            }
            f3 = f4;
        }
        androidx.constraintlayout.motion.widget.MotionScene motionScene3 = this.accessartificialFrame;
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition3 = motionScene3.getHighSpeedVideoFpsRangesFor;
        if (transition3 == null || transition3.unwrapAs == null || motionScene3.getHighSpeedVideoFpsRangesFor.unwrapAs.getHighSpeedVideoFpsRanges == 0) {
            androidx.constraintlayout.motion.utils.StopLogic stopLogic = this.TransactionOutcomeDecodera;
            float f11 = this.AMEXKernel;
            float f12 = this.IAuthTabCallback;
            androidx.constraintlayout.motion.widget.MotionScene motionScene4 = this.accessartificialFrame;
            androidx.constraintlayout.motion.widget.MotionScene.Transition transition4 = motionScene4.getHighSpeedVideoFpsRangesFor;
            float f13 = (transition4 == null || transition4.unwrapAs == null) ? 0.0f : motionScene4.getHighSpeedVideoFpsRangesFor.unwrapAs.getOutputFormats;
            androidx.constraintlayout.motion.widget.MotionScene motionScene5 = this.accessartificialFrame;
            androidx.constraintlayout.motion.widget.MotionScene.Transition transition5 = motionScene5.getHighSpeedVideoFpsRangesFor;
            stopLogic.config(f11, f3, f2, f12, f13, (transition5 == null || transition5.unwrapAs == null) ? 0.0f : motionScene5.getHighSpeedVideoFpsRangesFor.unwrapAs.getOutputSizes);
        } else {
            androidx.constraintlayout.motion.utils.StopLogic stopLogic2 = this.TransactionOutcomeDecodera;
            float f14 = this.AMEXKernel;
            androidx.constraintlayout.motion.widget.MotionScene motionScene6 = this.accessartificialFrame;
            androidx.constraintlayout.motion.widget.MotionScene.Transition transition6 = motionScene6.getHighSpeedVideoFpsRangesFor;
            float f15 = (transition6 == null || transition6.unwrapAs == null) ? 0.0f : motionScene6.getHighSpeedVideoFpsRangesFor.unwrapAs.toString;
            androidx.constraintlayout.motion.widget.MotionScene motionScene7 = this.accessartificialFrame;
            androidx.constraintlayout.motion.widget.MotionScene.Transition transition7 = motionScene7.getHighSpeedVideoFpsRangesFor;
            float f16 = (transition7 == null || transition7.unwrapAs == null) ? 0.0f : motionScene7.getHighSpeedVideoFpsRangesFor.unwrapAs.CoroutineDebuggingKt;
            androidx.constraintlayout.motion.widget.MotionScene motionScene8 = this.accessartificialFrame;
            androidx.constraintlayout.motion.widget.MotionScene.Transition transition8 = motionScene8.getHighSpeedVideoFpsRangesFor;
            float f17 = (transition8 == null || transition8.unwrapAs == null) ? 0.0f : motionScene8.getHighSpeedVideoFpsRangesFor.unwrapAs.getValidOutputFormatsForInputhNQ4ISI;
            androidx.constraintlayout.motion.widget.MotionScene motionScene9 = this.accessartificialFrame;
            androidx.constraintlayout.motion.widget.MotionScene.Transition transition9 = motionScene9.getHighSpeedVideoFpsRangesFor;
            float f18 = (transition9 == null || transition9.unwrapAs == null) ? 0.0f : motionScene9.getHighSpeedVideoFpsRangesFor.unwrapAs.accessartificialFrame;
            androidx.constraintlayout.motion.widget.MotionScene motionScene10 = this.accessartificialFrame;
            androidx.constraintlayout.motion.widget.MotionScene.Transition transition10 = motionScene10.getHighSpeedVideoFpsRangesFor;
            stopLogic2.springConfig(f14, f3, f2, f15, f16, f17, f18, (transition10 == null || transition10.unwrapAs == null) ? 0 : motionScene10.getHighSpeedVideoFpsRangesFor.unwrapAs.isOutputSupportedForhNQ4ISI);
        }
        float f19 = f3;
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        this.init = f19;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        this.getOutputMinFrameDurationlomOqCM = this.TransactionOutcomeDecodera;
        this.valueOf = false;
        this.release = getNanoTime();
        invalidate();
    }

    public void touchSpringTo(float f, float f2) {
        if (this.accessartificialFrame == null || this.AMEXKernel == f) {
            return;
        }
        this.values = true;
        this.release = getNanoTime();
        this.IAuthTabCallback = this.accessartificialFrame.getDuration() / 1000.0f;
        this.init = f;
        this.getOutputFormats = true;
        androidx.constraintlayout.motion.utils.StopLogic stopLogic = this.TransactionOutcomeDecodera;
        float f3 = this.AMEXKernel;
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.accessartificialFrame;
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = motionScene.getHighSpeedVideoFpsRangesFor;
        float f4 = (transition == null || transition.unwrapAs == null) ? 0.0f : motionScene.getHighSpeedVideoFpsRangesFor.unwrapAs.toString;
        androidx.constraintlayout.motion.widget.MotionScene motionScene2 = this.accessartificialFrame;
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition2 = motionScene2.getHighSpeedVideoFpsRangesFor;
        float f5 = (transition2 == null || transition2.unwrapAs == null) ? 0.0f : motionScene2.getHighSpeedVideoFpsRangesFor.unwrapAs.CoroutineDebuggingKt;
        androidx.constraintlayout.motion.widget.MotionScene motionScene3 = this.accessartificialFrame;
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition3 = motionScene3.getHighSpeedVideoFpsRangesFor;
        float f6 = (transition3 == null || transition3.unwrapAs == null) ? 0.0f : motionScene3.getHighSpeedVideoFpsRangesFor.unwrapAs.getValidOutputFormatsForInputhNQ4ISI;
        androidx.constraintlayout.motion.widget.MotionScene motionScene4 = this.accessartificialFrame;
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition4 = motionScene4.getHighSpeedVideoFpsRangesFor;
        float f7 = (transition4 == null || transition4.unwrapAs == null) ? 0.0f : motionScene4.getHighSpeedVideoFpsRangesFor.unwrapAs.accessartificialFrame;
        androidx.constraintlayout.motion.widget.MotionScene motionScene5 = this.accessartificialFrame;
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition5 = motionScene5.getHighSpeedVideoFpsRangesFor;
        stopLogic.springConfig(f3, f, f2, f4, f5, f6, f7, (transition5 == null || transition5.unwrapAs == null) ? 0 : motionScene5.getHighSpeedVideoFpsRangesFor.unwrapAs.isOutputSupportedForhNQ4ISI);
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        this.init = f;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getOutputMinFrameDurationlomOqCM = this.TransactionOutcomeDecodera;
        this.valueOf = false;
        this.release = getNanoTime();
        invalidate();
    }

    class DecelerateInterpolator extends androidx.constraintlayout.motion.widget.MotionInterpolator {
        float getHighSpeedVideoFpsRangesFor;
        float getHighSpeedVideoFpsRanges = 0.0f;
        float Camera2StreamConfigurationMap = 0.0f;

        DecelerateInterpolator() {
        }

        @Override // androidx.constraintlayout.motion.widget.MotionInterpolator, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2;
            float f3;
            float f4 = this.getHighSpeedVideoFpsRanges;
            if (f4 > 0.0f) {
                float f5 = this.getHighSpeedVideoFpsRangesFor;
                float f6 = f4 / f5;
                if (f6 < f) {
                    f = f6;
                }
                androidx.constraintlayout.motion.widget.MotionLayout.this.getOutputSizes = f4 - (f5 * f);
                f2 = (this.getHighSpeedVideoFpsRanges * f) - (((this.getHighSpeedVideoFpsRangesFor * f) * f) / 2.0f);
                f3 = this.Camera2StreamConfigurationMap;
            } else {
                float f7 = this.getHighSpeedVideoFpsRangesFor;
                float f8 = (-f4) / f7;
                if (f8 < f) {
                    f = f8;
                }
                androidx.constraintlayout.motion.widget.MotionLayout.this.getOutputSizes = f4 + (f7 * f);
                f2 = (this.getHighSpeedVideoFpsRanges * f) + (((this.getHighSpeedVideoFpsRangesFor * f) * f) / 2.0f);
                f3 = this.Camera2StreamConfigurationMap;
            }
            return f2 + f3;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
        public float getVelocity() {
            return androidx.constraintlayout.motion.widget.MotionLayout.this.getOutputSizes;
        }
    }

    private void getHighSpeedVideoSizes(float f) {
        if (this.accessartificialFrame != null) {
            float f2 = this.AMEXKernel;
            float f3 = this.kernelVersion;
            if (f2 != f3 && this.valueOf) {
                this.AMEXKernel = f3;
            }
            float f4 = this.AMEXKernel;
            if (f4 == f) {
                return;
            }
            this.values = false;
            this.init = f;
            this.IAuthTabCallback = r0.getDuration() / 1000.0f;
            setProgress(this.init);
            this.getOutputMinFrameDurationlomOqCM = null;
            this.coroutineBoundary = this.accessartificialFrame.getInterpolator();
            this.valueOf = false;
            this.release = getNanoTime();
            this.getOutputFormats = true;
            this.kernelVersion = f4;
            this.AMEXKernel = f4;
            invalidate();
        }
    }

    public void transitionToStart() {
        getHighSpeedVideoSizes(0.0f);
    }

    public void transitionToStart(java.lang.Runnable runnable) {
        getHighSpeedVideoSizes(0.0f);
        this.decode = runnable;
    }

    public void transitionToEnd() {
        getHighSpeedVideoSizes(1.0f);
        this.decode = null;
    }

    public void transitionToEnd(java.lang.Runnable runnable) {
        getHighSpeedVideoSizes(1.0f);
        this.decode = runnable;
    }

    public void transitionToState(int i) {
        if (!isAttachedToWindow()) {
            if (this.TransactionOutcomeDecoderExternalSyntheticLambda7 == null) {
                this.TransactionOutcomeDecoderExternalSyntheticLambda7 = new androidx.constraintlayout.motion.widget.MotionLayout.StateCache();
            }
            this.TransactionOutcomeDecoderExternalSyntheticLambda7.Camera2StreamConfigurationMap = i;
            return;
        }
        transitionToState(i, -1, -1);
    }

    public void transitionToState(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.TransactionOutcomeDecoderExternalSyntheticLambda7 == null) {
                this.TransactionOutcomeDecoderExternalSyntheticLambda7 = new androidx.constraintlayout.motion.widget.MotionLayout.StateCache();
            }
            this.TransactionOutcomeDecoderExternalSyntheticLambda7.Camera2StreamConfigurationMap = i;
            return;
        }
        transitionToState(i, -1, -1, i2);
    }

    public void transitionToState(int i, int i2, int i3) {
        transitionToState(i, i2, i3, -1);
    }

    public void rotateTo(int i, int i2) {
        this.sha1 = true;
        this.TransactionOutcomeDecoderExternalSyntheticLambda4 = getWidth();
        this.TransactionOutcomeDecoderExternalSyntheticLambda5 = getHeight();
        int rotation = getDisplay().getRotation();
        this.ArtificialStackFrames = (rotation + 1) % 4 <= (this.TransactionOutcomeDecoderExternalSyntheticLambda6 + 1) % 4 ? 2 : 1;
        this.TransactionOutcomeDecoderExternalSyntheticLambda6 = rotation;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            android.view.View childAt = getChildAt(i3);
            androidx.constraintlayout.motion.utils.ViewState viewState = this.unwrapAs.get(childAt);
            if (viewState == null) {
                viewState = new androidx.constraintlayout.motion.utils.ViewState();
                this.unwrapAs.put(childAt, viewState);
            }
            viewState.getState(childAt);
        }
        this.startTransaction = -1;
        this.free = i;
        this.accessartificialFrame.getHighSpeedVideoFpsRanges(-1, i);
        androidx.constraintlayout.motion.widget.MotionLayout.Model model = this.getValidOutputFormatsForInputhNQ4ISI;
        androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutWidget;
        model.getHighSpeedVideoFpsRangesFor((androidx.constraintlayout.widget.ConstraintSet) null, this.accessartificialFrame.getHighResolutionOutputSizeshNQ4ISI(this.free));
        this.kernelVersion = 0.0f;
        this.AMEXKernel = 0.0f;
        invalidate();
        transitionToEnd(new java.lang.Runnable() { // from class: androidx.constraintlayout.motion.widget.MotionLayout.2
            @Override // java.lang.Runnable
            public void run() {
                androidx.constraintlayout.motion.widget.MotionLayout.getInputSizeshNQ4ISI(androidx.constraintlayout.motion.widget.MotionLayout.this);
            }
        });
        if (i2 > 0) {
            this.IAuthTabCallback = i2 / 1000.0f;
        }
    }

    public boolean isInRotation() {
        return this.sha1;
    }

    public void jumpToState(int i) {
        if (!isAttachedToWindow()) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }
        if (this.startTransaction == i) {
            setProgress(0.0f);
        } else if (this.free == i) {
            setProgress(1.0f);
        } else {
            setTransition(i, i);
        }
    }

    public void transitionToState(int i, int i2, int i3, int i4) {
        int convertToConstraintSet;
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.accessartificialFrame;
        if (motionScene != null && motionScene.getHighSpeedVideoFpsRanges != null && (convertToConstraintSet = this.accessartificialFrame.getHighSpeedVideoFpsRanges.convertToConstraintSet(this.getHighResolutionOutputSizeshNQ4ISI, i, i2, i3)) != -1) {
            i = convertToConstraintSet;
        }
        int i5 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i5 != i) {
            if (this.startTransaction == i) {
                getHighSpeedVideoSizes(0.0f);
                if (i4 > 0) {
                    this.IAuthTabCallback = i4 / 1000.0f;
                    return;
                }
                return;
            }
            if (this.free == i) {
                getHighSpeedVideoSizes(1.0f);
                if (i4 > 0) {
                    this.IAuthTabCallback = i4 / 1000.0f;
                    return;
                }
                return;
            }
            this.free = i;
            if (i5 != -1) {
                setTransition(i5, i);
                getHighSpeedVideoSizes(1.0f);
                this.AMEXKernel = 0.0f;
                transitionToEnd();
                if (i4 > 0) {
                    this.IAuthTabCallback = i4 / 1000.0f;
                    return;
                }
                return;
            }
            this.values = false;
            this.init = 1.0f;
            this.kernelVersion = 0.0f;
            this.AMEXKernel = 0.0f;
            this.onExtraCallbackWithResult = getNanoTime();
            this.release = getNanoTime();
            this.valueOf = false;
            this.getOutputMinFrameDurationlomOqCM = null;
            if (i4 == -1) {
                this.IAuthTabCallback = this.accessartificialFrame.getDuration() / 1000.0f;
            }
            this.startTransaction = -1;
            this.accessartificialFrame.getHighSpeedVideoFpsRanges(-1, this.free);
            android.util.SparseArray sparseArray = new android.util.SparseArray();
            if (i4 == 0) {
                this.IAuthTabCallback = this.accessartificialFrame.getDuration() / 1000.0f;
            } else if (i4 > 0) {
                this.IAuthTabCallback = i4 / 1000.0f;
            }
            int childCount = getChildCount();
            this.getOutputMinFrameDuration.clear();
            for (int i6 = 0; i6 < childCount; i6++) {
                android.view.View childAt = getChildAt(i6);
                this.getOutputMinFrameDuration.put(childAt, new androidx.constraintlayout.motion.widget.MotionController(childAt));
                sparseArray.put(childAt.getId(), this.getOutputMinFrameDuration.get(childAt));
            }
            this.getOutputFormats = true;
            androidx.constraintlayout.motion.widget.MotionLayout.Model model = this.getValidOutputFormatsForInputhNQ4ISI;
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutWidget;
            model.getHighSpeedVideoFpsRangesFor((androidx.constraintlayout.widget.ConstraintSet) null, this.accessartificialFrame.getHighResolutionOutputSizeshNQ4ISI(i));
            rebuildScene();
            this.getValidOutputFormatsForInputhNQ4ISI.getHighSpeedVideoFpsRangesFor();
            int childCount2 = getChildCount();
            for (int i7 = 0; i7 < childCount2; i7++) {
                android.view.View childAt2 = getChildAt(i7);
                androidx.constraintlayout.motion.widget.MotionController motionController = this.getOutputMinFrameDuration.get(childAt2);
                if (motionController != null) {
                    motionController.coroutineCreation.isOutputSupportedForhNQ4ISI = 0.0f;
                    motionController.coroutineCreation.getOutputMinFrameDurationlomOqCM = 0.0f;
                    androidx.constraintlayout.motion.widget.MotionPaths motionPaths = motionController.coroutineCreation;
                    float x = childAt2.getX();
                    float y = childAt2.getY();
                    float width = childAt2.getWidth();
                    float height = childAt2.getHeight();
                    motionPaths.isOutputSupportedFor = x;
                    motionPaths.toString = y;
                    motionPaths.unwrapAs = width;
                    motionPaths.getOutputFormats = height;
                    motionController.ArtificialStackFrames.Camera2StreamConfigurationMap(childAt2);
                }
            }
            int width2 = getWidth();
            int height2 = getHeight();
            if (this.requestGoOnline != null) {
                for (int i8 = 0; i8 < childCount; i8++) {
                    androidx.constraintlayout.motion.widget.MotionController motionController2 = this.getOutputMinFrameDuration.get(getChildAt(i8));
                    if (motionController2 != null) {
                        this.accessartificialFrame.getKeyFrames(motionController2);
                    }
                }
                java.util.Iterator<androidx.constraintlayout.motion.widget.MotionHelper> it = this.requestGoOnline.iterator();
                while (it.hasNext()) {
                    it.next().onPreSetup(this, this.getOutputMinFrameDuration);
                }
                for (int i9 = 0; i9 < childCount; i9++) {
                    androidx.constraintlayout.motion.widget.MotionController motionController3 = this.getOutputMinFrameDuration.get(getChildAt(i9));
                    if (motionController3 != null) {
                        motionController3.setup(width2, height2, this.IAuthTabCallback, getNanoTime());
                    }
                }
            } else {
                for (int i10 = 0; i10 < childCount; i10++) {
                    androidx.constraintlayout.motion.widget.MotionController motionController4 = this.getOutputMinFrameDuration.get(getChildAt(i10));
                    if (motionController4 != null) {
                        this.accessartificialFrame.getKeyFrames(motionController4);
                        motionController4.setup(width2, height2, this.IAuthTabCallback, getNanoTime());
                    }
                }
            }
            float staggered = this.accessartificialFrame.getStaggered();
            if (staggered != 0.0f) {
                float f = Float.MAX_VALUE;
                float f2 = -3.4028235E38f;
                for (int i11 = 0; i11 < childCount; i11++) {
                    androidx.constraintlayout.motion.widget.MotionController motionController5 = this.getOutputMinFrameDuration.get(getChildAt(i11));
                    float finalY = motionController5.getFinalY() + motionController5.getFinalX();
                    f = java.lang.Math.min(f, finalY);
                    f2 = java.lang.Math.max(f2, finalY);
                }
                for (int i12 = 0; i12 < childCount; i12++) {
                    androidx.constraintlayout.motion.widget.MotionController motionController6 = this.getOutputMinFrameDuration.get(getChildAt(i12));
                    float finalX = motionController6.getFinalX();
                    float finalY2 = motionController6.getFinalY();
                    motionController6.CoroutineDebuggingKt = 1.0f / (1.0f - staggered);
                    motionController6.getValidOutputFormatsForInputhNQ4ISI = staggered - ((((finalX + finalY2) - f) * staggered) / (f2 - f));
                }
            }
            this.kernelVersion = 0.0f;
            this.AMEXKernel = 0.0f;
            this.getOutputFormats = true;
            invalidate();
        }
    }

    public float getVelocity() {
        return this.getOutputSizes;
    }

    public void getViewVelocity(android.view.View view, float f, float f2, float[] fArr, int i) {
        float f3;
        float[] fArr2;
        double[] dArr;
        float f4 = this.getOutputSizes;
        float f5 = this.AMEXKernel;
        if (this.getOutputMinFrameDurationlomOqCM != null) {
            float signum = java.lang.Math.signum(this.init - f5);
            float interpolation = this.getOutputMinFrameDurationlomOqCM.getInterpolation(this.AMEXKernel + 1.0E-5f);
            float interpolation2 = this.getOutputMinFrameDurationlomOqCM.getInterpolation(this.AMEXKernel);
            f4 = (signum * ((interpolation - interpolation2) / 1.0E-5f)) / this.IAuthTabCallback;
            f5 = interpolation2;
        }
        android.view.animation.Interpolator interpolator = this.getOutputMinFrameDurationlomOqCM;
        if (interpolator instanceof androidx.constraintlayout.motion.widget.MotionInterpolator) {
            f4 = ((androidx.constraintlayout.motion.widget.MotionInterpolator) interpolator).getVelocity();
        }
        float f6 = f4;
        androidx.constraintlayout.motion.widget.MotionController motionController = this.getOutputMinFrameDuration.get(view);
        if ((i & 1) == 0) {
            int width = view.getWidth();
            int height = view.getHeight();
            float highResolutionOutputSizeshNQ4ISI = motionController.getHighResolutionOutputSizeshNQ4ISI(f5, motionController.coroutineBoundary);
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> hashMap = motionController.getHighSpeedVideoFpsRanges;
            androidx.constraintlayout.motion.utils.ViewSpline viewSpline = hashMap == null ? null : hashMap.get("translationX");
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> hashMap2 = motionController.getHighSpeedVideoFpsRanges;
            androidx.constraintlayout.motion.utils.ViewSpline viewSpline2 = hashMap2 == null ? null : hashMap2.get("translationY");
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> hashMap3 = motionController.getHighSpeedVideoFpsRanges;
            androidx.constraintlayout.motion.utils.ViewSpline viewSpline3 = hashMap3 == null ? null : hashMap3.get(androidx.constraintlayout.motion.widget.Key.ROTATION);
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> hashMap4 = motionController.getHighSpeedVideoFpsRanges;
            f3 = f6;
            androidx.constraintlayout.motion.utils.ViewSpline viewSpline4 = hashMap4 == null ? null : hashMap4.get("scaleX");
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewSpline> hashMap5 = motionController.getHighSpeedVideoFpsRanges;
            androidx.constraintlayout.motion.utils.ViewSpline viewSpline5 = hashMap5 == null ? null : hashMap5.get("scaleY");
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> hashMap6 = motionController.getOutputMinFrameDuration;
            androidx.constraintlayout.motion.utils.ViewOscillator viewOscillator = hashMap6 == null ? null : hashMap6.get("translationX");
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> hashMap7 = motionController.getOutputMinFrameDuration;
            androidx.constraintlayout.motion.utils.ViewOscillator viewOscillator2 = hashMap7 == null ? null : hashMap7.get("translationY");
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> hashMap8 = motionController.getOutputMinFrameDuration;
            androidx.constraintlayout.motion.utils.ViewOscillator viewOscillator3 = hashMap8 == null ? null : hashMap8.get(androidx.constraintlayout.motion.widget.Key.ROTATION);
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> hashMap9 = motionController.getOutputMinFrameDuration;
            androidx.constraintlayout.motion.utils.ViewOscillator viewOscillator4 = hashMap9 == null ? null : hashMap9.get("scaleX");
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.utils.ViewOscillator> hashMap10 = motionController.getOutputMinFrameDuration;
            androidx.constraintlayout.motion.utils.ViewOscillator viewOscillator5 = hashMap10 != null ? hashMap10.get("scaleY") : null;
            androidx.constraintlayout.core.motion.utils.VelocityMatrix velocityMatrix = new androidx.constraintlayout.core.motion.utils.VelocityMatrix();
            velocityMatrix.clear();
            velocityMatrix.setRotationVelocity(viewSpline3, highResolutionOutputSizeshNQ4ISI);
            velocityMatrix.setTranslationVelocity(viewSpline, viewSpline2, highResolutionOutputSizeshNQ4ISI);
            velocityMatrix.setScaleVelocity(viewSpline4, viewSpline5, highResolutionOutputSizeshNQ4ISI);
            velocityMatrix.setRotationVelocity(viewOscillator3, highResolutionOutputSizeshNQ4ISI);
            velocityMatrix.setTranslationVelocity(viewOscillator, viewOscillator2, highResolutionOutputSizeshNQ4ISI);
            velocityMatrix.setScaleVelocity(viewOscillator4, viewOscillator5, highResolutionOutputSizeshNQ4ISI);
            androidx.constraintlayout.motion.utils.ViewOscillator viewOscillator6 = viewOscillator5;
            androidx.constraintlayout.core.motion.utils.CurveFit curveFit = motionController.Camera2StreamConfigurationMap;
            if (curveFit != null) {
                double[] dArr2 = motionController.getOutputSizeshNQ4ISI;
                if (dArr2.length > 0) {
                    double d = highResolutionOutputSizeshNQ4ISI;
                    curveFit.getPos(d, dArr2);
                    motionController.Camera2StreamConfigurationMap.getSlope(d, motionController.getOutputSizes);
                    androidx.constraintlayout.motion.widget.MotionPaths motionPaths = motionController.coroutineCreation;
                    androidx.constraintlayout.motion.widget.MotionPaths.getHighSpeedVideoFpsRangesFor(f, f2, fArr, motionController.getOutputMinFrameDurationlomOqCM, motionController.getOutputSizes, motionController.getOutputSizeshNQ4ISI);
                }
                velocityMatrix.applyTransform(f, f2, width, height, fArr);
            } else if (motionController.toString != null) {
                double highResolutionOutputSizeshNQ4ISI2 = motionController.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI, motionController.coroutineBoundary);
                motionController.toString[0].getSlope(highResolutionOutputSizeshNQ4ISI2, motionController.getOutputSizes);
                motionController.toString[0].getPos(highResolutionOutputSizeshNQ4ISI2, motionController.getOutputSizeshNQ4ISI);
                float f7 = motionController.coroutineBoundary[0];
                int i2 = 0;
                while (true) {
                    dArr = motionController.getOutputSizes;
                    if (i2 >= dArr.length) {
                        break;
                    }
                    dArr[i2] = dArr[i2] * f7;
                    i2++;
                }
                androidx.constraintlayout.motion.widget.MotionPaths motionPaths2 = motionController.coroutineCreation;
                androidx.constraintlayout.motion.widget.MotionPaths.getHighSpeedVideoFpsRangesFor(f, f2, fArr, motionController.getOutputMinFrameDurationlomOqCM, dArr, motionController.getOutputSizeshNQ4ISI);
                velocityMatrix.applyTransform(f, f2, width, height, fArr);
            } else {
                float f8 = motionController.getOutputFormats.isOutputSupportedFor - motionController.coroutineCreation.isOutputSupportedFor;
                float f9 = motionController.getOutputFormats.toString - motionController.coroutineCreation.toString;
                float f10 = motionController.getOutputFormats.unwrapAs;
                androidx.constraintlayout.motion.utils.ViewOscillator viewOscillator7 = viewOscillator4;
                float f11 = motionController.coroutineCreation.unwrapAs;
                androidx.constraintlayout.motion.utils.ViewOscillator viewOscillator8 = viewOscillator;
                float f12 = motionController.getOutputFormats.getOutputFormats;
                float f13 = motionController.coroutineCreation.getOutputFormats;
                float f14 = ((1.0f - f) * f8) + ((f8 + (f10 - f11)) * f);
                fArr2 = fArr;
                fArr2[0] = f14;
                fArr2[1] = ((1.0f - f2) * f9) + (((f12 - f13) + f9) * f2);
                velocityMatrix.clear();
                velocityMatrix.setRotationVelocity(viewSpline3, highResolutionOutputSizeshNQ4ISI);
                velocityMatrix.setTranslationVelocity(viewSpline, viewSpline2, highResolutionOutputSizeshNQ4ISI);
                velocityMatrix.setScaleVelocity(viewSpline4, viewSpline5, highResolutionOutputSizeshNQ4ISI);
                velocityMatrix.setRotationVelocity(viewOscillator3, highResolutionOutputSizeshNQ4ISI);
                velocityMatrix.setTranslationVelocity(viewOscillator8, viewOscillator2, highResolutionOutputSizeshNQ4ISI);
                velocityMatrix.setScaleVelocity(viewOscillator7, viewOscillator6, highResolutionOutputSizeshNQ4ISI);
                velocityMatrix.applyTransform(f, f2, width, height, fArr);
            }
            fArr2 = fArr;
        } else {
            f3 = f6;
            fArr2 = fArr;
            motionController.getHighSpeedVideoSizes(f5, f, f2, fArr2);
        }
        if (i < 2) {
            fArr2[0] = fArr2[0] * f3;
            fArr2[1] = fArr2[1] * f3;
        }
    }

    class Model {
        int getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoSizesFor;
        androidx.constraintlayout.core.widgets.ConstraintWidgetContainer Camera2StreamConfigurationMap = new androidx.constraintlayout.core.widgets.ConstraintWidgetContainer();
        androidx.constraintlayout.core.widgets.ConstraintWidgetContainer getHighSpeedVideoSizes = new androidx.constraintlayout.core.widgets.ConstraintWidgetContainer();
        androidx.constraintlayout.widget.ConstraintSet getHighSpeedVideoFpsRanges = null;
        androidx.constraintlayout.widget.ConstraintSet getHighSpeedVideoFpsRangesFor = null;

        Model() {
        }

        private static void getHighResolutionOutputSizeshNQ4ISI(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer, androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer2) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> children = constraintWidgetContainer.getChildren();
            java.util.HashMap<androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.ConstraintWidget> hashMap = new java.util.HashMap<>();
            hashMap.put(constraintWidgetContainer, constraintWidgetContainer2);
            constraintWidgetContainer2.getChildren().clear();
            constraintWidgetContainer2.copy(constraintWidgetContainer, hashMap);
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintWidget> it = children.iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.ConstraintWidget next = it.next();
                if (next instanceof androidx.constraintlayout.core.widgets.Barrier) {
                    constraintWidget = new androidx.constraintlayout.core.widgets.Barrier();
                } else if (next instanceof androidx.constraintlayout.core.widgets.Guideline) {
                    constraintWidget = new androidx.constraintlayout.core.widgets.Guideline();
                } else if (next instanceof androidx.constraintlayout.core.widgets.Flow) {
                    constraintWidget = new androidx.constraintlayout.core.widgets.Flow();
                } else if (next instanceof androidx.constraintlayout.core.widgets.Placeholder) {
                    constraintWidget = new androidx.constraintlayout.core.widgets.Placeholder();
                } else if (next instanceof androidx.constraintlayout.core.widgets.Helper) {
                    constraintWidget = new androidx.constraintlayout.core.widgets.HelperWidget();
                } else {
                    constraintWidget = new androidx.constraintlayout.core.widgets.ConstraintWidget();
                }
                constraintWidgetContainer2.add(constraintWidget);
                hashMap.put(next, constraintWidget);
            }
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintWidget> it2 = children.iterator();
            while (it2.hasNext()) {
                androidx.constraintlayout.core.widgets.ConstraintWidget next2 = it2.next();
                hashMap.get(next2).copy(next2, hashMap);
            }
        }

        final void getHighSpeedVideoFpsRangesFor(androidx.constraintlayout.widget.ConstraintSet constraintSet, androidx.constraintlayout.widget.ConstraintSet constraintSet2) {
            this.getHighSpeedVideoFpsRanges = constraintSet;
            this.getHighSpeedVideoFpsRangesFor = constraintSet2;
            this.Camera2StreamConfigurationMap = new androidx.constraintlayout.core.widgets.ConstraintWidgetContainer();
            this.getHighSpeedVideoSizes = new androidx.constraintlayout.core.widgets.ConstraintWidgetContainer();
            this.Camera2StreamConfigurationMap.setMeasurer(androidx.constraintlayout.motion.widget.MotionLayout.this.mLayoutWidget.getMeasurer());
            this.getHighSpeedVideoSizes.setMeasurer(androidx.constraintlayout.motion.widget.MotionLayout.this.mLayoutWidget.getMeasurer());
            this.Camera2StreamConfigurationMap.removeAllChildren();
            this.getHighSpeedVideoSizes.removeAllChildren();
            getHighResolutionOutputSizeshNQ4ISI(androidx.constraintlayout.motion.widget.MotionLayout.this.mLayoutWidget, this.Camera2StreamConfigurationMap);
            getHighResolutionOutputSizeshNQ4ISI(androidx.constraintlayout.motion.widget.MotionLayout.this.mLayoutWidget, this.getHighSpeedVideoSizes);
            if (androidx.constraintlayout.motion.widget.MotionLayout.this.AMEXKernel > 0.5d) {
                if (constraintSet != null) {
                    getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, constraintSet);
                }
                getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, constraintSet2);
            } else {
                getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, constraintSet2);
                if (constraintSet != null) {
                    getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, constraintSet);
                }
            }
            this.Camera2StreamConfigurationMap.setRtl(androidx.constraintlayout.motion.widget.MotionLayout.this.isRtl());
            this.Camera2StreamConfigurationMap.updateHierarchy();
            this.getHighSpeedVideoSizes.setRtl(androidx.constraintlayout.motion.widget.MotionLayout.this.isRtl());
            this.getHighSpeedVideoSizes.updateHierarchy();
            android.view.ViewGroup.LayoutParams layoutParams = androidx.constraintlayout.motion.widget.MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    this.Camera2StreamConfigurationMap.setHorizontalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                    this.getHighSpeedVideoSizes.setHorizontalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                }
                if (layoutParams.height == -2) {
                    this.Camera2StreamConfigurationMap.setVerticalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                    this.getHighSpeedVideoSizes.setVerticalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void getHighSpeedVideoFpsRanges(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer, androidx.constraintlayout.widget.ConstraintSet constraintSet) {
            android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> sparseArray = new android.util.SparseArray<>();
            androidx.constraintlayout.widget.Constraints.LayoutParams layoutParams = new androidx.constraintlayout.widget.Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, constraintWidgetContainer);
            sparseArray.put(androidx.constraintlayout.motion.widget.MotionLayout.this.getId(), constraintWidgetContainer);
            if (constraintSet != null && constraintSet.mRotate != 0) {
                androidx.constraintlayout.motion.widget.MotionLayout motionLayout = androidx.constraintlayout.motion.widget.MotionLayout.this;
                motionLayout.resolveSystem(this.getHighSpeedVideoSizes, motionLayout.getOptimizationLevel(), android.view.View.MeasureSpec.makeMeasureSpec(androidx.constraintlayout.motion.widget.MotionLayout.this.getHeight(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(androidx.constraintlayout.motion.widget.MotionLayout.this.getWidth(), 1073741824));
            }
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintWidget> it = constraintWidgetContainer.getChildren().iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.ConstraintWidget next = it.next();
                next.setAnimated(true);
                sparseArray.put(((android.view.View) next.getCompanionWidget()).getId(), next);
            }
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintWidget> it2 = constraintWidgetContainer.getChildren().iterator();
            while (it2.hasNext()) {
                androidx.constraintlayout.core.widgets.ConstraintWidget next2 = it2.next();
                android.view.View view = (android.view.View) next2.getCompanionWidget();
                constraintSet.applyToLayoutParams(view.getId(), layoutParams);
                next2.setWidth(constraintSet.getWidth(view.getId()));
                next2.setHeight(constraintSet.getHeight(view.getId()));
                if (view instanceof androidx.constraintlayout.widget.ConstraintHelper) {
                    constraintSet.applyToHelper((androidx.constraintlayout.widget.ConstraintHelper) view, next2, layoutParams, sparseArray);
                    if (view instanceof androidx.constraintlayout.widget.Barrier) {
                        ((androidx.constraintlayout.widget.Barrier) view).validateParams();
                    }
                }
                layoutParams.resolveLayoutDirection(androidx.constraintlayout.motion.widget.MotionLayout.this.getLayoutDirection());
                androidx.constraintlayout.motion.widget.MotionLayout.this.applyConstraintsFromLayoutParams(false, view, next2, layoutParams, sparseArray);
                if (constraintSet.getVisibilityMode(view.getId()) == 1) {
                    next2.setVisibility(view.getVisibility());
                } else {
                    next2.setVisibility(constraintSet.getVisibility(view.getId()));
                }
            }
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintWidget> it3 = constraintWidgetContainer.getChildren().iterator();
            while (it3.hasNext()) {
                androidx.constraintlayout.core.widgets.ConstraintWidget next3 = it3.next();
                if (next3 instanceof androidx.constraintlayout.core.widgets.VirtualLayout) {
                    androidx.constraintlayout.widget.ConstraintHelper constraintHelper = (androidx.constraintlayout.widget.ConstraintHelper) next3.getCompanionWidget();
                    androidx.constraintlayout.core.widgets.Helper helper = (androidx.constraintlayout.core.widgets.Helper) next3;
                    constraintHelper.updatePreLayout(constraintWidgetContainer, helper, sparseArray);
                    ((androidx.constraintlayout.core.widgets.VirtualLayout) helper).captureWidgets();
                }
            }
        }

        private static androidx.constraintlayout.core.widgets.ConstraintWidget getHighSpeedVideoFpsRangesFor(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer, android.view.View view) {
            if (constraintWidgetContainer.getCompanionWidget() == view) {
                return constraintWidgetContainer;
            }
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> children = constraintWidgetContainer.getChildren();
            int size = children.size();
            for (int i = 0; i < size; i++) {
                androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = children.get(i);
                if (constraintWidget.getCompanionWidget() == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        public final void getHighSpeedVideoSizes() {
            Camera2StreamConfigurationMap(androidx.constraintlayout.motion.widget.MotionLayout.this.encode, androidx.constraintlayout.motion.widget.MotionLayout.this.BerTlvEncoder);
            androidx.constraintlayout.motion.widget.MotionLayout.Camera2StreamConfigurationMap(androidx.constraintlayout.motion.widget.MotionLayout.this);
        }

        private void Camera2StreamConfigurationMap(int i, int i2) {
            int mode = android.view.View.MeasureSpec.getMode(i);
            int mode2 = android.view.View.MeasureSpec.getMode(i2);
            androidx.constraintlayout.motion.widget.MotionLayout.this.exchange = mode;
            androidx.constraintlayout.motion.widget.MotionLayout.this.getInputSizeshNQ4ISI = mode2;
            getHighSpeedVideoFpsRangesFor(i, i2);
            if (!(androidx.constraintlayout.motion.widget.MotionLayout.this.getParent() instanceof androidx.constraintlayout.motion.widget.MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
                getHighSpeedVideoFpsRangesFor(i, i2);
                androidx.constraintlayout.motion.widget.MotionLayout.this.getARTIFICIAL_FRAME_PACKAGE_NAME = this.Camera2StreamConfigurationMap.getWidth();
                androidx.constraintlayout.motion.widget.MotionLayout.this._CREATION = this.Camera2StreamConfigurationMap.getHeight();
                androidx.constraintlayout.motion.widget.MotionLayout.this.Camera2StreamConfigurationMap = this.getHighSpeedVideoSizes.getWidth();
                androidx.constraintlayout.motion.widget.MotionLayout.this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoSizes.getHeight();
                androidx.constraintlayout.motion.widget.MotionLayout motionLayout = androidx.constraintlayout.motion.widget.MotionLayout.this;
                motionLayout.mMeasureDuringTransition = (motionLayout.getARTIFICIAL_FRAME_PACKAGE_NAME == androidx.constraintlayout.motion.widget.MotionLayout.this.Camera2StreamConfigurationMap && androidx.constraintlayout.motion.widget.MotionLayout.this._CREATION == androidx.constraintlayout.motion.widget.MotionLayout.this.getHighSpeedVideoFpsRangesFor) ? false : true;
            }
            int i3 = androidx.constraintlayout.motion.widget.MotionLayout.this.getARTIFICIAL_FRAME_PACKAGE_NAME;
            int i4 = androidx.constraintlayout.motion.widget.MotionLayout.this._CREATION;
            if (androidx.constraintlayout.motion.widget.MotionLayout.this.exchange == Integer.MIN_VALUE || androidx.constraintlayout.motion.widget.MotionLayout.this.exchange == 0) {
                i3 = (int) (androidx.constraintlayout.motion.widget.MotionLayout.this.getARTIFICIAL_FRAME_PACKAGE_NAME + (androidx.constraintlayout.motion.widget.MotionLayout.this.toString * (androidx.constraintlayout.motion.widget.MotionLayout.this.Camera2StreamConfigurationMap - androidx.constraintlayout.motion.widget.MotionLayout.this.getARTIFICIAL_FRAME_PACKAGE_NAME)));
            }
            int i5 = i3;
            if (androidx.constraintlayout.motion.widget.MotionLayout.this.getInputSizeshNQ4ISI == Integer.MIN_VALUE || androidx.constraintlayout.motion.widget.MotionLayout.this.getInputSizeshNQ4ISI == 0) {
                i4 = (int) (androidx.constraintlayout.motion.widget.MotionLayout.this._CREATION + (androidx.constraintlayout.motion.widget.MotionLayout.this.toString * (androidx.constraintlayout.motion.widget.MotionLayout.this.getHighSpeedVideoFpsRangesFor - androidx.constraintlayout.motion.widget.MotionLayout.this._CREATION)));
            }
            androidx.constraintlayout.motion.widget.MotionLayout.this.resolveMeasuredDimension(i, i2, i5, i4, this.Camera2StreamConfigurationMap.isWidthMeasuredTooSmall() || this.getHighSpeedVideoSizes.isWidthMeasuredTooSmall(), this.Camera2StreamConfigurationMap.isHeightMeasuredTooSmall() || this.getHighSpeedVideoSizes.isHeightMeasuredTooSmall());
        }

        private void getHighSpeedVideoFpsRangesFor(int i, int i2) {
            int optimizationLevel = androidx.constraintlayout.motion.widget.MotionLayout.this.getOptimizationLevel();
            if (androidx.constraintlayout.motion.widget.MotionLayout.this.getHighResolutionOutputSizeshNQ4ISI == androidx.constraintlayout.motion.widget.MotionLayout.this.getStartState()) {
                androidx.constraintlayout.motion.widget.MotionLayout motionLayout = androidx.constraintlayout.motion.widget.MotionLayout.this;
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer = this.getHighSpeedVideoSizes;
                androidx.constraintlayout.widget.ConstraintSet constraintSet = this.getHighSpeedVideoFpsRangesFor;
                int i3 = (constraintSet == null || constraintSet.mRotate == 0) ? i : i2;
                androidx.constraintlayout.widget.ConstraintSet constraintSet2 = this.getHighSpeedVideoFpsRangesFor;
                motionLayout.resolveSystem(constraintWidgetContainer, optimizationLevel, i3, (constraintSet2 == null || constraintSet2.mRotate == 0) ? i2 : i);
                androidx.constraintlayout.widget.ConstraintSet constraintSet3 = this.getHighSpeedVideoFpsRanges;
                if (constraintSet3 != null) {
                    androidx.constraintlayout.motion.widget.MotionLayout motionLayout2 = androidx.constraintlayout.motion.widget.MotionLayout.this;
                    androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer2 = this.Camera2StreamConfigurationMap;
                    int i4 = constraintSet3.mRotate == 0 ? i : i2;
                    if (this.getHighSpeedVideoFpsRanges.mRotate == 0) {
                        i = i2;
                    }
                    motionLayout2.resolveSystem(constraintWidgetContainer2, optimizationLevel, i4, i);
                    return;
                }
                return;
            }
            androidx.constraintlayout.widget.ConstraintSet constraintSet4 = this.getHighSpeedVideoFpsRanges;
            if (constraintSet4 != null) {
                androidx.constraintlayout.motion.widget.MotionLayout.this.resolveSystem(this.Camera2StreamConfigurationMap, optimizationLevel, constraintSet4.mRotate == 0 ? i : i2, this.getHighSpeedVideoFpsRanges.mRotate == 0 ? i2 : i);
            }
            androidx.constraintlayout.motion.widget.MotionLayout motionLayout3 = androidx.constraintlayout.motion.widget.MotionLayout.this;
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer3 = this.getHighSpeedVideoSizes;
            androidx.constraintlayout.widget.ConstraintSet constraintSet5 = this.getHighSpeedVideoFpsRangesFor;
            int i5 = (constraintSet5 == null || constraintSet5.mRotate == 0) ? i : i2;
            androidx.constraintlayout.widget.ConstraintSet constraintSet6 = this.getHighSpeedVideoFpsRangesFor;
            if (constraintSet6 == null || constraintSet6.mRotate == 0) {
                i = i2;
            }
            motionLayout3.resolveSystem(constraintWidgetContainer3, optimizationLevel, i5, i);
        }

        public final void getHighSpeedVideoFpsRangesFor() {
            int childCount = androidx.constraintlayout.motion.widget.MotionLayout.this.getChildCount();
            androidx.constraintlayout.motion.widget.MotionLayout.this.getOutputMinFrameDuration.clear();
            android.util.SparseArray sparseArray = new android.util.SparseArray();
            int[] iArr = new int[childCount];
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = androidx.constraintlayout.motion.widget.MotionLayout.this.getChildAt(i);
                androidx.constraintlayout.motion.widget.MotionController motionController = new androidx.constraintlayout.motion.widget.MotionController(childAt);
                int id = childAt.getId();
                iArr[i] = id;
                sparseArray.put(id, motionController);
                androidx.constraintlayout.motion.widget.MotionLayout.this.getOutputMinFrameDuration.put(childAt, motionController);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                android.view.View childAt2 = androidx.constraintlayout.motion.widget.MotionLayout.this.getChildAt(i2);
                androidx.constraintlayout.motion.widget.MotionController motionController2 = androidx.constraintlayout.motion.widget.MotionLayout.this.getOutputMinFrameDuration.get(childAt2);
                if (motionController2 != null) {
                    if (this.getHighSpeedVideoFpsRanges == null) {
                        if (androidx.constraintlayout.motion.widget.MotionLayout.this.sha1) {
                            motionController2.setStartState(androidx.constraintlayout.motion.widget.MotionLayout.this.unwrapAs.get(childAt2), childAt2, androidx.constraintlayout.motion.widget.MotionLayout.this.ArtificialStackFrames, androidx.constraintlayout.motion.widget.MotionLayout.this.TransactionOutcomeDecoderExternalSyntheticLambda4, androidx.constraintlayout.motion.widget.MotionLayout.this.TransactionOutcomeDecoderExternalSyntheticLambda5);
                        }
                    } else {
                        androidx.constraintlayout.core.widgets.ConstraintWidget highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap, childAt2);
                        if (highSpeedVideoFpsRangesFor != null) {
                            motionController2.getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.getHighSpeedVideoSizes(androidx.constraintlayout.motion.widget.MotionLayout.this, highSpeedVideoFpsRangesFor), this.getHighSpeedVideoFpsRanges, androidx.constraintlayout.motion.widget.MotionLayout.this.getWidth(), androidx.constraintlayout.motion.widget.MotionLayout.this.getHeight());
                        } else if (androidx.constraintlayout.motion.widget.MotionLayout.this.getHighSpeedVideoSizes != 0) {
                            androidx.constraintlayout.motion.widget.Debug.getLocation();
                            androidx.constraintlayout.motion.widget.Debug.getName(childAt2);
                        }
                    }
                    if (this.getHighSpeedVideoFpsRangesFor != null) {
                        androidx.constraintlayout.core.widgets.ConstraintWidget highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, childAt2);
                        if (highSpeedVideoFpsRangesFor2 != null) {
                            motionController2.Camera2StreamConfigurationMap(androidx.constraintlayout.motion.widget.MotionLayout.getHighSpeedVideoSizes(androidx.constraintlayout.motion.widget.MotionLayout.this, highSpeedVideoFpsRangesFor2), this.getHighSpeedVideoFpsRangesFor, androidx.constraintlayout.motion.widget.MotionLayout.this.getWidth(), androidx.constraintlayout.motion.widget.MotionLayout.this.getHeight());
                        } else if (androidx.constraintlayout.motion.widget.MotionLayout.this.getHighSpeedVideoSizes != 0) {
                            androidx.constraintlayout.motion.widget.Debug.getLocation();
                            androidx.constraintlayout.motion.widget.Debug.getName(childAt2);
                        }
                    }
                }
            }
            for (int i3 = 0; i3 < childCount; i3++) {
                androidx.constraintlayout.motion.widget.MotionController motionController3 = (androidx.constraintlayout.motion.widget.MotionController) sparseArray.get(iArr[i3]);
                int animateRelativeTo = motionController3.getAnimateRelativeTo();
                if (animateRelativeTo != -1) {
                    motionController3.setupRelative((androidx.constraintlayout.motion.widget.MotionController) sparseArray.get(animateRelativeTo));
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        androidx.constraintlayout.motion.widget.MotionScene motionScene;
        if (!this.mMeasureDuringTransition && this.getHighResolutionOutputSizeshNQ4ISI == -1 && (motionScene = this.accessartificialFrame) != null && motionScene.getHighSpeedVideoFpsRangesFor != null) {
            int layoutDuringTransition = this.accessartificialFrame.getHighSpeedVideoFpsRangesFor.getLayoutDuringTransition();
            if (layoutDuringTransition == 0) {
                return;
            }
            if (layoutDuringTransition == 2) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    this.getOutputMinFrameDuration.get(getChildAt(i)).remeasure();
                }
                return;
            }
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public java.lang.String toString() {
        android.content.Context context = getContext();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(androidx.constraintlayout.motion.widget.Debug.getName(context, this.startTransaction));
        sb.append("->");
        sb.append(androidx.constraintlayout.motion.widget.Debug.getName(context, this.free));
        sb.append(" (pos:");
        sb.append(this.AMEXKernel);
        sb.append(" Dpos/Dt:");
        sb.append(this.getOutputSizes);
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        if (r8 == r9.getHighResolutionOutputSizeshNQ4ISI) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fb  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        float signum;
        android.view.animation.Interpolator interpolator;
        float f;
        int childCount;
        android.view.animation.Interpolator interpolator2;
        if (this.accessartificialFrame == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z2 = true;
        boolean z3 = (this.encode == i && this.BerTlvEncoder == i2) ? false : true;
        if (this.apply) {
            this.apply = false;
            getHighResolutionOutputSizeshNQ4ISI();
            getHighSpeedVideoSizes();
            z3 = true;
        }
        if (this.mDirtyHierarchy) {
            z3 = true;
        }
        this.encode = i;
        this.BerTlvEncoder = i2;
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.accessartificialFrame.getHighSpeedVideoFpsRangesFor;
        int i5 = transition == null ? -1 : transition.getHighSpeedVideoFpsRangesFor;
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition2 = this.accessartificialFrame.getHighSpeedVideoFpsRangesFor;
        int i6 = transition2 == null ? -1 : transition2.getHighResolutionOutputSizeshNQ4ISI;
        if (!z3) {
            androidx.constraintlayout.motion.widget.MotionLayout.Model model = this.getValidOutputFormatsForInputhNQ4ISI;
            if (i5 == model.getHighSpeedVideoSizesFor) {
            }
        }
        if (this.startTransaction != -1) {
            super.onMeasure(i, i2);
            androidx.constraintlayout.motion.widget.MotionLayout.Model model2 = this.getValidOutputFormatsForInputhNQ4ISI;
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutWidget;
            model2.getHighSpeedVideoFpsRangesFor(this.accessartificialFrame.getHighResolutionOutputSizeshNQ4ISI(i5), this.accessartificialFrame.getHighResolutionOutputSizeshNQ4ISI(i6));
            this.getValidOutputFormatsForInputhNQ4ISI.getHighSpeedVideoSizes();
            androidx.constraintlayout.motion.widget.MotionLayout.Model model3 = this.getValidOutputFormatsForInputhNQ4ISI;
            model3.getHighSpeedVideoSizesFor = i5;
            model3.getHighResolutionOutputSizeshNQ4ISI = i6;
            z = false;
            if (!this.mMeasureDuringTransition || z) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int width = this.mLayoutWidget.getWidth() + getPaddingLeft() + getPaddingRight();
                int height = this.mLayoutWidget.getHeight() + paddingTop + paddingBottom;
                i3 = this.exchange;
                if (i3 != Integer.MIN_VALUE || i3 == 0) {
                    width = (int) (this.getARTIFICIAL_FRAME_PACKAGE_NAME + (this.toString * (this.Camera2StreamConfigurationMap - r1)));
                    requestLayout();
                }
                i4 = this.getInputSizeshNQ4ISI;
                if (i4 != Integer.MIN_VALUE || i4 == 0) {
                    height = (int) (this._CREATION + (this.toString * (this.getHighSpeedVideoFpsRangesFor - r1)));
                    requestLayout();
                }
                setMeasuredDimension(width, height);
            }
            signum = java.lang.Math.signum(this.init - this.AMEXKernel);
            long nanoTime = getNanoTime();
            interpolator = this.getOutputMinFrameDurationlomOqCM;
            f = this.AMEXKernel + (interpolator instanceof androidx.constraintlayout.motion.utils.StopLogic ? (((nanoTime - this.onExtraCallbackWithResult) * signum) * 1.0E-9f) / this.IAuthTabCallback : 0.0f);
            if (this.valueOf) {
                f = this.init;
            }
            if ((signum > 0.0f || f < this.init) && (signum > 0.0f || f > this.init)) {
                z2 = false;
            } else {
                f = this.init;
            }
            if (interpolator != null && !z2) {
                if (!this.values) {
                    f = interpolator.getInterpolation((nanoTime - this.release) * 1.0E-9f);
                } else {
                    f = interpolator.getInterpolation(f);
                }
            }
            if ((signum > 0.0f && f >= this.init) || (signum <= 0.0f && f <= this.init)) {
                f = this.init;
            }
            this.toString = f;
            childCount = getChildCount();
            long nanoTime2 = getNanoTime();
            interpolator2 = this.coroutineBoundary;
            if (interpolator2 != null) {
                f = interpolator2.getInterpolation(f);
            }
            for (int i7 = 0; i7 < childCount; i7++) {
                android.view.View childAt = getChildAt(i7);
                androidx.constraintlayout.motion.widget.MotionController motionController = this.getOutputMinFrameDuration.get(childAt);
                if (motionController != null) {
                    motionController.getHighResolutionOutputSizeshNQ4ISI(childAt, f, nanoTime2, this.start);
                }
            }
            if (this.mMeasureDuringTransition) {
                requestLayout();
                return;
            }
            return;
        }
        if (z3) {
            super.onMeasure(i, i2);
        }
        z = true;
        if (!this.mMeasureDuringTransition) {
        }
        int paddingTop2 = getPaddingTop();
        int paddingBottom2 = getPaddingBottom();
        int width2 = this.mLayoutWidget.getWidth() + getPaddingLeft() + getPaddingRight();
        int height2 = this.mLayoutWidget.getHeight() + paddingTop2 + paddingBottom2;
        i3 = this.exchange;
        if (i3 != Integer.MIN_VALUE) {
        }
        width2 = (int) (this.getARTIFICIAL_FRAME_PACKAGE_NAME + (this.toString * (this.Camera2StreamConfigurationMap - r1)));
        requestLayout();
        i4 = this.getInputSizeshNQ4ISI;
        if (i4 != Integer.MIN_VALUE) {
        }
        height2 = (int) (this._CREATION + (this.toString * (this.getHighSpeedVideoFpsRangesFor - r1)));
        requestLayout();
        setMeasuredDimension(width2, height2);
        signum = java.lang.Math.signum(this.init - this.AMEXKernel);
        long nanoTime3 = getNanoTime();
        interpolator = this.getOutputMinFrameDurationlomOqCM;
        f = this.AMEXKernel + (interpolator instanceof androidx.constraintlayout.motion.utils.StopLogic ? (((nanoTime3 - this.onExtraCallbackWithResult) * signum) * 1.0E-9f) / this.IAuthTabCallback : 0.0f);
        if (this.valueOf) {
        }
        if (signum > 0.0f) {
        }
        z2 = false;
        if (interpolator != null) {
            if (!this.values) {
            }
        }
        if (signum > 0.0f) {
            f = this.init;
            this.toString = f;
            childCount = getChildCount();
            long nanoTime22 = getNanoTime();
            interpolator2 = this.coroutineBoundary;
            if (interpolator2 != null) {
            }
            while (i7 < childCount) {
            }
            if (this.mMeasureDuringTransition) {
            }
        }
        f = this.init;
        this.toString = f;
        childCount = getChildCount();
        long nanoTime222 = getNanoTime();
        interpolator2 = this.coroutineBoundary;
        if (interpolator2 != null) {
        }
        while (i7 < childCount) {
        }
        if (this.mMeasureDuringTransition) {
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i, int i2) {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.accessartificialFrame;
        return (motionScene == null || motionScene.getHighSpeedVideoFpsRangesFor == null || this.accessartificialFrame.getHighSpeedVideoFpsRangesFor.getTouchResponse() == null || (this.accessartificialFrame.getHighSpeedVideoFpsRangesFor.getTouchResponse().getInputFormats & 2) != 0) ? false : true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i, int i2) {
        this._BOUNDARY = getNanoTime();
        this.coroutineCreation = 0.0f;
        this.b = 0.0f;
        this.f2727a = 0.0f;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(android.view.View view, int i) {
        int i2;
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.accessartificialFrame;
        if (motionScene != null) {
            float f = this.coroutineCreation;
            if (f != 0.0f) {
                float f2 = this.b / f;
                float f3 = this.f2727a / f;
                androidx.constraintlayout.motion.widget.MotionScene.Transition transition = motionScene.getHighSpeedVideoFpsRangesFor;
                if (transition == null || transition.unwrapAs == null) {
                    return;
                }
                androidx.constraintlayout.motion.widget.TouchResponse touchResponse = motionScene.getHighSpeedVideoFpsRangesFor.unwrapAs;
                touchResponse.getHighResolutionOutputSizeshNQ4ISI = false;
                float progress = touchResponse.getOutputSizeshNQ4ISI.getProgress();
                touchResponse.getOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(touchResponse.ArtificialStackFrames, progress, touchResponse.coroutineCreation, touchResponse.f2728a, touchResponse.getHighSpeedVideoSizes);
                float f4 = touchResponse._CREATION;
                float[] fArr = touchResponse.getHighSpeedVideoSizes;
                float f5 = f4 != 0.0f ? (f2 * f4) / fArr[0] : (f3 * touchResponse.getARTIFICIAL_FRAME_PACKAGE_NAME) / fArr[1];
                if (!java.lang.Float.isNaN(f5)) {
                    progress += f5 / 3.0f;
                }
                if (progress == 0.0f || progress == 1.0f || (i2 = touchResponse.getOutputMinFrameDurationlomOqCM) == 3) {
                    return;
                }
                touchResponse.getOutputSizeshNQ4ISI.touchAnimateTo(i2, ((double) progress) >= 0.5d ? 1.0f : 0.0f, f5);
            }
        }
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(android.view.View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.resetTransaction || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.resetTransaction = false;
    }

    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(final android.view.View view, int i, int i2, int[] iArr, int i3) {
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition;
        ?? r1;
        float f;
        float f2;
        androidx.constraintlayout.motion.widget.TouchResponse touchResponse;
        int i4;
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.accessartificialFrame;
        if (motionScene == null || (transition = motionScene.getHighSpeedVideoFpsRangesFor) == null || !transition.isEnabled()) {
            return;
        }
        int i5 = -1;
        if (!transition.isEnabled() || (touchResponse = transition.getTouchResponse()) == null || (i4 = touchResponse.b) == -1 || view.getId() == i4) {
            androidx.constraintlayout.motion.widget.MotionScene.Transition transition2 = motionScene.getHighSpeedVideoFpsRangesFor;
            if (transition2 != null && transition2.unwrapAs != null && motionScene.getHighSpeedVideoFpsRangesFor.unwrapAs.getOutputStallDuration) {
                androidx.constraintlayout.motion.widget.TouchResponse touchResponse2 = transition.getTouchResponse();
                if (touchResponse2 != null && (touchResponse2.getInputFormats & 4) != 0) {
                    i5 = i2;
                }
                float f3 = this.kernelVersion;
                if ((f3 == 1.0f || f3 == 0.0f) && view.canScrollVertically(i5)) {
                    return;
                }
            }
            if (transition.getTouchResponse() != null && (transition.getTouchResponse().getInputFormats & 1) != 0) {
                float f4 = i;
                float f5 = i2;
                androidx.constraintlayout.motion.widget.MotionScene.Transition transition3 = motionScene.getHighSpeedVideoFpsRangesFor;
                if (transition3 == null || transition3.unwrapAs == null) {
                    f2 = 0.0f;
                } else {
                    androidx.constraintlayout.motion.widget.TouchResponse touchResponse3 = motionScene.getHighSpeedVideoFpsRangesFor.unwrapAs;
                    touchResponse3.getOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(touchResponse3.ArtificialStackFrames, touchResponse3.getOutputSizeshNQ4ISI.getProgress(), touchResponse3.coroutineCreation, touchResponse3.f2728a, touchResponse3.getHighSpeedVideoSizes);
                    float f6 = touchResponse3._CREATION;
                    if (f6 != 0.0f) {
                        float[] fArr = touchResponse3.getHighSpeedVideoSizes;
                        if (fArr[0] == 0.0f) {
                            fArr[0] = 1.0E-7f;
                        }
                        f2 = (f4 * f6) / fArr[0];
                    } else {
                        float[] fArr2 = touchResponse3.getHighSpeedVideoSizes;
                        if (fArr2[1] == 0.0f) {
                            fArr2[1] = 1.0E-7f;
                        }
                        f2 = (f5 * touchResponse3.getARTIFICIAL_FRAME_PACKAGE_NAME) / fArr2[1];
                    }
                }
                float f7 = this.AMEXKernel;
                if ((f7 <= 0.0f && f2 < 0.0f) || (f7 >= 1.0f && f2 > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new java.lang.Runnable() { // from class: androidx.constraintlayout.motion.widget.MotionLayout.3
                        @Override // java.lang.Runnable
                        public void run() {
                            view.setNestedScrollingEnabled(true);
                        }
                    });
                    return;
                }
            }
            float f8 = this.kernelVersion;
            long nanoTime = getNanoTime();
            float f9 = i;
            this.b = f9;
            float f10 = i2;
            this.f2727a = f10;
            this.coroutineCreation = (float) ((nanoTime - this._BOUNDARY) * 1.0E-9d);
            this._BOUNDARY = nanoTime;
            androidx.constraintlayout.motion.widget.MotionScene.Transition transition4 = motionScene.getHighSpeedVideoFpsRangesFor;
            if (transition4 != null && transition4.unwrapAs != null) {
                androidx.constraintlayout.motion.widget.TouchResponse touchResponse4 = motionScene.getHighSpeedVideoFpsRangesFor.unwrapAs;
                float progress = touchResponse4.getOutputSizeshNQ4ISI.getProgress();
                if (!touchResponse4.getHighResolutionOutputSizeshNQ4ISI) {
                    touchResponse4.getHighResolutionOutputSizeshNQ4ISI = true;
                    touchResponse4.getOutputSizeshNQ4ISI.setProgress(progress);
                }
                touchResponse4.getOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(touchResponse4.ArtificialStackFrames, progress, touchResponse4.coroutineCreation, touchResponse4.f2728a, touchResponse4.getHighSpeedVideoSizes);
                float f11 = touchResponse4._CREATION;
                float[] fArr3 = touchResponse4.getHighSpeedVideoSizes;
                if (java.lang.Math.abs((f11 * fArr3[0]) + (touchResponse4.getARTIFICIAL_FRAME_PACKAGE_NAME * fArr3[1])) < 0.01d) {
                    float[] fArr4 = touchResponse4.getHighSpeedVideoSizes;
                    fArr4[0] = 0.01f;
                    fArr4[1] = 0.01f;
                }
                float f12 = touchResponse4._CREATION;
                if (f12 != 0.0f) {
                    f = (f9 * f12) / touchResponse4.getHighSpeedVideoSizes[0];
                } else {
                    f = (f10 * touchResponse4.getARTIFICIAL_FRAME_PACKAGE_NAME) / touchResponse4.getHighSpeedVideoSizes[1];
                }
                float max = java.lang.Math.max(java.lang.Math.min(progress + f, 1.0f), 0.0f);
                if (max != touchResponse4.getOutputSizeshNQ4ISI.getProgress()) {
                    touchResponse4.getOutputSizeshNQ4ISI.setProgress(max);
                }
            }
            if (f8 != this.kernelVersion) {
                iArr[0] = i;
                r1 = 1;
                iArr[1] = i2;
            } else {
                r1 = 1;
            }
            getHighSpeedVideoFpsRanges(false);
            if (iArr[0] == 0 && iArr[r1] == 0) {
                return;
            }
            this.resetTransaction = r1;
        }
    }

    class DevModeDraw {
        android.graphics.Paint getHighResolutionOutputSizeshNQ4ISI;
        android.graphics.DashPathEffect getHighSpeedVideoSizes;
        float[] getInputFormats;
        android.graphics.Paint getInputSizeshNQ4ISI;
        android.graphics.Paint getOutputFormats;
        int getOutputMinFrameDuration;
        int[] getOutputSizes;
        android.graphics.Path getOutputSizeshNQ4ISI;
        float[] getOutputStallDuration;
        android.graphics.Paint getOutputStallDurationlomOqCM;
        int isOutputSupportedFor;
        float[] isOutputSupportedForhNQ4ISI;
        android.graphics.Paint unwrapAs;
        final int getValidOutputFormatsForInputhNQ4ISI = -21965;
        final int getHighSpeedVideoSizesFor = -2067046;
        final int getHighSpeedVideoFpsRanges = -13391360;
        final int toString = 1996488704;
        final int Camera2StreamConfigurationMap = 10;
        android.graphics.Rect getHighSpeedVideoFpsRangesFor = new android.graphics.Rect();
        boolean getOutputMinFrameDurationlomOqCM = false;

        DevModeDraw() {
            this.isOutputSupportedFor = 1;
            android.graphics.Paint paint = new android.graphics.Paint();
            this.getOutputFormats = paint;
            paint.setAntiAlias(true);
            this.getOutputFormats.setColor(-21965);
            this.getOutputFormats.setStrokeWidth(2.0f);
            this.getOutputFormats.setStyle(android.graphics.Paint.Style.STROKE);
            android.graphics.Paint paint2 = new android.graphics.Paint();
            this.getOutputStallDurationlomOqCM = paint2;
            paint2.setAntiAlias(true);
            this.getOutputStallDurationlomOqCM.setColor(-2067046);
            this.getOutputStallDurationlomOqCM.setStrokeWidth(2.0f);
            this.getOutputStallDurationlomOqCM.setStyle(android.graphics.Paint.Style.STROKE);
            android.graphics.Paint paint3 = new android.graphics.Paint();
            this.getInputSizeshNQ4ISI = paint3;
            paint3.setAntiAlias(true);
            this.getInputSizeshNQ4ISI.setColor(-13391360);
            this.getInputSizeshNQ4ISI.setStrokeWidth(2.0f);
            this.getInputSizeshNQ4ISI.setStyle(android.graphics.Paint.Style.STROKE);
            android.graphics.Paint paint4 = new android.graphics.Paint();
            this.unwrapAs = paint4;
            paint4.setAntiAlias(true);
            this.unwrapAs.setColor(-13391360);
            this.unwrapAs.setTextSize(androidx.constraintlayout.motion.widget.MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.isOutputSupportedForhNQ4ISI = new float[8];
            android.graphics.Paint paint5 = new android.graphics.Paint();
            this.getHighResolutionOutputSizeshNQ4ISI = paint5;
            paint5.setAntiAlias(true);
            android.graphics.DashPathEffect dashPathEffect = new android.graphics.DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.getHighSpeedVideoSizes = dashPathEffect;
            this.getInputSizeshNQ4ISI.setPathEffect(dashPathEffect);
            this.getInputFormats = new float[100];
            this.getOutputSizes = new int[50];
            if (this.getOutputMinFrameDurationlomOqCM) {
                this.getOutputFormats.setStrokeWidth(8.0f);
                this.getHighResolutionOutputSizeshNQ4ISI.setStrokeWidth(8.0f);
                this.getOutputStallDurationlomOqCM.setStrokeWidth(8.0f);
                this.isOutputSupportedFor = 4;
            }
        }

        public final void getHighSpeedVideoFpsRangesFor(android.graphics.Canvas canvas, int i, int i2, androidx.constraintlayout.motion.widget.MotionController motionController) {
            if (i == 4) {
                Camera2StreamConfigurationMap(canvas);
            }
            if (i == 2) {
                getHighSpeedVideoFpsRangesFor(canvas);
            }
            if (i == 3) {
                getHighSpeedVideoFpsRanges(canvas);
            }
            canvas.drawLines(this.getOutputStallDuration, this.getOutputFormats);
            getHighSpeedVideoFpsRanges(canvas, i, i2, motionController);
        }

        private void getHighSpeedVideoFpsRanges(android.graphics.Canvas canvas, int i, int i2, androidx.constraintlayout.motion.widget.MotionController motionController) {
            int i3;
            int i4;
            float f;
            float f2;
            if (motionController._BOUNDARY != null) {
                i3 = motionController._BOUNDARY.getWidth();
                i4 = motionController._BOUNDARY.getHeight();
            } else {
                i3 = 0;
                i4 = 0;
            }
            for (int i5 = 1; i5 < i2 - 1; i5++) {
                if (i != 4 || this.getOutputSizes[i5 - 1] != 0) {
                    float[] fArr = this.getInputFormats;
                    int i6 = i5 * 2;
                    float f3 = fArr[i6];
                    float f4 = fArr[i6 + 1];
                    this.getOutputSizeshNQ4ISI.reset();
                    this.getOutputSizeshNQ4ISI.moveTo(f3, f4 + 10.0f);
                    this.getOutputSizeshNQ4ISI.lineTo(f3 + 10.0f, f4);
                    this.getOutputSizeshNQ4ISI.lineTo(f3, f4 - 10.0f);
                    this.getOutputSizeshNQ4ISI.lineTo(f3 - 10.0f, f4);
                    this.getOutputSizeshNQ4ISI.close();
                    int i7 = i5 - 1;
                    motionController.unwrapAs.get(i7);
                    if (i == 4) {
                        int i8 = this.getOutputSizes[i7];
                        if (i8 == 1) {
                            getHighResolutionOutputSizeshNQ4ISI(canvas, f3 - 0.0f, f4 - 0.0f);
                        } else if (i8 == 0) {
                            getHighSpeedVideoFpsRanges(canvas, f3 - 0.0f, f4 - 0.0f);
                        } else if (i8 == 2) {
                            f = f4;
                            f2 = f3;
                            getHighSpeedVideoFpsRangesFor(canvas, f3 - 0.0f, f4 - 0.0f, i3, i4);
                            canvas.drawPath(this.getOutputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI);
                        }
                        f = f4;
                        f2 = f3;
                        canvas.drawPath(this.getOutputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI);
                    } else {
                        f = f4;
                        f2 = f3;
                    }
                    if (i == 2) {
                        getHighResolutionOutputSizeshNQ4ISI(canvas, f2 - 0.0f, f - 0.0f);
                    }
                    if (i == 3) {
                        getHighSpeedVideoFpsRanges(canvas, f2 - 0.0f, f - 0.0f);
                    }
                    if (i == 6) {
                        getHighSpeedVideoFpsRangesFor(canvas, f2 - 0.0f, f - 0.0f, i3, i4);
                    }
                    canvas.drawPath(this.getOutputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI);
                }
            }
            float[] fArr2 = this.getOutputStallDuration;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.getOutputStallDurationlomOqCM);
                float[] fArr3 = this.getOutputStallDuration;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.getOutputStallDurationlomOqCM);
            }
        }

        private void getHighSpeedVideoFpsRangesFor(android.graphics.Canvas canvas) {
            float[] fArr = this.getOutputStallDuration;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.getInputSizeshNQ4ISI);
        }

        private void Camera2StreamConfigurationMap(android.graphics.Canvas canvas) {
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < this.getOutputMinFrameDuration; i++) {
                int i2 = this.getOutputSizes[i];
                if (i2 == 1) {
                    z = true;
                }
                if (i2 == 0) {
                    z2 = true;
                }
            }
            if (z) {
                getHighSpeedVideoFpsRangesFor(canvas);
            }
            if (z2) {
                getHighSpeedVideoFpsRanges(canvas);
            }
        }

        private void getHighResolutionOutputSizeshNQ4ISI(android.graphics.Canvas canvas, float f, float f2) {
            float[] fArr = this.getOutputStallDuration;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float hypot = (float) java.lang.Math.hypot(f3 - f5, f4 - f6);
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            float f9 = (((f - f3) * f7) + ((f2 - f4) * f8)) / (hypot * hypot);
            float f10 = f3 + (f7 * f9);
            float f11 = f4 + (f9 * f8);
            android.graphics.Path path = new android.graphics.Path();
            path.moveTo(f, f2);
            path.lineTo(f10, f11);
            float hypot2 = (float) java.lang.Math.hypot(f10 - f, f11 - f2);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("");
            sb.append(((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
            java.lang.String obj = sb.toString();
            this.unwrapAs.getTextBounds(obj, 0, obj.length(), this.getHighSpeedVideoFpsRangesFor);
            canvas.drawTextOnPath(obj, path, (hypot2 / 2.0f) - (this.getHighSpeedVideoFpsRangesFor.width() / 2), -20.0f, this.unwrapAs);
            canvas.drawLine(f, f2, f10, f11, this.getInputSizeshNQ4ISI);
        }

        private void getHighSpeedVideoFpsRanges(android.graphics.Canvas canvas) {
            float[] fArr = this.getOutputStallDuration;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            canvas.drawLine(java.lang.Math.min(f, f3), java.lang.Math.max(f2, f4), java.lang.Math.max(f, f3), java.lang.Math.max(f2, f4), this.getInputSizeshNQ4ISI);
            canvas.drawLine(java.lang.Math.min(f, f3), java.lang.Math.min(f2, f4), java.lang.Math.min(f, f3), java.lang.Math.max(f2, f4), this.getInputSizeshNQ4ISI);
        }

        private void getHighSpeedVideoFpsRanges(android.graphics.Canvas canvas, float f, float f2) {
            float[] fArr = this.getOutputStallDuration;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float min = java.lang.Math.min(f3, f5);
            float max = java.lang.Math.max(f4, f6);
            float min2 = f - java.lang.Math.min(f3, f5);
            float max2 = java.lang.Math.max(f4, f6) - f2;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("");
            sb.append(((int) (((min2 * 100.0f) / java.lang.Math.abs(f5 - f3)) + 0.5d)) / 100.0f);
            java.lang.String obj = sb.toString();
            this.unwrapAs.getTextBounds(obj, 0, obj.length(), this.getHighSpeedVideoFpsRangesFor);
            canvas.drawText(obj, ((min2 / 2.0f) - (this.getHighSpeedVideoFpsRangesFor.width() / 2)) + min, f2 - 20.0f, this.unwrapAs);
            canvas.drawLine(f, f2, java.lang.Math.min(f3, f5), f2, this.getInputSizeshNQ4ISI);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("");
            sb2.append(((int) (((max2 * 100.0f) / java.lang.Math.abs(f6 - f4)) + 0.5d)) / 100.0f);
            java.lang.String obj2 = sb2.toString();
            this.unwrapAs.getTextBounds(obj2, 0, obj2.length(), this.getHighSpeedVideoFpsRangesFor);
            canvas.drawText(obj2, f + 5.0f, max - ((max2 / 2.0f) - (this.getHighSpeedVideoFpsRangesFor.height() / 2)), this.unwrapAs);
            canvas.drawLine(f, f2, f, java.lang.Math.max(f4, f6), this.getInputSizeshNQ4ISI);
        }

        private void getHighSpeedVideoFpsRangesFor(android.graphics.Canvas canvas, float f, float f2, int i, int i2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("");
            sb.append(((int) ((((f - (i / 2)) * 100.0f) / (androidx.constraintlayout.motion.widget.MotionLayout.this.getWidth() - i)) + 0.5d)) / 100.0f);
            java.lang.String obj = sb.toString();
            this.unwrapAs.getTextBounds(obj, 0, obj.length(), this.getHighSpeedVideoFpsRangesFor);
            canvas.drawText(obj, ((f / 2.0f) - (this.getHighSpeedVideoFpsRangesFor.width() / 2)) + 0.0f, f2 - 20.0f, this.unwrapAs);
            canvas.drawLine(f, f2, java.lang.Math.min(0.0f, 1.0f), f2, this.getInputSizeshNQ4ISI);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("");
            sb2.append(((int) ((((f2 - (i2 / 2)) * 100.0f) / (androidx.constraintlayout.motion.widget.MotionLayout.this.getHeight() - i2)) + 0.5d)) / 100.0f);
            java.lang.String obj2 = sb2.toString();
            this.unwrapAs.getTextBounds(obj2, 0, obj2.length(), this.getHighSpeedVideoFpsRangesFor);
            canvas.drawText(obj2, f + 5.0f, 0.0f - ((f2 / 2.0f) - (this.getHighSpeedVideoFpsRangesFor.height() / 2)), this.unwrapAs);
            canvas.drawLine(f, f2, f, java.lang.Math.max(0.0f, 1.0f), this.getInputSizeshNQ4ISI);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0104  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchDraw(android.graphics.Canvas canvas) {
        androidx.constraintlayout.motion.widget.ViewTransitionController viewTransitionController;
        java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition.Animate> arrayList;
        java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> arrayList2 = this.requestGoOnline;
        if (arrayList2 != null) {
            java.util.Iterator<androidx.constraintlayout.motion.widget.MotionHelper> it = arrayList2.iterator();
            while (it.hasNext()) {
                it.next().onPreDraw(canvas);
            }
        }
        getHighSpeedVideoFpsRanges(false);
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.accessartificialFrame;
        if (motionScene != null && motionScene.getHighSpeedVideoSizes != null && (arrayList = (viewTransitionController = this.accessartificialFrame.getHighSpeedVideoSizes).getHighSpeedVideoFpsRanges) != null) {
            java.util.Iterator<androidx.constraintlayout.motion.widget.ViewTransition.Animate> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                androidx.constraintlayout.motion.widget.ViewTransition.Animate next = it2.next();
                if (next.getInputSizeshNQ4ISI) {
                    next.getHighSpeedVideoFpsRangesFor();
                } else {
                    next.getHighSpeedVideoFpsRanges();
                }
            }
            viewTransitionController.getHighSpeedVideoFpsRanges.removeAll(viewTransitionController.getHighSpeedVideoSizes);
            viewTransitionController.getHighSpeedVideoSizes.clear();
            if (viewTransitionController.getHighSpeedVideoFpsRanges.isEmpty()) {
                viewTransitionController.getHighSpeedVideoFpsRanges = null;
            }
        }
        super.dispatchDraw(canvas);
        if (this.accessartificialFrame != null) {
            if ((this.getHighSpeedVideoSizes & 1) == 1 && !isInEditMode()) {
                this.rsaCipher++;
                long nanoTime = getNanoTime();
                long j = this.AMEXKernelProvider;
                if (j != -1) {
                    if (nanoTime - j > 200000000) {
                        this.newContext = ((int) ((this.rsaCipher / (r10 * 1.0E-9f)) * 100.0f)) / 100.0f;
                        this.rsaCipher = 0;
                    }
                    android.graphics.Paint paint = new android.graphics.Paint();
                    paint.setTextSize(42.0f);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(this.newContext);
                    sb.append(" fps ");
                    sb.append(androidx.constraintlayout.motion.widget.Debug.getState(this, this.startTransaction));
                    sb.append(" -> ");
                    java.lang.String obj = sb.toString();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(obj);
                    sb2.append(androidx.constraintlayout.motion.widget.Debug.getState(this, this.free));
                    sb2.append(" (progress: ");
                    sb2.append(((int) (getProgress() * 1000.0f)) / 10.0f);
                    sb2.append(" ) state=");
                    int i = this.getHighResolutionOutputSizeshNQ4ISI;
                    sb2.append(i != -1 ? "undefined" : androidx.constraintlayout.motion.widget.Debug.getState(this, i));
                    java.lang.String obj2 = sb2.toString();
                    paint.setColor(-16777216);
                    canvas.drawText(obj2, 11.0f, getHeight() - 29, paint);
                    paint.setColor(-7864184);
                    canvas.drawText(obj2, 10.0f, getHeight() - 30, paint);
                }
                this.AMEXKernelProvider = nanoTime;
                android.graphics.Paint paint2 = new android.graphics.Paint();
                paint2.setTextSize(42.0f);
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(this.newContext);
                sb3.append(" fps ");
                sb3.append(androidx.constraintlayout.motion.widget.Debug.getState(this, this.startTransaction));
                sb3.append(" -> ");
                java.lang.String obj3 = sb3.toString();
                java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
                sb22.append(obj3);
                sb22.append(androidx.constraintlayout.motion.widget.Debug.getState(this, this.free));
                sb22.append(" (progress: ");
                sb22.append(((int) (getProgress() * 1000.0f)) / 10.0f);
                sb22.append(" ) state=");
                int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
                sb22.append(i2 != -1 ? "undefined" : androidx.constraintlayout.motion.widget.Debug.getState(this, i2));
                java.lang.String obj22 = sb22.toString();
                paint2.setColor(-16777216);
                canvas.drawText(obj22, 11.0f, getHeight() - 29, paint2);
                paint2.setColor(-7864184);
                canvas.drawText(obj22, 10.0f, getHeight() - 30, paint2);
            }
            if (this.getHighSpeedVideoSizes > 1) {
                if (this.getHighSpeedVideoFpsRanges == null) {
                    this.getHighSpeedVideoFpsRanges = new androidx.constraintlayout.motion.widget.MotionLayout.DevModeDraw();
                }
                androidx.constraintlayout.motion.widget.MotionLayout.DevModeDraw devModeDraw = this.getHighSpeedVideoFpsRanges;
                java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> hashMap = this.getOutputMinFrameDuration;
                int duration = this.accessartificialFrame.getDuration();
                int i3 = this.getHighSpeedVideoSizes;
                if (hashMap != null && hashMap.size() != 0) {
                    canvas.save();
                    char c = 2;
                    if (!androidx.constraintlayout.motion.widget.MotionLayout.this.isInEditMode() && (i3 & 1) == 2) {
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                        sb4.append(androidx.constraintlayout.motion.widget.MotionLayout.this.getContext().getResources().getResourceName(androidx.constraintlayout.motion.widget.MotionLayout.this.free));
                        sb4.append(io.ktor.sse.ServerSentEventKt.COLON);
                        sb4.append(androidx.constraintlayout.motion.widget.MotionLayout.this.getProgress());
                        java.lang.String obj4 = sb4.toString();
                        canvas.drawText(obj4, 10.0f, androidx.constraintlayout.motion.widget.MotionLayout.this.getHeight() - 30, devModeDraw.unwrapAs);
                        canvas.drawText(obj4, 11.0f, androidx.constraintlayout.motion.widget.MotionLayout.this.getHeight() - 29, devModeDraw.getOutputFormats);
                    }
                    for (androidx.constraintlayout.motion.widget.MotionController motionController : hashMap.values()) {
                        int drawPath = motionController.getDrawPath();
                        if (i3 > 0 && drawPath == 0) {
                            drawPath = 1;
                        }
                        if (drawPath != 0) {
                            devModeDraw.getOutputMinFrameDuration = motionController.getHighResolutionOutputSizeshNQ4ISI(devModeDraw.getInputFormats, devModeDraw.getOutputSizes);
                            if (drawPath > 0) {
                                int i4 = duration / 16;
                                float[] fArr = devModeDraw.getOutputStallDuration;
                                if (fArr == null || fArr.length != i4 * 2) {
                                    devModeDraw.getOutputStallDuration = new float[i4 * 2];
                                    devModeDraw.getOutputSizeshNQ4ISI = new android.graphics.Path();
                                }
                                float f = devModeDraw.isOutputSupportedFor;
                                canvas.translate(f, f);
                                devModeDraw.getOutputFormats.setColor(1996488704);
                                devModeDraw.getHighResolutionOutputSizeshNQ4ISI.setColor(1996488704);
                                devModeDraw.getOutputStallDurationlomOqCM.setColor(1996488704);
                                devModeDraw.getInputSizeshNQ4ISI.setColor(1996488704);
                                motionController.getHighSpeedVideoFpsRangesFor(devModeDraw.getOutputStallDuration, i4);
                                devModeDraw.getHighSpeedVideoFpsRangesFor(canvas, drawPath, devModeDraw.getOutputMinFrameDuration, motionController);
                                devModeDraw.getOutputFormats.setColor(-21965);
                                devModeDraw.getOutputStallDurationlomOqCM.setColor(-2067046);
                                devModeDraw.getHighResolutionOutputSizeshNQ4ISI.setColor(-2067046);
                                devModeDraw.getInputSizeshNQ4ISI.setColor(-13391360);
                                float f2 = -devModeDraw.isOutputSupportedFor;
                                canvas.translate(f2, f2);
                                devModeDraw.getHighSpeedVideoFpsRangesFor(canvas, drawPath, devModeDraw.getOutputMinFrameDuration, motionController);
                                if (drawPath == 5) {
                                    devModeDraw.getOutputSizeshNQ4ISI.reset();
                                    int i5 = 0;
                                    while (i5 <= 50) {
                                        float[] fArr2 = devModeDraw.isOutputSupportedForhNQ4ISI;
                                        motionController.toString[0].getPos(motionController.getHighResolutionOutputSizeshNQ4ISI(i5 / 50.0f, (float[]) null), motionController.getOutputSizeshNQ4ISI);
                                        motionController.coroutineCreation.Camera2StreamConfigurationMap(motionController.getOutputMinFrameDurationlomOqCM, motionController.getOutputSizeshNQ4ISI, fArr2, 0);
                                        android.graphics.Path path = devModeDraw.getOutputSizeshNQ4ISI;
                                        float[] fArr3 = devModeDraw.isOutputSupportedForhNQ4ISI;
                                        path.moveTo(fArr3[0], fArr3[1]);
                                        android.graphics.Path path2 = devModeDraw.getOutputSizeshNQ4ISI;
                                        float[] fArr4 = devModeDraw.isOutputSupportedForhNQ4ISI;
                                        path2.lineTo(fArr4[2], fArr4[3]);
                                        android.graphics.Path path3 = devModeDraw.getOutputSizeshNQ4ISI;
                                        float[] fArr5 = devModeDraw.isOutputSupportedForhNQ4ISI;
                                        path3.lineTo(fArr5[4], fArr5[5]);
                                        android.graphics.Path path4 = devModeDraw.getOutputSizeshNQ4ISI;
                                        float[] fArr6 = devModeDraw.isOutputSupportedForhNQ4ISI;
                                        path4.lineTo(fArr6[6], fArr6[7]);
                                        devModeDraw.getOutputSizeshNQ4ISI.close();
                                        i5++;
                                        c = 2;
                                    }
                                    devModeDraw.getOutputFormats.setColor(1140850688);
                                    canvas.translate(2.0f, 2.0f);
                                    canvas.drawPath(devModeDraw.getOutputSizeshNQ4ISI, devModeDraw.getOutputFormats);
                                    canvas.translate(-2.0f, -2.0f);
                                    devModeDraw.getOutputFormats.setColor(androidx.core.internal.view.SupportMenu.CATEGORY_MASK);
                                    canvas.drawPath(devModeDraw.getOutputSizeshNQ4ISI, devModeDraw.getOutputFormats);
                                }
                            }
                        }
                    }
                    canvas.restore();
                }
            }
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> arrayList3 = this.requestGoOnline;
            if (arrayList3 != null) {
                java.util.Iterator<androidx.constraintlayout.motion.widget.MotionHelper> it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    it3.next().onPostDraw(canvas);
                }
            }
        }
    }

    final void getHighSpeedVideoSizes(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            androidx.constraintlayout.motion.widget.MotionController motionController = this.getOutputMinFrameDuration.get(getChildAt(i));
            if (motionController != null && "button".equals(androidx.constraintlayout.motion.widget.Debug.getName(motionController._BOUNDARY)) && motionController.getOutputStallDuration != null) {
                int i2 = 0;
                while (true) {
                    androidx.constraintlayout.motion.widget.KeyTrigger[] keyTriggerArr = motionController.getOutputStallDuration;
                    if (i2 < keyTriggerArr.length) {
                        keyTriggerArr[i2].conditionallyFire(z ? -100.0f : 100.0f, motionController._BOUNDARY);
                        i2++;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void getHighSpeedVideoFpsRanges(boolean z) {
        boolean z2;
        char c;
        float f;
        int childCount;
        android.view.animation.Interpolator interpolator;
        int i;
        int i2;
        boolean z3;
        if (this.onExtraCallbackWithResult == -1) {
            this.onExtraCallbackWithResult = getNanoTime();
        }
        float f2 = this.AMEXKernel;
        if (f2 > 0.0f && f2 < 1.0f) {
            this.getHighResolutionOutputSizeshNQ4ISI = -1;
        }
        boolean z4 = false;
        if (this.version || (this.getOutputFormats && (z || this.init != f2))) {
            float signum = java.lang.Math.signum(this.init - f2);
            long nanoTime = getNanoTime();
            android.view.animation.Interpolator interpolator2 = this.getOutputMinFrameDurationlomOqCM;
            float f3 = !(interpolator2 instanceof androidx.constraintlayout.motion.widget.MotionInterpolator) ? (((nanoTime - this.onExtraCallbackWithResult) * signum) * 1.0E-9f) / this.IAuthTabCallback : 0.0f;
            float f4 = this.AMEXKernel + f3;
            if (this.valueOf) {
                f4 = this.init;
            }
            if ((signum <= 0.0f || f4 < this.init) && (signum > 0.0f || f4 > this.init)) {
                z2 = false;
            } else {
                f4 = this.init;
                this.getOutputFormats = false;
                z2 = true;
            }
            this.AMEXKernel = f4;
            this.kernelVersion = f4;
            this.onExtraCallbackWithResult = nanoTime;
            if (interpolator2 != null && !z2) {
                if (this.values) {
                    f = interpolator2.getInterpolation((nanoTime - this.release) * 1.0E-9f);
                    android.view.animation.Interpolator interpolator3 = this.getOutputMinFrameDurationlomOqCM;
                    androidx.constraintlayout.motion.utils.StopLogic stopLogic = this.TransactionOutcomeDecodera;
                    if (interpolator3 == stopLogic) {
                        c = stopLogic.isStopped() ? (char) 2 : (char) 1;
                    } else {
                        c = 0;
                    }
                    this.AMEXKernel = f;
                    this.onExtraCallbackWithResult = nanoTime;
                    android.view.animation.Interpolator interpolator4 = this.getOutputMinFrameDurationlomOqCM;
                    if (interpolator4 instanceof androidx.constraintlayout.motion.widget.MotionInterpolator) {
                        float velocity = ((androidx.constraintlayout.motion.widget.MotionInterpolator) interpolator4).getVelocity();
                        this.getOutputSizes = velocity;
                        if (java.lang.Math.abs(velocity) * this.IAuthTabCallback <= 1.0E-5f && c == 2) {
                            this.getOutputFormats = false;
                        }
                        if (velocity > 0.0f && f >= 1.0f) {
                            this.AMEXKernel = 1.0f;
                            this.getOutputFormats = false;
                            f = 1.0f;
                        }
                        if (velocity < 0.0f && f <= 0.0f) {
                            this.AMEXKernel = 0.0f;
                            this.getOutputFormats = false;
                            f = 0.0f;
                        }
                    }
                    if (java.lang.Math.abs(this.getOutputSizes) > 1.0E-5f) {
                        getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING);
                    }
                    if (c != 1) {
                        if ((signum > 0.0f && f >= this.init) || (signum <= 0.0f && f <= this.init)) {
                            f = this.init;
                            this.getOutputFormats = false;
                        }
                        if (f >= 1.0f || f <= 0.0f) {
                            this.getOutputFormats = false;
                            getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
                        }
                    }
                    childCount = getChildCount();
                    this.version = false;
                    long nanoTime2 = getNanoTime();
                    this.toString = f;
                    android.view.animation.Interpolator interpolator5 = this.coroutineBoundary;
                    float interpolation = interpolator5 != null ? f : interpolator5.getInterpolation(f);
                    interpolator = this.coroutineBoundary;
                    if (interpolator != null) {
                        float interpolation2 = interpolator.getInterpolation((signum / this.IAuthTabCallback) + f);
                        this.getOutputSizes = interpolation2;
                        this.getOutputSizes = interpolation2 - this.coroutineBoundary.getInterpolation(f);
                    }
                    for (i = 0; i < childCount; i++) {
                        android.view.View childAt = getChildAt(i);
                        androidx.constraintlayout.motion.widget.MotionController motionController = this.getOutputMinFrameDuration.get(childAt);
                        if (motionController != null) {
                            this.version = motionController.getHighResolutionOutputSizeshNQ4ISI(childAt, interpolation, nanoTime2, this.start) | this.version;
                        }
                    }
                    boolean z5 = (signum <= 0.0f && f >= this.init) || (signum <= 0.0f && f <= this.init);
                    if (!this.version && !this.getOutputFormats && z5) {
                        getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
                    }
                    if (this.mMeasureDuringTransition) {
                        requestLayout();
                    }
                    this.version = (!z5) | this.version;
                    if (f <= 0.0f && (i2 = this.startTransaction) != -1 && this.getHighResolutionOutputSizeshNQ4ISI != i2) {
                        this.getHighResolutionOutputSizeshNQ4ISI = i2;
                        this.accessartificialFrame.getHighResolutionOutputSizeshNQ4ISI(i2).applyCustomAttributes(this);
                        getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
                        z4 = true;
                    }
                    if (f >= 1.0d) {
                        int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
                        int i4 = this.free;
                        if (i3 != i4) {
                            this.getHighResolutionOutputSizeshNQ4ISI = i4;
                            this.accessartificialFrame.getHighResolutionOutputSizeshNQ4ISI(i4).applyCustomAttributes(this);
                            getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
                            z4 = true;
                        }
                    }
                    if (!this.version || this.getOutputFormats) {
                        invalidate();
                    } else if ((signum > 0.0f && f == 1.0f) || (signum < 0.0f && f == 0.0f)) {
                        getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
                    }
                    if (!this.version && !this.getOutputFormats && ((signum > 0.0f && f == 1.0f) || (signum < 0.0f && f == 0.0f))) {
                        getHighResolutionOutputSizeshNQ4ISI();
                    }
                } else {
                    float interpolation3 = interpolator2.getInterpolation(f4);
                    android.view.animation.Interpolator interpolator6 = this.getOutputMinFrameDurationlomOqCM;
                    if (interpolator6 instanceof androidx.constraintlayout.motion.widget.MotionInterpolator) {
                        this.getOutputSizes = ((androidx.constraintlayout.motion.widget.MotionInterpolator) interpolator6).getVelocity();
                    } else {
                        this.getOutputSizes = ((interpolator6.getInterpolation(f4 + f3) - interpolation3) * signum) / f3;
                    }
                    f4 = interpolation3;
                }
            } else {
                this.getOutputSizes = f3;
            }
            c = 0;
            f = f4;
            if (java.lang.Math.abs(this.getOutputSizes) > 1.0E-5f) {
            }
            if (c != 1) {
            }
            childCount = getChildCount();
            this.version = false;
            long nanoTime22 = getNanoTime();
            this.toString = f;
            android.view.animation.Interpolator interpolator52 = this.coroutineBoundary;
            if (interpolator52 != null) {
            }
            interpolator = this.coroutineBoundary;
            if (interpolator != null) {
            }
            while (i < childCount) {
            }
            if (signum <= 0.0f) {
            }
            if (!this.version) {
                getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
            }
            if (this.mMeasureDuringTransition) {
            }
            this.version = (!z5) | this.version;
            if (f <= 0.0f) {
                this.getHighResolutionOutputSizeshNQ4ISI = i2;
                this.accessartificialFrame.getHighResolutionOutputSizeshNQ4ISI(i2).applyCustomAttributes(this);
                getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED);
                z4 = true;
            }
            if (f >= 1.0d) {
            }
            if (this.version) {
            }
            invalidate();
            if (!this.version) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
        }
        float f5 = this.AMEXKernel;
        if (f5 >= 1.0f) {
            int i5 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i6 = this.free;
            z3 = i5 == i6 ? z4 : true;
            this.getHighResolutionOutputSizeshNQ4ISI = i6;
        } else {
            if (f5 <= 0.0f) {
                int i7 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i8 = this.startTransaction;
                z3 = i7 == i8 ? z4 : true;
                this.getHighResolutionOutputSizeshNQ4ISI = i8;
            }
            this.apply |= z4;
            if (z4 && !this.freeTransaction) {
                requestLayout();
            }
            this.kernelVersion = this.AMEXKernel;
        }
        z4 = z3;
        this.apply |= z4;
        if (z4) {
            requestLayout();
        }
        this.kernelVersion = this.AMEXKernel;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.freeTransaction = true;
        try {
            if (this.accessartificialFrame == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.getOutputSizeshNQ4ISI != i5 || this.getOutputStallDuration != i6) {
                rebuildScene();
                getHighSpeedVideoFpsRanges(true);
            }
            this.getOutputSizeshNQ4ISI = i5;
            this.getOutputStallDuration = i6;
            this.isOutputSupportedFor = i5;
            this.isOutputSupportedForhNQ4ISI = i6;
        } finally {
            this.freeTransaction = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = null;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(android.util.AttributeSet attributeSet) {
        androidx.constraintlayout.motion.widget.MotionScene motionScene;
        IS_IN_EDIT_MODE = isInEditMode();
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.MotionLayout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.MotionLayout_layoutDescription) {
                    this.accessartificialFrame = new androidx.constraintlayout.motion.widget.MotionScene(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionLayout_currentState) {
                    this.getHighResolutionOutputSizeshNQ4ISI = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionLayout_motionProgress) {
                    this.init = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.getOutputFormats = true;
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionLayout_applyMotionScene) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionLayout_showPaths) {
                    if (this.getHighSpeedVideoSizes == 0) {
                        this.getHighSpeedVideoSizes = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == androidx.constraintlayout.widget.R.styleable.MotionLayout_motionDebug) {
                    this.getHighSpeedVideoSizes = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (!z) {
                this.accessartificialFrame = null;
            }
        }
        if (this.getHighSpeedVideoSizes != 0) {
            getHighSpeedVideoFpsRangesFor();
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI != -1 || (motionScene = this.accessartificialFrame) == null) {
            return;
        }
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = motionScene.getHighSpeedVideoFpsRangesFor;
        this.getHighResolutionOutputSizeshNQ4ISI = transition == null ? -1 : transition.getHighSpeedVideoFpsRangesFor;
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition2 = this.accessartificialFrame.getHighSpeedVideoFpsRangesFor;
        this.startTransaction = transition2 == null ? -1 : transition2.getHighSpeedVideoFpsRangesFor;
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition3 = this.accessartificialFrame.getHighSpeedVideoFpsRangesFor;
        this.free = transition3 != null ? transition3.getHighResolutionOutputSizeshNQ4ISI : -1;
    }

    public void setScene(androidx.constraintlayout.motion.widget.MotionScene motionScene) {
        this.accessartificialFrame = motionScene;
        motionScene.setRtl(isRtl());
        rebuildScene();
    }

    public androidx.constraintlayout.motion.widget.MotionScene getScene() {
        return this.accessartificialFrame;
    }

    private void getHighSpeedVideoFpsRangesFor() {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.accessartificialFrame;
        if (motionScene == null) {
            return;
        }
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = motionScene.getHighSpeedVideoFpsRangesFor;
        int i = transition == null ? -1 : transition.getHighSpeedVideoFpsRangesFor;
        androidx.constraintlayout.motion.widget.MotionScene motionScene2 = this.accessartificialFrame;
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition2 = motionScene2.getHighSpeedVideoFpsRangesFor;
        androidx.constraintlayout.widget.ConstraintSet highResolutionOutputSizeshNQ4ISI = motionScene2.getHighResolutionOutputSizeshNQ4ISI(transition2 != null ? transition2.getHighSpeedVideoFpsRangesFor : -1);
        androidx.constraintlayout.motion.widget.Debug.getName(getContext(), i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = getChildAt(i2);
            if (highResolutionOutputSizeshNQ4ISI.getConstraint(childAt.getId()) == null) {
                androidx.constraintlayout.motion.widget.Debug.getName(childAt);
            }
        }
        int[] knownIds = highResolutionOutputSizeshNQ4ISI.getKnownIds();
        for (int i3 = 0; i3 < knownIds.length; i3++) {
            int i4 = knownIds[i3];
            androidx.constraintlayout.motion.widget.Debug.getName(getContext(), i4);
            findViewById(knownIds[i3]);
            highResolutionOutputSizeshNQ4ISI.getHeight(i4);
            highResolutionOutputSizeshNQ4ISI.getWidth(i4);
        }
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        android.util.SparseIntArray sparseIntArray2 = new android.util.SparseIntArray();
        java.util.Iterator<androidx.constraintlayout.motion.widget.MotionScene.Transition> it = this.accessartificialFrame.getDefinedTransitions().iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.motion.widget.MotionScene.Transition next = it.next();
            androidx.constraintlayout.motion.widget.MotionScene.Transition transition3 = this.accessartificialFrame.getHighSpeedVideoFpsRangesFor;
            next.getStartConstraintSetId();
            next.getEndConstraintSetId();
            int startConstraintSetId = next.getStartConstraintSetId();
            int endConstraintSetId = next.getEndConstraintSetId();
            androidx.constraintlayout.motion.widget.Debug.getName(getContext(), startConstraintSetId);
            androidx.constraintlayout.motion.widget.Debug.getName(getContext(), endConstraintSetId);
            sparseIntArray.get(startConstraintSetId);
            sparseIntArray2.get(endConstraintSetId);
            sparseIntArray.put(startConstraintSetId, endConstraintSetId);
            sparseIntArray2.put(endConstraintSetId, startConstraintSetId);
            this.accessartificialFrame.getHighResolutionOutputSizeshNQ4ISI(startConstraintSetId);
            this.accessartificialFrame.getHighResolutionOutputSizeshNQ4ISI(endConstraintSetId);
        }
    }

    public void setDebugMode(int i) {
        this.getHighSpeedVideoSizes = i;
        invalidate();
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI(float f, float f2, android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z;
        boolean onTouchEvent;
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                android.view.View childAt = viewGroup.getChildAt(childCount);
                if (getHighResolutionOutputSizeshNQ4ISI((childAt.getLeft() + f) - view.getScrollX(), (childAt.getTop() + f2) - view.getScrollY(), childAt, motionEvent)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            this.l.set(f, f2, (view.getRight() + f) - view.getLeft(), (view.getBottom() + f2) - view.getTop());
            if (motionEvent.getAction() != 0 || this.l.contains(motionEvent.getX(), motionEvent.getY())) {
                float f3 = -f;
                float f4 = -f2;
                android.graphics.Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f3, f4);
                    onTouchEvent = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f3, -f4);
                } else {
                    android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(f3, f4);
                    if (this.setup == null) {
                        this.setup = new android.graphics.Matrix();
                    }
                    matrix.invert(this.setup);
                    obtain.transform(this.setup);
                    onTouchEvent = view.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (onTouchEvent) {
                    return true;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00ee  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        androidx.constraintlayout.motion.widget.TouchResponse touchResponse;
        int i;
        android.graphics.RectF Camera2StreamConfigurationMap;
        java.util.Iterator<android.view.View> it;
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.accessartificialFrame;
        if (motionScene != null && this.AMEXKernelJNI) {
            if (motionScene.getHighSpeedVideoSizes != null) {
                androidx.constraintlayout.motion.widget.ViewTransitionController viewTransitionController = this.accessartificialFrame.getHighSpeedVideoSizes;
                int currentState = viewTransitionController.getHighSpeedVideoFpsRangesFor.getCurrentState();
                if (currentState != -1) {
                    if (viewTransitionController.Camera2StreamConfigurationMap == null) {
                        viewTransitionController.Camera2StreamConfigurationMap = new java.util.HashSet<>();
                        java.util.Iterator<androidx.constraintlayout.motion.widget.ViewTransition> it2 = viewTransitionController.getOutputFormats.iterator();
                        while (it2.hasNext()) {
                            androidx.constraintlayout.motion.widget.ViewTransition next = it2.next();
                            int childCount = viewTransitionController.getHighSpeedVideoFpsRangesFor.getChildCount();
                            for (int i2 = 0; i2 < childCount; i2++) {
                                android.view.View childAt = viewTransitionController.getHighSpeedVideoFpsRangesFor.getChildAt(i2);
                                if (next.getHighSpeedVideoFpsRanges(childAt)) {
                                    childAt.getId();
                                    viewTransitionController.Camera2StreamConfigurationMap.add(childAt);
                                }
                            }
                        }
                    }
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    android.graphics.Rect rect = new android.graphics.Rect();
                    int action = motionEvent.getAction();
                    java.util.ArrayList<androidx.constraintlayout.motion.widget.ViewTransition.Animate> arrayList = viewTransitionController.getHighSpeedVideoFpsRanges;
                    int i3 = 1;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        java.util.Iterator<androidx.constraintlayout.motion.widget.ViewTransition.Animate> it3 = viewTransitionController.getHighSpeedVideoFpsRanges.iterator();
                        while (it3.hasNext()) {
                            androidx.constraintlayout.motion.widget.ViewTransition.Animate next2 = it3.next();
                            if (action != 1) {
                                if (action == 2) {
                                    next2.getOutputMinFrameDuration.getView().getHitRect(next2.getOutputSizeshNQ4ISI);
                                    if (!next2.getOutputSizeshNQ4ISI.contains((int) x, (int) y) && !next2.getInputSizeshNQ4ISI) {
                                        next2.Camera2StreamConfigurationMap();
                                    }
                                }
                            } else if (!next2.getInputSizeshNQ4ISI) {
                                next2.Camera2StreamConfigurationMap();
                            }
                        }
                    }
                    if (action == 0 || action == 1) {
                        androidx.constraintlayout.widget.ConstraintSet constraintSet = viewTransitionController.getHighSpeedVideoFpsRangesFor.getConstraintSet(currentState);
                        java.util.Iterator<androidx.constraintlayout.motion.widget.ViewTransition> it4 = viewTransitionController.getOutputFormats.iterator();
                        while (it4.hasNext()) {
                            androidx.constraintlayout.motion.widget.ViewTransition next3 = it4.next();
                            int i4 = next3.getOutputFormats;
                            if (i4 == i3) {
                                if (action == 0) {
                                    it = viewTransitionController.Camera2StreamConfigurationMap.iterator();
                                    while (it.hasNext()) {
                                        android.view.View next4 = it.next();
                                        if (next3.getHighSpeedVideoFpsRanges(next4)) {
                                            next4.getHitRect(rect);
                                            if (rect.contains((int) x, (int) y)) {
                                                next3.getHighSpeedVideoSizes(viewTransitionController, viewTransitionController.getHighSpeedVideoFpsRangesFor, currentState, constraintSet, next4);
                                                next3 = next3;
                                                i3 = i3;
                                            }
                                        }
                                    }
                                } else {
                                    i3 = i3;
                                }
                            } else if (i4 != 2) {
                                if (i4 == 3 && action == 0) {
                                    it = viewTransitionController.Camera2StreamConfigurationMap.iterator();
                                    while (it.hasNext()) {
                                    }
                                }
                                i3 = i3;
                            } else if (action == i3) {
                                it = viewTransitionController.Camera2StreamConfigurationMap.iterator();
                                while (it.hasNext()) {
                                }
                            } else {
                                i3 = i3;
                            }
                        }
                    }
                }
            }
            androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.accessartificialFrame.getHighSpeedVideoFpsRangesFor;
            if (transition != null && transition.isEnabled() && (touchResponse = transition.getTouchResponse()) != null && ((motionEvent.getAction() != 0 || (Camera2StreamConfigurationMap = touchResponse.Camera2StreamConfigurationMap(this, new android.graphics.RectF())) == null || Camera2StreamConfigurationMap.contains(motionEvent.getX(), motionEvent.getY())) && (i = touchResponse.b) != -1)) {
                android.view.View view = this.TransactionOutcomeDecoderExternalSyntheticLambda3;
                if (view == null || view.getId() != i) {
                    this.TransactionOutcomeDecoderExternalSyntheticLambda3 = findViewById(i);
                }
                if (this.TransactionOutcomeDecoderExternalSyntheticLambda3 != null) {
                    this.l.set(r1.getLeft(), this.TransactionOutcomeDecoderExternalSyntheticLambda3.getTop(), this.TransactionOutcomeDecoderExternalSyntheticLambda3.getRight(), this.TransactionOutcomeDecoderExternalSyntheticLambda3.getBottom());
                    if (this.l.contains(motionEvent.getX(), motionEvent.getY()) && !getHighResolutionOutputSizeshNQ4ISI(this.TransactionOutcomeDecoderExternalSyntheticLambda3.getLeft(), this.TransactionOutcomeDecoderExternalSyntheticLambda3.getTop(), this.TransactionOutcomeDecoderExternalSyntheticLambda3, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.accessartificialFrame;
        if (motionScene != null && this.AMEXKernelJNI && motionScene.getHighResolutionOutputSizeshNQ4ISI()) {
            androidx.constraintlayout.motion.widget.MotionScene.Transition transition = this.accessartificialFrame.getHighSpeedVideoFpsRangesFor;
            if (transition != null && !transition.isEnabled()) {
                return super.onTouchEvent(motionEvent);
            }
            this.accessartificialFrame.getHighSpeedVideoFpsRangesFor(motionEvent, getCurrentState(), this);
            if (this.accessartificialFrame.getHighSpeedVideoFpsRangesFor.isTransitionFlag(4)) {
                return this.accessartificialFrame.getHighSpeedVideoFpsRangesFor.getTouchResponse().getHighResolutionOutputSizeshNQ4ISI;
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        android.view.Display display = getDisplay();
        if (display != null) {
            this.TransactionOutcomeDecoderExternalSyntheticLambda6 = display.getRotation();
        }
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.accessartificialFrame;
        if (motionScene != null && (i = this.getHighResolutionOutputSizeshNQ4ISI) != -1) {
            androidx.constraintlayout.widget.ConstraintSet highResolutionOutputSizeshNQ4ISI = motionScene.getHighResolutionOutputSizeshNQ4ISI(i);
            this.accessartificialFrame.getHighSpeedVideoFpsRangesFor(this);
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> arrayList = this.requestGoOnline;
            if (arrayList != null) {
                java.util.Iterator<androidx.constraintlayout.motion.widget.MotionHelper> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().onFinishedMotionScene(this);
                }
            }
            if (highResolutionOutputSizeshNQ4ISI != null) {
                highResolutionOutputSizeshNQ4ISI.applyTo(this);
            }
            this.startTransaction = this.getHighResolutionOutputSizeshNQ4ISI;
        }
        getHighResolutionOutputSizeshNQ4ISI();
        androidx.constraintlayout.motion.widget.MotionLayout.StateCache stateCache = this.TransactionOutcomeDecoderExternalSyntheticLambda7;
        if (stateCache != null) {
            if (this.requestPINEntry) {
                post(new java.lang.Runnable() { // from class: androidx.constraintlayout.motion.widget.MotionLayout.4
                    @Override // java.lang.Runnable
                    public void run() {
                        androidx.constraintlayout.motion.widget.MotionLayout.this.TransactionOutcomeDecoderExternalSyntheticLambda7.getHighSpeedVideoSizes();
                    }
                });
                return;
            } else {
                stateCache.getHighSpeedVideoSizes();
                return;
            }
        }
        androidx.constraintlayout.motion.widget.MotionScene motionScene2 = this.accessartificialFrame;
        if (motionScene2 == null || motionScene2.getHighSpeedVideoFpsRangesFor == null || this.accessartificialFrame.getHighSpeedVideoFpsRangesFor.getAutoTransition() != 4) {
            return;
        }
        transitionToEnd();
        getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP);
        getHighSpeedVideoFpsRanges(androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.accessartificialFrame;
        if (motionScene != null) {
            motionScene.setRtl(isRtl());
        }
    }

    final void getHighResolutionOutputSizeshNQ4ISI() {
        androidx.constraintlayout.motion.widget.MotionScene motionScene;
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition;
        androidx.constraintlayout.motion.widget.MotionScene motionScene2 = this.accessartificialFrame;
        if (motionScene2 != null) {
            if (motionScene2.getHighResolutionOutputSizeshNQ4ISI(this, this.getHighResolutionOutputSizeshNQ4ISI)) {
                requestLayout();
                return;
            }
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i != -1) {
                this.accessartificialFrame.addOnClickListeners(this, i);
            }
            if (!this.accessartificialFrame.getHighResolutionOutputSizeshNQ4ISI() || (transition = (motionScene = this.accessartificialFrame).getHighSpeedVideoFpsRangesFor) == null || transition.unwrapAs == null) {
                return;
            }
            motionScene.getHighSpeedVideoFpsRangesFor.unwrapAs.getHighSpeedVideoSizes();
        }
    }

    public int getCurrentState() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public float getProgress() {
        return this.AMEXKernel;
    }

    final void Camera2StreamConfigurationMap(int i, float f, float f2, float f3, float[] fArr) {
        java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> hashMap = this.getOutputMinFrameDuration;
        android.view.View viewById = getViewById(i);
        androidx.constraintlayout.motion.widget.MotionController motionController = hashMap.get(viewById);
        if (motionController == null) {
            if (viewById != null) {
                viewById.getContext().getResources().getResourceName(i);
            }
        } else {
            motionController.getHighSpeedVideoSizes(f, f2, f3, fArr);
            float y = viewById.getY();
            this.kernelID = f;
            this.aid = y;
        }
    }

    public long getTransitionTimeMs() {
        if (this.accessartificialFrame != null) {
            this.IAuthTabCallback = r0.getDuration() / 1000.0f;
        }
        return (long) (this.IAuthTabCallback * 1000.0f);
    }

    public void setTransitionListener(androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener transitionListener) {
        this.onNavigationEvent = transitionListener;
    }

    public void addTransitionListener(androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener transitionListener) {
        if (this.getInterfaceVersion == null) {
            this.getInterfaceVersion = new java.util.concurrent.CopyOnWriteArrayList<>();
        }
        this.getInterfaceVersion.add(transitionListener);
    }

    public boolean removeTransitionListener(androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener transitionListener) {
        java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener> copyOnWriteArrayList = this.getInterfaceVersion;
        if (copyOnWriteArrayList == null) {
            return false;
        }
        return copyOnWriteArrayList.remove(transitionListener);
    }

    public void fireTrigger(int i, boolean z, float f) {
        androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener transitionListener = this.onNavigationEvent;
        if (transitionListener != null) {
            transitionListener.onTransitionTrigger(this, i, z, f);
        }
        java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener> copyOnWriteArrayList = this.getInterfaceVersion;
        if (copyOnWriteArrayList != null) {
            java.util.Iterator<androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().onTransitionTrigger(this, i, z, f);
            }
        }
    }

    private void getHighSpeedVideoFpsRanges() {
        java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener> copyOnWriteArrayList;
        if ((this.onNavigationEvent == null && ((copyOnWriteArrayList = this.getInterfaceVersion) == null || copyOnWriteArrayList.isEmpty())) || this.provide == this.kernelVersion) {
            return;
        }
        if (this.TransactionOutcomeDecoderExternalSyntheticLambda1 != -1) {
            androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener transitionListener = this.onNavigationEvent;
            if (transitionListener != null) {
                transitionListener.onTransitionStarted(this, this.startTransaction, this.free);
            }
            java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener> copyOnWriteArrayList2 = this.getInterfaceVersion;
            if (copyOnWriteArrayList2 != null) {
                java.util.Iterator<androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().onTransitionStarted(this, this.startTransaction, this.free);
                }
            }
            this.getOutputStallDurationlomOqCM = true;
        }
        this.TransactionOutcomeDecoderExternalSyntheticLambda1 = -1;
        float f = this.kernelVersion;
        this.provide = f;
        androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener transitionListener2 = this.onNavigationEvent;
        if (transitionListener2 != null) {
            transitionListener2.onTransitionChange(this, this.startTransaction, this.free, f);
        }
        java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener> copyOnWriteArrayList3 = this.getInterfaceVersion;
        if (copyOnWriteArrayList3 != null) {
            java.util.Iterator<androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().onTransitionChange(this, this.startTransaction, this.free, this.kernelVersion);
            }
        }
        this.getOutputStallDurationlomOqCM = true;
    }

    protected void fireTransitionCompleted() {
        int i;
        java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener> copyOnWriteArrayList;
        if ((this.onNavigationEvent != null || ((copyOnWriteArrayList = this.getInterfaceVersion) != null && !copyOnWriteArrayList.isEmpty())) && this.TransactionOutcomeDecoderExternalSyntheticLambda1 == -1) {
            this.TransactionOutcomeDecoderExternalSyntheticLambda1 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (this.d.isEmpty()) {
                i = -1;
            } else {
                java.util.ArrayList<java.lang.Integer> arrayList = this.d;
                i = arrayList.get(arrayList.size() - 1).intValue();
            }
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i != i2 && i2 != -1) {
                this.d.add(java.lang.Integer.valueOf(i2));
            }
        }
        getHighSpeedVideoSizes();
        java.lang.Runnable runnable = this.decode;
        if (runnable != null) {
            runnable.run();
            this.decode = null;
        }
        int[] iArr = this.TransactionOutcomeDecoderExternalSyntheticLambda2;
        if (iArr == null || this.CoroutineDebuggingKt <= 0) {
            return;
        }
        transitionToState(iArr[0]);
        int[] iArr2 = this.TransactionOutcomeDecoderExternalSyntheticLambda2;
        java.lang.System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.CoroutineDebuggingKt--;
    }

    private void getHighSpeedVideoSizes() {
        java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener> copyOnWriteArrayList;
        if (this.onNavigationEvent == null && ((copyOnWriteArrayList = this.getInterfaceVersion) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        this.getOutputStallDurationlomOqCM = false;
        java.util.Iterator<java.lang.Integer> it = this.d.iterator();
        while (it.hasNext()) {
            java.lang.Integer next = it.next();
            androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener transitionListener = this.onNavigationEvent;
            if (transitionListener != null) {
                transitionListener.onTransitionCompleted(this, next.intValue());
            }
            java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener> copyOnWriteArrayList2 = this.getInterfaceVersion;
            if (copyOnWriteArrayList2 != null) {
                java.util.Iterator<androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener> it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().onTransitionCompleted(this, next.intValue());
                }
            }
        }
        this.d.clear();
    }

    public androidx.constraintlayout.motion.widget.DesignTool getDesignTool() {
        if (this.AMEXKernelCallback == null) {
            this.AMEXKernelCallback = new androidx.constraintlayout.motion.widget.DesignTool(this);
        }
        return this.AMEXKernelCallback;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        super.onViewAdded(view);
        if (view instanceof androidx.constraintlayout.motion.widget.MotionHelper) {
            androidx.constraintlayout.motion.widget.MotionHelper motionHelper = (androidx.constraintlayout.motion.widget.MotionHelper) view;
            if (this.getInterfaceVersion == null) {
                this.getInterfaceVersion = new java.util.concurrent.CopyOnWriteArrayList<>();
            }
            this.getInterfaceVersion.add(motionHelper);
            if (motionHelper.isUsedOnShow()) {
                if (this.TransactionOutcomeDecoder == null) {
                    this.TransactionOutcomeDecoder = new java.util.ArrayList<>();
                }
                this.TransactionOutcomeDecoder.add(motionHelper);
            }
            if (motionHelper.isUseOnHide()) {
                if (this.TransactionOutcomeDecoderExternalSyntheticLambda0 == null) {
                    this.TransactionOutcomeDecoderExternalSyntheticLambda0 = new java.util.ArrayList<>();
                }
                this.TransactionOutcomeDecoderExternalSyntheticLambda0.add(motionHelper);
            }
            if (motionHelper.isDecorator()) {
                if (this.requestGoOnline == null) {
                    this.requestGoOnline = new java.util.ArrayList<>();
                }
                this.requestGoOnline.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> arrayList = this.TransactionOutcomeDecoder;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> arrayList2 = this.TransactionOutcomeDecoderExternalSyntheticLambda0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public void setOnShow(float f) {
        java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> arrayList = this.TransactionOutcomeDecoder;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.TransactionOutcomeDecoder.get(i).setProgress(f);
            }
        }
    }

    public void setOnHide(float f) {
        java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> arrayList = this.TransactionOutcomeDecoderExternalSyntheticLambda0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.TransactionOutcomeDecoderExternalSyntheticLambda0.get(i).setProgress(f);
            }
        }
    }

    public int[] getConstraintSetIds() {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.accessartificialFrame;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getConstraintSetIds();
    }

    public int[] getMatchingConstraintSetIds(java.lang.String... strArr) {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.accessartificialFrame;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getMatchingStateLabels(strArr);
    }

    public androidx.constraintlayout.widget.ConstraintSet getConstraintSet(int i) {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.accessartificialFrame;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getHighResolutionOutputSizeshNQ4ISI(i);
    }

    public androidx.constraintlayout.widget.ConstraintSet cloneConstraintSet(int i) {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.accessartificialFrame;
        if (motionScene == null) {
            return null;
        }
        androidx.constraintlayout.widget.ConstraintSet highResolutionOutputSizeshNQ4ISI = motionScene.getHighResolutionOutputSizeshNQ4ISI(i);
        androidx.constraintlayout.widget.ConstraintSet constraintSet = new androidx.constraintlayout.widget.ConstraintSet();
        constraintSet.clone(highResolutionOutputSizeshNQ4ISI);
        return constraintSet;
    }

    @java.lang.Deprecated
    public void rebuildMotion() {
        rebuildScene();
    }

    public void rebuildScene() {
        this.getValidOutputFormatsForInputhNQ4ISI.getHighSpeedVideoSizes();
        invalidate();
    }

    public void updateState(int i, androidx.constraintlayout.widget.ConstraintSet constraintSet) {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.accessartificialFrame;
        if (motionScene != null) {
            motionScene.setConstraintSet(i, constraintSet);
        }
        updateState();
        if (this.getHighResolutionOutputSizeshNQ4ISI == i) {
            constraintSet.applyTo(this);
        }
    }

    public void updateStateAnimate(int i, androidx.constraintlayout.widget.ConstraintSet constraintSet, int i2) {
        if (this.accessartificialFrame == null || this.getHighResolutionOutputSizeshNQ4ISI != i) {
            return;
        }
        updateState(androidx.constraintlayout.widget.R.id.view_transition, getConstraintSet(i));
        setState(androidx.constraintlayout.widget.R.id.view_transition, -1, -1);
        updateState(i, constraintSet);
        androidx.constraintlayout.motion.widget.MotionScene.Transition transition = new androidx.constraintlayout.motion.widget.MotionScene.Transition(-1, this.accessartificialFrame, androidx.constraintlayout.widget.R.id.view_transition, i);
        transition.setDuration(i2);
        setTransition(transition);
        transitionToEnd();
    }

    public void scheduleTransitionTo(int i) {
        if (getCurrentState() == -1) {
            transitionToState(i);
            return;
        }
        int[] iArr = this.TransactionOutcomeDecoderExternalSyntheticLambda2;
        if (iArr == null) {
            this.TransactionOutcomeDecoderExternalSyntheticLambda2 = new int[4];
        } else if (iArr.length <= this.CoroutineDebuggingKt) {
            this.TransactionOutcomeDecoderExternalSyntheticLambda2 = java.util.Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.TransactionOutcomeDecoderExternalSyntheticLambda2;
        int i2 = this.CoroutineDebuggingKt;
        this.CoroutineDebuggingKt = i2 + 1;
        iArr2[i2] = i;
    }

    public void updateState() {
        androidx.constraintlayout.motion.widget.MotionLayout.Model model = this.getValidOutputFormatsForInputhNQ4ISI;
        androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutWidget;
        model.getHighSpeedVideoFpsRangesFor(this.accessartificialFrame.getHighResolutionOutputSizeshNQ4ISI(this.startTransaction), this.accessartificialFrame.getHighResolutionOutputSizeshNQ4ISI(this.free));
        rebuildScene();
    }

    public java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene.Transition> getDefinedTransitions() {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.accessartificialFrame;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getDefinedTransitions();
    }

    public int getStartState() {
        return this.startTransaction;
    }

    public int getEndState() {
        return this.free;
    }

    public float getTargetPosition() {
        return this.init;
    }

    public void setTransitionDuration(int i) {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.accessartificialFrame;
        if (motionScene == null) {
            return;
        }
        motionScene.setDuration(i);
    }

    public androidx.constraintlayout.motion.widget.MotionScene.Transition getTransition(int i) {
        return this.accessartificialFrame.getTransitionById(i);
    }

    public void setInteractionEnabled(boolean z) {
        this.AMEXKernelJNI = z;
    }

    public boolean isInteractionEnabled() {
        return this.AMEXKernelJNI;
    }

    public void viewTransition(int i, android.view.View... viewArr) {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.accessartificialFrame;
        if (motionScene != null) {
            motionScene.viewTransition(i, viewArr);
        }
    }

    public void enableViewTransition(int i, boolean z) {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.accessartificialFrame;
        if (motionScene != null) {
            motionScene.enableViewTransition(i, z);
        }
    }

    public boolean isViewTransitionEnabled(int i) {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.accessartificialFrame;
        if (motionScene != null) {
            return motionScene.isViewTransitionEnabled(i);
        }
        return false;
    }

    public boolean applyViewTransition(int i, androidx.constraintlayout.motion.widget.MotionController motionController) {
        androidx.constraintlayout.motion.widget.MotionScene motionScene = this.accessartificialFrame;
        if (motionScene != null) {
            return motionScene.applyViewTransition(i, motionController);
        }
        return false;
    }

    public boolean isDelayedApplicationOfInitialState() {
        return this.requestPINEntry;
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.requestPINEntry = z;
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(androidx.constraintlayout.motion.widget.MotionLayout motionLayout) {
        int childCount = motionLayout.getChildCount();
        motionLayout.getValidOutputFormatsForInputhNQ4ISI.getHighSpeedVideoFpsRangesFor();
        motionLayout.getOutputFormats = true;
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = motionLayout.getChildAt(i2);
            sparseArray.put(childAt.getId(), motionLayout.getOutputMinFrameDuration.get(childAt));
        }
        int width = motionLayout.getWidth();
        int height = motionLayout.getHeight();
        int gatPathMotionArc = motionLayout.accessartificialFrame.gatPathMotionArc();
        if (gatPathMotionArc != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                androidx.constraintlayout.motion.widget.MotionController motionController = motionLayout.getOutputMinFrameDuration.get(motionLayout.getChildAt(i3));
                if (motionController != null) {
                    motionController.setPathMotionArc(gatPathMotionArc);
                }
            }
        }
        android.util.SparseBooleanArray sparseBooleanArray = new android.util.SparseBooleanArray();
        int[] iArr = new int[motionLayout.getOutputMinFrameDuration.size()];
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            androidx.constraintlayout.motion.widget.MotionController motionController2 = motionLayout.getOutputMinFrameDuration.get(motionLayout.getChildAt(i5));
            if (motionController2.getAnimateRelativeTo() != -1) {
                sparseBooleanArray.put(motionController2.getAnimateRelativeTo(), true);
                iArr[i4] = motionController2.getAnimateRelativeTo();
                i4++;
            }
        }
        if (motionLayout.requestGoOnline != null) {
            for (int i6 = 0; i6 < i4; i6++) {
                androidx.constraintlayout.motion.widget.MotionController motionController3 = motionLayout.getOutputMinFrameDuration.get(motionLayout.findViewById(iArr[i6]));
                if (motionController3 != null) {
                    motionLayout.accessartificialFrame.getKeyFrames(motionController3);
                }
            }
            java.util.Iterator<androidx.constraintlayout.motion.widget.MotionHelper> it = motionLayout.requestGoOnline.iterator();
            while (it.hasNext()) {
                it.next().onPreSetup(motionLayout, motionLayout.getOutputMinFrameDuration);
            }
            for (int i7 = 0; i7 < i4; i7++) {
                androidx.constraintlayout.motion.widget.MotionController motionController4 = motionLayout.getOutputMinFrameDuration.get(motionLayout.findViewById(iArr[i7]));
                if (motionController4 != null) {
                    motionController4.setup(width, height, motionLayout.IAuthTabCallback, motionLayout.getNanoTime());
                }
            }
        } else {
            for (int i8 = 0; i8 < i4; i8++) {
                androidx.constraintlayout.motion.widget.MotionController motionController5 = motionLayout.getOutputMinFrameDuration.get(motionLayout.findViewById(iArr[i8]));
                if (motionController5 != null) {
                    motionLayout.accessartificialFrame.getKeyFrames(motionController5);
                    motionController5.setup(width, height, motionLayout.IAuthTabCallback, motionLayout.getNanoTime());
                }
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            android.view.View childAt2 = motionLayout.getChildAt(i9);
            androidx.constraintlayout.motion.widget.MotionController motionController6 = motionLayout.getOutputMinFrameDuration.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && motionController6 != null) {
                motionLayout.accessartificialFrame.getKeyFrames(motionController6);
                motionController6.setup(width, height, motionLayout.IAuthTabCallback, motionLayout.getNanoTime());
            }
        }
        float staggered = motionLayout.accessartificialFrame.getStaggered();
        if (staggered != 0.0f) {
            boolean z = ((double) staggered) < 0.0d;
            float abs = java.lang.Math.abs(staggered);
            float f = Float.MAX_VALUE;
            float f2 = -3.4028235E38f;
            float f3 = Float.MAX_VALUE;
            float f4 = -3.4028235E38f;
            for (int i10 = 0; i10 < childCount; i10++) {
                androidx.constraintlayout.motion.widget.MotionController motionController7 = motionLayout.getOutputMinFrameDuration.get(motionLayout.getChildAt(i10));
                if (!java.lang.Float.isNaN(motionController7.isOutputSupportedForhNQ4ISI)) {
                    for (int i11 = 0; i11 < childCount; i11++) {
                        androidx.constraintlayout.motion.widget.MotionController motionController8 = motionLayout.getOutputMinFrameDuration.get(motionLayout.getChildAt(i11));
                        if (!java.lang.Float.isNaN(motionController8.isOutputSupportedForhNQ4ISI)) {
                            f = java.lang.Math.min(f, motionController8.isOutputSupportedForhNQ4ISI);
                            f2 = java.lang.Math.max(f2, motionController8.isOutputSupportedForhNQ4ISI);
                        }
                    }
                    while (i < childCount) {
                        androidx.constraintlayout.motion.widget.MotionController motionController9 = motionLayout.getOutputMinFrameDuration.get(motionLayout.getChildAt(i));
                        if (!java.lang.Float.isNaN(motionController9.isOutputSupportedForhNQ4ISI)) {
                            motionController9.CoroutineDebuggingKt = 1.0f / (1.0f - abs);
                            if (z) {
                                motionController9.getValidOutputFormatsForInputhNQ4ISI = abs - (((f2 - motionController9.isOutputSupportedForhNQ4ISI) / (f2 - f)) * abs);
                            } else {
                                motionController9.getValidOutputFormatsForInputhNQ4ISI = abs - (((motionController9.isOutputSupportedForhNQ4ISI - f) * abs) / (f2 - f));
                            }
                        }
                        i++;
                    }
                    return;
                }
                float finalX = motionController7.getFinalX();
                float finalY = motionController7.getFinalY();
                float f5 = z ? finalY - finalX : finalY + finalX;
                f3 = java.lang.Math.min(f3, f5);
                f4 = java.lang.Math.max(f4, f5);
            }
            while (i < childCount) {
                androidx.constraintlayout.motion.widget.MotionController motionController10 = motionLayout.getOutputMinFrameDuration.get(motionLayout.getChildAt(i));
                float finalX2 = motionController10.getFinalX();
                float finalY2 = motionController10.getFinalY();
                float f6 = z ? finalY2 - finalX2 : finalY2 + finalX2;
                motionController10.CoroutineDebuggingKt = 1.0f / (1.0f - abs);
                motionController10.getValidOutputFormatsForInputhNQ4ISI = abs - (((f6 - f3) * abs) / (f4 - f3));
                i++;
            }
        }
    }

    static /* synthetic */ android.graphics.Rect getHighSpeedVideoSizes(androidx.constraintlayout.motion.widget.MotionLayout motionLayout, androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget) {
        motionLayout.c.top = constraintWidget.getY();
        motionLayout.c.left = constraintWidget.getX();
        motionLayout.c.right = constraintWidget.getWidth() + motionLayout.c.left;
        motionLayout.c.bottom = constraintWidget.getHeight() + motionLayout.c.top;
        return motionLayout.c;
    }
}
