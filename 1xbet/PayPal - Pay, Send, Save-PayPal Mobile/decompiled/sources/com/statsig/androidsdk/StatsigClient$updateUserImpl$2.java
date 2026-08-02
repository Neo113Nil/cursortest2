package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigClient$updateUserImpl$2", f = "StatsigClient.kt", i = {}, l = {1321}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class StatsigClient$updateUserImpl$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;
    final /* synthetic */ com.statsig.androidsdk.StatsigClient this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (this.this$0.getErrorBoundary().captureAsync(new com.statsig.androidsdk.StatsigClient$updateUserImpl$2.AnonymousClass1(this.this$0, null), new com.statsig.androidsdk.StatsigClient$updateUserImpl$2.AnonymousClass2(this.this$0, null), this) == coroutine_suspended) {
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

    @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigClient$updateUserImpl$2$1", f = "StatsigClient.kt", i = {1, 2}, l = {1328, 1352, 1353}, m = "invokeSuspend", n = {"initResponse", "initResponse"}, s = {"L$0", "L$0"})
    /* renamed from: com.statsig.androidsdk.StatsigClient$updateUserImpl$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        java.lang.Object L$0;
        int label;
        final /* synthetic */ com.statsig.androidsdk.StatsigClient this$0;

        /* JADX WARN: Removed duplicated region for block: B:12:0x019a  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x019f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0151  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0165  */
        /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x016f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.statsig.androidsdk.Store store;
            com.statsig.androidsdk.StatsigUser statsigUser;
            com.statsig.androidsdk.Store store2;
            com.statsig.androidsdk.StatsigUser statsigUser2;
            com.statsig.androidsdk.Store store3;
            com.statsig.androidsdk.StatsigUser statsigUser3;
            com.statsig.androidsdk.StatsigUser statsigUser4;
            com.statsig.androidsdk.StatsigUser statsigUser5;
            com.statsig.androidsdk.StatsigMetadata statsigClientMetadata$android_sdk_release;
            com.statsig.androidsdk.Diagnostics diagnostics;
            com.statsig.androidsdk.Diagnostics diagnostics2;
            com.statsig.androidsdk.HashAlgorithm hashAlgorithm;
            java.lang.Object initialize;
            com.statsig.androidsdk.InitializeResponse initializeResponse;
            com.statsig.androidsdk.Diagnostics diagnostics3;
            com.statsig.androidsdk.Diagnostics diagnostics4;
            com.statsig.androidsdk.Store store4;
            com.statsig.androidsdk.StatsigUser statsigUser6;
            com.statsig.androidsdk.IntegratedSdkExperiments integratedSdkExperiments;
            com.statsig.androidsdk.Store store5;
            java.util.Map<java.lang.String, java.lang.Object> sDKConfigs;
            com.statsig.androidsdk.InitializeResponse initializeResponse2;
            com.statsig.androidsdk.Diagnostics diagnostics5;
            com.statsig.androidsdk.Diagnostics diagnostics6;
            com.statsig.androidsdk.CoroutineDispatcherProvider coroutineDispatcherProvider;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
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
                java.lang.String fullChecksum = store3.getFullChecksum(statsigUser3);
                com.statsig.androidsdk.StatsigNetwork statsigNetwork$android_sdk_release = this.this$0.getStatsigNetwork$android_sdk_release();
                java.lang.String api = this.this$0.getOptions$android_sdk_release().getApi();
                statsigUser4 = this.this$0.user;
                if (statsigUser4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    statsigUser5 = null;
                } else {
                    statsigUser5 = statsigUser4;
                }
                statsigClientMetadata$android_sdk_release = this.this$0.getStatsigClientMetadata$android_sdk_release();
                kotlinx.coroutines.CoroutineScope statsigScope$android_sdk_release = this.this$0.getStatsigScope$android_sdk_release();
                com.statsig.androidsdk.ContextType contextType = com.statsig.androidsdk.ContextType.UPDATE_USER;
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
                this.label = 1;
                initialize = statsigNetwork$android_sdk_release.initialize(api, statsigUser5, lastUpdateTime, statsigClientMetadata$android_sdk_release, statsigScope$android_sdk_release, contextType, diagnostics2, hashAlgorithm, previousDerivedFields, fullChecksum, this);
                if (initialize == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        initializeResponse2 = (com.statsig.androidsdk.InitializeResponse) this.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (((com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse) initializeResponse2).getHasUpdates()) {
                            kotlinx.coroutines.CoroutineScope statsigScope$android_sdk_release2 = this.this$0.getStatsigScope$android_sdk_release();
                            coroutineDispatcherProvider = this.this$0.dispatcherProvider;
                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(statsigScope$android_sdk_release2, coroutineDispatcherProvider.getMain(), null, new com.statsig.androidsdk.StatsigClient$updateUserImpl$2.AnonymousClass1.C02041(this.this$0, null), 2, null);
                        }
                        diagnostics5 = this.this$0.diagnostics;
                        if (diagnostics5 != null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                            diagnostics6 = null;
                        } else {
                            diagnostics6 = diagnostics5;
                        }
                        diagnostics6.markEnd(com.statsig.androidsdk.KeyType.INITIALIZE, true, (r13 & 4) != 0 ? null : com.statsig.androidsdk.StepType.PROCESS, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : com.statsig.androidsdk.ContextType.UPDATE_USER);
                        initializeResponse = initializeResponse2;
                        this.this$0.pollForUpdates();
                        this.this$0.logEndDiagnostics(initializeResponse instanceof com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse, com.statsig.androidsdk.ContextType.UPDATE_USER, initializeResponse);
                        return kotlin.Unit.INSTANCE;
                    }
                    initializeResponse = (com.statsig.androidsdk.InitializeResponse) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    integratedSdkExperiments = this.this$0.integratedSdkExperiments;
                    store5 = this.this$0.store;
                    com.statsig.androidsdk.Store store6 = store5;
                    if (store5 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        store6 = null;
                    }
                    sDKConfigs = store6.getSDKConfigs();
                    if (sDKConfigs == null) {
                        sDKConfigs = kotlin.collections.MapsKt.emptyMap();
                    }
                    this.L$0 = initializeResponse;
                    this.label = 3;
                    if (integratedSdkExperiments.processSdkConfigs$android_sdk_release(sDKConfigs, this.this$0, this) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    initializeResponse2 = initializeResponse;
                    if (((com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse) initializeResponse2).getHasUpdates()) {
                    }
                    diagnostics5 = this.this$0.diagnostics;
                    if (diagnostics5 != null) {
                    }
                    diagnostics6.markEnd(com.statsig.androidsdk.KeyType.INITIALIZE, true, (r13 & 4) != 0 ? null : com.statsig.androidsdk.StepType.PROCESS, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : com.statsig.androidsdk.ContextType.UPDATE_USER);
                    initializeResponse = initializeResponse2;
                    this.this$0.pollForUpdates();
                    this.this$0.logEndDiagnostics(initializeResponse instanceof com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse, com.statsig.androidsdk.ContextType.UPDATE_USER, initializeResponse);
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                initialize = obj;
            }
            initializeResponse = (com.statsig.androidsdk.InitializeResponse) initialize;
            if (initializeResponse instanceof com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse) {
                diagnostics3 = this.this$0.diagnostics;
                if (diagnostics3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    diagnostics4 = null;
                } else {
                    diagnostics4 = diagnostics3;
                }
                com.statsig.androidsdk.Diagnostics.markStart$default(diagnostics4, com.statsig.androidsdk.KeyType.INITIALIZE, com.statsig.androidsdk.StepType.PROCESS, null, com.statsig.androidsdk.ContextType.UPDATE_USER, 4, null);
                store4 = this.this$0.store;
                if (store4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    store4 = null;
                }
                com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse = (com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse) initializeResponse;
                statsigUser6 = this.this$0.user;
                if (statsigUser6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    statsigUser6 = null;
                }
                this.L$0 = initializeResponse;
                this.label = 2;
                if (store4.save(successfulInitializeResponse, statsigUser6, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                integratedSdkExperiments = this.this$0.integratedSdkExperiments;
                store5 = this.this$0.store;
                com.statsig.androidsdk.Store store62 = store5;
                if (store5 == null) {
                }
                sDKConfigs = store62.getSDKConfigs();
                if (sDKConfigs == null) {
                }
                this.L$0 = initializeResponse;
                this.label = 3;
                if (integratedSdkExperiments.processSdkConfigs$android_sdk_release(sDKConfigs, this.this$0, this) != coroutine_suspended) {
                }
            }
            this.this$0.pollForUpdates();
            this.this$0.logEndDiagnostics(initializeResponse instanceof com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse, com.statsig.androidsdk.ContextType.UPDATE_USER, initializeResponse);
            return kotlin.Unit.INSTANCE;
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigClient$updateUserImpl$2$1$1", f = "StatsigClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.statsig.androidsdk.StatsigClient$updateUserImpl$2$1$1, reason: invalid class name and collision with other inner class name */
        static final class C02041 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
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
                return ((com.statsig.androidsdk.StatsigClient$updateUserImpl$2.AnonymousClass1.C02041) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.statsig.androidsdk.StatsigClient$updateUserImpl$2.AnonymousClass1.C02041(this.this$0, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02041(com.statsig.androidsdk.StatsigClient statsigClient, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigClient$updateUserImpl$2.AnonymousClass1.C02041> continuation) {
                super(2, continuation);
                this.this$0 = statsigClient;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.statsig.androidsdk.StatsigClient$updateUserImpl$2.AnonymousClass1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return new com.statsig.androidsdk.StatsigClient$updateUserImpl$2.AnonymousClass1(this.this$0, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.statsig.androidsdk.StatsigClient statsigClient, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigClient$updateUserImpl$2.AnonymousClass1> continuation) {
            super(1, continuation);
            this.this$0 = statsigClient;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u008a@"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigClient$updateUserImpl$2$2", f = "StatsigClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.statsig.androidsdk.StatsigClient$updateUserImpl$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Exception, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        /* synthetic */ java.lang.Object L$0;
        int label;
        final /* synthetic */ com.statsig.androidsdk.StatsigClient this$0;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.this$0.logEndDiagnosticsWhenException(com.statsig.androidsdk.ContextType.UPDATE_USER, (java.lang.Exception) this.L$0);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Exception exc, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.statsig.androidsdk.StatsigClient$updateUserImpl$2.AnonymousClass2) create(exc, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.statsig.androidsdk.StatsigClient$updateUserImpl$2.AnonymousClass2 anonymousClass2 = new com.statsig.androidsdk.StatsigClient$updateUserImpl$2.AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(com.statsig.androidsdk.StatsigClient statsigClient, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigClient$updateUserImpl$2.AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = statsigClient;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.statsig.androidsdk.StatsigClient$updateUserImpl$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.statsig.androidsdk.StatsigClient$updateUserImpl$2(this.this$0, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatsigClient$updateUserImpl$2(com.statsig.androidsdk.StatsigClient statsigClient, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigClient$updateUserImpl$2> continuation) {
        super(2, continuation);
        this.this$0 = statsigClient;
    }
}
