package z3;

import X2.l;

/* renamed from: z3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1578c extends AbstractC1576a {

    /* renamed from: b, reason: collision with root package name */
    public final int f12465b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1579d f12466c;

    public C1578c(C1579d c1579d, int i2) {
        this.f12466c = c1579d;
        this.f12465b = i2;
        long j2 = i2;
        l lVar = c1579d.f12475g;
        if (lVar == null || C1583h.e(lVar)) {
            lVar = c1579d.c().d(c1579d.f12470b + ".exporter.seen").build();
            c1579d.f12475g = lVar;
        }
        lVar.d(j2, c1579d.f12472d);
    }

    @Override // z3.AbstractC1576a
    public final void a(Q2.a aVar, String str) {
        int i2 = this.f12465b;
        C1579d c1579d = this.f12466c;
        if (str != null) {
            c1579d.b().d(i2, c1579d.f12474f);
        } else {
            c1579d.b().d(i2, c1579d.f12473e);
        }
    }
}
