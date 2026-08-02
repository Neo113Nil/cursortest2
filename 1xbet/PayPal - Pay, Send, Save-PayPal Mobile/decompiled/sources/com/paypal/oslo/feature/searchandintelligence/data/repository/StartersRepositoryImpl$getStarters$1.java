package com.paypal.oslo.feature.searchandintelligence.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.searchandintelligence.data.repository.StartersRepositoryImpl", f = "StartersRepositoryImpl.kt", i = {0}, l = {68}, m = "getStarters", n = {"surfaces"}, nl = {74}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class StartersRepositoryImpl$getStarters$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.searchandintelligence.data.repository.StartersRepositoryImpl Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.getStarters(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StartersRepositoryImpl$getStarters$1(com.paypal.oslo.feature.searchandintelligence.data.repository.StartersRepositoryImpl startersRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.searchandintelligence.data.repository.StartersRepositoryImpl$getStarters$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = startersRepositoryImpl;
    }
}
