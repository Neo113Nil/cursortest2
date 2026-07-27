package androidx.datastore.preferences.protobuf;

import b2.AbstractC0279e;

/* renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0211f extends C0212g {

    /* renamed from: e, reason: collision with root package name */
    public final int f4433e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4434f;

    public C0211f(byte[] bArr, int i2, int i3) {
        super(bArr);
        C0212g.c(i2, i2 + i3, bArr.length);
        this.f4433e = i2;
        this.f4434f = i3;
    }

    @Override // androidx.datastore.preferences.protobuf.C0212g
    public final byte b(int i2) {
        int i3 = this.f4434f;
        if (((i3 - (i2 + 1)) | i2) >= 0) {
            return this.f4439b[this.f4433e + i2];
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC0279e.d(i2, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(B0.o.h("Index > length: ", i2, i3, ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.C0212g
    public final void e(int i2, byte[] bArr) {
        System.arraycopy(this.f4439b, this.f4433e, bArr, 0, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.C0212g
    public final int f() {
        return this.f4433e;
    }

    @Override // androidx.datastore.preferences.protobuf.C0212g
    public final byte g(int i2) {
        return this.f4439b[this.f4433e + i2];
    }

    @Override // androidx.datastore.preferences.protobuf.C0212g
    public final int size() {
        return this.f4434f;
    }
}
