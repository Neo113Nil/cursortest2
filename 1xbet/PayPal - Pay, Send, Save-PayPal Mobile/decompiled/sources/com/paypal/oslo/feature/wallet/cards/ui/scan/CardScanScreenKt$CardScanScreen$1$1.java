package com.paypal.oslo.feature.wallet.cards.ui.scan;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanScreenKt$CardScanScreen$1$1", f = "CardScanScreen.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class CardScanScreenKt$CardScanScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.SharedFlow<java.lang.Integer> toastEvents = this.getHighSpeedVideoSizes.getToastEvents();
            final android.content.Context context = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRanges = 1;
            if (toastEvents.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanScreenKt$CardScanScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    android.widget.Toast.makeText(context, ((java.lang.Number) obj2).intValue(), 0).show();
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanScreenKt$CardScanScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanScreenKt$CardScanScreen$1$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardScanScreenKt$CardScanScreen$1$1(com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanViewModel cardScanViewModel, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanScreenKt$CardScanScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = cardScanViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = context;
    }
}
