package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Mt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0888Mt {
    public static byte[] A04;
    public com.facebook.ads.redexgen.core.InterfaceC0886Mr A00;
    public final com.facebook.ads.redexgen.core.C1636gi A01;
    public final com.facebook.ads.redexgen.core.VA A02;
    public final java.lang.String A03;

    static {
        A0D();
    }

    public static java.lang.String A0B(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 122);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0D() {
        A04 = new byte[]{84, 69, 69, 106, 84, 81, 108, 105, 110, 107, 95, 99, 108, 105, 99, 107, 112, 102, 115, 100, 111, 88, 102, 105, 99, 88, 101, 117, 104, 112, 116, 98};
    }

    public abstract com.facebook.ads.redexgen.core.EnumC0885Mq A0G(java.lang.String str);

    public AbstractC0888Mt(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, java.lang.String str) {
        this.A01 = c1636gi;
        this.A02 = va;
        this.A03 = str;
    }

    public static java.lang.String A0A() {
        return A0B(16, 16, 125);
    }

    public static java.lang.String A0C(com.facebook.ads.redexgen.core.AbstractC0888Mt abstractC0888Mt) {
        if (abstractC0888Mt instanceof com.facebook.ads.redexgen.core.AnonymousClass84) {
            return A0B(6, 10, 122);
        }
        return A0B(0, 6, 79);
    }

    public final com.facebook.ads.redexgen.core.InterfaceC0886Mr A0E() {
        return this.A00;
    }

    public final void A0F(com.facebook.ads.redexgen.core.InterfaceC0886Mr interfaceC0886Mr) {
        this.A00 = interfaceC0886Mr;
    }
}
