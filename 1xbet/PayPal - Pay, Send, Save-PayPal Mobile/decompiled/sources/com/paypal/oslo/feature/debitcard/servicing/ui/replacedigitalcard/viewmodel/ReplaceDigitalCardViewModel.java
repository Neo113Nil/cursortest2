package com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001&B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00180\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/replacedigitalcard/viewmodel/ReplaceDigitalCardViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/replacedigitalcard/mvi/ReplaceDigitalCardReducer;", "reducer", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/ReplaceDigitalCardUseCase;", "replaceDigitalCardUseCase", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "replacementInfo", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/replacedigitalcard/mvi/ReplaceDigitalCardReducer;Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/ReplaceDigitalCardUseCase;Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;)V", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/replacedigitalcard/mvi/ReplaceDigitalCardEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/replacedigitalcard/mvi/ReplaceDigitalCardEvent;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/replacedigitalcard/mvi/ReplaceDigitalCardReducer;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/ReplaceDigitalCardUseCase;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "getReplacementInfo", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/replacedigitalcard/mvi/ReplaceDigitalCardState;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/replacedigitalcard/mvi/ReplaceDigitalCardEffect;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReplaceDigitalCardViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardReducer getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardState, com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEvent, com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEffect> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ReplaceDigitalCardUseCase Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo replacementInfo;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/replacedigitalcard/viewmodel/ReplaceDigitalCardViewModel$Factory;", "", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "replacementInfo", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/replacedigitalcard/viewmodel/ReplaceDigitalCardViewModel;", "create", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/replacedigitalcard/viewmodel/ReplaceDigitalCardViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.ReplaceDigitalCardViewModel create(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo replacementInfo);
    }

    @dagger.assisted.AssistedInject
    public ReplaceDigitalCardViewModel(com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardReducer replaceDigitalCardReducer, com.paypal.oslo.feature.debitcard.servicing.domain.usecase.ReplaceDigitalCardUseCase replaceDigitalCardUseCase, @dagger.assisted.Assisted com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replaceDigitalCardReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replaceDigitalCardUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardReplacementInfo, "");
        this.getHighSpeedVideoFpsRangesFor = replaceDigitalCardReducer;
        this.Camera2StreamConfigurationMap = replaceDigitalCardUseCase;
        this.replacementInfo = cardReplacementInfo;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardState, com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEvent, com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("ReplaceDigitalCardViewModel.store", new com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardState.Initial(cardReplacementInfo.getCardLastFourDigits(), cardReplacementInfo.getCardArtUrl()), replaceDigitalCardReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardState, com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEvent>() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.ReplaceDigitalCardViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardState, com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEvent event = input.getEvent();
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEvent.ConfirmReplacementClicked.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEvent.RetryButtonClicked.INSTANCE)) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r2), null, null, new com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.ReplaceDigitalCardViewModel$replaceCard$1(com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.viewmodel.ReplaceDigitalCardViewModel.this, null), 3, null);
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoSizes = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo getReplacementInfo() {
        return this.replacementInfo;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.debitcard.servicing.ui.replacedigitalcard.mvi.ReplaceDigitalCardEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoSizes.onEvent(event);
    }
}
