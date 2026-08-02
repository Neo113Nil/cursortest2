package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PlanSectionMapper", f = "PlanSectionMapper.kt", i = {0, 0, 0, 0, 0}, l = {132}, m = "toHistorySectionModel", n = {"historyPlans", "it", "planListLimit", "hasEverUsedBnpl", "$i$a$-let-PlanSectionMapper$toHistorySectionModel$historyPlanModels$1"}, nl = {131}, s = {"L$0", "L$1", "I$0", "Z$0", "I$1"}, v = 2)
/* loaded from: classes11.dex */
final class PlanSectionMapper$toHistorySectionModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    boolean Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PlanSectionMapper getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getOutputFormats = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getOutputMinFrameDuration.Camera2StreamConfigurationMap(null, 0, false, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlanSectionMapper$toHistorySectionModel$1(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PlanSectionMapper planSectionMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PlanSectionMapper$toHistorySectionModel$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = planSectionMapper;
    }
}
