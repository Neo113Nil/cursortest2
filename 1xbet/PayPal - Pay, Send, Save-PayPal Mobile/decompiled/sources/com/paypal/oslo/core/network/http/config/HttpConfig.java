package com.paypal.oslo.core.network.http.config;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/network/http/config/HttpConfig;", "", "", "getPinSslCert", "()Z", "pinSslCert", "Lkotlinx/coroutines/flow/StateFlow;", "getVerifySslCert", "()Lkotlinx/coroutines/flow/StateFlow;", "verifySslCert", "Lcom/paypal/oslo/core/network/http/config/CacheType;", "getCacheType", "()Lcom/paypal/oslo/core/network/http/config/CacheType;", "cacheType", "", "Lokhttp3/Interceptor;", "getInterceptors", "()Ljava/util/List;", "interceptors", "", "getConnectTimeoutSeconds", "()J", "connectTimeoutSeconds", "getReadTimeoutSeconds", "readTimeoutSeconds", "getWriteTimeoutSeconds", "writeTimeoutSeconds", "getCallTimeoutSeconds", "callTimeoutSeconds"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface HttpConfig {
    com.paypal.oslo.core.network.http.config.CacheType getCacheType();

    default long getCallTimeoutSeconds() {
        return 90L;
    }

    default long getConnectTimeoutSeconds() {
        return 30L;
    }

    java.util.List<okhttp3.Interceptor> getInterceptors();

    boolean getPinSslCert();

    default long getReadTimeoutSeconds() {
        return 60L;
    }

    kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getVerifySslCert();

    default long getWriteTimeoutSeconds() {
        return 60L;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static long getConnectTimeoutSeconds(com.paypal.oslo.core.network.http.config.HttpConfig httpConfig) {
            return com.paypal.oslo.core.network.http.config.HttpConfig.super.getConnectTimeoutSeconds();
        }

        @java.lang.Deprecated
        public static long getReadTimeoutSeconds(com.paypal.oslo.core.network.http.config.HttpConfig httpConfig) {
            return com.paypal.oslo.core.network.http.config.HttpConfig.super.getReadTimeoutSeconds();
        }

        @java.lang.Deprecated
        public static long getWriteTimeoutSeconds(com.paypal.oslo.core.network.http.config.HttpConfig httpConfig) {
            return com.paypal.oslo.core.network.http.config.HttpConfig.super.getWriteTimeoutSeconds();
        }

        @java.lang.Deprecated
        public static long getCallTimeoutSeconds(com.paypal.oslo.core.network.http.config.HttpConfig httpConfig) {
            return com.paypal.oslo.core.network.http.config.HttpConfig.super.getCallTimeoutSeconds();
        }
    }
}
