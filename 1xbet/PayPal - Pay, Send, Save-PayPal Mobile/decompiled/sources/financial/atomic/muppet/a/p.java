package financial.atomic.muppet.a;

/* loaded from: classes17.dex */
public final class p extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public java.net.URL f6790a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ financial.atomic.muppet.Page c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(financial.atomic.muppet.Page page, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.c = page;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.cookies(null, this);
    }
}
