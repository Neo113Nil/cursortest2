package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class L9 implements io.appmetrica.analytics.impl.G8 {
    @Override // io.appmetrica.analytics.impl.G8
    public final io.appmetrica.analytics.impl.C0869z8 a(io.appmetrica.analytics.impl.P5 p5) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.impl.G8
    public final byte[] a(byte[] bArr) {
        try {
            return android.util.Base64.decode(bArr, 0);
        } catch (java.lang.Throwable unused) {
            return new byte[0];
        }
    }

    public final io.appmetrica.analytics.impl.I8 a() {
        return io.appmetrica.analytics.impl.I8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER;
    }
}
