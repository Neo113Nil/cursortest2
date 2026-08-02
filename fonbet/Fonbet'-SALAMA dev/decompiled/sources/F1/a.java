package F1;

/* loaded from: classes.dex */
public final class a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final c f2500a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2501b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2502c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2503d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2504e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2505f;

    public a(c cVar, long j, long j3, long j7, long j8, long j9) {
        this.f2500a = cVar;
        this.f2501b = j;
        this.f2502c = j3;
        this.f2503d = j7;
        this.f2504e = j8;
        this.f2505f = j9;
    }

    @Override // F1.s
    public final boolean d() {
        return true;
    }

    @Override // F1.s
    public final r h(long j) {
        t tVar = new t(j, b.a(this.f2500a.c(j), 0L, this.f2502c, this.f2503d, this.f2504e, this.f2505f));
        return new r(tVar, tVar);
    }

    @Override // F1.s
    public final long i() {
        return this.f2501b;
    }
}
