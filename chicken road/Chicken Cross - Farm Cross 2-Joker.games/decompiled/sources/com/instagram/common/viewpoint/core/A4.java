package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class A4 implements InterfaceC17013l {
    public final C18579y A00;
    public final C3368oJ A01;
    public final InterfaceC17003k[] A02;

    public A4(InterfaceC17003k... interfaceC17003kArr) {
        this(interfaceC17003kArr, new C18579y(), new C3368oJ());
    }

    public A4(InterfaceC17003k[] interfaceC17003kArr, C18579y c18579y, C3368oJ c3368oJ) {
        this.A02 = new InterfaceC17003k[interfaceC17003kArr.length + 2];
        System.arraycopy(interfaceC17003kArr, 0, this.A02, 0, interfaceC17003kArr.length);
        this.A00 = c18579y;
        this.A01 = c3368oJ;
        this.A02[interfaceC17003kArr.length] = c18579y;
        this.A02[interfaceC17003kArr.length + 1] = c3368oJ;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC17013l
    public final C3469px A4F(C3469px c3469px) {
        this.A01.A02(c3469px.A01);
        this.A01.A01(c3469px.A00);
        return c3469px;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC17013l
    public final boolean A4G(boolean z) {
        this.A00.A0D(z);
        return z;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC17013l
    public final InterfaceC17003k[] A6z() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC17013l
    public final long A8U(long j) {
        return this.A01.A00(j);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC17013l
    public final long A98() {
        return this.A00.A0C();
    }
}
