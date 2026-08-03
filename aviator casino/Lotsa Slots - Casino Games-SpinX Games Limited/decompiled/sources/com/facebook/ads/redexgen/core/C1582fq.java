package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1582fq {
    public float A00;
    public com.facebook.ads.redexgen.core.EnumC0860Lr A01;
    public java.util.Map<java.lang.String, java.lang.String> A02;

    public C1582fq(com.facebook.ads.redexgen.core.EnumC0860Lr enumC0860Lr) {
        this(enumC0860Lr, 0.0f);
    }

    public C1582fq(com.facebook.ads.redexgen.core.EnumC0860Lr enumC0860Lr, float f) {
        this(enumC0860Lr, f, null);
    }

    public C1582fq(@javax.annotation.Nullable com.facebook.ads.redexgen.core.EnumC0860Lr enumC0860Lr, float f, java.util.Map<java.lang.String, java.lang.String> windowParams) {
        this.A01 = enumC0860Lr;
        this.A00 = f;
        if (windowParams != null) {
            this.A02 = windowParams;
        } else {
            this.A02 = new java.util.HashMap();
        }
    }

    public final float A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01.A03();
    }

    public final com.facebook.ads.redexgen.core.EnumC0860Lr A02() {
        return this.A01;
    }

    public final java.util.Map<java.lang.String, java.lang.String> A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A01 == com.facebook.ads.redexgen.core.EnumC0860Lr.A0I;
    }
}
