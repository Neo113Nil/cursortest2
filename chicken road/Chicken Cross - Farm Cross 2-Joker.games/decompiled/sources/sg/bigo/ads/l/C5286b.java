package sg.bigo.ads.l;

import sg.bigo.ads.N.j;
import sg.bigo.ads.h.H2;
import sg.bigo.ads.h.u2;

/* renamed from: sg.bigo.ads.l.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5286b implements j {

    /* renamed from: a, reason: collision with root package name */
    public final j f13051a;
    public final /* synthetic */ C5289e b;

    public C5286b(C5289e c5289e, u2 u2Var) {
        this.b = c5289e;
        this.f13051a = u2Var;
    }

    @Override // sg.bigo.ads.N.j
    public final void a(int i, int i2) {
        C5289e c5289e = this.b;
        if (c5289e.g != null && !c5289e.a()) {
            long j = i2 - i;
            H2 h2 = (H2) this.b.g;
            if (h2.g != null && h2.d0() != 14) {
                h2.g.a(j);
            }
        }
        j jVar = this.f13051a;
        if (jVar != null) {
            jVar.a(i, i2);
        }
    }
}
