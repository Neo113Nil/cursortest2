package v4;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends Q0.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f17180m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e f17181n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f f17182o;

    public d(f fVar, e eVar) {
        this.f17182o = fVar;
        this.f17181n = eVar;
    }

    @Override // Q0.a
    public final void c0(Object obj, Object obj2) {
        c cVar = (c) obj;
        r rVar = (r) obj2;
        boolean z4 = this.f17180m;
        e eVar = this.f17181n;
        if (!z4) {
            c cVar2 = c.f17177d;
            if (cVar.compareTo(cVar2) > 0) {
                this.f17180m = true;
                eVar.p0(cVar2, this.f17182o.e());
            }
        }
        eVar.p0(cVar, rVar);
    }
}
