package I4;

import Y4.C0567d;
import Y4.C0569e;
import Y4.H0;
import Y4.I0;
import com.google.protobuf.A;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends c {
    @Override // I4.c
    public final I0 d(I0 i7) {
        C0567d c0567dB;
        if (H4.o.f(i7)) {
            C0569e c0569eG = i7.G();
            A a2 = (A) c0569eG.j(5);
            if (!a2.f12095a.equals(c0569eG)) {
                a2.d();
                A.e(a2.f12096b, c0569eG);
            }
            c0567dB = (C0567d) a2;
        } else {
            c0567dB = C0569e.B();
        }
        for (I0 i8 : this.f3663a) {
            int i9 = 0;
            while (i9 < ((C0569e) c0567dB.f12096b).A()) {
                if (H4.o.e(((C0569e) c0567dB.f12096b).z(i9), i8)) {
                    c0567dB.d();
                    C0569e.x((C0569e) c0567dB.f12096b, i9);
                } else {
                    i9++;
                }
            }
        }
        H0 h0S = I0.S();
        h0S.f(c0567dB);
        return (I0) h0S.b();
    }
}
