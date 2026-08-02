package com.microblink.blinkid.view.surface;

/* loaded from: classes10.dex */
public final class IllIIIIllI extends android.view.ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ com.microblink.blinkid.view.surface.lIlIIIIlIl llIIlIlIIl;

    public IllIIIIllI(com.microblink.blinkid.view.surface.lIlIIIIlIl liliiiilil) {
        this.llIIlIlIIl = liliiiilil;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(android.view.ScaleGestureDetector scaleGestureDetector) {
        com.microblink.blinkid.view.surface.ICameraView.CameraViewEventListener cameraViewEventListener = this.llIIlIlIIl.lIIIIIllll;
        if (cameraViewEventListener == null) {
            return false;
        }
        cameraViewEventListener.onCameraPinchEvent(scaleGestureDetector.getScaleFactor());
        return true;
    }
}
