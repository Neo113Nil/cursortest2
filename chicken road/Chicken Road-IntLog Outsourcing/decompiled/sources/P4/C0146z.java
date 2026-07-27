package P4;

/* renamed from: P4.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0146z implements M4.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0146z f2416a = new C0146z();

    /* renamed from: b, reason: collision with root package name */
    public static final N f2417b = new N("kotlin.Int", N4.c.f2170g);

    @Override // M4.a
    public final Object a(O4.b decoder) {
        kotlin.jvm.internal.i.e(decoder, "decoder");
        return Integer.valueOf(decoder.q());
    }

    @Override // M4.a
    public final void b(R4.s sVar, Object obj) {
        sVar.j(((Number) obj).intValue());
    }

    @Override // M4.a
    public final N4.e c() {
        return f2417b;
    }
}
