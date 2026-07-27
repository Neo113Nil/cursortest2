package P4;

/* renamed from: P4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0127f implements M4.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0127f f2368a = new C0127f();

    /* renamed from: b, reason: collision with root package name */
    public static final N f2369b = new N("kotlin.Boolean", N4.c.f2165b);

    @Override // M4.a
    public final Object a(O4.b decoder) {
        kotlin.jvm.internal.i.e(decoder, "decoder");
        return Boolean.valueOf(decoder.d());
    }

    @Override // M4.a
    public final void b(R4.s sVar, Object obj) {
        sVar.b(((Boolean) obj).booleanValue());
    }

    @Override // M4.a
    public final N4.e c() {
        return f2369b;
    }
}
