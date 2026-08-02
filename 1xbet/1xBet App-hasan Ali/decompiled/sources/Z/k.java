package Z;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements i4.c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6203k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i4.c f6204l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i4.c f6205m;

    public /* synthetic */ k(i4.c cVar, i4.c cVar2, int i) {
        this.f6203k = i;
        this.f6204l = cVar;
        this.f6205m = cVar2;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f6203k) {
            case 0:
                this.f6204l.c(obj);
                this.f6205m.c(obj);
                break;
            default:
                this.f6204l.c(obj);
                this.f6205m.c(obj);
                break;
        }
        return W3.o.f6046a;
    }
}
