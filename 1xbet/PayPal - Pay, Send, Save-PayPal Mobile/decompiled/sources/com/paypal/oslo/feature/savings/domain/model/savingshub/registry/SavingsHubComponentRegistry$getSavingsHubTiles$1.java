package com.paypal.oslo.feature.savings.domain.model.savingshub.registry;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry", f = "SavingsHubComponentRegistry.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {79, 91, 95}, m = "getSavingsHubTiles", n = {"savingsHubData", "account", "tiles", "savingsHubData", "account", "tiles", "smartRouteEnabled", "savingsHubData", "account", "tiles", "smartRouteEnabled"}, nl = {428, 428, 428}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "Z$0"}, v = 2)
/* loaded from: classes14.dex */
final class SavingsHubComponentRegistry$getSavingsHubTiles$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.getSavingsHubTiles(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsHubComponentRegistry$getSavingsHubTiles$1(com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry savingsHubComponentRegistry, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$getSavingsHubTiles$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = savingsHubComponentRegistry;
    }
}
