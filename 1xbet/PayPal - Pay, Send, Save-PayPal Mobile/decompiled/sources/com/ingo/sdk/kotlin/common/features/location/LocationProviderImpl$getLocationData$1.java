package com.ingo.sdk.kotlin.common.features.location;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.kotlin.common.features.location.LocationProviderImpl", f = "LocationProviderImpl.kt", i = {}, l = {36}, m = "getLocationData", n = {}, s = {})
/* loaded from: classes9.dex */
final class LocationProviderImpl$getLocationData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.ingo.sdk.kotlin.common.features.location.LocationProviderImpl Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.getLocationData(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocationProviderImpl$getLocationData$1(com.ingo.sdk.kotlin.common.features.location.LocationProviderImpl locationProviderImpl, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.features.location.LocationProviderImpl$getLocationData$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = locationProviderImpl;
    }
}
