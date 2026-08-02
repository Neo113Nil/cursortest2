package com.ingo.sdk.kotlin.common.features.configuration;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.kotlin.common.features.configuration.ConfigurationApi", f = "ConfigurationApi.kt", i = {0, 1, 1}, l = {62, 35}, m = "getConfiguration", n = {"urlString", "urlString", "response"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes9.dex */
final class ConfigurationApi$getConfiguration$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.ingo.sdk.kotlin.common.features.configuration.ConfigurationApi getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.getConfiguration(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfigurationApi$getConfiguration$1(com.ingo.sdk.kotlin.common.features.configuration.ConfigurationApi configurationApi, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.features.configuration.ConfigurationApi$getConfiguration$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = configurationApi;
    }
}
