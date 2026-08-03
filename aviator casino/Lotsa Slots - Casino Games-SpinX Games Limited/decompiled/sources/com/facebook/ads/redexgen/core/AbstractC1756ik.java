package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ik, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1756ik implements com.facebook.ads.redexgen.core.OW {
    public static byte[] A06;
    public final com.facebook.ads.redexgen.core.OE A00;
    public final com.facebook.ads.redexgen.core.OL A01;
    public final com.facebook.ads.redexgen.core.C1636gi A02;
    public final android.os.Handler A03;
    public final java.lang.String A04;
    public final com.facebook.ads.redexgen.core.OQ A05;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 70);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{-104, -85, -92, -102, -94, -101, -75, -101, -82, -86, -88, -105, -87, -75, -95, -101, -81, -25, -20, -14, -3, -29, -16, -16, -19, -16, -3, -31, -19, -30, -29, -3, -23, -29, -9, -6, -5, -7, 6, -24, -21, 6, -16, -21, 6, -14, -20, 0, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.DC4, 33, 7, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.DC4, 17, com.google.common.base.Ascii.DC4, 33, com.google.common.base.Ascii.SI, 7, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.NAK, 3, 9, 7, 33, com.google.common.base.Ascii.CR, 7, com.google.common.base.Ascii.ESC};
    }

    public abstract void A08();

    public abstract void A09();

    public abstract void A0D(boolean z);

    public AbstractC1756ik(com.facebook.ads.redexgen.core.C1636gi c1636gi, java.lang.String str, com.facebook.ads.redexgen.core.OR or) {
        this.A02 = c1636gi;
        this.A04 = str;
        com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(this.A02).getInitApi().onAdLoadInvoked(this.A02);
        this.A00 = new com.facebook.ads.redexgen.core.C1759io(c1636gi, this);
        this.A01 = new com.facebook.ads.redexgen.core.OL(c1636gi, this);
        this.A03 = new android.os.Handler(android.os.Looper.getMainLooper());
        this.A05 = or.A5S(this.A00, this, this.A01);
    }

    public final com.facebook.ads.redexgen.core.OE A03() {
        return this.A00;
    }

    public final java.lang.String A04() {
        return this.A04;
    }

    public final void A05() {
        if (this.A01.A01) {
            this.A02.A0F().AI0();
            A06();
        } else {
            this.A02.A0F().AHs();
            this.A01.A02 = true;
            this.A01.A0E(com.facebook.ads.redexgen.core.AbstractC1089Us.A02.get());
        }
    }

    public final void A06() {
        this.A02.A0F().AI6();
        if (!this.A01.A0F(this.A05.A8P(), this.A05.A5R(this.A04))) {
            A09();
            this.A02.A0F().AHy();
        }
    }

    public final void A07() {
        if (!com.facebook.ads.redexgen.core.C1086Up.A0u(this.A02)) {
            return;
        }
        com.facebook.ads.redexgen.core.Y4.A00(new com.facebook.ads.redexgen.core.C1757il(this));
    }

    public final void A0A(int i) {
        this.A01.A0D(this.A02, i);
    }

    public final void A0B(int i, com.facebook.ads.internal.protocol.AdErrorType adErrorType, java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String A01 = A01(48, 21, 124);
        if (str != null) {
            bundle.putString(A01, str);
        } else {
            bundle.putString(A01, adErrorType.getDefaultErrorMessage());
        }
        bundle.putInt(A01(17, 18, 88), adErrorType.getErrorCode());
        AEs(i, this.A04, bundle);
    }

    public final void A0C(android.os.Message message) {
        this.A05.A9j(message);
    }

    @Override // com.facebook.ads.redexgen.core.OW
    public final void AEs(int i, java.lang.String str, android.os.Bundle bundle) {
        android.os.Message obtain = android.os.Message.obtain((android.os.Handler) null, i);
        obtain.getData().putString(A01(35, 13, 97), str);
        if (bundle != null) {
            obtain.getData().putBundle(A01(0, 17, 16), bundle);
        }
        java.lang.Runnable callbackApiRunnable = new com.facebook.ads.redexgen.core.C1758im(this, obtain);
        this.A03.post(callbackApiRunnable);
    }
}
