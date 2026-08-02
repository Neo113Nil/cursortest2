package com.paypal.oslo.feature.bnplacquisition.ui.common.util;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter", f = "AddressFormatter.kt", i = {0, 0, 0}, l = {65}, m = "formatMultiline", n = {"address", "it", "$i$a$-let-AddressFormatter$formatMultiline$2"}, nl = {64}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class AddressFormatter$formatMultiline$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getOutputFormats.formatMultiline(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressFormatter$formatMultiline$1(com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter addressFormatter, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter$formatMultiline$1> continuation) {
        super(continuation);
        this.getOutputFormats = addressFormatter;
    }
}
