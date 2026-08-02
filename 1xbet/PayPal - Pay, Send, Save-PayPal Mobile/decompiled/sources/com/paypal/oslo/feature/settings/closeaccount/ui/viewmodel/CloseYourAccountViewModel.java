package com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 02\u00020\u0001:\u00010B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010 R&\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020$0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010%R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020#0&8\u0007¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u0010,\u001a\b\u0012\u0004\u0012\u00020$0+8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/viewmodel/CloseYourAccountViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/usecase/CloseAccountUseCasesProvider;", "useCases", "Lcom/paypal/oslo/feature/settings/domain/util/SettingsStringsProvider;", "stringsProvider", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/feature/settings/closeaccount/domain/usecase/CloseAccountUseCasesProvider;Lcom/paypal/oslo/feature/settings/domain/util/SettingsStringsProvider;Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountReducer;)V", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent;", "event", "", "onIntent$settings_prodRelease", "(Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent;)V", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/usecase/CloseAccountUseCasesProvider;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/settings/domain/util/CloseAccountStrings;", "getInputFormats", "Lcom/paypal/oslo/feature/settings/domain/util/CloseAccountStrings;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/provider/CloseAccountErrorContentProvider;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/provider/CloseAccountErrorContentProvider;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/provider/CloseAccountBusinessUserContentProvider;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/provider/CloseAccountBusinessUserContentProvider;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/provider/CloseAccountPersonalUserContentProvider;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/provider/CloseAccountPersonalUserContentProvider;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/provider/CloseAccountIneligibleUserContentProvider;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/provider/CloseAccountIneligibleUserContentProvider;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountState;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "effects", "Lkotlinx/coroutines/flow/Flow;", "getEffects", "()Lkotlinx/coroutines/flow/Flow;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CloseYourAccountViewModel extends androidx.view.ViewModel {

    @java.lang.Deprecated
    public static final java.lang.String ACCOUNT_TYPE_BUSINESS = "BUSINESS";

    @java.lang.Deprecated
    public static final java.lang.String DECISION_ELIGIBLE = "ELIGIBLE";

    @java.lang.Deprecated
    public static final java.lang.String DECISION_INELIGIBLE = "INELIGIBLE";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider getHighSpeedVideoSizesFor;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect> effects;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState, com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent, com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect> getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountBusinessUserContentProvider getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountErrorContentProvider getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountPersonalUserContentProvider getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCasesProvider Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState> state;
    private static final com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.Companion Companion = new com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public CloseYourAccountViewModel(com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCasesProvider closeAccountUseCasesProvider, com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider settingsStringsProvider, com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountReducer closeAccountReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeAccountUseCasesProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsStringsProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeAccountReducer, "");
        this.Camera2StreamConfigurationMap = closeAccountUseCasesProvider;
        com.paypal.oslo.feature.settings.domain.util.CloseAccountStrings closeAccountStrings = settingsStringsProvider.getCloseAccountStrings();
        this.getHighSpeedVideoFpsRangesFor = closeAccountStrings;
        this.getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountErrorContentProvider(closeAccountStrings);
        this.getHighSpeedVideoSizes = new com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountBusinessUserContentProvider(closeAccountStrings);
        this.getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountPersonalUserContentProvider(closeAccountStrings);
        this.getHighSpeedVideoSizesFor = new com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountIneligibleUserContentProvider(closeAccountStrings);
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState, com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent, com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("CloseYourAccountViewModel.store", new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState(null, null, null, null, 0, false, null, 127, null), closeAccountReducer, null, androidx.view.ViewModelKt.getViewModelScope(this), 8, null);
        this.getInputFormats = mviStateStore;
        this.state = mviStateStore.getUiState();
        this.effects = mviStateStore.getUiEffect();
        onIntent$settings_prodRelease(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent.LoadCloseAccount.INSTANCE);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountState> getState() {
        return this.state;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEffect> getEffects() {
        return this.effects;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0152, code lost:
    
        r9.getInputFormats.onEvent(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0159, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onIntent$settings_prodRelease(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent event) {
        while (true) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
            if (!(event instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent)) {
                if (!(event instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent)) {
                    if (!(event instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    this.getInputFormats.onEvent((com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent) event);
                    return;
                }
                com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent systemEvent = (com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent) event;
                this.getInputFormats.onEvent(systemEvent);
                if (kotlin.jvm.internal.Intrinsics.areEqual(systemEvent, com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent.LoadCloseAccount.INSTANCE)) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel$loadCloseAccountEligibility$1(this, null), 3, null);
                    return;
                }
                if (!(systemEvent instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent.LoadBusinessStepContent)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(systemEvent, com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent.CloseAccount.INSTANCE)) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel$closeAccount$1(this, null), 3, null);
                        return;
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                int step = ((com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent.LoadBusinessStepContent) systemEvent).getStep();
                com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseYourAccountStepContent content = this.getHighSpeedVideoSizes.getContent(step);
                event = new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.DataEvent.StepContentReady(content.getItems(), content.getFooter(), step);
            } else {
                com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent userIntent = (com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent) event;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(userIntent, com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnBackPressed.INSTANCE)) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(userIntent, com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnContinuePressed.INSTANCE)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(userIntent, com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnCanceledPressed.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(userIntent, com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnClosePressed.INSTANCE)) {
                            break;
                        }
                        if (!(userIntent instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnLinkPressed)) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(userIntent, com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnCloseAccountClicked.INSTANCE)) {
                                event = com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent.CloseAccount.INSTANCE;
                            } else if (!(userIntent instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnFeedbackChanged) && !(userIntent instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnReasonToggled) && !(userIntent instanceof com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnReasonForClosingChanged)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                        } else {
                            com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnLinkPressed onLinkPressed = (com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnLinkPressed) userIntent;
                            com.paypal.oslo.feature.settings.closeaccount.ui.model.LinkDestination destination = onLinkPressed.getDestination();
                            if (destination.getNative() != null) {
                                com.paypal.oslo.feature.settings.LoggerKt.log.i("Navigating to native destination from OnLinkPressed event", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("linkText", destination.getText()), kotlin.TuplesKt.to("linkTag", destination.getTag()), kotlin.TuplesKt.to("destinationScreen", destination.getNative().toString())), kotlin.collections.MapsKt.emptyMap());
                                this.getInputFormats.onEvent(onLinkPressed);
                                return;
                            } else if (destination.getUrl() != null) {
                                com.paypal.oslo.feature.settings.LoggerKt.log.i("Navigating to webview URL from OnLinkPressed event", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("linkText", destination.getText()), kotlin.TuplesKt.to("linkTag", destination.getTag()), kotlin.TuplesKt.to("destinationUrl", destination.getUrl())), kotlin.collections.MapsKt.emptyMap());
                                this.getInputFormats.onEvent(onLinkPressed);
                                return;
                            } else {
                                com.paypal.oslo.feature.settings.LoggerKt.log.w("LinkDestination is null in OnLinkPressed event", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("linkText", destination.getText()), kotlin.TuplesKt.to("linkTag", destination.getTag())), kotlin.collections.MapsKt.emptyMap());
                                return;
                            }
                        }
                    } else {
                        int currentStep = this.getInputFormats.getUiState().getValue().getCurrentStep();
                        if (currentStep < 4) {
                            onIntent$settings_prodRelease(new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent.LoadBusinessStepContent(currentStep + 1));
                            return;
                        }
                        event = com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent.CloseAccount.INSTANCE;
                    }
                } else {
                    int currentStep2 = this.getInputFormats.getUiState().getValue().getCurrentStep();
                    if (currentStep2 > 0) {
                        onIntent$settings_prodRelease(new com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.SystemEvent.LoadBusinessStepContent(currentStep2 - 1));
                        return;
                    } else {
                        this.getInputFormats.onEvent(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent.UserIntent.OnBackPressed.INSTANCE);
                        return;
                    }
                }
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/viewmodel/CloseYourAccountViewModel$Companion;", "", "<init>", "()V", "", "DECISION_ELIGIBLE", "Ljava/lang/String;", "DECISION_INELIGIBLE", "ACCOUNT_TYPE_BUSINESS"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
