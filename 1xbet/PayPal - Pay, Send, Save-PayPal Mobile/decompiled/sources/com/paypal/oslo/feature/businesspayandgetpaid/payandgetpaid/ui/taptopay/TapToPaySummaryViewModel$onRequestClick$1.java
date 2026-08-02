package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPaySummaryViewModel$onRequestClick$1", f = "TapToPaySummaryViewModel.kt", i = {0, 0, 0, 0}, l = {100}, m = "invokeSuspend", n = {"paymentRequestData", "hasNoteUrlError", "hasNoteLengthError", "hasValidationErrors"}, nl = {102}, s = {"L$0", "Z$0", "Z$1", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class TapToPaySummaryViewModel$onRequestClick$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    boolean Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPaySummaryViewModel getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPaySummaryUiState copy;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayRequest tapToPayRequest;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayRequest tapToPayRequest2;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayRequest tapToPayRequest3;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.Pair access$noteValidationErrors = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPaySummaryViewModel.access$noteValidationErrors(this.getInputSizeshNQ4ISI);
            boolean booleanValue = ((java.lang.Boolean) access$noteValidationErrors.component1()).booleanValue();
            boolean booleanValue2 = ((java.lang.Boolean) access$noteValidationErrors.component2()).booleanValue();
            mutableStateFlow = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            while (true) {
                java.lang.Object value = mutableStateFlow.getValue();
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2 = mutableStateFlow;
                copy = r5.copy((r20 & 1) != 0 ? r5.items : null, (r20 & 2) != 0 ? r5.note : null, (r20 & 4) != 0 ? r5.subtotalFormatted : null, (r20 & 8) != 0 ? r5.totalDiscount : null, (r20 & 16) != 0 ? r5.taxFormatted : null, (r20 & 32) != 0 ? r5.totalFormatted : null, (r20 & 64) != 0 ? r5.showNoteContainsUrlError : booleanValue, (r20 & 128) != 0 ? r5.showNoteTooLongError : booleanValue2, (r20 & 256) != 0 ? ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPaySummaryUiState) value).showCancelConfirmDialog : false);
                if (mutableStateFlow2.compareAndSet(value, copy)) {
                    break;
                }
                mutableStateFlow = mutableStateFlow2;
            }
            if (!booleanValue && !booleanValue2) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.businesspayandgetpaid.LoggerKt.log, "User initiated purchase creation request - validation passed", null, null, 6, null);
                java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> items = this.getInputSizeshNQ4ISI.getUiState().getValue().getItems();
                java.lang.String note = this.getInputSizeshNQ4ISI.getUiState().getValue().getNote();
                tapToPayRequest = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                java.lang.String currencyCode = tapToPayRequest.getCurrencyCode();
                tapToPayRequest2 = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                java.lang.String countryCode = tapToPayRequest2.getCountryCode();
                tapToPayRequest3 = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequest paymentRequest = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.PaymentRequest(currencyCode, items, note, tapToPayRequest3.getTaxSettings(), countryCode);
                mutableSharedFlow = this.getInputSizeshNQ4ISI.getHighSpeedVideoSizes;
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentRequest);
                this.Camera2StreamConfigurationMap = booleanValue;
                this.getHighSpeedVideoFpsRanges = booleanValue2;
                this.getHighSpeedVideoFpsRangesFor = 0;
                this.getHighSpeedVideoSizes = 1;
                if (mutableSharedFlow.emit(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPaySummaryUiEffect.NavigateToPayment(paymentRequest), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.businesspayandgetpaid.LoggerKt.log, "Validation failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("noteUrlError", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(booleanValue)), kotlin.TuplesKt.to("noteLengthError", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(booleanValue2))), null, 4, null);
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPaySummaryViewModel$onRequestClick$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPaySummaryViewModel$onRequestClick$1(this.getInputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapToPaySummaryViewModel$onRequestClick$1(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPaySummaryViewModel tapToPaySummaryViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPaySummaryViewModel$onRequestClick$1> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = tapToPaySummaryViewModel;
    }
}
