package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigNetworkImpl$pollForChanges$1", f = "StatsigNetwork.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2}, l = {357, 773, com.knotapi.knot.utilities.Constants.ID_KROGER}, m = "invokeSuspend", n = {"$this$flow", "userCopy", "userCacheKey", "metadataCopy", "sinceTime", "previousDerivedFields", "fullChecksum", "boundedUpdateIntervalMs", "$this$flow", "userCopy", "userCacheKey", "metadataCopy", "sinceTime", "previousDerivedFields", "fullChecksum", "boundedUpdateIntervalMs", "$this$flow", "userCopy", "userCacheKey", "metadataCopy", "sinceTime", "previousDerivedFields", "fullChecksum", "boundedUpdateIntervalMs"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0"})
/* loaded from: classes16.dex */
final class StatsigNetworkImpl$pollForChanges$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $api;
    final /* synthetic */ java.util.List<java.lang.String> $fallbackUrls;
    final /* synthetic */ com.statsig.androidsdk.StatsigMetadata $metadata;
    final /* synthetic */ long $updateIntervalMs;
    final /* synthetic */ com.statsig.androidsdk.StatsigUser $user;
    long J$0;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    java.lang.Object L$6;
    java.lang.Object L$7;
    int label;
    final /* synthetic */ com.statsig.androidsdk.StatsigNetworkImpl this$0;

    /* JADX WARN: Can't wrap try/catch for region: R(10:16|17|18|19|20|21|22|23|24|(1:35)(5:26|27|28|29|(2:32|33)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(11:31|5|(1:7)|8|9|10|11|12|13|14|(10:16|17|18|19|20|21|22|23|24|(1:35)(5:26|27|28|29|(2:32|33)(0)))(1:47)) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x026b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0272, code lost:
    
        r14 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x026d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x027e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x027f, code lost:
    
        r3 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0281, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0284, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0285, code lost:
    
        r3 = r18;
        r7 = r20;
     */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x0082: MOVE (r5 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]), block:B:67:0x0080 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01a7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0146 -> B:5:0x0147). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        com.statsig.androidsdk.StatsigOptions statsigOptions;
        java.lang.String str;
        com.statsig.androidsdk.StatsigMetadata copy;
        com.statsig.androidsdk.Store store;
        java.lang.Long lastUpdateTime;
        com.statsig.androidsdk.Store store2;
        com.statsig.androidsdk.Store store3;
        java.lang.String fullChecksum;
        com.statsig.androidsdk.StatsigUser statsigUser;
        java.lang.String str2;
        long max;
        com.statsig.androidsdk.StatsigMetadata statsigMetadata;
        java.util.Map<java.lang.String, java.lang.String> map;
        int i;
        kotlinx.coroutines.flow.FlowCollector flowCollector2;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Exception e;
        kotlinx.coroutines.flow.FlowCollector flowCollector3;
        java.lang.String str3;
        com.statsig.androidsdk.StatsigMetadata statsigMetadata2;
        java.lang.Long l;
        java.util.Map<java.lang.String, java.lang.String> map2;
        java.lang.String str4;
        com.statsig.androidsdk.StatsigUser statsigUser2;
        java.lang.Object obj4;
        com.statsig.androidsdk.StatsigUser statsigUser3;
        com.statsig.androidsdk.StatsigNetworkImpl$pollForChanges$1 statsigNetworkImpl$pollForChanges$1;
        java.util.Map map3;
        okhttp3.Call call;
        java.util.Map map4;
        com.google.gson.Gson gson;
        com.statsig.androidsdk.StatsigOptions statsigOptions2;
        java.lang.String str5;
        java.lang.String stableID;
        kotlinx.coroutines.flow.FlowCollector flowCollector4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        java.lang.Object obj5 = null;
        int i3 = 1;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            com.statsig.androidsdk.StatsigUser copyForEvaluation$android_sdk_release = this.$user.getCopyForEvaluation$android_sdk_release();
            statsigOptions = this.this$0.options;
            kotlin.jvm.functions.Function2<java.lang.String, com.statsig.androidsdk.StatsigUser, java.lang.String> customCacheKey = statsigOptions.getCustomCacheKey();
            str = this.this$0.sdkKey;
            java.lang.String invoke = customCacheKey.invoke(str, copyForEvaluation$android_sdk_release);
            copy = r9.copy((r28 & 1) != 0 ? r9.stableID : null, (r28 & 2) != 0 ? r9.sdkType : null, (r28 & 4) != 0 ? r9.sdkVersion : null, (r28 & 8) != 0 ? r9.sessionID : null, (r28 & 16) != 0 ? r9.appIdentifier : null, (r28 & 32) != 0 ? r9.appVersion : null, (r28 & 64) != 0 ? r9.deviceManufacturer : null, (r28 & 128) != 0 ? r9.deviceModel : null, (r28 & 256) != 0 ? r9.deviceOS : null, (r28 & 512) != 0 ? r9.locale : null, (r28 & 1024) != 0 ? r9.language : null, (r28 & 2048) != 0 ? r9.systemVersion : null, (r28 & 4096) != 0 ? this.$metadata.systemName : null);
            store = this.this$0.store;
            lastUpdateTime = store.getLastUpdateTime(this.$user);
            store2 = this.this$0.store;
            java.util.Map<java.lang.String, java.lang.String> previousDerivedFields = store2.getPreviousDerivedFields(this.$user);
            store3 = this.this$0.store;
            fullChecksum = store3.getFullChecksum(this.$user);
            statsigUser = copyForEvaluation$android_sdk_release;
            str2 = invoke;
            max = java.lang.Math.max(this.$updateIntervalMs, 60000L);
            statsigMetadata = copy;
            map = previousDerivedFields;
            this.L$0 = flowCollector;
            this.L$1 = statsigUser;
            this.L$2 = str2;
            this.L$3 = statsigMetadata;
            this.L$4 = lastUpdateTime;
            this.L$5 = map;
            this.L$6 = fullChecksum;
            this.L$7 = obj5;
            this.J$0 = max;
            this.label = i3;
            if (kotlinx.coroutines.DelayKt.delay(max, this) != coroutine_suspended) {
            }
        } else if (i2 != 1) {
            try {
            } catch (java.lang.Exception e2) {
                e = e2;
                i = 1;
                flowCollector3 = flowCollector4;
                obj2 = coroutine_suspended;
                obj3 = null;
                str2 = str3;
                statsigUser = statsigUser3;
                flowCollector2 = flowCollector3;
                com.statsig.androidsdk.StatsigMetadata statsigMetadata3 = statsigMetadata2;
                fullChecksum = str4;
                map = map2;
                lastUpdateTime = l;
                statsigMetadata = statsigMetadata3;
                flowCollector = flowCollector2;
                i3 = i;
                java.lang.Object obj6 = obj2;
                obj5 = obj3;
                coroutine_suspended = obj6;
                this.L$0 = flowCollector;
                this.L$1 = statsigUser;
                this.L$2 = str2;
                this.L$3 = statsigMetadata;
                this.L$4 = lastUpdateTime;
                this.L$5 = map;
                this.L$6 = fullChecksum;
                this.L$7 = obj5;
                this.J$0 = max;
                this.label = i3;
                if (kotlinx.coroutines.DelayKt.delay(max, this) != coroutine_suspended) {
                }
            }
            if (i2 == 2) {
                max = this.J$0;
                kotlinx.coroutines.flow.FlowCollector flowCollector5 = (kotlinx.coroutines.flow.FlowCollector) this.L$7;
                str4 = (java.lang.String) this.L$6;
                map2 = (java.util.Map) this.L$5;
                l = (java.lang.Long) this.L$4;
                statsigMetadata2 = (com.statsig.androidsdk.StatsigMetadata) this.L$3;
                str3 = (java.lang.String) this.L$2;
                com.statsig.androidsdk.StatsigUser statsigUser4 = (com.statsig.androidsdk.StatsigUser) this.L$1;
                kotlinx.coroutines.flow.FlowCollector flowCollector6 = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                obj2 = coroutine_suspended;
                i = 1;
                statsigUser2 = statsigUser4;
                flowCollector3 = flowCollector6;
                flowCollector2 = flowCollector5;
                obj4 = obj;
                statsigNetworkImpl$pollForChanges$1 = this;
                this.L$0 = flowCollector3;
                this.L$1 = statsigUser2;
                this.L$2 = str3;
                this.L$3 = statsigMetadata2;
                this.L$4 = l;
                this.L$5 = map2;
                this.L$6 = str4;
                obj3 = null;
                this.L$7 = null;
                this.J$0 = max;
                this.label = 3;
                if (flowCollector2.emit(obj4, statsigNetworkImpl$pollForChanges$1) != obj2) {
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                max = this.J$0;
                str4 = (java.lang.String) this.L$6;
                map2 = (java.util.Map) this.L$5;
                l = (java.lang.Long) this.L$4;
                statsigMetadata2 = (com.statsig.androidsdk.StatsigMetadata) this.L$3;
                str3 = (java.lang.String) this.L$2;
                com.statsig.androidsdk.StatsigUser statsigUser5 = (com.statsig.androidsdk.StatsigUser) this.L$1;
                kotlinx.coroutines.flow.FlowCollector flowCollector7 = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                i = 1;
                flowCollector3 = flowCollector7;
                obj2 = coroutine_suspended;
                obj3 = null;
                flowCollector = flowCollector3;
                str2 = str3;
                statsigUser = statsigUser5;
                com.statsig.androidsdk.StatsigMetadata statsigMetadata4 = statsigMetadata2;
                fullChecksum = str4;
                map = map2;
                lastUpdateTime = l;
                statsigMetadata = statsigMetadata4;
                i3 = i;
                java.lang.Object obj62 = obj2;
                obj5 = obj3;
                coroutine_suspended = obj62;
                this.L$0 = flowCollector;
                this.L$1 = statsigUser;
                this.L$2 = str2;
                this.L$3 = statsigMetadata;
                this.L$4 = lastUpdateTime;
                this.L$5 = map;
                this.L$6 = fullChecksum;
                this.L$7 = obj5;
                this.J$0 = max;
                this.label = i3;
                if (kotlinx.coroutines.DelayKt.delay(max, this) != coroutine_suspended) {
                    flowCollector2 = flowCollector;
                    java.lang.Object obj7 = coroutine_suspended;
                    long j = max;
                    i = 1;
                    java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("user", statsigUser), kotlin.TuplesKt.to("statsigMetadata", statsigMetadata), kotlin.TuplesKt.to("lastSyncTimeForUser", lastUpdateTime), kotlin.TuplesKt.to("sinceTime", lastUpdateTime), kotlin.TuplesKt.to("hash", com.statsig.androidsdk.HashAlgorithm.DJB2.getValue()), kotlin.TuplesKt.to("previousDerivedFields", map), kotlin.TuplesKt.to("full_checksum", fullChecksum));
                    map3 = this.this$0.initializeRequestsMap;
                    call = (okhttp3.Call) map3.get(str2);
                    if (call != null) {
                        call.cancel();
                    }
                    map4 = this.this$0.initializeRequestsMap;
                    map4.remove(str2);
                    com.statsig.androidsdk.StatsigNetworkImpl statsigNetworkImpl = this.this$0;
                    com.statsig.androidsdk.UrlConfig urlConfig = new com.statsig.androidsdk.UrlConfig(com.statsig.androidsdk.Endpoint.Initialize, this.$api, this.$fallbackUrls);
                    gson = this.this$0.gson;
                    java.lang.String json = gson.toJson(mapOf);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(json, "");
                    statsigOptions2 = this.this$0.options;
                    kotlin.jvm.functions.Function2<java.lang.String, com.statsig.androidsdk.StatsigUser, java.lang.String> customCacheKey2 = statsigOptions2.getCustomCacheKey();
                    str5 = this.this$0.sdkKey;
                    java.lang.String invoke2 = customCacheKey2.invoke(str5, statsigUser);
                    stableID = statsigMetadata.getStableID();
                    kotlinx.coroutines.CoroutineDispatcher io2 = statsigNetworkImpl.dispatcherProvider.getIo();
                    com.statsig.androidsdk.StatsigNetworkImpl$pollForChanges$1$invokeSuspend$$inlined$postRequest$default$1 statsigNetworkImpl$pollForChanges$1$invokeSuspend$$inlined$postRequest$default$1 = new com.statsig.androidsdk.StatsigNetworkImpl$pollForChanges$1$invokeSuspend$$inlined$postRequest$default$1(urlConfig, statsigNetworkImpl, null, json, null, stableID, invoke2, null, null, 0, null);
                    com.statsig.androidsdk.StatsigNetworkImpl$pollForChanges$1 statsigNetworkImpl$pollForChanges$12 = this;
                    this.L$0 = flowCollector2;
                    this.L$1 = statsigUser;
                    this.L$2 = str2;
                    this.L$3 = statsigMetadata;
                    this.L$4 = lastUpdateTime;
                    this.L$5 = map;
                    this.L$6 = fullChecksum;
                    this.L$7 = flowCollector2;
                    max = j;
                    this.J$0 = max;
                    this.label = 2;
                    obj4 = kotlinx.coroutines.BuildersKt.withContext(io2, statsigNetworkImpl$pollForChanges$1$invokeSuspend$$inlined$postRequest$default$1, statsigNetworkImpl$pollForChanges$12);
                    obj2 = obj7;
                    if (obj4 != obj2) {
                        return obj2;
                    }
                    flowCollector3 = flowCollector2;
                    com.statsig.androidsdk.StatsigUser statsigUser6 = statsigUser;
                    str3 = str2;
                    statsigUser2 = statsigUser6;
                    java.lang.Long l2 = lastUpdateTime;
                    map2 = map;
                    str4 = fullChecksum;
                    statsigMetadata2 = statsigMetadata;
                    l = l2;
                    try {
                    } catch (java.lang.Exception e3) {
                        e = e3;
                        obj3 = null;
                    }
                    statsigNetworkImpl$pollForChanges$1 = this;
                    this.L$0 = flowCollector3;
                    this.L$1 = statsigUser2;
                    this.L$2 = str3;
                    this.L$3 = statsigMetadata2;
                    this.L$4 = l;
                    this.L$5 = map2;
                    this.L$6 = str4;
                    obj3 = null;
                    this.L$7 = null;
                    this.J$0 = max;
                    this.label = 3;
                    if (flowCollector2.emit(obj4, statsigNetworkImpl$pollForChanges$1) != obj2) {
                        return obj2;
                    }
                    statsigUser5 = statsigUser2;
                    flowCollector = flowCollector3;
                    str2 = str3;
                    statsigUser = statsigUser5;
                    com.statsig.androidsdk.StatsigMetadata statsigMetadata42 = statsigMetadata2;
                    fullChecksum = str4;
                    map = map2;
                    lastUpdateTime = l;
                    statsigMetadata = statsigMetadata42;
                    i3 = i;
                    java.lang.Object obj622 = obj2;
                    obj5 = obj3;
                    coroutine_suspended = obj622;
                    this.L$0 = flowCollector;
                    this.L$1 = statsigUser;
                    this.L$2 = str2;
                    this.L$3 = statsigMetadata;
                    this.L$4 = lastUpdateTime;
                    this.L$5 = map;
                    this.L$6 = fullChecksum;
                    this.L$7 = obj5;
                    this.J$0 = max;
                    this.label = i3;
                    if (kotlinx.coroutines.DelayKt.delay(max, this) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            max = this.J$0;
            java.lang.String str6 = (java.lang.String) this.L$6;
            map = (java.util.Map) this.L$5;
            lastUpdateTime = (java.lang.Long) this.L$4;
            statsigMetadata = (com.statsig.androidsdk.StatsigMetadata) this.L$3;
            java.lang.String str7 = (java.lang.String) this.L$2;
            statsigUser = (com.statsig.androidsdk.StatsigUser) this.L$1;
            flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            str2 = str7;
            fullChecksum = str6;
            java.lang.Object obj72 = coroutine_suspended;
            long j2 = max;
            i = 1;
            java.util.Map mapOf2 = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("user", statsigUser), kotlin.TuplesKt.to("statsigMetadata", statsigMetadata), kotlin.TuplesKt.to("lastSyncTimeForUser", lastUpdateTime), kotlin.TuplesKt.to("sinceTime", lastUpdateTime), kotlin.TuplesKt.to("hash", com.statsig.androidsdk.HashAlgorithm.DJB2.getValue()), kotlin.TuplesKt.to("previousDerivedFields", map), kotlin.TuplesKt.to("full_checksum", fullChecksum));
            map3 = this.this$0.initializeRequestsMap;
            call = (okhttp3.Call) map3.get(str2);
            if (call != null) {
            }
            map4 = this.this$0.initializeRequestsMap;
            map4.remove(str2);
            com.statsig.androidsdk.StatsigNetworkImpl statsigNetworkImpl2 = this.this$0;
            com.statsig.androidsdk.UrlConfig urlConfig2 = new com.statsig.androidsdk.UrlConfig(com.statsig.androidsdk.Endpoint.Initialize, this.$api, this.$fallbackUrls);
            gson = this.this$0.gson;
            java.lang.String json2 = gson.toJson(mapOf2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(json2, "");
            statsigOptions2 = this.this$0.options;
            kotlin.jvm.functions.Function2<java.lang.String, com.statsig.androidsdk.StatsigUser, java.lang.String> customCacheKey22 = statsigOptions2.getCustomCacheKey();
            str5 = this.this$0.sdkKey;
            java.lang.String invoke22 = customCacheKey22.invoke(str5, statsigUser);
            stableID = statsigMetadata.getStableID();
            kotlinx.coroutines.CoroutineDispatcher io22 = statsigNetworkImpl2.dispatcherProvider.getIo();
            com.statsig.androidsdk.StatsigNetworkImpl$pollForChanges$1$invokeSuspend$$inlined$postRequest$default$1 statsigNetworkImpl$pollForChanges$1$invokeSuspend$$inlined$postRequest$default$12 = new com.statsig.androidsdk.StatsigNetworkImpl$pollForChanges$1$invokeSuspend$$inlined$postRequest$default$1(urlConfig2, statsigNetworkImpl2, null, json2, null, stableID, invoke22, null, null, 0, null);
            com.statsig.androidsdk.StatsigNetworkImpl$pollForChanges$1 statsigNetworkImpl$pollForChanges$122 = this;
            this.L$0 = flowCollector2;
            this.L$1 = statsigUser;
            this.L$2 = str2;
            this.L$3 = statsigMetadata;
            this.L$4 = lastUpdateTime;
            this.L$5 = map;
            this.L$6 = fullChecksum;
            this.L$7 = flowCollector2;
            max = j2;
            this.J$0 = max;
            this.label = 2;
            obj4 = kotlinx.coroutines.BuildersKt.withContext(io22, statsigNetworkImpl$pollForChanges$1$invokeSuspend$$inlined$postRequest$default$12, statsigNetworkImpl$pollForChanges$122);
            obj2 = obj72;
            if (obj4 != obj2) {
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.statsig.androidsdk.StatsigNetworkImpl$pollForChanges$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.statsig.androidsdk.StatsigNetworkImpl$pollForChanges$1 statsigNetworkImpl$pollForChanges$1 = new com.statsig.androidsdk.StatsigNetworkImpl$pollForChanges$1(this.$user, this.this$0, this.$metadata, this.$updateIntervalMs, this.$api, this.$fallbackUrls, continuation);
        statsigNetworkImpl$pollForChanges$1.L$0 = obj;
        return statsigNetworkImpl$pollForChanges$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatsigNetworkImpl$pollForChanges$1(com.statsig.androidsdk.StatsigUser statsigUser, com.statsig.androidsdk.StatsigNetworkImpl statsigNetworkImpl, com.statsig.androidsdk.StatsigMetadata statsigMetadata, long j, java.lang.String str, java.util.List<java.lang.String> list, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigNetworkImpl$pollForChanges$1> continuation) {
        super(2, continuation);
        this.$user = statsigUser;
        this.this$0 = statsigNetworkImpl;
        this.$metadata = statsigMetadata;
        this.$updateIntervalMs = j;
        this.$api = str;
        this.$fallbackUrls = list;
    }
}
