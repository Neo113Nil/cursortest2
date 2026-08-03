package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ok, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0930Ok implements java.io.Serializable {
    public static final long serialVersionUID = -3209129042070173126L;
    public com.facebook.ads.redexgen.core.C0930Ok A00;
    public final int A01;
    public final java.lang.String A02;
    public final java.lang.String A03;
    public final java.util.List<com.facebook.ads.redexgen.core.C0930Ok> A04;

    public C0930Ok(int i, java.lang.String str, java.lang.String str2) {
        this.A04 = new java.util.ArrayList();
        this.A01 = i;
        this.A03 = str;
        this.A02 = str2;
    }

    public C0930Ok(java.lang.String str) {
        this(0, null, str);
    }

    private void A00(com.facebook.ads.redexgen.core.C0930Ok c0930Ok) {
        this.A00 = c0930Ok;
    }

    public final int A01() {
        return this.A01;
    }

    public final com.facebook.ads.redexgen.core.C0930Ok A02() {
        return this.A00;
    }

    public final java.lang.String A03() {
        return this.A02;
    }

    public final java.lang.String A04() {
        return this.A03;
    }

    public final java.util.List<com.facebook.ads.redexgen.core.C0930Ok> A05() {
        return this.A04;
    }

    public final void A06(com.facebook.ads.redexgen.core.C0930Ok c0930Ok) {
        c0930Ok.A00(this);
        this.A04.add(c0930Ok);
    }
}
