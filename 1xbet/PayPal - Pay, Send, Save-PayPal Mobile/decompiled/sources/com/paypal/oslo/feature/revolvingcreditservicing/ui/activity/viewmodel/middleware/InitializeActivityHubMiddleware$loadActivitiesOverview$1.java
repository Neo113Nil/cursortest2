package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.InitializeActivityHubMiddleware", f = "InitializeActivityHubMiddleware.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3}, l = {87, 92, 93, 94}, m = "loadActivitiesOverview", n = {"args", "eventDispatcher", "requestParams", "args", "eventDispatcher", "requestParams", "this_$iv", "response", "splitActivities", "$i$f$fold", "$i$a$-fold-InitializeActivityHubMiddleware$loadActivitiesOverview$3", "args", "eventDispatcher", "requestParams", "this_$iv", "response", "splitActivities", "$i$f$fold", "$i$a$-fold-InitializeActivityHubMiddleware$loadActivitiesOverview$3", "args", "eventDispatcher", "requestParams", "this_$iv", "response", "splitActivities", "$i$f$fold", "$i$a$-fold-InitializeActivityHubMiddleware$loadActivitiesOverview$3"}, nl = {108, 93, 94, 95}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1"}, v = 2)
/* loaded from: classes14.dex */
final class InitializeActivityHubMiddleware$loadActivitiesOverview$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    int getOutputMinFrameDurationlomOqCM;
    /* synthetic */ java.lang.Object getOutputSizes;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.InitializeActivityHubMiddleware getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getOutputSizes = obj;
        this.getOutputMinFrameDurationlomOqCM |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getOutputStallDuration.getHighSpeedVideoSizes(null, null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeActivityHubMiddleware$loadActivitiesOverview$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.InitializeActivityHubMiddleware initializeActivityHubMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.InitializeActivityHubMiddleware$loadActivitiesOverview$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = initializeActivityHubMiddleware;
    }
}
