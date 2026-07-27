package H2;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final f f1148a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1149b;

    /* renamed from: c, reason: collision with root package name */
    public final p f1150c;

    public o(f fVar, String str) {
        this(fVar, str, s.f1151b);
    }

    public final void a(String str, Object obj, G2.i iVar) {
        this.f1148a.w(this.f1149b, this.f1150c.f(new l(obj, str)), iVar == null ? null : new a(this, 1, iVar));
    }

    public final void b(m mVar) {
        this.f1148a.i(this.f1149b, mVar == null ? null : new B0.c(this, mVar));
    }

    public o(f fVar, String str, p pVar) {
        this.f1148a = fVar;
        this.f1149b = str;
        this.f1150c = pVar;
    }
}
