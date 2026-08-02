package com.paypal.oslo.feature.xoom.ui.activitydetails;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class ActivityDetailsScreenKt$ActivityDetailsScreen$1$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent activityDetailsEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailsEvent, "");
        ((com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel) this.receiver).processEvent(activityDetailsEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent activityDetailsEvent) {
        Camera2StreamConfigurationMap(activityDetailsEvent);
        return kotlin.Unit.INSTANCE;
    }

    ActivityDetailsScreenKt$ActivityDetailsScreen$1$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsEvent;)V", 0);
    }
}
