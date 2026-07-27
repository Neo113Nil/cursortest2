package Q4;

import n2.AbstractC1341c;

/* loaded from: classes.dex */
public final class w implements M4.a {

    /* renamed from: a, reason: collision with root package name */
    public static final w f2561a = new w();

    /* renamed from: b, reason: collision with root package name */
    public static final N4.f f2562b = e5.g.h("kotlinx.serialization.json.JsonNull", N4.i.f2189c, new N4.e[0], N4.h.f2187e);

    @Override // M4.a
    public final Object a(O4.b decoder) {
        kotlin.jvm.internal.i.e(decoder, "decoder");
        AbstractC1341c.c(decoder);
        if (decoder.e()) {
            throw new R4.i("Expected 'null' literal");
        }
        return v.INSTANCE;
    }

    @Override // M4.a
    public final void b(R4.s sVar, Object obj) {
        v value = (v) obj;
        kotlin.jvm.internal.i.e(value, "value");
        AbstractC1341c.a(sVar);
        sVar.f2711a.i("null");
    }

    @Override // M4.a
    public final N4.e c() {
        return f2562b;
    }
}
