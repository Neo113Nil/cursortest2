package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel", f = "AddressSelectionViewModel.kt", i = {0, 0}, l = {75}, m = "formatSingleAddress", n = {"address", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE}, nl = {76}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes13.dex */
final class AddressSelectionViewModel$formatSingleAddress$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel.access$formatSingleAddress(this.getHighSpeedVideoFpsRangesFor, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressSelectionViewModel$formatSingleAddress$1(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel addressSelectionViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel$formatSingleAddress$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = addressSelectionViewModel;
    }
}
