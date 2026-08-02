package U7;

import X7.a;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes9.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final a.EnumC0605a f27415b = a.EnumC0605a.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* renamed from: a, reason: collision with root package name */
    private final SecretKeySpec f27416a;

    public p(byte[] bArr) throws GeneralSecurityException {
        if (!f27415b.a()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i11 = f.f27382b;
        i8.v.a(bArr.length);
        this.f27416a = new SecretKeySpec(bArr, "AES");
    }

    public final byte[] a(byte[] bArr, byte[] bArr2, int i11, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (bArr2.length < i11 + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec a11 = f.a(0, bArr.length, bArr);
        Cipher b11 = f.b();
        b11.init(2, this.f27416a, a11);
        if (bArr3 != null && bArr3.length != 0) {
            b11.updateAAD(bArr3);
        }
        return b11.doFinal(bArr2, i11, bArr2.length - i11);
    }

    public final byte[] b(byte[] bArr, byte[] bArr2, int i11, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        AlgorithmParameterSpec a11 = f.a(0, bArr.length, bArr);
        Cipher b11 = f.b();
        b11.init(1, this.f27416a, a11);
        if (bArr3 != null && bArr3.length != 0) {
            b11.updateAAD(bArr3);
        }
        int outputSize = b11.getOutputSize(bArr2.length);
        if (outputSize > Integer.MAX_VALUE - i11) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr4 = new byte[i11 + outputSize];
        if (b11.doFinal(bArr2, 0, bArr2.length, bArr4, i11) == outputSize) {
            return bArr4;
        }
        throw new GeneralSecurityException("not enough data written");
    }
}
