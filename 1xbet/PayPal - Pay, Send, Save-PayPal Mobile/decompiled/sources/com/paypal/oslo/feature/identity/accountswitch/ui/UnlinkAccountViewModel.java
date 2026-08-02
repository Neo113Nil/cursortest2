package com.paypal.oslo.feature.identity.accountswitch.ui;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\u0003\u0010\tJ\r\u0010\n\u001a\u00020\b¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00138\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/identity/accountswitch/ui/UnlinkAccountViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/UnlinkAccountUseCase;", "unlinkAccount", "Lcom/paypal/oslo/feature/identity/shared/domain/provider/StringProvider;", "stringProvider", "<init>", "(Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/UnlinkAccountUseCase;Lcom/paypal/oslo/feature/identity/shared/domain/provider/StringProvider;)V", "", "()V", "resetState", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/UnlinkAccountUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/shared/domain/provider/StringProvider;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/identity/accountswitch/ui/UnlinkAccountUiState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UnlinkAccountViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountUiState> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UnlinkAccountUseCase Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountUiState> uiState;

    @javax.inject.Inject
    public UnlinkAccountViewModel(com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UnlinkAccountUseCase unlinkAccountUseCase, com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider stringProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unlinkAccountUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringProvider, "");
        this.Camera2StreamConfigurationMap = unlinkAccountUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = stringProvider;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountUiState.Idle.INSTANCE);
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountUiState> getUiState() {
        return this.uiState;
    }

    public final void unlinkAccount() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel$unlinkAccount$1(this, null), 3, null);
    }

    public final void resetState() {
        this.getHighSpeedVideoFpsRangesFor.setValue(com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountUiState.Idle.INSTANCE);
    }

    public static final /* synthetic */ void access$handlePartialSuccess(com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel unlinkAccountViewModel, com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError dataResultError, boolean z) {
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Partial success for unlink operation", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", dataResultError.toString()), kotlin.TuplesKt.to("success", java.lang.String.valueOf(z))), null, 4, null);
        if (z) {
            unlinkAccountViewModel.getHighSpeedVideoFpsRangesFor.setValue(com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountUiState.Success.INSTANCE);
        } else {
            unlinkAccountViewModel.getHighSpeedVideoFpsRangesFor.setValue(new com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountUiState.Error(unlinkAccountViewModel.getHighResolutionOutputSizeshNQ4ISI.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_unlink_account_error)));
        }
    }

    public static final /* synthetic */ void access$handleUnlinkError(com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel unlinkAccountViewModel, com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError dataResultError) {
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Failed to unlink account", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", dataResultError.toString())), null, 4, null);
        unlinkAccountViewModel.getHighSpeedVideoFpsRangesFor.setValue(new com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountUiState.Error(unlinkAccountViewModel.getHighResolutionOutputSizeshNQ4ISI.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_unlink_account_error)));
    }

    public static final /* synthetic */ void access$handleUnlinkSuccess(com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountViewModel unlinkAccountViewModel, boolean z) {
        if (z) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Account unlinked and logged out successfully", null, null, 6, null);
            unlinkAccountViewModel.getHighSpeedVideoFpsRangesFor.setValue(com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountUiState.Success.INSTANCE);
        } else {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Unlink operation returned false", null, null, 6, null);
            unlinkAccountViewModel.getHighSpeedVideoFpsRangesFor.setValue(new com.paypal.oslo.feature.identity.accountswitch.ui.UnlinkAccountUiState.Error(unlinkAccountViewModel.getHighResolutionOutputSizeshNQ4ISI.getString(com.paypal.oslo.feature.identity.R.string.feature_identity_unlink_account_error)));
        }
    }
}
