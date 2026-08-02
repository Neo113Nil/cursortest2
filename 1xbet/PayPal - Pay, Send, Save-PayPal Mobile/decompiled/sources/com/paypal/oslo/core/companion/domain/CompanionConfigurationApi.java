package com.paypal.oslo.core.companion.domain;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/companion/domain/CompanionConfigurationApi;", "", "Lcom/paypal/oslo/core/companion/domain/CompanionAppConfiguration;", "getDefaultConfiguration", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cachedConfig", "syncConfiguration", "(Lcom/paypal/oslo/core/companion/domain/CompanionAppConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface CompanionConfigurationApi {
    java.lang.Object getDefaultConfiguration(kotlin.coroutines.Continuation<? super com.paypal.oslo.core.companion.domain.CompanionAppConfiguration> continuation);

    java.lang.Object syncConfiguration(com.paypal.oslo.core.companion.domain.CompanionAppConfiguration companionAppConfiguration, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.companion.domain.CompanionAppConfiguration> continuation);
}
