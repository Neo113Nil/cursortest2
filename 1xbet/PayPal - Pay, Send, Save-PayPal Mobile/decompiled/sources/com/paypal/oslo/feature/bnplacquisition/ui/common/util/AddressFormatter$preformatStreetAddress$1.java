package com.paypal.oslo.feature.bnplacquisition.ui.common.util;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter", f = "AddressFormatter.kt", i = {0}, l = {99}, m = "preformatStreetAddress", n = {"address"}, nl = {107}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class AddressFormatter$preformatStreetAddress$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressFormatter$preformatStreetAddress$1(com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter addressFormatter, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter$preformatStreetAddress$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = addressFormatter;
    }
}
