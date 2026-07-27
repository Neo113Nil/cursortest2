package Q4;

import n2.AbstractC1341c;

/* loaded from: classes.dex */
public final class D implements M4.a {

    /* renamed from: a, reason: collision with root package name */
    public static final D f2496a = new D();

    /* renamed from: b, reason: collision with root package name */
    public static final N4.f f2497b = e5.g.h("kotlinx.serialization.json.JsonPrimitive", N4.c.f2173j, new N4.e[0], N4.h.f2187e);

    @Override // M4.a
    public final Object a(O4.b decoder) {
        kotlin.jvm.internal.i.e(decoder, "decoder");
        l z02 = AbstractC1341c.c(decoder).z0();
        if (z02 instanceof C) {
            return (C) z02;
        }
        throw R4.m.b(-1, "Unexpected JSON element, expected JsonPrimitive, had " + kotlin.jvm.internal.t.a(z02.getClass()), z02.toString());
    }

    @Override // M4.a
    public final void b(R4.s sVar, Object obj) {
        C value = (C) obj;
        kotlin.jvm.internal.i.e(value, "value");
        AbstractC1341c.a(sVar);
        if (value instanceof v) {
            sVar.m(w.f2561a, v.INSTANCE);
        } else {
            sVar.m(t.f2558a, (s) value);
        }
    }

    @Override // M4.a
    public final N4.e c() {
        return f2497b;
    }
}
