package com.paypal.oslo.feature.savings.domain.model.savingshub.registry;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry", f = "SavingsHubComponentRegistry.kt", i = {0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, m = "createGeneralSavingsGoal", n = {"box", "currentBalanceCurrency", "isSmartRouteEnabled", "currentBalanceAmount"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE}, s = {"L$0", "L$1", "Z$0", "D$0"}, v = 2)
/* loaded from: classes14.dex */
final class SavingsHubComponentRegistry$createGeneralSavingsGoal$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    double getHighSpeedVideoSizes;
    boolean getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getOutputFormats = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap(null, false, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsHubComponentRegistry$createGeneralSavingsGoal$1(com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry savingsHubComponentRegistry, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$createGeneralSavingsGoal$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = savingsHubComponentRegistry;
    }
}
