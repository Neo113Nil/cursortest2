package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class AddressCollectionHalfSheetKt$AddressFlowRouter$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSuggestion, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSuggestion addressSuggestion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressSuggestion, "");
        ((com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel) this.receiver).onAddressSelected(addressSuggestion);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSuggestion addressSuggestion) {
        getHighSpeedVideoFpsRanges(addressSuggestion);
        return kotlin.Unit.INSTANCE;
    }

    AddressCollectionHalfSheetKt$AddressFlowRouter$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel.class, "onAddressSelected", "onAddressSelected(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressSuggestion;)V", 0);
    }
}
