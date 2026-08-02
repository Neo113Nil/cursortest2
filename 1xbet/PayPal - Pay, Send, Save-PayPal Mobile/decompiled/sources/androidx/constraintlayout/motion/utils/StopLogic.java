package androidx.constraintlayout.motion.utils;

/* loaded from: classes7.dex */
public class StopLogic extends androidx.constraintlayout.motion.widget.MotionInterpolator {
    private androidx.constraintlayout.core.motion.utils.StopLogicEngine Camera2StreamConfigurationMap;
    private androidx.constraintlayout.core.motion.utils.StopEngine getHighSpeedVideoFpsRangesFor;
    private androidx.constraintlayout.core.motion.utils.SpringStopEngine getHighSpeedVideoSizes;

    public StopLogic() {
        androidx.constraintlayout.core.motion.utils.StopLogicEngine stopLogicEngine = new androidx.constraintlayout.core.motion.utils.StopLogicEngine();
        this.Camera2StreamConfigurationMap = stopLogicEngine;
        this.getHighSpeedVideoFpsRangesFor = stopLogicEngine;
    }

    public java.lang.String debug(java.lang.String str, float f) {
        return this.getHighSpeedVideoFpsRangesFor.debug(str, f);
    }

    public float getVelocity(float f) {
        return this.getHighSpeedVideoFpsRangesFor.getVelocity(f);
    }

    public void config(float f, float f2, float f3, float f4, float f5, float f6) {
        androidx.constraintlayout.core.motion.utils.StopLogicEngine stopLogicEngine = this.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = stopLogicEngine;
        stopLogicEngine.config(f, f2, f3, f4, f5, f6);
    }

    public void springConfig(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        if (this.getHighSpeedVideoSizes == null) {
            this.getHighSpeedVideoSizes = new androidx.constraintlayout.core.motion.utils.SpringStopEngine();
        }
        androidx.constraintlayout.core.motion.utils.SpringStopEngine springStopEngine = this.getHighSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor = springStopEngine;
        springStopEngine.springConfig(f, f2, f3, f4, f5, f6, f7, i);
    }

    @Override // androidx.constraintlayout.motion.widget.MotionInterpolator, android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return this.getHighSpeedVideoFpsRangesFor.getInterpolation(f);
    }

    @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
    public float getVelocity() {
        return this.getHighSpeedVideoFpsRangesFor.getVelocity();
    }

    public boolean isStopped() {
        return this.getHighSpeedVideoFpsRangesFor.isStopped();
    }
}
