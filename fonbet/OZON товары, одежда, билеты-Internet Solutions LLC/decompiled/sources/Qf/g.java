package Qf;

@FunctionalInterface
/* loaded from: classes10.dex */
public interface g {
    void a(int i11, Pf.n nVar);

    default void b(int i11, Pf.n nVar) {
    }

    default void c(Pf.n nVar) {
        Nf.b.d(nVar);
        Pf.n nVar2 = nVar;
        int i11 = 0;
        while (nVar2 != null) {
            Pf.h C11 = nVar2.C();
            int h11 = C11 != null ? C11.h() : 0;
            Pf.n v11 = nVar2.v();
            a(i11, nVar2);
            if (C11 != null && !nVar2.s()) {
                if (h11 == C11.h()) {
                    nVar2 = C11.g(nVar2.K());
                } else if (v11 == null) {
                    i11--;
                    nVar2 = C11;
                } else {
                    nVar2 = v11;
                }
            }
            if (nVar2.h() > 0) {
                nVar2 = nVar2.g(0);
                i11++;
            } else {
                while (nVar2.v() == null && i11 > 0) {
                    b(i11, nVar2);
                    nVar2 = nVar2.C();
                    i11--;
                }
                b(i11, nVar2);
                if (nVar2 == nVar) {
                    return;
                } else {
                    nVar2 = nVar2.v();
                }
            }
        }
    }
}
