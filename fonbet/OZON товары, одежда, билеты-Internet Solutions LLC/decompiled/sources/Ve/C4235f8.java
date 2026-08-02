package Ve;

/* renamed from: Ve.f8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4235f8 implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31011a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f31012b;

    /* renamed from: c, reason: collision with root package name */
    public final Pc.a f31013c;

    /* renamed from: d, reason: collision with root package name */
    public final Pc.a f31014d;

    /* renamed from: e, reason: collision with root package name */
    public final Jb.e f31015e;

    public /* synthetic */ C4235f8(Jb.e eVar, Pc.a aVar, Pc.a aVar2, Pc.a aVar3, int i11) {
        this.f31011a = i11;
        this.f31015e = eVar;
        this.f31012b = aVar;
        this.f31013c = aVar2;
        this.f31014d = aVar3;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f31011a) {
            case 0:
                return new A7((Te) ((B6) this.f31015e).get(), (Vm) this.f31012b.get(), (Y9) this.f31013c.get(), (Ib) this.f31014d.get());
            default:
                return new C4187dh((InterfaceC4524p8) ((C4609s7) this.f31015e).get(), (Ib) this.f31012b.get(), (Y9) this.f31013c.get(), (Vm) this.f31014d.get());
        }
    }
}
