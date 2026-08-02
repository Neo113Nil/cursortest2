package com.paypal.oslo.feature.balance.data.usecase.autoreload;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.data.usecase.autoreload.TurnOffScheduledAutoReloadUseCaseImpl", f = "TurnOffScheduledAutoReloadUseCaseImpl.kt", i = {}, l = {27}, m = "invoke", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class TurnOffScheduledAutoReloadUseCaseImpl$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.balance.data.usecase.autoreload.TurnOffScheduledAutoReloadUseCaseImpl getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TurnOffScheduledAutoReloadUseCaseImpl$invoke$1(com.paypal.oslo.feature.balance.data.usecase.autoreload.TurnOffScheduledAutoReloadUseCaseImpl turnOffScheduledAutoReloadUseCaseImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.data.usecase.autoreload.TurnOffScheduledAutoReloadUseCaseImpl$invoke$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = turnOffScheduledAutoReloadUseCaseImpl;
    }
}
