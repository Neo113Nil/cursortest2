package P4;

import f4.C0438o;

/* loaded from: classes.dex */
public final class Z implements M4.a {

    /* renamed from: a, reason: collision with root package name */
    public static final Z f2354a = new Z();

    /* renamed from: b, reason: collision with root package name */
    public static final C0142v f2355b = I.a("kotlin.UInt", C0146z.f2416a);

    @Override // M4.a
    public final Object a(O4.b decoder) {
        kotlin.jvm.internal.i.e(decoder, "decoder");
        return new C0438o(decoder.n(f2355b).q());
    }

    @Override // M4.a
    public final void b(R4.s sVar, Object obj) {
        sVar.h(f2355b).j(((C0438o) obj).f5682a);
    }

    @Override // M4.a
    public final N4.e c() {
        return f2355b;
    }
}
