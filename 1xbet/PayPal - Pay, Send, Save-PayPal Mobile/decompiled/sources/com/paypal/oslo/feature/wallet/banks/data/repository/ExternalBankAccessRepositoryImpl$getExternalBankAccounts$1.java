package com.paypal.oslo.feature.wallet.banks.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.data.repository.ExternalBankAccessRepositoryImpl", f = "ExternalBankAccessRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {188}, m = "getExternalBankAccounts", n = {"params", "combineError$iv", "state$iv", "raise$iv$iv$iv", "$this$ior_u24lambda_u240$iv", "$this$getExternalBankAccounts_u24lambda_u241", "input", "query", "$i$f$ior", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-_foldOrThrow-RaiseKt__BuildersKt$ior$1$iv", "$i$a$-ior-ExternalBankAccessRepositoryImpl$getExternalBankAccounts$3"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "I$2", "I$3", "I$4"}, v = 2)
/* loaded from: classes15.dex */
final class ExternalBankAccessRepositoryImpl$getExternalBankAccounts$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
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
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    int getOutputStallDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.data.repository.ExternalBankAccessRepositoryImpl getValidOutputFormatsForInputhNQ4ISI;
    /* synthetic */ java.lang.Object isOutputSupportedFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.isOutputSupportedFor = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        return this.getValidOutputFormatsForInputhNQ4ISI.getExternalBankAccounts(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExternalBankAccessRepositoryImpl$getExternalBankAccounts$1(com.paypal.oslo.feature.wallet.banks.data.repository.ExternalBankAccessRepositoryImpl externalBankAccessRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.data.repository.ExternalBankAccessRepositoryImpl$getExternalBankAccounts$1> continuation) {
        super(continuation);
        this.getValidOutputFormatsForInputhNQ4ISI = externalBankAccessRepositoryImpl;
    }
}
