package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigClient$pollForUpdates$1", f = "StatsigClient.kt", i = {0, 1}, l = {1504, 1505, 1511}, m = "invokeSuspend", n = {"it", "it"}, s = {"L$0", "L$0"})
/* loaded from: classes16.dex */
final class StatsigClient$pollForUpdates$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.statsig.androidsdk.StatsigClient this$0;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b1, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r10.getMain(), new com.statsig.androidsdk.StatsigClient$pollForUpdates$1.AnonymousClass1(r9.this$0, null), r9) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        if (r10.processSdkConfigs$android_sdk_release(r4, r9.this$0, r9) == r0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.statsig.androidsdk.Store store;
        com.statsig.androidsdk.StatsigUser statsigUser;
        com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse;
        com.statsig.androidsdk.IntegratedSdkExperiments integratedSdkExperiments;
        com.statsig.androidsdk.Store store2;
        java.util.Map<java.lang.String, java.lang.Object> sDKConfigs;
        com.statsig.androidsdk.CoroutineDispatcherProvider coroutineDispatcherProvider;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse2 = (com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse) this.L$0;
            if (successfulInitializeResponse2 != null) {
                store = this.this$0.store;
                if (store == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    store = null;
                }
                statsigUser = this.this$0.user;
                if (statsigUser == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    statsigUser = null;
                }
                this.L$0 = successfulInitializeResponse2;
                this.label = 1;
                if (store.save(successfulInitializeResponse2, statsigUser, this) != coroutine_suspended) {
                    successfulInitializeResponse = successfulInitializeResponse2;
                    integratedSdkExperiments = this.this$0.integratedSdkExperiments;
                    store2 = this.this$0.store;
                    com.statsig.androidsdk.Store store3 = store2;
                    if (store2 == null) {
                    }
                    sDKConfigs = store3.getSDKConfigs();
                    if (sDKConfigs == null) {
                    }
                    this.L$0 = successfulInitializeResponse;
                    this.label = 2;
                }
                return coroutine_suspended;
            }
        } else if (i == 1) {
            successfulInitializeResponse = (com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            integratedSdkExperiments = this.this$0.integratedSdkExperiments;
            store2 = this.this$0.store;
            com.statsig.androidsdk.Store store32 = store2;
            if (store2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                store32 = null;
            }
            sDKConfigs = store32.getSDKConfigs();
            if (sDKConfigs == null) {
                sDKConfigs = kotlin.collections.MapsKt.emptyMap();
            }
            this.L$0 = successfulInitializeResponse;
            this.label = 2;
        } else if (i == 2) {
            successfulInitializeResponse = (com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            if (successfulInitializeResponse.getHasUpdates()) {
                coroutineDispatcherProvider = this.this$0.dispatcherProvider;
                this.L$0 = null;
                this.label = 3;
            }
        } else {
            if (i != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigClient$pollForUpdates$1$1", f = "StatsigClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.statsig.androidsdk.StatsigClient$pollForUpdates$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int label;
        final /* synthetic */ com.statsig.androidsdk.StatsigClient this$0;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.statsig.androidsdk.IStatsigLifetimeCallback iStatsigLifetimeCallback;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                iStatsigLifetimeCallback = this.this$0.lifetimeCallback;
                if (iStatsigLifetimeCallback == null) {
                    return null;
                }
                iStatsigLifetimeCallback.onValuesUpdated();
                return kotlin.Unit.INSTANCE;
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.statsig.androidsdk.StatsigClient$pollForUpdates$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.statsig.androidsdk.StatsigClient$pollForUpdates$1.AnonymousClass1(this.this$0, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.statsig.androidsdk.StatsigClient statsigClient, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigClient$pollForUpdates$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = statsigClient;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.statsig.androidsdk.StatsigClient$pollForUpdates$1) create(successfulInitializeResponse, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.statsig.androidsdk.StatsigClient$pollForUpdates$1 statsigClient$pollForUpdates$1 = new com.statsig.androidsdk.StatsigClient$pollForUpdates$1(this.this$0, continuation);
        statsigClient$pollForUpdates$1.L$0 = obj;
        return statsigClient$pollForUpdates$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatsigClient$pollForUpdates$1(com.statsig.androidsdk.StatsigClient statsigClient, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigClient$pollForUpdates$1> continuation) {
        super(2, continuation);
        this.this$0 = statsigClient;
    }
}
