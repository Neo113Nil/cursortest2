package com.paypal.oslo.feature.savings.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.domain.usecase.GetDepositOptionsUseCase", f = "GetDepositOptionsUseCase.kt", i = {0}, l = {62}, m = "invoke", n = {"input"}, nl = {78}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class GetDepositOptionsUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.savings.domain.usecase.GetDepositOptionsUseCase Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetDepositOptionsUseCase$invoke$1(com.paypal.oslo.feature.savings.domain.usecase.GetDepositOptionsUseCase getDepositOptionsUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.domain.usecase.GetDepositOptionsUseCase$invoke$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = getDepositOptionsUseCase;
    }
}
