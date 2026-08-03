package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1316bW {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.1I] */
    public static com.facebook.ads.redexgen.core.C1I A00(final com.facebook.ads.redexgen.core.C1353c7 c1353c7, final com.facebook.ads.redexgen.core.UK uk, final java.lang.String str, final com.facebook.ads.redexgen.core.C6X c6x) {
        final boolean z = true;
        return new com.facebook.ads.redexgen.core.C6M(c1353c7, uk, z, str, c6x) { // from class: com.facebook.ads.redexgen.X.1I
            public com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr A00;
            public com.facebook.ads.redexgen.core.C1474e5 A01;
            public final com.facebook.ads.redexgen.core.VA A02 = this.A0I.A06().A02().A0A();
            public final com.facebook.ads.redexgen.core.UK A03;
            public final com.facebook.ads.redexgen.core.C6X A04;
            public final java.lang.String A05;
            public static java.lang.String[] A06 = {"q", "A73Xi2G3GXsP7eqOYxzIEC2a49UqAHwv", "tzkKnItTrh", "5yGem34VUXIU78ICazF0QaKYuuceWMlm", "d26mhKEOwDnFCjn", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "vFFUszWLQFPwstqQ2PhnuKwIvdRc", "cQLhl1S6XoLnT945hQssVDVRJiee0FVC"};
            public static final int A08 = (int) (com.facebook.ads.redexgen.core.XX.A02 * (-4.0f));
            public static final int A07 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 6.0f);

            {
                this.A03 = uk;
                this.A05 = str;
                this.A04 = c6x;
                this.A03.A1Q(this);
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC0797Jg
            public void setupNativeCtaExtension(com.facebook.ads.redexgen.core.C1474e5 c1474e5) {
                com.facebook.ads.redexgen.core.C0900Ng A2A;
                this.A01 = c1474e5;
                int A0Q = com.facebook.ads.redexgen.core.C1086Up.A0Q(this.A0I.A06());
                com.facebook.ads.redexgen.core.C0894Na A01 = this.A03.A13().A28().A01();
                com.facebook.ads.redexgen.core.C1636gi A062 = this.A0I.A06();
                java.lang.String A0w = this.A03.A13().A0w();
                com.facebook.ads.redexgen.core.VA va = this.A02;
                com.facebook.ads.redexgen.core.InterfaceC1177Yh dummyListener = com.facebook.ads.redexgen.core.C1280aw.getDummyListener();
                com.facebook.ads.redexgen.core.C1581fp A0b = this.A04.A0b();
                com.facebook.ads.redexgen.core.Y2 A1E = this.A03.A1E();
                if (this.A03.A13() == null) {
                    A2A = null;
                } else {
                    A2A = this.A03.A13().A2A();
                }
                this.A00 = new com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr(A062, A0w, A01, va, dummyListener, A0b, A1E, A2A);
                this.A00.setCta(c1474e5.A03().A0J(), this.A05, new java.util.HashMap());
                this.A03.A1Q(this.A00);
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
                if (A0Q == 1) {
                    layoutParams.addRule(12);
                    java.lang.String[] strArr = A06;
                    java.lang.String str2 = strArr[5];
                    java.lang.String str3 = strArr[0];
                    int length = str2.length();
                    int extensionVariant = str3.length();
                    if (length != extensionVariant) {
                        throw new java.lang.RuntimeException();
                    }
                    A06[4] = "cEnNLXyXCc05OsZ";
                    com.facebook.ads.redexgen.core.YB.A0R(this.A00, A07, 5, A01.A0A(false));
                    ((com.facebook.ads.redexgen.core.C6M) this).A06.addView(this.A00, layoutParams);
                    return;
                }
                if (A0Q == 2) {
                    layoutParams.addRule(3, ((com.facebook.ads.redexgen.core.C6M) this).A06.getId());
                    int extensionVariant2 = A08;
                    layoutParams.setMargins(0, extensionVariant2, 0, 0);
                    addView(this.A00, 0, layoutParams);
                    ((com.facebook.ads.redexgen.core.C6M) this).A06.bringToFront();
                }
            }
        };
    }
}
