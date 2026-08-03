package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.8T, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class C8T extends com.facebook.ads.redexgen.core.AbstractC2115oy<com.facebook.ads.redexgen.core.C8S, com.facebook.ads.redexgen.core.C8P, com.facebook.ads.redexgen.core.C1928lj> implements com.facebook.ads.redexgen.core.InterfaceC1935lq {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"gN8", "v0q6HziqC5r28rLi1ZsQmD2OK0fgspik", "XftI4eRfVNg33Op0jQPz8O6PbCkMHbWE", "SdzNGuU6dc81VqISrLBD", "AmzsDcSyCxTNGO", "BjhKb3Az99p878kvj1gxEmyEzdFIjRD", "VkdZ1nUYKY17rCLbk1Npuh3A0WHSXOLE", "WDjquUi0atGhsKhHWhKEDeyGOzHRt12i"};
    public final java.lang.String A00;

    public static java.lang.String A0L(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] - i3) - 100);
            if (A02[0].length() != 3) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A02;
            strArr[2] = "7OO3CpMfw2stGNBOXFHDwltwdlKTQaUN";
            strArr[7] = "XdJDd6VP529P2X7c3MAKusUlyNrjc2WF";
            copyOfRange[i4] = b;
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0M() {
        if (A02[0].length() != 3) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A02;
        strArr[5] = "V56IsTeJwH5mFHCmn3IS5snx7jCRlGG";
        strArr[4] = "owU73l6HwKvTqc";
        A01 = new byte[]{com.google.common.base.Ascii.FS, 53, 44, 63, 55, 44, 42, 59, 44, 43, -25, 43, 44, 42, 54, 43, 44, -25, 44, 57, 57, 54, 57};
    }

    public abstract com.facebook.ads.redexgen.core.InterfaceC0800Jj A0g(byte[] bArr, int i, boolean z) throws com.facebook.ads.redexgen.core.C1928lj;

    static {
        A0M();
    }

    public C8T(java.lang.String str) {
        super(new com.facebook.ads.redexgen.core.C8S[2], new com.facebook.ads.redexgen.core.C8P[2]);
        this.A00 = str;
        A0d(1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.1Y] */
    @Override // com.facebook.ads.redexgen.core.AbstractC2115oy
    /* renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C1Y A0c() {
        return new com.facebook.ads.redexgen.core.C8P(this) { // from class: com.facebook.ads.redexgen.X.1Y
            public final com.facebook.ads.redexgen.core.C8T A00;

            {
                this.A00 = this;
            }

            @Override // com.facebook.ads.redexgen.core.C8P, com.facebook.ads.redexgen.core.AbstractC2116oz
            public final void A0B() {
                this.A00.A0h(this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2115oy
    /* renamed from: A0I, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C1928lj A0Y(com.facebook.ads.redexgen.core.C8S c8s, com.facebook.ads.redexgen.core.C8P c8p, boolean z) {
        try {
            java.nio.ByteBuffer inputData = (java.nio.ByteBuffer) com.facebook.ads.redexgen.core.AbstractC04203y.A01(c8s.A02);
            c8p.A0C(c8s.A01, A0g(inputData.array(), inputData.limit(), z), c8s.A00);
            c8p.A01(Integer.MIN_VALUE);
            return null;
        } catch (com.facebook.ads.redexgen.core.C1928lj e) {
            return e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2115oy
    /* renamed from: A0J, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C1928lj A0Z(java.lang.Throwable th) {
        return new com.facebook.ads.redexgen.core.C1928lj(A0L(0, 23, 99), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2115oy
    /* renamed from: A0K, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C8S A0a() {
        return new com.facebook.ads.redexgen.core.C8S();
    }

    public final void A0h(com.facebook.ads.redexgen.core.C8P c8p) {
        super.A0f(c8p);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1935lq
    public final void AJh(long j) {
    }
}
