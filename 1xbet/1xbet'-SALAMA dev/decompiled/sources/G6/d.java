package G6;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends p077k6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f3077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3078c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, p065i6.d dVar) {
        super(dVar);
        this.f3077b = eVar;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f3076a = obj;
        this.f3078c |= Integer.MIN_VALUE;
        return this.f3077b.c(null, this);
    }
}
