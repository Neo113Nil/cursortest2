package com.zettle.sdk.core.auth;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.auth.AuthModuleImpl", f = "AuthModule.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 7, 7, 8, 8, 9, 9}, l = {androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_PATH_ROTATE, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_OFFSET, 341, 429, 350, 440, 451, 381, 394, 397}, m = "fetchTokens", n = {"this", "scopes", "$this$withLock_u24default$iv", "forced", "isRetryAfter401", "ttl", "this", "scopes", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "forced", "isRetryAfter401", "ttl", "this", "$this$withLock_u24default$iv", "this", "scopes", "$this$withLock_u24default$iv", "$completion$iv", "this", "$this$withLock_u24default$iv", "this", "scopes", "$this$withLock_u24default$iv", "$completion$iv", "isRetryAfter401", "this", "$this$withLock_u24default$iv", "$completion$iv", "this", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "tokens", "$this$withLock_u24default$iv", "tokens"}, s = {"L$0", "L$1", "L$2", "Z$0", "Z$1", "J$0", "L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1", "J$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes16.dex */
final class AuthModuleImpl$fetchTokens$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    long getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.zettle.sdk.core.auth.AuthModuleImpl getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    boolean getInputSizeshNQ4ISI;
    boolean getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getInputFormats = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getHighSpeedVideoSizesFor.getHighSpeedVideoSizes(null, false, false, 0L, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthModuleImpl$fetchTokens$1(com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.AuthModuleImpl$fetchTokens$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = authModuleImpl;
    }
}
