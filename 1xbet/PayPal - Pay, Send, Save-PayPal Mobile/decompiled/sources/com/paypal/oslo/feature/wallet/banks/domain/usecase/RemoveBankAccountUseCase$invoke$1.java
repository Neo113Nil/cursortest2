package com.paypal.oslo.feature.wallet.banks.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.domain.usecase.RemoveBankAccountUseCase", f = "RemoveBankAccountUseCase.kt", i = {0, 0, 0}, l = {51}, m = "invoke", n = {"bankAccountId", "params", "success"}, nl = {52}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes15.dex */
final class RemoveBankAccountUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.usecase.RemoveBankAccountUseCase getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getInputFormats.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoveBankAccountUseCase$invoke$1(com.paypal.oslo.feature.wallet.banks.domain.usecase.RemoveBankAccountUseCase removeBankAccountUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.domain.usecase.RemoveBankAccountUseCase$invoke$1> continuation) {
        super(continuation);
        this.getInputFormats = removeBankAccountUseCase;
    }
}
