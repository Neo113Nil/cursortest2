package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public class CameraCaptureFailure {
    private final androidx.camera.core.impl.CameraCaptureFailure.Reason getHighSpeedVideoSizes;

    public enum Reason {
        ERROR
    }

    public java.lang.Object getCaptureFailure() {
        return null;
    }

    public CameraCaptureFailure(androidx.camera.core.impl.CameraCaptureFailure.Reason reason) {
        this.getHighSpeedVideoSizes = reason;
    }

    public androidx.camera.core.impl.CameraCaptureFailure.Reason getReason() {
        return this.getHighSpeedVideoSizes;
    }
}
