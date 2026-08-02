package I4;

import Y4.C0567d;
import Y4.C0569e;
import Y4.H0;
import Y4.I0;
import com.google.protobuf.A;

/* loaded from: classes2.dex */
public final class a extends c {
    @Override // I4.c
    public final I0 d(I0 i02) {
        C0567d B7;
        if (H4.o.f(i02)) {
            C0569e G2 = i02.G();
            A a2 = (A) G2.j(5);
            if (!a2.f12095a.equals(G2)) {
                a2.d();
                A.e(a2.f12096b, G2);
            }
            B7 = (C0567d) a2;
        } else {
            B7 = C0569e.B();
        }
        for (I0 i03 : this.f3663a) {
            int i7 = 0;
            while (i7 < ((C0569e) B7.f12096b).A()) {
                if (H4.o.e(((C0569e) B7.f12096b).z(i7), i03)) {
                    B7.d();
                    C0569e.x((C0569e) B7.f12096b, i7);
                } else {
                    i7++;
                }
            }
        }
        H0 S6 = I0.S();
        S6.f(B7);
        return (I0) S6.b();
    }
}
