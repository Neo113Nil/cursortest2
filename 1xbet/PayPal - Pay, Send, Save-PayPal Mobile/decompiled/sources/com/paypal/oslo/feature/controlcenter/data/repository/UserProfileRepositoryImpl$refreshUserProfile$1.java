package com.paypal.oslo.feature.controlcenter.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.controlcenter.data.repository.UserProfileRepositoryImpl", f = "UserProfileRepositoryImpl.kt", i = {}, l = {85}, m = "refreshUserProfile", n = {}, nl = {86}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class UserProfileRepositoryImpl$refreshUserProfile$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.controlcenter.data.repository.UserProfileRepositoryImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.refreshUserProfile(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserProfileRepositoryImpl$refreshUserProfile$1(com.paypal.oslo.feature.controlcenter.data.repository.UserProfileRepositoryImpl userProfileRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.controlcenter.data.repository.UserProfileRepositoryImpl$refreshUserProfile$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = userProfileRepositoryImpl;
    }
}
