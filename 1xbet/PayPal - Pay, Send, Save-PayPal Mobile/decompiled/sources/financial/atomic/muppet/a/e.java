package financial.atomic.muppet.a;

/* loaded from: classes17.dex */
public final class e extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f6761a;
    public final /* synthetic */ financial.atomic.muppet.Browser b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(financial.atomic.muppet.Browser browser, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.b = browser;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f6761a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.newPage((financial.atomic.muppet.inter.Page.Factory) null, this);
    }
}
