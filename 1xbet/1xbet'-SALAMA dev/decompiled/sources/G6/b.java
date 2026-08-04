package G6;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends p077k6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public F6.p f3070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f3072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3073d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, p077k6.c cVar2) {
        super(cVar2);
        this.f3072c = cVar;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f3071b = obj;
        this.f3073d |= Integer.MIN_VALUE;
        return this.f3072c.a(null, this);
    }
}
