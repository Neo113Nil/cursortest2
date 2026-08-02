package W3;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import v0.AbstractC1663a;
import w1.C1759x1;

/* loaded from: classes2.dex */
public final class d implements J3.c {

    /* renamed from: c, reason: collision with root package name */
    public static final List f6707c = Arrays.asList(64);

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f6708d = new byte[16];

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f6709e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public final C1759x1 f6710a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f6711b;

    public d(byte[] bArr) {
        if (!AbstractC1663a.a(1)) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (!f6707c.contains(Integer.valueOf(bArr.length))) {
            throw new InvalidKeyException(e1.k.g(new StringBuilder("invalid key size: "), bArr.length, " bytes; key must have 64 bytes"));
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.f6711b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.f6710a = new C1759x1(copyOfRange);
    }

    @Override // J3.c
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) i.f6718b.f6720a.R("AES/CTR/NoPadding");
        byte[] c3 = c(bArr2, bArr);
        byte[] bArr3 = (byte[]) c3.clone();
        bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
        cipher.init(1, new SecretKeySpec(this.f6711b, "AES"), new IvParameterSpec(bArr3));
        return P6.b.d(c3, cipher.doFinal(bArr));
    }

    @Override // J3.c
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher cipher = (Cipher) i.f6718b.f6720a.R("AES/CTR/NoPadding");
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) copyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
        cipher.init(2, new SecretKeySpec(this.f6711b, "AES"), new IvParameterSpec(bArr3));
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] doFinal = cipher.doFinal(copyOfRange2);
        if (copyOfRange2.length == 0 && doFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
            doFinal = new byte[0];
        }
        if (MessageDigest.isEqual(copyOfRange, c(bArr2, doFinal))) {
            return doFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    public final byte[] c(byte[]... bArr) {
        byte[] V4;
        int length = bArr.length;
        C1759x1 c1759x1 = this.f6710a;
        if (length == 0) {
            return c1759x1.k(16, f6709e);
        }
        byte[] k7 = c1759x1.k(16, f6708d);
        for (int i7 = 0; i7 < bArr.length - 1; i7++) {
            byte[] bArr2 = bArr[i7];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            k7 = P6.b.V(p3.f.z(k7), c1759x1.k(16, bArr2));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length < k7.length) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int length2 = bArr3.length - k7.length;
            V4 = Arrays.copyOf(bArr3, bArr3.length);
            for (int i8 = 0; i8 < k7.length; i8++) {
                int i9 = length2 + i8;
                V4[i9] = (byte) (V4[i9] ^ k7[i8]);
            }
        } else {
            if (bArr3.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(bArr3, 16);
            copyOf[bArr3.length] = Byte.MIN_VALUE;
            V4 = P6.b.V(copyOf, p3.f.z(k7));
        }
        return c1759x1.k(16, V4);
    }
}
