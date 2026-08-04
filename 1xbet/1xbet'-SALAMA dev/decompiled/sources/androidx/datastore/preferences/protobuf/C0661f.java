package androidx.datastore.preferences.protobuf;

import W5.AbstractC0486a1;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0661f extends C0662g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9181f;

    public C0661f(byte[] bArr, int i7, int i8) {
        super(bArr);
        C0662g.m(i7, i7 + i8, bArr.length);
        this.f9180e = i7;
        this.f9181f = i8;
    }

    @Override // androidx.datastore.preferences.protobuf.C0662g
    public final byte A(int i7) {
        return this.f9185b[this.f9180e + i7];
    }

    @Override // androidx.datastore.preferences.protobuf.C0662g
    public final byte l(int i7) {
        int i8 = this.f9181f;
        if (((i8 - (i7 + 1)) | i7) >= 0) {
            return this.f9185b[this.f9180e + i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException(p031e1.k.d(i7, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC0486a1.e(i7, i8, "Index > length: ", ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.C0662g
    public final int size() {
        return this.f9181f;
    }

    @Override // androidx.datastore.preferences.protobuf.C0662g
    public final void y(int i7, byte[] bArr) {
        System.arraycopy(this.f9185b, this.f9180e, bArr, 0, i7);
    }

    @Override // androidx.datastore.preferences.protobuf.C0662g
    public final int z() {
        return this.f9180e;
    }
}
