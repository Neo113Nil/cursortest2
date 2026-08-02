package com.paypal.oslo.feature.subscriptions.businesseshub.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class BusinessesHubScreenKt$BusinessesHubScreen$4$3$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEvent businessesHubUiEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessesHubUiEvent, "");
        ((com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel) this.receiver).onEvent(businessesHubUiEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEvent businessesHubUiEvent) {
        getHighSpeedVideoFpsRangesFor(businessesHubUiEvent);
        return kotlin.Unit.INSTANCE;
    }

    BusinessesHubScreenKt$BusinessesHubScreen$4$3$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel.class, "onEvent", "onEvent(Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/BusinessesHubUiEvent;)V", 0);
    }
}
