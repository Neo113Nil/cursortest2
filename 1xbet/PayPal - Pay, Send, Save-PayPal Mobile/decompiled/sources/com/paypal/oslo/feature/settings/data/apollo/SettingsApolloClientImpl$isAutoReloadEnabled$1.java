package com.paypal.oslo.feature.settings.data.apollo;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl", f = "SettingsApolloClientImpl.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, m = "isAutoReloadEnabled", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SettingsApolloClientImpl$isAutoReloadEnabled$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.isAutoReloadEnabled(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsApolloClientImpl$isAutoReloadEnabled$1(com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl settingsApolloClientImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$isAutoReloadEnabled$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = settingsApolloClientImpl;
    }
}
