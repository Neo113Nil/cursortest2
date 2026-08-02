package com.google.protobuf;

/* renamed from: com.google.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0907i extends C0909j {

    /* renamed from: e, reason: collision with root package name */
    public final int f12203e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12204f;

    public C0907i(byte[] bArr, int i7, int i8) {
        super(bArr);
        AbstractC0911k.z(i7, i7 + i8, bArr.length);
        this.f12203e = i7;
        this.f12204f = i8;
    }

    @Override // com.google.protobuf.C0909j, com.google.protobuf.AbstractC0911k
    public final void B(int i7, byte[] bArr, int i8, int i9) {
        System.arraycopy(this.f12207d, this.f12203e + i7, bArr, i8, i9);
    }

    @Override // com.google.protobuf.C0909j, com.google.protobuf.AbstractC0911k
    public final byte D(int i7) {
        return this.f12207d[this.f12203e + i7];
    }

    @Override // com.google.protobuf.C0909j
    public final int O() {
        return this.f12203e;
    }

    @Override // com.google.protobuf.C0909j, com.google.protobuf.AbstractC0911k
    public final int size() {
        return this.f12204f;
    }

    @Override // com.google.protobuf.C0909j, com.google.protobuf.AbstractC0911k
    public final byte t(int i7) {
        AbstractC0911k.y(i7, this.f12204f);
        return this.f12207d[this.f12203e + i7];
    }
}
