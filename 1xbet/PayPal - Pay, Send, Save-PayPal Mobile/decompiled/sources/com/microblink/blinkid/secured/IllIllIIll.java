package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public abstract class IllIllIIll extends android.hardware.camera2.CameraCaptureSession.StateCallback {
    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
        super.onActive(cameraCaptureSession);
        com.microblink.blinkid.util.Log.d(com.microblink.blinkid.secured.IlIIIlIIIl.class, "Session is now active", new java.lang.Object[0]);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
        super.onClosed(cameraCaptureSession);
        com.microblink.blinkid.util.Log.d(com.microblink.blinkid.secured.IlIIIlIIIl.class, "Session is now closed", new java.lang.Object[0]);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(android.hardware.camera2.CameraCaptureSession cameraCaptureSession) {
        super.onReady(cameraCaptureSession);
        com.microblink.blinkid.util.Log.d(com.microblink.blinkid.secured.IlIIIlIIIl.class, "Session is now ready", new java.lang.Object[0]);
    }
}
