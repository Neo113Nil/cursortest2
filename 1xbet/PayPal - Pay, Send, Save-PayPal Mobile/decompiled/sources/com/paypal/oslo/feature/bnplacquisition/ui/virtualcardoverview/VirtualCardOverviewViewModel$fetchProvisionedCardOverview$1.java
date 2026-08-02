package com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel$fetchProvisionedCardOverview$1", f = "VirtualCardOverviewViewModel.kt", i = {0}, l = {351}, m = "invokeSuspend", n = {"request"}, nl = {352}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class VirtualCardOverviewViewModel$fetchProvisionedCardOverview$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage;
        com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage2;
        com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage3;
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetProvisionedCardOverviewUseCase getProvisionedCardOverviewUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sessionStorage = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
            java.lang.String camera2StreamConfigurationMap = sessionStorage.getCamera2StreamConfigurationMap();
            java.lang.String str = camera2StreamConfigurationMap == null ? "" : camera2StreamConfigurationMap;
            sessionStorage2 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
            java.lang.String getHighSpeedVideoFpsRangesFor = sessionStorage2.getGetHighSpeedVideoFpsRangesFor();
            java.lang.String str2 = getHighSpeedVideoFpsRangesFor == null ? "" : getHighSpeedVideoFpsRangesFor;
            sessionStorage3 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.ProvisionedCardOverviewRequest provisionedCardOverviewRequest = new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.ProvisionedCardOverviewRequest(str, str2, this.getHighSpeedVideoFpsRangesFor.getExternalWalletTokens$bnpl_acquisition_prodRelease(), new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.FlowContext(sessionStorage3.getGetOutputMinFrameDuration(), com.paypal.oslo.feature.bnplacquisition.domain.utilities.NetworkConstants.MOBILE_APP, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.bnplacquisition.domain.utilities.RequestUsageChannel.CONTACTLESS_MOBILE_WALLET)), this.getHighSpeedVideoFpsRangesFor.getProvisionedTokens$bnpl_acquisition_prodRelease(), kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType.PHONE));
            getProvisionedCardOverviewUseCase = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(provisionedCardOverviewRequest);
            this.Camera2StreamConfigurationMap = 1;
            obj = getProvisionedCardOverviewUseCase.invoke2(provisionedCardOverviewRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>>) this);
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
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel.access$handleProvisionedCardOverviewSuccess(virtualCardOverviewViewModel, data);
        }
        com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel virtualCardOverviewViewModel2 = this.getHighSpeedVideoFpsRangesFor;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidVirtualCardError) {
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel.access$handleInvalidVirtualCard(virtualCardOverviewViewModel2, ((com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) useCaseResult).getCorrelationId());
        }
        com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel virtualCardOverviewViewModel3 = this.getHighSpeedVideoFpsRangesFor;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.DeviceTokenPendingActiveError) {
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel.access$handleDeviceTokenPendingActive(virtualCardOverviewViewModel3, (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.DeviceTokenPendingActiveError) useCaseResult, com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction.FETCH_PROVISIONED_CARD_OVERVIEW);
        }
        com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel virtualCardOverviewViewModel4 = this.getHighSpeedVideoFpsRangesFor;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.IssuerDigitizationDataNotFoundError) {
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel.access$handleIssuerDigitizationDataNotFound(virtualCardOverviewViewModel4, ((com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) useCaseResult).getCorrelationId(), com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction.FETCH_PROVISIONED_CARD_OVERVIEW);
        }
        com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel virtualCardOverviewViewModel5 = this.getHighSpeedVideoFpsRangesFor;
        if ((useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) && !com.paypal.oslo.feature.bnplacquisition.ui.utils.UseCaseResultExtKt.requiresSpecificErrorHandling(useCaseResult)) {
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel.access$handleFullscreenError(virtualCardOverviewViewModel5, (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) useCaseResult, "Failed to fetch provisioned card overview", com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.LastFailedAction.FETCH_PROVISIONED_CARD_OVERVIEW);
        }
        com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel virtualCardOverviewViewModel6 = this.getHighSpeedVideoFpsRangesFor;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline decline = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline) useCaseResult;
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel.access$handleDecline(virtualCardOverviewViewModel6, decline.getData(), decline.getCorrelationId());
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel$fetchProvisionedCardOverview$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel$fetchProvisionedCardOverview$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VirtualCardOverviewViewModel$fetchProvisionedCardOverview$1(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel virtualCardOverviewViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel$fetchProvisionedCardOverview$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = virtualCardOverviewViewModel;
    }
}
