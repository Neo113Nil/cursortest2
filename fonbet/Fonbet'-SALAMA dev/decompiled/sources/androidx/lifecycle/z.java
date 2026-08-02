package androidx.lifecycle;

/* loaded from: classes.dex */
public final class z extends A implements r {

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0745t f9647e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ B f9648f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(B b7, InterfaceC0745t interfaceC0745t, C c3) {
        super(b7, c3);
        this.f9648f = b7;
        this.f9647e = interfaceC0745t;
    }

    @Override // androidx.lifecycle.r
    public final void a(InterfaceC0745t interfaceC0745t, EnumC0739m enumC0739m) {
        InterfaceC0745t interfaceC0745t2 = this.f9647e;
        EnumC0740n enumC0740n = ((C0747v) interfaceC0745t2.getLifecycle()).f9637c;
        if (enumC0740n == EnumC0740n.f9626a) {
            this.f9648f.h(this.f9556a);
            return;
        }
        EnumC0740n enumC0740n2 = null;
        while (enumC0740n2 != enumC0740n) {
            b(e());
            enumC0740n2 = enumC0740n;
            enumC0740n = ((C0747v) interfaceC0745t2.getLifecycle()).f9637c;
        }
    }

    @Override // androidx.lifecycle.A
    public final void c() {
        this.f9647e.getLifecycle().b(this);
    }

    @Override // androidx.lifecycle.A
    public final boolean d(InterfaceC0745t interfaceC0745t) {
        return this.f9647e == interfaceC0745t;
    }

    @Override // androidx.lifecycle.A
    public final boolean e() {
        return ((C0747v) this.f9647e.getLifecycle()).f9637c.compareTo(EnumC0740n.f9629d) >= 0;
    }
}
