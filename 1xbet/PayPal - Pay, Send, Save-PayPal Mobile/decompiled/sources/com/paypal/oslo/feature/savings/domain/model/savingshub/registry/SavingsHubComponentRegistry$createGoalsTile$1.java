package com.paypal.oslo.feature.savings.domain.model.savingshub.registry;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry", f = "SavingsHubComponentRegistry.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {236, 247}, m = "createGoalsTile", n = {"moneyboxes", "accountMoneybox", "goalDTOs", "addedIds", "box", "isSmartRouteEnabled", "$i$a$-let-SavingsHubComponentRegistry$createGoalsTile$2", "moneyboxes", "accountMoneybox", "goalDTOs", "addedIds", "$this$forEach$iv", "element$iv", "goalMoneybox", "isSmartRouteEnabled", "$i$f$forEach", "$i$a$-forEach-SavingsHubComponentRegistry$createGoalsTile$5"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "Z$0", "I$0", "I$1"}, v = 2)
/* loaded from: classes14.dex */
final class SavingsHubComponentRegistry$createGoalsTile$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    boolean getOutputMinFrameDurationlomOqCM;
    int getOutputSizes;
    final /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry getOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getOutputStallDuration = obj;
        this.getOutputSizes |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(null, null, false, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsHubComponentRegistry$createGoalsTile$1(com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry savingsHubComponentRegistry, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$createGoalsTile$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = savingsHubComponentRegistry;
    }
}
