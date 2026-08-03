package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.gm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1640gm implements com.facebook.ads.redexgen.core.InterfaceC0855Lm {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"DkadTd3hzRbbbOHMxE7l2HcIgF77c2Wg", "0ZuZJmAU8cZIcQf3szyGmXM5AilOTJtQ", "s7OtZpyonCiYFMYFU1WCjmQvHXym6FPj", "3vySfQzjuhiXchKud6RTPthf0ulaYdWV", "CDvhYqwZm7dYJUP65EPDHmFcAmisUun7", "F", "FueLju8lXT0mR7zmJE5", "4fFvsSsvSh6WJapTHyxRGbQ9SIVR6447"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1632ge A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 23);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-89, -85, -97, -91, -93};
        java.lang.String[] strArr = A02;
        if (strArr[4].charAt(11) == strArr[0].charAt(11)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A02;
        strArr2[4] = "8YVOAkqjlCZIfPO923uAjm7vB9HJVDjx";
        strArr2[0] = "zjuPMStvlm1D7VGZIKzQB2odE0473uv0";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C1640gm(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        this.A00 = c1632ge;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0855Lm
    public final void AB4(java.lang.Throwable th) {
        this.A00.A08().ABC(A00(0, 5, 39), com.facebook.ads.redexgen.core.AbstractC1048Td.A1e, new com.facebook.ads.redexgen.core.C1049Te(th));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0855Lm
    public final void ABI(java.lang.Throwable th) {
        this.A00.A08().ABC(A00(0, 5, 39), com.facebook.ads.redexgen.core.AbstractC1048Td.A1g, new com.facebook.ads.redexgen.core.C1049Te(th));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0855Lm
    public final void AHU(java.lang.String str, int i, java.lang.String str2, java.lang.Long l, java.lang.Long l2, com.facebook.ads.redexgen.core.LX lx) {
        com.facebook.ads.redexgen.core.T0.A05(this.A00, lx.A06, lx.A08, lx.A09, lx.A07, lx.A03, i, str2, l, l2, null);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0855Lm
    public final void AHV(java.lang.String str, boolean z, com.facebook.ads.redexgen.core.LX lx) {
        com.facebook.ads.redexgen.core.T0.A04(this.A00, new com.facebook.ads.redexgen.core.C1044Sz(lx.A06, lx.A08, lx.A07, lx.A03, str), z);
    }
}
