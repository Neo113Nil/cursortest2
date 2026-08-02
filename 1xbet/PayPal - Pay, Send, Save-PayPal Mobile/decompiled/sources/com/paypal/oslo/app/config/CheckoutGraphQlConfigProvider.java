package com.paypal.oslo.app.config;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00158\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\nR\u0014\u0010\u001d\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/app/config/CheckoutGraphQlConfigProvider;", "Lcom/paypal/oslo/core/network/graphql/config/GraphQlConfig;", "Lcom/paypal/oslo/app/environment/EnvironmentProvider;", "environmentProvider", "<init>", "(Lcom/paypal/oslo/app/environment/EnvironmentProvider;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/app/environment/EnvironmentProvider;", "", "getBaseUrl", "()Ljava/lang/String;", "baseUrl", "Lcom/paypal/oslo/core/network/graphql/config/GraphQlCacheType;", "getCacheType", "()Lcom/paypal/oslo/core/network/graphql/config/GraphQlCacheType;", "cacheType", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/StateFlow;", "persistedQueriesEnabled", "Lkotlinx/coroutines/flow/StateFlow;", "getPersistedQueriesEnabled", "()Lkotlinx/coroutines/flow/StateFlow;", "getClientName", "clientName", "getAppVersion", "appVersion", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutGraphQlConfigProvider implements com.paypal.oslo.core.network.graphql.config.GraphQlConfig {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> Camera2StreamConfigurationMap;
    private final com.paypal.oslo.app.environment.EnvironmentProvider getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> persistedQueriesEnabled;
    private static final com.paypal.oslo.app.config.CheckoutGraphQlConfigProvider.Companion Companion = new com.paypal.oslo.app.config.CheckoutGraphQlConfigProvider.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public CheckoutGraphQlConfigProvider(com.paypal.oslo.app.environment.EnvironmentProvider environmentProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environmentProvider, "");
        this.getHighSpeedVideoFpsRanges = environmentProvider;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.Camera2StreamConfigurationMap = MutableStateFlow;
        this.persistedQueriesEnabled = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    @Override // com.paypal.oslo.core.network.graphql.config.GraphQlConfig
    public final com.paypal.oslo.core.network.graphql.config.GraphQlCacheType getCacheType() {
        return com.paypal.oslo.core.network.graphql.config.GraphQlCacheType.NoCache.INSTANCE;
    }

    @Override // com.paypal.oslo.core.network.graphql.config.GraphQlConfig
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getPersistedQueriesEnabled() {
        return this.persistedQueriesEnabled;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/app/config/CheckoutGraphQlConfigProvider$Companion;", "", "<init>", "()V", "", "p0", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            java.lang.String trimEnd = kotlin.text.StringsKt.trimEnd(p0, kotlinx.io.files.FileSystemKt.UnixPathSeparator);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(trimEnd);
            sb.append("/checkout/graphql/");
            return sb.toString();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.paypal.oslo.core.network.graphql.config.GraphQlConfig
    public final java.lang.String getAppVersion() {
        return this.getHighSpeedVideoFpsRanges.getEnvironment().getGraphQlConfig().getAppVersion();
    }

    @Override // com.paypal.oslo.core.network.graphql.config.GraphQlConfig
    public final java.lang.String getBaseUrl() {
        return com.paypal.oslo.app.config.CheckoutGraphQlConfigProvider.Companion.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges.getEnvironment().getGraphQlConfig().getBaseUrl());
    }

    @Override // com.paypal.oslo.core.network.graphql.config.GraphQlConfig
    public final java.lang.String getClientName() {
        return this.getHighSpeedVideoFpsRanges.getEnvironment().getGraphQlConfig().getClientName();
    }
}
