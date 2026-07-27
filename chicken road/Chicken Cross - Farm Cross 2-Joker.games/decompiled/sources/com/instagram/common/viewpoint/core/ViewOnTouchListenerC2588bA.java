package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC2588bA implements View.OnTouchListener {
    public final /* synthetic */ ViewOnClickListenerC2589bB A00;

    public ViewOnTouchListenerC2588bA(ViewOnClickListenerC2589bB viewOnClickListenerC2589bB) {
        this.A00 = viewOnClickListenerC2589bB;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.A00.A00(motionEvent.getX(), motionEvent.getY());
            return false;
        }
        return false;
    }
}
