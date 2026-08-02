package com.paypal.oslo.feature.activity.domain.usecase.widget;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.domain.usecase.widget.ActivityWidgetUseCase", f = "ActivityWidgetUseCase.kt", i = {0}, l = {52}, m = "executeRepositoryQueryForResult", n = {"activityQuery"}, nl = {53}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class ActivityWidgetUseCase$executeRepositoryQueryForResult$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.activity.domain.usecase.widget.ActivityWidgetUseCase getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityWidgetUseCase$executeRepositoryQueryForResult$1(com.paypal.oslo.feature.activity.domain.usecase.widget.ActivityWidgetUseCase activityWidgetUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.domain.usecase.widget.ActivityWidgetUseCase$executeRepositoryQueryForResult$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = activityWidgetUseCase;
    }
}
