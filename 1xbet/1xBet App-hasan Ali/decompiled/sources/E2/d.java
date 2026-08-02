package E2;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final F2.i f1414a;

    /* renamed from: b, reason: collision with root package name */
    public final F2.g f1415b;

    /* renamed from: c, reason: collision with root package name */
    public final G2.e f1416c;

    /* renamed from: d, reason: collision with root package name */
    public final F2.d f1417d;

    public d(F2.i iVar, F2.g gVar, G2.e eVar, F2.d dVar) {
        this.f1414a = iVar;
        this.f1415b = gVar;
        this.f1416c = eVar;
        this.f1417d = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        dVar.getClass();
        return kotlin.jvm.internal.l.a(this.f1414a, dVar.f1414a) && this.f1415b == dVar.f1415b && kotlin.jvm.internal.l.a(this.f1416c, dVar.f1416c) && this.f1417d == dVar.f1417d;
    }

    public final int hashCode() {
        F2.i iVar = this.f1414a;
        int hashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        F2.g gVar = this.f1415b;
        int hashCode2 = (hashCode + (gVar != null ? gVar.hashCode() : 0)) * 28629151;
        G2.e eVar = this.f1416c;
        int hashCode3 = (hashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        F2.d dVar = this.f1417d;
        return (hashCode3 + (dVar != null ? dVar.hashCode() : 0)) * 887503681;
    }
}
