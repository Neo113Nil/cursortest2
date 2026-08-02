package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel$handleResult$1", f = "TapToPayProgressViewModel.kt", i = {}, l = {167, 174, 179, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class TapToPayProgressViewModel$handleResult$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (r7.emit(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnPayment(r2, ((com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.Success) r6.Camera2StreamConfigurationMap).getPayload()), r6) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b0, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        if (r7.emit(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnFailure(((com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.Failure) r6.Camera2StreamConfigurationMap).getType(), ((com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.Failure) r6.Camera2StreamConfigurationMap).getReason()), r6) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
    
        if (r7.emit(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnFailure(com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType.GENERIC_FAILURE, null), r6) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ae, code lost:
    
        if (r7.emit(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressUiEffect.OnCancelled.INSTANCE, r6) == r0) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow2;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow3;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow4;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequest paymentRequest;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult zettlePaymentResult = this.Camera2StreamConfigurationMap;
            if (zettlePaymentResult instanceof com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.Success) {
                mutableSharedFlow4 = this.getHighResolutionOutputSizeshNQ4ISI.getInputSizeshNQ4ISI;
                paymentRequest = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRanges = 1;
            } else if (zettlePaymentResult instanceof com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.Failure) {
                mutableSharedFlow3 = this.getHighResolutionOutputSizeshNQ4ISI.getInputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRanges = 2;
            } else if (zettlePaymentResult instanceof com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.Cancelled) {
                mutableSharedFlow2 = this.getHighResolutionOutputSizeshNQ4ISI.getInputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRanges = 3;
            } else if (zettlePaymentResult instanceof com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult.CancelledByUser) {
                mutableSharedFlow = this.getHighResolutionOutputSizeshNQ4ISI.getInputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRanges = 4;
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        } else {
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel$handleResult$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel$handleResult$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapToPayProgressViewModel$handleResult$1(com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.ZettlePaymentResult zettlePaymentResult, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel tapToPayProgressViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayProgressViewModel$handleResult$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = zettlePaymentResult;
        this.getHighResolutionOutputSizeshNQ4ISI = tapToPayProgressViewModel;
    }
}
