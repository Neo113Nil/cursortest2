package com.microblink.blinkid.view.surface;

/* loaded from: classes10.dex */
public final class IlIllIlIIl extends android.view.ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ com.microblink.blinkid.view.surface.IllIIIllII llIIlIlIIl;

    public IlIllIlIIl(com.microblink.blinkid.view.surface.IllIIIllII illIIIllII) {
        this.llIIlIlIIl = illIIIllII;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(android.view.ScaleGestureDetector scaleGestureDetector) {
        com.microblink.blinkid.view.surface.ICameraView.CameraViewEventListener cameraViewEventListener = this.llIIlIlIIl.lIlIIIIlIl;
        if (cameraViewEventListener == null) {
            return false;
        }
        cameraViewEventListener.onCameraPinchEvent(scaleGestureDetector.getScaleFactor());
        return true;
    }
}
