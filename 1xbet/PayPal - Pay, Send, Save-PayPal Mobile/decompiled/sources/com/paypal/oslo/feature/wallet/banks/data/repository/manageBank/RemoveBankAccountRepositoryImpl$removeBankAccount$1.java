package com.paypal.oslo.feature.wallet.banks.data.repository.manageBank;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.data.repository.manageBank.RemoveBankAccountRepositoryImpl", f = "RemoveBankAccountRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {56}, m = "removeBankAccount", n = {"params", "combineError$iv", "state$iv", "raise$iv$iv$iv", "$this$ior_u24lambda_u240$iv", "$this$removeBankAccount_u24lambda_u241", "input", "mutation", "$i$f$ior", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-_foldOrThrow-RaiseKt__BuildersKt$ior$1$iv", "$i$a$-ior-RemoveBankAccountRepositoryImpl$removeBankAccount$3"}, nl = {67}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "I$2", "I$3", "I$4"}, v = 2)
/* loaded from: classes15.dex */
final class RemoveBankAccountRepositoryImpl$removeBankAccount$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    int getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.data.repository.manageBank.RemoveBankAccountRepositoryImpl isOutputSupportedFor;
    /* synthetic */ java.lang.Object isOutputSupportedForhNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.isOutputSupportedForhNQ4ISI = obj;
        this.getOutputSizes |= Integer.MIN_VALUE;
        return this.isOutputSupportedFor.removeBankAccount(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoveBankAccountRepositoryImpl$removeBankAccount$1(com.paypal.oslo.feature.wallet.banks.data.repository.manageBank.RemoveBankAccountRepositoryImpl removeBankAccountRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.data.repository.manageBank.RemoveBankAccountRepositoryImpl$removeBankAccount$1> continuation) {
        super(continuation);
        this.isOutputSupportedFor = removeBankAccountRepositoryImpl;
    }
}
