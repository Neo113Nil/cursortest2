package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class YH extends android.view.GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.YI A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.YJ A03;

    public YH(com.facebook.ads.redexgen.core.YJ yj, com.facebook.ads.redexgen.core.YI yi, int i, int i2) {
        this.A03 = yj;
        this.A02 = yi;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent == null || motionEvent2 == null) {
            return false;
        }
        float y = motionEvent2.getY() - motionEvent.getY();
        float diffX = motionEvent2.getX() - motionEvent.getX();
        float diffY = java.lang.Math.abs(y);
        if (diffY > java.lang.Math.abs(diffX) && y > this.A00) {
            float diffY2 = java.lang.Math.abs(f2);
            if (diffY2 > this.A01) {
                this.A02.AG8();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        this.A02.AFx();
        return true;
    }
}
