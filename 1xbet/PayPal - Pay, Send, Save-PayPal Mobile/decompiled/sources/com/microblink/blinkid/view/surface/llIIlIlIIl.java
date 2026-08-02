package com.microblink.blinkid.view.surface;

/* loaded from: classes10.dex */
public final class llIIlIlIIl extends android.view.GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ com.microblink.blinkid.view.surface.IllIIIllII llIIlIlIIl;

    public llIIlIlIIl(com.microblink.blinkid.view.surface.IllIIIllII illIIIllII) {
        this.llIIlIlIIl = illIIIllII;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        float[] fArr = {motionEvent.getX(), motionEvent.getY()};
        com.microblink.blinkid.util.Log.v(this, "Camera surface view touch event at location: ({}, {})", java.lang.Float.valueOf(fArr[0]), java.lang.Float.valueOf(fArr[1]));
        if (this.llIIlIlIIl.llIIlIIlll == com.microblink.blinkid.view.CameraAspectMode.ASPECT_FILL) {
            fArr[0] = fArr[0] - r6.lllIlIlIIl;
            fArr[1] = fArr[1] - r6.IlIllIlllI;
        }
        com.microblink.blinkid.util.Log.v(this, "Camera surface view touch event at raw sensor location: ({}, {})", java.lang.Float.valueOf(fArr[0]), java.lang.Float.valueOf(fArr[1]));
        float size = android.view.View.MeasureSpec.getSize(this.llIIlIlIIl.getMeasuredWidth());
        float size2 = android.view.View.MeasureSpec.getSize(this.llIIlIlIIl.getMeasuredHeight());
        fArr[0] = fArr[0] / size;
        fArr[1] = fArr[1] / size2;
        com.microblink.blinkid.secured.lIIlIIllII.IlIllIlIIl(this.llIIlIlIIl.IllIIIIllI, fArr);
        com.microblink.blinkid.util.Log.v(this, "Camera surface view touch event at normalized location: ({}, {})", java.lang.Float.valueOf(fArr[0]), java.lang.Float.valueOf(fArr[1]));
        com.microblink.blinkid.view.surface.ICameraView.CameraViewEventListener cameraViewEventListener = this.llIIlIlIIl.lIlIIIIlIl;
        if (cameraViewEventListener == null) {
            return false;
        }
        cameraViewEventListener.onCameraTapEvent(fArr[0], fArr[1]);
        return true;
    }
}
