package io.appmetrica.analytics.coreutils.internal.encryption;

/* loaded from: classes.dex */
public class AESEncrypter implements io.appmetrica.analytics.coreapi.internal.crypto.Encrypter {
    public static final java.lang.String DEFAULT_ALGORITHM = "AES/CBC/PKCS5Padding";
    public static final int DEFAULT_KEY_LENGTH = 16;
    public static final java.lang.String TAG = "[AESEncrypter]";

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f3745a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f3746b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f3747c;

    public AESEncrypter(java.lang.String str, byte[] bArr, byte[] bArr2) {
        this.f3745a = str;
        this.f3746b = bArr;
        this.f3747c = bArr2;
    }

    @android.annotation.SuppressLint({"TrulyRandom"})
    public byte[] decrypt(byte[] bArr) {
        return decrypt(bArr, 0, bArr.length);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.crypto.Encrypter
    @android.annotation.SuppressLint({"TrulyRandom"})
    public byte[] encrypt(byte[] bArr) {
        try {
            javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(this.f3746b, "AES");
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(this.f3745a);
            cipher.init(1, secretKeySpec, new javax.crypto.spec.IvParameterSpec(this.f3747c));
            return cipher.doFinal(bArr);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public java.lang.String getAlgorithm() {
        return this.f3745a;
    }

    public byte[] getIV() {
        return this.f3747c;
    }

    public byte[] getPassword() {
        return this.f3746b;
    }

    public byte[] decrypt(byte[] bArr, int i2, int i3) {
        try {
            javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(this.f3746b, "AES");
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(this.f3745a);
            cipher.init(2, secretKeySpec, new javax.crypto.spec.IvParameterSpec(this.f3747c));
            return cipher.doFinal(bArr, i2, i3);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
