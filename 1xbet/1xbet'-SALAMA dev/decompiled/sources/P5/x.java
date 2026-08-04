package P5;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends p077k6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0402n f5711c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C0402n c0402n, p065i6.d dVar) {
        super(dVar);
        this.f5711c = c0402n;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f5709a = obj;
        this.f5710b |= Integer.MIN_VALUE;
        return this.f5711c.c(null, this);
    }
}
