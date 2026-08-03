package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Z2 extends io.appmetrica.analytics.impl.M2 {
    public Z2(int i2, java.lang.String str, io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger) {
        super(i2, str, publicLogger);
    }

    public final int b() {
        return this.f4635a;
    }

    @Override // io.appmetrica.analytics.impl.Ln
    public final byte[] a(byte[] bArr) {
        if (bArr == null) {
            return bArr;
        }
        int length = bArr.length;
        int i2 = this.f4635a;
        if (length <= i2) {
            return bArr;
        }
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i2);
        this.f4637c.warning("\"%s\" %s exceeded limit of %d bytes", this.f4636b, bArr, java.lang.Integer.valueOf(this.f4635a));
        return bArr2;
    }

    public final java.lang.String a() {
        return this.f4636b;
    }
}
