package com.paypal.oslo.core.security.initializer;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.security.initializer.RiskDataConfiguratorImpl", f = "RiskDataConfiguratorImpl.kt", i = {}, l = {39}, m = "setUp", n = {}, nl = {40}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class RiskDataConfiguratorImpl$setUp$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.security.initializer.RiskDataConfiguratorImpl getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.setUp(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RiskDataConfiguratorImpl$setUp$1(com.paypal.oslo.core.security.initializer.RiskDataConfiguratorImpl riskDataConfiguratorImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.security.initializer.RiskDataConfiguratorImpl$setUp$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = riskDataConfiguratorImpl;
    }
}
