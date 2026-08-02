package com.paypal.oslo.core.network.rest;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/core/network/rest/RetrofitFactory;", "", "<init>", "()V", "Lokhttp3/Call$Factory;", "callFactory", "Lcom/paypal/oslo/core/network/rest/config/RestConfig;", "config", "Lretrofit2/Retrofit;", "create", "(Lokhttp3/Call$Factory;Lcom/paypal/oslo/core/network/rest/config/RestConfig;)Lretrofit2/Retrofit;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RetrofitFactory {
    public static final com.paypal.oslo.core.network.rest.RetrofitFactory INSTANCE = new com.paypal.oslo.core.network.rest.RetrofitFactory();

    private RetrofitFactory() {
    }

    public final retrofit2.Retrofit create(okhttp3.Call.Factory callFactory, com.paypal.oslo.core.network.rest.config.RestConfig config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callFactory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        okhttp3.MediaType mediaType = okhttp3.MediaType.INSTANCE.get("application/json");
        retrofit2.Retrofit build = new retrofit2.Retrofit.Builder().callFactory(callFactory).baseUrl(config.getBaseUrl()).addCallAdapterFactory(com.paypal.oslo.core.network.rest.adapter.EitherCallAdapterFactory.INSTANCE.create(kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.paypal.oslo.core.network.http.error.NetworkErrorMapper[]{new com.paypal.oslo.core.network.rest.error.RetrofitErrorMapper(), new com.paypal.oslo.core.network.http.error.HttpErrorMapper()}))).addConverterFactory(retrofit2.converter.kotlinx.serialization.KotlinSerializationConverterFactory.create(kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.network.rest.RetrofitFactory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.core.network.rest.RetrofitFactory.$r8$lambda$uEgXG7hcNJozI3VGNliilj3lrOs((kotlinx.serialization.json.JsonBuilder) obj);
            }
        }, 1, null), mediaType)).build();
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.network.rest.LoggerKt.log, "Retrofit initialization completed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("base_url", config.getBaseUrl())), null, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uEgXG7hcNJozI3VGNliilj3lrOs(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setIgnoreUnknownKeys(true);
        return kotlin.Unit.INSTANCE;
    }
}
