package com.paypal.oslo.feature.businesshome.ui.home;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel$loadData$1", f = "BusinessHomeViewModel.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, nl = {103}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class BusinessHomeViewModel$loadData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.businesshome.domain.usecase.GetBusinessHomeFeedUseCase getBusinessHomeFeedUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
            mutableStateFlow.setValue(com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiState.Loading.INSTANCE);
            getBusinessHomeFeedUseCase = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = 1;
            obj = getBusinessHomeFeedUseCase.invoke(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.businesshome.domain.model.BusinessHomeFeed businessHomeFeed = (com.paypal.oslo.feature.businesshome.domain.model.BusinessHomeFeed) obj;
        arrow.core.Either<com.paypal.oslo.feature.businesshome.domain.model.MerchantInsightsError, com.paypal.oslo.feature.businesshome.domain.model.MerchantInsights> merchantInsights = businessHomeFeed.getMerchantInsights();
        com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel businessHomeViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
        if (merchantInsights instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.businesshome.domain.model.MerchantInsights merchantInsights2 = (com.paypal.oslo.feature.businesshome.domain.model.MerchantInsights) ((arrow.core.Either.Right) merchantInsights).getValue();
            businessHomeViewModel.getOutputMinFrameDuration = merchantInsights2.getTransactionMetrics().getPayable().getSingleActivity();
            businessHomeViewModel.getInputSizeshNQ4ISI = merchantInsights2.getTransactionMetrics().getReceivable().getSingleActivity();
            mutableStateFlow3 = businessHomeViewModel.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card[] cardArr = new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card[2];
            com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.AccountSetup accountSetup = com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.AccountSetup.INSTANCE;
            if (!businessHomeFeed.getShowAccountSetupCard()) {
                accountSetup = null;
            }
            cardArr[0] = accountSetup;
            cardArr[1] = new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData.Card.InFocus(com.paypal.oslo.feature.businesshome.ui.mapper.MerchantInsightsUiMapperKt.toInFocusUiData(merchantInsights2), null, 2, null);
            mutableStateFlow3.setValue(new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiState.Success(new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiData(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) cardArr))));
        } else if (merchantInsights instanceof arrow.core.Either.Left) {
            mutableStateFlow2 = businessHomeViewModel.getHighSpeedVideoSizes;
            mutableStateFlow2.setValue(new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeUiState.Error("Unable to load business data"));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel$loadData$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BusinessHomeViewModel$loadData$1(com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel businessHomeViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesshome.ui.home.BusinessHomeViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = businessHomeViewModel;
    }
}
