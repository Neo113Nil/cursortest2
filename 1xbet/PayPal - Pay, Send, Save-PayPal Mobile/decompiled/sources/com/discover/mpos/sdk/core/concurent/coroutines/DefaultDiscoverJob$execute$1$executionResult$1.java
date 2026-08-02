package com.discover.mpos.sdk.core.concurent.coroutines;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 1})
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.discover.mpos.sdk.core.concurent.coroutines.DefaultDiscoverJob$execute$1$executionResult$1", f = "CoroutineDiscoverJobFactory.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class DefaultDiscoverJob$execute$1$executionResult$1<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
    int label;
    final /* synthetic */ com.discover.mpos.sdk.core.concurent.coroutines.DefaultDiscoverJob$execute$1 this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            j = this.this$0.this$0.timeout;
            this.label = 1;
            if (kotlinx.coroutines.DelayKt.delay(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        try {
            return this.this$0.$onExecute.invoke();
        } catch (java.lang.Exception e) {
            kotlin.jvm.functions.Function1 function1 = this.this$0.$onError;
            if (function1 != null) {
                function1.invoke(e);
            }
            throw new com.discover.mpos.sdk.core.concurent.exception.JobExecutionException();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj) {
        return ((com.discover.mpos.sdk.core.concurent.coroutines.DefaultDiscoverJob$execute$1$executionResult$1) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "");
        return new com.discover.mpos.sdk.core.concurent.coroutines.DefaultDiscoverJob$execute$1$executionResult$1(this.this$0, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultDiscoverJob$execute$1$executionResult$1(com.discover.mpos.sdk.core.concurent.coroutines.DefaultDiscoverJob$execute$1 defaultDiscoverJob$execute$1, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.this$0 = defaultDiscoverJob$execute$1;
    }
}
