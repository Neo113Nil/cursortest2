package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder", f = "ManageCardActionItemsBuilder.kt", i = {0, 0}, l = {247}, m = "getAutopaySubtitleRepaymentOption$revolvingcredit_servicing_prodRelease", n = {"currencyFormatterFacade", "autopayOverview"}, nl = {247}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
final class ManageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.getAutopaySubtitleRepaymentOption$revolvingcredit_servicing_prodRelease(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder manageCardActionItemsBuilder, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$getAutopaySubtitleRepaymentOption$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = manageCardActionItemsBuilder;
    }
}
