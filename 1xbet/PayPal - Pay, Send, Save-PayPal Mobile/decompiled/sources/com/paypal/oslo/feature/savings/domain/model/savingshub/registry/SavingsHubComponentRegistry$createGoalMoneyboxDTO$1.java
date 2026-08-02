package com.paypal.oslo.feature.savings.domain.model.savingshub.registry;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry", f = "SavingsHubComponentRegistry.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {310, 317}, m = "createGoalMoneyboxDTO", n = {"goalMoneybox", "currentBalance", "name", "targetAmount", "currentBalanceCurrency", "isSmartRouteEnabled", "currentAmount", "progress", "currentBalanceAmount", "goalMoneybox", "currentBalance", "name", "targetAmount", "currentBalanceCurrency", "targetCurrency", "isSmartRouteEnabled", "currentAmount", "progress", "currentBalanceAmount", "targetAmountValue"}, nl = {314, 319}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "F$0", "D$0", "D$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$7", "Z$0", "F$0", "D$0", "D$1", "D$2"}, v = 2)
/* loaded from: classes14.dex */
final class SavingsHubComponentRegistry$createGoalMoneyboxDTO$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    double Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    double getHighSpeedVideoFpsRanges;
    float getHighSpeedVideoFpsRangesFor;
    double getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    int getOutputSizes;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;
    boolean getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry isOutputSupportedFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getOutputSizeshNQ4ISI = obj;
        this.getOutputSizes |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.isOutputSupportedFor.getHighSpeedVideoSizes((com.paypal.oslo.feature.savings.domain.model.MoneyboxData) null, false, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO>) this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsHubComponentRegistry$createGoalMoneyboxDTO$1(com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry savingsHubComponentRegistry, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$createGoalMoneyboxDTO$1> continuation) {
        super(continuation);
        this.isOutputSupportedFor = savingsHubComponentRegistry;
    }
}
