package com.paypal.oslo.feature.balance.ui.onholddetails.router;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel", f = "OnHoldDetailsRouterViewModel.kt", i = {0, 0}, l = {78}, m = "formatMoney", n = {"money", "digits"}, nl = {84}, s = {"L$0", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class OnHoldDetailsRouterViewModel$formatMoney$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.formatMoney(null, 0, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnHoldDetailsRouterViewModel$formatMoney$1(com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel onHoldDetailsRouterViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel$formatMoney$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = onHoldDetailsRouterViewModel;
    }
}
