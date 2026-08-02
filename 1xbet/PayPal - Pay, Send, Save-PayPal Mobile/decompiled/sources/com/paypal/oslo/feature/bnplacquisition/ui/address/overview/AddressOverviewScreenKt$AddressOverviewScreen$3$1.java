package com.paypal.oslo.feature.bnplacquisition.ui.address.overview;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class AddressOverviewScreenKt$AddressOverviewScreen$3$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent addressOverviewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressOverviewEvent, "");
        ((com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewViewModel) this.receiver).processEvent(addressOverviewEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent addressOverviewEvent) {
        getHighResolutionOutputSizeshNQ4ISI(addressOverviewEvent);
        return kotlin.Unit.INSTANCE;
    }

    AddressOverviewScreenKt$AddressOverviewScreen$3$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressOverviewEvent;)V", 0);
    }
}
