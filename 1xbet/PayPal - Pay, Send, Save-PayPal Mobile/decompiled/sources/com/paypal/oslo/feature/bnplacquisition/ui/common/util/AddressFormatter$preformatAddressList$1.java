package com.paypal.oslo.feature.bnplacquisition.ui.common.util;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter", f = "AddressFormatter.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {84, 85}, m = "preformatAddressList", n = {"addresses", "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "address", "addressI18", "$i$f$map", "$i$f$mapTo", "$i$a$-map-AddressFormatter$preformatAddressList$2", "addresses", "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "address", "addressI18", "line1", "$i$f$map", "$i$f$mapTo", "$i$a$-map-AddressFormatter$preformatAddressList$2"}, nl = {85, 87}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "L$7", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "L$7", "L$8", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes11.dex */
final class AddressFormatter$preformatAddressList$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    /* synthetic */ java.lang.Object getOutputSizes;
    int getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter unwrapAs;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizes = obj;
        this.getOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.unwrapAs.preformatAddressList(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressFormatter$preformatAddressList$1(com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter addressFormatter, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter$preformatAddressList$1> continuation) {
        super(continuation);
        this.unwrapAs = addressFormatter;
    }
}
