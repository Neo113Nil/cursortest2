package com.paypal.oslo.feature.identity.changepassword.ui;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 .2\u00020\u0001:\u0003/0.B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0010J!\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001f8\u0007¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010*\u001a\b\u0012\u0004\u0012\u00020%0)8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-"}, d2 = {"Lcom/paypal/oslo/feature/identity/changepassword/ui/ChangePasswordViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/identity/changepassword/domain/usecase/ChangePasswordUseCase;", "changePasswordUseCase", "<init>", "(Lcom/paypal/oslo/feature/identity/changepassword/domain/usecase/ChangePasswordUseCase;)V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "onCurrentPasswordChange", "(Ljava/lang/String;)V", "onNewPasswordChange", "onConfirmPasswordChange", "", "focused", "onNewPasswordFocusChange", "(Z)V", "onConfirmPasswordFocusChange", "p0", "p1", "Camera2StreamConfigurationMap", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Boolean;", "onChangePasswordClick", "()V", "onDismissError", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/identity/changepassword/domain/usecase/ChangePasswordUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/identity/changepassword/ui/ChangePasswordViewModel$ChangePasswordUiState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/channels/Channel;", "Lcom/paypal/oslo/feature/identity/changepassword/ui/ChangePasswordUiEffect;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/channels/Channel;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Companion", "ChangePasswordUiState", com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsTestTag.ERROR_MESSAGE}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChangePasswordViewModel extends androidx.view.ViewModel {
    public static final int PasswordMinLength = 8;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordUiEffect> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.changepassword.domain.usecase.ChangePasswordUseCase getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState> uiState;
    public static final int $stable = 8;

    @javax.inject.Inject
    public ChangePasswordViewModel(com.paypal.oslo.feature.identity.changepassword.domain.usecase.ChangePasswordUseCase changePasswordUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(changePasswordUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = changePasswordUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState(null, null, null, false, null, null, false, false, false, 511, null));
        this.Camera2StreamConfigurationMap = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordUiEffect> Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(-2, null, null, 6, null);
        this.getHighSpeedVideoFpsRanges = Channel$default;
        this.uiEffect = kotlinx.coroutines.flow.FlowKt.receiveAsFlow(Channel$default);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void onCurrentPasswordChange(java.lang.String value) {
        com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState value2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState> mutableStateFlow = this.Camera2StreamConfigurationMap;
        do {
            value2 = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value2, com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState.copy$default(value2, value, null, null, false, null, null, false, false, false, 446, null)));
    }

    public final void onNewPasswordChange(java.lang.String value) {
        com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState value2;
        com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState changePasswordUiState;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState> mutableStateFlow = this.Camera2StreamConfigurationMap;
        do {
            value2 = mutableStateFlow.getValue();
            changePasswordUiState = value2;
        } while (!mutableStateFlow.compareAndSet(value2, com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState.copy$default(changePasswordUiState, null, value, null, false, null, Camera2StreamConfigurationMap(value, changePasswordUiState.getConfirmPassword()), false, false, false, com.datadog.android.core.internal.data.upload.DataOkHttpUploader.HTTP_ENTITY_TOO_LARGE, null)));
    }

    public final void onConfirmPasswordChange(java.lang.String value) {
        com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState value2;
        com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState changePasswordUiState;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState> mutableStateFlow = this.Camera2StreamConfigurationMap;
        do {
            value2 = mutableStateFlow.getValue();
            changePasswordUiState = value2;
        } while (!mutableStateFlow.compareAndSet(value2, com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState.copy$default(changePasswordUiState, null, null, value, false, null, Camera2StreamConfigurationMap(changePasswordUiState.getNewPassword(), value), false, false, false, 411, null)));
    }

    public final void onNewPasswordFocusChange(boolean focused) {
        com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState value;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState> mutableStateFlow = this.Camera2StreamConfigurationMap;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState.copy$default(value, null, null, null, false, null, null, false, focused, false, 383, null)));
    }

    public final void onConfirmPasswordFocusChange(boolean focused) {
        com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState value;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState> mutableStateFlow = this.Camera2StreamConfigurationMap;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState.copy$default(value, null, null, null, false, null, null, false, false, focused, 255, null)));
    }

    private static java.lang.Boolean Camera2StreamConfigurationMap(java.lang.String p0, java.lang.String p1) {
        if (p0.length() <= 0 || p1.length() <= 0) {
            return null;
        }
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.Intrinsics.areEqual(p0, p1));
    }

    public final void onChangePasswordClick() {
        com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState value;
        com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState value2;
        com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState value3;
        com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState value4 = this.Camera2StreamConfigurationMap.getValue();
        if (value4.isLoading()) {
            return;
        }
        if (!value4.isSubmitEnabled()) {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState> mutableStateFlow = this.Camera2StreamConfigurationMap;
            do {
                value3 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value3, com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState.copy$default(value3, null, null, null, false, null, null, true, false, false, 447, null)));
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(value4.getCurrentPassword(), value4.getNewPassword())) {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState> mutableStateFlow2 = this.Camera2StreamConfigurationMap;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState.copy$default(value2, null, null, null, false, com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage.SAME_PASSWORD, null, false, false, false, 495, null)));
        } else {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState> mutableStateFlow3 = this.Camera2StreamConfigurationMap;
            do {
                value = mutableStateFlow3.getValue();
            } while (!mutableStateFlow3.compareAndSet(value, com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState.copy$default(value, null, null, null, true, null, null, false, false, false, 487, null)));
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel$onChangePasswordClick$4(this, value4, null), 3, null);
        }
    }

    public final void onDismissError() {
        com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState value;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState> mutableStateFlow = this.Camera2StreamConfigurationMap;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState.copy$default(value, null, null, null, false, null, null, false, false, false, 431, null)));
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015Jn\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b\u0007\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b/\u0010\u0015R\u001a\u0010\f\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b\f\u0010\u0015R\u001a\u0010\r\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b\r\u0010\u0015R\u0011\u00100\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b0\u0010\u0015R\u0011\u00101\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b1\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/identity/changepassword/ui/ChangePasswordViewModel$ChangePasswordUiState;", "", "", "currentPassword", androidx.autofill.HintConstants.AUTOFILL_HINT_NEW_PASSWORD, "confirmPassword", "", "isLoading", "Lcom/paypal/oslo/feature/identity/changepassword/ui/ChangePasswordViewModel$ErrorMessage;", "errorMessage", "passwordsMatch", "showSubmitError", "isNewPasswordFocused", "isConfirmPasswordFocused", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/paypal/oslo/feature/identity/changepassword/ui/ChangePasswordViewModel$ErrorMessage;Ljava/lang/Boolean;ZZZ)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "()Lcom/paypal/oslo/feature/identity/changepassword/ui/ChangePasswordViewModel$ErrorMessage;", "component6", "()Ljava/lang/Boolean;", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/paypal/oslo/feature/identity/changepassword/ui/ChangePasswordViewModel$ErrorMessage;Ljava/lang/Boolean;ZZZ)Lcom/paypal/oslo/feature/identity/changepassword/ui/ChangePasswordViewModel$ChangePasswordUiState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCurrentPassword", "getNewPassword", "getConfirmPassword", "Z", "Lcom/paypal/oslo/feature/identity/changepassword/ui/ChangePasswordViewModel$ErrorMessage;", "getErrorMessage", "Ljava/lang/Boolean;", "getPasswordsMatch", "getShowSubmitError", "isNewPasswordValid", "isSubmitEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChangePasswordUiState {
        public static final int $stable = 0;
        private final java.lang.String confirmPassword;
        private final java.lang.String currentPassword;
        private final com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage errorMessage;
        private final boolean isConfirmPasswordFocused;
        private final boolean isLoading;
        private final boolean isNewPasswordFocused;
        private final java.lang.String newPassword;
        private final java.lang.Boolean passwordsMatch;
        private final boolean showSubmitError;

        public ChangePasswordUiState(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage errorMessage, java.lang.Boolean bool, boolean z2, boolean z3, boolean z4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.currentPassword = str;
            this.newPassword = str2;
            this.confirmPassword = str3;
            this.isLoading = z;
            this.errorMessage = errorMessage;
            this.passwordsMatch = bool;
            this.showSubmitError = z2;
            this.isNewPasswordFocused = z3;
            this.isConfirmPasswordFocused = z4;
        }

        public /* synthetic */ ChangePasswordUiState(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage errorMessage, java.lang.Boolean bool, boolean z2, boolean z3, boolean z4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : errorMessage, (i & 32) == 0 ? bool : null, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? false : z3, (i & 256) == 0 ? z4 : false);
        }

        public final java.lang.String getCurrentPassword() {
            return this.currentPassword;
        }

        public final java.lang.String getNewPassword() {
            return this.newPassword;
        }

        public final java.lang.String getConfirmPassword() {
            return this.confirmPassword;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.Boolean getPasswordsMatch() {
            return this.passwordsMatch;
        }

        public final boolean getShowSubmitError() {
            return this.showSubmitError;
        }

        public final boolean isNewPasswordFocused() {
            return this.isNewPasswordFocused;
        }

        public final boolean isConfirmPasswordFocused() {
            return this.isConfirmPasswordFocused;
        }

        public final boolean isNewPasswordValid() {
            if (this.newPassword.length() >= 8) {
                java.lang.String str = this.newPassword;
                int i = 0;
                while (true) {
                    if (i >= str.length()) {
                        break;
                    }
                    if (java.lang.Character.isDigit(str.charAt(i))) {
                        java.lang.String str2 = this.newPassword;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= str2.length()) {
                                break;
                            }
                            if (java.lang.Character.isLetterOrDigit(str2.charAt(i2))) {
                                i2++;
                            } else {
                                java.lang.String str3 = this.newPassword;
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= str3.length()) {
                                        break;
                                    }
                                    if (java.lang.Character.isUpperCase(str3.charAt(i3))) {
                                        java.lang.String str4 = this.newPassword;
                                        for (int i4 = 0; i4 < str4.length(); i4++) {
                                            if (java.lang.Character.isLowerCase(str4.charAt(i4))) {
                                                return true;
                                            }
                                        }
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                        }
                    } else {
                        i++;
                    }
                }
            }
            return false;
        }

        public final boolean isSubmitEnabled() {
            return this.currentPassword.length() > 0 && isNewPasswordValid() && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmPassword, this.newPassword);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.currentPassword;
            java.lang.String str2 = this.newPassword;
            java.lang.String str3 = this.confirmPassword;
            boolean z = this.isLoading;
            com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage errorMessage = this.errorMessage;
            java.lang.Boolean bool = this.passwordsMatch;
            boolean z2 = this.showSubmitError;
            boolean z3 = this.isNewPasswordFocused;
            boolean z4 = this.isConfirmPasswordFocused;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ChangePasswordUiState(currentPassword=");
            sb.append(str);
            sb.append(", newPassword=");
            sb.append(str2);
            sb.append(", confirmPassword=");
            sb.append(str3);
            sb.append(", isLoading=");
            sb.append(z);
            sb.append(", errorMessage=");
            sb.append(errorMessage);
            sb.append(", passwordsMatch=");
            sb.append(bool);
            sb.append(", showSubmitError=");
            sb.append(z2);
            sb.append(", isNewPasswordFocused=");
            sb.append(z3);
            sb.append(", isConfirmPasswordFocused=");
            sb.append(z4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.currentPassword.hashCode();
            int hashCode2 = this.newPassword.hashCode();
            int hashCode3 = this.confirmPassword.hashCode();
            int hashCode4 = java.lang.Boolean.hashCode(this.isLoading);
            com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage errorMessage = this.errorMessage;
            int hashCode5 = errorMessage == null ? 0 : errorMessage.hashCode();
            java.lang.Boolean bool = this.passwordsMatch;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (bool != null ? bool.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.showSubmitError)) * 31) + java.lang.Boolean.hashCode(this.isNewPasswordFocused)) * 31) + java.lang.Boolean.hashCode(this.isConfirmPasswordFocused);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState)) {
                return false;
            }
            com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState changePasswordUiState = (com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currentPassword, changePasswordUiState.currentPassword) && kotlin.jvm.internal.Intrinsics.areEqual(this.newPassword, changePasswordUiState.newPassword) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmPassword, changePasswordUiState.confirmPassword) && this.isLoading == changePasswordUiState.isLoading && this.errorMessage == changePasswordUiState.errorMessage && kotlin.jvm.internal.Intrinsics.areEqual(this.passwordsMatch, changePasswordUiState.passwordsMatch) && this.showSubmitError == changePasswordUiState.showSubmitError && this.isNewPasswordFocused == changePasswordUiState.isNewPasswordFocused && this.isConfirmPasswordFocused == changePasswordUiState.isConfirmPasswordFocused;
        }

        public final com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState copy(java.lang.String currentPassword, java.lang.String newPassword, java.lang.String confirmPassword, boolean isLoading, com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage errorMessage, java.lang.Boolean passwordsMatch, boolean showSubmitError, boolean isNewPasswordFocused, boolean isConfirmPasswordFocused) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentPassword, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newPassword, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmPassword, "");
            return new com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState(currentPassword, newPassword, confirmPassword, isLoading, errorMessage, passwordsMatch, showSubmitError, isNewPasswordFocused, isConfirmPasswordFocused);
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getIsConfirmPasswordFocused() {
            return this.isConfirmPasswordFocused;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsNewPasswordFocused() {
            return this.isNewPasswordFocused;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getShowSubmitError() {
            return this.showSubmitError;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.Boolean getPasswordsMatch() {
            return this.passwordsMatch;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getConfirmPassword() {
            return this.confirmPassword;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getNewPassword() {
            return this.newPassword;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCurrentPassword() {
            return this.currentPassword;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState copy$default(com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ChangePasswordUiState changePasswordUiState, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage errorMessage, java.lang.Boolean bool, boolean z2, boolean z3, boolean z4, int i, java.lang.Object obj) {
            return changePasswordUiState.copy((i & 1) != 0 ? changePasswordUiState.currentPassword : str, (i & 2) != 0 ? changePasswordUiState.newPassword : str2, (i & 4) != 0 ? changePasswordUiState.confirmPassword : str3, (i & 8) != 0 ? changePasswordUiState.isLoading : z, (i & 16) != 0 ? changePasswordUiState.errorMessage : errorMessage, (i & 32) != 0 ? changePasswordUiState.passwordsMatch : bool, (i & 64) != 0 ? changePasswordUiState.showSubmitError : z2, (i & 128) != 0 ? changePasswordUiState.isNewPasswordFocused : z3, (i & 256) != 0 ? changePasswordUiState.isConfirmPasswordFocused : z4);
        }

        public ChangePasswordUiState() {
            this(null, null, null, false, null, null, false, false, false, 511, null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/changepassword/ui/ChangePasswordViewModel$ErrorMessage;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID_CURRENT_PASSWORD", "SAME_PASSWORD", "GENERIC"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ErrorMessage {
        private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
        public static final com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage GENERIC;
        public static final com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage INVALID_CURRENT_PASSWORD;
        public static final com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage SAME_PASSWORD;
        private static final /* synthetic */ com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage[] getHighSpeedVideoFpsRangesFor;

        private ErrorMessage(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage errorMessage = new com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage("INVALID_CURRENT_PASSWORD", 0);
            INVALID_CURRENT_PASSWORD = errorMessage;
            com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage errorMessage2 = new com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage("SAME_PASSWORD", 1);
            SAME_PASSWORD = errorMessage2;
            com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage errorMessage3 = new com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage("GENERIC", 2);
            GENERIC = errorMessage3;
            com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage[] errorMessageArr = {errorMessage, errorMessage2, errorMessage3};
            getHighSpeedVideoFpsRangesFor = errorMessageArr;
            Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(errorMessageArr);
        }

        public static com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage[] values() {
            return (com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage[]) getHighSpeedVideoFpsRangesFor.clone();
        }

        public static com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage> getEntries() {
            return Camera2StreamConfigurationMap;
        }
    }

    public static final /* synthetic */ com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage access$mapErrorToMessage(com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel changePasswordViewModel, com.paypal.oslo.feature.identity.changepassword.domain.model.ChangePasswordError changePasswordError) {
        if (changePasswordError instanceof com.paypal.oslo.feature.identity.changepassword.domain.model.ChangePasswordError.InvalidCurrentPassword) {
            return com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage.INVALID_CURRENT_PASSWORD;
        }
        if (changePasswordError instanceof com.paypal.oslo.feature.identity.changepassword.domain.model.ChangePasswordError.SamePassword) {
            return com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage.SAME_PASSWORD;
        }
        if (!(changePasswordError instanceof com.paypal.oslo.feature.identity.changepassword.domain.model.ChangePasswordError.PasswordMismatch) && !(changePasswordError instanceof com.paypal.oslo.feature.identity.changepassword.domain.model.ChangePasswordError.Api) && !(changePasswordError instanceof com.paypal.oslo.feature.identity.changepassword.domain.model.ChangePasswordError.Unknown)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.identity.changepassword.ui.ChangePasswordViewModel.ErrorMessage.GENERIC;
    }
}
