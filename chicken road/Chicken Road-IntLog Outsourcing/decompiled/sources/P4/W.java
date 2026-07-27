package P4;

import f4.C0436m;

/* loaded from: classes.dex */
public final class W implements M4.a {

    /* renamed from: a, reason: collision with root package name */
    public static final W f2349a = new W();

    /* renamed from: b, reason: collision with root package name */
    public static final C0142v f2350b = I.a("kotlin.UByte", C0130i.f2377a);

    @Override // M4.a
    public final Object a(O4.b decoder) {
        kotlin.jvm.internal.i.e(decoder, "decoder");
        return new C0436m(decoder.n(f2350b).s());
    }

    @Override // M4.a
    public final void b(R4.s sVar, Object obj) {
        sVar.h(f2350b).c(((C0436m) obj).f5680a);
    }

    @Override // M4.a
    public final N4.e c() {
        return f2350b;
    }
}
