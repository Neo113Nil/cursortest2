package com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.viewmodel.AcceptMoneyChoiceViewModel$processEvent$1", f = "AcceptMoneyChoiceViewModel.kt", i = {}, l = {52, 55, 58, 61}, m = "invokeSuspend", n = {}, nl = {54, 57, 60, 50}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class AcceptMoneyChoiceViewModel$processEvent$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEvent Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.viewmodel.AcceptMoneyChoiceViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r7.send(com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEffect.NavigateBack.INSTANCE, r6) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0085, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (r7.send(com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEffect.NavigateToKeepInPayPal.INSTANCE, r6) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (r7.send(com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEffect.NavigateToTransferToBank.INSTANCE, r6) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        if (r7.send(com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEffect.ShowTerms.INSTANCE, r6) == r0) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.Channel channel;
        kotlinx.coroutines.channels.Channel channel2;
        kotlinx.coroutines.channels.Channel channel3;
        kotlinx.coroutines.channels.Channel channel4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEvent acceptMoneyChoiceEvent = this.Camera2StreamConfigurationMap;
            if (acceptMoneyChoiceEvent instanceof com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEvent.CloseClicked) {
                channel4 = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRangesFor = 1;
            } else if (acceptMoneyChoiceEvent instanceof com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEvent.KeepInPayPalClicked) {
                channel3 = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRangesFor = 2;
            } else if (acceptMoneyChoiceEvent instanceof com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEvent.TransferToBankClicked) {
                channel2 = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRangesFor = 3;
            } else if (acceptMoneyChoiceEvent instanceof com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEvent.TermsClicked) {
                channel = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRangesFor = 4;
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
        return ((com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.viewmodel.AcceptMoneyChoiceViewModel$processEvent$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.viewmodel.AcceptMoneyChoiceViewModel$processEvent$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcceptMoneyChoiceViewModel$processEvent$1(com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEvent acceptMoneyChoiceEvent, com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.viewmodel.AcceptMoneyChoiceViewModel acceptMoneyChoiceViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.viewmodel.AcceptMoneyChoiceViewModel$processEvent$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = acceptMoneyChoiceEvent;
        this.getHighResolutionOutputSizeshNQ4ISI = acceptMoneyChoiceViewModel;
    }
}
