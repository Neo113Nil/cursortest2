package Lf;

import org.joda.time.Duration;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    private static d f17044f;

    /* renamed from: a, reason: collision with root package name */
    private e f17045a;

    /* renamed from: b, reason: collision with root package name */
    private e f17046b;

    /* renamed from: c, reason: collision with root package name */
    private e f17047c;

    /* renamed from: d, reason: collision with root package name */
    private e f17048d;

    /* renamed from: e, reason: collision with root package name */
    private e f17049e;

    public static d a() {
        if (f17044f == null) {
            d dVar = new d();
            l lVar = l.f17058b;
            p pVar = p.f17062b;
            b bVar = b.f17043b;
            f fVar = f.f17054b;
            h hVar = h.f17055b;
            i iVar = i.f17056b;
            dVar.f17045a = new e(new c[]{lVar, pVar, bVar, fVar, hVar, iVar});
            dVar.f17046b = new e(new c[]{n.f17060b, lVar, pVar, bVar, fVar, hVar, iVar});
            k kVar = k.f17057b;
            m mVar = m.f17059b;
            dVar.f17047c = new e(new c[]{kVar, mVar, pVar, hVar, iVar});
            dVar.f17048d = new e(new c[]{kVar, o.f17061b, mVar, pVar, iVar});
            dVar.f17049e = new e(new c[]{mVar, pVar, iVar});
            f17044f = dVar;
        }
        return f17044f;
    }

    public final g b(Object obj) {
        g gVar = (g) this.f17045a.b(obj == null ? null : obj.getClass());
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalArgumentException("No instant converter found for type: ".concat(obj == null ? "null" : obj.getClass().getName()));
    }

    public final j c(Duration duration) {
        j jVar = (j) this.f17048d.b(duration == null ? null : Duration.class);
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalArgumentException("No period converter found for type: ".concat(duration == null ? "null" : Duration.class.getName()));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConverterManager[");
        sb2.append(this.f17045a.c());
        sb2.append(" instant,");
        sb2.append(this.f17046b.c());
        sb2.append(" partial,");
        sb2.append(this.f17047c.c());
        sb2.append(" duration,");
        sb2.append(this.f17048d.c());
        sb2.append(" period,");
        return K00.b.e(this.f17049e.c(), " interval]", sb2);
    }
}
