package com.paypal.oslo.feature.bnplacquisition.ui.address.add;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel", f = "AddressAddViewModel.kt", i = {0}, l = {120}, m = "validateWithAddressHandler", n = {"uiModel"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class AddressAddViewModel$validateWithAddressHandler$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel.access$validateWithAddressHandler(this.getHighResolutionOutputSizeshNQ4ISI, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressAddViewModel$validateWithAddressHandler$1(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel addressAddViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel$validateWithAddressHandler$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = addressAddViewModel;
    }
}
