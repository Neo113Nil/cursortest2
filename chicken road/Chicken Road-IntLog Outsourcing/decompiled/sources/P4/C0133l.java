package P4;

/* renamed from: P4.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0133l implements M4.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0133l f2382a = new C0133l();

    /* renamed from: b, reason: collision with root package name */
    public static final N f2383b = new N("kotlin.Char", N4.c.f2167d);

    @Override // M4.a
    public final Object a(O4.b decoder) {
        kotlin.jvm.internal.i.e(decoder, "decoder");
        return Character.valueOf(decoder.h());
    }

    @Override // M4.a
    public final void b(R4.s sVar, Object obj) {
        sVar.d(((Character) obj).charValue());
    }

    @Override // M4.a
    public final N4.e c() {
        return f2383b;
    }
}
