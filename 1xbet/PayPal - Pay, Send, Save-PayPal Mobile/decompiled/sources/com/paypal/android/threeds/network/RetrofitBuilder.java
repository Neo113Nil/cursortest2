package com.paypal.android.threeds.network;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\"\u0010\u000b\u001a\u00020\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0013\u001a\u0006*\u00020\u00110\u00118CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u001f\u0010\u0018\u001a\u0006*\u00020\u00140\u00148GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u001d\u001a\u0006*\u00020\u00190\u00198GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/android/threeds/network/RetrofitBuilder;", "", "<init>", "()V", "Lokhttp3/OkHttpClient$Builder;", "httpClientBuilder$delegate", "Lkotlin/Lazy;", "getHttpClientBuilder", "()Lokhttp3/OkHttpClient$Builder;", "httpClientBuilder", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "Lretrofit2/Retrofit;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/android/threeds/network/api/ThreeDsServerApi;", "threeDsServerApi$delegate", "getThreeDsServerApi", "()Lcom/paypal/android/threeds/network/api/ThreeDsServerApi;", "threeDsServerApi", "Lcom/paypal/android/threeds/network/api/AcsApi;", "acsApi$delegate", "getAcsApi", "()Lcom/paypal/android/threeds/network/api/AcsApi;", "acsApi"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RetrofitBuilder {
    public static final int $stable;

    /* renamed from: acsApi$delegate, reason: from kotlin metadata */
    private static final kotlin.Lazy acsApi;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI;
    private static com.google.gson.Gson gson;

    /* renamed from: threeDsServerApi$delegate, reason: from kotlin metadata */
    private static final kotlin.Lazy threeDsServerApi;
    public static final com.paypal.android.threeds.network.RetrofitBuilder INSTANCE = new com.paypal.android.threeds.network.RetrofitBuilder();

    /* renamed from: httpClientBuilder$delegate, reason: from kotlin metadata */
    private static final kotlin.Lazy httpClientBuilder = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.android.threeds.network.RetrofitBuilder$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.android.threeds.network.RetrofitBuilder.$r8$lambda$mBP4dINszE87zGDp64Vu4eSrgeQ();
        }
    });

    public static /* synthetic */ boolean $r8$lambda$vbSapnisJ1VC2MwOSIjA_xmWR9c(java.lang.String str, javax.net.ssl.SSLSession sSLSession) {
        return true;
    }

    private RetrofitBuilder() {
    }

    static {
        com.google.gson.Gson create = new com.google.gson.GsonBuilder().setLenient().create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
        gson = create;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.android.threeds.network.RetrofitBuilder$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                retrofit2.Retrofit build;
                build = new retrofit2.Retrofit.Builder().baseUrl("https://te-threeds.qa.paypal.com:32548").addConverterFactory(retrofit2.converter.scalars.ScalarsConverterFactory.create()).addConverterFactory(retrofit2.converter.gson.GsonConverterFactory.create(com.paypal.android.threeds.network.RetrofitBuilder.gson)).client(com.paypal.android.threeds.network.RetrofitBuilder.INSTANCE.getHttpClientBuilder().build()).build();
                return build;
            }
        });
        threeDsServerApi = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.android.threeds.network.RetrofitBuilder$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.android.threeds.network.RetrofitBuilder.$r8$lambda$Pk_4NFSgOMRpYyaprhNRObAohQs();
            }
        });
        acsApi = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.android.threeds.network.RetrofitBuilder$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.android.threeds.network.RetrofitBuilder.$r8$lambda$x5ztvq6VXBnRDHrJcKOY6L0Mek4();
            }
        });
        $stable = 8;
    }

    public final okhttp3.OkHttpClient.Builder getHttpClientBuilder() {
        return (okhttp3.OkHttpClient.Builder) httpClientBuilder.getValue();
    }

    public final com.google.gson.Gson getGson() {
        return gson;
    }

    public final void setGson(com.google.gson.Gson gson2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gson2, "");
        gson = gson2;
    }

    public final com.paypal.android.threeds.network.api.ThreeDsServerApi getThreeDsServerApi() {
        return (com.paypal.android.threeds.network.api.ThreeDsServerApi) threeDsServerApi.getValue();
    }

    public final com.paypal.android.threeds.network.api.AcsApi getAcsApi() {
        return (com.paypal.android.threeds.network.api.AcsApi) acsApi.getValue();
    }

    public static /* synthetic */ com.paypal.android.threeds.network.api.ThreeDsServerApi $r8$lambda$Pk_4NFSgOMRpYyaprhNRObAohQs() {
        return (com.paypal.android.threeds.network.api.ThreeDsServerApi) ((retrofit2.Retrofit) getHighResolutionOutputSizeshNQ4ISI.getValue()).create(com.paypal.android.threeds.network.api.ThreeDsServerApi.class);
    }

    public static /* synthetic */ okhttp3.OkHttpClient.Builder $r8$lambda$mBP4dINszE87zGDp64Vu4eSrgeQ() {
        okhttp3.logging.HttpLoggingInterceptor httpLoggingInterceptor = new okhttp3.logging.HttpLoggingInterceptor(null, 1, null);
        httpLoggingInterceptor.setLevel(okhttp3.logging.HttpLoggingInterceptor.Level.NONE);
        javax.net.ssl.TrustManager[] trustManagerArr = {new javax.net.ssl.X509TrustManager() { // from class: com.paypal.android.threeds.network.RetrofitBuilder$getTrustManagerList$1
            @Override // javax.net.ssl.X509TrustManager
            public final java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return new java.security.cert.X509Certificate[0];
            }

            @Override // javax.net.ssl.X509TrustManager
            public final void checkServerTrusted(java.security.cert.X509Certificate[] chain, java.lang.String authType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authType, "");
            }

            @Override // javax.net.ssl.X509TrustManager
            public final void checkClientTrusted(java.security.cert.X509Certificate[] chain, java.lang.String authType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authType, "");
            }
        }};
        okhttp3.OkHttpClient.Builder builder = new okhttp3.OkHttpClient.Builder();
        builder.connectTimeout(10L, java.util.concurrent.TimeUnit.SECONDS);
        builder.addInterceptor(com.paypal.android.threeds.network.interceptors.NetworkConnectionInterceptor.INSTANCE);
        builder.addInterceptor(com.paypal.android.threeds.network.interceptors.HeaderInterceptor.INSTANCE);
        builder.addInterceptor(httpLoggingInterceptor);
        com.paypal.android.threeds.init.ConfigurationParams configParams = com.paypal.android.threeds.init.ThreeDsService.INSTANCE.getConfigParams();
        if ((configParams != null ? configParams.getCamera2StreamConfigurationMap() : null) == com.paypal.android.threeds.init.ThreeEnvironment.STAGING) {
            javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("SSL");
            sSLContext.init(null, trustManagerArr, new java.security.SecureRandom());
            javax.net.ssl.SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(socketFactory, "");
            javax.net.ssl.TrustManager trustManager = trustManagerArr[0];
            kotlin.jvm.internal.Intrinsics.checkNotNull(trustManager, "");
            builder.sslSocketFactory(socketFactory, (javax.net.ssl.X509TrustManager) trustManager);
            builder.hostnameVerifier(new javax.net.ssl.HostnameVerifier() { // from class: com.paypal.android.threeds.network.RetrofitBuilder$$ExternalSyntheticLambda0
                @Override // javax.net.ssl.HostnameVerifier
                public final boolean verify(java.lang.String str, javax.net.ssl.SSLSession sSLSession) {
                    return com.paypal.android.threeds.network.RetrofitBuilder.$r8$lambda$vbSapnisJ1VC2MwOSIjA_xmWR9c(str, sSLSession);
                }
            });
        }
        return builder;
    }

    public static /* synthetic */ com.paypal.android.threeds.network.api.AcsApi $r8$lambda$x5ztvq6VXBnRDHrJcKOY6L0Mek4() {
        return (com.paypal.android.threeds.network.api.AcsApi) ((retrofit2.Retrofit) getHighResolutionOutputSizeshNQ4ISI.getValue()).create(com.paypal.android.threeds.network.api.AcsApi.class);
    }
}
