package com.paypal.oslo.feature.bnplacquisition.ui.address.add;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class AddressAddScreenKt$AddressAddScreen$5$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent addressAddEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressAddEvent, "");
        ((com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel) this.receiver).processEvent(addressAddEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent addressAddEvent) {
        getHighResolutionOutputSizeshNQ4ISI(addressAddEvent);
        return kotlin.Unit.INSTANCE;
    }

    AddressAddScreenKt$AddressAddScreen$5$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/bnplacquisition/ui/address/add/AddressAddEvent;)V", 0);
    }
}
