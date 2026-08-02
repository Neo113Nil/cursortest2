package S6;

/* loaded from: classes9.dex */
public final class w implements U6.b<u> {

    /* renamed from: a, reason: collision with root package name */
    private final X6.d f25952a;

    /* renamed from: b, reason: collision with root package name */
    private final Y6.n f25953b;

    /* renamed from: c, reason: collision with root package name */
    private final Y6.p f25954c;

    public w(b7.b bVar, b7.c cVar, X6.d dVar, Y6.n nVar, Y6.p pVar) {
        this.f25952a = dVar;
        this.f25953b = nVar;
        this.f25954c = pVar;
    }

    @Override // Pc.a
    public final Object get() {
        return new u(new a2.d(), new b7.d(), (X6.e) this.f25952a.get(), (Y6.m) this.f25953b.get(), (Y6.o) this.f25954c.get());
    }
}
