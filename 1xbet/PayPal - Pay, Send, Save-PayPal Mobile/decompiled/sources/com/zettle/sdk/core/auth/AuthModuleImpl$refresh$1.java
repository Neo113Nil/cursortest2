package com.zettle.sdk.core.auth;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.auth.AuthModuleImpl", f = "AuthModule.kt", i = {}, l = {202}, m = "refresh-0E7RQCE", n = {}, s = {})
/* loaded from: classes16.dex */
final class AuthModuleImpl$refresh$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.zettle.sdk.core.auth.AuthModuleImpl Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        java.lang.Object mo23158refresh0E7RQCE = this.Camera2StreamConfigurationMap.mo23158refresh0E7RQCE(null, null, this);
        return mo23158refresh0E7RQCE == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mo23158refresh0E7RQCE : kotlin.Result.m23435boximpl(mo23158refresh0E7RQCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthModuleImpl$refresh$1(com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.AuthModuleImpl$refresh$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = authModuleImpl;
    }
}
