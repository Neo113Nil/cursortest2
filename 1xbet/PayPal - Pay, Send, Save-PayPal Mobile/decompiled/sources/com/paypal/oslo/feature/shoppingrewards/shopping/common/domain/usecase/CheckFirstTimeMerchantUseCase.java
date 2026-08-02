package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/usecase/CheckFirstTimeMerchantUseCase;", "", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/repository/MerchantVisitHistoryRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/repository/MerchantVisitHistoryRepository;)V", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabOfferDetails;", "offerDetails", "", "invoke", "(Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/IabOfferDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/repository/MerchantVisitHistoryRepository;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CheckFirstTimeMerchantUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.MerchantVisitHistoryRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public CheckFirstTimeMerchantUseCase(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.MerchantVisitHistoryRepository merchantVisitHistoryRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantVisitHistoryRepository, "");
        this.Camera2StreamConfigurationMap = merchantVisitHistoryRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails iabOfferDetails, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.CheckFirstTimeMerchantUseCase$invoke$1 checkFirstTimeMerchantUseCase$invoke$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.CheckFirstTimeMerchantUseCase$invoke$1) {
            checkFirstTimeMerchantUseCase$invoke$1 = (com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.CheckFirstTimeMerchantUseCase$invoke$1) continuation;
            if ((checkFirstTimeMerchantUseCase$invoke$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                checkFirstTimeMerchantUseCase$invoke$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = checkFirstTimeMerchantUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = checkFirstTimeMerchantUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String honeyStoreId = iabOfferDetails.getHoneyStoreId();
                    if (honeyStoreId == null) {
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                    }
                    com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.MerchantVisitHistoryRepository merchantVisitHistoryRepository = this.Camera2StreamConfigurationMap;
                    checkFirstTimeMerchantUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(iabOfferDetails);
                    checkFirstTimeMerchantUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(honeyStoreId);
                    checkFirstTimeMerchantUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = merchantVisitHistoryRepository.isMerchantSeen(honeyStoreId, checkFirstTimeMerchantUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!((java.lang.Boolean) obj).booleanValue());
            }
        }
        checkFirstTimeMerchantUseCase$invoke$1 = new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.CheckFirstTimeMerchantUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = checkFirstTimeMerchantUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = checkFirstTimeMerchantUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!((java.lang.Boolean) obj2).booleanValue());
    }
}
