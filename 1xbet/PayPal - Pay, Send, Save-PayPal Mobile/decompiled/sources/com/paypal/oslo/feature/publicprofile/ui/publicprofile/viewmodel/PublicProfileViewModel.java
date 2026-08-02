package com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel;

@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 C2\u00020\u0001:\u0001CBI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010(R\u0014\u0010,\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010#\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010/R\u0014\u0010*\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00101R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00103R&\u0010-\u001a\u0014\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u000207058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00108R\u001d\u0010:\u001a\b\u0012\u0004\u0012\u000206098\u0007¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R \u0010?\u001a\b\u0012\u0004\u0012\u0002070>8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/viewmodel/PublicProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/publicprofile/domain/usecase/GetPublicProfileUseCase;", "getPublicProfileUseCase", "Lcom/paypal/oslo/feature/publicprofile/domain/usecase/ToggleFavoriteContactUseCase;", "toggleFavoriteContactUseCase", "Lcom/paypal/oslo/feature/publicprofile/domain/usecase/DeleteContactUseCase;", "deleteContactUseCase", "Lcom/paypal/oslo/feature/publicprofile/domain/usecase/BlockContactUseCase;", "blockContactUseCase", "Lcom/paypal/oslo/feature/publicprofile/domain/usecase/UnblockContactUseCase;", "unblockContactUseCase", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/reducer/PublicProfileReducer;", "reducer", "Lcom/paypal/oslo/feature/activity/api/provider/IActivityWidgetProvider;", "activityWidgetProvider", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "localeInformation", "<init>", "(Lcom/paypal/oslo/feature/publicprofile/domain/usecase/GetPublicProfileUseCase;Lcom/paypal/oslo/feature/publicprofile/domain/usecase/ToggleFavoriteContactUseCase;Lcom/paypal/oslo/feature/publicprofile/domain/usecase/DeleteContactUseCase;Lcom/paypal/oslo/feature/publicprofile/domain/usecase/BlockContactUseCase;Lcom/paypal/oslo/feature/publicprofile/domain/usecase/UnblockContactUseCase;Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/reducer/PublicProfileReducer;Lcom/paypal/oslo/feature/activity/api/provider/IActivityWidgetProvider;Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;)V", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/event/PublicProfileEvent;)V", "", "accountId", "emptyText", "Lcom/paypal/oslo/feature/activity/api/widget/IActivityWidget;", "createActivityWidget$public_profile_prodRelease", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/api/widget/IActivityWidget;", "buildReportUrl$public_profile_prodRelease", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/publicprofile/domain/usecase/GetPublicProfileUseCase;", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/publicprofile/domain/usecase/ToggleFavoriteContactUseCase;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/publicprofile/domain/usecase/DeleteContactUseCase;", "Lcom/paypal/oslo/feature/publicprofile/domain/usecase/BlockContactUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/publicprofile/domain/usecase/UnblockContactUseCase;", "getHighSpeedVideoSizes", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/reducer/PublicProfileReducer;", "Lcom/paypal/oslo/feature/activity/api/provider/IActivityWidgetProvider;", "getOutputFormats", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/viewmodel/PublicProfileViewModel$middleware$1;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/viewmodel/PublicProfileViewModel$middleware$1;", "getInputFormats", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/state/PublicProfileUiState;", "Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/effect/PublicProfileUiEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PublicProfileViewModel extends androidx.view.ViewModel {

    @java.lang.Deprecated
    public static final int ACTIVITY_WIDGET_TRANSACTION_COUNT = 6;

    @java.lang.Deprecated
    public static final java.lang.String DEFAULT_COUNTRY_CODE = "us";

    @java.lang.Deprecated
    public static final java.lang.String REPORT_URL_TEMPLATE = "https://www.paypal.com/%s/cshelp/contact-us";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.publicprofile.domain.usecase.BlockContactUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.LocaleInformation getHighSpeedVideoSizesFor;
    private final com.paypal.oslo.feature.publicprofile.domain.usecase.DeleteContactUseCase getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.publicprofile.domain.usecase.GetPublicProfileUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider getOutputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.publicprofile.domain.usecase.UnblockContactUseCase getHighSpeedVideoSizes;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState, com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent, com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect> getInputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.publicprofile.ui.publicprofile.reducer.PublicProfileReducer getOutputMinFrameDuration;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel.PublicProfileViewModel$middleware$1 getInputFormats;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.publicprofile.domain.usecase.ToggleFavoriteContactUseCase Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState> uiState;
    private static final com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel.PublicProfileViewModel.Companion Companion = new com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel.PublicProfileViewModel.Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Type inference failed for: r2v1, types: [com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel.PublicProfileViewModel$middleware$1, java.lang.Object] */
    @javax.inject.Inject
    public PublicProfileViewModel(com.paypal.oslo.feature.publicprofile.domain.usecase.GetPublicProfileUseCase getPublicProfileUseCase, com.paypal.oslo.feature.publicprofile.domain.usecase.ToggleFavoriteContactUseCase toggleFavoriteContactUseCase, com.paypal.oslo.feature.publicprofile.domain.usecase.DeleteContactUseCase deleteContactUseCase, com.paypal.oslo.feature.publicprofile.domain.usecase.BlockContactUseCase blockContactUseCase, com.paypal.oslo.feature.publicprofile.domain.usecase.UnblockContactUseCase unblockContactUseCase, com.paypal.oslo.feature.publicprofile.ui.publicprofile.reducer.PublicProfileReducer publicProfileReducer, com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider iActivityWidgetProvider, com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPublicProfileUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toggleFavoriteContactUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteContactUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockContactUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unblockContactUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicProfileReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iActivityWidgetProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeInformation, "");
        this.getHighSpeedVideoFpsRangesFor = getPublicProfileUseCase;
        this.Camera2StreamConfigurationMap = toggleFavoriteContactUseCase;
        this.getHighSpeedVideoFpsRanges = deleteContactUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = blockContactUseCase;
        this.getHighSpeedVideoSizes = unblockContactUseCase;
        this.getOutputMinFrameDuration = publicProfileReducer;
        this.getOutputFormats = iActivityWidgetProvider;
        this.getHighSpeedVideoSizesFor = localeInformation;
        ?? r2 = new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState, com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent>() { // from class: com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel.PublicProfileViewModel$middleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState, com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent> input) {
                com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Success success;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnLoad) {
                    com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnLoad onLoad = (com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnLoad) event;
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r1), null, null, new com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel.PublicProfileViewModel$loadProfile$1(com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel.PublicProfileViewModel.this, onLoad.getAccountId(), onLoad.getContactId(), input.getEventDispatcher(), null), 3, null);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnFavoriteClicked) {
                    com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState component1 = input.getStates().component1();
                    success = component1 instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Success ? (com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Success) component1 : null;
                    if (success == null || success.isTogglingFavorite()) {
                        return;
                    }
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r1), null, null, new com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel.PublicProfileViewModel$toggleFavorite$1(com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel.PublicProfileViewModel.this, ((com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnFavoriteClicked) event).getContactId(), success.getProfile().isFavorite(), input.getEventDispatcher(), null), 3, null);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnRemoveConfirmed) {
                    com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState component12 = input.getStates().component1();
                    success = component12 instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Success ? (com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Success) component12 : null;
                    if (success == null || success.isProcessing()) {
                        return;
                    }
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r1), null, null, new com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel.PublicProfileViewModel$deleteContact$1(com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel.PublicProfileViewModel.this, ((com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnRemoveConfirmed) event).getContactId(), input.getEventDispatcher(), null), 3, null);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnBlockConfirmed) {
                    com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState component13 = input.getStates().component1();
                    success = component13 instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Success ? (com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Success) component13 : null;
                    if (success == null || success.isProcessing()) {
                        return;
                    }
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r1), null, null, new com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel.PublicProfileViewModel$blockContact$1(com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel.PublicProfileViewModel.this, ((com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnBlockConfirmed) event).getContactId(), input.getEventDispatcher(), null), 3, null);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnUnblockConfirmed) {
                    com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState component14 = input.getStates().component1();
                    success = component14 instanceof com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Success ? (com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Success) component14 : null;
                    if (success == null || success.isProcessing()) {
                        return;
                    }
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r1), null, null, new com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel.PublicProfileViewModel$unblockContact$1(com.paypal.oslo.feature.publicprofile.ui.publicprofile.viewmodel.PublicProfileViewModel.this, ((com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent.OnUnblockConfirmed) event).getContactId(), input.getEventDispatcher(), null), 3, null);
                }
            }
        };
        this.getInputFormats = r2;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState, com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent, com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("PublicProfileViewModel.store", com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState.Loading.INSTANCE, publicProfileReducer, kotlin.collections.CollectionsKt.listOf(r2), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getInputSizeshNQ4ISI = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.publicprofile.ui.publicprofile.state.PublicProfileUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.publicprofile.ui.publicprofile.effect.PublicProfileUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.publicprofile.ui.publicprofile.event.PublicProfileEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getInputSizeshNQ4ISI.onEvent(event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.paypal.oslo.feature.activity.api.widget.IActivityWidget createActivityWidget$public_profile_prodRelease(java.lang.String accountId, java.lang.String emptyText) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emptyText, "");
        java.lang.Object[] objArr = 0 == true ? 1 : 0;
        java.lang.Object[] objArr2 = 0 == true ? 1 : 0;
        com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration.Builder filtersConfig = com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetConfiguration.INSTANCE.builder("public_profile_screen").setWidgetTxnFetchCount(6).setUiConfig(new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetUIConfig(false, null, true, com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetViewType.WIDGET_WITH_MULTIPLE_COUNTER_PARTY, false, 18, null)).setFiltersConfig(new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetFiltersConfig((java.util.Date) null, (java.util.Date) objArr, (java.lang.String) null, (java.lang.Boolean) null, (java.util.List) null, (java.util.List) null, (java.util.List) objArr2, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, kotlin.collections.CollectionsKt.listOf(accountId), (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, 16646143, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        java.lang.Object[] objArr3 = 0 == true ? 1 : 0;
        return this.getOutputFormats.createWidget(filtersConfig.setContentConfig(new com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetContentConfig((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, emptyText, (java.lang.String) null, (java.lang.String) (0 == true ? 1 : 0), (java.lang.String) objArr3, 119, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0))).build());
    }

    public final java.lang.String buildReportUrl$public_profile_prodRelease() {
        java.lang.String country = this.getHighSpeedVideoSizesFor.getUserLocale().getCountry();
        if (kotlin.text.StringsKt.isBlank(country)) {
            country = "us";
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(country, "");
        java.util.Locale locale = java.util.Locale.ROOT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = country.toLowerCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format(REPORT_URL_TEMPLATE, java.util.Arrays.copyOf(new java.lang.Object[]{lowerCase}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/ui/publicprofile/viewmodel/PublicProfileViewModel$Companion;", "", "<init>", "()V", "", "ACTIVITY_WIDGET_TRANSACTION_COUNT", com.visa.cbp.getEncExpo.warmup, "", "DEFAULT_COUNTRY_CODE", "Ljava/lang/String;", "REPORT_URL_TEMPLATE"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
