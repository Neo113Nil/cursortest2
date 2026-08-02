package U7;

import T7.C4036s;
import T7.E;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.crypto.tink.internal.H;
import com.google.crypto.tink.internal.M;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes9.dex */
public final class h implements S7.a {

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f27388d = O7.o.b("7a806c");

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f27389e = O7.o.b("46bb91c3c5");

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f27390f = O7.o.b("36864200e0eaf5284d884a0e77d31646");

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f27391g = O7.o.b("bae8e37fc83441b16034566b");

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f27392h = O7.o.b("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* renamed from: a, reason: collision with root package name */
    private final Ej.b f27393a;

    /* renamed from: b, reason: collision with root package name */
    private final SecretKeySpec f27394b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f27395c;

    private h(byte[] bArr, byte[] bArr2, Ej.b bVar) throws GeneralSecurityException {
        this.f27395c = bArr2;
        i8.v.a(bArr.length);
        this.f27394b = new SecretKeySpec(bArr, "AES");
        this.f27393a = bVar;
    }

    public static h c(C4036s c4036s, Ej.b bVar) throws GeneralSecurityException {
        if (d(V7.a.c())) {
            return new h(c4036s.h().d(S7.e.a()), c4036s.e().d(), bVar);
        }
        throw new IllegalStateException("Cipher does not implement AES GCM SIV.");
    }

    public static boolean d(Cipher cipher) {
        try {
            byte[] bArr = f27391g;
            cipher.init(2, new SecretKeySpec(f27390f, "AES"), new GCMParameterSpec(UserVerificationMethods.USER_VERIFY_PATTERN, bArr, 0, bArr.length));
            cipher.updateAAD(f27389e);
            byte[] bArr2 = f27392h;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), f27388d);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // S7.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.f27393a.getClass();
        Cipher c11 = V7.a.c();
        int length = bArr.length;
        byte[] bArr3 = this.f27395c;
        if (length > 2147483619 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + bArr.length + 16);
        byte[] a11 = H.a(12);
        System.arraycopy(a11, 0, copyOf, bArr3.length, 12);
        c11.init(1, this.f27394b, new GCMParameterSpec(UserVerificationMethods.USER_VERIFY_PATTERN, a11, 0, a11.length));
        if (bArr2 != null && bArr2.length != 0) {
            c11.updateAAD(bArr2);
        }
        int doFinal = c11.doFinal(bArr, 0, bArr.length, copyOf, bArr3.length + 12);
        if (doFinal == bArr.length + 16) {
            return copyOf;
        }
        throw new GeneralSecurityException(E.a(doFinal - bArr.length, "encryption failed; AES-GCM-SIV tag must be 16 bytes, but got only ", " bytes"));
    }

    @Override // S7.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f27395c;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!M.b(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        this.f27393a.getClass();
        Cipher c11 = V7.a.c();
        c11.init(2, this.f27394b, new GCMParameterSpec(UserVerificationMethods.USER_VERIFY_PATTERN, bArr, bArr3.length, 12));
        if (bArr2 != null && bArr2.length != 0) {
            c11.updateAAD(bArr2);
        }
        return c11.doFinal(bArr, bArr3.length + 12, (bArr.length - bArr3.length) - 12);
    }
}
