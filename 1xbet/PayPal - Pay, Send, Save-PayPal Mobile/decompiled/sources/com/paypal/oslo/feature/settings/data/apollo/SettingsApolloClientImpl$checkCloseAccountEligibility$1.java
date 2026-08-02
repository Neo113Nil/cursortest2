package com.paypal.oslo.feature.settings.data.apollo;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl", f = "SettingsApolloClientImpl.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE}, m = "checkCloseAccountEligibility", n = {"input"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class SettingsApolloClientImpl$checkCloseAccountEligibility$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.checkCloseAccountEligibility(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsApolloClientImpl$checkCloseAccountEligibility$1(com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl settingsApolloClientImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$checkCloseAccountEligibility$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = settingsApolloClientImpl;
    }
}
