package com.paypal.oslo.feature.bnplservicing.common.utils;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter", f = "BnplServFormatter.kt", i = {0}, l = {258}, m = "formatExpirationDuration", n = {"isoDuration"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class BnplServFormatter$formatExpirationDuration$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.formatExpirationDuration(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BnplServFormatter$formatExpirationDuration$1(com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter$formatExpirationDuration$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = bnplServFormatter;
    }
}
