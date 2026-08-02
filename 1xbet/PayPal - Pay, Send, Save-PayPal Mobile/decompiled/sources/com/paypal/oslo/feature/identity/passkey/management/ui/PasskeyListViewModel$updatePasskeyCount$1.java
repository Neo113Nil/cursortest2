package com.paypal.oslo.feature.identity.passkey.management.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel", f = "PasskeyListViewModel.kt", i = {0, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE}, m = "updatePasskeyCount", n = {"delta", "delta", "current"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE}, s = {"I$0", "I$0", "I$1"}, v = 2)
/* loaded from: classes12.dex */
final class PasskeyListViewModel$updatePasskeyCount$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(0, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasskeyListViewModel$updatePasskeyCount$1(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel passkeyListViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel$updatePasskeyCount$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = passkeyListViewModel;
    }
}
