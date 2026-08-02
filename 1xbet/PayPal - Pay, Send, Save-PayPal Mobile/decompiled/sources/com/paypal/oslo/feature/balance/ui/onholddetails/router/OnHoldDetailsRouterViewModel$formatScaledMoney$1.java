package com.paypal.oslo.feature.balance.ui.onholddetails.router;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel", f = "OnHoldDetailsRouterViewModel.kt", i = {0}, l = {98}, m = "formatScaledMoney", n = {"money"}, nl = {104}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class OnHoldDetailsRouterViewModel$formatScaledMoney$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.formatScaledMoney(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnHoldDetailsRouterViewModel$formatScaledMoney$1(com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel onHoldDetailsRouterViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterViewModel$formatScaledMoney$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = onHoldDetailsRouterViewModel;
    }
}
