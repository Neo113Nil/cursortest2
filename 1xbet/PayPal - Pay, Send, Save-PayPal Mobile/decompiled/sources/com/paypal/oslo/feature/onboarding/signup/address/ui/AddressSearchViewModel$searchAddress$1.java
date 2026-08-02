package com.paypal.oslo.feature.onboarding.signup.address.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel", f = "AddressSearchViewModel.kt", i = {0}, l = {128}, m = "searchAddress", n = {"query"}, nl = {152}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class AddressSearchViewModel$searchAddress$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel.access$searchAddress(this.getHighSpeedVideoFpsRangesFor, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressSearchViewModel$searchAddress$1(com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel addressSearchViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.signup.address.ui.AddressSearchViewModel$searchAddress$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = addressSearchViewModel;
    }
}
