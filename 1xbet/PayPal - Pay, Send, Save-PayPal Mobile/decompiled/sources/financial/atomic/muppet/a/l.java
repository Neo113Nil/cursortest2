package financial.atomic.muppet.a;

/* loaded from: classes17.dex */
public final class l extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ financial.atomic.muppet.Page f6781a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(financial.atomic.muppet.Page page, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f6781a = page;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.a.l(this.f6781a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new financial.atomic.muppet.a.l(this.f6781a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        financial.atomic.muppet.Page.access$get_wv(this.f6781a).clearCache(true);
        financial.atomic.muppet.Page.access$get_wv(this.f6781a).clearFormData();
        financial.atomic.muppet.Page.access$get_wv(this.f6781a).clearHistory();
        return kotlin.Unit.INSTANCE;
    }
}
