package com.paypal.oslo.app.emw.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00198\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001fR \u0010!\u001a\b\u0012\u0004\u0012\u00020\n0 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$"}, d2 = {"Lcom/paypal/oslo/app/emw/ui/viewmodel/EmwViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/app/emw/domain/usecase/WebAuthSessionAuthorizationUseCase;", "webAuthSessionAuthorizationUseCase", "Lcom/paypal/oslo/feature/identity/api/IdentitySession;", "identitySession", "Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;", "webEnvironmentProvider", "<init>", "(Lcom/paypal/oslo/app/emw/domain/usecase/WebAuthSessionAuthorizationUseCase;Lcom/paypal/oslo/feature/identity/api/IdentitySession;Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;)V", "", "initialize", "()V", "logout", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/app/emw/domain/usecase/WebAuthSessionAuthorizationUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/api/IdentitySession;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/app/emw/domain/model/EmwUiState;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "logoutEvent", "Lkotlinx/coroutines/flow/SharedFlow;", "getLogoutEvent", "()Lkotlinx/coroutines/flow/SharedFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EmwViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.app.emw.domain.model.EmwUiState> getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.app.emw.domain.usecase.WebAuthSessionAuthorizationUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.identity.api.IdentitySession getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.core.webview.config.WebEnvironmentProvider getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.SharedFlow<kotlin.Unit> logoutEvent;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.app.emw.domain.model.EmwUiState> uiState;

    @javax.inject.Inject
    public EmwViewModel(com.paypal.oslo.app.emw.domain.usecase.WebAuthSessionAuthorizationUseCase webAuthSessionAuthorizationUseCase, com.paypal.oslo.feature.identity.api.IdentitySession identitySession, com.paypal.oslo.core.webview.config.WebEnvironmentProvider webEnvironmentProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webAuthSessionAuthorizationUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identitySession, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webEnvironmentProvider, "");
        this.getHighResolutionOutputSizeshNQ4ISI = webAuthSessionAuthorizationUseCase;
        this.getHighSpeedVideoFpsRangesFor = identitySession;
        this.getHighSpeedVideoSizes = webEnvironmentProvider;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.app.emw.domain.model.EmwUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.app.emw.domain.model.EmwUiState.Idle.INSTANCE);
        this.getHighSpeedVideoFpsRanges = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.Camera2StreamConfigurationMap = MutableSharedFlow$default;
        this.logoutEvent = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.app.emw.domain.model.EmwUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.SharedFlow<kotlin.Unit> getLogoutEvent() {
        return this.logoutEvent;
    }

    public final void initialize() {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges.getValue(), com.paypal.oslo.app.emw.domain.model.EmwUiState.Idle.INSTANCE)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel$initialize$1(this, null), 3, null);
        }
    }

    public final void logout() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel$logout$1(this, null), 3, null);
    }
}
