package com.paypal.oslo.feature.activity.ui.detail.view.compose;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class ActivityDetailHelpSectionComposableMapperKt$ActivityTransactionDetailHelpSectionContent$2$1$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent helpSectionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(helpSectionEvent, "");
        ((com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEventHandler) this.receiver).handle(helpSectionEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent helpSectionEvent) {
        Camera2StreamConfigurationMap(helpSectionEvent);
        return kotlin.Unit.INSTANCE;
    }

    ActivityDetailHelpSectionComposableMapperKt$ActivityTransactionDetailHelpSectionContent$2$1$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEventHandler.class, "handle", "handle(Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent;)V", 0);
    }
}
