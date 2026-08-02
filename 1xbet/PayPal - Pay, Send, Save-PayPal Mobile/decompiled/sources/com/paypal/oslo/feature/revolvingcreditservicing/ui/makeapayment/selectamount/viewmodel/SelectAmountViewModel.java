package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001(B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001a0\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0#8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountReducer;", "reducer", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/FetchPaymentOptionsMiddleware;", "fetchPaymentOptionsMiddleware", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountObservabilityMiddleware$Factory;", "observabilityMiddlewareFactory", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/SelectAmountArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountReducer;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/FetchPaymentOptionsMiddleware;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountObservabilityMiddleware$Factory;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/SelectAmountArgs;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountEvent;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/SelectAmountArgs;", "getArgs", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/SelectAmountArgs;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountObservabilityMiddleware;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountObservabilityMiddleware;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountUiEffect;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SelectAmountViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect> getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.SelectAmountArgs args;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountObservabilityMiddleware getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountViewModel$Factory;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/SelectAmountArgs;", "args", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountViewModel;", "create", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/SelectAmountArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.SelectAmountArgs args);
    }

    @dagger.assisted.AssistedInject
    public SelectAmountViewModel(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountReducer selectAmountReducer, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.FetchPaymentOptionsMiddleware fetchPaymentOptionsMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountObservabilityMiddleware.Factory factory, @dagger.assisted.Assisted com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.SelectAmountArgs selectAmountArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectAmountReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchPaymentOptionsMiddleware, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectAmountArgs, "");
        this.args = selectAmountArgs;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountObservabilityMiddleware create = factory.create(selectAmountArgs.getCreditProductIdentifier());
        this.getHighResolutionOutputSizeshNQ4ISI = create;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("SelectAmountViewModel.store", com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState.Initial.INSTANCE, selectAmountReducer, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.mvi.MviStateStore.Middleware[]{fetchPaymentOptionsMiddleware, create}), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoSizes = mviStateStore;
        mviStateStore.onEvent(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent.OnViewCreated(selectAmountArgs.getCreditProductIdentifier(), selectAmountArgs.getCreditAccountId(), selectAmountArgs.getMaxRepayableAmountIsInvalid()));
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.SelectAmountArgs getArgs() {
        return this.args;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoSizes.onEvent(event);
    }
}
