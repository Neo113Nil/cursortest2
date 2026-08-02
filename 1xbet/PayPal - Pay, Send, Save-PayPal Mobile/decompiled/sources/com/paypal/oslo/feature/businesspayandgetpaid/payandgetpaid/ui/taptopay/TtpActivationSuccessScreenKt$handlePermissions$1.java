package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpActivationSuccessScreenKt", f = "TtpActivationSuccessScreen.kt", i = {0, 0, 0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE}, m = "handlePermissions", n = {"context", "permissionController", "onNavigateToPermissionsRationaleScreen", "onTakeTestPayment", "isLocationEnabled", "isNfcEnabled"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1"}, v = 2)
/* loaded from: classes11.dex */
final class TtpActivationSuccessScreenKt$handlePermissions$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    boolean getHighSpeedVideoSizesFor;
    int getInputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpActivationSuccessScreenKt.handlePermissions(null, null, null, null, this);
    }

    TtpActivationSuccessScreenKt$handlePermissions$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpActivationSuccessScreenKt$handlePermissions$1> continuation) {
        super(continuation);
    }
}
