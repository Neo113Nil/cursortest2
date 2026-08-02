package com.paypal.oslo.feature.controlcenter.ui.viewmodels;

@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 ;2\u00020\u0001:\u0001;B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010$\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010&R&\u0010,\u001a\u0014\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020)0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010*\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010.R\u0018\u0010\u001e\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00100R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020(018\u0007¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u00107\u001a\b\u0012\u0004\u0012\u00020)068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:"}, d2 = {"Lcom/paypal/oslo/feature/controlcenter/ui/viewmodels/ControlCenterViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/controlcenter/domain/usecase/GetUserProfileUseCase;", "getUserProfileUseCase", "Lcom/paypal/oslo/feature/controlcenter/domain/usecase/RefreshUserProfileUseCase;", "refreshUserProfileUseCase", "Lcom/paypal/oslo/feature/controlcenter/domain/usecase/GetTabContentUseCase;", "tabContentUseCase", "Lcom/paypal/oslo/feature/controlcenter/manager/ControlCenterFeatureManager;", "featureManager", "Lcom/paypal/oslo/feature/controlcenter/domain/usecase/FormatUserDisplayNameUseCase;", "formatUserDisplayNameUseCase", "<init>", "(Lcom/paypal/oslo/feature/controlcenter/domain/usecase/GetUserProfileUseCase;Lcom/paypal/oslo/feature/controlcenter/domain/usecase/RefreshUserProfileUseCase;Lcom/paypal/oslo/feature/controlcenter/domain/usecase/GetTabContentUseCase;Lcom/paypal/oslo/feature/controlcenter/manager/ControlCenterFeatureManager;Lcom/paypal/oslo/feature/controlcenter/domain/usecase/FormatUserDisplayNameUseCase;)V", "Lcom/paypal/oslo/feature/controlcenter/ui/events/ControlCenterEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/controlcenter/ui/events/ControlCenterEvent;)V", "Lcom/paypal/oslo/feature/controlcenter/domain/model/UserProfile;", "p0", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/controlcenter/domain/model/UserProfile;)V", "Landroidx/navigation3/runtime/NavKey;", "destination", "Lcom/paypal/oslo/feature/controlcenter/api/provider/TabContentProvider;", "getTabsForDestination", "(Landroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/feature/controlcenter/api/provider/TabContentProvider;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/controlcenter/domain/usecase/GetUserProfileUseCase;", "getOutputFormats", "Lcom/paypal/oslo/feature/controlcenter/domain/usecase/RefreshUserProfileUseCase;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/controlcenter/domain/usecase/GetTabContentUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/controlcenter/manager/ControlCenterFeatureManager;", "Lcom/paypal/oslo/feature/controlcenter/domain/usecase/FormatUserDisplayNameUseCase;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/controlcenter/ui/states/ControlCenterUiState;", "Lcom/paypal/oslo/feature/controlcenter/ui/effects/ControlCenterUiEffect;", "getInputFormats", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getOutputMinFrameDuration", "", "Z", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ControlCenterViewModel extends androidx.view.ViewModel {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getOutputFormats;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getInputFormats;
    private final com.paypal.oslo.feature.controlcenter.domain.usecase.GetUserProfileUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.controlcenter.domain.usecase.FormatUserDisplayNameUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.controlcenter.manager.ControlCenterFeatureManager getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.controlcenter.domain.usecase.GetTabContentUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState, com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent, com.paypal.oslo.feature.controlcenter.ui.effects.ControlCenterUiEffect> getOutputMinFrameDuration;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.controlcenter.domain.usecase.RefreshUserProfileUseCase Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.controlcenter.ui.effects.ControlCenterUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState> uiState;
    private static final com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel.Companion Companion = new com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public ControlCenterViewModel(com.paypal.oslo.feature.controlcenter.domain.usecase.GetUserProfileUseCase getUserProfileUseCase, com.paypal.oslo.feature.controlcenter.domain.usecase.RefreshUserProfileUseCase refreshUserProfileUseCase, com.paypal.oslo.feature.controlcenter.domain.usecase.GetTabContentUseCase getTabContentUseCase, com.paypal.oslo.feature.controlcenter.manager.ControlCenterFeatureManager controlCenterFeatureManager, com.paypal.oslo.feature.controlcenter.domain.usecase.FormatUserDisplayNameUseCase formatUserDisplayNameUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUserProfileUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refreshUserProfileUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getTabContentUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(controlCenterFeatureManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatUserDisplayNameUseCase, "");
        this.getHighSpeedVideoFpsRanges = getUserProfileUseCase;
        this.Camera2StreamConfigurationMap = refreshUserProfileUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = getTabContentUseCase;
        this.getHighSpeedVideoFpsRangesFor = controlCenterFeatureManager;
        this.getHighSpeedVideoSizes = formatUserDisplayNameUseCase;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState, com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent, com.paypal.oslo.feature.controlcenter.ui.effects.ControlCenterUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("ControlCenterViewModel.store", com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Initial.INSTANCE, com.paypal.oslo.feature.controlcenter.ui.reducers.ControlCenterReducer.INSTANCE, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.mvi.MviStateStore.Middleware[]{new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState, com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent>() { // from class: com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel$analyticsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState, com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent event = input.getEvent();
                if (!(event instanceof com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.LoadData) && !(event instanceof com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.RetryLoad) && !(event instanceof com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoaded) && !(event instanceof com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoadFailed) && !(event instanceof com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.DisplayNameFormatted)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
        }, new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState, com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent>() { // from class: com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel$observabilityMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState, com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                kotlin.Pair<com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState, com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState> states = input.getStates();
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.controlcenter.LoggerKt.log, "State transition", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.OLD_STATE_KEY, states.component1().getName()), kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_STATE_KEY, states.component2().getName()), kotlin.TuplesKt.to("event", input.getEvent().getName())), null, 4, null);
                com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoaded) {
                    com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent event2 = input.getEvent();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(event2, "");
                    com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoaded profileLoaded = (com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoaded) event2;
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.controlcenter.LoggerKt.log;
                    kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("tabCount", java.lang.Integer.valueOf(profileLoaded.getTabs().size())));
                    kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("fullName", profileLoaded.getUserProfile().getFullName()));
                    if (profileLoaded.getTabs().isEmpty()) {
                        com.paypal.oslo.feature.controlcenter.api.observability.UserJourneyKt.e(com.paypal.oslo.feature.controlcenter.LoggerKt.log, com.paypal.oslo.feature.controlcenter.api.observability.UserJourney.error$default(com.paypal.oslo.feature.controlcenter.api.observability.ControlCenterUserJourneys.INSTANCE.getInternalNavigation(), "Tab list is empty after profile load", "tab_index_out_of_bounds", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("tab_index", 0), kotlin.TuplesKt.to("tabs_count", 0)), null, 8, null));
                        return;
                    }
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoadFailed) {
                    com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent event3 = input.getEvent();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(event3, "");
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.controlcenter.LoggerKt.log, "Profile load failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorMessage", ((com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoadFailed) event3).getErrorMessage())), null, 4, null);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.DisplayNameFormatted) {
                    com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent event4 = input.getEvent();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(event4, "");
                    com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.DisplayNameFormatted displayNameFormatted = (com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.DisplayNameFormatted) event4;
                    com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState second = input.getStates().getSecond();
                    if (second instanceof com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Success) {
                        java.lang.String formattedName = displayNameFormatted.getFormattedName();
                        if (formattedName == null) {
                            formattedName = ((com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState.Success) second).getUserProfile().getFullName();
                        }
                        java.lang.String str = formattedName;
                        if (str == null || str.length() == 0) {
                            com.paypal.oslo.feature.controlcenter.api.observability.UserJourneyKt.e(com.paypal.oslo.feature.controlcenter.LoggerKt.log, com.paypal.oslo.feature.controlcenter.api.observability.UserJourney.error$default(com.paypal.oslo.feature.controlcenter.api.observability.ControlCenterUserJourneys.INSTANCE.getLoading(), "Display name is null or empty after profile load", "display_name_missing", null, null, 12, null));
                        }
                    }
                }
            }
        }, new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState, com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent>() { // from class: com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState, com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent event = input.getEvent();
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.LoadData.INSTANCE)) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r7), null, null, new com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel$loadUserProfile$1(com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel.this, null), 3, null);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.RetryLoad.INSTANCE)) {
                    com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel.this.getInputFormats = false;
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel.this), null, null, new com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel$sideEffectsMiddleware$1$invoke$1(com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel.this, null), 3, null);
                }
            }
        }}), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getOutputMinFrameDuration = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
        processEvent(com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.LoadData.INSTANCE);
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.controlcenter.LoggerKt.log, "ControlCenterViewModel initialized and data loading started", kotlin.collections.MapsKt.emptyMap(), null, 4, null);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/controlcenter/ui/viewmodels/ControlCenterViewModel$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.controlcenter.ui.states.ControlCenterUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.controlcenter.ui.effects.ControlCenterUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getOutputMinFrameDuration.onEvent(event);
    }

    private final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.controlcenter.domain.model.UserProfile p0) {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job job = this.getOutputFormats;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel$launchNameFormatting$1(this, p0, null), 3, null);
        this.getOutputFormats = launch$default;
    }

    public final com.paypal.oslo.feature.controlcenter.api.provider.TabContentProvider getTabsForDestination(androidx.navigation3.runtime.NavKey destination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke(destination);
    }

    public static final /* synthetic */ void access$handleProfileLoadError(com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel controlCenterViewModel, com.paypal.oslo.feature.controlcenter.domain.model.UserProfileError userProfileError) {
        if (!(userProfileError instanceof com.paypal.oslo.feature.controlcenter.domain.model.UserProfileError.NetworkFailure)) {
            if (!(userProfileError instanceof com.paypal.oslo.feature.controlcenter.domain.model.UserProfileError.DataNotFound)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.controlcenter.domain.model.UserProfileError.DataNotFound dataNotFound = (com.paypal.oslo.feature.controlcenter.domain.model.UserProfileError.DataNotFound) userProfileError;
            com.paypal.oslo.feature.controlcenter.api.observability.UserJourneyKt.e(com.paypal.oslo.feature.controlcenter.LoggerKt.log, com.paypal.oslo.feature.controlcenter.api.observability.UserJourney.error$default(com.paypal.oslo.feature.controlcenter.api.observability.ControlCenterUserJourneys.INSTANCE.getLoading(), "Profile data is null after load", "profile_data_nil", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, dataNotFound.toString()), kotlin.TuplesKt.to("reason", dataNotFound.getReason())), null, 8, null));
            controlCenterViewModel.processEvent(new com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoadFailed("Unable to load your profile. Please try again.", null));
            return;
        }
        com.paypal.oslo.feature.controlcenter.domain.model.UserProfileError.NetworkFailure networkFailure = (com.paypal.oslo.feature.controlcenter.domain.model.UserProfileError.NetworkFailure) userProfileError;
        if (!controlCenterViewModel.getInputFormats) {
            controlCenterViewModel.getInputFormats = true;
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.controlcenter.LoggerKt.log, "Network failure detected, attempting automatic refresh to trigger authentication if needed", null, null, 6, null);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(controlCenterViewModel), null, null, new com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel$handleNetworkFailure$1(controlCenterViewModel, networkFailure, null), 3, null);
        } else {
            com.paypal.oslo.feature.controlcenter.api.observability.UserJourneyKt.e(com.paypal.oslo.feature.controlcenter.LoggerKt.log, com.paypal.oslo.feature.controlcenter.api.observability.UserJourney.error$default(com.paypal.oslo.feature.controlcenter.api.observability.ControlCenterUserJourneys.INSTANCE.getLoading(), "Profile fetch failed after retry exhaustion", "profile_fetch_timeout", null, null, 12, null));
            controlCenterViewModel.processEvent(new com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoadFailed("Unable to load your profile. Please try again.", null));
        }
    }

    public static final /* synthetic */ void access$handleProfileLoadPartialSuccess(com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel controlCenterViewModel, com.paypal.oslo.feature.controlcenter.domain.model.UserProfileError userProfileError, com.paypal.oslo.feature.controlcenter.domain.model.UserProfile userProfile) {
        java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> tabsForAccountType = com.paypal.oslo.feature.controlcenter.ui.configs.ControlCenterTabConfiguration.INSTANCE.getTabsForAccountType(userProfile.getAccountType());
        boolean isAccountSwitchEnabled = controlCenterViewModel.getHighSpeedVideoFpsRangesFor.isAccountSwitchEnabled();
        boolean isUpdatePhotoEnabled = controlCenterViewModel.getHighSpeedVideoFpsRangesFor.isUpdatePhotoEnabled();
        com.paypal.oslo.feature.controlcenter.LoggerKt.log.w("Loaded user profile with warning", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("userId", userProfile.getId()), kotlin.TuplesKt.to("errorType", userProfileError.toString()), kotlin.TuplesKt.to("accountSwitchEnabled", java.lang.Boolean.valueOf(isAccountSwitchEnabled)), kotlin.TuplesKt.to("updatePhotoEnabled", java.lang.Boolean.valueOf(isUpdatePhotoEnabled))), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("fullName", userProfile.getFullName())));
        controlCenterViewModel.processEvent(new com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoaded(userProfile, tabsForAccountType, isAccountSwitchEnabled, isUpdatePhotoEnabled));
        controlCenterViewModel.getHighSpeedVideoFpsRangesFor(userProfile);
    }

    public static final /* synthetic */ void access$handleProfileLoadSuccess(com.paypal.oslo.feature.controlcenter.ui.viewmodels.ControlCenterViewModel controlCenterViewModel, com.paypal.oslo.feature.controlcenter.domain.model.UserProfile userProfile) {
        controlCenterViewModel.getInputFormats = false;
        java.util.List<com.paypal.oslo.core.navigation.ui.l1.TabDestination> tabsForAccountType = com.paypal.oslo.feature.controlcenter.ui.configs.ControlCenterTabConfiguration.INSTANCE.getTabsForAccountType(userProfile.getAccountType());
        boolean isAccountSwitchEnabled = controlCenterViewModel.getHighSpeedVideoFpsRangesFor.isAccountSwitchEnabled();
        boolean isUpdatePhotoEnabled = controlCenterViewModel.getHighSpeedVideoFpsRangesFor.isUpdatePhotoEnabled();
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.controlcenter.LoggerKt.log;
        kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("userId", userProfile.getId()), kotlin.TuplesKt.to("accountType", userProfile.getAccountType().toString()), kotlin.TuplesKt.to("tabCount", java.lang.Integer.valueOf(tabsForAccountType.size())), kotlin.TuplesKt.to("accountSwitchEnabled", java.lang.Boolean.valueOf(isAccountSwitchEnabled)), kotlin.TuplesKt.to("updatePhotoEnabled", java.lang.Boolean.valueOf(isUpdatePhotoEnabled)));
        kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("fullName", userProfile.getFullName()));
        controlCenterViewModel.processEvent(new com.paypal.oslo.feature.controlcenter.ui.events.ControlCenterEvent.ProfileLoaded(userProfile, tabsForAccountType, isAccountSwitchEnabled, isUpdatePhotoEnabled));
        controlCenterViewModel.getHighSpeedVideoFpsRangesFor(userProfile);
    }
}
