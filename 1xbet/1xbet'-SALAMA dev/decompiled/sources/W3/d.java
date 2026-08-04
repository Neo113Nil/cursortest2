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
import p155w1.C1050x1;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements J3.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f6707c = Arrays.asList(64);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f6708d = new byte[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f6709e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1050x1 f6710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f6711b;

    public d(byte[] bArr) throws GeneralSecurityException {
        if (!p150v0.a.a(1)) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (!f6707c.contains(Integer.valueOf(bArr.length))) {
            throw new InvalidKeyException(p031e1.k.g(new StringBuilder("invalid key size: "), bArr.length, " bytes; key must have 64 bytes"));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.f6711b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.f6710a = new C1050x1(bArrCopyOfRange);
    }

    @Override // J3.c
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) i.f6718b.f6720a.R("AES/CTR/NoPadding");
        byte[] bArrC = c(bArr2, bArr);
        byte[] bArr3 = (byte[]) bArrC.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipher.init(1, new SecretKeySpec(this.f6711b, "AES"), new IvParameterSpec(bArr3));
        return P6.b.d(bArrC, cipher.doFinal(bArr));
    }

    @Override // J3.c
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher cipher = (Cipher) i.f6718b.f6720a.R("AES/CTR/NoPadding");
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) bArrCopyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipher.init(2, new SecretKeySpec(this.f6711b, "AES"), new IvParameterSpec(bArr3));
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange2);
        if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
            bArrDoFinal = new byte[0];
        }
        if (MessageDigest.isEqual(bArrCopyOfRange, c(bArr2, bArrDoFinal))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    public final byte[] c(byte[]... bArr) throws GeneralSecurityException {
        byte[] bArrV;
        int length = bArr.length;
        C1050x1 c1050x1 = this.f6710a;
        if (length == 0) {
            return c1050x1.k(16, f6709e);
        }
        byte[] bArrK = c1050x1.k(16, f6708d);
        for (int i7 = 0; i7 < bArr.length - 1; i7++) {
            byte[] bArr2 = bArr[i7];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrK = P6.b.V(p113p3.f.z(bArrK), c1050x1.k(16, bArr2));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length < bArrK.length) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int length2 = bArr3.length - bArrK.length;
            bArrV = Arrays.copyOf(bArr3, bArr3.length);
            for (int i8 = 0; i8 < bArrK.length; i8++) {
                int i9 = length2 + i8;
                bArrV[i9] = (byte) (bArrV[i9] ^ bArrK[i8]);
            }
        } else {
            if (bArr3.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr3, 16);
            bArrCopyOf[bArr3.length] = -128;
            bArrV = P6.b.V(bArrCopyOf, p113p3.f.z(bArrK));
        }
        return c1050x1.k(16, bArrV);
    }
}
