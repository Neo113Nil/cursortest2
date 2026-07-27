package P4;

/* renamed from: P4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0130i implements M4.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0130i f2377a = new C0130i();

    /* renamed from: b, reason: collision with root package name */
    public static final N f2378b = new N("kotlin.Byte", N4.c.f2166c);

    @Override // M4.a
    public final Object a(O4.b decoder) {
        kotlin.jvm.internal.i.e(decoder, "decoder");
        return Byte.valueOf(decoder.s());
    }

    @Override // M4.a
    public final void b(R4.s sVar, Object obj) {
        sVar.c(((Number) obj).byteValue());
    }

    @Override // M4.a
    public final N4.e c() {
        return f2378b;
    }
}
