package androidx.camera.core;

/* loaded from: classes6.dex */
public final class DisplayOrientedMeteringPointFactory extends androidx.camera.core.MeteringPointFactory {
    private final android.view.Display Camera2StreamConfigurationMap;
    private final androidx.camera.core.CameraInfo getHighSpeedVideoFpsRanges;
    private final float getHighSpeedVideoFpsRangesFor;
    private final float getHighSpeedVideoSizes;

    public DisplayOrientedMeteringPointFactory(android.view.Display display, androidx.camera.core.CameraInfo cameraInfo, float f, float f2) {
        this.getHighSpeedVideoFpsRangesFor = f;
        this.getHighSpeedVideoSizes = f2;
        this.Camera2StreamConfigurationMap = display;
        this.getHighSpeedVideoFpsRanges = cameraInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    @Override // androidx.camera.core.MeteringPointFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final android.graphics.PointF convertPoint(float f, float f2) {
        float f3 = this.getHighSpeedVideoFpsRangesFor;
        float f4 = this.getHighSpeedVideoSizes;
        boolean z = this.getHighSpeedVideoFpsRanges.getLensFacing() == 0;
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(z);
        if (highSpeedVideoFpsRangesFor == 90 || highSpeedVideoFpsRangesFor == 270) {
            f2 = f;
            f = f2;
            f4 = f3;
            f3 = f4;
        }
        if (highSpeedVideoFpsRangesFor != 90) {
            if (highSpeedVideoFpsRangesFor != 180) {
                if (highSpeedVideoFpsRangesFor == 270) {
                    f = f3 - f;
                }
                if (z) {
                    f = f3 - f;
                }
                return new android.graphics.PointF(f / f3, f2 / f4);
            }
            f = f3 - f;
        }
        f2 = f4 - f2;
        if (z) {
        }
        return new android.graphics.PointF(f / f3, f2 / f4);
    }

    private int getHighSpeedVideoFpsRangesFor(boolean z) {
        try {
            int sensorRotationDegrees = this.getHighSpeedVideoFpsRanges.getSensorRotationDegrees(this.Camera2StreamConfigurationMap.getRotation());
            return z ? (360 - sensorRotationDegrees) % 360 : sensorRotationDegrees;
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }
}
