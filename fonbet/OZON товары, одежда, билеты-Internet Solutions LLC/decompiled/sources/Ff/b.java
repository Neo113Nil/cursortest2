package Ff;

import Ef.f;
import Hf.i;
import Hf.u;
import Hf.y;
import Hf.z;

/* loaded from: classes6.dex */
public abstract class b implements Kf.a {

    /* renamed from: a, reason: collision with root package name */
    private final char f9451a;

    protected b(char c11) {
        this.f9451a = c11;
    }

    @Override // Kf.a
    public final char a() {
        return this.f9451a;
    }

    @Override // Kf.a
    public final int b() {
        return 1;
    }

    @Override // Kf.a
    public final char c() {
        return this.f9451a;
    }

    @Override // Kf.a
    public final int d(f fVar, f fVar2) {
        if ((fVar.a() || fVar2.b()) && fVar2.d() % 3 != 0) {
            if ((fVar2.d() + fVar.d()) % 3 == 0) {
                return 0;
            }
        }
        return (fVar.c() < 2 || fVar2.c() < 2) ? 1 : 2;
    }

    @Override // Kf.a
    public final void e(z zVar, z zVar2, int i11) {
        String.valueOf(this.f9451a);
        u iVar = i11 == 1 ? new i() : new y();
        u e11 = zVar.e();
        while (e11 != null && e11 != zVar2) {
            u e12 = e11.e();
            iVar.b(e11);
            e11 = e12;
        }
        zVar.h(iVar);
    }
}
