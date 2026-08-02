package com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel$getPreferences$1", f = "PreferencesViewModel.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, nl = {47}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PreferencesViewModel$getPreferences$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.pushnotification.preferences.domain.usecase.GetPreferencesUseCase getPreferencesUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesUiState.Error error;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getPreferencesUseCase = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = 1;
            obj = getPreferencesUseCase.invoke(this);
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
        if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.pushnotification.preferences.domain.error.PreferencesError preferencesError = (com.paypal.oslo.feature.pushnotification.preferences.domain.error.PreferencesError) ((arrow.core.Either.Left) either).getValue();
            if (preferencesError instanceof com.paypal.oslo.feature.pushnotification.preferences.domain.error.PreferencesError.NetworkError) {
                error = new com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesUiState.Error("Network Error: Connection failed");
            } else {
                if (!(preferencesError instanceof com.paypal.oslo.feature.pushnotification.preferences.domain.error.PreferencesError.Business.SyncFailed) && !kotlin.jvm.internal.Intrinsics.areEqual(preferencesError, com.paypal.oslo.feature.pushnotification.preferences.domain.error.PreferencesError.Business.DeviceIdGenerationFailed.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                error = new com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesUiState.Error("Sync failed: Unable to load preferences.");
            }
            mutableStateFlow3 = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
            mutableStateFlow3.setValue(error);
        } else {
            if (!(either instanceof arrow.core.Either.Right)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.pushnotification.preferences.domain.model.PreferencesList preferencesList = (com.paypal.oslo.feature.pushnotification.preferences.domain.model.PreferencesList) ((arrow.core.Either.Right) either).getValue();
            if (preferencesList.getPreferences().isEmpty()) {
                mutableStateFlow2 = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
                mutableStateFlow2.setValue(com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesUiState.Empty.INSTANCE);
            } else {
                mutableStateFlow = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
                mutableStateFlow.setValue(new com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesUiState.Success(preferencesList));
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel$getPreferences$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel$getPreferences$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreferencesViewModel$getPreferences$1(com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel preferencesViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel$getPreferences$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = preferencesViewModel;
    }
}
