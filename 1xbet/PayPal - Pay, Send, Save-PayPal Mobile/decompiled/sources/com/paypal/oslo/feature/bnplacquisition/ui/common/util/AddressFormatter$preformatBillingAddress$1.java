package com.paypal.oslo.feature.bnplacquisition.ui.common.util;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter", f = "AddressFormatter.kt", i = {0}, l = {42}, m = "preformatBillingAddress", n = {"address"}, nl = {47}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class AddressFormatter$preformatBillingAddress$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.preformatBillingAddress(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressFormatter$preformatBillingAddress$1(com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter addressFormatter, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter$preformatBillingAddress$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = addressFormatter;
    }
}
