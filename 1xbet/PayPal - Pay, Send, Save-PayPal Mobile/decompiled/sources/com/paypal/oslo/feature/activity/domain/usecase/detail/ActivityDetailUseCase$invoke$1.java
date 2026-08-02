package com.paypal.oslo.feature.activity.domain.usecase.detail;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.domain.usecase.detail.ActivityDetailUseCase", f = "ActivityDetailUseCase.kt", i = {0}, l = {27}, m = "invoke", n = {"transaction"}, nl = {28}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class ActivityDetailUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.activity.domain.usecase.detail.ActivityDetailUseCase getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityDetailUseCase$invoke$1(com.paypal.oslo.feature.activity.domain.usecase.detail.ActivityDetailUseCase activityDetailUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.domain.usecase.detail.ActivityDetailUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = activityDetailUseCase;
    }
}
