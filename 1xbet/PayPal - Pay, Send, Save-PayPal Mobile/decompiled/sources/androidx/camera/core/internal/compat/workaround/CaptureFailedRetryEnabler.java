package androidx.camera.core.internal.compat.workaround;

/* loaded from: classes6.dex */
public class CaptureFailedRetryEnabler {
    private final androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk Camera2StreamConfigurationMap = (androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk) androidx.camera.core.internal.compat.quirk.DeviceQuirks.get(androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk.class);

    public int getRetryCount() {
        androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk captureFailedRetryQuirk = this.Camera2StreamConfigurationMap;
        if (captureFailedRetryQuirk == null) {
            return 0;
        }
        return captureFailedRetryQuirk.getRetryCount();
    }
}
