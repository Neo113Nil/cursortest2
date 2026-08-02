package com.google.crypto.tink.shaded.protobuf;

import W5.AbstractC0486a1;

/* renamed from: com.google.crypto.tink.shaded.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0871g extends C0872h {

    /* renamed from: e, reason: collision with root package name */
    public final int f11775e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11776f;

    public C0871g(byte[] bArr, int i7, int i8) {
        super(bArr);
        AbstractC0873i.m(i7, i7 + i8, bArr.length);
        this.f11775e = i7;
        this.f11776f = i8;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0872h
    public final int A() {
        return this.f11775e;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0872h
    public final byte B(int i7) {
        return this.f11777d[this.f11775e + i7];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0872h, com.google.crypto.tink.shaded.protobuf.AbstractC0873i
    public final byte l(int i7) {
        int i8 = this.f11776f;
        if (((i8 - (i7 + 1)) | i7) >= 0) {
            return this.f11777d[this.f11775e + i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException(e1.k.d(i7, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC0486a1.e(i7, i8, "Index > length: ", ", "));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0872h, com.google.crypto.tink.shaded.protobuf.AbstractC0873i
    public final int size() {
        return this.f11776f;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C0872h, com.google.crypto.tink.shaded.protobuf.AbstractC0873i
    public final void y(int i7, byte[] bArr) {
        System.arraycopy(this.f11777d, this.f11775e, bArr, 0, i7);
    }
}
