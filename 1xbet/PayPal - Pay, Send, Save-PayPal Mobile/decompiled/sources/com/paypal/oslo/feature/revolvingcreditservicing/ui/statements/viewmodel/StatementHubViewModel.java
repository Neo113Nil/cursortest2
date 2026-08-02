package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001#B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R&\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00190\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001aR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u001f8G¢\u0006\u0006\u001a\u0004\b \u0010!"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/LoadStatementMiddleware;", "loadStatementMiddleware", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubObservabilityMiddleware$Factory;", "observabilityMiddlewareFactory", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubReducer;", "reducer", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/LoadStatementMiddleware;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubObservabilityMiddleware$Factory;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubReducer;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubEvent;", "event", "", "process", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubEvent;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubReducer;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubObservabilityMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubObservabilityMiddleware;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubUiEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class StatementHubViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubObservabilityMiddleware getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubReducer Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubUiEffect> getHighSpeedVideoFpsRanges;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubViewModel$Factory;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;", "args", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubViewModel;", "create", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementHubArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/viewmodel/StatementHubViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs args);
    }

    @dagger.assisted.AssistedInject
    public StatementHubViewModel(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.LoadStatementMiddleware loadStatementMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubObservabilityMiddleware.Factory factory, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubReducer statementHubReducer, @dagger.assisted.Assisted com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs statementHubArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadStatementMiddleware, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementHubReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementHubArgs, "");
        this.Camera2StreamConfigurationMap = statementHubReducer;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubObservabilityMiddleware create = factory.create(statementHubArgs.getCpi());
        this.getHighSpeedVideoSizes = create;
        this.getHighSpeedVideoFpsRanges = new com.paypal.oslo.core.mvi.MviStateStore<>("StatementHubViewModel.store", com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState.Initial.INSTANCE, statementHubReducer, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.mvi.MviStateStore.Middleware[]{loadStatementMiddleware, create}), androidx.view.ViewModelKt.getViewModelScope(this));
        process(new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent.OnViewCreated(statementHubArgs));
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubState> getUiState() {
        return this.getHighSpeedVideoFpsRanges.getUiState();
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubUiEffect> getUiEffect() {
        return this.getHighSpeedVideoFpsRanges.getUiEffect();
    }

    public final void process(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoFpsRanges.onEvent(event);
    }
}
