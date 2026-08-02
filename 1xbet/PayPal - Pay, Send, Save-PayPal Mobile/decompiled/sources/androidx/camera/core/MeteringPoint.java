package androidx.camera.core;

/* loaded from: classes.dex */
public class MeteringPoint {
    private float Camera2StreamConfigurationMap;
    private float getHighResolutionOutputSizeshNQ4ISI;
    private android.util.Rational getHighSpeedVideoFpsRangesFor;
    private float getHighSpeedVideoSizes;

    MeteringPoint(float f, float f2, float f3, android.util.Rational rational) {
        this.getHighSpeedVideoSizes = f;
        this.Camera2StreamConfigurationMap = f2;
        this.getHighResolutionOutputSizeshNQ4ISI = f3;
        this.getHighSpeedVideoFpsRangesFor = rational;
    }

    public float getX() {
        return this.getHighSpeedVideoSizes;
    }

    public float getY() {
        return this.Camera2StreamConfigurationMap;
    }

    public float getSize() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public android.util.Rational getSurfaceAspectRatio() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
