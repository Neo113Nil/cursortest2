package com.paypal.oslo.feature.savings.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl", f = "SavingsRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE}, m = "updateMoneyboxTransferSchedule", n = {"moneyboxId", "scheduleId", "startDate", "frequency", "financialInstrumentId", "amount"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
/* loaded from: classes5.dex */
final class SavingsRepositoryImpl$updateMoneyboxTransferSchedule$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getInputFormats.updateMoneyboxTransferSchedule(null, null, null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsRepositoryImpl$updateMoneyboxTransferSchedule$1(com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl savingsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$updateMoneyboxTransferSchedule$1> continuation) {
        super(continuation);
        this.getInputFormats = savingsRepositoryImpl;
    }
}
