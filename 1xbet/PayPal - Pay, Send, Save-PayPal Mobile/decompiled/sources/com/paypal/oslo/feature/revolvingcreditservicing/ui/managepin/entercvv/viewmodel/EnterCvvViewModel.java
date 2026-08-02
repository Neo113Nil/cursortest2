package com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\"B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R&\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00140\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00140\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvReducer;", "reducer", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/FetchPinMiddleware;", "fetchPinMiddleware", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/EnterCvvArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvReducer;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/FetchPinMiddleware;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/EnterCvvArgs;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvEvent;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/EnterCvvArgs;", "getArgs", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/EnterCvvArgs;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvEffect;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EnterCvvViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.EnterCvvArgs args;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEffect> getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvViewModel$Factory;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/EnterCvvArgs;", "args", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvViewModel;", "create", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/EnterCvvArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.EnterCvvArgs args);
    }

    @dagger.assisted.AssistedInject
    public EnterCvvViewModel(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvReducer enterCvvReducer, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.FetchPinMiddleware fetchPinMiddleware, @dagger.assisted.Assisted com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.EnterCvvArgs enterCvvArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enterCvvReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchPinMiddleware, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enterCvvArgs, "");
        this.args = enterCvvArgs;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("EnterCvvViewModel.store", com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState.Initial.INSTANCE, enterCvvReducer, kotlin.collections.CollectionsKt.listOf(fetchPinMiddleware), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoFpsRanges = mviStateStore;
        processEvent(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnViewCreated(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.uimodel.EnterCvvUiModel(enterCvvArgs.getCardArtUrl(), enterCvvArgs.getLastDigits(), enterCvvArgs.getHasPhysicalCard())));
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.EnterCvvArgs getArgs() {
        return this.args;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoFpsRanges.onEvent(event);
    }
}
