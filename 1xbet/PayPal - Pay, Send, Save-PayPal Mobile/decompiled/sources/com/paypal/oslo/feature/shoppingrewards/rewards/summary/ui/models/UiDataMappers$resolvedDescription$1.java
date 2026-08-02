package com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.UiDataMappers", f = "UiDataMappers.kt", i = {0, 0}, l = {94}, m = "resolvedDescription", n = {"$this$resolvedDescription", "stringResourceProvider"}, nl = {95}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class UiDataMappers$resolvedDescription$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.UiDataMappers Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.resolvedDescription(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UiDataMappers$resolvedDescription$1(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.UiDataMappers uiDataMappers, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.UiDataMappers$resolvedDescription$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = uiDataMappers;
    }
}
