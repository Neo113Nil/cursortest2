package com.zettle.sdk.core.auth;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.auth.AuthModuleImpl", f = "AuthModule.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_PATH_ROTATE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, m = "persist", n = {"this", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "$this$withLock_u24default$iv", "stored", "this", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "stored"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"})
/* loaded from: classes16.dex */
final class AuthModuleImpl$persist$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.zettle.sdk.core.auth.AuthModuleImpl getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getOutputFormats.Camera2StreamConfigurationMap(null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthModuleImpl$persist$1(com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.AuthModuleImpl$persist$1> continuation) {
        super(continuation);
        this.getOutputFormats = authModuleImpl;
    }
}
