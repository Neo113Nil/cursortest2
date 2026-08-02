package com.paypal.oslo.feature.savings.domain.model.savingshub.registry;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry", f = "SavingsHubComponentRegistry.kt", i = {0, 0}, l = {398}, m = "formatCurrency", n = {"currencyCode", "amount"}, nl = {com.datadog.android.internal.network.HttpSpec.StatusCode.METHOD_NOT_ALLOWED}, s = {"L$0", "D$0"}, v = 2)
/* loaded from: classes14.dex */
final class SavingsHubComponentRegistry$formatCurrency$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    double Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(0.0d, (java.lang.String) null, (kotlin.coroutines.Continuation<? super java.lang.String>) this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsHubComponentRegistry$formatCurrency$1(com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry savingsHubComponentRegistry, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry$formatCurrency$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = savingsHubComponentRegistry;
    }
}
