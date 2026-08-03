package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.dv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC1464dv implements android.view.View.OnTouchListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C4V A00;

    public ViewOnTouchListenerC1464dv(com.facebook.ads.redexgen.core.C4V c4v) {
        this.A00 = c4v;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.view.View view2;
        android.view.View view3;
        android.view.View view4;
        android.view.View view5;
        android.view.View view6;
        android.view.View view7;
        com.facebook.ads.redexgen.core.AbstractC1349c3 abstractC1349c3;
        com.facebook.ads.redexgen.core.AbstractC1349c3 abstractC1349c32;
        float x = motionEvent.getX();
        view2 = this.A00.A0H;
        if (x >= view2.getX()) {
            float x2 = motionEvent.getX();
            view3 = this.A00.A0H;
            float x3 = view3.getX();
            view4 = this.A00.A0H;
            if (x2 <= x3 + view4.getWidth()) {
                float y = motionEvent.getY();
                view5 = this.A00.A0H;
                if (y >= view5.getY()) {
                    float y2 = motionEvent.getY();
                    view6 = this.A00.A0H;
                    float y3 = view6.getY();
                    view7 = this.A00.A0H;
                    if (y2 <= y3 + view7.getHeight()) {
                        abstractC1349c3 = this.A00.A02;
                        if (abstractC1349c3 != null) {
                            abstractC1349c32 = this.A00.A02;
                            abstractC1349c32.dispatchTouchEvent(motionEvent);
                            return true;
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
