package com.moloco.sdk.publisher;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.publisher.Moloco$getBidToken$1", f = "Moloco.kt", i = {}, l = {224}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class Moloco$getBidToken$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.moloco.sdk.publisher.MolocoBidTokenListener $listener;
    final /* synthetic */ com.moloco.sdk.publisher.MediationInfo $mediationInfo;
    final /* synthetic */ com.moloco.sdk.acm.recorder.MetricsRecorder $metricsRecorder;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Moloco$getBidToken$1(com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, com.moloco.sdk.publisher.MediationInfo mediationInfo, com.moloco.sdk.publisher.MolocoBidTokenListener molocoBidTokenListener, kotlin.coroutines.Continuation<? super com.moloco.sdk.publisher.Moloco$getBidToken$1> continuation) {
        super(2, continuation);
        this.$metricsRecorder = metricsRecorder;
        this.$mediationInfo = mediationInfo;
        this.$listener = molocoBidTokenListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.moloco.sdk.publisher.Moloco$getBidToken$1(this.$metricsRecorder, this.$mediationInfo, this.$listener, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.moloco.sdk.internal.services.bidtoken.h bidTokenHandler;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "Moloco", "Handling bid token request", null, false, 12, null);
            bidTokenHandler = com.moloco.sdk.publisher.Moloco.INSTANCE.getBidTokenHandler();
            com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = this.$metricsRecorder;
            com.moloco.sdk.publisher.MediationInfo mediationInfo = this.$mediationInfo;
            com.moloco.sdk.publisher.MolocoBidTokenListener molocoBidTokenListener = this.$listener;
            this.label = 1;
            if (bidTokenHandler.a(metricsRecorder, mediationInfo, molocoBidTokenListener, this) == coroutine_suspended) {
                return coroutine_suspended;
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
        return ((com.moloco.sdk.publisher.Moloco$getBidToken$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }
}
