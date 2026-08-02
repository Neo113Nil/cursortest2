package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel", f = "AddressCollectionViewModel.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE}, m = "formatAddressWithoutCountry", n = {"address", "config"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes13.dex */
final class AddressCollectionViewModel$formatAddressWithoutCountry$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel.access$formatAddressWithoutCountry(this.getHighSpeedVideoSizes, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressCollectionViewModel$formatAddressWithoutCountry$1(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel addressCollectionViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionViewModel$formatAddressWithoutCountry$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = addressCollectionViewModel;
    }
}
