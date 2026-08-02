package com.paypal.oslo.feature.balance.data.usecase.autoreload;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.data.usecase.autoreload.GetBalanceIdUseCaseImpl", f = "GetBalanceIdUseCaseImpl.kt", i = {0}, l = {28}, m = "invoke", n = {"currencyCode"}, nl = {36}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class GetBalanceIdUseCaseImpl$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.balance.data.usecase.autoreload.GetBalanceIdUseCaseImpl Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetBalanceIdUseCaseImpl$invoke$1(com.paypal.oslo.feature.balance.data.usecase.autoreload.GetBalanceIdUseCaseImpl getBalanceIdUseCaseImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.data.usecase.autoreload.GetBalanceIdUseCaseImpl$invoke$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = getBalanceIdUseCaseImpl;
    }
}
