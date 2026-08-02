package com.paypal.oslo.core.remoteconfig.cdn;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/cdn/StatsigCdnService;", "", "", "url", "Lretrofit2/Response;", "Lcom/paypal/oslo/core/remoteconfig/cdn/ConfigSpecResponse;", "fetchConfigSpecs", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface StatsigCdnService {
    @com.paypal.oslo.core.network.rest.noauth.NoAuth
    @retrofit2.http.GET
    java.lang.Object fetchConfigSpecs(@retrofit2.http.Url java.lang.String str, kotlin.coroutines.Continuation<? super retrofit2.Response<com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecResponse>> continuation);
}
