package F3;

import I3.AbstractC0189t;

/* loaded from: classes.dex */
public class l extends AbstractC0189t {

    /* renamed from: a, reason: collision with root package name */
    public y f1547a = null;

    @Override // F3.y
    public final Object a(N3.a aVar) {
        y yVar = this.f1547a;
        if (yVar != null) {
            return yVar.a(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        y yVar = this.f1547a;
        if (yVar == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        yVar.b(bVar, obj);
    }

    @Override // I3.AbstractC0189t
    public final y c() {
        y yVar = this.f1547a;
        if (yVar != null) {
            return yVar;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
