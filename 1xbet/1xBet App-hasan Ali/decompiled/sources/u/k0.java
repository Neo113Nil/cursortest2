package u;

/* loaded from: classes.dex */
public final class k0 extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.w f19840l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f19841m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2461h f19842n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2465l f19843o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i4.c f19844p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(kotlin.jvm.internal.w wVar, float f, InterfaceC2461h interfaceC2461h, C2465l c2465l, i4.c cVar) {
        super(1);
        this.f19840l = wVar;
        this.f19841m = f;
        this.f19842n = interfaceC2461h;
        this.f19843o = c2465l;
        this.f19844p = cVar;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        long longValue = ((Number) obj).longValue();
        Object obj2 = this.f19840l.f17624k;
        kotlin.jvm.internal.l.c(obj2);
        AbstractC2453d.h((C2463j) obj2, longValue, this.f19841m, this.f19842n, this.f19843o, this.f19844p);
        return W3.o.f6046a;
    }
}
