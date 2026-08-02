package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigLogger$log$2", f = "StatsigLogger.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class StatsigLogger$log$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.statsig.androidsdk.LogEvent $event;
    int label;
    final /* synthetic */ com.statsig.androidsdk.StatsigLogger this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue2;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            concurrentLinkedQueue = this.this$0.events;
            concurrentLinkedQueue.add(this.$event);
            concurrentLinkedQueue2 = this.this$0.events;
            int size = concurrentLinkedQueue2.size();
            if (size > 1000) {
                com.statsig.androidsdk.StatsigLogger statsigLogger = this.this$0;
                for (int i2 = 0; i2 < size - 1000; i2++) {
                    concurrentLinkedQueue3 = statsigLogger.events;
                    concurrentLinkedQueue3.poll();
                }
            }
            if (size >= 50) {
                this.label = 1;
                if (this.this$0.flush(this) == coroutine_suspended) {
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
        return ((com.statsig.androidsdk.StatsigLogger$log$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.statsig.androidsdk.StatsigLogger$log$2(this.this$0, this.$event, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatsigLogger$log$2(com.statsig.androidsdk.StatsigLogger statsigLogger, com.statsig.androidsdk.LogEvent logEvent, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigLogger$log$2> continuation) {
        super(2, continuation);
        this.this$0 = statsigLogger;
        this.$event = logEvent;
    }
}
