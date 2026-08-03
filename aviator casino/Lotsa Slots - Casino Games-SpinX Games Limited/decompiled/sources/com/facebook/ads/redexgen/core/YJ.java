package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class YJ implements android.view.View.OnTouchListener {
    public final android.view.GestureDetector A00;

    public YJ(int i, int i2, android.content.Context context, com.facebook.ads.redexgen.core.YI yi) {
        this.A00 = new android.view.GestureDetector(context, new com.facebook.ads.redexgen.core.YH(this, yi, i, i2));
    }

    public final void A00(android.view.View view) {
        if (view != null) {
            view.setOnTouchListener(this);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        return this.A00.onTouchEvent(motionEvent);
    }
}
