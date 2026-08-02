package com.paypal.oslo.feature.identity.accountswitch.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase", f = "UpdateTokenUseCase.kt", i = {0, 0, 1, 1}, l = {38, 40}, m = "invoke", n = {"newToken", "onTokenUpdateComplete", "newToken", "onTokenUpdateComplete"}, nl = {40, 58}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 2)
/* loaded from: classes12.dex */
final class UpdateTokenUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateTokenUseCase$invoke$1(com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase updateTokenUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = updateTokenUseCase;
    }
}
