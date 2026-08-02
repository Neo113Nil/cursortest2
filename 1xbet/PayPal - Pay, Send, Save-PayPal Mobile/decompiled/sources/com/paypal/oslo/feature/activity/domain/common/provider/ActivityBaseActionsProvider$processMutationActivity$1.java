package com.paypal.oslo.feature.activity.domain.common.provider;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider", f = "ActivityBaseActionsProvider.kt", i = {0}, l = {76}, m = "processMutationActivity", n = {"activityActionModel"}, nl = {75}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class ActivityBaseActionsProvider$processMutationActivity$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityBaseActionsProvider$processMutationActivity$1(com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider activityBaseActionsProvider, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider$processMutationActivity$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = activityBaseActionsProvider;
    }
}
