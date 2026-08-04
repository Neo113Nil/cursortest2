package G6;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends p077k6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f3107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f3110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3111e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(e eVar, p065i6.d dVar) {
        super(dVar);
        this.f3110d = eVar;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f3109c = obj;
        this.f3111e |= Integer.MIN_VALUE;
        return this.f3110d.c(null, this);
    }
}
