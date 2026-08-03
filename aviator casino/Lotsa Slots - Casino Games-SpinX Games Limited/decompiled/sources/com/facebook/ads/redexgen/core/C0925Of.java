package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Of, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0925Of implements java.io.Serializable {
    public com.facebook.ads.redexgen.core.C0924Oe A00;
    public com.facebook.ads.redexgen.core.C0924Oe A01;

    public C0925Of() {
        this(0.5d, 0.5d);
    }

    public C0925Of(double d) {
        this(d, 0.5d);
    }

    public C0925Of(double d, double d2) {
        this.A00 = new com.facebook.ads.redexgen.core.C0924Oe(d);
        this.A01 = new com.facebook.ads.redexgen.core.C0924Oe(d2);
        A02();
    }

    public final com.facebook.ads.redexgen.core.C0924Oe A00() {
        return this.A00;
    }

    public final com.facebook.ads.redexgen.core.C0924Oe A01() {
        return this.A01;
    }

    public final void A02() {
        this.A00.A07();
        this.A01.A07();
    }

    public final void A03() {
        this.A00.A08();
        this.A01.A08();
    }

    public final void A04(double d, double d2) {
        this.A00.A09(d, d2);
    }

    public final void A05(double d, double d2) {
        this.A01.A09(d, d2);
    }
}
