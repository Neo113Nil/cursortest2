package com.paypal.oslo.feature.bnplacquisition.ui.common.util;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter", f = "BnplAcquisitionFormatter.kt", i = {0, 0}, l = {358}, m = "getDialingCode", n = {"countryCode", "fallbackDialingCode"}, nl = {359}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes11.dex */
final class BnplAcquisitionFormatter$getDialingCode$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.getDialingCode(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BnplAcquisitionFormatter$getDialingCode$1(com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter bnplAcquisitionFormatter, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter$getDialingCode$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = bnplAcquisitionFormatter;
    }
}
