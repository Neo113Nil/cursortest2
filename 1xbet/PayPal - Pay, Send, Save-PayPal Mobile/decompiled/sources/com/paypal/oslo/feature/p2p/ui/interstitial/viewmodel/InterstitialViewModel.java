package com.paypal.oslo.feature.p2p.ui.interstitial.viewmodel;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR&\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00178\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/interstitial/viewmodel/InterstitialViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialScreenModel;", "screenModel", "", "initialize", "(Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialScreenModel;)V", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/events/InterstitialEvent;", "event", "processEvent", "(Lcom/paypal/oslo/feature/p2p/ui/interstitial/events/InterstitialEvent;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/state/InterstitialUiState;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/effects/InterstitialEffect;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getHighSpeedVideoFpsRanges", "", "Camera2StreamConfigurationMap", "Z", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InterstitialViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.p2p.ui.interstitial.state.InterstitialUiState, com.paypal.oslo.feature.p2p.ui.interstitial.events.InterstitialEvent, com.paypal.oslo.feature.p2p.ui.interstitial.effects.InterstitialEffect> getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.p2p.ui.interstitial.effects.InterstitialEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.ui.interstitial.state.InterstitialUiState> uiState;

    @javax.inject.Inject
    public InterstitialViewModel() {
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.p2p.ui.interstitial.state.InterstitialUiState, com.paypal.oslo.feature.p2p.ui.interstitial.events.InterstitialEvent, com.paypal.oslo.feature.p2p.ui.interstitial.effects.InterstitialEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("InterstitialViewModel.store", com.paypal.oslo.feature.p2p.ui.interstitial.state.InterstitialUiState.Initial.INSTANCE, com.paypal.oslo.feature.p2p.ui.interstitial.reducers.InterstitialReducer.INSTANCE, kotlin.collections.CollectionsKt.emptyList(), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoFpsRanges = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.p2p.ui.interstitial.state.InterstitialUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.p2p.ui.interstitial.effects.InterstitialEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void initialize(com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialScreenModel screenModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenModel, "");
        if (this.getHighSpeedVideoSizes) {
            return;
        }
        this.getHighSpeedVideoSizes = true;
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
        kotlin.Pair[] pairArr = new kotlin.Pair[6];
        pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.HAS_TITLE_UI, java.lang.Boolean.valueOf(screenModel.getTitle().length() > 0));
        pairArr[1] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.HAS_BODY_UI, java.lang.Boolean.valueOf(screenModel.getBody() != null));
        pairArr[2] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.BULLET_COUNT_UI, java.lang.Integer.valueOf(screenModel.getBulletPoints().size()));
        pairArr[3] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.HAS_PRIMARY_BUTTON_UI, java.lang.Boolean.valueOf(screenModel.getPrimaryButton() != null));
        pairArr[4] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.HAS_SECONDARY_BUTTON_UI, java.lang.Boolean.valueOf(screenModel.getSecondaryButton() != null));
        pairArr[5] = kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.HAS_IMAGE_UI, java.lang.Boolean.valueOf(screenModel.getImage() != null));
        com.paypal.android.logger.Logger.i$default(logger, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.INTERSTITIAL_SCREEN_APPEARED, kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
        this.getHighSpeedVideoFpsRanges.onEvent(new com.paypal.oslo.feature.p2p.ui.interstitial.events.InterstitialEvent.Initialize(screenModel.getTitle(), screenModel.getBody(), screenModel.getBulletPoints(), screenModel.getPrimaryButton(), screenModel.getSecondaryButton(), screenModel.getImage()));
    }

    public final void processEvent(com.paypal.oslo.feature.p2p.ui.interstitial.events.InterstitialEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.p2p.ui.interstitial.events.InterstitialEvent.PrimaryButtonClicked) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.USER_TAPPED_INTERSTITIAL_PRIMARY_BUTTON, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, ((com.paypal.oslo.feature.p2p.ui.interstitial.events.InterstitialEvent.PrimaryButtonClicked) event).getAction().getActionId())), null, 4, null);
        } else if (event instanceof com.paypal.oslo.feature.p2p.ui.interstitial.events.InterstitialEvent.SecondaryButtonClicked) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.USER_TAPPED_INTERSTITIAL_SECONDARY_BUTTON, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, ((com.paypal.oslo.feature.p2p.ui.interstitial.events.InterstitialEvent.SecondaryButtonClicked) event).getAction().getActionId())), null, 4, null);
        }
        this.getHighSpeedVideoFpsRanges.onEvent(event);
    }
}
