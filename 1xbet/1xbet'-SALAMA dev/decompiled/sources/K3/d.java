package K3;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import p155w1.C1009l0;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements J3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.support.v4.media.session.t f3901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1009l0 f3902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1009l0 f3903c;

    public d(android.support.v4.media.session.t tVar) {
        this.f3901a = tVar;
        boolean zIsEmpty = ((T3.a) tVar.f8078d).f6343a.isEmpty();
        C1009l0 c1009l0 = Q3.p.f5828a;
        if (zIsEmpty) {
            this.f3902b = c1009l0;
            this.f3903c = c1009l0;
            return;
        }
        Q3.f fVar = (Q3.f) Q3.g.f5807b.f5809a.get();
        fVar = fVar == null ? Q3.g.f5808c : fVar;
        Q3.p.a(tVar);
        fVar.getClass();
        this.f3902b = c1009l0;
        this.f3903c = c1009l0;
    }

    @Override // J3.a
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        C1009l0 c1009l0 = this.f3902b;
        android.support.v4.media.session.t tVar = this.f3901a;
        try {
            byte[] bArr3 = ((J3.k) tVar.f8077c).f3848c;
            byte[] bArrD = P6.b.d(bArr3 == null ? null : Arrays.copyOf(bArr3, bArr3.length), ((J3.a) ((J3.k) tVar.f8077c).f3847b).a(bArr, bArr2));
            int i7 = ((J3.k) tVar.f8077c).f3851f;
            int length = bArr.length;
            c1009l0.getClass();
            return bArrD;
        } catch (GeneralSecurityException e7) {
            c1009l0.getClass();
            throw e7;
        }
    }

    @Override // J3.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        android.support.v4.media.session.t tVar = this.f3901a;
        C1009l0 c1009l0 = this.f3903c;
        if (length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            Iterator it = tVar.d0(bArrCopyOf).iterator();
            while (it.hasNext()) {
                try {
                    byte[] bArrB = ((J3.a) ((J3.k) it.next()).f3847b).b(bArrCopyOfRange, bArr2);
                    c1009l0.getClass();
                    return bArrB;
                } catch (GeneralSecurityException e7) {
                    e.f3904a.info("ciphertext prefix matches a key, but cannot decrypt: " + e7);
                }
            }
        }
        Iterator it2 = tVar.d0(J3.b.f3834a).iterator();
        while (it2.hasNext()) {
            try {
                byte[] bArrB2 = ((J3.a) ((J3.k) it2.next()).f3847b).b(bArr, bArr2);
                c1009l0.getClass();
                return bArrB2;
            } catch (GeneralSecurityException unused) {
            }
        }
        c1009l0.getClass();
        throw new GeneralSecurityException("decryption failed");
    }
}
