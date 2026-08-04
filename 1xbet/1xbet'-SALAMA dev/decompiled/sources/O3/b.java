package O3;

import J3.k;
import Q3.f;
import Q3.g;
import Q3.p;
import android.support.v4.media.session.t;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import p155w1.C1009l0;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements J3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f4999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1009l0 f5000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1009l0 f5001c;

    public b(t tVar) {
        this.f4999a = tVar;
        boolean zIsEmpty = ((T3.a) tVar.f8078d).f6343a.isEmpty();
        C1009l0 c1009l0 = p.f5828a;
        if (zIsEmpty) {
            this.f5000b = c1009l0;
            this.f5001c = c1009l0;
            return;
        }
        f fVar = (f) g.f5807b.f5809a.get();
        fVar = fVar == null ? g.f5808c : fVar;
        p.a(tVar);
        fVar.getClass();
        this.f5000b = c1009l0;
        this.f5001c = c1009l0;
    }

    @Override // J3.c
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        C1009l0 c1009l0 = this.f5000b;
        t tVar = this.f4999a;
        try {
            byte[] bArr3 = ((k) tVar.f8077c).f3848c;
            byte[] bArrD = P6.b.d(bArr3 == null ? null : Arrays.copyOf(bArr3, bArr3.length), ((J3.c) ((k) tVar.f8077c).f3847b).a(bArr, bArr2));
            int i7 = ((k) tVar.f8077c).f3851f;
            c1009l0.getClass();
            return bArrD;
        } catch (GeneralSecurityException e7) {
            c1009l0.getClass();
            throw e7;
        }
    }

    @Override // J3.c
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        t tVar = this.f4999a;
        C1009l0 c1009l0 = this.f5001c;
        if (length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            Iterator it = tVar.d0(bArrCopyOf).iterator();
            while (it.hasNext()) {
                try {
                    byte[] bArrB = ((J3.c) ((k) it.next()).f3847b).b(bArrCopyOfRange, bArr2);
                    c1009l0.getClass();
                    return bArrB;
                } catch (GeneralSecurityException e7) {
                    c.f5002a.info("ciphertext prefix matches a key, but cannot decrypt: " + e7);
                }
            }
        }
        Iterator it2 = tVar.d0(J3.b.f3834a).iterator();
        while (it2.hasNext()) {
            try {
                byte[] bArrB2 = ((J3.c) ((k) it2.next()).f3847b).b(bArr, bArr2);
                c1009l0.getClass();
                return bArrB2;
            } catch (GeneralSecurityException unused) {
            }
        }
        c1009l0.getClass();
        throw new GeneralSecurityException("decryption failed");
    }
}
