package com.paypal.oslo.feature.wallet.cards.ui.add.success;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.ui.add.success.AddCardSuccessViewModel$loadInitialData$1", f = "AddCardSuccessViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AddCardSuccessViewModel$loadInitialData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.success.AddCardSuccessViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.wallet.cards.ui.add.success.AddCardSuccessUiState addCardSuccessUiState;
        com.paypal.oslo.feature.wallet.cards.ui.add.success.CardInfo cardInfo;
        com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardSectionState rewardSectionState;
        int i;
        java.lang.String currencyCode;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome outcome = this.getHighSpeedVideoSizes.getOutcome();
        if (outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Success) {
            com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card card = ((com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Success) outcome).getCard();
            mutableStateFlow = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            do {
                value = mutableStateFlow.getValue();
                addCardSuccessUiState = (com.paypal.oslo.feature.wallet.cards.ui.add.success.AddCardSuccessUiState) value;
                java.lang.String brand = card.getBrand();
                if (brand == null) {
                    brand = "";
                }
                java.lang.String productClass = card.getProductClass();
                if (productClass == null) {
                    productClass = "";
                }
                java.lang.String lastNChars = card.getLastNChars();
                java.lang.String concat = lastNChars != null ? com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConstants.SSN_MASK_CHAR.concat(java.lang.String.valueOf(lastNChars)) : null;
                if (concat == null) {
                    concat = "";
                }
                java.lang.String cardArtPrimaryImageUrl = card.getCardArtPrimaryImageUrl();
                if (cardArtPrimaryImageUrl == null) {
                    cardArtPrimaryImageUrl = "";
                }
                cardInfo = new com.paypal.oslo.feature.wallet.cards.ui.add.success.CardInfo(brand, productClass, concat, cardArtPrimaryImageUrl);
                rewardSectionState = com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanTypeKt.toRewardSectionState(com.paypal.oslo.feature.wallet.cards.ui.add.success.NowYouCanType.DEFAULT);
                i = com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_currency_label;
                currencyCode = card.getCurrencyCode();
            } while (!mutableStateFlow.compareAndSet(value, addCardSuccessUiState.copy(cardInfo, new com.paypal.oslo.feature.wallet.cards.ui.add.success.CurrencySectionState(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(i, currencyCode != null ? currencyCode : ""), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_currency_description, new java.lang.Object[0]), "", false, null, 16, null), null, null, rewardSectionState)));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.cards.ui.add.success.AddCardSuccessViewModel$loadInitialData$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.cards.ui.add.success.AddCardSuccessViewModel$loadInitialData$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddCardSuccessViewModel$loadInitialData$1(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult addCardFlowNavResult, com.paypal.oslo.feature.wallet.cards.ui.add.success.AddCardSuccessViewModel addCardSuccessViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.ui.add.success.AddCardSuccessViewModel$loadInitialData$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = addCardFlowNavResult;
        this.Camera2StreamConfigurationMap = addCardSuccessViewModel;
    }
}
