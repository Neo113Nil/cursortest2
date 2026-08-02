package Bf;

import Af.C2426a;
import Ef.f;
import Hf.u;
import Hf.z;

/* renamed from: Bf.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2637a implements Kf.a {
    @Override // Kf.a
    public final char a() {
        return '~';
    }

    @Override // Kf.a
    public final int b() {
        return 2;
    }

    @Override // Kf.a
    public final char c() {
        return '~';
    }

    @Override // Kf.a
    public final int d(f fVar, f fVar2) {
        return (fVar.c() < 2 || fVar2.c() < 2) ? 0 : 2;
    }

    @Override // Kf.a
    public final void e(z zVar, z zVar2, int i11) {
        C2426a c2426a = new C2426a();
        u e11 = zVar.e();
        while (e11 != null && e11 != zVar2) {
            u e12 = e11.e();
            c2426a.b(e11);
            e11 = e12;
        }
        zVar.h(c2426a);
    }
}
