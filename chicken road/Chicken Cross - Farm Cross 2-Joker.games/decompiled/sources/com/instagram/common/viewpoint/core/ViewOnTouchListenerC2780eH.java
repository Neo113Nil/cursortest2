package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.eH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC2780eH implements View.OnTouchListener {
    public final /* synthetic */ C2781eI A00;

    public ViewOnTouchListenerC2780eH(C2781eI c2781eI) {
        this.A00 = c2781eI;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        VA va;
        AbstractC3095jd abstractC3095jd;
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = System.currentTimeMillis();
            C2781eI.A00(this.A00);
            va = this.A00.A06;
            abstractC3095jd = this.A00.A03;
            va.ABp(abstractC3095jd.A2E(), new C2587b9().A03(this.A00.getViewabilityChecker()).A02(this.A00.getTouchDataRecorder()).A05());
            return false;
        }
        return false;
    }
}
