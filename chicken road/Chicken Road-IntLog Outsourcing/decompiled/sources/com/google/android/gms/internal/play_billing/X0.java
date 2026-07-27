package com.google.android.gms.internal.play_billing;

import b2.AbstractC0279e;

/* loaded from: classes.dex */
public final class X0 extends Y0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f5128d;

    public X0(int i2, byte[] bArr) {
        super(bArr);
        Y0.e(0, i2, bArr.length);
        this.f5128d = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.Y0
    public final byte b(int i2) {
        int i3 = this.f5128d;
        if (((i3 - (i2 + 1)) | i2) >= 0) {
            return this.f5144b[i2];
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC0279e.d(i2, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(B0.o.h("Index > length: ", i2, i3, ", "));
    }

    @Override // com.google.android.gms.internal.play_billing.Y0
    public final byte c(int i2) {
        return this.f5144b[i2];
    }

    @Override // com.google.android.gms.internal.play_billing.Y0
    public final int d() {
        return this.f5128d;
    }
}
