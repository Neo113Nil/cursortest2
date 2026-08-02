package com.paypal.oslo.feature.settings.data.apollo;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl", f = "SettingsApolloClientImpl.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, m = "getCreditAutoPayStatus", n = {"input"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class SettingsApolloClientImpl$getCreditAutoPayStatus$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.getCreditAutoPayStatus(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsApolloClientImpl$getCreditAutoPayStatus$1(com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl settingsApolloClientImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$getCreditAutoPayStatus$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = settingsApolloClientImpl;
    }
}
