package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a:\u0010\f\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\r\u001a+\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0019\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/zettle/sdk/Configuration;", "setStagingEnvironment", "(Lcom/zettle/sdk/Configuration;)Lcom/zettle/sdk/Configuration;", "Lcom/zettle/sdk/commons/util/ExternalConfig;", "Landroid/content/Context;", "context", "", com.datadog.android.rum.internal.domain.event.RumEventDeserializer.TELEMETRY_TYPE_DEBUG, "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "init", "toConfig", "(Lcom/zettle/sdk/commons/util/ExternalConfig;Landroid/content/Context;ZLkotlin/jvm/functions/Function1;)Lcom/zettle/sdk/Configuration;", "Lcom/izettle/android/auth/ZettleAuth;", "zettleAuth", "Lcom/izettle/android/auth/BackendEnvironment;", "environment", "Lcom/zettle/sdk/core/auth/ScopeProvider;", "scopeProvider", "withAuth", "(Lcom/zettle/sdk/Configuration;Lcom/izettle/android/auth/ZettleAuth;Lcom/izettle/android/auth/BackendEnvironment;Lcom/zettle/sdk/core/auth/ScopeProvider;)Lcom/zettle/sdk/Configuration;", "withEnvironment", "(Lcom/zettle/sdk/Configuration;Lcom/izettle/android/auth/BackendEnvironment;)Lcom/zettle/sdk/Configuration;", "Lcom/zettle/sdk/commons/util/Log$Strategy;", "logStrategy", "withLogStrategy", "(Lcom/zettle/sdk/Configuration;Lcom/zettle/sdk/commons/util/Log$Strategy;)Lcom/zettle/sdk/Configuration;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ConfigurationExtKt {
    public static final com.zettle.sdk.Configuration toConfig(com.zettle.sdk.commons.util.ExternalConfig externalConfig, android.content.Context context, boolean z, kotlin.jvm.functions.Function1<? super com.zettle.sdk.Configuration, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.zettle.sdk.Configuration configuration = new com.zettle.sdk.Configuration(context, com.zettle.sdk.ConfigurationSettingsKt.createConfigurationSettings());
        function1.invoke(configuration);
        configuration.setExternal$core_publicRelease(externalConfig);
        configuration.setDebug$core_publicRelease(z);
        return configuration;
    }

    public static /* synthetic */ com.zettle.sdk.Configuration withAuth$default(com.zettle.sdk.Configuration configuration, com.izettle.android.auth.ZettleAuth zettleAuth, com.izettle.android.auth.BackendEnvironment backendEnvironment, com.zettle.sdk.core.auth.ScopeProvider scopeProvider, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            scopeProvider = com.zettle.sdk.core.auth.ScopeProviderKt.getDefaultScopeProvider();
        }
        return withAuth(configuration, zettleAuth, backendEnvironment, scopeProvider);
    }

    public static final com.zettle.sdk.Configuration withAuth(com.zettle.sdk.Configuration configuration, final com.izettle.android.auth.ZettleAuth zettleAuth, com.izettle.android.auth.BackendEnvironment backendEnvironment, final com.zettle.sdk.core.auth.ScopeProvider scopeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleAuth, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backendEnvironment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scopeProvider, "");
        configuration.setDeviceId$core_publicRelease(zettleAuth.getClientInfo().getUniqueDeviceId());
        configuration.setBackendEnvironment$core_publicRelease(backendEnvironment);
        configuration.auth(new kotlin.jvm.functions.Function1<com.zettle.sdk.AuthConfig, kotlin.Unit>() { // from class: com.zettle.sdk.ConfigurationExtKt$withAuth$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.AuthConfig authConfig) {
                getHighSpeedVideoFpsRangesFor(authConfig);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRangesFor(com.zettle.sdk.AuthConfig authConfig) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authConfig, "");
                authConfig.setTokenProvider(new com.zettle.sdk.DefaultAuthProvider(com.zettle.sdk.core.auth.AuthProvider.INSTANCE.create(com.izettle.android.auth.ZettleAuth.this, scopeProvider)));
                authConfig.setScopeProvider(scopeProvider);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        return configuration;
    }

    public static final com.zettle.sdk.Configuration withLogStrategy(com.zettle.sdk.Configuration configuration, com.zettle.sdk.commons.util.Log.Strategy strategy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "");
        com.zettle.sdk.commons.util.Log.INSTANCE.setStrategy(new com.zettle.sdk.core.log.CombinedLogStrategy(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.zettle.sdk.commons.util.Log.Strategy[]{com.zettle.sdk.commons.util.Log.INSTANCE.getStrategy(), strategy})));
        return configuration;
    }

    public static final com.zettle.sdk.Configuration withEnvironment(com.zettle.sdk.Configuration configuration, com.izettle.android.auth.BackendEnvironment backendEnvironment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backendEnvironment, "");
        configuration.setBackendEnvironment$core_publicRelease(backendEnvironment);
        return configuration;
    }

    public static final com.zettle.sdk.Configuration setStagingEnvironment(com.zettle.sdk.Configuration configuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        configuration.setEnvironment(com.zettle.sdk.core.auth.Staging.INSTANCE);
        return configuration;
    }
}
