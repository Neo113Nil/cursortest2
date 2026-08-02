package com.paypal.oslo.feature.businesshome.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesshome.domain.usecase.ShouldShowEngagementCardUseCase", f = "ShouldShowEngagementCardUseCase.kt", i = {0}, l = {20}, m = "invoke", n = {"cardId"}, nl = {23}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class ShouldShowEngagementCardUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.businesshome.domain.usecase.ShouldShowEngagementCardUseCase getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShouldShowEngagementCardUseCase$invoke$1(com.paypal.oslo.feature.businesshome.domain.usecase.ShouldShowEngagementCardUseCase shouldShowEngagementCardUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesshome.domain.usecase.ShouldShowEngagementCardUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = shouldShowEngagementCardUseCase;
    }
}
