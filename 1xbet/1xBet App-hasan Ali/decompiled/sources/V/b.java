package V;

import X3.i;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends i implements S.b {

    /* renamed from: n, reason: collision with root package name */
    public static final b f5917n;

    /* renamed from: k, reason: collision with root package name */
    public final Object f5918k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f5919l;

    /* renamed from: m, reason: collision with root package name */
    public final U.c f5920m;

    static {
        W.b bVar = W.b.f5999a;
        f5917n = new b(bVar, bVar, U.c.f5810m);
    }

    public b(Object obj, Object obj2, U.c cVar) {
        this.f5918k = obj;
        this.f5919l = obj2;
        this.f5920m = cVar;
    }

    @Override // X3.AbstractC0441a
    public final int c() {
        U.c cVar = this.f5920m;
        cVar.getClass();
        return cVar.f5812l;
    }

    @Override // X3.AbstractC0441a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f5920m.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new c(this.f5918k, this.f5920m);
    }
}
