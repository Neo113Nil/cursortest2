package com.paypal.oslo.feature.xoom.ui.activitydetails;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel", f = "ActivityDetailsViewModel.kt", i = {0}, l = {92}, m = "createOnInitializedEvent", n = {"invoiceId"}, nl = {93}, s = {"L$0"}, v = 2)
/* loaded from: classes16.dex */
final class ActivityDetailsViewModel$createOnInitializedEvent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel.access$createOnInitializedEvent(this.Camera2StreamConfigurationMap, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityDetailsViewModel$createOnInitializedEvent$1(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel activityDetailsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel$createOnInitializedEvent$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = activityDetailsViewModel;
    }
}
