package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class VU implements android.view.View.OnTouchListener {
    public static java.lang.String[] A01 = {"BENQAquhgvj7TT9", "G4ABWHEO8pFoECzre8aPRkd5RqzaS810", "PI8RZp2k0CYdM", "EmvTCi8E1ni5QktN6f", "uKZwthLDSYADW2ME8E7na2CL49A5zEt8", "f3ahGFeoLQ7BDTppBYhbDWzCsZGogVaH", "wyETLpONaJd07JaZyOo", "wX7oH8VfboeBvBElZn"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1120Vz A00;

    public VU(com.facebook.ads.redexgen.core.C1120Vz c1120Vz) {
        this.A00 = c1120Vz;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.facebook.ads.redexgen.core.C04916r c04916r;
        com.facebook.ads.redexgen.core.C04916r c04916r2;
        c04916r = this.A00.A07;
        if (c04916r != null) {
            int action = motionEvent.getAction();
            java.lang.String[] strArr = A01;
            if (strArr[0].length() == strArr[2].length()) {
                throw new java.lang.RuntimeException();
            }
            A01[6] = "VIP8zqVOsYs7o10MZlA";
            if (action == 1) {
                c04916r2 = this.A00.A07;
                c04916r2.A0s();
            }
        }
        return true;
    }
}
