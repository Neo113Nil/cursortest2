package com.paypal.oslo.app.config;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B$\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0011\u0010\u0007\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR%\u0010\u0007\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00178\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/app/config/AppHttpConfig;", "Lcom/paypal/oslo/core/network/http/config/HttpConfig;", "Lcom/paypal/oslo/app/config/SSLConfig;", "sslConfig", "", "Lokhttp3/Interceptor;", "Lkotlin/jvm/JvmSuppressWildcards;", "interceptors", "<init>", "(Lcom/paypal/oslo/app/config/SSLConfig;Ljava/util/List;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/app/config/SSLConfig;", "Ljava/util/List;", "getInterceptors", "()Ljava/util/List;", "", "getPinSslCert", "()Z", "pinSslCert", "Lkotlinx/coroutines/flow/StateFlow;", "getVerifySslCert", "()Lkotlinx/coroutines/flow/StateFlow;", "verifySslCert", "Lcom/paypal/oslo/core/network/http/config/CacheType;", "cacheType", "Lcom/paypal/oslo/core/network/http/config/CacheType;", "getCacheType", "()Lcom/paypal/oslo/core/network/http/config/CacheType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppHttpConfig implements com.paypal.oslo.core.network.http.config.HttpConfig {
    public static final int $stable = 8;
    private final com.paypal.oslo.app.config.SSLConfig Camera2StreamConfigurationMap;
    private final com.paypal.oslo.core.network.http.config.CacheType cacheType;
    private final java.util.List<okhttp3.Interceptor> interceptors;

    @javax.inject.Inject
    public AppHttpConfig(com.paypal.oslo.app.config.SSLConfig sSLConfig, java.util.List<okhttp3.Interceptor> list) {
        com.paypal.oslo.core.network.http.config.CacheType.NoCache noCache;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sSLConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.Camera2StreamConfigurationMap = sSLConfig;
        this.interceptors = list;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            noCache = new com.paypal.oslo.core.network.http.config.CacheType.FileCache("http_cache", 5242880L);
        } else {
            noCache = com.paypal.oslo.core.network.http.config.CacheType.NoCache.INSTANCE;
        }
        this.cacheType = noCache;
    }

    @Override // com.paypal.oslo.core.network.http.config.HttpConfig
    public final /* bridge */ long getCallTimeoutSeconds() {
        return super.getCallTimeoutSeconds();
    }

    @Override // com.paypal.oslo.core.network.http.config.HttpConfig
    public final /* bridge */ long getConnectTimeoutSeconds() {
        return super.getConnectTimeoutSeconds();
    }

    @Override // com.paypal.oslo.core.network.http.config.HttpConfig
    public final /* bridge */ long getReadTimeoutSeconds() {
        return super.getReadTimeoutSeconds();
    }

    @Override // com.paypal.oslo.core.network.http.config.HttpConfig
    public final /* bridge */ long getWriteTimeoutSeconds() {
        return super.getWriteTimeoutSeconds();
    }

    @Override // com.paypal.oslo.core.network.http.config.HttpConfig
    public final java.util.List<okhttp3.Interceptor> getInterceptors() {
        return this.interceptors;
    }

    @Override // com.paypal.oslo.core.network.http.config.HttpConfig
    public final boolean getPinSslCert() {
        return this.Camera2StreamConfigurationMap.getPinSslCert();
    }

    @Override // com.paypal.oslo.core.network.http.config.HttpConfig
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getVerifySslCert() {
        return this.Camera2StreamConfigurationMap.getVerifySslCert();
    }

    @Override // com.paypal.oslo.core.network.http.config.HttpConfig
    public final com.paypal.oslo.core.network.http.config.CacheType getCacheType() {
        return this.cacheType;
    }
}
