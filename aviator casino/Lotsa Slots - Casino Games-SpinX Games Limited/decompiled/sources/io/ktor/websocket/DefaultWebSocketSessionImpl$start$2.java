package io.ktor.websocket;

/* compiled from: DefaultWebSocketSession.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.DefaultWebSocketSessionImpl$start$2", f = "DefaultWebSocketSession.kt", i = {}, l = {165, 166}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class DefaultWebSocketSessionImpl$start$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.Job $incomingJob;
    final /* synthetic */ kotlinx.coroutines.Job $outgoingJob;
    int label;
    final /* synthetic */ io.ktor.websocket.DefaultWebSocketSessionImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultWebSocketSessionImpl$start$2(kotlinx.coroutines.Job job, kotlinx.coroutines.Job job2, io.ktor.websocket.DefaultWebSocketSessionImpl defaultWebSocketSessionImpl, kotlin.coroutines.Continuation<? super io.ktor.websocket.DefaultWebSocketSessionImpl$start$2> continuation) {
        super(2, continuation);
        this.$incomingJob = job;
        this.$outgoingJob = job2;
        this.this$0 = defaultWebSocketSessionImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.websocket.DefaultWebSocketSessionImpl$start$2(this.$incomingJob, this.$outgoingJob, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.websocket.DefaultWebSocketSessionImpl$start$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CompletableJob completableJob;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (this.$incomingJob.join(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                completableJob = this.this$0.context;
                kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) completableJob, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.label = 2;
        if (this.$outgoingJob.join(this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        completableJob = this.this$0.context;
        kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) completableJob, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        return kotlin.Unit.INSTANCE;
    }
}
