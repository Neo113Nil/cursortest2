package G6;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends p077k6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f3096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f3098e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, p065i6.d dVar) {
        super(dVar);
        this.f3096c = mVar;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        this.f3094a = obj;
        this.f3095b |= Integer.MIN_VALUE;
        return this.f3096c.r(null, this);
    }
}
