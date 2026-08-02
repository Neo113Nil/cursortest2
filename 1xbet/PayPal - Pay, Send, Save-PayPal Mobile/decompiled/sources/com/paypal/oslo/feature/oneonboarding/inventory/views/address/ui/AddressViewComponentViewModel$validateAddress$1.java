package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel", f = "AddressViewComponentViewModel.kt", i = {0, 0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, m = "validateAddress", n = {"address", "countryCode", "messages", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes13.dex */
final class AddressViewComponentViewModel$validateAddress$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel getInputSizeshNQ4ISI;
    int getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel.access$validateAddress(this.getInputSizeshNQ4ISI, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressViewComponentViewModel$validateAddress$1(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel addressViewComponentViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel$validateAddress$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = addressViewComponentViewModel;
    }
}
