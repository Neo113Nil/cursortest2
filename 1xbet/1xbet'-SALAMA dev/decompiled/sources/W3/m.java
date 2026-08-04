package W3;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements J3.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U3.a f6722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6723b;

    public m(U3.a aVar, int i7) throws InvalidAlgorithmParameterException {
        this.f6722a = aVar;
        this.f6723b = i7;
        if (i7 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        aVar.k(i7, new byte[0]);
    }

    @Override // J3.j
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!MessageDigest.isEqual(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // J3.j
    public final byte[] b(byte[] bArr) {
        return this.f6722a.k(this.f6723b, bArr);
    }
}
