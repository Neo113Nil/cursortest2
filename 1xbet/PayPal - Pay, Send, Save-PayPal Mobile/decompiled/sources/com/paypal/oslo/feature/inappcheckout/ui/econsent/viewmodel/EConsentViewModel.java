package com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010!R\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020 0#8\u0007¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010*R \u0010,\u001a\b\u0012\u0004\u0012\u00020)0+8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/viewmodel/EConsentViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/reducer/EConsentReducer;", "reducer", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "session", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/EConsentUseCase;", "eConsentUseCase", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/HandleInAppLinkUseCase;", "handleInAppLinkUseCase", "Lcom/paypal/oslo/feature/inappcheckout/analytics/econsent/EConsentAnalyticsTracker;", "eConsentAnalyticsTracker", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/reducer/EConsentReducer;Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/EConsentUseCase;Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/HandleInAppLinkUseCase;Lcom/paypal/oslo/feature/inappcheckout/analytics/econsent/EConsentAnalyticsTracker;)V", "Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Event;", "event", "", "onEvent", "(Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Event;)V", "getOutputFormats", "Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/reducer/EConsentReducer;", "getHighSpeedVideoFpsRanges", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/EConsentUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/HandleInAppLinkUseCase;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/inappcheckout/analytics/econsent/EConsentAnalyticsTracker;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$State;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getInputFormats", "Lkotlinx/coroutines/flow/StateFlow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Effect;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EConsentViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect> getInputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect> effect;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.State> getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.EConsentUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsTracker getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.HandleInAppLinkUseCase Camera2StreamConfigurationMap;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession getHighSpeedVideoSizes;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.ui.econsent.reducer.EConsentReducer getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.State> state;

    /* JADX WARN: Multi-variable type inference failed */
    @javax.inject.Inject
    public EConsentViewModel(com.paypal.oslo.feature.inappcheckout.ui.econsent.reducer.EConsentReducer eConsentReducer, com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.domain.usecase.EConsentUseCase eConsentUseCase, com.paypal.oslo.feature.inappcheckout.domain.usecase.HandleInAppLinkUseCase handleInAppLinkUseCase, com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsTracker eConsentAnalyticsTracker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eConsentReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchSession, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eConsentUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handleInAppLinkUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eConsentAnalyticsTracker, "");
        this.getHighSpeedVideoFpsRanges = eConsentReducer;
        this.getHighSpeedVideoSizes = appSwitchSession;
        this.getHighResolutionOutputSizeshNQ4ISI = eConsentUseCase;
        this.Camera2StreamConfigurationMap = handleInAppLinkUseCase;
        this.getHighSpeedVideoFpsRangesFor = eConsentAnalyticsTracker;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.State> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.State(null, false, 3, 0 == true ? 1 : 0));
        this.getInputFormats = MutableStateFlow;
        this.state = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.getInputSizeshNQ4ISI = MutableSharedFlow$default;
        this.effect = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.State> getState() {
        return this.state;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect> getEffect() {
        return this.effect;
    }

    public final void onEvent(com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.State> mutableStateFlow = this.getInputFormats;
        mutableStateFlow.setValue(this.getHighSpeedVideoFpsRanges.reduce(mutableStateFlow.getValue(), event));
        if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.TrackAnalyticsEvent) {
            this.getHighSpeedVideoFpsRangesFor.trackEvent(((com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.TrackAnalyticsEvent) event).getEvent());
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            return;
        }
        if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.OnAgreeAndContinue) {
            this.getHighSpeedVideoFpsRangesFor.trackEvent(new com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ComponentClicked("agree_and_continue_button", null, 2, null));
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel$onEvent$1(this, null), 3, null);
        } else if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.OnProfileClick) {
            this.getHighSpeedVideoFpsRangesFor.trackEvent(new com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ComponentClicked("profile", null, 2, null));
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel$onEvent$2(this, null), 3, null);
        } else if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.OnLinkClick)) {
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        } else {
            this.getHighSpeedVideoFpsRangesFor.trackEvent(new com.paypal.oslo.feature.inappcheckout.analytics.econsent.EConsentAnalyticsEvent.ComponentClicked(com.paypal.oslo.feature.inappcheckout.analytics.InAppCheckoutAnalyticsConstants.EConsent.Components.ESIGN_CONSENT_LINK, null, 2, null));
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel$onEvent$3(this, event, null), 3, null);
        }
    }

    public static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect access$nextDestinationAfterSuccess(com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel eConsentViewModel) {
        com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData data = eConsentViewModel.getInputFormats.getValue().getData();
        if (data instanceof com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData.ReturnWithResult) {
            return com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateBackWithResult.INSTANCE;
        }
        if (data instanceof com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData.ContinueToRyp) {
            com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData data2 = eConsentViewModel.getInputFormats.getValue().getData();
            kotlin.jvm.internal.Intrinsics.checkNotNull(data2, "");
            com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse response = ((com.paypal.oslo.feature.inappcheckout.domain.model.EConsentData.ContinueToRyp) data2).getResponse();
            com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity = response.getBuyerInfoEntity();
            return new com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateToRyp(com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse.copy$default(response, null, null, buyerInfoEntity != null ? com.paypal.oslo.feature.inappcheckout.extensions.EntityExtensionsKt.withoutEConsentContingency(buyerInfoEntity) : null, 3, null));
        }
        return com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateToError.INSTANCE;
    }
}
