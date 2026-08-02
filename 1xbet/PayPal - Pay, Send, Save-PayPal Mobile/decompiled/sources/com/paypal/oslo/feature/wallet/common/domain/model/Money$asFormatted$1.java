package com.paypal.oslo.feature.wallet.common.domain.model;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.common.domain.model.Money", f = "Money.kt", i = {0, 0, 0}, l = {40}, m = "asFormatted", n = {"useCase", "$this$asFormatted_u24lambda_u240", "$i$a$-runCatching-Money$asFormatted$2"}, nl = {45}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes2.dex */
final class Money$asFormatted$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.wallet.common.domain.model.Money getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.asFormatted(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Money$asFormatted$1(com.paypal.oslo.feature.wallet.common.domain.model.Money money, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.common.domain.model.Money$asFormatted$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = money;
    }
}
