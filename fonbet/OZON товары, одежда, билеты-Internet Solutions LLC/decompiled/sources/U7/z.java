package U7;

import T7.Y;
import X7.a;
import com.google.crypto.tink.internal.H;
import com.google.crypto.tink.internal.M;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes9.dex */
public final class z implements S7.a {

    /* renamed from: d, reason: collision with root package name */
    private static final a.EnumC0605a f27433d = a.EnumC0605a.ALGORITHM_NOT_FIPS;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f27434a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f27435b;

    /* renamed from: c, reason: collision with root package name */
    private final Provider f27436c;

    private z(byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!f27433d.a()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f27434a = bArr;
        this.f27435b = bArr2;
        this.f27436c = provider;
    }

    public static z c(Y y11) throws GeneralSecurityException {
        return new z(y11.h().d(S7.e.a()), y11.e().d(), k.d().getProvider());
    }

    public static boolean d() {
        return k.e();
    }

    @Override // S7.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] a11 = H.a(24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(o.a(this.f27434a, a11), "ChaCha20");
        byte[] bArr3 = new byte[12];
        System.arraycopy(a11, 16, bArr3, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        int i11 = k.f27405h;
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.f27436c);
        cipher.init(1, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int outputSize = cipher.getOutputSize(bArr.length);
        byte[] bArr4 = this.f27435b;
        if (outputSize > 2147483623 - bArr4.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = Arrays.copyOf(bArr4, bArr4.length + 24 + outputSize);
        System.arraycopy(a11, 0, copyOf, bArr4.length, 24);
        if (cipher.doFinal(bArr, 0, bArr.length, copyOf, bArr4.length + 24) == outputSize) {
            return copyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    @Override // S7.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f27435b;
        if (length < bArr3.length + 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!M.b(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, bArr3.length, bArr4, 0, 24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(o.a(this.f27434a, bArr4), "ChaCha20");
        byte[] bArr5 = new byte[12];
        System.arraycopy(bArr4, 16, bArr5, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr5);
        int i11 = k.f27405h;
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.f27436c);
        cipher.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, bArr3.length + 24, (bArr.length - bArr3.length) - 24);
    }
}
