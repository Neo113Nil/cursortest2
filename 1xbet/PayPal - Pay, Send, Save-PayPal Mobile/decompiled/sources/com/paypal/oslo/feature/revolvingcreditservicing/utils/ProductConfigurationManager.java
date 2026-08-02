package com.paypal.oslo.feature.revolvingcreditservicing.utils;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/utils/ProductConfigurationManager;", "", "<init>", "()V", "T", "responseData", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditServicingProductFragment$Capabilities;", "capabilitiesExtractor", "Ljavax/inject/Provider;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/ProductConfigurationsRepository;", "productConfigurationsRepositoryProvider", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/capabilities/ProductConfigurations;", "extractAndCacheProductConfigurations", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lkotlin/jvm/functions/Function1;Ljavax/inject/Provider;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/capabilities/ProductConfigurations;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ProductConfigurationManager {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.utils.ProductConfigurationManager INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.utils.ProductConfigurationManager();

    private ProductConfigurationManager() {
    }

    public final <T> com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations extractAndCacheProductConfigurations(T responseData, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.Capabilities> capabilitiesExtractor, javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ProductConfigurationsRepository> productConfigurationsRepositoryProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capabilitiesExtractor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productConfigurationsRepositoryProvider, "");
        com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ProductConfigurationsRepository productConfigurationsRepository = productConfigurationsRepositoryProvider.get();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations getHighResolutionOutputSizeshNQ4ISI = productConfigurationsRepository.getGetHighResolutionOutputSizeshNQ4ISI();
        if (getHighResolutionOutputSizeshNQ4ISI != null && getHighResolutionOutputSizeshNQ4ISI.getCreditProductIdentifier() == creditProductIdentifier) {
            return getHighResolutionOutputSizeshNQ4ISI;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations productConfigurations = null;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditServicingProductFragment.Capabilities invoke = responseData != null ? capabilitiesExtractor.invoke(responseData) : null;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability> productCapabilities = invoke != null ? com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.ProductConfigurationsMapperKt.toProductCapabilities(invoke) : null;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability> list = productCapabilities;
        if (list != null && !list.isEmpty()) {
            productConfigurations = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations(creditProductIdentifier, productCapabilities, (java.util.List) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        if (productConfigurations != null) {
            productConfigurationsRepository.cacheProductConfigurations(productConfigurations);
            return productConfigurations;
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations(creditProductIdentifier, kotlin.collections.CollectionsKt.emptyList(), (java.util.List) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
