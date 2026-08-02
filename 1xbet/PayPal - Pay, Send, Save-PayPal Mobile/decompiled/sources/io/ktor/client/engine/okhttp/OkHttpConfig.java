package io.ktor.client.engine.okhttp;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\t\u001a\u00020\u00062\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u000eR3\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00078\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\nR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010#\u001a\u0004\u0018\u00010\"8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010("}, d2 = {"Lio/ktor/client/engine/okhttp/OkHttpConfig;", "Lio/ktor/client/engine/HttpClientEngineConfig;", "<init>", "()V", "Lkotlin/Function1;", "Lokhttp3/OkHttpClient$Builder;", "", "Lkotlin/ExtensionFunctionType;", "block", "config", "(Lkotlin/jvm/functions/Function1;)V", "Lokhttp3/Interceptor;", "interceptor", "addInterceptor", "(Lokhttp3/Interceptor;)V", "addNetworkInterceptor", "Lkotlin/jvm/functions/Function1;", "getConfig$ktor_client_okhttp", "()Lkotlin/jvm/functions/Function1;", "setConfig$ktor_client_okhttp", "Lokhttp3/OkHttpClient;", "preconfigured", "Lokhttp3/OkHttpClient;", "getPreconfigured", "()Lokhttp3/OkHttpClient;", "setPreconfigured", "(Lokhttp3/OkHttpClient;)V", "", "clientCacheSize", com.visa.cbp.getEncExpo.warmup, "getClientCacheSize", "()I", "setClientCacheSize", "(I)V", "Lokhttp3/WebSocket$Factory;", "webSocketFactory", "Lokhttp3/WebSocket$Factory;", "getWebSocketFactory", "()Lokhttp3/WebSocket$Factory;", "setWebSocketFactory", "(Lokhttp3/WebSocket$Factory;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class OkHttpConfig extends io.ktor.client.engine.HttpClientEngineConfig {
    private okhttp3.OkHttpClient preconfigured;
    private okhttp3.WebSocket.Factory webSocketFactory;
    private kotlin.jvm.functions.Function1<? super okhttp3.OkHttpClient.Builder, kotlin.Unit> config = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.engine.okhttp.OkHttpConfig$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return io.ktor.client.engine.okhttp.OkHttpConfig.m23246$r8$lambda$QTtPqzapY8gxbT2lKDdi8nQqco((okhttp3.OkHttpClient.Builder) obj);
        }
    };
    private int clientCacheSize = 10;

    public final kotlin.jvm.functions.Function1<okhttp3.OkHttpClient.Builder, kotlin.Unit> getConfig$ktor_client_okhttp() {
        return this.config;
    }

    public final void setConfig$ktor_client_okhttp(kotlin.jvm.functions.Function1<? super okhttp3.OkHttpClient.Builder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.config = function1;
    }

    public final okhttp3.OkHttpClient getPreconfigured() {
        return this.preconfigured;
    }

    public final void setPreconfigured(okhttp3.OkHttpClient okHttpClient) {
        this.preconfigured = okHttpClient;
    }

    public final int getClientCacheSize() {
        return this.clientCacheSize;
    }

    public final void setClientCacheSize(int i) {
        this.clientCacheSize = i;
    }

    public final okhttp3.WebSocket.Factory getWebSocketFactory() {
        return this.webSocketFactory;
    }

    public final void setWebSocketFactory(okhttp3.WebSocket.Factory factory) {
        this.webSocketFactory = factory;
    }

    public final void config(final kotlin.jvm.functions.Function1<? super okhttp3.OkHttpClient.Builder, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        final kotlin.jvm.functions.Function1<? super okhttp3.OkHttpClient.Builder, kotlin.Unit> function1 = this.config;
        this.config = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.engine.okhttp.OkHttpConfig$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.engine.okhttp.OkHttpConfig.m23247$r8$lambda$kdKyojOqCBOg7mWJHwZK0jDgA0(kotlin.jvm.functions.Function1.this, block, (okhttp3.OkHttpClient.Builder) obj);
            }
        };
    }

    public final void addInterceptor(final okhttp3.Interceptor interceptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interceptor, "");
        config(new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.engine.okhttp.OkHttpConfig$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.engine.okhttp.OkHttpConfig.$r8$lambda$E4K4RcKUxQjnpyjFnBYDSRGCtJ8(okhttp3.Interceptor.this, (okhttp3.OkHttpClient.Builder) obj);
            }
        });
    }

    public final void addNetworkInterceptor(final okhttp3.Interceptor interceptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interceptor, "");
        config(new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.engine.okhttp.OkHttpConfig$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.engine.okhttp.OkHttpConfig.$r8$lambda$DTP0oAdSXAogQrBOUJ5cOaM7ISk(okhttp3.Interceptor.this, (okhttp3.OkHttpClient.Builder) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DTP0oAdSXAogQrBOUJ5cOaM7ISk(okhttp3.Interceptor interceptor, okhttp3.OkHttpClient.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        builder.addNetworkInterceptor(interceptor);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$E4K4RcKUxQjnpyjFnBYDSRGCtJ8(okhttp3.Interceptor interceptor, okhttp3.OkHttpClient.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        builder.addInterceptor(interceptor);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Q-TtPqzapY8gxbT2lKDdi8nQqco, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23246$r8$lambda$QTtPqzapY8gxbT2lKDdi8nQqco(okhttp3.OkHttpClient.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        builder.followRedirects(false);
        builder.followSslRedirects(false);
        builder.retryOnConnectionFailure(true);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kdKyojOqCBOg7mWJHwZK0jD-gA0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23247$r8$lambda$kdKyojOqCBOg7mWJHwZK0jDgA0(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, okhttp3.OkHttpClient.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        function1.invoke(builder);
        function12.invoke(builder);
        return kotlin.Unit.INSTANCE;
    }
}
