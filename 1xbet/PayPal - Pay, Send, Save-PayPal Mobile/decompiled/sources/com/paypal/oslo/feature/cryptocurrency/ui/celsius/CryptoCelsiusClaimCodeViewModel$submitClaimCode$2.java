package com.paypal.oslo.feature.cryptocurrency.ui.celsius;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel$submitClaimCode$2", f = "CryptoCelsiusClaimCodeViewModel.kt", i = {1, 1, 1, 1}, l = {111, 127}, m = "invokeSuspend", n = {"this_$iv", "it", "$i$f$fold", "$i$a$-fold-CryptoCelsiusClaimCodeViewModel$submitClaimCode$2$2"}, nl = {114, 128}, s = {"L$0", "L$1", "I$0", "I$1"}, v = 2)
/* loaded from: classes12.dex */
final class CryptoCelsiusClaimCodeViewModel$submitClaimCode$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel getInputSizeshNQ4ISI;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0087, code lost:
    
        if (r2 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0128, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x005d, code lost:
    
        if (r2 != r1) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.rollover.CreateCryptoRolloverUseCase createCryptoRolloverUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object invoke;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object value;
        com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState copy;
        kotlinx.coroutines.channels.Channel channel;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object value2;
        com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState copy2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        java.lang.Object value3;
        com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState copy3;
        java.lang.Object highSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            createCryptoRolloverUseCase = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            java.lang.String claimCode = ((com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState) mutableStateFlow.getValue()).getClaimCode();
            mutableStateFlow2 = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = 1;
            invoke = createCryptoRolloverUseCase.invoke(claimCode, ((com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState) mutableStateFlow2.getValue()).getDateOfBirth(), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        arrow.core.Either either = (arrow.core.Either) invoke;
        com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel cryptoCelsiusClaimCodeViewModel = this.getInputSizeshNQ4ISI;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.cryptocurrency.domain.model.rollover.ClaimRolloverResult claimRolloverResult = (com.paypal.oslo.feature.cryptocurrency.domain.model.rollover.ClaimRolloverResult) ((arrow.core.Either.Right) either).getValue();
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(claimRolloverResult);
            this.getHighSpeedVideoSizes = 0;
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getHighSpeedVideoFpsRanges = 2;
            highSpeedVideoFpsRanges = cryptoCelsiusClaimCodeViewModel.getHighSpeedVideoFpsRanges(this);
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError cryptocurrencyError = (com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError) ((arrow.core.Either.Left) either).getValue();
            mutableStateFlow3 = cryptoCelsiusClaimCodeViewModel.getHighSpeedVideoFpsRanges;
            do {
                value = mutableStateFlow3.getValue();
                copy = r5.copy((r26 & 1) != 0 ? r5.claimCode : null, (r26 & 2) != 0 ? r5.dateOfBirth : null, (r26 & 4) != 0 ? r5.showClaimCodeCoachTip : false, (r26 & 8) != 0 ? r5.showDateOfBirthCoachTip : false, (r26 & 16) != 0 ? r5.isProcessing : false, (r26 & 32) != 0 ? r5.showVerifyBuy : false, (r26 & 64) != 0 ? r5.showVerifySell : false, (r26 & 128) != 0 ? r5.showVerifyCryptoPro : false, (r26 & 256) != 0 ? r5.hasClaimCodeError : false, (r26 & 512) != 0 ? r5.hasDateOfBirthError : false, (r26 & 1024) != 0 ? r5.hasCodeInvalidatedError : false, (r26 & 2048) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState) value).hasInternalDeclineError : false);
            } while (!mutableStateFlow3.compareAndSet(value, copy));
            if (cryptocurrencyError instanceof com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.CodeInvalidated) {
                mutableStateFlow5 = cryptoCelsiusClaimCodeViewModel.getHighSpeedVideoFpsRanges;
                do {
                    value3 = mutableStateFlow5.getValue();
                    copy3 = r3.copy((r26 & 1) != 0 ? r3.claimCode : null, (r26 & 2) != 0 ? r3.dateOfBirth : null, (r26 & 4) != 0 ? r3.showClaimCodeCoachTip : false, (r26 & 8) != 0 ? r3.showDateOfBirthCoachTip : false, (r26 & 16) != 0 ? r3.isProcessing : false, (r26 & 32) != 0 ? r3.showVerifyBuy : false, (r26 & 64) != 0 ? r3.showVerifySell : false, (r26 & 128) != 0 ? r3.showVerifyCryptoPro : false, (r26 & 256) != 0 ? r3.hasClaimCodeError : false, (r26 & 512) != 0 ? r3.hasDateOfBirthError : false, (r26 & 1024) != 0 ? r3.hasCodeInvalidatedError : true, (r26 & 2048) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState) value3).hasInternalDeclineError : false);
                } while (!mutableStateFlow5.compareAndSet(value3, copy3));
            } else if (cryptocurrencyError instanceof com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.InternalDecline) {
                mutableStateFlow4 = cryptoCelsiusClaimCodeViewModel.getHighSpeedVideoFpsRanges;
                do {
                    value2 = mutableStateFlow4.getValue();
                    copy2 = r3.copy((r26 & 1) != 0 ? r3.claimCode : null, (r26 & 2) != 0 ? r3.dateOfBirth : null, (r26 & 4) != 0 ? r3.showClaimCodeCoachTip : false, (r26 & 8) != 0 ? r3.showDateOfBirthCoachTip : false, (r26 & 16) != 0 ? r3.isProcessing : false, (r26 & 32) != 0 ? r3.showVerifyBuy : false, (r26 & 64) != 0 ? r3.showVerifySell : false, (r26 & 128) != 0 ? r3.showVerifyCryptoPro : false, (r26 & 256) != 0 ? r3.hasClaimCodeError : false, (r26 & 512) != 0 ? r3.hasDateOfBirthError : false, (r26 & 1024) != 0 ? r3.hasCodeInvalidatedError : false, (r26 & 2048) != 0 ? ((com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeUiState) value2).hasInternalDeclineError : true);
                } while (!mutableStateFlow4.compareAndSet(value2, copy2));
            } else {
                channel = cryptoCelsiusClaimCodeViewModel.getInputFormats;
                kotlinx.coroutines.channels.ChannelResult.m24079boximpl(channel.mo9266trySendJP2dKIU(com.paypal.oslo.feature.cryptocurrency.ui.celsius.model.CryptoCelsiusClaimCodeEffect.NavigateToErrorScreen.INSTANCE));
            }
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel$submitClaimCode$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel$submitClaimCode$2(this.getInputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoCelsiusClaimCodeViewModel$submitClaimCode$2(com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel cryptoCelsiusClaimCodeViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel$submitClaimCode$2> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = cryptoCelsiusClaimCodeViewModel;
    }
}
