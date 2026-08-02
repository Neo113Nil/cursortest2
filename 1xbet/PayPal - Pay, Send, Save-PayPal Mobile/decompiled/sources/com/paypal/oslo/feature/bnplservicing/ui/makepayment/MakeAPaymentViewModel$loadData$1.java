package com.paypal.oslo.feature.bnplservicing.ui.makepayment;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel$loadData$1", f = "MakeAPaymentViewModel.kt", i = {0, 1, 1}, l = {100, 101}, m = "invokeSuspend", n = {"request", "request", "result"}, nl = {101, 106}, s = {"L$0", "L$0", "L$1"}, v = 2)
/* loaded from: classes11.dex */
final class MakeAPaymentViewModel$loadData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        if (r8 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r8 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.input.MakeAPaymentOverviewInput makeAPaymentOverviewInput;
        com.paypal.oslo.feature.bnplservicing.domain.usecase.GetMakeAPaymentOverviewUseCase getMakeAPaymentOverviewUseCase;
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ShowErrorScreen showErrorScreen;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            makeAPaymentOverviewInput = new com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.input.MakeAPaymentOverviewInput(this.getHighSpeedVideoFpsRanges);
            getMakeAPaymentOverviewUseCase = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(makeAPaymentOverviewInput);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = getMakeAPaymentOverviewUseCase.invoke2(makeAPaymentOverviewInput, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?>>) this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                showErrorScreen = (com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent) obj;
                this.Camera2StreamConfigurationMap.processEvent$bnpl_servicing_prodRelease(showErrorScreen);
                return kotlin.Unit.INSTANCE;
            }
            makeAPaymentOverviewInput = (com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.input.MakeAPaymentOverviewInput) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult useCaseResult = (com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult) obj;
        if ((useCaseResult instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success) || (useCaseResult instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.PartialSuccess)) {
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(makeAPaymentOverviewInput);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(useCaseResult);
            this.getHighResolutionOutputSizeshNQ4ISI = 2;
            obj = com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel.access$onSuccess(this.Camera2StreamConfigurationMap, useCaseResult.getData(), useCaseResult.getCorrelationId(), this);
        } else {
            showErrorScreen = new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ShowErrorScreen(useCaseResult.getCorrelationId());
            this.Camera2StreamConfigurationMap.processEvent$bnpl_servicing_prodRelease(showErrorScreen);
            return kotlin.Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel$loadData$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MakeAPaymentViewModel$loadData$1(java.lang.String str, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel makeAPaymentViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = str;
        this.Camera2StreamConfigurationMap = makeAPaymentViewModel;
    }
}
