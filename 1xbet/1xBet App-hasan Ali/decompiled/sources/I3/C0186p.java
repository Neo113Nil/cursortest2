package I3;

import java.lang.reflect.Field;

/* renamed from: I3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0186p extends AbstractC0185o {

    /* renamed from: b, reason: collision with root package name */
    public final H3.q f2672b;

    public C0186p(H3.q qVar, C0187q c0187q) {
        super(c0187q);
        this.f2672b = qVar;
    }

    @Override // I3.AbstractC0185o
    public final Object c() {
        return this.f2672b.k();
    }

    @Override // I3.AbstractC0185o
    public final void e(Object obj, N3.a aVar, C0184n c0184n) {
        Object a5 = c0184n.f.a(aVar);
        if (a5 == null && c0184n.f2669g) {
            return;
        }
        Field field = c0184n.f2665b;
        if (c0184n.f2670h) {
            throw new F3.p(L1.a.m("Cannot set value of 'static final' ", K3.c.d(field, false)));
        }
        field.set(obj, a5);
    }

    @Override // I3.AbstractC0185o
    public final Object d(Object obj) {
        return obj;
    }
}
