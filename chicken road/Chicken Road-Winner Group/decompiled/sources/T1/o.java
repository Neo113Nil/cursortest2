package T1;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final f f1470a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1471b;

    /* renamed from: c, reason: collision with root package name */
    public final p f1472c;

    public o(f fVar, String str) {
        this(fVar, str, s.f1473b);
    }

    public final void a(String str, Object obj, S1.i iVar) {
        this.f1470a.i(this.f1471b, this.f1472c.c(new l(obj, str)), iVar == null ? null : new a(this, 1, iVar));
    }

    public final void b(m mVar) {
        this.f1470a.h(this.f1471b, mVar == null ? null : new a1.e(this, mVar, 28, false));
    }

    public o(f fVar, String str, p pVar) {
        this.f1470a = fVar;
        this.f1471b = str;
        this.f1472c = pVar;
    }
}
