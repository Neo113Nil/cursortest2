package io.appmetrica.analytics.coreutils.internal.encryption;

import io.appmetrica.analytics.coreapi.internal.crypto.Encrypter;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class AESEncrypter implements Encrypter {
    public static final String DEFAULT_ALGORITHM = "AES/CBC/PKCS5Padding";
    public static final int DEFAULT_KEY_LENGTH = 16;
    public static final String TAG = "[AESEncrypter]";

    /* renamed from: a, reason: collision with root package name */
    private final String f5428a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f5429b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f5430c;

    public AESEncrypter(String str, byte[] bArr, byte[] bArr2) {
        this.f5428a = str;
        this.f5429b = bArr;
        this.f5430c = bArr2;
    }

    public byte[] decrypt(byte[] bArr) {
        return decrypt(bArr, 0, bArr.length);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.crypto.Encrypter
    public byte[] encrypt(byte[] bArr) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f5429b, "AES");
            Cipher cipher = Cipher.getInstance(this.f5428a);
            cipher.init(1, secretKeySpec, new IvParameterSpec(this.f5430c));
            return cipher.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getAlgorithm() {
        return this.f5428a;
    }

    public byte[] getIV() {
        return this.f5430c;
    }

    public byte[] getPassword() {
        return this.f5429b;
    }

    public byte[] decrypt(byte[] bArr, int i3, int i4) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f5429b, "AES");
            Cipher cipher = Cipher.getInstance(this.f5428a);
            cipher.init(2, secretKeySpec, new IvParameterSpec(this.f5430c));
            return cipher.doFinal(bArr, i3, i4);
        } catch (Throwable unused) {
            return null;
        }
    }
}
