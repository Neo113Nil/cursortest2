package U;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: n, reason: collision with root package name */
    public final h f5808n;

    /* renamed from: o, reason: collision with root package name */
    public Object f5809o;

    public b(h hVar, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.f5808n = hVar;
        this.f5809o = obj2;
    }

    @Override // U.a, java.util.Map.Entry
    public final Object getValue() {
        return this.f5809o;
    }

    @Override // U.a, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f5809o;
        this.f5809o = obj;
        f fVar = (f) this.f5808n.f5828l;
        e eVar = fVar.f5821n;
        Object obj3 = this.f5806l;
        if (!eVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z3 = fVar.f5815m;
        if (!z3) {
            eVar.put(obj3, obj);
        } else {
            if (!z3) {
                throw new NoSuchElementException();
            }
            o oVar = fVar.f5813k[fVar.f5814l];
            Object obj4 = oVar.f5839k[oVar.f5841m];
            eVar.put(obj3, obj);
            fVar.c(obj4 != null ? obj4.hashCode() : 0, eVar.f5817l, obj4, 0);
        }
        fVar.f5824q = eVar.f5819n;
        return obj2;
    }
}
