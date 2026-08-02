package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigLogger$flush$2", f = "StatsigLogger.kt", i = {0}, l = {99}, m = "invokeSuspend", n = {"eventsCount"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class StatsigLogger$flush$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object L$0;
    int label;
    final /* synthetic */ com.statsig.androidsdk.StatsigLogger this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue;
        boolean z;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue2;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue3;
        com.statsig.androidsdk.StatsigNetwork statsigNetwork;
        java.lang.String str;
        com.google.gson.Gson gson;
        com.statsig.androidsdk.StatsigMetadata statsigMetadata;
        java.util.List<java.lang.String> list;
        com.statsig.androidsdk.StatsigMetadata statsigMetadata2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.this$0.addNonExposedChecksEvent();
            concurrentLinkedQueue = this.this$0.events;
            if (concurrentLinkedQueue.size() != 0) {
                z = this.this$0.loggingEnabled;
                if (z) {
                    concurrentLinkedQueue2 = this.this$0.events;
                    java.lang.String valueOf = java.lang.String.valueOf(concurrentLinkedQueue2.size());
                    concurrentLinkedQueue3 = this.this$0.events;
                    java.util.ArrayList arrayList = new java.util.ArrayList(concurrentLinkedQueue3);
                    this.this$0.events = new java.util.concurrent.ConcurrentLinkedQueue();
                    statsigNetwork = this.this$0.statsigNetwork;
                    str = this.this$0.api;
                    gson = this.this$0.gson;
                    statsigMetadata = this.this$0.statsigMetadata;
                    java.lang.String json = gson.toJson(new com.statsig.androidsdk.LogEventData(arrayList, statsigMetadata));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(json, "");
                    list = this.this$0.fallbackUrls;
                    statsigMetadata2 = this.this$0.statsigMetadata;
                    this.L$0 = valueOf;
                    this.label = 1;
                    if (statsigNetwork.apiPostLogs(str, json, valueOf, list, statsigMetadata2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    return kotlin.Unit.INSTANCE;
                }
            } else {
                return kotlin.Unit.INSTANCE;
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
        return ((com.statsig.androidsdk.StatsigLogger$flush$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.statsig.androidsdk.StatsigLogger$flush$2(this.this$0, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatsigLogger$flush$2(com.statsig.androidsdk.StatsigLogger statsigLogger, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigLogger$flush$2> continuation) {
        super(2, continuation);
        this.this$0 = statsigLogger;
    }
}
