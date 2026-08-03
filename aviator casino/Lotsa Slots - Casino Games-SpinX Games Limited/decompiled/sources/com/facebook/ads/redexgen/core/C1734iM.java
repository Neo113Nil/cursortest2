package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.iM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1734iM implements com.facebook.ads.redexgen.core.OQ {
    public static byte[] A06;
    public static java.lang.String[] A07 = {"hwQkg6wydYZbPmHd9ra1rendlmZDH9o", "EZChF1CYxmcTUt5XULmCX0u1P", "cTSi58RkvxQZRZutX5Kpp639urCcNivT", "ILotitRaBN9o4fzRERLTj8sSXBTWlTTb", "JZvxvLc", "wZ48NZZ1KfL4Szkg73ZSFlGgbHtYLjcz", "R8pWvTFrbs0CFqCxyNRNjvJ5bjwX3", "qzEf3MAjBvJJtqQXUiJPrqpPaexFktRV"};
    public boolean A00;
    public final com.facebook.ads.redexgen.core.AbstractC1756ik A01;
    public final com.facebook.ads.redexgen.core.OE A02;
    public final com.facebook.ads.redexgen.core.OL A03;
    public final com.facebook.ads.redexgen.core.C1731iI A04;
    public final com.facebook.ads.redexgen.core.C1636gi A05;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 66);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{87, 114, 54, 121, 116, 124, 115, 117, 98, 54, Byte.MAX_VALUE, 101, 54, 120, 99, 122, 122, 3, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.SI, 5, com.google.common.base.Ascii.CR, 4, com.google.common.base.Ascii.RS, 4, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.NAK, 19, 0, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.RS, 10, 4, com.google.common.base.Ascii.CAN, 65, 69, 70, 114, 99, 110, 98, 105, 100, 98, 73, 98, 115, 112, 104, 117, 108, 94, 89, 67, 72, 82, 69, 69, 88, 69, 72, 84, 88, 83, 82, 72, 92, 82, 78, 96, 103, 125, 118, 123, Byte.MAX_VALUE, 118, Byte.MAX_VALUE, 96, 109, 108, 102, 118, 109, 124, 123, 104, 125, 96, 102, 103, 118, 98, 108, 112, 67, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 65, 72, 80, 70, 65, 89, 78, 67, 70, 75, 78, 91, 70, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 65, 80, 91, 70, 66, 74, 80, 68, 74, 86, 34, 10, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.SO, 8, 10, 85, 79, Byte.MAX_VALUE, 91, 65, 65, 91, 92, 85, com.google.common.base.Ascii.DC2, 80, 71, 92, 86, 94, 87, com.google.common.base.Ascii.DC2, 84, 93, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, com.google.common.base.Ascii.DC2, 95, 87, 65, 65, 83, 85, 87, 9, 45, 55, 55, 45, 42, 35, 100, 38, 49, 42, 32, 40, 33, 100, 34, 43, 54, 100, 41, 33, 55, 55, 37, 35, 33, 106, 54, 49, 55, 58, 32, 55, 55, 42, 55, 58, 40, 32, 54, 54, 36, 34, 32, 58, 46, 32, 60, 5, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.CR};
    }

    static {
        A01();
    }

    public C1734iM(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.C1731iI c1731iI, com.facebook.ads.redexgen.core.OE oe, com.facebook.ads.redexgen.core.AbstractC1756ik abstractC1756ik, com.facebook.ads.redexgen.core.OL ol) {
        this.A05 = c1636gi;
        this.A04 = c1731iI;
        this.A02 = oe;
        this.A01 = abstractC1756ik;
        this.A03 = ol;
    }

    @Override // com.facebook.ads.redexgen.core.OQ
    public final android.os.Bundle A5R(java.lang.String str) {
        return com.facebook.ads.redexgen.core.OX.A03(str, this.A04);
    }

    @Override // com.facebook.ads.redexgen.core.OQ
    public final void A5v() {
        this.A03.A0F(2002, null);
        this.A03.A0C();
        this.A04.A02(null);
    }

    @Override // com.facebook.ads.redexgen.core.OQ
    public final int A8P() {
        return 2000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x014a, code lost:
    
        if (r4 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x014c, code lost:
    
        r9.A04.A04.onAdLoaded(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0153, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x015e, code lost:
    
        r9.A00 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x015b, code lost:
    
        if (r4 == false) goto L48;
     */
    @Override // com.facebook.ads.redexgen.core.OQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A9j(android.os.Message message) {
        com.facebook.ads.Ad A6k = this.A04.A6k();
        java.lang.String A00 = A00(203, 3, 38);
        if (A6k == null) {
            this.A05.A08().ABC(A00, com.facebook.ads.redexgen.core.AbstractC1048Td.A0K, new com.facebook.ads.redexgen.core.C1049Te(A00(0, 17, 84)));
            return;
        }
        int i = message.what;
        java.lang.String A002 = A00(120, 9, 45);
        java.lang.String A003 = A00(17, 17, 3);
        switch (i) {
            case 10:
            case 2103:
                android.os.Bundle bundle = message.getData().getBundle(A003);
                if (bundle != null) {
                    int i2 = bundle.getInt(A00(51, 18, 85));
                    java.lang.String string = bundle.getString(A00(182, 21, 39));
                    com.facebook.ads.AdError adError = new com.facebook.ads.AdError(i2, string);
                    this.A02.AJR(adError);
                    if (this.A04.A04 != null) {
                        this.A04.A04.onError(A6k, adError);
                    } else {
                        android.util.Log.e(A00(34, 17, 69), string);
                    }
                } else {
                    this.A02.AJM(com.facebook.ads.redexgen.core.OD.A04);
                    java.lang.String errorMessage = A002 + message;
                    this.A05.A08().ABC(A00, com.facebook.ads.redexgen.core.AbstractC1048Td.A0V, new com.facebook.ads.redexgen.core.C1049Te(A00(155, 27, 6), errorMessage));
                }
                this.A04.A02(null);
                return;
            case 2100:
                this.A02.AJW();
                android.os.Bundle bundle2 = message.getData().getBundle(A003);
                if (bundle2 != null) {
                    this.A04.A01 = bundle2.getLong(A00(94, 26, 77));
                    this.A04.A00 = bundle2.getInt(A00(69, 25, 107));
                } else {
                    this.A05.A08().ABC(A00, com.facebook.ads.redexgen.core.AbstractC1048Td.A0V, new com.facebook.ads.redexgen.core.C1049Te(A00(129, 26, 112), A002 + message));
                }
                com.facebook.ads.redexgen.core.C1731iI c1731iI = this.A04;
                if (A07[0].length() == 31) {
                    A07[4] = "nZDiJI4iz";
                    c1731iI.A02(null);
                    break;
                } else {
                    throw new java.lang.RuntimeException();
                }
            case 2106:
                this.A04.A02(null);
                break;
            case com.ironsource.C3226pe.h /* 2110 */:
                this.A02.AJm();
                break;
        }
        if (this.A04.A04 == null) {
            return;
        }
        switch (message.what) {
            case 2100:
                boolean z = this.A00;
                if (A07[7].charAt(6) == 'M') {
                    A07[3] = "qK0IooEpc5XoMFwfzvHEQuTBU9uHuwow";
                    break;
                } else {
                    A07[4] = "TwWthT4PMcqNyudS0vukG";
                    break;
                }
            case 2104:
                this.A04.A04.onAdClicked(A6k);
                return;
            case 2105:
                this.A04.A04.onLoggingImpression(A6k);
                return;
            case 2106:
                if (this.A04.A04 instanceof com.facebook.ads.RewardedVideoAdExtendedListener) {
                    ((com.facebook.ads.RewardedVideoAdExtendedListener) this.A04.A04).onRewardedVideoActivityDestroyed();
                    return;
                }
                return;
            case com.ironsource.C3226pe.h /* 2110 */:
                this.A04.A04.onRewardedVideoClosed();
                return;
            case 3000:
                this.A04.A04.onRewardedVideoCompleted();
                return;
            case 3001:
                if (this.A04.A04 instanceof com.facebook.ads.S2SRewardedVideoAdListener) {
                    ((com.facebook.ads.S2SRewardedVideoAdListener) this.A04.A04).onRewardServerSuccess();
                    return;
                }
                return;
            case 3002:
                if (this.A04.A04 instanceof com.facebook.ads.S2SRewardedVideoAdListener) {
                    ((com.facebook.ads.S2SRewardedVideoAdListener) this.A04.A04).onRewardServerFailed();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.core.OQ
    public final void AJn(boolean z) {
        this.A00 = z;
    }
}
