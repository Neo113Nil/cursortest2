package Ve;

/* loaded from: classes6.dex */
public final class J5 implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29267a;

    /* renamed from: b, reason: collision with root package name */
    public final B6 f29268b;

    /* renamed from: c, reason: collision with root package name */
    public final Pc.a f29269c;

    /* renamed from: d, reason: collision with root package name */
    public final Pc.a f29270d;

    /* renamed from: e, reason: collision with root package name */
    public final Pc.a f29271e;

    /* renamed from: f, reason: collision with root package name */
    public final Pc.a f29272f;

    public /* synthetic */ J5(B6 b62, Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4, int i11) {
        this.f29267a = i11;
        this.f29268b = b62;
        this.f29269c = aVar;
        this.f29270d = aVar2;
        this.f29271e = aVar3;
        this.f29272f = aVar4;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f29267a) {
            case 0:
                return new C4261g5((Te) this.f29268b.get(), (Vm) this.f29269c.get(), (Ib) this.f29270d.get(), (Y9) this.f29271e.get(), (C4248fl) this.f29272f.get());
            default:
                return new Se((Te) this.f29268b.get(), (Vm) this.f29269c.get(), (Y9) this.f29270d.get(), (Ib) this.f29271e.get(), (C4700vb) ((C4495o8) this.f29272f).get());
        }
    }
}
