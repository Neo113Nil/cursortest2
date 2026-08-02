package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailSideEffectMiddleware", f = "ActivityDetailSideEffectMiddleware.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {59, 62}, m = "cancelPayment", n = {"eventDispatcher", "paymentId", "creditAccountId", "creditProductIdentifier", "request", "eventDispatcher", "paymentId", "creditAccountId", "creditProductIdentifier", "request", "this_$iv", "it", "$i$f$fold", "$i$a$-fold-ActivityDetailSideEffectMiddleware$cancelPayment$3"}, nl = {69, 63}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1"}, v = 2)
/* loaded from: classes14.dex */
final class ActivityDetailSideEffectMiddleware$cancelPayment$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailSideEffectMiddleware getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getOutputSizeshNQ4ISI = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getOutputStallDurationlomOqCM.getHighSpeedVideoFpsRangesFor(null, null, null, null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityDetailSideEffectMiddleware$cancelPayment$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailSideEffectMiddleware activityDetailSideEffectMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailSideEffectMiddleware$cancelPayment$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = activityDetailSideEffectMiddleware;
    }
}
