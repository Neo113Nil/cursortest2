package com.paypal.oslo.feature.bnplacquisition.ui.common.util;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter", f = "BnplAcquisitionFormatter.kt", i = {0, 0}, l = {175}, m = "getDateMaskForInput", n = {"defaultInputMask", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY}, nl = {176}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes11.dex */
final class BnplAcquisitionFormatter$getDateMaskForInput$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.getDateMaskForInput(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BnplAcquisitionFormatter$getDateMaskForInput$1(com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter bnplAcquisitionFormatter, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter$getDateMaskForInput$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = bnplAcquisitionFormatter;
    }
}
