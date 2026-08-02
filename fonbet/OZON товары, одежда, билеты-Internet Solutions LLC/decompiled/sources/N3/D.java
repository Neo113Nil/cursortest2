package N3;

import b4.C5531g;
import java.io.EOFException;
import java.io.IOException;
import m3.C8050C;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    private final C8050C f18483a = new C8050C(10);

    public final j3.t a(C3659j c3659j, C5531g.a aVar) throws IOException {
        C8050C c8050c = this.f18483a;
        j3.t tVar = null;
        int i11 = 0;
        while (true) {
            try {
                c3659j.d(c8050c.e(), 0, 10, false);
                c8050c.R(0);
                if (c8050c.H() != 4801587) {
                    break;
                }
                c8050c.S(3);
                int D11 = c8050c.D();
                int i12 = D11 + 10;
                if (tVar == null) {
                    byte[] bArr = new byte[i12];
                    System.arraycopy(c8050c.e(), 0, bArr, 0, 10);
                    c3659j.d(bArr, 10, D11, false);
                    tVar = new C5531g(aVar).c(i12, bArr);
                } else {
                    c3659j.i(D11, false);
                }
                i11 += i12;
            } catch (EOFException unused) {
            }
        }
        c3659j.e();
        c3659j.i(i11, false);
        return tVar;
    }
}
