package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.InitializeActivityHubMiddleware", f = "InitializeActivityHubMiddleware.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3}, l = {53, 60, 61, 62}, m = "handleLoading", n = {"args", "eventDispatcher", "needsToFetchData", "args", "eventDispatcher", "splitActivities", "needsToFetchData", "args", "eventDispatcher", "splitActivities", "needsToFetchData", "args", "eventDispatcher", "splitActivities", "needsToFetchData"}, nl = {54, 61, 62, 63}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0"}, v = 2)
/* loaded from: classes14.dex */
final class InitializeActivityHubMiddleware$handleLoading$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.InitializeActivityHubMiddleware getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizesFor = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getOutputFormats.Camera2StreamConfigurationMap(null, null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeActivityHubMiddleware$handleLoading$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.InitializeActivityHubMiddleware initializeActivityHubMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.InitializeActivityHubMiddleware$handleLoading$1> continuation) {
        super(continuation);
        this.getOutputFormats = initializeActivityHubMiddleware;
    }
}
