package com.paypal.oslo.feature.bnplacquisition.ui.enteramount;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel$createCreditApplication$1", f = "EnterAmountViewModel.kt", i = {0}, l = {387}, m = "invokeSuspend", n = {"request"}, nl = {388}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class EnterAmountViewModel$createCreditApplication$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.EligibleProductOffer> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.CreateCreditApplicationUsecase createCreditApplicationUsecase;
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiMapper enterAmountUiMapper;
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiMapper enterAmountUiMapper2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.bnplacquisition.domain.model.requests.CreateCreditApplicationRequest access$buildCreateCreditApplicationRequest = com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel.access$buildCreateCreditApplicationRequest(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
            createCreditApplicationUsecase = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$buildCreateCreditApplicationRequest);
            this.getHighSpeedVideoSizes = 1;
            obj = createCreditApplicationUsecase.invoke2(access$buildCreateCreditApplicationRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>>) this);
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
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel enterAmountViewModel = this.getHighSpeedVideoFpsRangesFor;
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.EligibleProductOffer> list = this.getHighResolutionOutputSizeshNQ4ISI;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success success = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) useCaseResult;
            T data = success.getData();
            success.getCorrelationId();
            com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplication createCreditApplication = data instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplication ? (com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.CreateCreditApplication) data : null;
            if (createCreditApplication != null) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(enterAmountViewModel), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel$handleCreateCreditApplicationSuccess$1(createCreditApplication, enterAmountViewModel, list, null), 3, null);
            }
        }
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel enterAmountViewModel2 = this.getHighSpeedVideoFpsRangesFor;
        if ((useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) && !com.paypal.oslo.feature.bnplacquisition.ui.utils.UseCaseResultExtKt.requiresSpecificErrorHandling(useCaseResult)) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error error = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) useCaseResult;
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Failed to create credit application", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorTag", error.getTag())), null, 4, null);
            enterAmountUiMapper2 = enterAmountViewModel2.getInputFormats;
            enterAmountViewModel2.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.UpdateError(enterAmountUiMapper2.toErrorContent(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FullscreenErrorType.INSTANCE.from(error))));
        }
        com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel enterAmountViewModel3 = this.getHighSpeedVideoFpsRangesFor;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline decline = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline) useCaseResult;
            java.lang.String data2 = decline.getData();
            java.lang.String correlationId = decline.getCorrelationId();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Application declined", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", data2 == null ? "UNKNOWN" : data2)), null, 4, null);
            com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType from = com.paypal.oslo.feature.bnplacquisition.ui.common.model.DeclineType.INSTANCE.from(data2, correlationId);
            enterAmountUiMapper = enterAmountViewModel3.getInputFormats;
            enterAmountViewModel3.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.ApplicationDeclined(enterAmountUiMapper.toDeclineContent(from)));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel$createCreditApplication$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel$createCreditApplication$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnterAmountViewModel$createCreditApplication$1(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel enterAmountViewModel, java.lang.String str, java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.EligibleProductOffer> list, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel$createCreditApplication$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = enterAmountViewModel;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = list;
    }
}
