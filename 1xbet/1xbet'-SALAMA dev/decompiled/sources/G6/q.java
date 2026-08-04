package G6;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends p077k6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f3116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f3119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f3120e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, p065i6.d dVar) {
        super(dVar);
        this.f3119d = rVar;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f3117b = obj;
        this.f3118c |= Integer.MIN_VALUE;
        return this.f3119d.c(null, this);
    }
}
