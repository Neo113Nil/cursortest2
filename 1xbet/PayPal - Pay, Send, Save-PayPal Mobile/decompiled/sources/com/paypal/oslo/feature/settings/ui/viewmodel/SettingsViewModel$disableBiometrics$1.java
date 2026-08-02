package com.paypal.oslo.feature.settings.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$disableBiometrics$1", f = "SettingsViewModel.kt", i = {0}, l = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VAS_NOT_FOUND}, m = "invokeSuspend", n = {"flowInfo"}, nl = {626}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class SettingsViewModel$disableBiometrics$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.api.IdentityManagement identityManagement;
        com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider settingsStringsProvider;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.settings.LoggerKt.log, "Attempting to disable biometric authentication", null, null, 6, null);
            com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo authenticationFlowInfo = new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("settings", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            identityManagement = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizesFor;
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authenticationFlowInfo);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = identityManagement.disable(com.paypal.oslo.feature.identity.api.AuthenticationMethod.BIOMETRIC, authenticationFlowInfo, this);
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
        com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel settingsViewModel = this.getHighSpeedVideoFpsRanges;
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRangesFor;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.settings.LoggerKt.log, "Biometric disable successful", null, null, 6, null);
            function1.invoke(new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.BiometricsToggleSuccess(false));
            com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel.access$loadSection(settingsViewModel, com.paypal.oslo.feature.settings.domain.model.SettingSection.DATA_PRIVACY);
        } else if (either instanceof arrow.core.Either.Left) {
            java.lang.Object obj2 = (com.paypal.oslo.feature.identity.api.model.IdentityManagementError) ((arrow.core.Either.Left) either).getValue();
            com.paypal.oslo.feature.controlcenter.api.observability.UserJourneyKt.e(com.paypal.oslo.feature.settings.LoggerKt.log, com.paypal.oslo.feature.controlcenter.api.observability.SettingsUserJourneys.INSTANCE.getBiometricsEnrollment().error("Biometric disable failed", "biometric_disable_failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error_message", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(obj2.getClass()).getSimpleName())), obj2 instanceof java.lang.Throwable ? (java.lang.Throwable) obj2 : null));
            settingsStringsProvider = settingsViewModel.getHighResolutionOutputSizeshNQ4ISI;
            function1.invoke(new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.BiometricsToggleFailed(true, settingsStringsProvider.getDataAndPrivacyStrings().getBiometricErrorMessage()));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$disableBiometrics$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$disableBiometrics$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SettingsViewModel$disableBiometrics$1(com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel settingsViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$disableBiometrics$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = settingsViewModel;
        this.getHighSpeedVideoFpsRangesFor = function1;
    }
}
