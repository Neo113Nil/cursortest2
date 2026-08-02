package Z6;

/* loaded from: classes9.dex */
public final class s implements U6.b<r> {

    /* renamed from: a, reason: collision with root package name */
    private final i f35642a;

    /* renamed from: b, reason: collision with root package name */
    private final z f35643b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<String> f35644c;

    public s(b7.b bVar, b7.c cVar, i iVar, z zVar, Pc.a aVar) {
        this.f35642a = iVar;
        this.f35643b = zVar;
        this.f35644c = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        return new r(new a2.d(), new b7.d(), (e) this.f35642a.get(), (y) this.f35643b.get(), this.f35644c);
    }
}
