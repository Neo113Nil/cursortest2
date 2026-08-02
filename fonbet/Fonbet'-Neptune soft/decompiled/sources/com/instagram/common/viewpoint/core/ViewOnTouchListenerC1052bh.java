package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC1052bh implements View.OnTouchListener {
    public final /* synthetic */ C5K A00;

    public ViewOnTouchListenerC1052bh(C5K c5k) {
        this.A00 = c5k;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1056bl c1056bl;
        c1056bl = this.A00.A0E;
        c1056bl.dispatchTouchEvent(MotionEvent.obtain(motionEvent));
        return false;
    }
}
