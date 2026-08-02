package com.paypal.oslo.feature.settings.data.apollo;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl", f = "SettingsApolloClientImpl.kt", i = {0}, l = {299}, m = "getCashBackCardAutoPayStatus", n = {"input"}, nl = {300}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class SettingsApolloClientImpl$getCashBackCardAutoPayStatus$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.getCashBackCardAutoPayStatus(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsApolloClientImpl$getCashBackCardAutoPayStatus$1(com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl settingsApolloClientImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$getCashBackCardAutoPayStatus$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = settingsApolloClientImpl;
    }
}
