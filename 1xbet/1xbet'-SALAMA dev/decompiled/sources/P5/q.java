package P5;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends p077k6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G6.e f5681c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(G6.e eVar, p065i6.d dVar) {
        super(dVar);
        this.f5681c = eVar;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f5679a = obj;
        this.f5680b |= Integer.MIN_VALUE;
        return this.f5681c.c(null, this);
    }
}
