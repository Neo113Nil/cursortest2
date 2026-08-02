package com.paypal.oslo.feature.cryptocurrency.ui.details;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$launchPolling$1", f = "CryptoDetailsViewModel.kt", i = {}, l = {397}, m = "invokeSuspend", n = {}, nl = {400}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class CryptoDetailsViewModel$launchPolling$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.cryptocurrency.ui.details.usecase.CryptoDetailsUseCases cryptoDetailsUseCases;
        java.lang.String str;
        com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            cryptoDetailsUseCases = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase pollCryptoDetails = cryptoDetailsUseCases.getPollCryptoDetails();
            str = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange = this.getHighSpeedVideoFpsRanges;
            currencyProvider = this.getHighResolutionOutputSizeshNQ4ISI.getOutputSizeshNQ4ISI;
            kotlinx.coroutines.flow.Flow invoke$default = com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase.invoke$default(pollCryptoDetails, str, priceTimeRange, currencyProvider.getCurrencyCode(), false, 8, null);
            final com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel cryptoDetailsViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
            final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange2 = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizes = 1;
            if (invoke$default.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$launchPolling$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel.access$handlePollingData(com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel.this, (com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.CryptoDetailsPollingData) obj2, priceTimeRange2);
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$launchPolling$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$launchPolling$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoDetailsViewModel$launchPolling$1(com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel cryptoDetailsViewModel, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel$launchPolling$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = cryptoDetailsViewModel;
        this.getHighSpeedVideoFpsRanges = priceTimeRange;
    }
}
