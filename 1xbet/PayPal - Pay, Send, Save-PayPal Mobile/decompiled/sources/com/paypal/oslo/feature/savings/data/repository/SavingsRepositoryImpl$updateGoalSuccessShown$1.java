package com.paypal.oslo.feature.savings.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl", f = "SavingsRepositoryImpl.kt", i = {0}, l = {321}, m = "updateGoalSuccessShown", n = {"moneyboxId"}, nl = {322}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class SavingsRepositoryImpl$updateGoalSuccessShown$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.updateGoalSuccessShown(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsRepositoryImpl$updateGoalSuccessShown$1(com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl savingsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$updateGoalSuccessShown$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = savingsRepositoryImpl;
    }
}
