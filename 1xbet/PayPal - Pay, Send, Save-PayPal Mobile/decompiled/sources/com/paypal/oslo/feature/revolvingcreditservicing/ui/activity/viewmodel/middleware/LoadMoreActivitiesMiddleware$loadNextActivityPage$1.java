package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.LoadMoreActivitiesMiddleware", f = "LoadMoreActivitiesMiddleware.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {74, 92, 97}, m = "loadNextActivityPage", n = {com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "creditAccountId", "eventDispatcher", "request", "nextOffset", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "creditAccountId", "eventDispatcher", "request", "this_$iv", "response", "splitActivities", "userLocale", "nextOffset", "$i$f$fold", "$i$a$-fold-LoadMoreActivitiesMiddleware$loadNextActivityPage$3", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "creditAccountId", "eventDispatcher", "request", "this_$iv", "response", "splitActivities", "userLocale", "nextOffset", "$i$f$fold", "$i$a$-fold-LoadMoreActivitiesMiddleware$loadNextActivityPage$3"}, nl = {111, 97, 102}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes14.dex */
final class LoadMoreActivitiesMiddleware$loadNextActivityPage$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    int getOutputStallDuration;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.LoadMoreActivitiesMiddleware isOutputSupportedFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getOutputStallDurationlomOqCM = obj;
        this.getOutputStallDuration |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.isOutputSupportedFor.getHighSpeedVideoSizes(null, null, 0, null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoadMoreActivitiesMiddleware$loadNextActivityPage$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.LoadMoreActivitiesMiddleware loadMoreActivitiesMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.LoadMoreActivitiesMiddleware$loadNextActivityPage$1> continuation) {
        super(continuation);
        this.isOutputSupportedFor = loadMoreActivitiesMiddleware;
    }
}
