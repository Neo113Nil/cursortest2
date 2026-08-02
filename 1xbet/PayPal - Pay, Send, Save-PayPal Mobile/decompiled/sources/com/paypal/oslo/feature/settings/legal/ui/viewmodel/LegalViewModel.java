package com.paypal.oslo.feature.settings.legal.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 $2\u00020\u0001:\u0001$B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0014\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001aR&\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001d0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u001f8\u0007¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/settings/legal/ui/viewmodel/LegalViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/settings/legal/domain/usecase/GetLegalScreenItemsUseCase;", "getLegalScreenItemsUseCase", "Lcom/paypal/oslo/feature/settings/domain/util/SettingsStringsProvider;", "stringsProvider", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "appNavigator", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/reducer/LegalReducer;", "legalReducer", "<init>", "(Lcom/paypal/oslo/feature/settings/legal/domain/usecase/GetLegalScreenItemsUseCase;Lcom/paypal/oslo/feature/settings/domain/util/SettingsStringsProvider;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/settings/legal/ui/mvi/reducer/LegalReducer;)V", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent;", "event", "", "onIntent", "(Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/settings/legal/domain/usecase/GetLegalScreenItemsUseCase;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/settings/domain/util/SettingsStringsProvider;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "Lcom/paypal/oslo/feature/settings/legal/ui/viewmodel/LegalViewModel$sideEffectsMiddleware$1;", "Lcom/paypal/oslo/feature/settings/legal/ui/viewmodel/LegalViewModel$sideEffectsMiddleware$1;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalState;", "Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LegalViewModel extends androidx.view.ViewModel {
    public static final java.lang.String LEGAL_EFFECT = "LegalEffect";
    public static final java.lang.String LEGAL_EVENT = "LegalEvent";
    public static final java.lang.String LEGAL_HUB_LINK = "https://www.paypal.com/us/legalhub/home?country.x=US&locale.x=en_US";
    public static final java.lang.String LEGAL_REDUCER = "LegalReducer";
    public static final java.lang.String LEGAL_STATE = "LegalState";
    public static final java.lang.String LEGAL_VIEWMODEL_STORE_NAME = "LegalViewModel.store";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel$sideEffectsMiddleware$1 getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.legal.domain.usecase.GetLegalScreenItemsUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState, com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent, com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEffect> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState> state;
    public static final int $stable = 8;

    @javax.inject.Inject
    public LegalViewModel(com.paypal.oslo.feature.settings.legal.domain.usecase.GetLegalScreenItemsUseCase getLegalScreenItemsUseCase, com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider settingsStringsProvider, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.settings.legal.ui.mvi.reducer.LegalReducer legalReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getLegalScreenItemsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsStringsProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legalReducer, "");
        this.getHighSpeedVideoFpsRanges = getLegalScreenItemsUseCase;
        this.Camera2StreamConfigurationMap = settingsStringsProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel$sideEffectsMiddleware$1 legalViewModel$sideEffectsMiddleware$1 = new com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel$sideEffectsMiddleware$1(this);
        this.getHighSpeedVideoSizes = legalViewModel$sideEffectsMiddleware$1;
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf(legalViewModel$sideEffectsMiddleware$1);
        com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel legalViewModel = this;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState, com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent, com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>(LEGAL_VIEWMODEL_STORE_NAME, new com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState(null, null, false, 7, null), legalReducer, listOf, androidx.view.ViewModelKt.getViewModelScope(legalViewModel));
        this.getHighSpeedVideoFpsRangesFor = mviStateStore;
        this.state = mviStateStore.getUiState();
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(legalViewModel), null, null, new com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel$loadLegalItems$1(this, null), 3, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.settings.legal.ui.mvi.LegalState> getState() {
        return this.state;
    }

    public final void onIntent(com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoFpsRangesFor.onEvent(event);
    }
}
