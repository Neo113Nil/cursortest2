package financial.atomic.muppet.b;

/* loaded from: classes17.dex */
public final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6813a;
    public final /* synthetic */ kotlin.jvm.functions.Function2 c;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(kotlin.jvm.functions.Function2 function2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.c = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        financial.atomic.muppet.b.a aVar = new financial.atomic.muppet.b.a(this.c, continuation);
        aVar.getHighResolutionOutputSizeshNQ4ISI = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        financial.atomic.muppet.b.a aVar = new financial.atomic.muppet.b.a(this.c, (kotlin.coroutines.Continuation) obj2);
        aVar.getHighResolutionOutputSizeshNQ4ISI = (kotlinx.coroutines.CoroutineScope) obj;
        return aVar.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6813a;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.functions.Function2 function2 = this.c;
        this.f6813a = 1;
        java.lang.Object invoke = function2.invoke(coroutineScope, this);
        return invoke == coroutine_suspended ? coroutine_suspended : invoke;
    }
}
