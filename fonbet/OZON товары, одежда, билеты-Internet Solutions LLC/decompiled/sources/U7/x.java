package U7;

import T7.U;
import com.google.crypto.tink.internal.H;
import com.google.crypto.tink.internal.M;
import d8.C6099a;
import j8.C7306a;
import j8.C7307b;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class x implements S7.a {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f27425a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27426b;

    /* renamed from: c, reason: collision with root package name */
    private final d8.c f27427c;

    private x(byte[] bArr, C7306a c7306a, int i11) throws GeneralSecurityException {
        this.f27427c = i8.o.b(C6099a.e(d8.b.b(bArr.length), C7307b.a(bArr, S7.e.a())));
        this.f27425a = c7306a.d();
        this.f27426b = i11;
    }

    public static x c(U u11) throws GeneralSecurityException {
        if (u11.i().c() < 8 || u11.i().c() > 12) {
            throw new GeneralSecurityException("invalid salt size");
        }
        return new x(u11.h().d(S7.e.a()), u11.e(), u11.i().c());
    }

    private byte[] d(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr3 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (bArr.length > 12 || bArr.length < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        System.arraycopy(bArr, 0, bArr3, 4, bArr.length);
        byte[] bArr4 = new byte[32];
        d8.c cVar = this.f27427c;
        System.arraycopy(cVar.a(16, bArr2), 0, bArr4, 0, 16);
        System.arraycopy(cVar.a(16, bArr3), 0, bArr4, 16, 16);
        return bArr4;
    }

    @Override // S7.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        int i11 = this.f27426b;
        int i12 = i11 + 12;
        byte[] a11 = H.a(i12);
        byte[] copyOf = Arrays.copyOf(a11, i11);
        byte[] copyOfRange = Arrays.copyOfRange(a11, i11, i12);
        p pVar = new p(d(copyOf));
        byte[] bArr3 = this.f27425a;
        byte[] b11 = pVar.b(copyOfRange, bArr, bArr3.length + i11 + copyOfRange.length, bArr2);
        System.arraycopy(bArr3, 0, b11, 0, bArr3.length);
        System.arraycopy(a11, 0, b11, bArr3.length, a11.length);
        return b11;
    }

    @Override // S7.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f27425a;
        int length2 = bArr3.length;
        int i11 = this.f27426b;
        if (length < length2 + i11 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!M.b(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int length3 = bArr3.length + i11;
        p pVar = new p(d(Arrays.copyOfRange(bArr, bArr3.length, length3)));
        int i12 = length3 + 12;
        return pVar.a(Arrays.copyOfRange(bArr, length3, i12), bArr, i12, bArr2);
    }
}
