package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001$B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00190\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u001c8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190 8G¢\u0006\u0006\u001a\u0004\b!\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/GetStatementDetailsMiddleware;", "sideEffectMiddleware", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsObservabilityMiddleware$Factory;", "observabilityMiddlewareFactory", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsReducer;", "reducer", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;", "navArgs", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/GetStatementDetailsMiddleware;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsObservabilityMiddleware$Factory;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsReducer;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsEvent;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsReducer;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsObservabilityMiddleware;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsObservabilityMiddleware;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsUiEffect;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class StatementDetailsViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsObservabilityMiddleware Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsUiEffect> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsReducer getHighSpeedVideoFpsRangesFor;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsViewModel$Factory;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;", "navArgs", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsViewModel;", "create", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementDetailsNavigationArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/detail/viewmodel/StatementDetailsViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs navArgs);
    }

    @dagger.assisted.AssistedInject
    public StatementDetailsViewModel(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.GetStatementDetailsMiddleware getStatementDetailsMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsObservabilityMiddleware.Factory factory, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsReducer statementDetailsReducer, @dagger.assisted.Assisted com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs statementDetailsNavigationArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getStatementDetailsMiddleware, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementDetailsReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementDetailsNavigationArgs, "");
        this.getHighSpeedVideoFpsRangesFor = statementDetailsReducer;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = statementDetailsNavigationArgs.getCreditProductIdentifier();
        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsObservabilityMiddleware create = factory.create(creditProductIdentifier == null ? com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.UNKNOWN : creditProductIdentifier);
        this.Camera2StreamConfigurationMap = create;
        this.getHighSpeedVideoSizes = new com.paypal.oslo.core.mvi.MviStateStore<>("StatementDetailsViewModel.store", com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState.Initial.INSTANCE, statementDetailsReducer, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.mvi.MviStateStore.Middleware[]{getStatementDetailsMiddleware, create}), androidx.view.ViewModelKt.getViewModelScope(this));
        processEvent(new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent.OnViewCreated(statementDetailsNavigationArgs));
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsState> getUiState() {
        return this.getHighSpeedVideoSizes.getUiState();
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsUiEffect> getUiEffect() {
        return this.getHighSpeedVideoSizes.getUiEffect();
    }

    public final void processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoSizes.onEvent(event);
    }
}
