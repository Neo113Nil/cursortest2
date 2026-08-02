package com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class LinkAgreementsSearchScreenKt$LinkAgreementsSearchScreen$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchEvent, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchEvent linkAgreementsSearchEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkAgreementsSearchEvent, "");
        ((com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel) this.receiver).onEvent(linkAgreementsSearchEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchEvent linkAgreementsSearchEvent) {
        getHighSpeedVideoSizes(linkAgreementsSearchEvent);
        return kotlin.Unit.INSTANCE;
    }

    LinkAgreementsSearchScreenKt$LinkAgreementsSearchScreen$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel.class, "onEvent", "onEvent(Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/search/ui/LinkAgreementsSearchEvent;)V", 0);
    }
}
