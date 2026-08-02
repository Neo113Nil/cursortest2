package R3;

import V3.r0;
import android.support.v4.media.session.t;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import w1.C1718l0;

/* loaded from: classes2.dex */
public final class o implements J3.j {

    /* renamed from: a, reason: collision with root package name */
    public final t f6052a;

    /* renamed from: b, reason: collision with root package name */
    public final C1718l0 f6053b;

    /* renamed from: c, reason: collision with root package name */
    public final C1718l0 f6054c;

    public o(t tVar) {
        this.f6052a = tVar;
        boolean isEmpty = ((T3.a) tVar.f8078d).f6343a.isEmpty();
        C1718l0 c1718l0 = Q3.p.f5828a;
        if (isEmpty) {
            this.f6053b = c1718l0;
            this.f6054c = c1718l0;
            return;
        }
        Q3.f fVar = (Q3.f) Q3.g.f5807b.f5809a.get();
        fVar = fVar == null ? Q3.g.f5808c : fVar;
        Q3.p.a(tVar);
        fVar.getClass();
        this.f6053b = c1718l0;
        this.f6054c = c1718l0;
    }

    @Override // J3.j
    public final void a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        C1718l0 c1718l0 = this.f6054c;
        if (length <= 5) {
            c1718l0.getClass();
            throw new GeneralSecurityException("tag too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 5);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
        t tVar = this.f6052a;
        for (J3.k kVar : tVar.d0(copyOf)) {
            byte[] d7 = kVar.f3850e.equals(r0.LEGACY) ? P6.b.d(bArr2, p.f6056b) : bArr2;
            try {
                ((J3.j) kVar.f3847b).a(copyOfRange, d7);
                int length2 = d7.length;
                c1718l0.getClass();
                return;
            } catch (GeneralSecurityException e7) {
                p.f6055a.info("tag prefix matches a key, but cannot verify: " + e7);
            }
        }
        Iterator it = tVar.d0(J3.b.f3834a).iterator();
        while (it.hasNext()) {
            try {
                ((J3.j) ((J3.k) it.next()).f3847b).a(bArr, bArr2);
                int length3 = bArr2.length;
                c1718l0.getClass();
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        c1718l0.getClass();
        throw new GeneralSecurityException("invalid MAC");
    }

    @Override // J3.j
    public final byte[] b(byte[] bArr) {
        C1718l0 c1718l0 = this.f6053b;
        t tVar = this.f6052a;
        if (((J3.k) tVar.f8077c).f3850e.equals(r0.LEGACY)) {
            bArr = P6.b.d(bArr, p.f6056b);
        }
        try {
            byte[] bArr2 = ((J3.k) tVar.f8077c).f3848c;
            byte[] d7 = P6.b.d(bArr2 == null ? null : Arrays.copyOf(bArr2, bArr2.length), ((J3.j) ((J3.k) tVar.f8077c).f3847b).b(bArr));
            int i7 = ((J3.k) tVar.f8077c).f3851f;
            int length = bArr.length;
            c1718l0.getClass();
            return d7;
        } catch (GeneralSecurityException e7) {
            c1718l0.getClass();
            throw e7;
        }
    }
}
