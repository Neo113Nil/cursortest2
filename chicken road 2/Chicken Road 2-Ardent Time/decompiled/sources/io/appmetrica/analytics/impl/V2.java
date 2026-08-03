package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class V2 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.U2 f5114a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor f5115b;

    public V2() {
        this(new io.appmetrica.analytics.impl.U2(), new io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor());
    }

    public final byte[] a(byte[] bArr) {
        try {
            byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr, 0, 16);
            io.appmetrica.analytics.impl.U2 u2 = this.f5114a;
            byte[] bytes = "hBnBQbZrmjPXEWVJ".getBytes();
            u2.getClass();
            io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter aESEncrypter = new io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter(io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter.DEFAULT_ALGORITHM, bytes, copyOfRange);
            if (bArr != null && bArr.length != 0) {
                return this.f5115b.uncompress(aESEncrypter.decrypt(bArr, 16, bArr.length - 16));
            }
            return null;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public V2(io.appmetrica.analytics.impl.U2 u2, io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor gZIPCompressor) {
        this.f5114a = u2;
        this.f5115b = gZIPCompressor;
    }
}
