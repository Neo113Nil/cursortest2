package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.ActivityDetailUiModelMapper", f = "ActivityDetailUiModelMapper.kt", i = {0, 0}, l = {66}, m = "buildSummarySection", n = {"$this$buildSummarySection", "locale"}, nl = {69}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
final class ActivityDetailUiModelMapper$buildSummarySection$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.ActivityDetailUiModelMapper getInputSizeshNQ4ISI;
    int getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizesFor = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap(null, null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityDetailUiModelMapper$buildSummarySection$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.ActivityDetailUiModelMapper activityDetailUiModelMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.ActivityDetailUiModelMapper$buildSummarySection$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = activityDetailUiModelMapper;
    }
}
