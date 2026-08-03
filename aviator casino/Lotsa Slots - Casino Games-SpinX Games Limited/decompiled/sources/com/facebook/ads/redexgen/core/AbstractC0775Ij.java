package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ij, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0775Ij extends android.widget.RelativeLayout implements com.facebook.ads.redexgen.core.XQ {
    public static byte[] A0E;
    public static java.lang.String[] A0F = {"uUMDphsbcltlMAasrXzhzXIIsD27sBrh", "kD4ASPr1mkkPPQg7686pKphnCznMXNdE", "3u4w9tHTXiQc09zCQQwrpogVyGpuea0B", "uLxjLzdSNqmjg5WlrsUTBNxe2IHJHDsH", "sowIyJkgs7pChNHWV216bYY5IvqkL5", "woZqrf3JBfr8DagdWcXdOyEt75sBOiDm", "mZPGIv6MosabarlDevuwzM4J02qRjqBR", "rZe00TaCIEKWr55DYJNI366SEGcMY1oV"};
    public static final int A0G;
    public java.lang.String A00;
    public boolean A01;
    public final int A02;
    public final com.facebook.ads.redexgen.core.AbstractC1580fo A03;
    public final boolean A04;
    public final boolean A05;
    public final com.facebook.ads.redexgen.core.AbstractC1801jd A06;
    public final com.facebook.ads.redexgen.core.C1636gi A07;
    public final com.facebook.ads.redexgen.core.VA A08;
    public final com.facebook.ads.redexgen.core.XS A09;
    public final com.facebook.ads.redexgen.core.Y2 A0A;
    public final com.facebook.ads.redexgen.core.InterfaceC1177Yh A0B;
    public final com.facebook.ads.redexgen.core.ZU A0C;
    public final com.facebook.ads.redexgen.core.C1581fp A0D;

    public static java.lang.String A19(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 77);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A1A() {
        A0E = new byte[]{95, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.EM, 95, 5, 32, 100};
        if (A0F[4].length() == 22) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A0F;
        strArr[2] = "lGg0879wdsNhw7V1Qtd20OQ8gEXobd5O";
        strArr[0] = "a2lydBkKvgM6UKG9QoQR6B5cBx9Kev1F";
    }

    public abstract com.facebook.ads.redexgen.core.EnumC0885Mq A1D(java.lang.String str);

    public abstract void A1G();

    public abstract void A1H();

    public abstract void A1J(boolean z);

    public abstract void A1K(boolean z);

    public abstract boolean A1L();

    public abstract boolean A1M();

    public abstract boolean A1N();

    public abstract com.facebook.ads.redexgen.core.C1454dk getFullScreenAdStyle();

    static {
        A1A();
        A0G = (int) (com.facebook.ads.redexgen.core.XX.A02 * 80.0f);
    }

    public AbstractC0775Ij(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.ZU zu, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd, int i, boolean z, boolean z2, com.facebook.ads.redexgen.core.InterfaceC1177Yh interfaceC1177Yh, int i2) {
        super(c1636gi);
        this.A0A = new com.facebook.ads.redexgen.core.Y2();
        this.A01 = false;
        this.A00 = A19(0, 0, 48);
        this.A03 = new com.facebook.ads.redexgen.core.C0779In(this);
        this.A02 = i;
        this.A07 = c1636gi;
        this.A05 = z;
        this.A04 = z2;
        this.A0B = interfaceC1177Yh;
        this.A0C = zu;
        this.A06 = abstractC1801jd;
        this.A08 = va;
        this.A0D = new com.facebook.ads.redexgen.core.C1581fp(this, 1, new java.lang.ref.WeakReference(this.A03), c1636gi);
        this.A0D.A0W(abstractC1801jd.A0m());
        this.A0D.A0X(abstractC1801jd.A0n());
        this.A09 = com.facebook.ads.redexgen.core.XS.A00(this.A07, this.A06, this);
        if (this.A06.A1c()) {
            this.A00 = A18(this.A02, i2);
        }
    }

    public static java.lang.String A18(int i, int i2) {
        return A19(4, 3, 9) + (i + 1) + A19(0, 4, 50) + i2;
    }

    public void A1E() {
        this.A09.A03();
    }

    public final void A1F() {
        if (!this.A01) {
            this.A0D.A0U();
            this.A01 = true;
        }
    }

    public void A1I(boolean z) {
    }

    public com.facebook.ads.redexgen.core.AbstractC1801jd getAdDataBundle() {
        return this.A06;
    }

    public com.facebook.ads.redexgen.core.C1581fp getAdViewabilityChecker() {
        return this.A0D;
    }

    public com.facebook.ads.redexgen.core.Y2 getTouchDataRecorder() {
        return this.A0A;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
