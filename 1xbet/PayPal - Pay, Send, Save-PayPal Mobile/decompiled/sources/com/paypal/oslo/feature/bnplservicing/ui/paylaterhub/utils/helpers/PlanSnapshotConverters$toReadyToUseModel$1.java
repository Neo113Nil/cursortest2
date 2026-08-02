package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters", f = "PlanSnapshotConverters.kt", i = {0, 0, 1, 1, 1, 1, 1}, l = {73, 84}, m = "toReadyToUseModel", n = {"plan", "usageLabel", "plan", "usageLabel", "formattedAmount", "duration", "$i$a$-let-PlanSnapshotConverters$toReadyToUseModel$validityText$2"}, nl = {82, 86}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class PlanSnapshotConverters$toReadyToUseModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.toReadyToUseModel(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlanSnapshotConverters$toReadyToUseModel$1(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters planSnapshotConverters, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.helpers.PlanSnapshotConverters$toReadyToUseModel$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = planSnapshotConverters;
    }
}
