package com.paypal.oslo.feature.xoom.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase", f = "CreateWebViewHeadersUseCase.kt", i = {}, l = {48}, m = "invoke", n = {}, nl = {65}, s = {}, v = 2)
/* loaded from: classes16.dex */
final class CreateWebViewHeadersUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateWebViewHeadersUseCase$invoke$1(com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase createWebViewHeadersUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = createWebViewHeadersUseCase;
    }
}
