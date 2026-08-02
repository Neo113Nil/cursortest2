package S6;

import u8.h;

/* loaded from: classes9.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    private static final u8.h f25936a;

    static {
        h.a aVar = new h.a();
        aVar.registerEncoder(o.class, e.f25885a);
        aVar.registerEncoder(V6.a.class, a.f25872a);
        aVar.registerEncoder(V6.f.class, g.f25890a);
        aVar.registerEncoder(V6.d.class, d.f25882a);
        aVar.registerEncoder(V6.c.class, c.f25879a);
        aVar.registerEncoder(V6.b.class, b.f25877a);
        aVar.registerEncoder(V6.e.class, f.f25887a);
        f25936a = aVar.a();
    }

    private o() {
    }

    public static byte[] a(V6.a aVar) {
        return f25936a.a(aVar);
    }

    public abstract V6.a b();
}
