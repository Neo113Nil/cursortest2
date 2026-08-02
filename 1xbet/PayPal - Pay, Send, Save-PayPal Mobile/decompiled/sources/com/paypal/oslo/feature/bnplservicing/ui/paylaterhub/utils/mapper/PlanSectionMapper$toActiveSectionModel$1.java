package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PlanSectionMapper", f = "PlanSectionMapper.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {156, 157, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, 160}, m = "toActiveSectionModel", n = {"activePlans", "historyPlansFromHistoryQuery", "planListLimit", "hasEverUsedBnpl", "activePlans", "historyPlansFromHistoryQuery", "readyToUsePlans", "planListLimit", "hasEverUsedBnpl", "activePlans", "historyPlansFromHistoryQuery", "readyToUsePlans", "activeAfterPurchasePlans", "planListLimit", "hasEverUsedBnpl", "activePlans", "historyPlansFromHistoryQuery", "readyToUsePlans", "activeAfterPurchasePlans", "recentlyCompletedPlans", "it", "planListLimit", "hasEverUsedBnpl", "$i$a$-let-PlanSectionMapper$toActiveSectionModel$olderCompletedPlans$1"}, nl = {157, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, 159, 159}, s = {"L$0", "L$1", "I$0", "Z$0", "L$0", "L$1", "L$2", "I$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "I$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "Z$0", "I$1"}, v = 2)
/* loaded from: classes11.dex */
final class PlanSectionMapper$toActiveSectionModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    boolean getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PlanSectionMapper getOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getOutputStallDurationlomOqCM = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(null, 0, null, false, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlanSectionMapper$toActiveSectionModel$1(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PlanSectionMapper planSectionMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PlanSectionMapper$toActiveSectionModel$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = planSectionMapper;
    }
}
