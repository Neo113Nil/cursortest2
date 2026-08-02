package com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class LinkAgreementsScreenKt$LinkAgreementsScreen$5$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent linkAgreementsUiEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkAgreementsUiEvent, "");
        ((com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel) this.receiver).onEvent(linkAgreementsUiEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsUiEvent linkAgreementsUiEvent) {
        getHighSpeedVideoSizes(linkAgreementsUiEvent);
        return kotlin.Unit.INSTANCE;
    }

    LinkAgreementsScreenKt$LinkAgreementsScreen$5$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel.class, "onEvent", "onEvent(Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/ui/LinkAgreementsUiEvent;)V", 0);
    }
}
