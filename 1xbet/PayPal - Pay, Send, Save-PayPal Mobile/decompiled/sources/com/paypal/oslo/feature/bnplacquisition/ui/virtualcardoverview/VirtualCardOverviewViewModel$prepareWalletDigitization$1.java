package com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel$prepareWalletDigitization$1", f = "VirtualCardOverviewViewModel.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE}, m = "invokeSuspend", n = {"request"}, nl = {299}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class VirtualCardOverviewViewModel$prepareWalletDigitization$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage;
        com.paypal.oslo.feature.starpay.api.WalletData walletData;
        com.paypal.oslo.feature.starpay.api.WalletData walletData2;
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.PrepareDigitizationDataUsecase prepareDigitizationDataUsecase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sessionStorage = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
            java.lang.String getHighSpeedVideoFpsRangesFor = sessionStorage.getGetHighSpeedVideoFpsRangesFor();
            if (getHighSpeedVideoFpsRangesFor == null) {
                getHighSpeedVideoFpsRangesFor = "";
            }
            walletData = this.getHighSpeedVideoFpsRangesFor.getOutputFormats;
            java.lang.String walletId = walletData != null ? walletData.getWalletId() : null;
            if (walletId == null) {
                walletId = "";
            }
            com.paypal.oslo.feature.bnplacquisition.domain.model.requests.DeviceWallet deviceWallet = new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.DeviceWallet("GOOGLE_WALLET", walletId);
            walletData2 = this.getHighSpeedVideoFpsRangesFor.getOutputFormats;
            java.lang.String deviceId = walletData2 != null ? walletData2.getDeviceId() : null;
            com.paypal.oslo.feature.bnplacquisition.domain.model.requests.PrepareDigitizationDataRequest prepareDigitizationDataRequest = new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.PrepareDigitizationDataRequest(getHighSpeedVideoFpsRangesFor, deviceWallet, new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.Device(deviceId != null ? deviceId : ""));
            prepareDigitizationDataUsecase = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(prepareDigitizationDataRequest);
            this.getHighSpeedVideoSizes = 1;
            obj = prepareDigitizationDataUsecase.invoke2(prepareDigitizationDataRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>>) this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult useCaseResult = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult) obj;
        com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel virtualCardOverviewViewModel = this.getHighSpeedVideoFpsRangesFor;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success success = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) useCaseResult;
            T data = success.getData();
            success.getCorrelationId();
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel.access$handlePrepareDigitizationSuccess(virtualCardOverviewViewModel, data);
        }
        com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel virtualCardOverviewViewModel2 = this.getHighSpeedVideoFpsRangesFor;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.IssuerDigitizationDataNotFoundError) {
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel.access$handleIssuerDigitizationDataNotFound(virtualCardOverviewViewModel2, ((com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) useCaseResult).getCorrelationId(), com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction.PREPARE_DIGITIZATION);
        }
        com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel virtualCardOverviewViewModel3 = this.getHighSpeedVideoFpsRangesFor;
        if ((useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) && !com.paypal.oslo.feature.bnplacquisition.ui.utils.UseCaseResultExtKt.requiresSpecificErrorHandling(useCaseResult)) {
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel.access$handleFullscreenError(virtualCardOverviewViewModel3, (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) useCaseResult, "Failed to prepare digitization", com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction.PREPARE_DIGITIZATION);
        }
        com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel virtualCardOverviewViewModel4 = this.getHighSpeedVideoFpsRangesFor;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline decline = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline) useCaseResult;
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel.access$handleDecline(virtualCardOverviewViewModel4, decline.getData(), decline.getCorrelationId());
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel$prepareWalletDigitization$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel$prepareWalletDigitization$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VirtualCardOverviewViewModel$prepareWalletDigitization$1(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel virtualCardOverviewViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel$prepareWalletDigitization$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = virtualCardOverviewViewModel;
    }
}
