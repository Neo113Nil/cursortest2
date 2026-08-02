package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class ActivityDetailScreenKt$ActivityDetailStateContent$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent activityDetailEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailEvent, "");
        ((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailViewModel) this.receiver).process(activityDetailEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent activityDetailEvent) {
        getHighResolutionOutputSizeshNQ4ISI(activityDetailEvent);
        return kotlin.Unit.INSTANCE;
    }

    ActivityDetailScreenKt$ActivityDetailStateContent$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailViewModel.class, "process", "process(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailEvent;)V", 0);
    }
}
