package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.3o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C04103o {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public android.graphics.Bitmap A0C;
    public android.text.Layout.Alignment A0D;
    public android.text.Layout.Alignment A0E;
    public java.lang.CharSequence A0F;
    public boolean A0G;

    public C04103o() {
        this.A0F = null;
        this.A0C = null;
        this.A0E = null;
        this.A0D = null;
        this.A01 = -3.4028235E38f;
        this.A07 = Integer.MIN_VALUE;
        this.A06 = Integer.MIN_VALUE;
        this.A02 = -3.4028235E38f;
        this.A08 = Integer.MIN_VALUE;
        this.A09 = Integer.MIN_VALUE;
        this.A05 = -3.4028235E38f;
        this.A04 = -3.4028235E38f;
        this.A00 = -3.4028235E38f;
        this.A0G = false;
        this.A0B = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        this.A0A = Integer.MIN_VALUE;
    }

    public C04103o(com.facebook.ads.redexgen.core.C2146pT c2146pT) {
        this.A0F = c2146pT.A0F;
        this.A0C = c2146pT.A0C;
        this.A0E = c2146pT.A0E;
        this.A0D = c2146pT.A0D;
        this.A01 = c2146pT.A01;
        this.A07 = c2146pT.A07;
        this.A06 = c2146pT.A06;
        this.A02 = c2146pT.A02;
        this.A08 = c2146pT.A08;
        this.A09 = c2146pT.A09;
        this.A05 = c2146pT.A05;
        this.A04 = c2146pT.A04;
        this.A00 = c2146pT.A00;
        this.A0G = c2146pT.A0G;
        this.A0B = c2146pT.A0B;
        this.A0A = c2146pT.A0A;
        this.A03 = c2146pT.A03;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final int A00() {
        return this.A06;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final int A01() {
        return this.A08;
    }

    public final com.facebook.ads.redexgen.core.C04103o A02() {
        this.A0G = false;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C04103o A03(float f) {
        this.A00 = f;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C04103o A04(float f) {
        this.A02 = f;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C04103o A05(float f) {
        this.A03 = f;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C04103o A06(float f) {
        this.A04 = f;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C04103o A07(float f, int i) {
        this.A01 = f;
        this.A07 = i;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C04103o A08(float f, int i) {
        this.A05 = f;
        this.A09 = i;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C04103o A09(int i) {
        this.A06 = i;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C04103o A0A(int i) {
        this.A08 = i;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C04103o A0B(int i) {
        this.A0A = i;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C04103o A0C(int i) {
        this.A0B = i;
        this.A0G = true;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C04103o A0D(android.graphics.Bitmap bitmap) {
        this.A0C = bitmap;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C04103o A0E(android.text.Layout.Alignment alignment) {
        this.A0D = alignment;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C04103o A0F(android.text.Layout.Alignment alignment) {
        this.A0E = alignment;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C04103o A0G(java.lang.CharSequence charSequence) {
        this.A0F = charSequence;
        return this;
    }

    public final com.facebook.ads.redexgen.core.C2146pT A0H() {
        return new com.facebook.ads.redexgen.core.C2146pT(this.A0F, this.A0E, this.A0D, this.A0C, this.A01, this.A07, this.A06, this.A02, this.A08, this.A09, this.A05, this.A04, this.A00, this.A0G, this.A0B, this.A0A, this.A03);
    }

    @org.checkerframework.dataflow.qual.Pure
    public final java.lang.CharSequence A0I() {
        return this.A0F;
    }
}
