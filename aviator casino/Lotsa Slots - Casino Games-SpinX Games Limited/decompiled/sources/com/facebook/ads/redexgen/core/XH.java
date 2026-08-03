package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class XH implements java.lang.Runnable {
    public static java.lang.String[] A04 = {"nCRFoG2V5rxtp9CJ0zj2vqX2pOjohwfk", "4wjnoNx3VOTWdL7VvzY4PdOFwDa8aAyk", "NZwRvgeKfVOQj3OAbWBZydUCa0", "QhytIBUnuaSIq9HsTJzjLcd0Gyd", "BSNgfeEt9bBv41mFKDcPuiwW51mPbBL", "ThuVKQMdtpTlOVe04IgNONUKoYEgRLHM", "EXwZjrYuwLfsbcbpnacjwuDYCB43acny", "AVskEroBo8UlfYPInQ7Yx5KSddGfFQyi"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1632ge A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.InterfaceC1151Xh A01;
    public final /* synthetic */ java.lang.String A02;
    public final /* synthetic */ int[] A03;

    public XH(int[] iArr, java.lang.String str, com.facebook.ads.redexgen.core.C1632ge c1632ge, com.facebook.ads.redexgen.core.InterfaceC1151Xh interfaceC1151Xh) {
        this.A03 = iArr;
        this.A02 = str;
        this.A00 = c1632ge;
        this.A01 = interfaceC1151Xh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean A08;
        android.os.Handler handler;
        android.os.Handler handler2;
        java.util.Set set;
        android.os.Handler handler3;
        java.util.Set set2;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            int[] iArr = this.A03;
            iArr[0] = iArr[0] + 1000;
            int i = this.A03[0];
            if (A04[5].charAt(0) == 'R') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A04;
            strArr[6] = "K9ogtrTQz9r2EYsYEG2F5l0cYywtmYZ4";
            strArr[7] = "6mL3lrEUp2ULAISFIzSh85ZjlbRVvlWv";
            if (i > 600000) {
                handler3 = com.facebook.ads.redexgen.core.XI.A02;
                handler3.removeCallbacks(this);
                set2 = com.facebook.ads.redexgen.core.XI.A03;
                set2.remove(this.A02);
                return;
            }
            A08 = com.facebook.ads.redexgen.core.XI.A08(this.A00.getPackageManager(), this.A02);
            if (A08) {
                handler2 = com.facebook.ads.redexgen.core.XI.A02;
                handler2.removeCallbacks(this);
                set = com.facebook.ads.redexgen.core.XI.A03;
                set.remove(this.A02);
                this.A01.AF6(this.A02);
                return;
            }
            handler = com.facebook.ads.redexgen.core.XI.A02;
            handler.postDelayed(this, 1000L);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
            if (A04[2].length() != 26) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A04;
            strArr2[4] = "FQThdvyXjGVQZyAeyGp3f4l1pRfTgr0";
            strArr2[3] = "sqm3iAA5OiJF7R8ZxJPsoNc3WTf";
        }
    }
}
