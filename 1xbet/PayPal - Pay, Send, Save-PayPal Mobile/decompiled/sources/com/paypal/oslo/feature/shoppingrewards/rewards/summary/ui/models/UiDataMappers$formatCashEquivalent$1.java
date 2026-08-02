package com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.UiDataMappers", f = "UiDataMappers.kt", i = {0, 0, 0, 0}, l = {115}, m = "formatCashEquivalent$shopping_rewards_prodRelease", n = {"currencyCode", "cashValue", "amount", "config"}, nl = {316}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes15.dex */
final class UiDataMappers$formatCashEquivalent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.UiDataMappers getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.formatCashEquivalent$shopping_rewards_prodRelease(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UiDataMappers$formatCashEquivalent$1(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.UiDataMappers uiDataMappers, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.UiDataMappers$formatCashEquivalent$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = uiDataMappers;
    }
}
