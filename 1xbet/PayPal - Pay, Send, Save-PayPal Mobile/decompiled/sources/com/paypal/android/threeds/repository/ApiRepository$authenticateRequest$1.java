package com.paypal.android.threeds.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.threeds.repository.ApiRepository", f = "ApiRepository.kt", i = {0}, l = {42}, m = "authenticateRequest", n = {"aReq"}, nl = {43}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class ApiRepository$authenticateRequest$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.android.threeds.repository.ApiRepository getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.authenticateRequest(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ApiRepository$authenticateRequest$1(com.paypal.android.threeds.repository.ApiRepository apiRepository, kotlin.coroutines.Continuation<? super com.paypal.android.threeds.repository.ApiRepository$authenticateRequest$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = apiRepository;
    }
}
