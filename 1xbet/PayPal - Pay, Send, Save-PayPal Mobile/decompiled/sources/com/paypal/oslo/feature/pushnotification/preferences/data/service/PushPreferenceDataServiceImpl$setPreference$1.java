package com.paypal.oslo.feature.pushnotification.preferences.data.service;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.preferences.data.service.PushPreferenceDataServiceImpl", f = "PushPreferenceDataServiceImpl.kt", i = {0}, l = {84}, m = "setPreference", n = {"preferenceUpdateRequest"}, nl = {90}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class PushPreferenceDataServiceImpl$setPreference$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.preferences.data.service.PushPreferenceDataServiceImpl getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.setPreference(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PushPreferenceDataServiceImpl$setPreference$1(com.paypal.oslo.feature.pushnotification.preferences.data.service.PushPreferenceDataServiceImpl pushPreferenceDataServiceImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.preferences.data.service.PushPreferenceDataServiceImpl$setPreference$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = pushPreferenceDataServiceImpl;
    }
}
