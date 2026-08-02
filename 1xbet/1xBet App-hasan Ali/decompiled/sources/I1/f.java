package I1;

import A0.P0;
import c.C0519F;
import s4.M;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public m2.g f2575a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2576b;

    public final void a() {
        m2.g gVar = this.f2575a;
        if (gVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!this.f2576b) {
            gVar.h(this, null);
        }
        g gVar2 = (g) gVar.f17995m;
        gVar2.getClass();
        if (equals(gVar2.f2583h) && -1 == gVar2.f2582g) {
            d dVar = gVar2.f;
            if (dVar == null) {
                dVar = gVar2.c(-1);
            }
            gVar2.f = null;
            gVar2.f2582g = 0;
            gVar2.f2583h = null;
            if (dVar == null) {
                ((C0519F) ((P0) gVar.f17994l).f373a).f7307a.run();
            } else {
                dVar.b();
            }
            h hVar = h.f2589n;
            M m5 = gVar2.f2577a;
            m5.getClass();
            m5.j(null, hVar);
        }
        this.f2576b = false;
    }

    public void b(boolean z3) {
    }
}
