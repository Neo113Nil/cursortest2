package com.paypal.oslo.feature.cryptocurrency.ui.celsius;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/cryptocurrency/navigation/result/CryptoErrorNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeScreen$2$1", f = "CryptoCelsiusClaimCodeScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult cryptoErrorNavResult = (com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult) this.getHighSpeedVideoFpsRangesFor;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome outcome = cryptoErrorNavResult.getOutcome();
        if (!(outcome instanceof com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome.OkayClicked)) {
            if (!(outcome instanceof com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome.Closed)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeScreen$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeScreen$2$1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult cryptoErrorNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeScreen$2$1) create(cryptoErrorNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeScreen$2$1 cryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeScreen$2$1 = new com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeScreen$2$1(this.getHighSpeedVideoFpsRanges, continuation);
        cryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeScreen$2$1.getHighSpeedVideoFpsRangesFor = obj;
        return cryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeScreen$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeScreen$2$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeScreenKt$CryptoCelsiusClaimCodeScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = appNavigator;
    }
}
