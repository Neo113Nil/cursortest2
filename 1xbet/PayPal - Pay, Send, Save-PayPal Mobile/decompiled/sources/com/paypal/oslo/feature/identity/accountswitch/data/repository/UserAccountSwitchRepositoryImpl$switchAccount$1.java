package com.paypal.oslo.feature.identity.accountswitch.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.accountswitch.data.repository.UserAccountSwitchRepositoryImpl", f = "UserAccountSwitchRepositoryImpl.kt", i = {0, 0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE}, m = "switchAccount", n = {"clientId", "targetPartyId", "input", "callConfig", "apolloCall"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes12.dex */
final class UserAccountSwitchRepositoryImpl$switchAccount$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.accountswitch.data.repository.UserAccountSwitchRepositoryImpl getHighSpeedVideoSizesFor;
    int getInputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.switchAccount(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserAccountSwitchRepositoryImpl$switchAccount$1(com.paypal.oslo.feature.identity.accountswitch.data.repository.UserAccountSwitchRepositoryImpl userAccountSwitchRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.accountswitch.data.repository.UserAccountSwitchRepositoryImpl$switchAccount$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = userAccountSwitchRepositoryImpl;
    }
}
