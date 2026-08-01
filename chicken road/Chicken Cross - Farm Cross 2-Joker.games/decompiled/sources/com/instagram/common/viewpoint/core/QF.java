package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QF implements InterfaceC2455Xr {
    public final C2454Xq A00;
    public final InterfaceC2455Xr A01;

    public QF(InterfaceC2455Xr interfaceC2455Xr, int i, int i2) {
        this.A01 = interfaceC2455Xr;
        this.A00 = new C2454Xq(i, i2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2455Xr
    public final void AH8(String str) {
        boolean A08;
        this.A00.A04(str);
        if (this.A00.A02() == null) {
            return;
        }
        A08 = AbstractC2457Xt.A08(this.A00);
        if (A08) {
            this.A01.AH8(this.A00.A02());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2455Xr
    public final void flush() {
        boolean A08;
        this.A00.A03();
        while (this.A00.A02() != null) {
            A08 = AbstractC2457Xt.A08(this.A00);
            if (A08) {
                this.A01.AH8(this.A00.A02());
            }
            this.A00.A03();
        }
    }
}
