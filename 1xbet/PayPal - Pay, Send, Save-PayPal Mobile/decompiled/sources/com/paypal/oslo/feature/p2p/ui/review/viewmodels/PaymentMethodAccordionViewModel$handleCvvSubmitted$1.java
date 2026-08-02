package com.paypal.oslo.feature.p2p.ui.review.viewmodels;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel$handleCvvSubmitted$1", f = "PaymentMethodAccordionViewModel.kt", i = {}, l = {406}, m = "invokeSuspend", n = {}, nl = {com.datadog.android.core.internal.data.upload.DataOkHttpUploader.HTTP_ENTITY_TOO_LARGE}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PaymentMethodAccordionViewModel$handleCvvSubmitted$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.FundingOption> Camera2StreamConfigurationMap;
    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.FundingOption getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel getInputSizeshNQ4ISI;
    int getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.p2p.domain.usecase.ResolvePlanContingencyUseCase resolvePlanContingencyUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            resolvePlanContingencyUseCase = this.getInputSizeshNQ4ISI.getOutputFormats;
            this.getOutputFormats = 1;
            obj = resolvePlanContingencyUseCase.invoke(new com.paypal.oslo.feature.p2p.domain.model.ResolvePlanContingencyInput(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes, new com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.CardVerificationDataCollection(this.getHighSpeedVideoFpsRanges)), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRangesFor;
        com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData planAccordionData = this.getOutputMinFrameDuration;
        boolean z = this.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.feature.p2p.domain.model.FundingOption fundingOption = this.getInputFormats;
        java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.FundingOption> map = this.Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel paymentMethodAccordionViewModel = this.getInputSizeshNQ4ISI;
        if (ior instanceof arrow.core.Ior.Left) {
            function1.invoke(new com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.PlanDataUpdated(planAccordionData, z, null, null, fundingOption, map, null, null, false, 460, null));
            function1.invoke(com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.FundingOptionsUnavailable.INSTANCE);
        } else if (ior instanceof arrow.core.Ior.Right) {
            paymentMethodAccordionViewModel.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.p2p.domain.model.FundingOptions) ((arrow.core.Ior.Right) ior).getValue(), false);
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            paymentMethodAccordionViewModel.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.p2p.domain.model.FundingOptions) both.getRightValue(), false);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel$handleCvvSubmitted$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel$handleCvvSubmitted$1(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputFormats, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PaymentMethodAccordionViewModel$handleCvvSubmitted$1(com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel paymentMethodAccordionViewModel, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent, kotlin.Unit> function1, com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData planAccordionData, boolean z, com.paypal.oslo.feature.p2p.domain.model.FundingOption fundingOption, java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.FundingOption> map, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel$handleCvvSubmitted$1> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = paymentMethodAccordionViewModel;
        this.getHighSpeedVideoSizesFor = str;
        this.getHighSpeedVideoSizes = str2;
        this.getHighSpeedVideoFpsRanges = str3;
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getOutputMinFrameDuration = planAccordionData;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getInputFormats = fundingOption;
        this.Camera2StreamConfigurationMap = map;
    }
}
