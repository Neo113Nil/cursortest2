package com.discover.mpos.sdk.core.concurent.coroutines;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 1})
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.discover.mpos.sdk.core.concurent.coroutines.DefaultDiscoverJob$execute$1", f = "CoroutineDiscoverJobFactory.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class DefaultDiscoverJob$execute$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1 $onError;
    final /* synthetic */ kotlin.jvm.functions.Function0 $onExecute;
    final /* synthetic */ kotlin.jvm.functions.Function1 $onResult;
    int label;
    final /* synthetic */ com.discover.mpos.sdk.core.concurent.coroutines.DefaultDiscoverJob this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.functions.Function1 function1;
        com.discover.mpos.sdk.core.concurent.coroutines.CoroutineManager coroutineManager;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    coroutineManager = this.this$0.coroutineManager;
                    kotlinx.coroutines.CoroutineDispatcher dispatcherIO = coroutineManager.getCoroutineDispatcherProvider().getDispatcherIO();
                    com.discover.mpos.sdk.core.concurent.coroutines.DefaultDiscoverJob$execute$1$executionResult$1 defaultDiscoverJob$execute$1$executionResult$1 = new com.discover.mpos.sdk.core.concurent.coroutines.DefaultDiscoverJob$execute$1$executionResult$1(this, null);
                    this.label = 1;
                    obj = kotlinx.coroutines.BuildersKt.withContext(dispatcherIO, defaultDiscoverJob$execute$1$executionResult$1, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlin.jvm.functions.Function1 function12 = this.$onResult;
                if (function12 != null) {
                    function12.invoke(obj);
                }
            } catch (java.lang.Exception e) {
                if (!(e instanceof com.discover.mpos.sdk.core.concurent.exception.JobExecutionException) && !(e instanceof java.util.concurrent.CancellationException) && (function1 = this.$onError) != null) {
                    function1.invoke(new com.discover.mpos.sdk.core.concurent.exception.JobResultProcessingException(e));
                }
            }
            this.this$0.coroutineJob = null;
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            this.this$0.coroutineJob = null;
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.discover.mpos.sdk.core.concurent.coroutines.DefaultDiscoverJob$execute$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "");
        return new com.discover.mpos.sdk.core.concurent.coroutines.DefaultDiscoverJob$execute$1(this.this$0, this.$onExecute, this.$onError, this.$onResult, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultDiscoverJob$execute$1(com.discover.mpos.sdk.core.concurent.coroutines.DefaultDiscoverJob defaultDiscoverJob, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.this$0 = defaultDiscoverJob;
        this.$onExecute = function0;
        this.$onError = function1;
        this.$onResult = function12;
    }
}
