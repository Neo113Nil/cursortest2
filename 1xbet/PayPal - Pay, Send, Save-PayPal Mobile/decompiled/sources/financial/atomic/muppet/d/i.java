package financial.atomic.muppet.d;

/* loaded from: classes17.dex */
public final class i extends kotlin.coroutines.jvm.internal.ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public financial.atomic.muppet.impl.Page f6866a;
    public java.util.Iterator b;
    public /* synthetic */ java.lang.Object c;
    public final /* synthetic */ financial.atomic.muppet.impl.Page d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(financial.atomic.muppet.impl.Page page, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.d = page;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return financial.atomic.muppet.impl.Page.setCookie$suspendImpl(this.d, null, this);
    }
}
