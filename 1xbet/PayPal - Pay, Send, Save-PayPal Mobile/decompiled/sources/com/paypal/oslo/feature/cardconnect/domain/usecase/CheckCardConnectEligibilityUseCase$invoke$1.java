package com.paypal.oslo.feature.cardconnect.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cardconnect.domain.usecase.CheckCardConnectEligibilityUseCase", f = "CheckCardConnectEligibilityUseCase.kt", i = {0}, l = {34}, m = "invoke", n = {"request"}, nl = {-1}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class CheckCardConnectEligibilityUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.cardconnect.domain.usecase.CheckCardConnectEligibilityUseCase getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.invoke((com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityRequest) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult<? extends com.paypal.oslo.feature.cardconnect.domain.model.CardConnectEligibilityResponse>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckCardConnectEligibilityUseCase$invoke$1(com.paypal.oslo.feature.cardconnect.domain.usecase.CheckCardConnectEligibilityUseCase checkCardConnectEligibilityUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cardconnect.domain.usecase.CheckCardConnectEligibilityUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = checkCardConnectEligibilityUseCase;
    }
}
