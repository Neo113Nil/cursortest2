package com.paypal.oslo.feature.identity.connect.partnerlinking.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel", f = "PartnerLinkingViewModel.kt", i = {0, 1, 1, 1, 1, 1}, l = {317, 346}, m = "validatePartner", n = {"event", "event", "this_$iv", "result", "$i$f$fold", "$i$a$-fold-PartnerLinkingViewModel$validatePartner$3"}, nl = {321, 347}, s = {"L$0", "L$0", "L$1", "L$2", "I$0", "I$1"}, v = 2)
/* loaded from: classes12.dex */
final class PartnerLinkingViewModel$validatePartner$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel getHighSpeedVideoSizesFor;
    int getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel.access$validatePartner(this.getHighSpeedVideoSizesFor, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PartnerLinkingViewModel$validatePartner$1(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel partnerLinkingViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel$validatePartner$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = partnerLinkingViewModel;
    }
}
