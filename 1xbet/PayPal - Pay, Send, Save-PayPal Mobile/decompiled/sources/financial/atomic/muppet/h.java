package financial.atomic.muppet;

/* loaded from: classes17.dex */
public final class h extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.CompletableDeferred f6870a;

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new financial.atomic.muppet.h(this.f6870a, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.ResultKt.throwOnFailure(obj);
        this.f6870a.complete(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new financial.atomic.muppet.h(this.f6870a, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(kotlinx.coroutines.CompletableDeferred completableDeferred, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f6870a = completableDeferred;
    }
}
