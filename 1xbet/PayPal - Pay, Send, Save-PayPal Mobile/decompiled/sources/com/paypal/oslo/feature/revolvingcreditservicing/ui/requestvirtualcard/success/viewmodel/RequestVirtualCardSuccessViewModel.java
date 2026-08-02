package com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.viewmodel;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR&\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00118\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u00168\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/success/viewmodel/RequestVirtualCardSuccessViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/success/viewmodel/RequestVirtualCardSuccessReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/success/viewmodel/RequestVirtualCardSuccessReducer;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/success/viewmodel/RequestVirtualCardSuccessEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/success/viewmodel/RequestVirtualCardSuccessEvent;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/success/viewmodel/RequestVirtualCardSuccessState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/success/viewmodel/RequestVirtualCardSuccessEffect;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState$revolvingcredit_servicing_prodRelease", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect$revolvingcredit_servicing_prodRelease", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RequestVirtualCardSuccessViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.viewmodel.RequestVirtualCardSuccessState, com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.viewmodel.RequestVirtualCardSuccessEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.viewmodel.RequestVirtualCardSuccessEffect> Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.viewmodel.RequestVirtualCardSuccessEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.viewmodel.RequestVirtualCardSuccessState> uiState;

    @javax.inject.Inject
    public RequestVirtualCardSuccessViewModel(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.viewmodel.RequestVirtualCardSuccessReducer requestVirtualCardSuccessReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestVirtualCardSuccessReducer, "");
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.viewmodel.RequestVirtualCardSuccessState, com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.viewmodel.RequestVirtualCardSuccessEvent, com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.viewmodel.RequestVirtualCardSuccessEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("RequestVirtualCardSuccessViewModel.store", com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.viewmodel.RequestVirtualCardSuccessState.Ready.INSTANCE, requestVirtualCardSuccessReducer, kotlin.collections.CollectionsKt.emptyList(), androidx.view.ViewModelKt.getViewModelScope(this));
        this.Camera2StreamConfigurationMap = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.viewmodel.RequestVirtualCardSuccessState> getUiState$revolvingcredit_servicing_prodRelease() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.viewmodel.RequestVirtualCardSuccessEffect> getUiEffect$revolvingcredit_servicing_prodRelease() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.success.viewmodel.RequestVirtualCardSuccessEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.Camera2StreamConfigurationMap.onEvent(event);
    }
}
