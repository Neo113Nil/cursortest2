package com.paypal.oslo.feature.subscriptions.shared.domain;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper", f = "FormatHelper.kt", i = {0, 0, 0}, l = {50}, m = "formatBalance", n = {"balance", "bigDecimal", "currencyCode"}, nl = {55}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes15.dex */
final class FormatHelper$formatBalance$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getInputFormats.formatBalance(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FormatHelper$formatBalance$1(com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper formatHelper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.shared.domain.FormatHelper$formatBalance$1> continuation) {
        super(continuation);
        this.getInputFormats = formatHelper;
    }
}
