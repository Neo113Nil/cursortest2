package financial.atomic.muppet.a;

/* loaded from: classes17.dex */
public final class m extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ financial.atomic.muppet.Page f6784a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(financial.atomic.muppet.Page page, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f6784a = page;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.a.m(this.f6784a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new financial.atomic.muppet.a.m(this.f6784a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        financial.atomic.muppet.Page.access$get_wv(this.f6784a).clearHistory();
        return kotlin.Unit.INSTANCE;
    }
}
