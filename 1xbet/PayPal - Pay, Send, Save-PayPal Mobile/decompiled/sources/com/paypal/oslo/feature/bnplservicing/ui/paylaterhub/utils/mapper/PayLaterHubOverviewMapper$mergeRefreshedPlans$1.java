package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PayLaterHubOverviewMapper", f = "PayLaterHubOverviewMapper.kt", i = {0, 0, 0, 0, 0, 0}, l = {239}, m = "mergeRefreshedPlans", n = {"existing", "plansOverview", "it", "planListLimit", "hasEverUsedBnpl", "$i$a$-let-PayLaterHubOverviewMapper$mergeRefreshedPlans$2"}, nl = {239}, s = {"L$0", "L$1", "L$2", "I$0", "Z$0", "I$1"}, v = 2)
/* loaded from: classes11.dex */
final class PayLaterHubOverviewMapper$mergeRefreshedPlans$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PayLaterHubOverviewMapper getInputSizeshNQ4ISI;
    int getOutputFormats;
    boolean getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.mergeRefreshedPlans(null, null, 0, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayLaterHubOverviewMapper$mergeRefreshedPlans$1(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PayLaterHubOverviewMapper payLaterHubOverviewMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PayLaterHubOverviewMapper$mergeRefreshedPlans$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = payLaterHubOverviewMapper;
    }
}
