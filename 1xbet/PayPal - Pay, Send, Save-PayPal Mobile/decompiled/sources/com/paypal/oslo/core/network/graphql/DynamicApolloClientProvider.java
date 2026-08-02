package com.paypal.oslo.core.network.graphql;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 &2\u00020\u0001:\u0001&BD\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0011\u0010\r\u001a\r\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f0\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u001f\u0010\u0019\u001a\r\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f0\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001d\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00120!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\"R\u0011\u0010%\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b$\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/DynamicApolloClientProvider;", "", "Lcom/paypal/oslo/core/network/http/DynamicOkHttpClientProvider;", "okHttpClientProvider", "Lcom/apollographql/apollo/cache/normalized/ApolloStore;", "apolloStore", "Lcom/paypal/oslo/core/network/graphql/config/GraphQlConfig;", "config", "Lcom/apollographql/apollo/api/http/HttpRequestComposer;", "httpRequestComposer", "", "Lcom/apollographql/apollo/interceptor/ApolloInterceptor;", "Lkotlin/jvm/JvmSuppressWildcards;", "pluginInterceptors", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "<init>", "(Lcom/paypal/oslo/core/network/http/DynamicOkHttpClientProvider;Lcom/apollographql/apollo/cache/normalized/ApolloStore;Lcom/paypal/oslo/core/network/graphql/config/GraphQlConfig;Lcom/apollographql/apollo/api/http/HttpRequestComposer;Ljava/util/Set;Lkotlinx/coroutines/CoroutineScope;)V", "Lcom/apollographql/apollo/ApolloClient;", "Camera2StreamConfigurationMap", "()Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/network/http/DynamicOkHttpClientProvider;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/apollographql/apollo/cache/normalized/ApolloStore;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/network/graphql/config/GraphQlConfig;", "Lcom/apollographql/apollo/api/http/HttpRequestComposer;", "getHighSpeedVideoSizes", "getOutputMinFrameDuration", "Ljava/util/Set;", "getInputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getOutputFormats", "getApolloClient", "apolloClient", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DynamicApolloClientProvider {
    public static final long CLOSE_DELAY_MS = 5000;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.apollographql.apollo.api.http.HttpRequestComposer getHighSpeedVideoSizes;
    private final com.apollographql.apollo.cache.normalized.ApolloStore getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.network.graphql.config.GraphQlConfig Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.apollographql.apollo.ApolloClient> getOutputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getOutputMinFrameDuration;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final java.util.Set<com.apollographql.apollo.interceptor.ApolloInterceptor> getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public DynamicApolloClientProvider(com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider dynamicOkHttpClientProvider, com.apollographql.apollo.cache.normalized.ApolloStore apolloStore, com.paypal.oslo.core.network.graphql.config.GraphQlConfig graphQlConfig, com.apollographql.apollo.api.http.HttpRequestComposer httpRequestComposer, java.util.Set<com.apollographql.apollo.interceptor.ApolloInterceptor> set, kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicOkHttpClientProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQlConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestComposer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighSpeedVideoFpsRanges = dynamicOkHttpClientProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = apolloStore;
        this.Camera2StreamConfigurationMap = graphQlConfig;
        this.getHighSpeedVideoSizes = httpRequestComposer;
        this.getHighSpeedVideoFpsRangesFor = set;
        this.getOutputMinFrameDuration = coroutineScope;
        this.getOutputFormats = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(Camera2StreamConfigurationMap());
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(kotlinx.coroutines.flow.FlowKt.drop(graphQlConfig.getPersistedQueriesEnabled(), 1)), new com.paypal.oslo.core.network.graphql.DynamicApolloClientProvider.AnonymousClass1(null)), coroutineScope);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.network.graphql.DynamicApolloClientProvider$1", f = "DynamicApolloClientProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.core.network.graphql.DynamicApolloClientProvider$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRanges == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.apollographql.apollo.ApolloClient apolloClient = (com.apollographql.apollo.ApolloClient) com.paypal.oslo.core.network.graphql.DynamicApolloClientProvider.this.getOutputFormats.getValue();
                com.paypal.oslo.core.network.graphql.DynamicApolloClientProvider.this.getOutputFormats.setValue(com.paypal.oslo.core.network.graphql.DynamicApolloClientProvider.this.Camera2StreamConfigurationMap());
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.paypal.oslo.core.network.graphql.DynamicApolloClientProvider.this.getOutputMinFrameDuration, null, null, new com.paypal.oslo.core.network.graphql.DynamicApolloClientProvider.AnonymousClass1.C01121(apolloClient, null), 3, null);
                return kotlin.Unit.INSTANCE;
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.network.graphql.DynamicApolloClientProvider$1$1", f = "DynamicApolloClientProvider.kt", i = {0}, l = {62}, m = "invokeSuspend", n = {"$this$launch"}, nl = {63}, s = {"L$0"}, v = 2)
        /* renamed from: com.paypal.oslo.core.network.graphql.DynamicApolloClientProvider$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01121 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
            int getHighSpeedVideoFpsRangesFor;
            final /* synthetic */ com.apollographql.apollo.ApolloClient getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object m23436constructorimpl;
                kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.getHighSpeedVideoFpsRangesFor;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getHighSpeedVideoFpsRanges = coroutineScope;
                    this.getHighSpeedVideoFpsRangesFor = 1;
                    if (kotlinx.coroutines.DelayKt.delay(5000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes;
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    apolloClient.close();
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
                } catch (java.lang.Throwable th) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                }
                java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                if (m23439exceptionOrNullimpl != null) {
                    com.paypal.oslo.core.network.graphql.LoggerKt.log.e("Failed to close ApolloClient", m23439exceptionOrNullimpl);
                }
                return kotlin.Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.paypal.oslo.core.network.graphql.DynamicApolloClientProvider.AnonymousClass1.C01121) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                com.paypal.oslo.core.network.graphql.DynamicApolloClientProvider.AnonymousClass1.C01121 c01121 = new com.paypal.oslo.core.network.graphql.DynamicApolloClientProvider.AnonymousClass1.C01121(this.getHighSpeedVideoSizes, continuation);
                c01121.getHighSpeedVideoFpsRanges = obj;
                return c01121;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01121(com.apollographql.apollo.ApolloClient apolloClient, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.network.graphql.DynamicApolloClientProvider.AnonymousClass1.C01121> continuation) {
                super(2, continuation);
                this.getHighSpeedVideoSizes = apolloClient;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.core.network.graphql.DynamicApolloClientProvider.AnonymousClass1) create(java.lang.Boolean.valueOf(bool.booleanValue()), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.paypal.oslo.core.network.graphql.DynamicApolloClientProvider.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.core.network.graphql.DynamicApolloClientProvider.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    public final com.apollographql.apollo.ApolloClient getApolloClient() {
        return this.getOutputFormats.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.apollographql.apollo.ApolloClient Camera2StreamConfigurationMap() {
        return com.paypal.oslo.core.network.graphql.ApolloClientFactory.create$default(com.paypal.oslo.core.network.graphql.ApolloClientFactory.INSTANCE, this.getHighSpeedVideoFpsRanges.getCallFactory(), this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, null, 32, null);
    }
}
