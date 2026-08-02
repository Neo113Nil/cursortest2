package U7;

import T7.C4040w;
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
public final class k implements S7.a {

    /* renamed from: d, reason: collision with root package name */
    private static final a.EnumC0605a f27401d = a.EnumC0605a.ALGORITHM_NOT_FIPS;

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f27402e = O7.o.b("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f27403f = O7.o.b("070000004041424344454647");

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f27404g = O7.o.b("a0784d7a4716f3feb4f64e7f4b39bf04");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f27405h = 0;

    /* renamed from: a, reason: collision with root package name */
    private final SecretKeySpec f27406a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f27407b;

    /* renamed from: c, reason: collision with root package name */
    private final Provider f27408c;

    private k(byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!f27401d.a()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f27406a = new SecretKeySpec(bArr, "ChaCha20");
        this.f27407b = bArr2;
        this.f27408c = provider;
    }

    public static k c(C4040w c4040w) throws GeneralSecurityException {
        return new k(c4040w.h().d(S7.e.a()), c4040w.e().d(), d().getProvider());
    }

    static Cipher d() throws GeneralSecurityException {
        Cipher a11 = i8.k.f66115b.a("ChaCha20-Poly1305");
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f27403f);
            byte[] bArr = f27402e;
            a11.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = f27404g;
            if (a11.doFinal(bArr2).length == 0) {
                a11.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
                if (a11.doFinal(bArr2).length == 0) {
                    return a11;
                }
            }
        } catch (GeneralSecurityException unused) {
        }
        throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
    }

    public static boolean e() {
        try {
            d();
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // S7.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] a11 = H.a(12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(a11);
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.f27408c);
        cipher.init(1, this.f27406a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int outputSize = cipher.getOutputSize(bArr.length);
        byte[] bArr3 = this.f27407b;
        if (outputSize > 2147483635 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
        System.arraycopy(a11, 0, copyOf, bArr3.length, 12);
        if (cipher.doFinal(bArr, 0, bArr.length, copyOf, bArr3.length + 12) == outputSize) {
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
        byte[] bArr3 = this.f27407b;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!M.b(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, bArr3.length, bArr4, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.f27408c);
        cipher.init(2, this.f27406a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, bArr3.length + 12, (bArr.length - bArr3.length) - 12);
    }
}
