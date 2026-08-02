package Hi;

/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f11009a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f11010b;

    d(c cVar, h hVar) {
        this.f11009a = cVar;
        this.f11010b = hVar;
    }

    @Override // Hi.c
    public final String m() {
        String m11 = this.f11009a.m();
        if (m11 != null) {
            return this.f11010b.applyTo(m11);
        }
        return null;
    }

    @Override // Hi.c
    public final String[] n() {
        return this.f11009a.n();
    }
}
