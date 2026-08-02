package com.paypal.oslo.feature.identity.passwordrecovery.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passwordrecovery.ui.PasswordRecoveryViewModel", f = "PasswordRecoveryViewModel.kt", i = {0, 0}, l = {132}, m = "submitPasswordRecovery", n = {"event", "createPasswordInput"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes13.dex */
final class PasswordRecoveryViewModel$submitPasswordRecovery$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.passwordrecovery.ui.PasswordRecoveryViewModel getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.identity.passwordrecovery.ui.PasswordRecoveryViewModel.access$submitPasswordRecovery(this.getHighSpeedVideoFpsRanges, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasswordRecoveryViewModel$submitPasswordRecovery$1(com.paypal.oslo.feature.identity.passwordrecovery.ui.PasswordRecoveryViewModel passwordRecoveryViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passwordrecovery.ui.PasswordRecoveryViewModel$submitPasswordRecovery$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = passwordRecoveryViewModel;
    }
}
