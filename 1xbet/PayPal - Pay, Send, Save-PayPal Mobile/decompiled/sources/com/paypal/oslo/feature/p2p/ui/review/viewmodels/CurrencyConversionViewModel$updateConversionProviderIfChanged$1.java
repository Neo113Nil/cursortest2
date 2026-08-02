package com.paypal.oslo.feature.p2p.ui.review.viewmodels;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.viewmodels.CurrencyConversionViewModel$updateConversionProviderIfChanged$1", f = "CurrencyConversionViewModel.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, nl = {146}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class CurrencyConversionViewModel$updateConversionProviderIfChanged$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.viewmodels.CurrencyConversionViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.ConversionOption getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.p2p.domain.usecase.UpdateCurrencyConversionProviderUseCase updateCurrencyConversionProviderUseCase;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore2;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            updateCurrencyConversionProviderUseCase = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = updateCurrencyConversionProviderUseCase.invoke(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        java.lang.String str = this.getHighSpeedVideoSizes;
        com.paypal.oslo.feature.p2p.domain.model.ConversionOption conversionOption = this.getHighSpeedVideoFpsRangesFor;
        com.paypal.oslo.feature.p2p.ui.review.viewmodels.CurrencyConversionViewModel currencyConversionViewModel = this.Camera2StreamConfigurationMap;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.p2p.domain.model.UpdateConversionProviderResult updateConversionProviderResult = (com.paypal.oslo.feature.p2p.domain.model.UpdateConversionProviderResult) ((arrow.core.Either.Right) either).getValue();
            if (updateConversionProviderResult.getFxQuote() != null) {
                mviStateStore3 = currencyConversionViewModel.getHighSpeedVideoSizes;
                mviStateStore3.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.CacheFxQuote(updateConversionProviderResult.getFxQuote()));
            }
            mviStateStore2 = currencyConversionViewModel.getHighSpeedVideoSizes;
            mviStateStore2.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ProviderUpdateSucceeded(conversionOption, updateConversionProviderResult.getFundingOptions()));
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.p2p.domain.error.TransferError transferError = (com.paypal.oslo.feature.p2p.domain.error.TransferError) ((arrow.core.Either.Left) either).getValue();
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[3];
            pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, str);
            pairArr[1] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OPTION, conversionOption.name());
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(transferError.getClass()).getSimpleName();
            if (simpleName == null) {
                simpleName = "";
            }
            pairArr[2] = kotlin.TuplesKt.to("errorType", simpleName);
            com.paypal.android.logger.Logger.e$default(logger, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.CONVERSION_PROVIDER_UPDATE_FAILED, kotlin.collections.MapsKt.mapOf(pairArr), null, null, 12, null);
            mviStateStore = currencyConversionViewModel.getHighSpeedVideoSizes;
            mviStateStore.onEvent(new com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.ProviderUpdateFailed(conversionOption, transferError));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.review.viewmodels.CurrencyConversionViewModel$updateConversionProviderIfChanged$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.review.viewmodels.CurrencyConversionViewModel$updateConversionProviderIfChanged$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurrencyConversionViewModel$updateConversionProviderIfChanged$1(com.paypal.oslo.feature.p2p.ui.review.viewmodels.CurrencyConversionViewModel currencyConversionViewModel, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.p2p.domain.model.ConversionOption conversionOption, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.viewmodels.CurrencyConversionViewModel$updateConversionProviderIfChanged$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = currencyConversionViewModel;
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
        this.getHighSpeedVideoFpsRangesFor = conversionOption;
    }
}
