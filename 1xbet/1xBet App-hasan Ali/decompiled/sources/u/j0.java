package u;

/* loaded from: classes.dex */
public final class j0 extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.w f19833l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f19834m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2461h f19835n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC2470q f19836o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C2465l f19837p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f19838q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i4.c f19839r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(kotlin.jvm.internal.w wVar, Object obj, InterfaceC2461h interfaceC2461h, AbstractC2470q abstractC2470q, C2465l c2465l, float f, i4.c cVar) {
        super(1);
        this.f19833l = wVar;
        this.f19834m = obj;
        this.f19835n = interfaceC2461h;
        this.f19836o = abstractC2470q;
        this.f19837p = c2465l;
        this.f19838q = f;
        this.f19839r = cVar;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        long longValue = ((Number) obj).longValue();
        InterfaceC2461h interfaceC2461h = this.f19835n;
        A0 e3 = interfaceC2461h.e();
        Object f = interfaceC2461h.f();
        I.C c5 = new I.C(this.f19837p, 1);
        C2463j c2463j = new C2463j(this.f19834m, e3, this.f19836o, longValue, f, longValue, c5);
        AbstractC2453d.h(c2463j, longValue, this.f19838q, this.f19835n, this.f19837p, this.f19839r);
        this.f19833l.f17624k = c2463j;
        return W3.o.f6046a;
    }
}
