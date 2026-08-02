package Ve;

import m3.C8060b;

/* loaded from: classes6.dex */
public final class P5 implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final Pc.a f29667a;

    /* renamed from: b, reason: collision with root package name */
    public final B6 f29668b;

    /* renamed from: c, reason: collision with root package name */
    public final Pc.a f29669c;

    /* renamed from: d, reason: collision with root package name */
    public final Pc.a f29670d;

    /* renamed from: e, reason: collision with root package name */
    public final Pc.a f29671e;

    /* renamed from: f, reason: collision with root package name */
    public final Pc.a f29672f;

    /* renamed from: g, reason: collision with root package name */
    public final C4093aa f29673g;

    public P5(Pc.a aVar, B6 b62, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4, Pc.a aVar5, C4093aa c4093aa) {
        this.f29667a = aVar;
        this.f29668b = b62;
        this.f29669c = aVar2;
        this.f29670d = aVar3;
        this.f29671e = aVar4;
        this.f29672f = aVar5;
        this.f29673g = c4093aa;
    }

    @Override // Pc.a
    public final Object get() {
        Vm vm = (Vm) this.f29667a.get();
        Te te2 = (Te) this.f29668b.get();
        C4776y3 c4776y3 = (C4776y3) this.f29669c.get();
        InterfaceC4686uq interfaceC4686uq = (InterfaceC4686uq) this.f29670d.get();
        Y9 y92 = (Y9) this.f29671e.get();
        Vl vl = (Vl) this.f29672f.get();
        C8060b c8060b = this.f29673g.f30656a;
        return new C4463n5(vm, te2, c4776y3, interfaceC4686uq, y92, vl, new Fa());
    }
}
