package com.paypal.oslo.feature.settings.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$loadSection$1", f = "SettingsViewModel.kt", i = {}, l = {542}, m = "invokeSuspend", n = {}, nl = {577}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SettingsViewModel$loadSection$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.settings.domain.usecase.SectionUseCase getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.settings.domain.model.SettingSection getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.feature.settings.domain.error.SettingsError, com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData>> invoke = this.getHighSpeedVideoFpsRanges.invoke();
            final com.paypal.oslo.feature.settings.domain.model.SettingSection settingSection = this.getHighSpeedVideoSizes;
            final com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel settingsViewModel = this.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (invoke.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$loadSection$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.core.mvi.MviStateStore mviStateStore;
                    java.lang.String str;
                    com.paypal.oslo.core.mvi.MviStateStore mviStateStore2;
                    arrow.core.Ior ior = (arrow.core.Ior) obj2;
                    com.paypal.oslo.feature.settings.domain.model.SettingSection settingSection2 = com.paypal.oslo.feature.settings.domain.model.SettingSection.this;
                    com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel settingsViewModel2 = settingsViewModel;
                    if (ior instanceof arrow.core.Ior.Left) {
                        com.paypal.oslo.feature.settings.domain.error.SettingsError settingsError = (com.paypal.oslo.feature.settings.domain.error.SettingsError) ((arrow.core.Ior.Left) ior).getValue();
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.settings.LoggerKt.log;
                        com.paypal.oslo.feature.controlcenter.api.observability.UserJourney loading = com.paypal.oslo.feature.controlcenter.api.observability.SettingsUserJourneys.INSTANCE.getLoading();
                        if (settingSection2 == com.paypal.oslo.feature.settings.domain.model.SettingSection.PAYMENT_PREFERENCES) {
                            str = "high_latency_api_failed";
                        } else {
                            str = "low_latency_api_failed";
                        }
                        com.paypal.oslo.feature.controlcenter.api.observability.UserJourneyKt.e(logger, com.paypal.oslo.feature.controlcenter.api.observability.UserJourney.error$default(loading, "Section load failed", str, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("section", settingSection2.name()), kotlin.TuplesKt.to("error_message", settingsError.toString())), null, 8, null));
                        mviStateStore2 = settingsViewModel2.getInputSizeshNQ4ISI;
                        mviStateStore2.onEvent(new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.SectionLoadFailedResult(settingSection2, new com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Error("")));
                    } else if (ior instanceof arrow.core.Ior.Right) {
                        com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData settingsSectionUiData = (com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData) ((arrow.core.Ior.Right) ior).getValue();
                        mviStateStore = settingsViewModel2.getInputSizeshNQ4ISI;
                        mviStateStore.onEvent(new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.SectionLoadedResult(settingSection2, new com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded(settingsSectionUiData)));
                    } else {
                        if (!(ior instanceof arrow.core.Ior.Both)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                        java.lang.Object leftValue = both.getLeftValue();
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$loadSection$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$loadSection$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsViewModel$loadSection$1(com.paypal.oslo.feature.settings.domain.usecase.SectionUseCase sectionUseCase, com.paypal.oslo.feature.settings.domain.model.SettingSection settingSection, com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel settingsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$loadSection$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = sectionUseCase;
        this.getHighSpeedVideoSizes = settingSection;
        this.Camera2StreamConfigurationMap = settingsViewModel;
    }
}
