package com.paypal.oslo.feature.identity.login;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl", f = "IdentityLoginFlowEffectExecutor.kt", i = {0}, l = {129}, m = "executeAttemptPasskey", n = {"activity"}, nl = {131}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class IdentityLoginFlowEffectExecutorImpl$executeAttemptPasskey$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdentityLoginFlowEffectExecutorImpl$executeAttemptPasskey$1(com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl identityLoginFlowEffectExecutorImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeAttemptPasskey$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = identityLoginFlowEffectExecutorImpl;
    }
}
