package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\r\u001a\u00020\fH\u0080@¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\nJ\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\nR\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u001d8\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/viewmodel/ManageFaceScanViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/GetFaceScanStatusUseCase;", "getFaceScanStatusUseCase", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/DeleteFaceScanUseCase;", "deleteFaceScanUseCase", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/GetFaceScanStatusUseCase;Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/DeleteFaceScanUseCase;)V", "", "loadFaceScanStatus$consumer_privacy_prodRelease", "()V", "onDeleteClick$consumer_privacy_prodRelease", "", "onDeleteConfirm$consumer_privacy_prodRelease", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDeleteSuccessAcknowledged$consumer_privacy_prodRelease", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ManageFaceScanUiState;", "p0", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/FaceScanError;", "p1", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ManageFaceScanUiState;Lcom/paypal/oslo/feature/consumerprivacy/domain/model/FaceScanError;)Z", "clearBanner", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/GetFaceScanStatusUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/DeleteFaceScanUseCase;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ManageFaceScanViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetFaceScanStatusUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.domain.usecase.DeleteFaceScanUseCase getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState> uiState;

    public final void onDeleteClick$consumer_privacy_prodRelease() {
    }

    @javax.inject.Inject
    public ManageFaceScanViewModel(com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetFaceScanStatusUseCase getFaceScanStatusUseCase, com.paypal.oslo.feature.consumerprivacy.domain.usecase.DeleteFaceScanUseCase deleteFaceScanUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getFaceScanStatusUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteFaceScanUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = getFaceScanStatusUseCase;
        this.getHighSpeedVideoFpsRanges = deleteFaceScanUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Loading.INSTANCE);
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        loadFaceScanStatus$consumer_privacy_prodRelease();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState> getUiState() {
        return this.uiState;
    }

    public final void loadFaceScanStatus$consumer_privacy_prodRelease() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel$loadFaceScanStatus$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object onDeleteConfirm$consumer_privacy_prodRelease(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel$onDeleteConfirm$1 manageFaceScanViewModel$onDeleteConfirm$1;
        int i;
        com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Error error;
        com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState manageFaceScanUiState;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel$onDeleteConfirm$1) {
            manageFaceScanViewModel$onDeleteConfirm$1 = (com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel$onDeleteConfirm$1) continuation;
            if ((manageFaceScanViewModel$onDeleteConfirm$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                manageFaceScanViewModel$onDeleteConfirm$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = manageFaceScanViewModel$onDeleteConfirm$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = manageFaceScanViewModel$onDeleteConfirm$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState value = this.getHighSpeedVideoFpsRangesFor.getValue();
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState> mutableStateFlow = this.getHighSpeedVideoFpsRangesFor;
                    if (value instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Content) {
                        error = com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Content.copy$default((com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Content) value, false, null, true, 3, null);
                    } else if (value instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Error) {
                        com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Error error2 = (com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Error) value;
                        error = new com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Error(error2.getBanner(), error2.getMessage(), error2.isFaceScanEnabled());
                    } else {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(value, com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Loading.INSTANCE)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        error = value;
                    }
                    mutableStateFlow.setValue(error);
                    com.paypal.oslo.feature.consumerprivacy.domain.usecase.DeleteFaceScanUseCase deleteFaceScanUseCase = this.getHighSpeedVideoFpsRanges;
                    manageFaceScanViewModel$onDeleteConfirm$1.getHighSpeedVideoFpsRangesFor = value;
                    manageFaceScanViewModel$onDeleteConfirm$1.Camera2StreamConfigurationMap = 1;
                    java.lang.Object invoke = deleteFaceScanUseCase.invoke(manageFaceScanViewModel$onDeleteConfirm$1);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    manageFaceScanUiState = value;
                    obj = invoke;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    manageFaceScanUiState = (com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState) manageFaceScanViewModel$onDeleteConfirm$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(getHighSpeedVideoFpsRanges(manageFaceScanUiState, (com.paypal.oslo.feature.consumerprivacy.domain.model.FaceScanError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (!(ior instanceof arrow.core.Ior.Right)) {
                    if (ior instanceof arrow.core.Ior.Both) {
                        arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                        java.lang.Object leftValue = both.getLeftValue();
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(getHighSpeedVideoFpsRanges(manageFaceScanUiState, (com.paypal.oslo.feature.consumerprivacy.domain.model.FaceScanError) leftValue));
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoFpsRangesFor.setValue(new com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Content(true, null, false));
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
            }
        }
        manageFaceScanViewModel$onDeleteConfirm$1 = new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel$onDeleteConfirm$1(this, continuation);
        java.lang.Object obj2 = manageFaceScanViewModel$onDeleteConfirm$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = manageFaceScanViewModel$onDeleteConfirm$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    public final void onDeleteSuccessAcknowledged$consumer_privacy_prodRelease() {
        this.getHighSpeedVideoFpsRangesFor.setValue(new com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Content(false, null, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState p0, com.paypal.oslo.feature.consumerprivacy.domain.model.FaceScanError p1) {
        com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Error error;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState> mutableStateFlow = this.getHighSpeedVideoFpsRangesFor;
        int i = 2;
        com.paypal.oslo.feature.consumerprivacy.ui.components.BannerLinkConfig bannerLinkConfig = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        if (p0 instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Content) {
            error = new com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Content(((com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Content) p0).isFaceScanEnabled(), new com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_banner_error_message, bannerLinkConfig, i, objArr3 == true ? 1 : 0), false);
        } else {
            if (!(p0 instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Error) && !kotlin.jvm.internal.Intrinsics.areEqual(p0, com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Loading.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            error = new com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Error(new com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_banner_error_message, objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0), p1.getDescription(), false);
        }
        mutableStateFlow.setValue(error);
        return false;
    }

    public final void clearBanner() {
        com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState value = this.getHighSpeedVideoFpsRangesFor.getValue();
        if (value instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Content) {
            this.getHighSpeedVideoFpsRangesFor.setValue(com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Content.copy$default((com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Content) value, false, null, false, 5, null));
        }
    }
}
