package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "Lcom/statsig/androidsdk/StatsigOfflineRequest;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigNetworkImpl$getSavedLogs$2", f = "StatsigNetwork.kt", i = {}, l = {503, 504}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class StatsigNetworkImpl$getSavedLogs$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.util.List<? extends com.statsig.androidsdk.StatsigOfflineRequest>>, java.lang.Object> {
    int label;
    final /* synthetic */ com.statsig.androidsdk.StatsigNetworkImpl this$0;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
    
        if (r7 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0038, code lost:
    
        if (r7 != r0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c A[Catch: Exception -> 0x0084, TryCatch #0 {Exception -> 0x0084, blocks: (B:12:0x005c, B:14:0x006c, B:16:0x0074, B:18:0x0079), top: B:11:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074 A[Catch: Exception -> 0x0084, TryCatch #0 {Exception -> 0x0084, blocks: (B:12:0x005c, B:14:0x006c, B:16:0x0074, B:18:0x0079), top: B:11:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079 A[Catch: Exception -> 0x0084, TRY_LEAVE, TryCatch #0 {Exception -> 0x0084, blocks: (B:12:0x005c, B:14:0x006c, B:16:0x0074, B:18:0x0079), top: B:11:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.statsig.androidsdk.KeyValueStorage keyValueStorage;
        java.lang.String str;
        java.lang.String str2;
        com.statsig.androidsdk.KeyValueStorage keyValueStorage2;
        com.google.gson.Gson gson;
        com.statsig.androidsdk.StatsigPendingRequests statsigPendingRequests;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                keyValueStorage = this.this$0.keyValueStorage;
                str = this.this$0.offlineLogsKeyV2;
                this.label = 1;
                obj = keyValueStorage.readValue("offlinelogs", str, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    str2 = (java.lang.String) obj;
                    if (str2 == null) {
                        return new java.util.ArrayList();
                    }
                    gson = this.this$0.gson;
                    statsigPendingRequests = (com.statsig.androidsdk.StatsigPendingRequests) gson.fromJson(str2, com.statsig.androidsdk.StatsigPendingRequests.class);
                    if ((statsigPendingRequests == null ? statsigPendingRequests.getRequests() : null) != null) {
                        return kotlin.collections.CollectionsKt.emptyList();
                    }
                    return this.this$0.filterValidLogs(statsigPendingRequests.getRequests());
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            gson = this.this$0.gson;
            statsigPendingRequests = (com.statsig.androidsdk.StatsigPendingRequests) gson.fromJson(str2, com.statsig.androidsdk.StatsigPendingRequests.class);
            if ((statsigPendingRequests == null ? statsigPendingRequests.getRequests() : null) != null) {
            }
        } catch (java.lang.Exception unused) {
            return new java.util.ArrayList();
        }
        str2 = (java.lang.String) obj;
        if (str2 == null) {
            keyValueStorage2 = this.this$0.keyValueStorage;
            this.label = 2;
            obj = keyValueStorage2.readValue("offlinelogs", "StatsigNetwork.OFFLINE_LOGS", this);
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.util.List<com.statsig.androidsdk.StatsigOfflineRequest>> continuation) {
        return ((com.statsig.androidsdk.StatsigNetworkImpl$getSavedLogs$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.util.List<? extends com.statsig.androidsdk.StatsigOfflineRequest>> continuation) {
        return invoke2(coroutineScope, (kotlin.coroutines.Continuation<? super java.util.List<com.statsig.androidsdk.StatsigOfflineRequest>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.statsig.androidsdk.StatsigNetworkImpl$getSavedLogs$2(this.this$0, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatsigNetworkImpl$getSavedLogs$2(com.statsig.androidsdk.StatsigNetworkImpl statsigNetworkImpl, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigNetworkImpl$getSavedLogs$2> continuation) {
        super(2, continuation);
        this.this$0 = statsigNetworkImpl;
    }
}
