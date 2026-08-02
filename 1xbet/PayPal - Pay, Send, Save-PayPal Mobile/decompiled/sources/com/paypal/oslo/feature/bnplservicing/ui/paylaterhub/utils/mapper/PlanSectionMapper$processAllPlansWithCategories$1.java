package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PlanSectionMapper", f = "PlanSectionMapper.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, 255}, m = "processAllPlansWithCategories$bnpl_servicing_prodRelease", n = {"plans", "readyToUsePlans", "activePlans", "historyPlans", "$this$forEach$iv", "element$iv", "plan", "isFromActiveQuery", "$i$f$forEach", "$i$a$-forEach-PlanSectionMapper$processAllPlansWithCategories$2", "plans", "readyToUsePlans", "activePlans", "historyPlans", "$this$forEach$iv", "element$iv", "plan", "isFromActiveQuery", "$i$f$forEach", "$i$a$-forEach-PlanSectionMapper$processAllPlansWithCategories$2", "plans", "readyToUsePlans", "activePlans", "historyPlans", "$this$forEach$iv", "element$iv", "plan", "isFromActiveQuery", "$i$f$forEach", "$i$a$-forEach-PlanSectionMapper$processAllPlansWithCategories$2", "plans", "readyToUsePlans", "activePlans", "historyPlans", "$this$forEach$iv", "element$iv", "plan", "isFromActiveQuery", "$i$f$forEach", "$i$a$-forEach-PlanSectionMapper$processAllPlansWithCategories$2", "plans", "readyToUsePlans", "activePlans", "historyPlans", "$this$forEach$iv", "element$iv", "plan", "isFromActiveQuery", "$i$f$forEach", "$i$a$-forEach-PlanSectionMapper$processAllPlansWithCategories$2"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, 259}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "Z$0", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "Z$0", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "Z$0", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "Z$0", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "Z$0", "I$0", "I$1"}, v = 2)
/* loaded from: classes11.dex */
final class PlanSectionMapper$processAllPlansWithCategories$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    boolean getOutputMinFrameDurationlomOqCM;
    int getOutputSizes;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PlanSectionMapper getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDurationlomOqCM = obj;
        this.getOutputSizes |= Integer.MIN_VALUE;
        return this.getOutputSizeshNQ4ISI.processAllPlansWithCategories$bnpl_servicing_prodRelease(null, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlanSectionMapper$processAllPlansWithCategories$1(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PlanSectionMapper planSectionMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PlanSectionMapper$processAllPlansWithCategories$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = planSectionMapper;
    }
}
