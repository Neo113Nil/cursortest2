package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.ip, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1760ip implements com.facebook.ads.redexgen.core.NJ {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"prnrxiqBIRUWmtrywfPqKqEQqhVy", "ZIMYOFT0ZsWMsvQaDuWdcBD1JUfFlpFK", "eDL3S9t0lib8FebdadRdAEhF6DEMjh5k", "bs6kAZMpX5XJVmB6S4pTEB090dM9ax0i", "QHqe8jS5x4PwEQqsnwl", "gxNXj6OyEOj3k7PGi9sSLvTTkEfltc4s", "tcOGThQLxe2W2uuyyUr03jLhoPapxorM", "Kh0wErWL647o91YILjhTKlO7bRERsR4e"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C05007a A00;
    public final /* synthetic */ java.lang.Runnable A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 23);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        if (A03[4].length() == 18) {
            throw new java.lang.RuntimeException();
        }
        A03[7] = "PFnJtf9LUj4qa4JPPUOTumvSeGZYJypM";
        A02 = new byte[]{com.google.common.base.Ascii.SO, com.google.common.base.Ascii.FF, 8, 89, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SO, 118, 65, 83, 69, 86, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 65, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 4, 114, 77, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 65, 75, 4, 77, 73, 84, 86, 65, 87, 87, 77, 75, 74, 4, 66, 77, 86, 65, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 65, 125, 74, 88, 78, 93, 75, 74, 75, 121, 70, 75, 74, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 110, 75, 99, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 72, 72, 70, 65, 72, 102, 66, 95, 93, 74, 92, 92, 70, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 65};
    }

    static {
        A01();
    }

    public C1760ip(com.facebook.ads.redexgen.core.C05007a c05007a, java.lang.Runnable runnable) {
        this.A00 = c05007a;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.core.NJ
    public final void AFj(com.facebook.ads.redexgen.core.AbstractC1805jh abstractC1805jh) {
        this.A00.A07.A06();
    }

    @Override // com.facebook.ads.redexgen.core.NJ
    public final void AFk(com.facebook.ads.redexgen.core.AbstractC1805jh abstractC1805jh) {
        this.A00.A07.A07();
    }

    @Override // com.facebook.ads.redexgen.core.NJ
    public final void AFl(com.facebook.ads.redexgen.core.AbstractC1805jh abstractC1805jh) {
        this.A00.A07.A0C();
    }

    @Override // com.facebook.ads.redexgen.core.NJ
    public final void AFm(com.facebook.ads.redexgen.core.AbstractC1805jh abstractC1805jh) {
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A01 = abstractC1805jh;
        this.A00.A0L();
        if (this.A00.A07 != null) {
            this.A00.A07.A0F(abstractC1805jh);
        }
    }

    @Override // com.facebook.ads.redexgen.core.NJ
    public final void AFn(com.facebook.ads.redexgen.core.AbstractC1805jh abstractC1805jh) {
        com.facebook.ads.redexgen.core.AbstractC1119Vy.A05(A00(39, 34, 56), A00(8, 31, 51), A00(0, 8, 47));
        this.A00.A07.A0D();
        this.A00.A0O();
    }

    @Override // com.facebook.ads.redexgen.core.NJ
    public final void AFo(com.facebook.ads.redexgen.core.AbstractC1805jh abstractC1805jh) {
        this.A00.A07.A08();
    }

    @Override // com.facebook.ads.redexgen.core.NJ
    public final void AFp(com.facebook.ads.redexgen.core.AbstractC1805jh abstractC1805jh, com.facebook.ads.AdError adError) {
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A0B.A0F().A5g(adError.getErrorCode(), adError.getErrorMessage());
        if (com.facebook.ads.AdError.AD_PRESENTATION_ERROR.equals(adError) && com.facebook.ads.redexgen.core.C1086Up.A1y(this.A00.A0B)) {
            this.A00.A07.A0G(com.facebook.ads.redexgen.core.C1108Vm.A00(com.facebook.ads.internal.protocol.AdErrorType.AD_PRESENTATION_ERROR));
        } else if (com.facebook.ads.AdError.NO_FILL.equals(adError)) {
            this.A00.A07.A0G(com.facebook.ads.redexgen.core.C1108Vm.A00(com.facebook.ads.internal.protocol.AdErrorType.NO_FILL));
        } else {
            this.A00.A07.A0G(com.facebook.ads.redexgen.core.C1108Vm.A00(com.facebook.ads.internal.protocol.AdErrorType.INTERNAL_ERROR));
        }
        this.A00.A0Q(abstractC1805jh);
        if (A03[7].charAt(7) != 'L') {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A03;
        strArr[1] = "5mDNAkmPsKXxtvZqFgypt4QK4uBiUiuf";
        strArr[2] = "5tmiAUheAxojxdkmR27o6gIBrLCMojmA";
    }

    @Override // com.facebook.ads.redexgen.core.NJ
    public final void onRewardedVideoActivityDestroyed() {
        this.A00.A07.A09();
    }

    @Override // com.facebook.ads.redexgen.core.NJ
    public final void onRewardedVideoClosed() {
        this.A00.A07.A0A();
    }
}
