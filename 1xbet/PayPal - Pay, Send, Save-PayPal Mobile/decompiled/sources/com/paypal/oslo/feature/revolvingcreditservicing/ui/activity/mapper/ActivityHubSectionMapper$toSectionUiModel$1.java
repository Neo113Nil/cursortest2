package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubSectionMapper", f = "ActivityHubSectionMapper.kt", i = {0, 0, 0, 0}, l = {70}, m = "toSectionUiModel", n = {"transactions", "title", "creditProductIdentifier", "shouldHandleAmountColor"}, nl = {68}, s = {"L$0", "L$1", "L$2", "Z$0"}, v = 2)
/* loaded from: classes14.dex */
final class ActivityHubSectionMapper$toSectionUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    boolean Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubSectionMapper getInputSizeshNQ4ISI;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getInputFormats = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getInputSizeshNQ4ISI.getHighSpeedVideoSizes(null, null, null, false, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityHubSectionMapper$toSectionUiModel$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubSectionMapper activityHubSectionMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubSectionMapper$toSectionUiModel$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = activityHubSectionMapper;
    }
}
