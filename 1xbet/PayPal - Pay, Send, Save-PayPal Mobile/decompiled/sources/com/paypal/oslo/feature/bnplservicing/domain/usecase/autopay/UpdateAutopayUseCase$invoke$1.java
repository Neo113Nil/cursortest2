package com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.UpdateAutopayUseCase", f = "UpdateAutopayUseCase.kt", i = {0}, l = {40}, m = "invoke", n = {"request"}, nl = {41}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class UpdateAutopayUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.UpdateAutopayUseCase getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke2((com.paypal.oslo.feature.bnplservicing.domain.model.autopay.input.UpdateAutoPayInput) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateAutopayUseCase$invoke$1(com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.UpdateAutopayUseCase updateAutopayUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.UpdateAutopayUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = updateAutopayUseCase;
    }
}
