package com.zettle.sdk.core.auth;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.auth.AuthModuleImpl", f = "AuthModule.kt", i = {0, 0, 0, 1, 1}, l = {androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_PATH_ROTATE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, m = "forceNoTokenLogin", n = {"this", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "$this$withLock_u24default$iv", "this", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
/* loaded from: classes16.dex */
final class AuthModuleImpl$forceNoTokenLogin$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.zettle.sdk.core.auth.AuthModuleImpl getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges(this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthModuleImpl$forceNoTokenLogin$1(com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.AuthModuleImpl$forceNoTokenLogin$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = authModuleImpl;
    }
}
