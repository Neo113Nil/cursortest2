package androidx.core.view;

/* loaded from: classes.dex */
public class DifferentialMotionFlingController {
    private final android.content.Context mContext;
    private final int[] mFlingVelocityThresholds;
    private float mLastFlingVelocity;
    private int mLastProcessedAxis;
    private int mLastProcessedDeviceId;
    private int mLastProcessedSource;
    private final androidx.core.view.DifferentialMotionFlingTarget mTarget;
    private final androidx.core.view.DifferentialMotionFlingController.DifferentialVelocityProvider mVelocityProvider;
    private final androidx.core.view.DifferentialMotionFlingController.FlingVelocityThresholdCalculator mVelocityThresholdCalculator;
    private android.view.VelocityTracker mVelocityTracker;

    interface DifferentialVelocityProvider {
        float getCurrentVelocity(android.view.VelocityTracker velocityTracker, android.view.MotionEvent motionEvent, int i);
    }

    interface FlingVelocityThresholdCalculator {
        void calculateFlingVelocityThresholds(android.content.Context context, int[] iArr, android.view.MotionEvent motionEvent, int i);
    }

    public DifferentialMotionFlingController(android.content.Context context, androidx.core.view.DifferentialMotionFlingTarget differentialMotionFlingTarget) {
        this(context, differentialMotionFlingTarget, new androidx.core.view.DifferentialMotionFlingController.FlingVelocityThresholdCalculator() { // from class: androidx.core.view.DifferentialMotionFlingController$$ExternalSyntheticLambda0
            @Override // androidx.core.view.DifferentialMotionFlingController.FlingVelocityThresholdCalculator
            public final void calculateFlingVelocityThresholds(android.content.Context context2, int[] iArr, android.view.MotionEvent motionEvent, int i) {
                androidx.core.view.DifferentialMotionFlingController.calculateFlingVelocityThresholds(context2, iArr, motionEvent, i);
            }
        }, new androidx.core.view.DifferentialMotionFlingController.DifferentialVelocityProvider() { // from class: androidx.core.view.DifferentialMotionFlingController$$ExternalSyntheticLambda1
            @Override // androidx.core.view.DifferentialMotionFlingController.DifferentialVelocityProvider
            public final float getCurrentVelocity(android.view.VelocityTracker velocityTracker, android.view.MotionEvent motionEvent, int i) {
                float currentVelocity;
                currentVelocity = androidx.core.view.DifferentialMotionFlingController.getCurrentVelocity(velocityTracker, motionEvent, i);
                return currentVelocity;
            }
        });
    }

    DifferentialMotionFlingController(android.content.Context context, androidx.core.view.DifferentialMotionFlingTarget differentialMotionFlingTarget, androidx.core.view.DifferentialMotionFlingController.FlingVelocityThresholdCalculator flingVelocityThresholdCalculator, androidx.core.view.DifferentialMotionFlingController.DifferentialVelocityProvider differentialVelocityProvider) {
        this.mLastProcessedAxis = -1;
        this.mLastProcessedSource = -1;
        this.mLastProcessedDeviceId = -1;
        this.mFlingVelocityThresholds = new int[]{Integer.MAX_VALUE, 0};
        this.mContext = context;
        this.mTarget = differentialMotionFlingTarget;
        this.mVelocityThresholdCalculator = flingVelocityThresholdCalculator;
        this.mVelocityProvider = differentialVelocityProvider;
    }

    public void onMotionEvent(android.view.MotionEvent motionEvent, int i) {
        boolean calculateFlingVelocityThresholds = calculateFlingVelocityThresholds(motionEvent, i);
        if (this.mFlingVelocityThresholds[0] == Integer.MAX_VALUE) {
            android.view.VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.mVelocityTracker = null;
                return;
            }
            return;
        }
        float currentVelocity = getCurrentVelocity(motionEvent, i) * this.mTarget.getScaledScrollFactor();
        float signum = java.lang.Math.signum(currentVelocity);
        if (calculateFlingVelocityThresholds || (signum != java.lang.Math.signum(this.mLastFlingVelocity) && signum != 0.0f)) {
            this.mTarget.stopDifferentialMotionFling();
        }
        float abs = java.lang.Math.abs(currentVelocity);
        int[] iArr = this.mFlingVelocityThresholds;
        if (abs < iArr[0]) {
            return;
        }
        float max = java.lang.Math.max(-r6, java.lang.Math.min(currentVelocity, iArr[1]));
        this.mLastFlingVelocity = this.mTarget.startDifferentialMotionFling(max) ? max : 0.0f;
    }

    private boolean calculateFlingVelocityThresholds(android.view.MotionEvent motionEvent, int i) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.mLastProcessedSource == source && this.mLastProcessedDeviceId == deviceId && this.mLastProcessedAxis == i) {
            return false;
        }
        this.mVelocityThresholdCalculator.calculateFlingVelocityThresholds(this.mContext, this.mFlingVelocityThresholds, motionEvent, i);
        this.mLastProcessedSource = source;
        this.mLastProcessedDeviceId = deviceId;
        this.mLastProcessedAxis = i;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void calculateFlingVelocityThresholds(android.content.Context context, int[] iArr, android.view.MotionEvent motionEvent, int i) {
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        iArr[0] = androidx.core.view.ViewConfigurationCompat.getScaledMinimumFlingVelocity(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
        iArr[1] = androidx.core.view.ViewConfigurationCompat.getScaledMaximumFlingVelocity(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
    }

    private float getCurrentVelocity(android.view.MotionEvent motionEvent, int i) {
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = android.view.VelocityTracker.obtain();
        }
        return this.mVelocityProvider.getCurrentVelocity(this.mVelocityTracker, motionEvent, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float getCurrentVelocity(android.view.VelocityTracker velocityTracker, android.view.MotionEvent motionEvent, int i) {
        androidx.core.view.VelocityTrackerCompat.addMovement(velocityTracker, motionEvent);
        androidx.core.view.VelocityTrackerCompat.computeCurrentVelocity(velocityTracker, 1000);
        return androidx.core.view.VelocityTrackerCompat.getAxisVelocity(velocityTracker, i);
    }
}
