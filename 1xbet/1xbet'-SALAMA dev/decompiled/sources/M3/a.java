package M3;

import L3.b;
import W3.n;
import W3.o;
import W5.AbstractC0486a1;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements J3.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f4576b = new b(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f4577a;

    public a(byte[] bArr) throws InvalidAlgorithmParameterException {
        o.a(bArr.length);
        this.f4577a = new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec c(int i7, byte[] bArr) throws GeneralSecurityException {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i7);
        } catch (ClassNotFoundException unused) {
            if ("The Android Project".equals(System.getProperty("java.vendor"))) {
                return new IvParameterSpec(bArr, 0, i7);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    @Override // J3.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] bArrA = n.a(12);
        System.arraycopy(bArrA, 0, bArr3, 0, 12);
        AlgorithmParameterSpec algorithmParameterSpecC = c(bArrA.length, bArrA);
        b bVar = f4576b;
        ((Cipher) bVar.get()).init(1, this.f4577a, algorithmParameterSpecC);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) bVar.get()).updateAAD(bArr2);
        }
        int iDoFinal = ((Cipher) bVar.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(AbstractC0486a1.f(iDoFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
    }

    @Override // J3.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecC = c(12, bArr);
        b bVar = f4576b;
        ((Cipher) bVar.get()).init(2, this.f4577a, algorithmParameterSpecC);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) bVar.get()).updateAAD(bArr2);
        }
        return ((Cipher) bVar.get()).doFinal(bArr, 12, bArr.length - 12);
    }
}
