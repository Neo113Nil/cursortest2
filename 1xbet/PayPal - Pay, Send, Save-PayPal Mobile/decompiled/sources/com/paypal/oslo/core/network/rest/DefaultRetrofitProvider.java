package com.paypal.oslo.core.network.rest;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/core/network/rest/DefaultRetrofitProvider;", "Lcom/paypal/oslo/core/network/rest/RetrofitProvider;", "<init>", "()V", "Lokhttp3/Call$Factory;", "callFactory", "Lcom/paypal/oslo/core/network/rest/config/RestConfig;", "config", "Lretrofit2/Retrofit;", "create", "(Lokhttp3/Call$Factory;Lcom/paypal/oslo/core/network/rest/config/RestConfig;)Lretrofit2/Retrofit;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DefaultRetrofitProvider implements com.paypal.oslo.core.network.rest.RetrofitProvider {
    @javax.inject.Inject
    public DefaultRetrofitProvider() {
    }

    @Override // com.paypal.oslo.core.network.rest.RetrofitProvider
    public final retrofit2.Retrofit create(okhttp3.Call.Factory callFactory, com.paypal.oslo.core.network.rest.config.RestConfig config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callFactory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        return com.paypal.oslo.core.network.rest.RetrofitFactory.INSTANCE.create(callFactory, config);
    }
}
