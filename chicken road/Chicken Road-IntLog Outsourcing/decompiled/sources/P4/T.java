package P4;

/* loaded from: classes.dex */
public final class T implements M4.a {

    /* renamed from: a, reason: collision with root package name */
    public static final T f2344a = new T();

    /* renamed from: b, reason: collision with root package name */
    public static final N f2345b = new N("kotlin.String", N4.c.f2173j);

    @Override // M4.a
    public final Object a(O4.b decoder) {
        kotlin.jvm.internal.i.e(decoder, "decoder");
        return decoder.u();
    }

    @Override // M4.a
    public final void b(R4.s sVar, Object obj) {
        String value = (String) obj;
        kotlin.jvm.internal.i.e(value, "value");
        sVar.o(value);
    }

    @Override // M4.a
    public final N4.e c() {
        return f2345b;
    }
}
