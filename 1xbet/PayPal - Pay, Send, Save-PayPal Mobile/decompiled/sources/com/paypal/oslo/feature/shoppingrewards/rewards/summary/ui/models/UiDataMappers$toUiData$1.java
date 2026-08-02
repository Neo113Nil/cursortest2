package com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.UiDataMappers", f = "UiDataMappers.kt", i = {0, 0}, l = {126}, m = "toUiData", n = {"$this$toUiData", "stringResourceProvider"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class UiDataMappers$toUiData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.UiDataMappers getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.toUiData(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UiDataMappers$toUiData$1(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.UiDataMappers uiDataMappers, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.UiDataMappers$toUiData$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = uiDataMappers;
    }
}
