package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.4L, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C4L extends com.facebook.ads.redexgen.core.EF {
    public static java.lang.String[] A0F = {"r3hDWnB1R9y4pEiKAURNp99h2b", "kj3t6dP2tWSOfb61zMSBvgjhGLqlygll", "", "sX8uIgx32JWe8q5WuLHBMtkPG7d", "ZlH8xHdCAMZsgB23qoj", "6lejLSjHGD", "XsRzuVWfX96s5Dei3zwO9zjz9s6FXTfu", "pCK0u"};
    public int A00;
    public com.facebook.ads.redexgen.core.C1510eg A01;
    public boolean A02;
    public final com.facebook.ads.redexgen.core.UN<com.facebook.ads.redexgen.core.C4K> A03;
    public final com.facebook.ads.redexgen.core.UN<com.facebook.ads.redexgen.core.C4B> A04;
    public final com.facebook.ads.redexgen.core.UN<com.facebook.ads.redexgen.core.E3> A05;
    public final com.facebook.ads.redexgen.core.UN<com.facebook.ads.redexgen.core.C4A> A06;
    public final com.facebook.ads.redexgen.core.UN<com.facebook.ads.redexgen.core.C0661Dy> A07;
    public final com.facebook.ads.redexgen.core.UN<com.facebook.ads.redexgen.core.C0659Dw> A08;
    public final com.facebook.ads.redexgen.core.UN<com.facebook.ads.redexgen.core.C0658Dv> A09;
    public final com.facebook.ads.redexgen.core.UN<com.facebook.ads.redexgen.core.C0653Dq> A0A;
    public final com.facebook.ads.redexgen.core.UN<com.facebook.ads.redexgen.core.C0652Dp> A0B;
    public final com.facebook.ads.redexgen.core.C0673Ek A0C;
    public final com.facebook.ads.redexgen.core.E0 A0D;
    public final com.facebook.ads.redexgen.core.AbstractC0654Dr A0E;

    public C4L(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.C0673Ek c0673Ek, java.lang.String str) {
        this(c1636gi, va, c0673Ek, str, 0, 0, false, null, null);
    }

    public C4L(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.C0673Ek c0673Ek, java.lang.String str, int i, int i2, boolean z, android.os.Bundle bundle, java.util.Map<java.lang.String, java.lang.String> map) {
        super(c1636gi, va, c0673Ek, str, !c0673Ek.A0m(), i, i2, z, bundle, map, new com.facebook.ads.redexgen.core.EE(c1636gi, c0673Ek));
        this.A0E = new com.facebook.ads.redexgen.core.AbstractC0654Dr() { // from class: com.facebook.ads.redexgen.X.4M
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.C0655Ds c0655Ds) {
                com.facebook.ads.redexgen.core.C4L.this.A0f();
            }
        };
        this.A08 = new com.facebook.ads.redexgen.core.EQ(this);
        this.A04 = new com.facebook.ads.redexgen.core.EO(this);
        this.A05 = new com.facebook.ads.redexgen.core.EN(this);
        this.A06 = new com.facebook.ads.redexgen.core.EM(this);
        this.A03 = new com.facebook.ads.redexgen.core.EL(this);
        this.A07 = new com.facebook.ads.redexgen.core.EK(this);
        this.A0A = new com.facebook.ads.redexgen.core.EJ(this);
        this.A0B = new com.facebook.ads.redexgen.core.EI(this);
        this.A09 = new com.facebook.ads.redexgen.core.C0666Ed(this);
        this.A0D = new com.facebook.ads.redexgen.core.E0() { // from class: com.facebook.ads.redexgen.X.4N
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(com.facebook.ads.redexgen.core.E1 e1) {
                com.facebook.ads.redexgen.core.C0673Ek c0673Ek2;
                com.facebook.ads.redexgen.core.C4L c4l = com.facebook.ads.redexgen.core.C4L.this;
                c0673Ek2 = com.facebook.ads.redexgen.core.C4L.this.A0C;
                c4l.A00 = c0673Ek2.getDuration();
            }
        };
        this.A02 = false;
        this.A0C = c0673Ek;
        this.A0C.getEventBus().A03(this.A0E, this.A06, this.A08, this.A05, this.A04, this.A03, this.A07, this.A0A, this.A0B, this.A0D, this.A09);
        if (com.facebook.ads.redexgen.core.C1086Up.A2u(c1636gi)) {
            this.A01 = new com.facebook.ads.redexgen.core.C1510eg(c0673Ek, str, z, null);
        }
    }

    public C4L(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.VA va, com.facebook.ads.redexgen.core.C0673Ek c0673Ek, java.lang.String str, android.os.Bundle bundle, java.util.Map<java.lang.String, java.lang.String> extraParams) {
        this(c1636gi, va, c0673Ek, str, 0, 0, false, bundle, extraParams);
    }

    @Override // com.facebook.ads.redexgen.core.EF
    public final void A0n(com.facebook.ads.redexgen.core.EnumC1514ek enumC1514ek, java.util.Map<java.lang.String, java.lang.String> map) {
        super.A0n(enumC1514ek, map);
        if (this.A01 != null && enumC1514ek == com.facebook.ads.redexgen.core.EnumC1514ek.A09) {
            java.util.Map<java.lang.String, java.lang.String> params = this.A01.A06();
            java.lang.String[] strArr = A0F;
            if (strArr[0].length() == strArr[3].length()) {
                throw new java.lang.RuntimeException();
            }
            A0F[2] = "tc9";
            map.putAll(params);
        }
    }

    public final void A0p() {
        com.facebook.ads.redexgen.core.ET et = new com.facebook.ads.redexgen.core.ET(this);
        if (this.A0C.A0q()) {
            com.facebook.ads.redexgen.core.Y4.A00(et);
            return;
        }
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek = this.A0C;
        java.lang.String[] strArr = A0F;
        if (strArr[4].length() == strArr[6].length()) {
            throw new java.lang.RuntimeException();
        }
        A0F[1] = "nFCp2DExxe9bklz52WjNRol8ULAuMoj6";
        c0673Ek.getStateHandler().post(et);
    }
}
