package com.paypal.oslo.feature.identity.passkey.management.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel", f = "PasskeyListViewModel.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE}, m = "handleDeleteSuccess", n = {"passkeyCredentialId", "authenticatorName", "success", "isLastPasskey", "passkeyCredentialId", "authenticatorName", "success", "isLastPasskey", "passkeyCredentialId", "authenticatorName", "success", "isLastPasskey"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE}, s = {"L$0", "L$1", "Z$0", "Z$1", "L$0", "L$1", "Z$0", "Z$1", "L$0", "L$1", "Z$0", "Z$1"}, v = 2)
/* loaded from: classes12.dex */
final class PasskeyListViewModel$handleDeleteSuccess$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    boolean Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel.access$handleDeleteSuccess(this.getInputSizeshNQ4ISI, null, false, false, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasskeyListViewModel$handleDeleteSuccess$1(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel passkeyListViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyListViewModel$handleDeleteSuccess$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = passkeyListViewModel;
    }
}
