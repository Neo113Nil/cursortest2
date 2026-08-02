package com.paypal.oslo.feature.userprofile.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.AddEditAddressViewModel", f = "AddEditAddressViewModel.kt", i = {0, 0}, l = {337}, m = "saveAddress", n = {"countryCode", "address"}, nl = {androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class AddEditAddressViewModel$saveAddress$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.AddEditAddressViewModel getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddEditAddressViewModel$saveAddress$2(com.paypal.oslo.feature.userprofile.ui.AddEditAddressViewModel addEditAddressViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.AddEditAddressViewModel$saveAddress$2> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = addEditAddressViewModel;
    }
}
