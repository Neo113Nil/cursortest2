package com.paypal.oslo.core.network.http.di;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/network/http/di/HttpModule;", "", "Lcom/paypal/oslo/core/network/http/cronet/CronetBuilderProviderImpl;", "impl", "Lcom/paypal/oslo/core/network/http/cronet/CronetBuilderProvider;", "bindCronetBuilderProvider", "(Lcom/paypal/oslo/core/network/http/cronet/CronetBuilderProviderImpl;)Lcom/paypal/oslo/core/network/http/cronet/CronetBuilderProvider;", "Lcom/paypal/oslo/core/network/http/cronet/CronetEngineFactoryImpl;", "Lcom/paypal/oslo/core/network/http/cronet/CronetEngineFactory;", "bindCronetEngineFactory", "(Lcom/paypal/oslo/core/network/http/cronet/CronetEngineFactoryImpl;)Lcom/paypal/oslo/core/network/http/cronet/CronetEngineFactory;", "Lcom/paypal/oslo/core/network/http/cronet/CronetInterceptorFactoryImpl;", "Lcom/paypal/oslo/core/network/http/cronet/CronetInterceptorFactory;", "bindCronetInterceptorFactory", "(Lcom/paypal/oslo/core/network/http/cronet/CronetInterceptorFactoryImpl;)Lcom/paypal/oslo/core/network/http/cronet/CronetInterceptorFactory;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes4.dex */
public interface HttpModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.network.http.di.HttpModule.Companion INSTANCE = com.paypal.oslo.core.network.http.di.HttpModule.Companion.getHighSpeedVideoFpsRangesFor;

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.network.http.cronet.CronetBuilderProvider bindCronetBuilderProvider(com.paypal.oslo.core.network.http.cronet.CronetBuilderProviderImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.network.http.cronet.CronetEngineFactory bindCronetEngineFactory(com.paypal.oslo.core.network.http.cronet.CronetEngineFactoryImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.network.http.cronet.CronetInterceptorFactory bindCronetInterceptorFactory(com.paypal.oslo.core.network.http.cronet.CronetInterceptorFactoryImpl impl);

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006JT\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0011\u0010\u000e\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\r0\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/core/network/http/di/HttpModule$Companion;", "", "<init>", "()V", "Lkotlinx/coroutines/CoroutineScope;", "provideNetworkScope", "()Lkotlinx/coroutines/CoroutineScope;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/core/network/http/config/HttpConfig;", "config", "", "Lokhttp3/Interceptor;", "Lkotlin/jvm/JvmSuppressWildcards;", "authTypeInterceptors", "Lcom/paypal/oslo/core/network/http/cronet/CronetEngineFactory;", "cronetEngineFactory", "Lcom/paypal/oslo/core/network/http/cronet/CronetInterceptorFactory;", "cronetInterceptorFactory", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lcom/paypal/oslo/core/network/connectivity/NetworkConnectivityChecker;", "networkConnectivityChecker", "Lcom/paypal/oslo/core/network/http/DynamicOkHttpClientProvider;", "provideDynamicOkHttpClientProvider", "(Landroid/content/Context;Lcom/paypal/oslo/core/network/http/config/HttpConfig;Ljava/util/Set;Lcom/paypal/oslo/core/network/http/cronet/CronetEngineFactory;Lcom/paypal/oslo/core/network/http/cronet/CronetInterceptorFactory;Lkotlinx/coroutines/CoroutineScope;Lcom/paypal/oslo/core/network/connectivity/NetworkConnectivityChecker;)Lcom/paypal/oslo/core/network/http/DynamicOkHttpClientProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.core.network.http.di.HttpModule.Companion getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.core.network.http.di.HttpModule.Companion();

        private Companion() {
        }

        @dagger.Provides
        @javax.inject.Singleton
        public final kotlinx.coroutines.CoroutineScope provideNetworkScope() {
            return kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(kotlinx.coroutines.Dispatchers.getDefault()));
        }

        @dagger.Provides
        @javax.inject.Singleton
        public final com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider provideDynamicOkHttpClientProvider(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.oslo.core.network.http.config.HttpConfig config, java.util.Set<okhttp3.Interceptor> authTypeInterceptors, com.paypal.oslo.core.network.http.cronet.CronetEngineFactory cronetEngineFactory, com.paypal.oslo.core.network.http.cronet.CronetInterceptorFactory cronetInterceptorFactory, kotlinx.coroutines.CoroutineScope scope, com.paypal.oslo.core.network.connectivity.NetworkConnectivityChecker networkConnectivityChecker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authTypeInterceptors, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cronetEngineFactory, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cronetInterceptorFactory, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkConnectivityChecker, "");
            return new com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider(context, config, authTypeInterceptors, cronetEngineFactory, cronetInterceptorFactory, scope, new com.paypal.oslo.core.network.http.NetworkConnectivityIsOnlineProvider(networkConnectivityChecker));
        }
    }
}
