package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Jg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0797Jg extends com.facebook.ads.redexgen.core.AbstractC1349c3 {
    public static byte[] A00;

    static {
        A0B();
    }

    public static java.lang.String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 22);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0B() {
        A00 = new byte[]{106, 111, 111, 110, Byte.MAX_VALUE, 106, 98, 103, 120};
    }

    public abstract void A1R();

    public abstract void A1S();

    public abstract void A1T();

    public abstract boolean A1U();

    public abstract boolean A1V();

    public AbstractC0797Jg(com.facebook.ads.redexgen.core.C1353c7 c1353c7, boolean z) {
        super(c1353c7, z);
        if (com.facebook.ads.redexgen.core.C1086Up.A17(c1353c7.A06())) {
            if (c1353c7.A0B() != null) {
                c1353c7.A0B().setCTAClickListener(getCtaButton());
            }
            getTitleDescContainer().setCTAClickListener(getCtaButton());
        }
    }

    public final void A1Q() {
        if (com.facebook.ads.redexgen.core.C1086Up.A17(this.A07.A06()) && this.A07.A0B() != null) {
            this.A07.A0B().setCTAClickListener(getCtaButton());
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1349c3
    public com.facebook.ads.redexgen.core.ViewOnClickListenerC0834Kr getCtaButton() {
        return super.getCtaButton();
    }

    public void setAdDetailsClickListener(com.facebook.ads.redexgen.core.AbstractC1299bF abstractC1299bF) {
        if (com.facebook.ads.redexgen.core.C1086Up.A17(this.A07.A06()) && abstractC1299bF != null) {
            abstractC1299bF.setOnClickListener(com.facebook.ads.redexgen.core.AbstractC1340bu.A03(getCtaButton(), A0A(0, 9, 29)));
        }
    }

    public void setupNativeCtaExtension(com.facebook.ads.redexgen.core.C1474e5 c1474e5) {
    }
}
