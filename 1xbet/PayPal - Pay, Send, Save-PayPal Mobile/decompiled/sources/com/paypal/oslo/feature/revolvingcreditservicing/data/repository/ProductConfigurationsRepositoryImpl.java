package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/ProductConfigurationsRepositoryImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/ProductConfigurationsRepository;", "<init>", "()V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/capabilities/ProductConfigurations;", "fetchProductConfigurations", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/capabilities/ProductConfigurations;", "productConfigurations", "", "cacheProductConfigurations", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/capabilities/ProductConfigurations;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/capabilities/ProductConfigurations;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ProductConfigurationsRepositoryImpl implements com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ProductConfigurationsRepository {
    public static final int $stable = 8;
    private volatile com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public ProductConfigurationsRepositoryImpl() {
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ProductConfigurationsRepository
    /* renamed from: fetchProductConfigurations, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ProductConfigurationsRepository
    public final void cacheProductConfigurations(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations productConfigurations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productConfigurations, "");
        this.getHighResolutionOutputSizeshNQ4ISI = productConfigurations;
    }
}
