package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ui, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1079Ui {
    public final int A00;
    public final com.facebook.ads.redexgen.core.C1076Uf A01;

    public C1079Ui(int i, com.facebook.ads.redexgen.core.C1076Uf c1076Uf) {
        this.A00 = i;
        this.A01 = c1076Uf;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() throws java.io.IOException {
        return this.A01.A05();
    }

    public final com.facebook.ads.redexgen.core.UW A02(int i, byte[] bArr, int i2, int[] iArr, int i3) throws java.io.IOException {
        return this.A01.A06(i, bArr, i2, iArr, i3);
    }

    public final void A03() throws java.io.IOException {
        this.A01.A07();
    }

    public final void A04() throws java.io.IOException {
        this.A01.A08();
    }

    public final boolean A05(byte[] bArr) throws java.io.IOException {
        return this.A01.A09(bArr);
    }
}
