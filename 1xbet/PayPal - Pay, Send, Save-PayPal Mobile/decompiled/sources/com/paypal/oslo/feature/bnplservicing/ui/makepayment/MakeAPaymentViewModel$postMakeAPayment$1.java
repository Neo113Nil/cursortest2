package com.paypal.oslo.feature.bnplservicing.ui.makepayment;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel$postMakeAPayment$1", f = "MakeAPaymentViewModel.kt", i = {1, 1}, l = {126, 132}, m = "invokeSuspend", n = {"result", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, nl = {127, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes11.dex */
final class MakeAPaymentViewModel$postMakeAPayment$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.input.MakeAPaymentInput getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel getInputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
    
        if (r9 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplservicing.domain.usecase.PostMakeAPaymentUseCase postMakeAPaymentUseCase;
        java.lang.Object data;
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper makeAPaymentMapper;
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel makeAPaymentViewModel;
        com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult useCaseResult;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            postMakeAPaymentUseCase = this.getInputFormats.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = 1;
            obj = postMakeAPaymentUseCase.invoke2(this.getHighResolutionOutputSizeshNQ4ISI, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?>>) this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                makeAPaymentViewModel = (com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel) this.Camera2StreamConfigurationMap;
                data = this.getHighSpeedVideoFpsRanges;
                useCaseResult = (com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult) this.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                makeAPaymentViewModel.processEvent$bnpl_servicing_prodRelease(new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnPaymentSucceeded((com.paypal.oslo.feature.bnplservicing.ui.makepayment.uimodels.PaymentSuccessUiModel) obj, ((com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success) useCaseResult).getCorrelationId(), ((com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentSuccess) data).getAmount()));
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult useCaseResult2 = (com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult) obj;
        if (useCaseResult2 instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success) {
            data = ((com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success) useCaseResult2).getData();
            if (data instanceof com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentSuccess) {
                com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel makeAPaymentViewModel2 = this.getInputFormats;
                makeAPaymentMapper = makeAPaymentViewModel2.getHighSpeedVideoSizes;
                this.getHighSpeedVideoFpsRangesFor = useCaseResult2;
                this.getHighSpeedVideoFpsRanges = data;
                this.Camera2StreamConfigurationMap = makeAPaymentViewModel2;
                this.getHighSpeedVideoSizes = 2;
                java.lang.Object paymentSuccess = makeAPaymentMapper.toPaymentSuccess((com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentSuccess) data, this);
                if (paymentSuccess != coroutine_suspended) {
                    makeAPaymentViewModel = makeAPaymentViewModel2;
                    useCaseResult = useCaseResult2;
                    obj = paymentSuccess;
                    makeAPaymentViewModel.processEvent$bnpl_servicing_prodRelease(new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnPaymentSucceeded((com.paypal.oslo.feature.bnplservicing.ui.makepayment.uimodels.PaymentSuccessUiModel) obj, ((com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success) useCaseResult).getCorrelationId(), ((com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentSuccess) data).getAmount()));
                }
                return coroutine_suspended;
            }
            this.getInputFormats.processEvent$bnpl_servicing_prodRelease(new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnPaymentError(null, 1, null));
        } else if (useCaseResult2 instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error) {
            this.getInputFormats.processEvent$bnpl_servicing_prodRelease(new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnPaymentError((com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error) useCaseResult2));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel$postMakeAPayment$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel$postMakeAPayment$1(this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MakeAPaymentViewModel$postMakeAPayment$1(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel makeAPaymentViewModel, com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.input.MakeAPaymentInput makeAPaymentInput, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel$postMakeAPayment$1> continuation) {
        super(2, continuation);
        this.getInputFormats = makeAPaymentViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = makeAPaymentInput;
    }
}
