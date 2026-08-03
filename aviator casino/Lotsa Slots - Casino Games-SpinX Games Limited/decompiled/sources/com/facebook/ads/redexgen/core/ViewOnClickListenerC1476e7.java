package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.e7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1476e7 implements android.view.View.OnClickListener {
    public static java.lang.String[] A01 = {"hS5f9KbstsMPLbUbPSxFVdCfAROmcRtV", "DUM08yoPCPer4HETov37xY8lXqOkWet1", "HD0hLshA4", "cNo3fMkBKvz7jHUo", "0KN3KUldF", "ICLtCAijF", "iMQeuY1uIySJVoFID8xkudblEyJz6Aif", "P1hZJiyY"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1477e8 A00;

    public ViewOnClickListenerC1476e7(com.facebook.ads.redexgen.core.C1477e8 c1477e8) {
        this.A00 = c1477e8;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.facebook.ads.redexgen.core.AnonymousClass34 anonymousClass34;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            anonymousClass34 = this.A00.A05;
            anonymousClass34.performClick();
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
            if (A01[6].charAt(1) == 'N') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A01;
            strArr[0] = "I2wlNoUiFEETsNdyZ3cedgIbWPjbODtt";
            strArr[1] = "f6nspZJA1kETXV8rRnTaX6zeidOCX4th";
        }
    }
}
