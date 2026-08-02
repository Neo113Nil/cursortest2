package com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel$handleReceiveAmountChanged$1", f = "CrossBorderViewModel.kt", i = {0, 1, 1}, l = {259, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, m = "invokeSuspend", n = {"normalizedReceiveAmount", "normalizedReceiveAmount", "currentState"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, s = {"L$0", "L$0", "L$1"}, v = 2)
/* loaded from: classes13.dex */
final class CrossBorderViewModel$handleReceiveAmountChanged$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent, kotlin.Unit> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.ReceiveAmountChanged getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00bc, code lost:
    
        if (r13 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c5, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(500, r12) != r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.text.Regex regex;
        java.lang.String replaceFirst;
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String rawAmount = this.getHighSpeedVideoSizes.getRawAmount();
            regex = com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModelKt.getHighSpeedVideoSizes;
            replaceFirst = regex.replaceFirst(rawAmount, "");
            if (replaceFirst.length() == 0 || kotlin.jvm.internal.Intrinsics.areEqual(replaceFirst, "0")) {
                return kotlin.Unit.INSTANCE;
            }
            this.Camera2StreamConfigurationMap = replaceFirst;
            this.getHighSpeedVideoFpsRangesFor = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            replaceFirst = (java.lang.String) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState value = this.getOutputMinFrameDuration.getUiState().getValue();
        if (value.getTransferAttemptId().length() == 0 || value.getReceiveCurrencyCode().length() == 0) {
            return kotlin.Unit.INSTANCE;
        }
        com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel crossBorderViewModel = this.getOutputMinFrameDuration;
        java.lang.String transferAttemptId = value.getTransferAttemptId();
        java.lang.String receiveCurrencyCode = value.getReceiveCurrencyCode();
        char[] cArr = {com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR};
        this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(replaceFirst);
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(value);
        this.getHighSpeedVideoFpsRangesFor = 2;
        highResolutionOutputSizeshNQ4ISI = crossBorderViewModel.getHighResolutionOutputSizeshNQ4ISI(transferAttemptId, null, new com.paypal.oslo.feature.p2p.domain.model.CurrencyInput(receiveCurrencyCode, kotlin.text.StringsKt.trimEnd(replaceFirst, cArr)), value.getSendCurrencyCode(), this.getHighSpeedVideoFpsRanges, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel$handleReceiveAmountChanged$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel$handleReceiveAmountChanged$1(this.getHighSpeedVideoSizes, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CrossBorderViewModel$handleReceiveAmountChanged$1(com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.ReceiveAmountChanged receiveAmountChanged, com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel crossBorderViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel$handleReceiveAmountChanged$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = receiveAmountChanged;
        this.getOutputMinFrameDuration = crossBorderViewModel;
        this.getHighSpeedVideoFpsRanges = function1;
    }
}
