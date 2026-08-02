package W3;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import v0.AbstractC1663a;

/* loaded from: classes2.dex */
public final class b implements J3.a {

    /* renamed from: e, reason: collision with root package name */
    public static final L3.b f6699e = new L3.b(3);

    /* renamed from: f, reason: collision with root package name */
    public static final L3.b f6700f = new L3.b(4);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f6701a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f6702b;

    /* renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f6703c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6704d;

    public b(byte[] bArr, int i7) {
        if (!AbstractC1663a.a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i7 != 12 && i7 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f6704d = i7;
        o.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f6703c = secretKeySpec;
        Cipher cipher = (Cipher) f6699e.get();
        cipher.init(1, secretKeySpec);
        byte[] c3 = c(cipher.doFinal(new byte[16]));
        this.f6701a = c3;
        this.f6702b = c(c3);
    }

    public static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i7 = 0;
        while (i7 < 15) {
            int i8 = i7 + 1;
            bArr2[i7] = (byte) (((bArr[i7] << 1) ^ ((bArr[i8] & 255) >>> 7)) & 255);
            i7 = i8;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    public static byte[] e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i7 = 0; i7 < length; i7++) {
            bArr3[i7] = (byte) (bArr[i7] ^ bArr2[i7]);
        }
        return bArr3;
    }

    @Override // J3.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i7 = this.f6704d;
        if (length > 2147483631 - i7) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + i7 + 16];
        byte[] a2 = n.a(i7);
        System.arraycopy(a2, 0, bArr3, 0, i7);
        Cipher cipher = (Cipher) f6699e.get();
        SecretKeySpec secretKeySpec = this.f6703c;
        cipher.init(1, secretKeySpec);
        byte[] d7 = d(cipher, 0, a2, 0, a2.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] d8 = d(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = (Cipher) f6700f.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(d7));
        cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.f6704d);
        byte[] d9 = d(cipher, 2, bArr3, this.f6704d, bArr.length);
        int length2 = bArr.length + i7;
        for (int i8 = 0; i8 < 16; i8++) {
            bArr3[length2 + i8] = (byte) ((d8[i8] ^ d7[i8]) ^ d9[i8]);
        }
        return bArr3;
    }

    @Override // J3.a
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i7 = this.f6704d;
        int i8 = (length - i7) - 16;
        if (i8 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = (Cipher) f6699e.get();
        SecretKeySpec secretKeySpec = this.f6703c;
        cipher.init(1, secretKeySpec);
        byte[] d7 = d(cipher, 0, bArr, 0, this.f6704d);
        byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
        byte[] d8 = d(cipher, 1, bArr3, 0, bArr3.length);
        byte[] d9 = d(cipher, 2, bArr, this.f6704d, i8);
        int length2 = bArr.length - 16;
        byte b7 = 0;
        for (int i9 = 0; i9 < 16; i9++) {
            b7 = (byte) (b7 | (((bArr[length2 + i9] ^ d8[i9]) ^ d7[i9]) ^ d9[i9]));
        }
        if (b7 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f6700f.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(d7));
        return cipher2.doFinal(bArr, i7, i8);
    }

    public final byte[] d(Cipher cipher, int i7, byte[] bArr, int i8, int i9) {
        byte[] copyOf;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i7;
        byte[] bArr3 = this.f6701a;
        if (i9 == 0) {
            return cipher.doFinal(e(bArr2, bArr3));
        }
        byte[] doFinal = cipher.doFinal(bArr2);
        int i10 = 0;
        while (i9 - i10 > 16) {
            for (int i11 = 0; i11 < 16; i11++) {
                doFinal[i11] = (byte) (doFinal[i11] ^ bArr[(i8 + i10) + i11]);
            }
            doFinal = cipher.doFinal(doFinal);
            i10 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i10 + i8, i8 + i9);
        if (copyOfRange.length == 16) {
            copyOf = e(copyOfRange, bArr3);
        } else {
            copyOf = Arrays.copyOf(this.f6702b, 16);
            for (int i12 = 0; i12 < copyOfRange.length; i12++) {
                copyOf[i12] = (byte) (copyOf[i12] ^ copyOfRange[i12]);
            }
            copyOf[copyOfRange.length] = (byte) (copyOf[copyOfRange.length] ^ 128);
        }
        return cipher.doFinal(e(doFinal, copyOf));
    }
}
