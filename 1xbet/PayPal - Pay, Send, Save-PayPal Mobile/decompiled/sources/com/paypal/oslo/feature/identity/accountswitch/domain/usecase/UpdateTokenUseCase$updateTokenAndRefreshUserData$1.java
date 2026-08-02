package com.paypal.oslo.feature.identity.accountswitch.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase", f = "UpdateTokenUseCase.kt", i = {0, 1}, l = {66, 72}, m = "updateTokenAndRefreshUserData", n = {com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY}, nl = {72, 73}, s = {"L$0", "L$0"}, v = 2)
/* loaded from: classes12.dex */
final class UpdateTokenUseCase$updateTokenAndRefreshUserData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI((java.lang.String) null, (kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateTokenUseCase$updateTokenAndRefreshUserData$1(com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase updateTokenUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase$updateTokenAndRefreshUserData$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = updateTokenUseCase;
    }
}
