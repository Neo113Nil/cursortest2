package com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.ScheduledPaymentInfoMapper", f = "ScheduledPaymentInfoMapper.kt", i = {0, 0, 0, 0, 0, 0}, l = {50}, m = "map", n = {"repayments", "creditProductIdentifier", "scheduledPayments", "it", "isToday", "$i$a$-let-ScheduledPaymentInfoMapper$map$2"}, nl = {50}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"}, v = 2)
/* loaded from: classes14.dex */
final class ScheduledPaymentInfoMapper$map$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.ScheduledPaymentInfoMapper getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.map(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScheduledPaymentInfoMapper$map$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.ScheduledPaymentInfoMapper scheduledPaymentInfoMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.ScheduledPaymentInfoMapper$map$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = scheduledPaymentInfoMapper;
    }
}
