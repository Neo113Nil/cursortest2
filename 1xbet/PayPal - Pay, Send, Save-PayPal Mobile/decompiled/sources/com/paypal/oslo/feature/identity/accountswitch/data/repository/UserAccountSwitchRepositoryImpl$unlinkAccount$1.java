package com.paypal.oslo.feature.identity.accountswitch.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.accountswitch.data.repository.UserAccountSwitchRepositoryImpl", f = "UserAccountSwitchRepositoryImpl.kt", i = {0, 0, 0}, l = {174}, m = "unlinkAccount", n = {"mutation", "apolloCall", "callConfig"}, nl = {327}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes12.dex */
final class UserAccountSwitchRepositoryImpl$unlinkAccount$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.accountswitch.data.repository.UserAccountSwitchRepositoryImpl getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getOutputFormats.unlinkAccount(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserAccountSwitchRepositoryImpl$unlinkAccount$1(com.paypal.oslo.feature.identity.accountswitch.data.repository.UserAccountSwitchRepositoryImpl userAccountSwitchRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.accountswitch.data.repository.UserAccountSwitchRepositoryImpl$unlinkAccount$1> continuation) {
        super(continuation);
        this.getOutputFormats = userAccountSwitchRepositoryImpl;
    }
}
