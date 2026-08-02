package com.paypal.oslo.feature.p2p.ui.review.viewmodels;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel$handleAddFIFlowCompleted$1", f = "PaymentMethodAccordionViewModel.kt", i = {}, l = {462}, m = "invokeSuspend", n = {}, nl = {androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PaymentMethodAccordionViewModel$handleAddFIFlowCompleted$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.util.List<java.lang.String> Camera2StreamConfigurationMap;
    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.FundingOption> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.FundingOption getHighSpeedVideoSizesFor;
    final /* synthetic */ java.lang.String getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.p2p.domain.usecase.AddFinancialInstrumentsToPaymentTransferAttemptUseCase addFinancialInstrumentsToPaymentTransferAttemptUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            addFinancialInstrumentsToPaymentTransferAttemptUseCase = this.getOutputFormats.Camera2StreamConfigurationMap;
            this.getOutputMinFrameDuration = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(addFinancialInstrumentsToPaymentTransferAttemptUseCase.invoke(this.getInputFormats, this.Camera2StreamConfigurationMap), new com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel$handleAddFIFlowCompleted$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats, null), this) == coroutine_suspended) {
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

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/p2p/domain/error/TransferError;", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel$handleAddFIFlowCompleted$1$1", f = "PaymentMethodAccordionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel$handleAddFIFlowCompleted$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.TransferError, ? extends com.paypal.oslo.feature.p2p.domain.model.FundingOptions>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.FundingOption> Camera2StreamConfigurationMap;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.FundingOption getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ boolean getHighSpeedVideoSizes;
        /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
        final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel getOutputFormats;
        int getOutputMinFrameDuration;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            arrow.core.Ior ior = (arrow.core.Ior) this.getHighSpeedVideoSizesFor;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getOutputMinFrameDuration != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent, kotlin.Unit> function1 = this.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData planAccordionData = this.getHighSpeedVideoFpsRangesFor;
            boolean z = this.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.p2p.domain.model.FundingOption fundingOption = this.getHighSpeedVideoFpsRanges;
            java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.FundingOption> map = this.Camera2StreamConfigurationMap;
            com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel paymentMethodAccordionViewModel = this.getOutputFormats;
            if (ior instanceof arrow.core.Ior.Left) {
                function1.invoke(new com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.PlanDataUpdated(planAccordionData, z, null, null, fundingOption, map, null, null, false, 460, null));
                function1.invoke(com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent.FundingOptionsUnavailable.INSTANCE);
            } else if (ior instanceof arrow.core.Ior.Right) {
                paymentMethodAccordionViewModel.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.p2p.domain.model.FundingOptions) ((arrow.core.Ior.Right) ior).getValue(), true);
            } else if (ior instanceof arrow.core.Ior.Both) {
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                paymentMethodAccordionViewModel.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.p2p.domain.model.FundingOptions) both.getRightValue(), true);
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.TransferError, ? extends com.paypal.oslo.feature.p2p.domain.model.FundingOptions> ior, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel$handleAddFIFlowCompleted$1.AnonymousClass1) create(ior, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel$handleAddFIFlowCompleted$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel$handleAddFIFlowCompleted$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getOutputFormats, continuation);
            anonymousClass1.getHighSpeedVideoSizesFor = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent, kotlin.Unit> function1, com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData planAccordionData, boolean z, com.paypal.oslo.feature.p2p.domain.model.FundingOption fundingOption, java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.FundingOption> map, com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel paymentMethodAccordionViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel$handleAddFIFlowCompleted$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = function1;
            this.getHighSpeedVideoFpsRangesFor = planAccordionData;
            this.getHighSpeedVideoSizes = z;
            this.getHighSpeedVideoFpsRanges = fundingOption;
            this.Camera2StreamConfigurationMap = map;
            this.getOutputFormats = paymentMethodAccordionViewModel;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel$handleAddFIFlowCompleted$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel$handleAddFIFlowCompleted$1(this.getOutputFormats, this.getInputFormats, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PaymentMethodAccordionViewModel$handleAddFIFlowCompleted$1(com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel paymentMethodAccordionViewModel, java.lang.String str, java.util.List<java.lang.String> list, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.review.events.PaymentMethodAccordionEvent, kotlin.Unit> function1, com.paypal.oslo.feature.moneymovement.api.ui.plan.PlanAccordionData planAccordionData, boolean z, com.paypal.oslo.feature.p2p.domain.model.FundingOption fundingOption, java.util.Map<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.FundingOption> map, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel$handleAddFIFlowCompleted$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = paymentMethodAccordionViewModel;
        this.getInputFormats = str;
        this.Camera2StreamConfigurationMap = list;
        this.getHighSpeedVideoFpsRanges = function1;
        this.getHighSpeedVideoSizes = planAccordionData;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoSizesFor = fundingOption;
        this.getHighSpeedVideoFpsRangesFor = map;
    }
}
