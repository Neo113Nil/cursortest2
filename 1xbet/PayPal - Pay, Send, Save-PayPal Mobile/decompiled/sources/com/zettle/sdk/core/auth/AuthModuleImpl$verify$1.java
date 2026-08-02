package com.zettle.sdk.core.auth;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.auth.AuthModuleImpl", f = "AuthModule.kt", i = {}, l = {137}, m = "verify-0E7RQCE", n = {}, s = {})
/* loaded from: classes16.dex */
final class AuthModuleImpl$verify$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.zettle.sdk.core.auth.AuthModuleImpl getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        java.lang.Object mo23159verify0E7RQCE = this.getHighResolutionOutputSizeshNQ4ISI.mo23159verify0E7RQCE(null, false, this);
        return mo23159verify0E7RQCE == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mo23159verify0E7RQCE : kotlin.Result.m23435boximpl(mo23159verify0E7RQCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthModuleImpl$verify$1(com.zettle.sdk.core.auth.AuthModuleImpl authModuleImpl, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.AuthModuleImpl$verify$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = authModuleImpl;
    }
}
