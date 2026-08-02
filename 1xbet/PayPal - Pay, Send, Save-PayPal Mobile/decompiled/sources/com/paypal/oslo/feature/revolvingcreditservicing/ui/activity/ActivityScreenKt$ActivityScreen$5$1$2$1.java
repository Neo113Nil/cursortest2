package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class ActivityScreenKt$ActivityScreen$5$1$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent activityEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityEvent, "");
        ((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel) this.receiver).process(activityEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent activityEvent) {
        Camera2StreamConfigurationMap(activityEvent);
        return kotlin.Unit.INSTANCE;
    }

    ActivityScreenKt$ActivityScreen$5$1$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel.class, "process", "process(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityEvent;)V", 0);
    }
}
