package com.paypal.oslo.feature.settings.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$initializeSettingsSections$1", f = "SettingsViewModel.kt", i = {}, l = {450}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SettingsViewModel$initializeSettingsSections$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.coroutines.flow.SharedFlow<arrow.core.Either<com.paypal.oslo.feature.settings.domain.error.SettingsError, com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData>> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.SharedFlow<arrow.core.Either<com.paypal.oslo.feature.settings.domain.error.SettingsError, com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData>> sharedFlow = this.getHighSpeedVideoFpsRangesFor;
            final com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel settingsViewModel = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizes = 1;
            if (sharedFlow.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$initializeSettingsSections$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    T t;
                    com.paypal.oslo.core.mvi.MviStateStore mviStateStore;
                    java.lang.String subtitle;
                    com.paypal.oslo.core.mvi.MviStateStore mviStateStore2;
                    com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider settingsStringsProvider;
                    arrow.core.Either either = (arrow.core.Either) obj2;
                    if (either != null) {
                        if (either.isLeft()) {
                            mviStateStore2 = com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel.this.getInputSizeshNQ4ISI;
                            settingsStringsProvider = com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel.this.getHighResolutionOutputSizeshNQ4ISI;
                            mviStateStore2.onEvent(new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.UserStoreError(settingsStringsProvider.getScreenStrings().getScreenError()));
                        } else {
                            com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData settingsSectionUiData = (com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData) either.getOrNull();
                            if (settingsSectionUiData != null) {
                                com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel settingsViewModel2 = com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel.this;
                                java.util.Iterator<T> it = settingsSectionUiData.getItems().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        t = (T) null;
                                        break;
                                    }
                                    t = it.next();
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData) t).getId(), com.paypal.oslo.feature.settings.domain.model.SettingsItemId.Account.NAME)) {
                                        break;
                                    }
                                }
                                com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData settingsItemUiData = t;
                                if (settingsItemUiData != null && !settingsItemUiData.isLoading() && ((subtitle = settingsItemUiData.getSubtitle()) == null || kotlin.text.StringsKt.isBlank(subtitle))) {
                                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.settings.LoggerKt.log;
                                    com.paypal.oslo.feature.controlcenter.api.observability.UserJourney profileLoading = com.paypal.oslo.feature.controlcenter.api.observability.SettingsUserJourneys.INSTANCE.getProfileLoading();
                                    kotlin.Pair[] pairArr = new kotlin.Pair[4];
                                    boolean z = false;
                                    pairArr[0] = kotlin.TuplesKt.to("subtitle_null", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(settingsItemUiData.getSubtitle() == null));
                                    java.lang.String subtitle2 = settingsItemUiData.getSubtitle();
                                    if (subtitle2 != null && subtitle2.length() == 0) {
                                        z = true;
                                    }
                                    pairArr[1] = kotlin.TuplesKt.to("subtitle_empty", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z));
                                    java.lang.String subtitle3 = settingsItemUiData.getSubtitle();
                                    pairArr[2] = kotlin.TuplesKt.to("subtitle_blank", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(subtitle3 != null ? kotlin.text.StringsKt.isBlank(subtitle3) : true));
                                    pairArr[3] = kotlin.TuplesKt.to("total_items", kotlin.coroutines.jvm.internal.Boxing.boxInt(settingsSectionUiData.getItems().size()));
                                    com.paypal.oslo.feature.controlcenter.api.observability.UserJourneyKt.e(logger, com.paypal.oslo.feature.controlcenter.api.observability.UserJourney.error$default(profileLoading, "User profile name is empty after formatting", "name_empty", kotlin.collections.MapsKt.mapOf(pairArr), null, 8, null));
                                }
                                mviStateStore = settingsViewModel2.getInputSizeshNQ4ISI;
                                mviStateStore.onEvent(new com.paypal.oslo.feature.settings.ui.mvi.SettingsEvent.DataEvent.SectionLoadedResult(com.paypal.oslo.feature.settings.domain.model.SettingSection.ACCOUNT, new com.paypal.oslo.feature.settings.ui.mvi.SettingsState.SectionState.Loaded(settingsSectionUiData)));
                            }
                        }
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
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$initializeSettingsSections$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$initializeSettingsSections$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SettingsViewModel$initializeSettingsSections$1(kotlinx.coroutines.flow.SharedFlow<? extends arrow.core.Either<? extends com.paypal.oslo.feature.settings.domain.error.SettingsError, com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData>> sharedFlow, com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel settingsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel$initializeSettingsSections$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = sharedFlow;
        this.getHighSpeedVideoFpsRanges = settingsViewModel;
    }
}
