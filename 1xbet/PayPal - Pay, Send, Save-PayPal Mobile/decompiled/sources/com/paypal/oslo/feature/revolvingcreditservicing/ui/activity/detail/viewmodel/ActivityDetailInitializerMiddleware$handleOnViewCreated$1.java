package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailInitializerMiddleware", f = "ActivityDetailInitializerMiddleware.kt", i = {0, 0}, l = {42}, m = "handleOnViewCreated", n = {"args", "eventDispatcher"}, nl = {40}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
final class ActivityDetailInitializerMiddleware$handleOnViewCreated$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailInitializerMiddleware getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailInitializerMiddleware.access$handleOnViewCreated(this.getOutputFormats, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityDetailInitializerMiddleware$handleOnViewCreated$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailInitializerMiddleware activityDetailInitializerMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailInitializerMiddleware$handleOnViewCreated$1> continuation) {
        super(continuation);
        this.getOutputFormats = activityDetailInitializerMiddleware;
    }
}
