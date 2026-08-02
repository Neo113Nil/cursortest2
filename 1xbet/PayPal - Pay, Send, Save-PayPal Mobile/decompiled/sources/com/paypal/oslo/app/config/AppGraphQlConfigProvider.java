package com.paypal.oslo.app.config;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 #2\u00020\u0001:\u0001#B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000fR\u0014\u0010\"\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/app/config/AppGraphQlConfigProvider;", "Lcom/paypal/oslo/core/network/graphql/config/GraphQlConfig;", "Lcom/paypal/oslo/app/environment/EnvironmentProvider;", "environmentProvider", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "<init>", "(Lcom/paypal/oslo/app/environment/EnvironmentProvider;Lkotlinx/coroutines/CoroutineScope;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/app/environment/EnvironmentProvider;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoFpsRangesFor", "", "getBaseUrl", "()Ljava/lang/String;", "baseUrl", "Lcom/paypal/oslo/core/network/graphql/config/GraphQlCacheType;", "getCacheType", "()Lcom/paypal/oslo/core/network/graphql/config/GraphQlCacheType;", "cacheType", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/StateFlow;", "persistedQueriesEnabled", "Lkotlinx/coroutines/flow/StateFlow;", "getPersistedQueriesEnabled", "()Lkotlinx/coroutines/flow/StateFlow;", "getClientName", "clientName", "getAppVersion", "appVersion", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppGraphQlConfigProvider implements com.paypal.oslo.core.network.graphql.config.GraphQlConfig {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.app.environment.EnvironmentProvider getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> persistedQueriesEnabled;
    private static final com.paypal.oslo.app.config.AppGraphQlConfigProvider.Companion Companion = new com.paypal.oslo.app.config.AppGraphQlConfigProvider.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public AppGraphQlConfigProvider(com.paypal.oslo.app.environment.EnvironmentProvider environmentProvider, kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environmentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighResolutionOutputSizeshNQ4ISI = environmentProvider;
        this.getHighSpeedVideoFpsRangesFor = coroutineScope;
        com.paypal.oslo.app.config.AppGraphQlConfigProvider.Companion.getHighSpeedVideoFpsRanges(environmentProvider.getEnvironment());
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.TRUE);
        this.getHighSpeedVideoFpsRanges = MutableStateFlow;
        this.persistedQueriesEnabled = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(kotlinx.coroutines.flow.FlowKt.drop(environmentProvider.getEnvironmentFlow(), 1), new com.paypal.oslo.app.config.AppGraphQlConfigProvider.AnonymousClass1(null)), coroutineScope);
    }

    @Override // com.paypal.oslo.core.network.graphql.config.GraphQlConfig
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getPersistedQueriesEnabled() {
        return this.persistedQueriesEnabled;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "env", "Lcom/paypal/oslo/app/environment/Environment;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.app.config.AppGraphQlConfigProvider$1", f = "AppGraphQlConfigProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.app.config.AppGraphQlConfigProvider$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.app.environment.Environment, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighResolutionOutputSizeshNQ4ISI;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.app.environment.Environment environment = (com.paypal.oslo.app.environment.Environment) this.getHighSpeedVideoFpsRanges;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = com.paypal.oslo.app.config.AppGraphQlConfigProvider.this.getHighSpeedVideoFpsRanges;
                com.paypal.oslo.app.config.AppGraphQlConfigProvider.Companion unused = com.paypal.oslo.app.config.AppGraphQlConfigProvider.Companion;
                mutableStateFlow.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(com.paypal.oslo.app.config.AppGraphQlConfigProvider.Companion.getHighSpeedVideoFpsRanges(environment)));
                return kotlin.Unit.INSTANCE;
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.app.environment.Environment environment, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.app.config.AppGraphQlConfigProvider.AnonymousClass1) create(environment, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.app.config.AppGraphQlConfigProvider.AnonymousClass1 anonymousClass1 = com.paypal.oslo.app.config.AppGraphQlConfigProvider.this.new AnonymousClass1(continuation);
            anonymousClass1.getHighSpeedVideoFpsRanges = obj;
            return anonymousClass1;
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.app.config.AppGraphQlConfigProvider.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/app/config/AppGraphQlConfigProvider$Companion;", "", "<init>", "()V", "", "p0", "Camera2StreamConfigurationMap", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/paypal/oslo/app/environment/Environment;", "", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/app/environment/Environment;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public static java.lang.String Camera2StreamConfigurationMap(java.lang.String p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            java.lang.String trimEnd = kotlin.text.StringsKt.trimEnd(p0, kotlinx.io.files.FileSystemKt.UnixPathSeparator);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(trimEnd);
            sb.append("/v2/graphql");
            return sb.toString();
        }

        public static boolean getHighSpeedVideoFpsRanges(com.paypal.oslo.app.environment.Environment p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            return true;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.paypal.oslo.core.network.graphql.config.GraphQlConfig
    public final java.lang.String getAppVersion() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getEnvironment().getGraphQlConfig().getAppVersion();
    }

    @Override // com.paypal.oslo.core.network.graphql.config.GraphQlConfig
    public final java.lang.String getBaseUrl() {
        return com.paypal.oslo.app.config.AppGraphQlConfigProvider.Companion.Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI.getEnvironment().getGraphQlConfig().getBaseUrl());
    }

    @Override // com.paypal.oslo.core.network.graphql.config.GraphQlConfig
    public final com.paypal.oslo.core.network.graphql.config.GraphQlCacheType getCacheType() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getEnvironment().getGraphQlConfig().getCacheType();
    }

    @Override // com.paypal.oslo.core.network.graphql.config.GraphQlConfig
    public final java.lang.String getClientName() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getEnvironment().getGraphQlConfig().getClientName();
    }
}
