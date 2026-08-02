package com.paypal.oslo.feature.bnplacquisition.ui.offers.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.offers.mapper.OffersUiMapper", f = "OffersUiMapper.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {199}, m = "toTimelineItems", n = {"$this$toTimelineItems", "currencyCode", "$this$mapIndexed$iv", "$this$mapIndexedTo$iv$iv", "destination$iv$iv", "item$iv$iv", "installment", "dateLabel", "$i$f$mapIndexed", "$i$f$mapIndexedTo", "index$iv$iv", "index", "$i$a$-mapIndexed-OffersUiMapper$toTimelineItems$2"}, nl = {203}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "L$8", "I$0", "I$1", "I$2", "I$3", "I$4"}, v = 2)
/* loaded from: classes11.dex */
final class OffersUiMapper$toTimelineItems$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    /* synthetic */ java.lang.Object isOutputSupportedFor;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.offers.mapper.OffersUiMapper isOutputSupportedForhNQ4ISI;
    int toString;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.isOutputSupportedFor = obj;
        this.toString |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.isOutputSupportedForhNQ4ISI.getHighSpeedVideoFpsRangesFor((java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.offers.EstimatedInstallment>) null, (java.lang.String) null, (kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.feature.bnplacquisition.ui.offers.PaymentTimelineItem>>) this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OffersUiMapper$toTimelineItems$1(com.paypal.oslo.feature.bnplacquisition.ui.offers.mapper.OffersUiMapper offersUiMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.offers.mapper.OffersUiMapper$toTimelineItems$1> continuation) {
        super(continuation);
        this.isOutputSupportedForhNQ4ISI = offersUiMapper;
    }
}
