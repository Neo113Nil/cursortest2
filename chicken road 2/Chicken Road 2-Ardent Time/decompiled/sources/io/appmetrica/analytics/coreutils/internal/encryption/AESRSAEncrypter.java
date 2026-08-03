package io.appmetrica.analytics.coreutils.internal.encryption;

/* loaded from: classes.dex */
public class AESRSAEncrypter implements io.appmetrica.analytics.coreapi.internal.crypto.Encrypter {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f3748a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.String f3749b;

    public AESRSAEncrypter() {
        this(0);
    }

    public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, java.security.PublicKey publicKey) {
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        byte[] byteArray;
        javax.crypto.Cipher cipher;
        byte[] encrypt;
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream(bArr2.length + bArr3.length);
            byteArrayOutputStream2.write(bArr2);
            byteArrayOutputStream2.write(bArr3);
            byteArray = byteArrayOutputStream2.toByteArray();
            byteArrayOutputStream2.close();
            cipher = javax.crypto.Cipher.getInstance(this.f3749b);
            cipher.init(1, publicKey);
            byteArrayOutputStream = new java.io.ByteArrayOutputStream(bArr.length);
        } catch (java.lang.Throwable unused) {
            byteArrayOutputStream = null;
        }
        try {
            byteArrayOutputStream.write(cipher.doFinal(byteArray));
            encrypt = new io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter(this.f3748a, bArr2, bArr3).encrypt(bArr);
        } catch (java.lang.Throwable unused2) {
            io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt.closeSafely(byteArrayOutputStream);
            return null;
        }
        if (encrypt == null) {
            io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt.closeSafely(byteArrayOutputStream);
            return null;
        }
        byteArrayOutputStream.write(encrypt);
        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
        io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt.closeSafely(byteArrayOutputStream);
        return byteArray2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.crypto.Encrypter
    @android.annotation.SuppressLint({"TrulyRandom"})
    public byte[] encrypt(byte[] bArr) {
        try {
            java.security.SecureRandom secureRandom = new java.security.SecureRandom();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[16];
            secureRandom.nextBytes(bArr3);
            secureRandom.nextBytes(bArr2);
            return a(bArr, bArr3, bArr2, java.security.KeyFactory.getInstance("RSA").generatePublic(new java.security.spec.X509EncodedKeySpec(android.util.Base64.decode("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDhmH/m2qrRjxDHP794CeaZpENQNYydf8pqyXJilo6XxK+n+pvo27VxWfB3Z1yHrtKow+eZXKLQzrQ8wZMfRgADrYCQJ20y2hGZEUCN1tGSM+xqVKMeCtVi3NvQa54Cx7mT5ECVsH5DKEs/aeScDHP56FzcgEbtOSwyRZ8dsEM0wwIDAQAB", 0))));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public AESRSAEncrypter(int i2) {
        this.f3748a = io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter.DEFAULT_ALGORITHM;
        this.f3749b = "RSA/ECB/PKCS1Padding";
    }
}
