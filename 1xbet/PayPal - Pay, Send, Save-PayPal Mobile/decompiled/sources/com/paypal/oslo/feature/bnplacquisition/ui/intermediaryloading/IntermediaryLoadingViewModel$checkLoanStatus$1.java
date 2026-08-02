package com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel$checkLoanStatus$1", f = "IntermediaryLoadingViewModel.kt", i = {0}, l = {91}, m = "invokeSuspend", n = {"request"}, nl = {92}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class IntermediaryLoadingViewModel$checkLoanStatus$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.config.CpiAvailabilityProvider cpiAvailabilityProvider;
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetBnplPlansUseCase getBnplPlansUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.bnplacquisition.domain.model.requests.BnplPlansRequest.Companion companion = com.paypal.oslo.feature.bnplacquisition.domain.model.requests.BnplPlansRequest.INSTANCE;
            cpiAvailabilityProvider = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
            com.paypal.oslo.feature.bnplacquisition.domain.model.requests.BnplPlansRequest forAcquisition = companion.forAcquisition(cpiAvailabilityProvider.availableCpis());
            getBnplPlansUseCase = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(forAcquisition);
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = getBnplPlansUseCase.invoke2(forAcquisition, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<?>>) this);
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
        com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel intermediaryLoadingViewModel = this.getHighSpeedVideoSizes;
        if (useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) {
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success success = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) useCaseResult;
            T data = success.getData();
            success.getCorrelationId();
            com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel.access$handleLoanStatusSuccess(intermediaryLoadingViewModel, data);
        }
        com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel intermediaryLoadingViewModel2 = this.getHighSpeedVideoSizes;
        if ((useCaseResult instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) && !com.paypal.oslo.feature.bnplacquisition.ui.utils.UseCaseResultExtKt.requiresSpecificErrorHandling(useCaseResult)) {
            intermediaryLoadingViewModel2.getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error) useCaseResult);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel$checkLoanStatus$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel$checkLoanStatus$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IntermediaryLoadingViewModel$checkLoanStatus$1(com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel intermediaryLoadingViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel$checkLoanStatus$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = intermediaryLoadingViewModel;
    }
}
