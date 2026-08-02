package com.paypal.oslo.app.config;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u0019\u0010\b\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u001b\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u001b\u0010\b\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/app/config/AppGraphQlConfig;", "Lcom/paypal/oslo/core/network/graphql/config/GraphQlConfig;", "", "baseUrl", "", "persistedQueriesEnabledValue", "<init>", "(Ljava/lang/String;Z)V", "Ljava/lang/String;", "getBaseUrl", "()Ljava/lang/String;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/StateFlow;", "persistedQueriesEnabled", "Lkotlinx/coroutines/flow/StateFlow;", "getPersistedQueriesEnabled", "()Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/core/network/graphql/config/GraphQlCacheType;", "cacheType", "Lcom/paypal/oslo/core/network/graphql/config/GraphQlCacheType;", "getCacheType", "()Lcom/paypal/oslo/core/network/graphql/config/GraphQlCacheType;", "clientName", "getClientName", "appVersion", "getAppVersion", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppGraphQlConfig implements com.paypal.oslo.core.network.graphql.config.GraphQlConfig {
    private final java.lang.String appVersion;
    private final java.lang.String baseUrl;
    private final com.paypal.oslo.core.network.graphql.config.GraphQlCacheType cacheType;
    private final java.lang.String clientName;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> persistedQueriesEnabled;
    private static final com.paypal.oslo.app.config.AppGraphQlConfig.Companion Companion = new com.paypal.oslo.app.config.AppGraphQlConfig.Companion(null);
    public static final int $stable = 8;

    public AppGraphQlConfig(java.lang.String str, boolean z) {
        com.paypal.oslo.core.network.graphql.config.GraphQlCacheType.MemoryCache memoryCache;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.baseUrl = str;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.valueOf(z));
        this.getHighSpeedVideoFpsRanges = MutableStateFlow;
        this.persistedQueriesEnabled = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            memoryCache = new com.paypal.oslo.core.network.graphql.config.GraphQlCacheType.DbCache("apollo_cache.db");
        } else {
            memoryCache = com.paypal.oslo.core.network.graphql.config.GraphQlCacheType.MemoryCache.INSTANCE;
        }
        this.cacheType = memoryCache;
        this.clientName = com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient.COMPONENT;
        this.appVersion = com.paypal.oslo.app.BuildConfig.VERSION_NAME;
    }

    @Override // com.paypal.oslo.core.network.graphql.config.GraphQlConfig
    public final java.lang.String getBaseUrl() {
        return this.baseUrl;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/app/config/AppGraphQlConfig$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.paypal.oslo.core.network.graphql.config.GraphQlConfig
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getPersistedQueriesEnabled() {
        return this.persistedQueriesEnabled;
    }

    @Override // com.paypal.oslo.core.network.graphql.config.GraphQlConfig
    public final com.paypal.oslo.core.network.graphql.config.GraphQlCacheType getCacheType() {
        return this.cacheType;
    }

    @Override // com.paypal.oslo.core.network.graphql.config.GraphQlConfig
    public final java.lang.String getClientName() {
        return this.clientName;
    }

    @Override // com.paypal.oslo.core.network.graphql.config.GraphQlConfig
    public final java.lang.String getAppVersion() {
        return this.appVersion;
    }
}
