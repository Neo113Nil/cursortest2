package com.paypal.oslo.feature.cardconnect.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cardconnect.domain.usecase.CardConnectCreateSessionUseCase", f = "CardConnectCreateSessionUseCase.kt", i = {0}, l = {34}, m = "invoke", n = {"request"}, nl = {-1}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class CardConnectCreateSessionUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.cardconnect.domain.usecase.CardConnectCreateSessionUseCase getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke2((com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionRequest) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionResponse>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardConnectCreateSessionUseCase$invoke$1(com.paypal.oslo.feature.cardconnect.domain.usecase.CardConnectCreateSessionUseCase cardConnectCreateSessionUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cardconnect.domain.usecase.CardConnectCreateSessionUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = cardConnectCreateSessionUseCase;
    }
}
