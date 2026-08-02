package com.paypal.oslo.feature.wallet.cards.ui.scan;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanViewModel$initializeDyScan$1", f = "CardScanViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class CardScanViewModel$initializeDyScan$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.content.Context context;
        java.lang.String str;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            try {
                context = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
                str = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
                com.dyneti.android.dyscan.DyScan.init(context, str);
                mutableStateFlow = this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI;
                mutableStateFlow.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
            } catch (java.lang.Exception unused) {
                com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanViewModel.access$navigateBackWithError(this.getHighSpeedVideoSizes, com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_scan_error_loading);
            }
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanViewModel$initializeDyScan$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanViewModel$initializeDyScan$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardScanViewModel$initializeDyScan$1(com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanViewModel cardScanViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanViewModel$initializeDyScan$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = cardScanViewModel;
    }
}
