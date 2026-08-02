package financial.atomic.e;

/* loaded from: classes17.dex */
public final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6742a;
    public final /* synthetic */ financial.atomic.transact.service.TransactService b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(financial.atomic.transact.service.TransactService transactService, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = transactService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new financial.atomic.e.c(this.b, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6742a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            financial.atomic.transact.Transact transact = this.b.getTransact();
            if (transact != null) {
                this.f6742a = 1;
                if (financial.atomic.transact.Transact.hide$default(transact, false, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((financial.atomic.e.c) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }
}
