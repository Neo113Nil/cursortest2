package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters", f = "PlanSnapshotConverters.kt", i = {0, 0}, l = {108}, m = "toCompletedModel", n = {"plan", "completionInfo"}, nl = {105}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes11.dex */
final class PlanSnapshotConverters$toCompletedModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.toCompletedModel(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlanSnapshotConverters$toCompletedModel$1(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters planSnapshotConverters, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters$toCompletedModel$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = planSnapshotConverters;
    }
}
