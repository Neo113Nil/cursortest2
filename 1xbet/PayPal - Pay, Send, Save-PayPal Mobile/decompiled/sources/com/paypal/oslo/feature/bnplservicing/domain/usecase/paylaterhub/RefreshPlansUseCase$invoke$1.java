package com.paypal.oslo.feature.bnplservicing.domain.usecase.paylaterhub;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.domain.usecase.paylaterhub.RefreshPlansUseCase", f = "RefreshPlansUseCase.kt", i = {0}, l = {33}, m = "invoke", n = {"request"}, nl = {35}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class RefreshPlansUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.usecase.paylaterhub.RefreshPlansUseCase getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke2((com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.input.RefreshPlansInput) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RefreshPlansUseCase$invoke$1(com.paypal.oslo.feature.bnplservicing.domain.usecase.paylaterhub.RefreshPlansUseCase refreshPlansUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.usecase.paylaterhub.RefreshPlansUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = refreshPlansUseCase;
    }
}
