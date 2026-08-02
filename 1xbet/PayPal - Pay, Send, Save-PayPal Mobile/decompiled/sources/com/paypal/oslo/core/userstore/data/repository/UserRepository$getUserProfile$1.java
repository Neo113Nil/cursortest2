package com.paypal.oslo.core.userstore.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.userstore.data.repository.UserRepository", f = "UserRepository.kt", i = {0}, l = {42}, m = "getUserProfile", n = {"fetchPolicy"}, nl = {44}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class UserRepository$getUserProfile$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.userstore.data.repository.UserRepository getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.getUserProfile(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserRepository$getUserProfile$1(com.paypal.oslo.core.userstore.data.repository.UserRepository userRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.userstore.data.repository.UserRepository$getUserProfile$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = userRepository;
    }
}
