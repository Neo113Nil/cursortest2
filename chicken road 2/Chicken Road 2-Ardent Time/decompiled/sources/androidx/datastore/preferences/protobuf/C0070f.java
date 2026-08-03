package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0070f extends androidx.datastore.preferences.protobuf.C0071g {

    /* renamed from: e, reason: collision with root package name */
    public final int f2299e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2300f;

    public C0070f(byte[] bArr, int i2, int i3) {
        super(bArr);
        androidx.datastore.preferences.protobuf.C0071g.b(i2, i2 + i3, bArr.length);
        this.f2299e = i2;
        this.f2300f = i3;
    }

    @Override // androidx.datastore.preferences.protobuf.C0071g
    public final byte a(int i2) {
        int i3 = this.f2300f;
        if (((i3 - (i2 + 1)) | i2) >= 0) {
            return this.f2304b[this.f2299e + i2];
        }
        if (i2 < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(B1.a.f(i2, "Index < 0: "));
        }
        throw new java.lang.ArrayIndexOutOfBoundsException(B1.a.h("Index > length: ", i2, i3, ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.C0071g
    public final void d(int i2, byte[] bArr) {
        java.lang.System.arraycopy(this.f2304b, this.f2299e, bArr, 0, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.C0071g
    public final int e() {
        return this.f2299e;
    }

    @Override // androidx.datastore.preferences.protobuf.C0071g
    public final byte f(int i2) {
        return this.f2304b[this.f2299e + i2];
    }

    @Override // androidx.datastore.preferences.protobuf.C0071g
    public final int size() {
        return this.f2300f;
    }
}
