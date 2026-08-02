package com.paypal.oslo.feature.savings.domain.model.savingshub.registry;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry", f = "SavingsHubComponentRegistry.kt", i = {0, 0, 0, 0, 0, 0}, l = {147}, m = "createBalanceTile", n = {"savingsHubData", "account", "totalBalance", "autoSaveConfigs", "smartRouteEnabled", "totalBalanceValue"}, nl = {154}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "D$0"}, v = 2)
/* loaded from: classes14.dex */
final class SavingsHubComponentRegistry$createBalanceTile$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    double Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    boolean getHighSpeedVideoSizesFor;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getOutputMinFrameDuration = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getInputSizeshNQ4ISI.getHighSpeedVideoSizes(null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsHubComponentRegistry$createBalanceTile$1(com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry savingsHubComponentRegistry, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$createBalanceTile$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = savingsHubComponentRegistry;
    }
}
