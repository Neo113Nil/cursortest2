package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class A4 implements com.facebook.ads.redexgen.core.InterfaceC04073l {
    public final com.facebook.ads.redexgen.core.C05639y A00;
    public final com.facebook.ads.redexgen.core.C2074oJ A01;
    public final com.facebook.ads.redexgen.core.InterfaceC04063k[] A02;

    public A4(com.facebook.ads.redexgen.core.InterfaceC04063k... interfaceC04063kArr) {
        this(interfaceC04063kArr, new com.facebook.ads.redexgen.core.C05639y(), new com.facebook.ads.redexgen.core.C2074oJ());
    }

    public A4(com.facebook.ads.redexgen.core.InterfaceC04063k[] interfaceC04063kArr, com.facebook.ads.redexgen.core.C05639y c05639y, com.facebook.ads.redexgen.core.C2074oJ c2074oJ) {
        this.A02 = new com.facebook.ads.redexgen.core.InterfaceC04063k[interfaceC04063kArr.length + 2];
        java.lang.System.arraycopy(interfaceC04063kArr, 0, this.A02, 0, interfaceC04063kArr.length);
        this.A00 = c05639y;
        this.A01 = c2074oJ;
        this.A02[interfaceC04063kArr.length] = c05639y;
        this.A02[interfaceC04063kArr.length + 1] = c2074oJ;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04073l
    public final com.facebook.ads.redexgen.core.C2175px A4F(com.facebook.ads.redexgen.core.C2175px c2175px) {
        this.A01.A02(c2175px.A01);
        this.A01.A01(c2175px.A00);
        return c2175px;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04073l
    public final boolean A4G(boolean z) {
        this.A00.A0D(z);
        return z;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04073l
    public final com.facebook.ads.redexgen.core.InterfaceC04063k[] A6z() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04073l
    public final long A8U(long j) {
        return this.A01.A00(j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04073l
    public final long A98() {
        return this.A00.A0C();
    }
}
