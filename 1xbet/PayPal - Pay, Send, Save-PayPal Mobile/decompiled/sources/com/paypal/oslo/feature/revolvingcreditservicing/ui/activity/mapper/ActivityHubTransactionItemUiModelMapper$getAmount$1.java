package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper", f = "ActivityHubTransactionItemUiModelMapper.kt", i = {0}, l = {68}, m = "getAmount", n = {"transaction"}, nl = {71}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class ActivityHubTransactionItemUiModelMapper$getAmount$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityHubTransactionItemUiModelMapper$getAmount$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper activityHubTransactionItemUiModelMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper$getAmount$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = activityHubTransactionItemUiModelMapper;
    }
}
