package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.cK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC1366cK implements android.view.View.OnTouchListener {
    public static java.lang.String[] A01 = {"Ag1edxGPmMygd2ZYlIUVji8noIaHMiLQ", "WBm6rd5teeEdNPvhq6Xy4yUZakZyqmkG", "ECfpblw4grbEX8THFPRM2kFRttXYDoHg", "puAZOL7My1RDIFuoQdQlIGU8uD74vctF", "rOVXccWrouvhHaM6oOMABT92DHzQ0mnK", "DC0vFQcYgsBFza3ppzX1spbq624HEpuf", "poJar2xzbFJI41pUq505BIfUZ51x22BX", "IrxdQF8UtoekkpFzNw9qcg8fTKi13Wor"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.KE A00;

    public ViewOnTouchListenerC1366cK(com.facebook.ads.redexgen.core.KE ke) {
        this.A00 = ke;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getActionMasked();
        switch (action) {
            case 0:
                this.A00.A00 = motionEvent.getY();
                return true;
            case 1:
                float browserFinalY = motionEvent.getY();
                f = this.A00.A00;
                if (f >= browserFinalY) {
                    return true;
                }
                com.facebook.ads.redexgen.core.KE ke = this.A00;
                java.lang.String[] strArr = A01;
                java.lang.String str = strArr[6];
                java.lang.String str2 = strArr[2];
                int charAt = str.charAt(3);
                int action2 = str2.charAt(3);
                if (charAt != action2) {
                    A01[3] = "IGAgl0ADkCINtDuAhI065JcG0AD0YiJn";
                    ke.A0i(false);
                    return true;
                }
                throw new java.lang.RuntimeException();
            default:
                return true;
        }
    }
}
