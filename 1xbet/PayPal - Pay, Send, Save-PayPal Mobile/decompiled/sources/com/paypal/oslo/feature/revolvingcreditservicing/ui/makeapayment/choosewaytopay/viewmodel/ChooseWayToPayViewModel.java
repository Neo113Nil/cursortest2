package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001(B+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001a0\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0#8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ChooseWayToPayArgs;", "args", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayReducer;", "reducer", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayInitializationMiddleware;", "chooseWayToPayInitializationMiddleware", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayObservabilityMiddleware$Factory;", "observabilityMiddlewareFactory", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ChooseWayToPayArgs;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayReducer;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayInitializationMiddleware;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayObservabilityMiddleware$Factory;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ChooseWayToPayArgs;", "getArgs", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ChooseWayToPayArgs;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayObservabilityMiddleware;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayObservabilityMiddleware;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayUiEffect;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ChooseWayToPayViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayObservabilityMiddleware getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ChooseWayToPayArgs args;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayViewModel$Factory;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ChooseWayToPayArgs;", "navArgs", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayViewModel;", "create", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ChooseWayToPayArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ChooseWayToPayArgs navArgs);
    }

    @dagger.assisted.AssistedInject
    public ChooseWayToPayViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ChooseWayToPayArgs chooseWayToPayArgs, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayReducer chooseWayToPayReducer, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayInitializationMiddleware chooseWayToPayInitializationMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayObservabilityMiddleware.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chooseWayToPayArgs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chooseWayToPayReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chooseWayToPayInitializationMiddleware, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        this.args = chooseWayToPayArgs;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayObservabilityMiddleware create = factory.create(chooseWayToPayArgs.getCreditProductIdentifier());
        this.getHighSpeedVideoSizes = create;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("ChooseWayToPayViewModel.store", com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState.Initial.INSTANCE, chooseWayToPayReducer, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.mvi.MviStateStore.Middleware[]{chooseWayToPayInitializationMiddleware, create}), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighResolutionOutputSizeshNQ4ISI = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
        processEvent(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent.OnViewCreated(chooseWayToPayArgs.getFundingInstruments(), chooseWayToPayArgs.getSelectedFundingInstrument(), chooseWayToPayArgs.isFundingInstrumentChanging(), chooseWayToPayArgs.getCreditAccountId()));
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ChooseWayToPayArgs getArgs() {
        return this.args;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighResolutionOutputSizeshNQ4ISI.onEvent(event);
    }
}
