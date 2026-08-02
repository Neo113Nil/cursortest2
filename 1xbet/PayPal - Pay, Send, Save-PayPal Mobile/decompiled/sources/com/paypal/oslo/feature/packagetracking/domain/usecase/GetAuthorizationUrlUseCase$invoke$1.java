package com.paypal.oslo.feature.packagetracking.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.packagetracking.domain.usecase.GetAuthorizationUrlUseCase", f = "GetAuthorizationUrlUseCase.kt", i = {0}, l = {42}, m = "invoke", n = {"emailProvider"}, nl = {43}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class GetAuthorizationUrlUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.packagetracking.domain.usecase.GetAuthorizationUrlUseCase getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetAuthorizationUrlUseCase$invoke$1(com.paypal.oslo.feature.packagetracking.domain.usecase.GetAuthorizationUrlUseCase getAuthorizationUrlUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.packagetracking.domain.usecase.GetAuthorizationUrlUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = getAuthorizationUrlUseCase;
    }
}
