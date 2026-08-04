package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0725u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EnumC0719n f9633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f9634b;

    public final void a(InterfaceC0724t interfaceC0724t, EnumC0718m enumC0718m) {
        EnumC0719n enumC0719nA = enumC0718m.a();
        EnumC0719n enumC0719n = this.f9633a;
        t6.h.e(enumC0719n, "state1");
        if (enumC0719nA.compareTo(enumC0719n) < 0) {
            enumC0719n = enumC0719nA;
        }
        this.f9633a = enumC0719n;
        this.f9634b.a(interfaceC0724t, enumC0718m);
        this.f9633a = enumC0719nA;
    }
}
