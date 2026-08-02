package com.paypal.oslo.core.network.http;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JP\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0011\u0010\u000b\u001a\r\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/core/network/http/OkHttpClientFactory;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/core/network/http/config/HttpConfig;", "config", "", "Lokhttp3/Interceptor;", "Lkotlin/jvm/JvmSuppressWildcards;", "authTypeInterceptors", "Lcom/paypal/oslo/core/network/http/cronet/CronetEngineFactory;", "cronetEngineFactory", "Lcom/paypal/oslo/core/network/http/cronet/CronetInterceptorFactory;", "cronetInterceptorFactory", "Lkotlin/Function0;", "", "isOnline", "Lokhttp3/OkHttpClient;", "create", "(Landroid/content/Context;Lcom/paypal/oslo/core/network/http/config/HttpConfig;Ljava/util/Set;Lcom/paypal/oslo/core/network/http/cronet/CronetEngineFactory;Lcom/paypal/oslo/core/network/http/cronet/CronetInterceptorFactory;Lkotlin/jvm/functions/Function0;)Lokhttp3/OkHttpClient;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OkHttpClientFactory {
    public static final com.paypal.oslo.core.network.http.OkHttpClientFactory INSTANCE = new com.paypal.oslo.core.network.http.OkHttpClientFactory();

    /* renamed from: $r8$lambda$NioCRvuZnC-uBxS2ovMDp_evb4s, reason: not valid java name */
    public static /* synthetic */ boolean m11661$r8$lambda$NioCRvuZnCuBxS2ovMDp_evb4s() {
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$w3BqT4pFTjcOrQoKQ6yCpymjDqA(java.lang.String str, javax.net.ssl.SSLSession sSLSession) {
        return true;
    }

    private OkHttpClientFactory() {
    }

    public static /* synthetic */ okhttp3.OkHttpClient create$default(com.paypal.oslo.core.network.http.OkHttpClientFactory okHttpClientFactory, android.content.Context context, com.paypal.oslo.core.network.http.config.HttpConfig httpConfig, java.util.Set set, com.paypal.oslo.core.network.http.cronet.CronetEngineFactory cronetEngineFactory, com.paypal.oslo.core.network.http.cronet.CronetInterceptorFactory cronetInterceptorFactory, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 32) != 0) {
            function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.network.http.OkHttpClientFactory$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(com.paypal.oslo.core.network.http.OkHttpClientFactory.m11661$r8$lambda$NioCRvuZnCuBxS2ovMDp_evb4s());
                }
            };
        }
        return okHttpClientFactory.create(context, httpConfig, set, cronetEngineFactory, cronetInterceptorFactory, function0);
    }

    public final okhttp3.OkHttpClient create(android.content.Context context, com.paypal.oslo.core.network.http.config.HttpConfig config, java.util.Set<okhttp3.Interceptor> authTypeInterceptors, com.paypal.oslo.core.network.http.cronet.CronetEngineFactory cronetEngineFactory, com.paypal.oslo.core.network.http.cronet.CronetInterceptorFactory cronetInterceptorFactory, kotlin.jvm.functions.Function0<java.lang.Boolean> isOnline) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authTypeInterceptors, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cronetEngineFactory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cronetInterceptorFactory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isOnline, "");
        boolean booleanValue = config.getVerifySslCert().getValue().booleanValue();
        okhttp3.OkHttpClient.Builder builder = new okhttp3.OkHttpClient.Builder();
        boolean pinSslCert = config.getPinSslCert();
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.network.http.LoggerKt.log, "enable SSL pinning", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("enable", java.lang.Boolean.valueOf(pinSslCert))), null, 4, null);
        if (pinSslCert) {
            okhttp3.CertificatePinner.Builder builder2 = new okhttp3.CertificatePinner.Builder();
            for (java.lang.String str : com.paypal.oslo.core.network.http.CertificatePins.INSTANCE.getALL_DOMAINS()) {
                java.util.Iterator<T> it = com.paypal.oslo.core.network.http.CertificatePins.INSTANCE.getALL_PINS().iterator();
                while (it.hasNext()) {
                    builder2.add(str, (java.lang.String) it.next());
                }
            }
            builder.certificatePinner(builder2.build());
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.network.http.LoggerKt.log, "configure SSL verification", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("verify", java.lang.Boolean.valueOf(booleanValue))), null, 4, null);
        if (!booleanValue) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.network.http.LoggerKt.log, "SSL certificate verification disabled - this should only be used for internal staging servers", null, null, 6, null);
            javax.net.ssl.X509TrustManager x509TrustManager = new javax.net.ssl.X509TrustManager() { // from class: com.paypal.oslo.core.network.http.OkHttpClientFactory$configureSSLVerification$trustAllCerts$1
                @Override // javax.net.ssl.X509TrustManager
                public final java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return new java.security.cert.X509Certificate[0];
                }

                @Override // javax.net.ssl.X509TrustManager
                public final void checkServerTrusted(java.security.cert.X509Certificate[] certs, java.lang.String authType) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(certs, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authType, "");
                }

                @Override // javax.net.ssl.X509TrustManager
                public final void checkClientTrusted(java.security.cert.X509Certificate[] certs, java.lang.String authType) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(certs, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authType, "");
                }
            };
            javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLS");
            sSLContext.init(null, new javax.net.ssl.TrustManager[]{x509TrustManager}, new java.security.SecureRandom());
            javax.net.ssl.SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            kotlin.jvm.internal.Intrinsics.checkNotNull(socketFactory);
            builder.sslSocketFactory(socketFactory, x509TrustManager);
            builder.hostnameVerifier(new javax.net.ssl.HostnameVerifier() { // from class: com.paypal.oslo.core.network.http.OkHttpClientFactory$$ExternalSyntheticLambda1
                @Override // javax.net.ssl.HostnameVerifier
                public final boolean verify(java.lang.String str2, javax.net.ssl.SSLSession sSLSession) {
                    return com.paypal.oslo.core.network.http.OkHttpClientFactory.$r8$lambda$w3BqT4pFTjcOrQoKQ6yCpymjDqA(str2, sSLSession);
                }
            });
        }
        com.paypal.oslo.core.network.http.config.CacheType cacheType = config.getCacheType();
        java.io.File cacheDir = context.getCacheDir();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cacheDir, "");
        if (cacheType instanceof com.paypal.oslo.core.network.http.config.CacheType.FileCache) {
            com.paypal.oslo.core.network.http.config.CacheType.FileCache fileCache = (com.paypal.oslo.core.network.http.config.CacheType.FileCache) cacheType;
            builder.cache(new okhttp3.Cache(new java.io.File(cacheDir, fileCache.getCacheDir()), fileCache.getCacheSizeBytes()));
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.network.http.LoggerKt.log, "File caching applied to OkHttpClient.", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cacheDir", fileCache.getCacheDir()), kotlin.TuplesKt.to("cacheSizeBytes", java.lang.Long.valueOf(fileCache.getCacheSizeBytes()))), null, 4, null);
        } else {
            if (!(cacheType instanceof com.paypal.oslo.core.network.http.config.CacheType.InMemoryCache) && !(cacheType instanceof com.paypal.oslo.core.network.http.config.CacheType.FileCacheNoHttp) && !kotlin.jvm.internal.Intrinsics.areEqual(cacheType, com.paypal.oslo.core.network.http.config.CacheType.NoCache.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.network.http.LoggerKt.log, "No caching applied to OkHttpClient.", null, null, 6, null);
        }
        builder.connectTimeout(config.getConnectTimeoutSeconds(), java.util.concurrent.TimeUnit.SECONDS);
        builder.readTimeout(config.getReadTimeoutSeconds(), java.util.concurrent.TimeUnit.SECONDS);
        builder.writeTimeout(config.getWriteTimeoutSeconds(), java.util.concurrent.TimeUnit.SECONDS);
        builder.callTimeout(config.getCallTimeoutSeconds(), java.util.concurrent.TimeUnit.SECONDS);
        java.util.Iterator<T> it2 = authTypeInterceptors.iterator();
        while (it2.hasNext()) {
            builder.addInterceptor((okhttp3.Interceptor) it2.next());
        }
        java.util.List<okhttp3.Interceptor> interceptors = config.getInterceptors();
        for (okhttp3.Interceptor interceptor : interceptors) {
            builder.addInterceptor(interceptor);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.network.http.LoggerKt.log, "Adding interceptor", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.CLASS, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(interceptor.getClass()).getGetHighResolutionOutputSizeshNQ4ISI())), null, 4, null);
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.network.http.LoggerKt.log, "Interceptors added", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, java.lang.Integer.valueOf(interceptors.size()))), null, 4, null);
        org.chromium.net.CronetEngine createEngine = cronetEngineFactory.createEngine(context, config.getPinSslCert(), booleanValue, config.getCacheType());
        if (createEngine != null) {
            if ((config.getCacheType() instanceof com.paypal.oslo.core.network.http.config.CacheType.FileCache) || (config.getCacheType() instanceof com.paypal.oslo.core.network.http.config.CacheType.InMemoryCache)) {
                builder.addInterceptor(new com.paypal.oslo.core.network.http.cache.OfflineCachePolicyInterceptor(isOnline));
            }
            builder.addInterceptor(cronetInterceptorFactory.createInterceptor(createEngine));
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.network.http.LoggerKt.log, "Cronet enabled in OkHttpClient", null, null, 6, null);
        } else {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.network.http.LoggerKt.log, "Cronet engine is null, falling back to standard OkHttpClient", null, null, 6, null);
        }
        okhttp3.OkHttpClient build = builder.followRedirects(false).followSslRedirects(false).build();
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.network.http.LoggerKt.log, "OkHttpClient initialization completed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("connect_timeout_seconds", java.lang.Long.valueOf(config.getConnectTimeoutSeconds())), kotlin.TuplesKt.to("read_timeout_seconds", java.lang.Long.valueOf(config.getReadTimeoutSeconds())), kotlin.TuplesKt.to("write_timeout_seconds", java.lang.Long.valueOf(config.getWriteTimeoutSeconds())), kotlin.TuplesKt.to("call_timeout_seconds", java.lang.Long.valueOf(config.getCallTimeoutSeconds()))), null, 4, null);
        return build;
    }
}
