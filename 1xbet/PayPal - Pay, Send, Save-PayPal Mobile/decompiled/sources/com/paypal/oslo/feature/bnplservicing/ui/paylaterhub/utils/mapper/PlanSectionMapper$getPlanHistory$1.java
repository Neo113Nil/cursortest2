package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PlanSectionMapper", f = "PlanSectionMapper.kt", i = {0, 0}, l = {360}, m = "getPlanHistory$bnpl_servicing_prodRelease", n = {"plans", "isFromActiveQuery"}, nl = {-1}, s = {"L$0", "Z$0"}, v = 2)
/* loaded from: classes11.dex */
final class PlanSectionMapper$getPlanHistory$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PlanSectionMapper getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.getPlanHistory$bnpl_servicing_prodRelease(null, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlanSectionMapper$getPlanHistory$1(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PlanSectionMapper planSectionMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PlanSectionMapper$getPlanHistory$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = planSectionMapper;
    }
}
