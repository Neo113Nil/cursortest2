package com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001$B+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R&\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00160\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/RequestVirtualCardArgs;", "navArgs", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardReducer;", "reducer", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/mapper/RequestVirtualCardArgsMapper;", "argsMapper", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardMiddleware;", "requestVirtualCardMiddleware", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/RequestVirtualCardArgs;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardReducer;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/mapper/RequestVirtualCardArgsMapper;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardMiddleware;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardEvent;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/RequestVirtualCardArgs;", "getNavArgs", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/RequestVirtualCardArgs;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardEffect;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Factory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RequestVirtualCardViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState, com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEffect> getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RequestVirtualCardArgs navArgs;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState> uiState;

    @dagger.assisted.AssistedFactory
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardViewModel$Factory;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/RequestVirtualCardArgs;", "navArgs", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardViewModel;", "create", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/RequestVirtualCardArgs;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Factory {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RequestVirtualCardArgs navArgs);
    }

    @dagger.assisted.AssistedInject
    public RequestVirtualCardViewModel(@dagger.assisted.Assisted com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RequestVirtualCardArgs requestVirtualCardArgs, com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardReducer requestVirtualCardReducer, com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.mapper.RequestVirtualCardArgsMapper requestVirtualCardArgsMapper, com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardMiddleware requestVirtualCardMiddleware) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestVirtualCardArgs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestVirtualCardReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestVirtualCardArgsMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestVirtualCardMiddleware, "");
        this.navArgs = requestVirtualCardArgs;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState, com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("RequestVirtualCardViewModel.store", new com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.Ready(new com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.ReadyInfo(requestVirtualCardArgsMapper.toUiModel(requestVirtualCardArgs))), requestVirtualCardReducer, kotlin.collections.CollectionsKt.listOf(requestVirtualCardMiddleware), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighResolutionOutputSizeshNQ4ISI = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RequestVirtualCardArgs getNavArgs() {
        return this.navArgs;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighResolutionOutputSizeshNQ4ISI.onEvent(event);
    }
}
