package com.izettle.android.auth.okhttp;

@kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u0001:\u0001GBk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\"\b\b\u0000\u0010\u001d*\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016¢\u0006\u0004\b\u001a\u0010 J5\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\"\b\b\u0000\u0010\u001d*\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0016¢\u0006\u0004\b\u001a\u0010#JK\u0010+\u001a\u00020'2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00160$2\u0018\u0010(\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0004\u0012\u00020'0&2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020'0&H\u0016¢\u0006\u0004\b+\u0010,JE\u0010+\u001a\u00020'2\u0006\u0010\u0017\u001a\u00020\u00162\u0018\u0010(\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0004\u0012\u00020'0&2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020'0&H\u0016¢\u0006\u0004\b+\u0010-J]\u0010+\u001a\u00020'\"\b\b\u0000\u0010\u001d*\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0018\u0010(\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0012\u0004\u0012\u00020'0&2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020'0&H\u0016¢\u0006\u0004\b+\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\b3\u00104R\u001a\u0010\u000b\u001a\u00020\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u00107R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b9\u0010:R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010>R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010?R\u001a\u0010\n\u001a\u00020\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b@\u00107R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bB\u0010CR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bE\u0010F"}, d2 = {"Lcom/izettle/android/auth/okhttp/OkHttpClientWrapper;", "Lcom/izettle/android/net/HttpClient;", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lcom/izettle/android/serialization/JsonDeserializer;", "jsonDeserializer", "", "Lcom/izettle/android/net/Interceptor;", "interceptors", "", "readTimeout", "connectTimeout", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lcom/izettle/android/net/CookiesStorage;", "cookiesStorage", "Lcom/izettle/android/net/Authenticator;", "authenticator", "<init>", "(Lokhttp3/OkHttpClient;Lcom/izettle/android/serialization/JsonDeserializer;Ljava/util/List;JJLjavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lcom/izettle/android/net/CookiesStorage;Lcom/izettle/android/net/Authenticator;)V", "Lcom/izettle/android/net/Request;", "request", "Lcom/izettle/android/net/Response;", "", "executeRequest", "(Lcom/izettle/android/net/Request;)Lcom/izettle/android/net/Response;", "", "T", "Lcom/izettle/android/serialization/JsonDeserializer$TypeWrapper;", "responseBodyTypeWrapper", "(Lcom/izettle/android/net/Request;Lcom/izettle/android/serialization/JsonDeserializer$TypeWrapper;)Lcom/izettle/android/net/Response;", "Lkotlin/reflect/KClass;", "responseBodyType", "(Lcom/izettle/android/net/Request;Lkotlin/reflect/KClass;)Lcom/izettle/android/net/Response;", "Lkotlin/Function0;", "requestFactory", "Lkotlin/Function1;", "", "onResponse", "", "onFailure", "executeRequestAsync", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "(Lcom/izettle/android/net/Request;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "(Lcom/izettle/android/net/Request;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/izettle/android/net/HttpClient$Builder;", "newBuilder", "()Lcom/izettle/android/net/HttpClient$Builder;", "Lcom/izettle/android/net/Authenticator;", "getAuthenticator", "()Lcom/izettle/android/net/Authenticator;", "J", "getConnectTimeout", "()J", "Lcom/izettle/android/net/CookiesStorage;", "getCookiesStorage", "()Lcom/izettle/android/net/CookiesStorage;", "Ljava/util/List;", "getInterceptors", "()Ljava/util/List;", "Lcom/izettle/android/serialization/JsonDeserializer;", "Lokhttp3/OkHttpClient;", "getReadTimeout", "Ljavax/net/ssl/SSLSocketFactory;", "getSslSocketFactory", "()Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/X509TrustManager;", "getTrustManager", "()Ljavax/net/ssl/X509TrustManager;", "Builder"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OkHttpClientWrapper implements com.izettle.android.net.HttpClient {
    private final com.izettle.android.net.Authenticator authenticator;
    private final long connectTimeout;
    private final com.izettle.android.net.CookiesStorage cookiesStorage;
    private final java.util.List<com.izettle.android.net.Interceptor> interceptors;
    private final com.izettle.android.serialization.JsonDeserializer jsonDeserializer;
    private okhttp3.OkHttpClient okHttpClient;
    private final long readTimeout;
    private final javax.net.ssl.SSLSocketFactory sslSocketFactory;
    private final javax.net.ssl.X509TrustManager trustManager;

    /* JADX WARN: Multi-variable type inference failed */
    public OkHttpClientWrapper(okhttp3.OkHttpClient okHttpClient, com.izettle.android.serialization.JsonDeserializer jsonDeserializer, java.util.List<? extends com.izettle.android.net.Interceptor> list, long j, long j2, javax.net.ssl.SSLSocketFactory sSLSocketFactory, javax.net.ssl.X509TrustManager x509TrustManager, com.izettle.android.net.CookiesStorage cookiesStorage, com.izettle.android.net.Authenticator authenticator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okHttpClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonDeserializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.okHttpClient = okHttpClient;
        this.jsonDeserializer = jsonDeserializer;
        this.interceptors = list;
        this.readTimeout = j;
        this.connectTimeout = j2;
        this.sslSocketFactory = sSLSocketFactory;
        this.trustManager = x509TrustManager;
        this.cookiesStorage = cookiesStorage;
        this.authenticator = authenticator;
    }

    public /* synthetic */ OkHttpClientWrapper(okhttp3.OkHttpClient okHttpClient, com.izettle.android.serialization.JsonDeserializer jsonDeserializer, java.util.List list, long j, long j2, javax.net.ssl.SSLSocketFactory sSLSocketFactory, javax.net.ssl.X509TrustManager x509TrustManager, com.izettle.android.net.CookiesStorage cookiesStorage, com.izettle.android.net.Authenticator authenticator, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(okHttpClient, jsonDeserializer, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 8) != 0 ? okHttpClient.readTimeoutMillis() : j, (i & 16) != 0 ? okHttpClient.connectTimeoutMillis() : j2, (i & 32) != 0 ? null : sSLSocketFactory, (i & 64) != 0 ? null : x509TrustManager, (i & 128) != 0 ? null : cookiesStorage, (i & 256) != 0 ? null : authenticator);
    }

    @Override // com.izettle.android.net.HttpClient
    public final java.util.List<com.izettle.android.net.Interceptor> getInterceptors() {
        return this.interceptors;
    }

    @Override // com.izettle.android.net.HttpClient
    public final long getReadTimeout() {
        return this.readTimeout;
    }

    @Override // com.izettle.android.net.HttpClient
    public final long getConnectTimeout() {
        return this.connectTimeout;
    }

    @Override // com.izettle.android.net.HttpClient
    public final javax.net.ssl.SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    @Override // com.izettle.android.net.HttpClient
    public final javax.net.ssl.X509TrustManager getTrustManager() {
        return this.trustManager;
    }

    @Override // com.izettle.android.net.HttpClient
    public final com.izettle.android.net.CookiesStorage getCookiesStorage() {
        return this.cookiesStorage;
    }

    @Override // com.izettle.android.net.HttpClient
    public final com.izettle.android.net.Authenticator getAuthenticator() {
        return this.authenticator;
    }

    @Override // com.izettle.android.net.HttpClient
    public final com.izettle.android.net.HttpClient.Builder newBuilder() {
        return new com.izettle.android.auth.okhttp.OkHttpClientWrapper.Builder(this);
    }

    @Override // com.izettle.android.net.HttpClient
    public final <T> com.izettle.android.net.Response<T> executeRequest(com.izettle.android.net.Request request, kotlin.reflect.KClass<T> responseBodyType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseBodyType, "");
        com.izettle.android.net.Response<java.lang.String> executeRequest = executeRequest(request);
        int code = executeRequest.getCode();
        com.izettle.android.net.Headers headers = executeRequest.getHeaders();
        java.lang.String body = executeRequest.getBody();
        return new com.izettle.android.net.Response<>(code, body != null ? this.jsonDeserializer.deserialize(body, responseBodyType) : null, executeRequest.getErrorBody(), headers, request, null, 32, null);
    }

    @Override // com.izettle.android.net.HttpClient
    public final <T> com.izettle.android.net.Response<T> executeRequest(com.izettle.android.net.Request request, com.izettle.android.serialization.JsonDeserializer.TypeWrapper<T> responseBodyTypeWrapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseBodyTypeWrapper, "");
        com.izettle.android.net.Response<java.lang.String> executeRequest = executeRequest(request);
        int code = executeRequest.getCode();
        com.izettle.android.net.Headers headers = executeRequest.getHeaders();
        java.lang.String body = executeRequest.getBody();
        return new com.izettle.android.net.Response<>(code, body != null ? this.jsonDeserializer.deserialize(body, responseBodyTypeWrapper) : null, executeRequest.getErrorBody(), headers, request, null, 32, null);
    }

    @Override // com.izettle.android.net.HttpClient
    public final <T> void executeRequestAsync(com.izettle.android.net.Request request, final kotlin.reflect.KClass<T> responseBodyType, final kotlin.jvm.functions.Function1<? super com.izettle.android.net.Response<T>, kotlin.Unit> onResponse, final kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onFailure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseBodyType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onFailure, "");
        this.okHttpClient.newCall(com.izettle.android.auth.okhttp.OkHttpExtKt.asOkHttpRequest(request)).enqueue(new okhttp3.Callback() { // from class: com.izettle.android.auth.okhttp.OkHttpClientWrapper$executeRequestAsync$1
            @Override // okhttp3.Callback
            public final void onFailure(okhttp3.Call call, java.io.IOException e) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
                onFailure.invoke(e);
            }

            @Override // okhttp3.Callback
            public final void onResponse(okhttp3.Call call, okhttp3.Response response) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                onResponse.invoke(com.izettle.android.auth.okhttp.OkHttpExtKt.asResponse(response, responseBodyType));
            }
        });
    }

    @Override // com.izettle.android.net.HttpClient
    public final void executeRequestAsync(com.izettle.android.net.Request request, final kotlin.jvm.functions.Function1<? super com.izettle.android.net.Response<java.lang.String>, kotlin.Unit> onResponse, final kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onFailure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onFailure, "");
        this.okHttpClient.newCall(com.izettle.android.auth.okhttp.OkHttpExtKt.asOkHttpRequest(request)).enqueue(new okhttp3.Callback() { // from class: com.izettle.android.auth.okhttp.OkHttpClientWrapper$executeRequestAsync$2
            @Override // okhttp3.Callback
            public final void onFailure(okhttp3.Call call, java.io.IOException e) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
                onFailure.invoke(e);
            }

            @Override // okhttp3.Callback
            public final void onResponse(okhttp3.Call call, okhttp3.Response response) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                onResponse.invoke(com.izettle.android.auth.okhttp.OkHttpExtKt.asResponse(response, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.String.class)));
            }
        });
    }

    @Override // com.izettle.android.net.HttpClient
    public final void executeRequestAsync(final kotlin.jvm.functions.Function0<com.izettle.android.net.Request> requestFactory, final kotlin.jvm.functions.Function1<? super com.izettle.android.net.Response<java.lang.String>, kotlin.Unit> onResponse, final kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onFailure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestFactory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onFailure, "");
        this.okHttpClient.dispatcher().executorService().submit(new java.lang.Runnable() { // from class: com.izettle.android.auth.okhttp.OkHttpClientWrapper$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.izettle.android.auth.okhttp.OkHttpClientWrapper.executeRequestAsync$lambda$2(kotlin.jvm.functions.Function0.this, onFailure, this, onResponse);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeRequestAsync$lambda$2(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, com.izettle.android.auth.okhttp.OkHttpClientWrapper okHttpClientWrapper, kotlin.jvm.functions.Function1 function12) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okHttpClientWrapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        try {
            okHttpClientWrapper.executeRequestAsync((com.izettle.android.net.Request) function0.invoke(), (kotlin.jvm.functions.Function1<? super com.izettle.android.net.Response<java.lang.String>, kotlin.Unit>) function12, (kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>) function1);
        } catch (java.lang.Throwable th) {
            function1.invoke(th);
        }
    }

    @Override // com.izettle.android.net.HttpClient
    public final com.izettle.android.net.Response<java.lang.String> executeRequest(com.izettle.android.net.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        return com.izettle.android.auth.okhttp.OkHttpExtKt.asResponse(this.okHttpClient.newCall(com.izettle.android.auth.okhttp.OkHttpExtKt.asOkHttpRequest(request)).execute(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.String.class));
    }

    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R$\u0010'\u001a\u0004\u0018\u00010\u00108\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0012\u001a\u0004\b(\u0010\u0014\"\u0004\b)\u0010\u0016R$\u0010+\u001a\u0004\u0018\u00010*8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00102\u001a\u0004\u0018\u0001018\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107"}, d2 = {"Lcom/izettle/android/auth/okhttp/OkHttpClientWrapper$Builder;", "Lcom/izettle/android/net/HttpClient$Builder;", "Lcom/izettle/android/auth/okhttp/OkHttpClientWrapper;", "okHttpClientWrapper", "<init>", "(Lcom/izettle/android/auth/okhttp/OkHttpClientWrapper;)V", "Lcom/izettle/android/net/HttpClient;", "build", "()Lcom/izettle/android/net/HttpClient;", "Lcom/izettle/android/net/Authenticator;", "authenticator", "Lcom/izettle/android/net/Authenticator;", "getAuthenticator", "()Lcom/izettle/android/net/Authenticator;", "setAuthenticator", "(Lcom/izettle/android/net/Authenticator;)V", "", "connectTimeout", "Ljava/lang/Long;", "getConnectTimeout", "()Ljava/lang/Long;", "setConnectTimeout", "(Ljava/lang/Long;)V", "Lcom/izettle/android/net/CookiesStorage;", "cookiesStorage", "Lcom/izettle/android/net/CookiesStorage;", "getCookiesStorage", "()Lcom/izettle/android/net/CookiesStorage;", "setCookiesStorage", "(Lcom/izettle/android/net/CookiesStorage;)V", "", "Lcom/izettle/android/net/Interceptor;", "interceptors", "Ljava/util/List;", "getInterceptors", "()Ljava/util/List;", "setInterceptors", "(Ljava/util/List;)V", "Lcom/izettle/android/auth/okhttp/OkHttpClientWrapper;", "readTimeout", "getReadTimeout", "setReadTimeout", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "getSslSocketFactory", "()Ljavax/net/ssl/SSLSocketFactory;", "setSslSocketFactory", "(Ljavax/net/ssl/SSLSocketFactory;)V", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "getTrustManager", "()Ljavax/net/ssl/X509TrustManager;", "setTrustManager", "(Ljavax/net/ssl/X509TrustManager;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder implements com.izettle.android.net.HttpClient.Builder {
        private com.izettle.android.net.Authenticator authenticator;
        private java.lang.Long connectTimeout;
        private com.izettle.android.net.CookiesStorage cookiesStorage;
        private java.util.List<com.izettle.android.net.Interceptor> interceptors;
        private final com.izettle.android.auth.okhttp.OkHttpClientWrapper okHttpClientWrapper;
        private java.lang.Long readTimeout;
        private javax.net.ssl.SSLSocketFactory sslSocketFactory;
        private javax.net.ssl.X509TrustManager trustManager;

        public Builder(com.izettle.android.auth.okhttp.OkHttpClientWrapper okHttpClientWrapper) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okHttpClientWrapper, "");
            this.okHttpClientWrapper = okHttpClientWrapper;
            this.interceptors = new java.util.ArrayList();
            this.cookiesStorage = okHttpClientWrapper.getCookiesStorage();
        }

        @Override // com.izettle.android.net.HttpClient.Builder
        public final com.izettle.android.net.HttpClient.Builder addInterceptor(com.izettle.android.net.Interceptor interceptor) {
            return com.izettle.android.net.HttpClient.Builder.DefaultImpls.addInterceptor(this, interceptor);
        }

        @Override // com.izettle.android.net.HttpClient.Builder
        public final com.izettle.android.net.HttpClient.Builder authenticator(com.izettle.android.net.Authenticator authenticator) {
            return com.izettle.android.net.HttpClient.Builder.DefaultImpls.authenticator(this, authenticator);
        }

        @Override // com.izettle.android.net.HttpClient.Builder
        public final com.izettle.android.net.HttpClient.Builder connectionTimeout(long j) {
            return com.izettle.android.net.HttpClient.Builder.DefaultImpls.connectionTimeout(this, j);
        }

        @Override // com.izettle.android.net.HttpClient.Builder
        public final com.izettle.android.net.HttpClient.Builder cookiesStorage(com.izettle.android.net.CookiesStorage cookiesStorage) {
            return com.izettle.android.net.HttpClient.Builder.DefaultImpls.cookiesStorage(this, cookiesStorage);
        }

        @Override // com.izettle.android.net.HttpClient.Builder
        public final com.izettle.android.net.HttpClient.Builder readTimeout(long j) {
            return com.izettle.android.net.HttpClient.Builder.DefaultImpls.readTimeout(this, j);
        }

        @Override // com.izettle.android.net.HttpClient.Builder
        public final com.izettle.android.net.HttpClient.Builder sslSocketFactory(javax.net.ssl.SSLSocketFactory sSLSocketFactory, javax.net.ssl.X509TrustManager x509TrustManager) {
            return com.izettle.android.net.HttpClient.Builder.DefaultImpls.sslSocketFactory(this, sSLSocketFactory, x509TrustManager);
        }

        @Override // com.izettle.android.net.HttpClient.Builder
        public final java.util.List<com.izettle.android.net.Interceptor> getInterceptors() {
            return this.interceptors;
        }

        @Override // com.izettle.android.net.HttpClient.Builder
        public final void setInterceptors(java.util.List<com.izettle.android.net.Interceptor> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.interceptors = list;
        }

        @Override // com.izettle.android.net.HttpClient.Builder
        public final com.izettle.android.net.Authenticator getAuthenticator() {
            return this.authenticator;
        }

        @Override // com.izettle.android.net.HttpClient.Builder
        public final void setAuthenticator(com.izettle.android.net.Authenticator authenticator) {
            this.authenticator = authenticator;
        }

        @Override // com.izettle.android.net.HttpClient.Builder
        public final java.lang.Long getConnectTimeout() {
            return this.connectTimeout;
        }

        @Override // com.izettle.android.net.HttpClient.Builder
        public final void setConnectTimeout(java.lang.Long l) {
            this.connectTimeout = l;
        }

        @Override // com.izettle.android.net.HttpClient.Builder
        public final java.lang.Long getReadTimeout() {
            return this.readTimeout;
        }

        @Override // com.izettle.android.net.HttpClient.Builder
        public final void setReadTimeout(java.lang.Long l) {
            this.readTimeout = l;
        }

        @Override // com.izettle.android.net.HttpClient.Builder
        public final javax.net.ssl.SSLSocketFactory getSslSocketFactory() {
            return this.sslSocketFactory;
        }

        @Override // com.izettle.android.net.HttpClient.Builder
        public final void setSslSocketFactory(javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactory = sSLSocketFactory;
        }

        @Override // com.izettle.android.net.HttpClient.Builder
        public final javax.net.ssl.X509TrustManager getTrustManager() {
            return this.trustManager;
        }

        @Override // com.izettle.android.net.HttpClient.Builder
        public final void setTrustManager(javax.net.ssl.X509TrustManager x509TrustManager) {
            this.trustManager = x509TrustManager;
        }

        @Override // com.izettle.android.net.HttpClient.Builder
        public final com.izettle.android.net.CookiesStorage getCookiesStorage() {
            return this.cookiesStorage;
        }

        @Override // com.izettle.android.net.HttpClient.Builder
        public final void setCookiesStorage(com.izettle.android.net.CookiesStorage cookiesStorage) {
            this.cookiesStorage = cookiesStorage;
        }

        @Override // com.izettle.android.net.HttpClient.Builder
        public final com.izettle.android.net.HttpClient build() {
            okhttp3.OkHttpClient.Builder newBuilder = this.okHttpClientWrapper.okHttpClient.newBuilder();
            java.lang.Long connectTimeout = getConnectTimeout();
            okhttp3.OkHttpClient.Builder connectTimeout2 = newBuilder.connectTimeout(connectTimeout != null ? connectTimeout.longValue() : this.okHttpClientWrapper.okHttpClient.connectTimeoutMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
            java.lang.Long readTimeout = getReadTimeout();
            okhttp3.OkHttpClient.Builder readTimeout2 = connectTimeout2.readTimeout(readTimeout != null ? readTimeout.longValue() : this.okHttpClientWrapper.okHttpClient.readTimeoutMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
            java.util.Iterator<T> it = getInterceptors().iterator();
            while (it.hasNext()) {
                readTimeout2.addInterceptor(com.izettle.android.auth.okhttp.OkHttpExtKt.asOkHttpInterceptor((com.izettle.android.net.Interceptor) it.next()));
            }
            if (getSslSocketFactory() != null && getTrustManager() != null) {
                javax.net.ssl.SSLSocketFactory sslSocketFactory = getSslSocketFactory();
                kotlin.jvm.internal.Intrinsics.checkNotNull(sslSocketFactory);
                javax.net.ssl.X509TrustManager trustManager = getTrustManager();
                kotlin.jvm.internal.Intrinsics.checkNotNull(trustManager);
                readTimeout2.sslSocketFactory(sslSocketFactory, trustManager);
            }
            com.izettle.android.net.CookiesStorage cookiesStorage = getCookiesStorage();
            if (cookiesStorage != null) {
                readTimeout2.cookieJar(new com.izettle.android.auth.okhttp.CookiesJarWrapper(cookiesStorage));
            }
            com.izettle.android.net.Authenticator authenticator = getAuthenticator();
            if (authenticator != null) {
                readTimeout2.authenticator(com.izettle.android.auth.okhttp.OkHttpExtKt.asOkHttpAuthenticator(authenticator));
            }
            return new com.izettle.android.auth.okhttp.OkHttpClientWrapper(readTimeout2.build(), this.okHttpClientWrapper.jsonDeserializer, null, 0L, 0L, getSslSocketFactory(), null, null, null, 476, null);
        }
    }
}
