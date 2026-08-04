package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0863i extends C0865j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12204f;

    public C0863i(byte[] bArr, int i7, int i8) {
        super(bArr);
        AbstractC0867k.z(i7, i7 + i8, bArr.length);
        this.f12203e = i7;
        this.f12204f = i8;
    }

    @Override // com.google.protobuf.C0865j, com.google.protobuf.AbstractC0867k
    public final void B(int i7, byte[] bArr, int i8, int i9) {
        System.arraycopy(this.f12207d, this.f12203e + i7, bArr, i8, i9);
    }

    @Override // com.google.protobuf.C0865j, com.google.protobuf.AbstractC0867k
    public final byte D(int i7) {
        return this.f12207d[this.f12203e + i7];
    }

    @Override // com.google.protobuf.C0865j
    public final int O() {
        return this.f12203e;
    }

    @Override // com.google.protobuf.C0865j, com.google.protobuf.AbstractC0867k
    public final int size() {
        return this.f12204f;
    }

    @Override // com.google.protobuf.C0865j, com.google.protobuf.AbstractC0867k
    public final byte t(int i7) {
        AbstractC0867k.y(i7, this.f12204f);
        return this.f12207d[this.f12203e + i7];
    }
}
