package v4;

/* loaded from: classes2.dex */
public final class d extends Q0.a {

    /* renamed from: m, reason: collision with root package name */
    public boolean f17174m = false;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e f17175n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f f17176o;

    public d(f fVar, e eVar) {
        this.f17176o = fVar;
        this.f17175n = eVar;
    }

    @Override // Q0.a
    public final void c0(Object obj, Object obj2) {
        c cVar = (c) obj;
        r rVar = (r) obj2;
        boolean z4 = this.f17174m;
        e eVar = this.f17175n;
        if (!z4) {
            c cVar2 = c.f17171d;
            if (cVar.compareTo(cVar2) > 0) {
                this.f17174m = true;
                eVar.p0(cVar2, this.f17176o.e());
            }
        }
        eVar.p0(cVar, rVar);
    }
}
