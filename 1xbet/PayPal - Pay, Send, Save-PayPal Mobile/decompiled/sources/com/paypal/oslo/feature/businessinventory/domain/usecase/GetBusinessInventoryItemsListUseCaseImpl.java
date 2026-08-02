package com.paypal.oslo.feature.businessinventory.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/domain/usecase/GetBusinessInventoryItemsListUseCaseImpl;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/usecase/GetBusinessInventoryItemsListUseCase;", "Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryItemsRepository;", "businessInventoryItemsRepository", "<init>", "(Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryItemsRepository;)V", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;", "invoke", "()Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryItemsRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetBusinessInventoryItemsListUseCaseImpl implements com.paypal.oslo.feature.businessinventory.api.domain.usecase.GetBusinessInventoryItemsListUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryItemsRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public GetBusinessInventoryItemsListUseCaseImpl(com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryItemsRepository businessInventoryItemsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventoryItemsRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = businessInventoryItemsRepository;
    }

    @Override // com.paypal.oslo.feature.businessinventory.api.domain.usecase.GetBusinessInventoryItemsListUseCase
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem>> invoke() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getInventoryItems();
    }
}
