package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u001a8\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010!R \u0010$\u001a\b\u0012\u0004\u0012\u00020 0#8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/SavingsAutoSaveViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/savings/domain/usecase/FetchGoalsUseCase;", "fetchGoalsUseCase", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/usecase/FetchGoalsUseCase;)V", "", "isForceFetch", "", "fetchGoals", "(Z)V", "", "message", "onSuccess", "(Ljava/lang/String;)V", "error", "onError", "onCancelled", "()V", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/savings/domain/usecase/FetchGoalsUseCase;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveUiState;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveEffect;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/SharedFlow;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsAutoSaveViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState> Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveEffect> effect;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveEffect> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState> uiState;

    @javax.inject.Inject
    public SavingsAutoSaveViewModel(com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase fetchGoalsUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchGoalsUseCase, "");
        this.getHighSpeedVideoFpsRanges = fetchGoalsUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.Loading.INSTANCE);
        this.Camera2StreamConfigurationMap = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveEffect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.getHighSpeedVideoSizes = MutableSharedFlow$default;
        this.effect = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveEffect> getEffect() {
        return this.effect;
    }

    public static /* synthetic */ void fetchGoals$default(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel savingsAutoSaveViewModel, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        savingsAutoSaveViewModel.fetchGoals(z);
    }

    public final void fetchGoals(boolean isForceFetch) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel$fetchGoals$1(this, isForceFetch, null), 3, null);
    }

    public final void onSuccess(java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        this.getHighSpeedVideoSizes.tryEmit(new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveEffect.NavigateBackWithResult(com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult.INSTANCE.success(message)));
    }

    public final void onError(java.lang.String error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        this.getHighSpeedVideoSizes.tryEmit(new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveEffect.NavigateBackWithResult(com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult.INSTANCE.error(error)));
    }

    public final void onCancelled() {
        this.getHighSpeedVideoSizes.tryEmit(new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveEffect.NavigateBackWithResult(com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult.INSTANCE.cancelled()));
    }

    public static final /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.Error access$handleError(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SavingsAutoSaveViewModel savingsAutoSaveViewModel, com.paypal.oslo.feature.savings.domain.model.SavingsError savingsError) {
        if (savingsError instanceof com.paypal.oslo.feature.savings.domain.model.SavingsError.NetworkError) {
            return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.Error(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveErrorType.NetworkError.INSTANCE, ((com.paypal.oslo.feature.savings.domain.model.SavingsError.NetworkError) savingsError).getMessage());
        }
        if (savingsError instanceof com.paypal.oslo.feature.savings.domain.model.SavingsError.GraphQLError) {
            return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.Error(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveErrorType.GraphQLError.INSTANCE, ((com.paypal.oslo.feature.savings.domain.model.SavingsError.GraphQLError) savingsError).getMessage());
        }
        if (!(savingsError instanceof com.paypal.oslo.feature.savings.domain.model.SavingsError.UnknownError)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveUiState.Error(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveErrorType.UnknownError.INSTANCE, ((com.paypal.oslo.feature.savings.domain.model.SavingsError.UnknownError) savingsError).getMessage());
    }
}
