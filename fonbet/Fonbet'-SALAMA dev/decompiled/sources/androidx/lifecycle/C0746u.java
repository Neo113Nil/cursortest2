package androidx.lifecycle;

/* renamed from: androidx.lifecycle.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0746u {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0740n f9633a;

    /* renamed from: b, reason: collision with root package name */
    public r f9634b;

    public final void a(InterfaceC0745t interfaceC0745t, EnumC0739m enumC0739m) {
        EnumC0740n a2 = enumC0739m.a();
        EnumC0740n enumC0740n = this.f9633a;
        t6.h.e(enumC0740n, "state1");
        if (a2.compareTo(enumC0740n) < 0) {
            enumC0740n = a2;
        }
        this.f9633a = enumC0740n;
        this.f9634b.a(interfaceC0745t, enumC0739m);
        this.f9633a = a2;
    }
}
