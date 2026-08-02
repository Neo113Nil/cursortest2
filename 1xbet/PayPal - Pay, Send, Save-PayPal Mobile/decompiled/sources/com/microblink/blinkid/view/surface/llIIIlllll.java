package com.microblink.blinkid.view.surface;

/* loaded from: classes10.dex */
public final class llIIIlllll extends android.view.GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ com.microblink.blinkid.view.surface.lIlIIIIlIl llIIlIlIIl;

    public llIIIlllll(com.microblink.blinkid.view.surface.lIlIIIIlIl liliiiilil) {
        this.llIIlIlIIl = liliiiilil;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        float[] fArr = {motionEvent.getX(), motionEvent.getY()};
        com.microblink.blinkid.util.Log.d(this, "Camera surface view touch event at location: ({}, {})", java.lang.Float.valueOf(fArr[0]), java.lang.Float.valueOf(fArr[1]));
        float size = android.view.View.MeasureSpec.getSize(this.llIIlIlIIl.getMeasuredWidth());
        float size2 = android.view.View.MeasureSpec.getSize(this.llIIlIlIIl.getMeasuredHeight());
        fArr[0] = fArr[0] / size;
        fArr[1] = fArr[1] / size2;
        com.microblink.blinkid.secured.lIIlIIllII.IlIllIlIIl(this.llIIlIlIIl.IIlIIIllIl, fArr);
        com.microblink.blinkid.util.Log.d(this, "Camera surface view touch event at normalized location: ({}, {})", java.lang.Float.valueOf(fArr[0]), java.lang.Float.valueOf(fArr[1]));
        com.microblink.blinkid.view.surface.ICameraView.CameraViewEventListener cameraViewEventListener = this.llIIlIlIIl.lIIIIIllll;
        if (cameraViewEventListener == null) {
            return false;
        }
        cameraViewEventListener.onCameraTapEvent(fArr[0], fArr[1]);
        return true;
    }
}
