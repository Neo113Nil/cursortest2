package com.paypal.oslo.core.network.rest.di;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H!¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/network/rest/di/RestModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/network/rest/DefaultRetrofitProvider;", "impl", "Lcom/paypal/oslo/core/network/rest/RetrofitProvider;", "bindRetrofitProvider$rest_release", "(Lcom/paypal/oslo/core/network/rest/DefaultRetrofitProvider;)Lcom/paypal/oslo/core/network/rest/RetrofitProvider;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes4.dex */
public abstract class RestModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.network.rest.di.RestModule.Companion INSTANCE = new com.paypal.oslo.core.network.rest.di.RestModule.Companion(null);

    @javax.inject.Singleton
    @dagger.Binds
    public abstract com.paypal.oslo.core.network.rest.RetrofitProvider bindRetrofitProvider$rest_release(com.paypal.oslo.core.network.rest.DefaultRetrofitProvider impl);

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/core/network/rest/di/RestModule$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/core/network/http/DynamicOkHttpClientProvider;", "provider", "Lcom/paypal/oslo/core/network/rest/config/RestConfig;", "config", "Lretrofit2/Retrofit;", "provideRetrofit$rest_release", "(Lcom/paypal/oslo/core/network/http/DynamicOkHttpClientProvider;Lcom/paypal/oslo/core/network/rest/config/RestConfig;)Lretrofit2/Retrofit;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @dagger.Provides
        @javax.inject.Singleton
        public final retrofit2.Retrofit provideRetrofit$rest_release(com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider provider, com.paypal.oslo.core.network.rest.config.RestConfig config) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
            return com.paypal.oslo.core.network.rest.RetrofitFactory.INSTANCE.create(provider.getCallFactory(), config);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
