package com.paypal.oslo.feature.balance.data.usecase.autoreload;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.data.usecase.autoreload.TurnOffLowBalanceAutoReloadUseCaseImpl", f = "TurnOffLowBalanceAutoReloadUseCaseImpl.kt", i = {}, l = {27}, m = "invoke", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class TurnOffLowBalanceAutoReloadUseCaseImpl$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.balance.data.usecase.autoreload.TurnOffLowBalanceAutoReloadUseCaseImpl getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TurnOffLowBalanceAutoReloadUseCaseImpl$invoke$1(com.paypal.oslo.feature.balance.data.usecase.autoreload.TurnOffLowBalanceAutoReloadUseCaseImpl turnOffLowBalanceAutoReloadUseCaseImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.data.usecase.autoreload.TurnOffLowBalanceAutoReloadUseCaseImpl$invoke$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = turnOffLowBalanceAutoReloadUseCaseImpl;
    }
}
