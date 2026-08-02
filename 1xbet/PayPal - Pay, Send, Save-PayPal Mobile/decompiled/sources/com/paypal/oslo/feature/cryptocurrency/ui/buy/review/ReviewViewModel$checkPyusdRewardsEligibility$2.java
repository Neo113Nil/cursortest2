package com.paypal.oslo.feature.cryptocurrency.ui.buy.review;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel$checkPyusdRewardsEligibility$2", f = "ReviewViewModel.kt", i = {1}, l = {432, 445}, m = "invokeSuspend", n = {"rewardsStatus"}, nl = {556, 449}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class ReviewViewModel$checkPyusdRewardsEligibility$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:48:0x003f, code lost:
    
        if (r2 != r1) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00d0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewUseCases reviewUseCases;
        java.lang.Object invoke;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState copy;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewUseCases reviewUseCases2;
        java.lang.Object invoke2;
        com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus pYUSDRewardsStatus;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState copy2;
        boolean areEqual;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object value3;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState copy3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            reviewUseCases = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes = 1;
            invoke = reviewUseCases.getGetPYUSDRewardsStatus().invoke(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pYUSDRewardsStatus = (com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                invoke2 = obj;
                areEqual = kotlin.jvm.internal.Intrinsics.areEqual(((java.util.Map) invoke2).get(com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability.SELL_CRYPTO), com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.ProceedWithOperation.INSTANCE);
                mutableStateFlow3 = this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI;
                do {
                    value3 = mutableStateFlow3.getValue();
                    copy3 = r21.copy((r37 & 1) != 0 ? r21.assetSymbol : null, (r37 & 2) != 0 ? r21.titleAssetDisplayName : null, (r37 & 4) != 0 ? r21.assetLogoUrl : null, (r37 & 8) != 0 ? r21.amount : null, (r37 & 16) != 0 ? r21.currencyCode : null, (r37 & 32) != 0 ? r21.cryptoAmount : null, (r37 & 64) != 0 ? r21.exchangeRate : null, (r37 & 128) != 0 ? r21.transactionFee : null, (r37 & 256) != 0 ? r21.totalAmount : null, (r37 & 512) != 0 ? r21.quoteId : null, (r37 & 1024) != 0 ? r21.accordionItems : null, (r37 & 2048) != 0 ? r21.currentStep : null, (r37 & 4096) != 0 ? r21.selectedRecurringOption : null, (r37 & 8192) != 0 ? r21.selectedPaymentMethod : null, (r37 & 16384) != 0 ? r21.availablePaymentMethods : null, (r37 & 32768) != 0 ? r21.isLoading : false, (r37 & 65536) != 0 ? r21.showPyusdRewardsToggle : areEqual, (r37 & 131072) != 0 ? r21.pyusdRewardsOptIn : false, (r37 & 262144) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState) value3).pyusdRewardsFormattedRate : !areEqual ? pYUSDRewardsStatus.getRate() : "");
                } while (!mutableStateFlow3.compareAndSet(value3, copy3));
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        arrow.core.Either either = (arrow.core.Either) invoke;
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel reviewViewModel = this.getHighSpeedVideoFpsRangesFor;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus pYUSDRewardsStatus2 = (com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus) ((arrow.core.Either.Right) either).getValue();
            if (pYUSDRewardsStatus2.isOptIn()) {
                mutableStateFlow2 = this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI;
                do {
                    value2 = mutableStateFlow2.getValue();
                    copy2 = r5.copy((r37 & 1) != 0 ? r5.assetSymbol : null, (r37 & 2) != 0 ? r5.titleAssetDisplayName : null, (r37 & 4) != 0 ? r5.assetLogoUrl : null, (r37 & 8) != 0 ? r5.amount : null, (r37 & 16) != 0 ? r5.currencyCode : null, (r37 & 32) != 0 ? r5.cryptoAmount : null, (r37 & 64) != 0 ? r5.exchangeRate : null, (r37 & 128) != 0 ? r5.transactionFee : null, (r37 & 256) != 0 ? r5.totalAmount : null, (r37 & 512) != 0 ? r5.quoteId : null, (r37 & 1024) != 0 ? r5.accordionItems : null, (r37 & 2048) != 0 ? r5.currentStep : null, (r37 & 4096) != 0 ? r5.selectedRecurringOption : null, (r37 & 8192) != 0 ? r5.selectedPaymentMethod : null, (r37 & 16384) != 0 ? r5.availablePaymentMethods : null, (r37 & 32768) != 0 ? r5.isLoading : false, (r37 & 65536) != 0 ? r5.showPyusdRewardsToggle : false, (r37 & 131072) != 0 ? r5.pyusdRewardsOptIn : false, (r37 & 262144) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState) value2).pyusdRewardsFormattedRate : null);
                } while (!mutableStateFlow2.compareAndSet(value2, copy2));
                return kotlin.Unit.INSTANCE;
            }
            reviewUseCases2 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
            this.getHighResolutionOutputSizeshNQ4ISI = pYUSDRewardsStatus2;
            this.getHighSpeedVideoSizes = 2;
            invoke2 = reviewUseCases2.getCheckCryptoProvisioning().invoke(kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability.SELL_CRYPTO), this);
            if (invoke2 != coroutine_suspended) {
                pYUSDRewardsStatus = pYUSDRewardsStatus2;
                areEqual = kotlin.jvm.internal.Intrinsics.areEqual(((java.util.Map) invoke2).get(com.paypal.oslo.feature.cryptocurrency.domain.model.subscriptions.FlowCapability.SELL_CRYPTO), com.paypal.oslo.feature.cryptocurrency.domain.model.provisioning.ProvisioningCheckResult.ProceedWithOperation.INSTANCE);
                mutableStateFlow3 = this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI;
                do {
                    value3 = mutableStateFlow3.getValue();
                    copy3 = r21.copy((r37 & 1) != 0 ? r21.assetSymbol : null, (r37 & 2) != 0 ? r21.titleAssetDisplayName : null, (r37 & 4) != 0 ? r21.assetLogoUrl : null, (r37 & 8) != 0 ? r21.amount : null, (r37 & 16) != 0 ? r21.currencyCode : null, (r37 & 32) != 0 ? r21.cryptoAmount : null, (r37 & 64) != 0 ? r21.exchangeRate : null, (r37 & 128) != 0 ? r21.transactionFee : null, (r37 & 256) != 0 ? r21.totalAmount : null, (r37 & 512) != 0 ? r21.quoteId : null, (r37 & 1024) != 0 ? r21.accordionItems : null, (r37 & 2048) != 0 ? r21.currentStep : null, (r37 & 4096) != 0 ? r21.selectedRecurringOption : null, (r37 & 8192) != 0 ? r21.selectedPaymentMethod : null, (r37 & 16384) != 0 ? r21.availablePaymentMethods : null, (r37 & 32768) != 0 ? r21.isLoading : false, (r37 & 65536) != 0 ? r21.showPyusdRewardsToggle : areEqual, (r37 & 131072) != 0 ? r21.pyusdRewardsOptIn : false, (r37 & 262144) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState) value3).pyusdRewardsFormattedRate : !areEqual ? pYUSDRewardsStatus.getRate() : "");
                } while (!mutableStateFlow3.compareAndSet(value3, copy3));
                return kotlin.Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        if (either instanceof arrow.core.Either.Left) {
            mutableStateFlow = reviewViewModel.getInputSizeshNQ4ISI;
            do {
                value = mutableStateFlow.getValue();
                copy = r3.copy((r37 & 1) != 0 ? r3.assetSymbol : null, (r37 & 2) != 0 ? r3.titleAssetDisplayName : null, (r37 & 4) != 0 ? r3.assetLogoUrl : null, (r37 & 8) != 0 ? r3.amount : null, (r37 & 16) != 0 ? r3.currencyCode : null, (r37 & 32) != 0 ? r3.cryptoAmount : null, (r37 & 64) != 0 ? r3.exchangeRate : null, (r37 & 128) != 0 ? r3.transactionFee : null, (r37 & 256) != 0 ? r3.totalAmount : null, (r37 & 512) != 0 ? r3.quoteId : null, (r37 & 1024) != 0 ? r3.accordionItems : null, (r37 & 2048) != 0 ? r3.currentStep : null, (r37 & 4096) != 0 ? r3.selectedRecurringOption : null, (r37 & 8192) != 0 ? r3.selectedPaymentMethod : null, (r37 & 16384) != 0 ? r3.availablePaymentMethods : null, (r37 & 32768) != 0 ? r3.isLoading : false, (r37 & 65536) != 0 ? r3.showPyusdRewardsToggle : false, (r37 & 131072) != 0 ? r3.pyusdRewardsOptIn : false, (r37 & 262144) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.ReviewUiState) value).pyusdRewardsFormattedRate : null);
            } while (!mutableStateFlow.compareAndSet(value, copy));
            return kotlin.Unit.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel$checkPyusdRewardsEligibility$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel$checkPyusdRewardsEligibility$2(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewViewModel$checkPyusdRewardsEligibility$2(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel reviewViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewViewModel$checkPyusdRewardsEligibility$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = reviewViewModel;
    }
}
