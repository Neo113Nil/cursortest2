package com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.CancelAutopayUseCase", f = "CancelAutopayUseCase.kt", i = {0}, l = {40}, m = "invoke", n = {"request"}, nl = {41}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class CancelAutopayUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.CancelAutopayUseCase getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.invoke2((com.paypal.oslo.feature.bnplservicing.domain.model.autopay.input.CancelAutoPayInput) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CancelAutopayUseCase$invoke$1(com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.CancelAutopayUseCase cancelAutopayUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.CancelAutopayUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = cancelAutopayUseCase;
    }
}
