package com.paypal.android.threeds.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.threeds.repository.ApiRepository", f = "ApiRepository.kt", i = {0}, l = {28}, m = "sdkDDC", n = {"sdkDdcRequest"}, nl = {29}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class ApiRepository$sdkDDC$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.android.threeds.repository.ApiRepository Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.sdkDDC(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ApiRepository$sdkDDC$1(com.paypal.android.threeds.repository.ApiRepository apiRepository, kotlin.coroutines.Continuation<? super com.paypal.android.threeds.repository.ApiRepository$sdkDDC$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = apiRepository;
    }
}
