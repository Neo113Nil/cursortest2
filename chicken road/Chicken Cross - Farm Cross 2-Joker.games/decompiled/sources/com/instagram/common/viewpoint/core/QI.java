package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QI implements InterfaceC2455Xr {
    public int A00;
    public final InterfaceC2455Xr A01;

    public QI(InterfaceC2455Xr interfaceC2455Xr, int i) {
        this.A01 = interfaceC2455Xr;
        this.A00 = i;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2455Xr
    public final void AH8(String str) {
        if (this.A00 > 0) {
            this.A01.AH8(str);
            this.A00--;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2455Xr
    public final void flush() {
        this.A01.flush();
    }
}
