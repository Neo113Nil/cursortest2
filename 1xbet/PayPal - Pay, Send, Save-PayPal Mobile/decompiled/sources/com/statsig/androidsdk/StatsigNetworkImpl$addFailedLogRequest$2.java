package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigNetworkImpl$addFailedLogRequest$2", f = "StatsigNetwork.kt", i = {}, l = {484, 490, 496}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class StatsigNetworkImpl$addFailedLogRequest$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.statsig.androidsdk.StatsigOfflineRequest $request;
    int label;
    final /* synthetic */ com.statsig.androidsdk.StatsigNetworkImpl this$0;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        if (r1.writeValue("offlinelogs", r5, r9, r8) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0090, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
    
        if (r9 != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        if (r9.removeValue("offlinelogs", r1, r8) != r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.statsig.androidsdk.KeyValueStorage keyValueStorage;
        java.lang.String str;
        com.statsig.androidsdk.KeyValueStorage keyValueStorage2;
        java.lang.String str2;
        com.google.gson.Gson gson;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (java.lang.Exception unused) {
            keyValueStorage = this.this$0.keyValueStorage;
            str = this.this$0.offlineLogsKeyV2;
            this.label = 3;
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.this$0.getSavedLogs(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.List<com.statsig.androidsdk.StatsigOfflineRequest> mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) obj);
        mutableList.add(this.$request);
        java.util.List<com.statsig.androidsdk.StatsigOfflineRequest> filterValidLogs = this.this$0.filterValidLogs(mutableList);
        keyValueStorage2 = this.this$0.keyValueStorage;
        str2 = this.this$0.offlineLogsKeyV2;
        gson = this.this$0.gson;
        java.lang.String json = gson.toJson(new com.statsig.androidsdk.StatsigPendingRequests(filterValidLogs));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(json, "");
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.statsig.androidsdk.StatsigNetworkImpl$addFailedLogRequest$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.statsig.androidsdk.StatsigNetworkImpl$addFailedLogRequest$2(this.this$0, this.$request, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatsigNetworkImpl$addFailedLogRequest$2(com.statsig.androidsdk.StatsigNetworkImpl statsigNetworkImpl, com.statsig.androidsdk.StatsigOfflineRequest statsigOfflineRequest, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigNetworkImpl$addFailedLogRequest$2> continuation) {
        super(2, continuation);
        this.this$0 = statsigNetworkImpl;
        this.$request = statsigOfflineRequest;
    }
}
