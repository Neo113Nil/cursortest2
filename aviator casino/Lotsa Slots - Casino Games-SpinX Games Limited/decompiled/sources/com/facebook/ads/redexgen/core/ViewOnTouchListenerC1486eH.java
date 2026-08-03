package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.eH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC1486eH implements android.view.View.OnTouchListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1487eI A00;

    public ViewOnTouchListenerC1486eH(com.facebook.ads.redexgen.core.C1487eI c1487eI) {
        this.A00 = c1487eI;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.facebook.ads.redexgen.core.VA va;
        com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd;
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = java.lang.System.currentTimeMillis();
            com.facebook.ads.redexgen.core.C1487eI.A00(this.A00);
            va = this.A00.A06;
            abstractC1801jd = this.A00.A03;
            va.ABp(abstractC1801jd.A2E(), new com.facebook.ads.redexgen.core.C1293b9().A03(this.A00.getViewabilityChecker()).A02(this.A00.getTouchDataRecorder()).A05());
            return false;
        }
        return false;
    }
}
