package K3;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import w1.C1718l0;

/* loaded from: classes2.dex */
public final class d implements J3.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.support.v4.media.session.t f3901a;

    /* renamed from: b, reason: collision with root package name */
    public final C1718l0 f3902b;

    /* renamed from: c, reason: collision with root package name */
    public final C1718l0 f3903c;

    public d(android.support.v4.media.session.t tVar) {
        this.f3901a = tVar;
        boolean isEmpty = ((T3.a) tVar.f8078d).f6343a.isEmpty();
        C1718l0 c1718l0 = Q3.p.f5828a;
        if (isEmpty) {
            this.f3902b = c1718l0;
            this.f3903c = c1718l0;
            return;
        }
        Q3.f fVar = (Q3.f) Q3.g.f5807b.f5809a.get();
        fVar = fVar == null ? Q3.g.f5808c : fVar;
        Q3.p.a(tVar);
        fVar.getClass();
        this.f3902b = c1718l0;
        this.f3903c = c1718l0;
    }

    @Override // J3.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        C1718l0 c1718l0 = this.f3902b;
        android.support.v4.media.session.t tVar = this.f3901a;
        try {
            byte[] bArr3 = ((J3.k) tVar.f8077c).f3848c;
            byte[] d7 = P6.b.d(bArr3 == null ? null : Arrays.copyOf(bArr3, bArr3.length), ((J3.a) ((J3.k) tVar.f8077c).f3847b).a(bArr, bArr2));
            int i7 = ((J3.k) tVar.f8077c).f3851f;
            int length = bArr.length;
            c1718l0.getClass();
            return d7;
        } catch (GeneralSecurityException e7) {
            c1718l0.getClass();
            throw e7;
        }
    }

    @Override // J3.a
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        android.support.v4.media.session.t tVar = this.f3901a;
        C1718l0 c1718l0 = this.f3903c;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            Iterator it = tVar.d0(copyOf).iterator();
            while (it.hasNext()) {
                try {
                    byte[] b7 = ((J3.a) ((J3.k) it.next()).f3847b).b(copyOfRange, bArr2);
                    c1718l0.getClass();
                    return b7;
                } catch (GeneralSecurityException e7) {
                    e.f3904a.info("ciphertext prefix matches a key, but cannot decrypt: " + e7);
                }
            }
        }
        Iterator it2 = tVar.d0(J3.b.f3834a).iterator();
        while (it2.hasNext()) {
            try {
                byte[] b8 = ((J3.a) ((J3.k) it2.next()).f3847b).b(bArr, bArr2);
                c1718l0.getClass();
                return b8;
            } catch (GeneralSecurityException unused) {
            }
        }
        c1718l0.getClass();
        throw new GeneralSecurityException("decryption failed");
    }
}
