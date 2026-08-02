package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.ActivityDetailUiModelMapper", f = "ActivityDetailUiModelMapper.kt", i = {0, 0}, l = {45}, m = "mapToActivityDetailUiModel$revolvingcredit_servicing_prodRelease", n = {"args", "transaction"}, nl = {46}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
final class ActivityDetailUiModelMapper$mapToActivityDetailUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.ActivityDetailUiModelMapper getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.mapToActivityDetailUiModel$revolvingcredit_servicing_prodRelease(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityDetailUiModelMapper$mapToActivityDetailUiModel$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.ActivityDetailUiModelMapper activityDetailUiModelMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.mapper.ActivityDetailUiModelMapper$mapToActivityDetailUiModel$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = activityDetailUiModelMapper;
    }
}
