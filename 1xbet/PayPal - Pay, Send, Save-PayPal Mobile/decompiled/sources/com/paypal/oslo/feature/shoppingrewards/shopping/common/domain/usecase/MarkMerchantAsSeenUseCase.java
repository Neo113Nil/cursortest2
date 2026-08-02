package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/usecase/MarkMerchantAsSeenUseCase;", "", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/repository/MerchantVisitHistoryRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/repository/MerchantVisitHistoryRepository;)V", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabOfferDetails;", "offerDetails", "", "invoke", "(Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabOfferDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/repository/MerchantVisitHistoryRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MarkMerchantAsSeenUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.MerchantVisitHistoryRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public MarkMerchantAsSeenUseCase(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.MerchantVisitHistoryRepository merchantVisitHistoryRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantVisitHistoryRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = merchantVisitHistoryRepository;
    }

    public final java.lang.Object invoke(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails iabOfferDetails, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object markMerchantAsSeen;
        java.lang.String honeyStoreId = iabOfferDetails.getHoneyStoreId();
        return (honeyStoreId != null && (markMerchantAsSeen = this.getHighResolutionOutputSizeshNQ4ISI.markMerchantAsSeen(honeyStoreId, continuation)) == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? markMerchantAsSeen : kotlin.Unit.INSTANCE;
    }
}
