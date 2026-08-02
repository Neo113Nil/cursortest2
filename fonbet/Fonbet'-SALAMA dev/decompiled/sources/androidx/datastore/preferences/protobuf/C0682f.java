package androidx.datastore.preferences.protobuf;

import W5.AbstractC0486a1;

/* renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0682f extends C0683g {

    /* renamed from: e, reason: collision with root package name */
    public final int f9180e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9181f;

    public C0682f(byte[] bArr, int i7, int i8) {
        super(bArr);
        C0683g.m(i7, i7 + i8, bArr.length);
        this.f9180e = i7;
        this.f9181f = i8;
    }

    @Override // androidx.datastore.preferences.protobuf.C0683g
    public final byte A(int i7) {
        return this.f9185b[this.f9180e + i7];
    }

    @Override // androidx.datastore.preferences.protobuf.C0683g
    public final byte l(int i7) {
        int i8 = this.f9181f;
        if (((i8 - (i7 + 1)) | i7) >= 0) {
            return this.f9185b[this.f9180e + i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException(e1.k.d(i7, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC0486a1.e(i7, i8, "Index > length: ", ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.C0683g
    public final int size() {
        return this.f9181f;
    }

    @Override // androidx.datastore.preferences.protobuf.C0683g
    public final void y(int i7, byte[] bArr) {
        System.arraycopy(this.f9185b, this.f9180e, bArr, 0, i7);
    }

    @Override // androidx.datastore.preferences.protobuf.C0683g
    public final int z() {
        return this.f9180e;
    }
}
