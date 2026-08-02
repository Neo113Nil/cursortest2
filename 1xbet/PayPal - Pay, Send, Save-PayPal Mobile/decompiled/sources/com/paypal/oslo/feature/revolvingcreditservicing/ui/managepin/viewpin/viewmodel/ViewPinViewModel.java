package com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001 B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR&\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/viewpin/viewmodel/ViewPinViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/viewpin/viewmodel/ViewPinReducer;", "reducer", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ViewPinArgs;", "args", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/viewpin/viewmodel/ViewPinReducer;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ViewPinArgs;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/viewpin/viewmodel/ViewPinEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/viewpin/viewmodel/ViewPinEvent;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ViewPinArgs;", "getArgs", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ViewPinArgs;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/viewpin/viewmodel/ViewPinState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/viewpin/viewmodel/ViewPinEffect;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ViewPinViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ViewPinArgs args;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinState, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinEffect> Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/viewpin/viewmodel/ViewPinViewModel$Factory;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ViewPinArgs;", "args", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/viewpin/viewmodel/ViewPinViewModel;", "create", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ViewPinArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/viewpin/viewmodel/ViewPinViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ViewPinArgs args);
    }

    @dagger.assisted.AssistedInject
    public ViewPinViewModel(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinReducer viewPinReducer, @dagger.assisted.Assisted com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ViewPinArgs viewPinArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewPinReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewPinArgs, "");
        this.args = viewPinArgs;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinState, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("ViewPinViewModel.store", com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinState.Initial.INSTANCE, viewPinReducer, null, androidx.view.ViewModelKt.getViewModelScope(this), 8, null);
        this.Camera2StreamConfigurationMap = mviStateStore;
        processEvent(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinEvent.OnViewCreated(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.uimodel.ViewPinUiModel(viewPinArgs.getPin(), viewPinArgs.getHasPhysicalCard())));
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ViewPinArgs getArgs() {
        return this.args;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.Camera2StreamConfigurationMap.onEvent(event);
    }
}
