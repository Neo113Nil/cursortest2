package com.paypal.oslo.feature.wallet.banks.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.data.repository.BankAccountDetailsRepositoryImpl", f = "BankAccountDetailsRepositoryImpl.kt", i = {0}, l = {60}, m = "getBankAccountDetails", n = {"id"}, nl = {65}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class BankAccountDetailsRepositoryImpl$getBankAccountDetails$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.data.repository.BankAccountDetailsRepositoryImpl getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.getBankAccountDetails(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BankAccountDetailsRepositoryImpl$getBankAccountDetails$1(com.paypal.oslo.feature.wallet.banks.data.repository.BankAccountDetailsRepositoryImpl bankAccountDetailsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.data.repository.BankAccountDetailsRepositoryImpl$getBankAccountDetails$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = bankAccountDetailsRepositoryImpl;
    }
}
