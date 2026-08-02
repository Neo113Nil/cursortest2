package com.paypal.oslo.feature.wallet.banks.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.data.repository.BankAccountDetailsRepositoryImpl", f = "BankAccountDetailsRepositoryImpl.kt", i = {0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m = "updateBankAccountNickname", n = {"id", "nickname", "mutation"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes15.dex */
final class BankAccountDetailsRepositoryImpl$updateBankAccountNickname$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.data.repository.BankAccountDetailsRepositoryImpl getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getOutputFormats.updateBankAccountNickname(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BankAccountDetailsRepositoryImpl$updateBankAccountNickname$1(com.paypal.oslo.feature.wallet.banks.data.repository.BankAccountDetailsRepositoryImpl bankAccountDetailsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.data.repository.BankAccountDetailsRepositoryImpl$updateBankAccountNickname$1> continuation) {
        super(continuation);
        this.getOutputFormats = bankAccountDetailsRepositoryImpl;
    }
}
