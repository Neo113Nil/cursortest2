package com.paypal.oslo.feature.bnplservicing.ui.autopay;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001(B+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001c0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001e8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0#8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/TurnOffAutopayModel;", "updateAutopayModel", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayReducer;", "reducer", "Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/autopay/CancelAutopayUseCase;", "cancelAutopayUseCase", "Lcom/paypal/oslo/feature/bnplservicing/common/utils/BnplServFormatter;", "formatter", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/TurnOffAutopayModel;Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayReducer;Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/autopay/CancelAutopayUseCase;Lcom/paypal/oslo/feature/bnplservicing/common/utils/BnplServFormatter;)V", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayEvent;)V", "clear", "()V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/TurnOffAutopayModel;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/autopay/CancelAutopayUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/bnplservicing/common/utils/BnplServFormatter;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayUiState;", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayUiEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState$bnpl_servicing_prodRelease", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect$bnpl_servicing_prodRelease", "()Lkotlinx/coroutines/flow/Flow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UpdateAutopayViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.CancelAutopayUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState, com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent, com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect> Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayViewModel$Factory;", "", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/TurnOffAutopayModel;", "updateAutopayModel", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayViewModel;", "create", "(Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/TurnOffAutopayModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel create(@dagger.assisted.Assisted("updateAutopayModel") com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel updateAutopayModel);
    }

    @dagger.assisted.AssistedInject
    public UpdateAutopayViewModel(@dagger.assisted.Assisted("updateAutopayModel") com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel turnOffAutopayModel, com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayReducer updateAutopayReducer, com.paypal.oslo.feature.bnplservicing.domain.usecase.autopay.CancelAutopayUseCase cancelAutopayUseCase, com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(turnOffAutopayModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateAutopayReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelAutopayUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplServFormatter, "");
        this.getHighSpeedVideoFpsRanges = turnOffAutopayModel;
        this.getHighResolutionOutputSizeshNQ4ISI = cancelAutopayUseCase;
        this.getHighSpeedVideoSizes = bnplServFormatter;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState, com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent, com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("UpdateAutopayViewModel.store", com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState.Default.INSTANCE, updateAutopayReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState, com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent>() { // from class: com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel$sideEffectHandler$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState, com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent> input) {
                com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel turnOffAutopayModel2;
                com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel turnOffAutopayModel3;
                com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel turnOffAutopayModel4;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                if (input.getEvent() instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnConfirmClicked) {
                    com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel updateAutopayViewModel = com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel.this;
                    turnOffAutopayModel2 = updateAutopayViewModel.getHighSpeedVideoFpsRanges;
                    java.lang.String creditAccountId = turnOffAutopayModel2.getCreditAccountId();
                    turnOffAutopayModel3 = com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel.this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier = turnOffAutopayModel3.getCreditProductIdentifier();
                    turnOffAutopayModel4 = com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel.this.getHighSpeedVideoFpsRanges;
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(updateAutopayViewModel), null, null, new com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel$cancelAutopay$1(updateAutopayViewModel, creditAccountId, creditProductIdentifier, turnOffAutopayModel4.getETag(), null), 3, null);
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.Camera2StreamConfigurationMap = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
        processEvent(com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnLoadDefaultData.INSTANCE);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState> getUiState$bnpl_servicing_prodRelease() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect> getUiEffect$bnpl_servicing_prodRelease() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.Camera2StreamConfigurationMap.onEvent(event);
    }

    public final void clear() {
        processEvent(com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnReset.INSTANCE);
    }
}
