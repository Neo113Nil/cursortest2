package com.paypal.oslo.feature.businessinventory.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/domain/usecase/GetBusinessInventoryTaxesUseCaseImpl;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/usecase/GetBusinessInventoryTaxesUseCase;", "Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryTaxesRepository;", "taxesRepository", "<init>", "(Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryTaxesRepository;)V", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "invoke", "()Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryTaxesRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetBusinessInventoryTaxesUseCaseImpl implements com.paypal.oslo.feature.businessinventory.api.domain.usecase.GetBusinessInventoryTaxesUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryTaxesRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public GetBusinessInventoryTaxesUseCaseImpl(com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryTaxesRepository businessInventoryTaxesRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventoryTaxesRepository, "");
        this.getHighSpeedVideoSizes = businessInventoryTaxesRepository;
    }

    @Override // com.paypal.oslo.feature.businessinventory.api.domain.usecase.GetBusinessInventoryTaxesUseCase
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption>> invoke() {
        return this.getHighSpeedVideoSizes.getTaxes();
    }
}
