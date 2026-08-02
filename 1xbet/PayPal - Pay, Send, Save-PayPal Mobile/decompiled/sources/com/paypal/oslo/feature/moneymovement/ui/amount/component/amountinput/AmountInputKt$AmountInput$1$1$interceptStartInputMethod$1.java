package com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.AmountInputKt$AmountInput$1$1", f = "AmountInput.kt", i = {}, l = {61}, m = "interceptStartInputMethod", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class AmountInputKt$AmountInput$1$1$interceptStartInputMethod$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.AmountInputKt$AmountInput$1$1 getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.interceptStartInputMethod(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AmountInputKt$AmountInput$1$1$interceptStartInputMethod$1(com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.AmountInputKt$AmountInput$1$1 amountInputKt$AmountInput$1$1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.moneymovement.ui.amount.component.amountinput.AmountInputKt$AmountInput$1$1$interceptStartInputMethod$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = amountInputKt$AmountInput$1$1;
    }
}
