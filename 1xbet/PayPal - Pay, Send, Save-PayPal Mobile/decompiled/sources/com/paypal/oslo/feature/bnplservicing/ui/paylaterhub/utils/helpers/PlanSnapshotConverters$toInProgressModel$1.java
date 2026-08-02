package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters", f = "PlanSnapshotConverters.kt", i = {0, 0, 0, 0, 0, 0}, l = {138}, m = "toInProgressModel", n = {"plan", "planDescription", "totalInstallmentsPaid", "totalInstallmentsCount", "isPending", "isPendingFraud"}, nl = {135}, s = {"L$0", "L$1", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes11.dex */
final class PlanSnapshotConverters$toInProgressModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getInputFormats.toInProgressModel(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlanSnapshotConverters$toInProgressModel$1(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters planSnapshotConverters, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters$toInProgressModel$1> continuation) {
        super(continuation);
        this.getInputFormats = planSnapshotConverters;
    }
}
