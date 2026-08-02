package com.paypal.oslo.feature.cryptocurrency.ui.settings;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsViewModel$loadSettings$1", f = "CryptoSettingsViewModel.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, nl = {67}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class CryptoSettingsViewModel$loadSettings$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsViewModel getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings.GetCryptoSettingsUseCase getCryptoSettingsUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
            mutableStateFlow.setValue(com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsUiState.Loading.INSTANCE);
            getCryptoSettingsUseCase = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = getCryptoSettingsUseCase.invoke(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsViewModel cryptoSettingsViewModel = this.getHighSpeedVideoFpsRangesFor;
        if (either instanceof arrow.core.Either.Right) {
            java.util.List access$buildSettingsItems = com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsViewModel.access$buildSettingsItems(cryptoSettingsViewModel, (com.paypal.oslo.feature.cryptocurrency.domain.model.settings.CryptoSettingsData) ((arrow.core.Either.Right) either).getValue());
            mutableStateFlow3 = cryptoSettingsViewModel.Camera2StreamConfigurationMap;
            mutableStateFlow3.setValue(new com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsUiState.Success(access$buildSettingsItems));
        } else if (either instanceof arrow.core.Either.Left) {
            mutableStateFlow2 = cryptoSettingsViewModel.Camera2StreamConfigurationMap;
            mutableStateFlow2.setValue(new com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsUiState.Error(null));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsViewModel$loadSettings$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsViewModel$loadSettings$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoSettingsViewModel$loadSettings$1(com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsViewModel cryptoSettingsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsViewModel$loadSettings$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = cryptoSettingsViewModel;
    }
}
