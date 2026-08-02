package com.paypal.oslo.feature.businessinventory.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u000b\u001a\u0018\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/domain/usecase/RefreshBusinessInventoryItemsUseCaseImpl;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/usecase/RefreshBusinessInventoryItemsUseCase;", "Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryItemsRepository;", "businessInventoryItemsRepository", "<init>", "(Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryItemsRepository;)V", "Larrow/core/Either;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryItemsRepository;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RefreshBusinessInventoryItemsUseCaseImpl implements com.paypal.oslo.feature.businessinventory.api.domain.usecase.RefreshBusinessInventoryItemsUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryItemsRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public RefreshBusinessInventoryItemsUseCaseImpl(com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryItemsRepository businessInventoryItemsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventoryItemsRepository, "");
        this.getHighSpeedVideoSizes = businessInventoryItemsRepository;
    }

    @Override // com.paypal.oslo.feature.businessinventory.api.domain.usecase.RefreshBusinessInventoryItemsUseCase
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Exception, ? extends java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem>>> continuation) {
        return this.getHighSpeedVideoSizes.refreshItems(continuation);
    }
}
