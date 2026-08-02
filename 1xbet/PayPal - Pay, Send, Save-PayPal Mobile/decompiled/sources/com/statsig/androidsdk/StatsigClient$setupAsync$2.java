package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/statsig/androidsdk/InitializationDetails;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigClient$setupAsync$2", f = "StatsigClient.kt", i = {}, l = {1073}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class StatsigClient$setupAsync$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.InitializationDetails>, java.lang.Object> {
    final /* synthetic */ com.statsig.androidsdk.StatsigUser $user;
    int label;
    final /* synthetic */ com.statsig.androidsdk.StatsigClient this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.label = 1;
        java.lang.Object captureAsync = this.this$0.getErrorBoundary().captureAsync(new com.statsig.androidsdk.StatsigClient$setupAsync$2.AnonymousClass1(this.this$0, this.$user, null), new com.statsig.androidsdk.StatsigClient$setupAsync$2.AnonymousClass2(this.this$0, null), this);
        return captureAsync == coroutine_suspended ? coroutine_suspended : captureAsync;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/statsig/androidsdk/InitializationDetails;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigClient$setupAsync$2$1", f = "StatsigClient.kt", i = {1, 2}, l = {1102, 1132, 1133}, m = "invokeSuspend", n = {"initResponse", "initResponse"}, s = {"L$0", "L$0"})
    /* renamed from: com.statsig.androidsdk.StatsigClient$setupAsync$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super com.statsig.androidsdk.InitializationDetails>, java.lang.Object> {
        final /* synthetic */ com.statsig.androidsdk.StatsigUser $user;
        java.lang.Object L$0;
        int label;
        final /* synthetic */ com.statsig.androidsdk.StatsigClient this$0;

        /* JADX WARN: Code restructure failed: missing block: B:113:0x0206, code lost:
        
            if (r2 != r1) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0251, code lost:
        
            if (r3.save((com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse) r2, r37.$user, r37) == r1) goto L116;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x02b5  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x02db  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x030b  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x02ba  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0222  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x023d  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0227  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x028a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
            com.statsig.androidsdk.Store store;
            com.statsig.androidsdk.StatsigUser statsigUser;
            com.statsig.androidsdk.Diagnostics diagnostics;
            com.statsig.androidsdk.Diagnostics diagnostics2;
            com.statsig.androidsdk.HashAlgorithm hashAlgorithm;
            com.statsig.androidsdk.Store store2;
            com.statsig.androidsdk.StatsigUser statsigUser2;
            com.statsig.androidsdk.Store store3;
            com.statsig.androidsdk.StatsigUser statsigUser3;
            java.lang.Object initialize;
            com.statsig.androidsdk.Store store4;
            com.statsig.androidsdk.InitializeResponse cachedInitializationResponse;
            com.statsig.androidsdk.Diagnostics diagnostics3;
            com.statsig.androidsdk.Diagnostics diagnostics4;
            com.statsig.androidsdk.Store store5;
            com.statsig.androidsdk.Diagnostics diagnostics5;
            com.statsig.androidsdk.Diagnostics diagnostics6;
            com.statsig.androidsdk.Store store6;
            com.statsig.androidsdk.Diagnostics diagnostics7;
            com.statsig.androidsdk.StatsigLogger statsigLogger;
            com.statsig.androidsdk.Diagnostics diagnostics8;
            com.statsig.androidsdk.Diagnostics diagnostics9;
            com.statsig.androidsdk.Store store7;
            com.statsig.androidsdk.IntegratedSdkExperiments integratedSdkExperiments;
            com.statsig.androidsdk.Store store8;
            com.statsig.androidsdk.InitializeResponse initializeResponse;
            kotlinx.coroutines.CoroutineScope coroutineScope;
            com.statsig.androidsdk.CoroutineDispatcherProvider coroutineDispatcherProvider;
            com.statsig.androidsdk.Diagnostics diagnostics10;
            com.statsig.androidsdk.Diagnostics diagnostics11;
            com.statsig.androidsdk.CoroutineDispatcherProvider coroutineDispatcherProvider2;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                atomicBoolean = this.this$0.isBootstrapped;
                if (atomicBoolean.get()) {
                    store6 = this.this$0.store;
                    if (store6 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        store6 = null;
                    }
                    com.statsig.androidsdk.EvaluationDetails globalEvaluationDetails$android_sdk_release = store6.getGlobalEvaluationDetails$android_sdk_release();
                    diagnostics7 = this.this$0.diagnostics;
                    if (diagnostics7 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        diagnostics7 = null;
                    }
                    diagnostics7.markEnd(com.statsig.androidsdk.KeyType.OVERALL, globalEvaluationDetails$android_sdk_release.getReason() == com.statsig.androidsdk.EvaluationReason.Bootstrap, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : new com.statsig.androidsdk.Marker(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, globalEvaluationDetails$android_sdk_release, null, null, null, null, 1015807, null), (r13 & 16) != 0 ? null : null);
                    statsigLogger = this.this$0.logger;
                    if (statsigLogger == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        statsigLogger = null;
                    }
                    com.statsig.androidsdk.StatsigLogger.logDiagnostics$default(statsigLogger, null, 1, null);
                    return new com.statsig.androidsdk.InitializationDetails(0L, true, null);
                }
                if (this.this$0.getOptions$android_sdk_release().getLoadCacheAsync()) {
                    diagnostics3 = this.this$0.diagnostics;
                    if (diagnostics3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        diagnostics4 = null;
                    } else {
                        diagnostics4 = diagnostics3;
                    }
                    com.statsig.androidsdk.Diagnostics.markStart$default(diagnostics4, com.statsig.androidsdk.KeyType.INITIALIZE, com.statsig.androidsdk.StepType.LOAD_CACHE, new com.statsig.androidsdk.Marker(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false), 524287, null), null, 8, null);
                    store5 = this.this$0.store;
                    if (store5 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        store5 = null;
                    }
                    store5.syncLoadFromLocalStorage();
                    diagnostics5 = this.this$0.diagnostics;
                    if (diagnostics5 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        diagnostics6 = null;
                    } else {
                        diagnostics6 = diagnostics5;
                    }
                    diagnostics6.markEnd(com.statsig.androidsdk.KeyType.INITIALIZE, true, (r13 & 4) != 0 ? null : com.statsig.androidsdk.StepType.LOAD_CACHE, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
                }
                if (this.this$0.getOptions$android_sdk_release().getInitializeOffline()) {
                    store4 = this.this$0.store;
                    if (store4 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        store4 = null;
                    }
                    cachedInitializationResponse = store4.getCachedInitializationResponse();
                    if ((cachedInitializationResponse instanceof com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse) && !this.this$0.getOptions$android_sdk_release().getInitializeOffline()) {
                        diagnostics8 = this.this$0.diagnostics;
                        if (diagnostics8 != null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                            diagnostics9 = null;
                        } else {
                            diagnostics9 = diagnostics8;
                        }
                        com.statsig.androidsdk.Diagnostics.markStart$default(diagnostics9, com.statsig.androidsdk.KeyType.INITIALIZE, com.statsig.androidsdk.StepType.PROCESS, null, null, 12, null);
                        store7 = this.this$0.store;
                        if (store7 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                            store7 = null;
                        }
                        this.L$0 = cachedInitializationResponse;
                        this.label = 2;
                    }
                    this.this$0.pollForUpdates();
                    if (!this.this$0.getOptions$android_sdk_release().getDisableLogEventRetries()) {
                    }
                    boolean z = cachedInitializationResponse instanceof com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse;
                    this.this$0.logEndDiagnostics(z, com.statsig.androidsdk.ContextType.INITIALIZE, cachedInitializationResponse);
                    return new com.statsig.androidsdk.InitializationDetails(0L, z, cachedInitializationResponse instanceof com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse ? (com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse) cachedInitializationResponse : null);
                }
                com.statsig.androidsdk.StatsigNetwork statsigNetwork$android_sdk_release = this.this$0.getStatsigNetwork$android_sdk_release();
                java.lang.String api = this.this$0.getOptions$android_sdk_release().getApi();
                com.statsig.androidsdk.StatsigUser statsigUser4 = this.$user;
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
                java.lang.Long lastUpdateTime = store.getLastUpdateTime(statsigUser);
                com.statsig.androidsdk.StatsigMetadata statsigClientMetadata$android_sdk_release = this.this$0.getStatsigClientMetadata$android_sdk_release();
                kotlinx.coroutines.CoroutineScope statsigScope$android_sdk_release = this.this$0.getStatsigScope$android_sdk_release();
                com.statsig.androidsdk.ContextType contextType = com.statsig.androidsdk.ContextType.INITIALIZE;
                diagnostics = this.this$0.diagnostics;
                if (diagnostics == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    diagnostics2 = null;
                } else {
                    diagnostics2 = diagnostics;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.this$0.getOptions$android_sdk_release().getDisableHashing(), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true))) {
                    hashAlgorithm = com.statsig.androidsdk.HashAlgorithm.NONE;
                } else {
                    hashAlgorithm = com.statsig.androidsdk.HashAlgorithm.DJB2;
                }
                com.statsig.androidsdk.HashAlgorithm hashAlgorithm2 = hashAlgorithm;
                store2 = this.this$0.store;
                if (store2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    store2 = null;
                }
                statsigUser2 = this.this$0.user;
                if (statsigUser2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    statsigUser2 = null;
                }
                java.util.Map<java.lang.String, java.lang.String> previousDerivedFields = store2.getPreviousDerivedFields(statsigUser2);
                store3 = this.this$0.store;
                if (store3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    store3 = null;
                }
                statsigUser3 = this.this$0.user;
                if (statsigUser3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    statsigUser3 = null;
                }
                this.label = 1;
                initialize = statsigNetwork$android_sdk_release.initialize(api, statsigUser4, lastUpdateTime, statsigClientMetadata$android_sdk_release, statsigScope$android_sdk_release, contextType, diagnostics2, hashAlgorithm2, previousDerivedFields, store3.getFullChecksum(statsigUser3), this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        initializeResponse = (com.statsig.androidsdk.InitializeResponse) this.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (((com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse) initializeResponse).getHasUpdates()) {
                            kotlinx.coroutines.CoroutineScope statsigScope$android_sdk_release2 = this.this$0.getStatsigScope$android_sdk_release();
                            coroutineDispatcherProvider2 = this.this$0.dispatcherProvider;
                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(statsigScope$android_sdk_release2, coroutineDispatcherProvider2.getMain(), null, new com.statsig.androidsdk.StatsigClient$setupAsync$2.AnonymousClass1.C02021(this.this$0, null), 2, null);
                        }
                        diagnostics10 = this.this$0.diagnostics;
                        if (diagnostics10 != null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                            diagnostics11 = null;
                        } else {
                            diagnostics11 = diagnostics10;
                        }
                        diagnostics11.markEnd(com.statsig.androidsdk.KeyType.INITIALIZE, true, (r13 & 4) != 0 ? null : com.statsig.androidsdk.StepType.PROCESS, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
                        cachedInitializationResponse = initializeResponse;
                        this.this$0.pollForUpdates();
                        if (!this.this$0.getOptions$android_sdk_release().getDisableLogEventRetries()) {
                            coroutineScope = this.this$0.retryScope;
                            coroutineDispatcherProvider = this.this$0.dispatcherProvider;
                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, coroutineDispatcherProvider.getIo(), null, new com.statsig.androidsdk.StatsigClient$setupAsync$2.AnonymousClass1.AnonymousClass2(this.this$0, null), 2, null);
                        }
                        boolean z2 = cachedInitializationResponse instanceof com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse;
                        this.this$0.logEndDiagnostics(z2, com.statsig.androidsdk.ContextType.INITIALIZE, cachedInitializationResponse);
                        return new com.statsig.androidsdk.InitializationDetails(0L, z2, cachedInitializationResponse instanceof com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse ? (com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse) cachedInitializationResponse : null);
                    }
                    cachedInitializationResponse = (com.statsig.androidsdk.InitializeResponse) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    integratedSdkExperiments = this.this$0.integratedSdkExperiments;
                    store8 = this.this$0.store;
                    com.statsig.androidsdk.Store store9 = store8;
                    if (store8 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        store9 = null;
                    }
                    java.util.Map<java.lang.String, java.lang.Object> sDKConfigs = store9.getSDKConfigs();
                    if (sDKConfigs == null) {
                        sDKConfigs = kotlin.collections.MapsKt.emptyMap();
                    }
                    this.L$0 = cachedInitializationResponse;
                    this.label = 3;
                    if (integratedSdkExperiments.processSdkConfigs$android_sdk_release(sDKConfigs, this.this$0, this) != coroutine_suspended) {
                        initializeResponse = cachedInitializationResponse;
                        if (((com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse) initializeResponse).getHasUpdates()) {
                        }
                        diagnostics10 = this.this$0.diagnostics;
                        if (diagnostics10 != null) {
                        }
                        diagnostics11.markEnd(com.statsig.androidsdk.KeyType.INITIALIZE, true, (r13 & 4) != 0 ? null : com.statsig.androidsdk.StepType.PROCESS, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
                        cachedInitializationResponse = initializeResponse;
                        this.this$0.pollForUpdates();
                        if (!this.this$0.getOptions$android_sdk_release().getDisableLogEventRetries()) {
                        }
                        boolean z22 = cachedInitializationResponse instanceof com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse;
                        this.this$0.logEndDiagnostics(z22, com.statsig.androidsdk.ContextType.INITIALIZE, cachedInitializationResponse);
                        return new com.statsig.androidsdk.InitializationDetails(0L, z22, cachedInitializationResponse instanceof com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse ? (com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse) cachedInitializationResponse : null);
                    }
                    return coroutine_suspended;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                initialize = obj;
            }
            cachedInitializationResponse = (com.statsig.androidsdk.InitializeResponse) initialize;
            if (cachedInitializationResponse instanceof com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse) {
                diagnostics8 = this.this$0.diagnostics;
                if (diagnostics8 != null) {
                }
                com.statsig.androidsdk.Diagnostics.markStart$default(diagnostics9, com.statsig.androidsdk.KeyType.INITIALIZE, com.statsig.androidsdk.StepType.PROCESS, null, null, 12, null);
                store7 = this.this$0.store;
                if (store7 == null) {
                }
                this.L$0 = cachedInitializationResponse;
                this.label = 2;
            }
            this.this$0.pollForUpdates();
            if (!this.this$0.getOptions$android_sdk_release().getDisableLogEventRetries()) {
            }
            boolean z222 = cachedInitializationResponse instanceof com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse;
            this.this$0.logEndDiagnostics(z222, com.statsig.androidsdk.ContextType.INITIALIZE, cachedInitializationResponse);
            return new com.statsig.androidsdk.InitializationDetails(0L, z222, cachedInitializationResponse instanceof com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse ? (com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse) cachedInitializationResponse : null);
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigClient$setupAsync$2$1$1", f = "StatsigClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.statsig.androidsdk.StatsigClient$setupAsync$2$1$1, reason: invalid class name and collision with other inner class name */
        static final class C02021 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            int label;
            final /* synthetic */ com.statsig.androidsdk.StatsigClient this$0;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                com.statsig.androidsdk.IStatsigLifetimeCallback iStatsigLifetimeCallback;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    iStatsigLifetimeCallback = this.this$0.lifetimeCallback;
                    if (iStatsigLifetimeCallback != null) {
                        iStatsigLifetimeCallback.onValuesUpdated();
                    }
                    return kotlin.Unit.INSTANCE;
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.statsig.androidsdk.StatsigClient$setupAsync$2.AnonymousClass1.C02021) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.statsig.androidsdk.StatsigClient$setupAsync$2.AnonymousClass1.C02021(this.this$0, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02021(com.statsig.androidsdk.StatsigClient statsigClient, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigClient$setupAsync$2.AnonymousClass1.C02021> continuation) {
                super(2, continuation);
                this.this$0 = statsigClient;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigClient$setupAsync$2$1$2", f = "StatsigClient.kt", i = {}, l = {1154}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.statsig.androidsdk.StatsigClient$setupAsync$2$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            int label;
            final /* synthetic */ com.statsig.androidsdk.StatsigClient this$0;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (this.this$0.getStatsigNetwork$android_sdk_release().apiRetryFailedLogs(this.this$0.getOptions$android_sdk_release().getEventLoggingAPI(), this.this$0.getOptions$android_sdk_release().getLogEventFallbackUrls(), this.this$0.getStatsigClientMetadata$android_sdk_release(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                } catch (java.lang.Exception unused) {
                }
                return kotlin.Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.statsig.androidsdk.StatsigClient$setupAsync$2.AnonymousClass1.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.statsig.androidsdk.StatsigClient$setupAsync$2.AnonymousClass1.AnonymousClass2(this.this$0, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(com.statsig.androidsdk.StatsigClient statsigClient, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigClient$setupAsync$2.AnonymousClass1.AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = statsigClient;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super com.statsig.androidsdk.InitializationDetails> continuation) {
            return ((com.statsig.androidsdk.StatsigClient$setupAsync$2.AnonymousClass1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return new com.statsig.androidsdk.StatsigClient$setupAsync$2.AnonymousClass1(this.this$0, this.$user, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.statsig.androidsdk.StatsigClient statsigClient, com.statsig.androidsdk.StatsigUser statsigUser, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigClient$setupAsync$2.AnonymousClass1> continuation) {
            super(1, continuation);
            this.this$0 = statsigClient;
            this.$user = statsigUser;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u008a@"}, d2 = {"<anonymous>", "Lcom/statsig/androidsdk/InitializationDetails;", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigClient$setupAsync$2$2", f = "StatsigClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.statsig.androidsdk.StatsigClient$setupAsync$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Exception, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.InitializationDetails>, java.lang.Object> {
        /* synthetic */ java.lang.Object L$0;
        int label;
        final /* synthetic */ com.statsig.androidsdk.StatsigClient this$0;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.statsig.androidsdk.InitializeFailReason initializeFailReason;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.Exception exc = (java.lang.Exception) this.L$0;
                this.this$0.logEndDiagnosticsWhenException(com.statsig.androidsdk.ContextType.INITIALIZE, exc);
                if (exc instanceof kotlinx.coroutines.TimeoutCancellationException) {
                    initializeFailReason = com.statsig.androidsdk.InitializeFailReason.CoroutineTimeout;
                } else {
                    initializeFailReason = com.statsig.androidsdk.InitializeFailReason.InternalError;
                }
                return new com.statsig.androidsdk.InitializationDetails(0L, false, new com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse(initializeFailReason, exc, null, 4, null));
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Exception exc, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.InitializationDetails> continuation) {
            return ((com.statsig.androidsdk.StatsigClient$setupAsync$2.AnonymousClass2) create(exc, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.statsig.androidsdk.StatsigClient$setupAsync$2.AnonymousClass2 anonymousClass2 = new com.statsig.androidsdk.StatsigClient$setupAsync$2.AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(com.statsig.androidsdk.StatsigClient statsigClient, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigClient$setupAsync$2.AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = statsigClient;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.InitializationDetails> continuation) {
        return ((com.statsig.androidsdk.StatsigClient$setupAsync$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.statsig.androidsdk.StatsigClient$setupAsync$2(this.this$0, this.$user, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatsigClient$setupAsync$2(com.statsig.androidsdk.StatsigClient statsigClient, com.statsig.androidsdk.StatsigUser statsigUser, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigClient$setupAsync$2> continuation) {
        super(2, continuation);
        this.this$0 = statsigClient;
        this.$user = statsigUser;
    }
}
