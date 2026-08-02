package com.paypal.android.threeds.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.threeds.repository.ApiRepository", f = "ApiRepository.kt", i = {0, 0}, l = {55}, m = "initChallengeSdk", n = {"url", "initChallengeSdkRequest"}, nl = {56}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes10.dex */
final class ApiRepository$initChallengeSdk$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.android.threeds.repository.ApiRepository getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.initChallengeSdk(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ApiRepository$initChallengeSdk$1(com.paypal.android.threeds.repository.ApiRepository apiRepository, kotlin.coroutines.Continuation<? super com.paypal.android.threeds.repository.ApiRepository$initChallengeSdk$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = apiRepository;
    }
}
