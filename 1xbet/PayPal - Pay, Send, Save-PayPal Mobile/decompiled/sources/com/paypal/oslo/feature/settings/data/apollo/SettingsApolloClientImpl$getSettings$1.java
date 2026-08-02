package com.paypal.oslo.feature.settings.data.apollo;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl", f = "SettingsApolloClientImpl.kt", i = {1}, l = {60, 67}, m = "getSettings", n = {"defaultData"}, nl = {64, 65}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class SettingsApolloClientImpl$getSettings$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.getSettings(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsApolloClientImpl$getSettings$1(com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl settingsApolloClientImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl$getSettings$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = settingsApolloClientImpl;
    }
}
