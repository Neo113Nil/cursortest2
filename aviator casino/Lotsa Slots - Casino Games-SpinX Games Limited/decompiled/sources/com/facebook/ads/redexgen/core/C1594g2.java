package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.g2, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1594g2 {
    public static byte[] A07;
    public static java.lang.String[] A08 = {"H9a6GPEeuBppqgml", "UMFfHf9K0rtxTnfS4GQ", "HJf7oQJhMr6BjfdBAkNXb1VX0FlaYu0s", "mblZ", "lDa8BWO3GNKgBVoNV1FydEibnHhzaqpi", "BpHqCYEOVY5", "fQPNbuq5zM2Vt99anBRO7vAhC8TCHPEC", "oGui3UnSaV6fb7qd5azTuEEp3mm97meQ"};
    public com.facebook.ads.redexgen.core.InterfaceC1585ft A05;
    public int A04 = 60000;
    public int A03 = 100;
    public int A00 = 10000;
    public int A02 = 8000;
    public int A01 = 3;
    public java.util.Map<java.lang.String, java.lang.String> A06 = new java.util.HashMap();

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 100);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{4, 40, 49, 32, 36, 60, 36, 105, 59, 44, kotlin.io.encoding.Base64.padSymbol, 59, 32, 44, 58, 105, 36, 60, 58, kotlin.io.encoding.Base64.padSymbol, 105, 43, 44, 105, 43, 44, kotlin.io.encoding.Base64.padSymbol, 62, 44, 44, 39, 105, 120, 105, 40, 39, 45, 105, 120, 113};
        if (A08[3].length() != 4) {
            throw new java.lang.RuntimeException();
        }
        A08[4] = "ylxMzgRnic8ELdWNUfQitMVfYj0C1DI2";
    }

    static {
        A01();
    }

    public final com.facebook.ads.redexgen.core.C1594g2 A02(int i) {
        this.A00 = i;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C1594g2 A03(int i) {
        if (i >= 1 && i <= 18) {
            this.A01 = i;
            return this;
        }
        throw new java.lang.IllegalArgumentException(A00(0, 40, 45));
    }

    public final com.facebook.ads.redexgen.core.C1594g2 A04(int i) {
        this.A02 = i;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C1594g2 A05(int i) {
        this.A03 = i;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C1594g2 A06(int i) {
        this.A04 = i;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C1594g2 A07(com.facebook.ads.redexgen.core.InterfaceC1585ft interfaceC1585ft) {
        this.A05 = interfaceC1585ft;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C1594g2 A08(java.util.Map<java.lang.String, java.lang.String> requestHeaders) {
        this.A06 = requestHeaders;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C1595g3 A09() {
        return new com.facebook.ads.redexgen.core.C1595g3(this.A04, this.A00, this.A02, this.A03, this.A01, this.A06, this.A05);
    }
}
