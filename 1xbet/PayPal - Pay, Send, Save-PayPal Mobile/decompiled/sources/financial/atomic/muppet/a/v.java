package financial.atomic.muppet.a;

/* loaded from: classes17.dex */
public final class v extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ financial.atomic.muppet.Page f6802a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(financial.atomic.muppet.Page page, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f6802a = page;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.a.v(this.f6802a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new financial.atomic.muppet.a.v(this.f6802a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        if (financial.atomic.muppet.Page.access$get_wv(this.f6802a).canGoForward()) {
            financial.atomic.muppet.Page.access$get_wv(this.f6802a).goForward();
        }
        return kotlin.Unit.INSTANCE;
    }
}
