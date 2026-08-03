package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0239b implements io.appmetrica.analytics.impl.G8 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter f5482a;

    public C0239b() {
        this(new io.appmetrica.analytics.impl.C0213a(io.appmetrica.analytics.impl.C0560na.k().g()));
    }

    @Override // io.appmetrica.analytics.impl.G8
    public final io.appmetrica.analytics.impl.C0869z8 a(io.appmetrica.analytics.impl.P5 p5) {
        byte[] encrypt;
        java.lang.String encodeToString;
        java.lang.String value = p5.getValue();
        if (!android.text.TextUtils.isEmpty(value)) {
            try {
                encrypt = this.f5482a.encrypt(value.getBytes("UTF-8"));
            } catch (java.lang.Throwable unused) {
            }
            if (encrypt != null) {
                encodeToString = android.util.Base64.encodeToString(encrypt, 0);
                p5.setValue(encodeToString);
                return new io.appmetrica.analytics.impl.C0869z8(p5, io.appmetrica.analytics.impl.I8.AES_VALUE_ENCRYPTION);
            }
        }
        encodeToString = null;
        p5.setValue(encodeToString);
        return new io.appmetrica.analytics.impl.C0869z8(p5, io.appmetrica.analytics.impl.I8.AES_VALUE_ENCRYPTION);
    }

    public C0239b(io.appmetrica.analytics.impl.C0213a c0213a) {
        this(new io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter(io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter.DEFAULT_ALGORITHM, c0213a.b(), c0213a.a()));
    }

    public C0239b(io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter aESEncrypter) {
        this.f5482a = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.impl.G8
    public final byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr == null || bArr.length <= 0) {
            return bArr2;
        }
        try {
            return this.f5482a.decrypt(android.util.Base64.decode(bArr, 0));
        } catch (java.lang.Throwable unused) {
            return bArr2;
        }
    }

    public final io.appmetrica.analytics.impl.I8 a() {
        return io.appmetrica.analytics.impl.I8.AES_VALUE_ENCRYPTION;
    }
}
