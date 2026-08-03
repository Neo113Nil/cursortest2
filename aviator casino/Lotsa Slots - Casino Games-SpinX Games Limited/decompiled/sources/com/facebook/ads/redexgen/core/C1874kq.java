package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.kq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1874kq implements com.facebook.ads.redexgen.core.InterfaceC0854Ll {
    public java.io.ByteArrayInputStream A00;
    public final byte[] A01;

    public C1874kq(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0854Ll
    public final void AGj(int i) throws com.facebook.ads.redexgen.core.C1871kn {
        this.A00 = new java.io.ByteArrayInputStream(this.A01);
        this.A00.skip(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0854Ll
    public final void close() throws com.facebook.ads.redexgen.core.C1871kn {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0854Ll
    public final int length() throws com.facebook.ads.redexgen.core.C1871kn {
        return this.A01.length;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0854Ll
    public final int read(byte[] bArr) throws com.facebook.ads.redexgen.core.C1871kn {
        return this.A00.read(bArr, 0, bArr.length);
    }
}
