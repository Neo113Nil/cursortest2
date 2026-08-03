package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public class AESRSARequestBodyEncrypter implements io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter {

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.coreutils.internal.encryption.AESRSAEncrypter f7375a;

    public AESRSARequestBodyEncrypter() {
        this(new io.appmetrica.analytics.coreutils.internal.encryption.AESRSAEncrypter());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter
    public byte[] encrypt(byte[] bArr) {
        return this.f7375a.encrypt(bArr);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter
    public io.appmetrica.analytics.networktasks.internal.RequestBodyEncryptionMode getEncryptionMode() {
        return io.appmetrica.analytics.networktasks.internal.RequestBodyEncryptionMode.AES_RSA;
    }

    public AESRSARequestBodyEncrypter(io.appmetrica.analytics.coreutils.internal.encryption.AESRSAEncrypter aESRSAEncrypter) {
        this.f7375a = aESRSAEncrypter;
    }
}
