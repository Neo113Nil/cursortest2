package androidx.core.view;

/* loaded from: classes3.dex */
public class DifferentialMotionFlingController {
    private int Camera2StreamConfigurationMap;
    private float getHighResolutionOutputSizeshNQ4ISI;
    private final android.content.Context getHighSpeedVideoFpsRanges;
    private final int[] getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private final androidx.core.view.DifferentialMotionFlingController.FlingVelocityThresholdCalculator getInputFormats;
    private android.view.VelocityTracker getInputSizeshNQ4ISI;
    private final androidx.core.view.DifferentialMotionFlingTarget getOutputFormats;
    private final androidx.core.view.DifferentialMotionFlingController.DifferentialVelocityProvider getOutputMinFrameDuration;

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
                androidx.core.view.DifferentialMotionFlingController.$r8$lambda$lv23FpWloyumz6IvnMabmJR9BpE(context2, iArr, motionEvent, i);
            }
        }, new androidx.core.view.DifferentialMotionFlingController.DifferentialVelocityProvider() { // from class: androidx.core.view.DifferentialMotionFlingController$$ExternalSyntheticLambda1
            @Override // androidx.core.view.DifferentialMotionFlingController.DifferentialVelocityProvider
            public final float getCurrentVelocity(android.view.VelocityTracker velocityTracker, android.view.MotionEvent motionEvent, int i) {
                return androidx.core.view.DifferentialMotionFlingController.$r8$lambda$rCNQ1h5KBIaVcUXhwymI_1638W0(velocityTracker, motionEvent, i);
            }
        });
    }

    private DifferentialMotionFlingController(android.content.Context context, androidx.core.view.DifferentialMotionFlingTarget differentialMotionFlingTarget, androidx.core.view.DifferentialMotionFlingController.FlingVelocityThresholdCalculator flingVelocityThresholdCalculator, androidx.core.view.DifferentialMotionFlingController.DifferentialVelocityProvider differentialVelocityProvider) {
        this.getHighSpeedVideoSizes = -1;
        this.getHighSpeedVideoSizesFor = -1;
        this.Camera2StreamConfigurationMap = -1;
        this.getHighSpeedVideoFpsRangesFor = new int[]{Integer.MAX_VALUE, 0};
        this.getHighSpeedVideoFpsRanges = context;
        this.getOutputFormats = differentialMotionFlingTarget;
        this.getInputFormats = flingVelocityThresholdCalculator;
        this.getOutputMinFrameDuration = differentialVelocityProvider;
    }

    public static /* synthetic */ void $r8$lambda$lv23FpWloyumz6IvnMabmJR9BpE(android.content.Context context, int[] iArr, android.view.MotionEvent motionEvent, int i) {
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        iArr[0] = androidx.core.view.ViewConfigurationCompat.getScaledMinimumFlingVelocity(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
        iArr[1] = androidx.core.view.ViewConfigurationCompat.getScaledMaximumFlingVelocity(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
    }

    public static /* synthetic */ float $r8$lambda$rCNQ1h5KBIaVcUXhwymI_1638W0(android.view.VelocityTracker velocityTracker, android.view.MotionEvent motionEvent, int i) {
        androidx.core.view.VelocityTrackerCompat.addMovement(velocityTracker, motionEvent);
        androidx.core.view.VelocityTrackerCompat.computeCurrentVelocity(velocityTracker, 1000);
        return androidx.core.view.VelocityTrackerCompat.getAxisVelocity(velocityTracker, i);
    }

    public void onMotionEvent(android.view.MotionEvent motionEvent, int i) {
        boolean z;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.getHighSpeedVideoSizesFor == source && this.Camera2StreamConfigurationMap == deviceId && this.getHighSpeedVideoSizes == i) {
            z = false;
        } else {
            this.getInputFormats.calculateFlingVelocityThresholds(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, motionEvent, i);
            this.getHighSpeedVideoSizesFor = source;
            this.Camera2StreamConfigurationMap = deviceId;
            this.getHighSpeedVideoSizes = i;
            z = true;
        }
        if (this.getHighSpeedVideoFpsRangesFor[0] == Integer.MAX_VALUE) {
            android.view.VelocityTracker velocityTracker = this.getInputSizeshNQ4ISI;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.getInputSizeshNQ4ISI = null;
                return;
            }
            return;
        }
        if (this.getInputSizeshNQ4ISI == null) {
            this.getInputSizeshNQ4ISI = android.view.VelocityTracker.obtain();
        }
        float currentVelocity = this.getOutputMinFrameDuration.getCurrentVelocity(this.getInputSizeshNQ4ISI, motionEvent, i) * this.getOutputFormats.getScaledScrollFactor();
        float signum = java.lang.Math.signum(currentVelocity);
        if (z || (signum != java.lang.Math.signum(this.getHighResolutionOutputSizeshNQ4ISI) && signum != 0.0f)) {
            this.getOutputFormats.stopDifferentialMotionFling();
        }
        float abs = java.lang.Math.abs(currentVelocity);
        int[] iArr = this.getHighSpeedVideoFpsRangesFor;
        if (abs < iArr[0]) {
            return;
        }
        float max = java.lang.Math.max(-r9, java.lang.Math.min(currentVelocity, iArr[1]));
        this.getHighResolutionOutputSizeshNQ4ISI = this.getOutputFormats.startDifferentialMotionFling(max) ? max : 0.0f;
    }
}
