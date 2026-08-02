package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001!B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R&\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00160\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u00198G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u001d8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/DownloadStatementMiddleware;", "downloadStatementMiddleware", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementObservabilityMiddleware;", "observabilityMiddleware", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementReducer;", "reducer", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/DownloadStatementMiddleware;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementObservabilityMiddleware;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementReducer;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementArgs;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementEvent;", "event", "", "process", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementEvent;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementReducer;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementUiEffect;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class StatementViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementState, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementUiEffect> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementReducer getHighSpeedVideoFpsRanges;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementViewModel$Factory;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementArgs;", "args", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementViewModel;", "create", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/StatementArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/statements/statement/viewmodel/StatementViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementArgs args);
    }

    @dagger.assisted.AssistedInject
    public StatementViewModel(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.DownloadStatementMiddleware downloadStatementMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementObservabilityMiddleware statementObservabilityMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementReducer statementReducer, @dagger.assisted.Assisted com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementArgs statementArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadStatementMiddleware, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementObservabilityMiddleware, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementArgs, "");
        this.getHighSpeedVideoFpsRanges = statementReducer;
        this.getHighSpeedVideoSizes = new com.paypal.oslo.core.mvi.MviStateStore<>("StatementViewModel.store", com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementState.Initial.INSTANCE, statementReducer, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.mvi.MviStateStore.Middleware[]{downloadStatementMiddleware, statementObservabilityMiddleware}), androidx.view.ViewModelKt.getViewModelScope(this));
        process(new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent.OnViewCreated(statementArgs));
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementState> getUiState() {
        return this.getHighSpeedVideoSizes.getUiState();
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementUiEffect> getUiEffect() {
        return this.getHighSpeedVideoSizes.getUiEffect();
    }

    public final void process(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoSizes.onEvent(event);
    }
}
