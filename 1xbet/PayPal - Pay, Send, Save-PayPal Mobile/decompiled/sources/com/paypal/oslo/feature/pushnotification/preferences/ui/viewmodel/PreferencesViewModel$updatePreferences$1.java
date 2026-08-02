package com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel$updatePreferences$1", f = "PreferencesViewModel.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, nl = {77}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PreferencesViewModel$updatePreferences$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.preferences.domain.model.PreferencesList getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.pushnotification.preferences.domain.usecase.UpdatePreferencesUseCase updatePreferencesUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
            mutableStateFlow.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
            updatePreferencesUseCase = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = updatePreferencesUseCase.invoke(this.getHighResolutionOutputSizeshNQ4ISI, this);
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
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Preferences update failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ERROR_CODE_NETWORK)), null, 4, null);
            } else {
                if (!(preferencesError instanceof com.paypal.oslo.feature.pushnotification.preferences.domain.error.PreferencesError.Business.SyncFailed) && !kotlin.jvm.internal.Intrinsics.areEqual(preferencesError, com.paypal.oslo.feature.pushnotification.preferences.domain.error.PreferencesError.Business.DeviceIdGenerationFailed.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.pushnotification.LoggerKt.log, "Preferences update failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", "sync_failed")), null, 4, null);
            }
        } else if (either instanceof arrow.core.Either.Right) {
            mutableStateFlow2 = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
            mutableStateFlow2.setValue(new com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesUiState.Success(this.getHighResolutionOutputSizeshNQ4ISI));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        mutableStateFlow3 = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
        mutableStateFlow3.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel$updatePreferences$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel$updatePreferences$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreferencesViewModel$updatePreferences$1(com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel preferencesViewModel, com.paypal.oslo.feature.pushnotification.preferences.domain.model.PreferencesList preferencesList, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.preferences.ui.viewmodel.PreferencesViewModel$updatePreferences$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = preferencesViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = preferencesList;
    }
}
