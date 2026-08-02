package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PlanSectionMapper", f = "PlanSectionMapper.kt", i = {0}, l = {312}, m = "getReadyToUsePlans$bnpl_servicing_prodRelease", n = {"plans"}, nl = {-1}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class PlanSectionMapper$getReadyToUsePlans$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PlanSectionMapper getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.getReadyToUsePlans$bnpl_servicing_prodRelease(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlanSectionMapper$getReadyToUsePlans$1(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PlanSectionMapper planSectionMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PlanSectionMapper$getReadyToUsePlans$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = planSectionMapper;
    }
}
