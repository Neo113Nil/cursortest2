package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class z extends A implements r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC0724t f9647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ B f9648f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(B b7, InterfaceC0724t interfaceC0724t, C c3) {
        super(b7, c3);
        this.f9648f = b7;
        this.f9647e = interfaceC0724t;
    }

    @Override // androidx.lifecycle.r
    public final void a(InterfaceC0724t interfaceC0724t, EnumC0718m enumC0718m) {
        InterfaceC0724t interfaceC0724t2 = this.f9647e;
        EnumC0719n enumC0719n = ((C0726v) interfaceC0724t2.getLifecycle()).f9637c;
        if (enumC0719n == EnumC0719n.f9626a) {
            this.f9648f.h(this.f9556a);
            return;
        }
        EnumC0719n enumC0719n2 = null;
        while (enumC0719n2 != enumC0719n) {
            b(e());
            enumC0719n2 = enumC0719n;
            enumC0719n = ((C0726v) interfaceC0724t2.getLifecycle()).f9637c;
        }
    }

    @Override // androidx.lifecycle.A
    public final void c() {
        this.f9647e.getLifecycle().b(this);
    }

    @Override // androidx.lifecycle.A
    public final boolean d(InterfaceC0724t interfaceC0724t) {
        return this.f9647e == interfaceC0724t;
    }

    @Override // androidx.lifecycle.A
    public final boolean e() {
        return ((C0726v) this.f9647e.getLifecycle()).f9637c.compareTo(EnumC0719n.f9629d) >= 0;
    }
}
