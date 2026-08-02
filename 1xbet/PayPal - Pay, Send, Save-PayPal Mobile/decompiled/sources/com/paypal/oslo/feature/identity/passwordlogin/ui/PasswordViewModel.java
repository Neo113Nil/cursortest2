package com.paypal.oslo.feature.identity.passwordlogin.ui;

@kotlin.Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001_B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u0014J\r\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u0014J5\u0010\"\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J-\u0010&\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0015¢\u0006\u0004\b(\u0010\u0018J0\u0010)\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010!\u001a\u00020 H\u0080@¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0010¢\u0006\u0004\b+\u0010\u0014J\r\u0010,\u001a\u00020\u0010¢\u0006\u0004\b,\u0010\u0014J\u001f\u0010-\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u0015H\u0000¢\u0006\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00104\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00107\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010:\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010=\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020?0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010@R\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020?0B8\u0007¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010G0>8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bH\u0010@R\"\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010G0B8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010D\u001a\u0004\bJ\u0010FR\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020K0>8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u0010@R \u0010L\u001a\b\u0012\u0004\u0012\u00020K0B8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010D\u001a\u0004\bM\u0010FR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020K0>8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u0010@R \u0010N\u001a\b\u0012\u0004\u0012\u00020K0B8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010D\u001a\u0004\bO\u0010FR\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020Q0P8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u0010RR \u0010T\u001a\b\u0012\u0004\u0012\u00020Q0S8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020K0>8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u0010@R \u0010Y\u001a\b\u0012\u0004\u0012\u00020K0B8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010D\u001a\u0004\bZ\u0010FR\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020K0>8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b:\u0010@R \u0010[\u001a\b\u0012\u0004\u0012\u00020K0B8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010D\u001a\u0004\b[\u0010FR \u0010]\u001a\b\u0012\u0004\u0012\u00020\\0B8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010D\u001a\u0004\b^\u0010F"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordlogin/ui/PasswordViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/identity/passwordlogin/domain/usecase/PasswordUseCase;", "passwordUseCase", "Lcom/paypal/oslo/feature/identity/passwordrecovery/controller/PasswordRecoveryFlowCoordinator;", "passwordRecoveryFlowCoordinator", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/usecase/MapToAuthOptionUseCase;", "mapToAuthOptionUseCase", "Lcom/paypal/oslo/feature/identity/passwordlogin/domain/validator/PasswordValidator;", "passwordValidator", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler;", "biometricLoginHandler", "<init>", "(Lcom/paypal/oslo/feature/identity/passwordlogin/domain/usecase/PasswordUseCase;Lcom/paypal/oslo/feature/identity/passwordrecovery/controller/PasswordRecoveryFlowCoordinator;Lcom/paypal/oslo/feature/identity/moreoptions/domain/usecase/MapToAuthOptionUseCase;Lcom/paypal/oslo/feature/identity/passwordlogin/domain/validator/PasswordValidator;Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler;)V", "Landroidx/fragment/app/FragmentActivity;", "activity", "", "attemptBiometricLogin", "(Landroidx/fragment/app/FragmentActivity;)V", "resetBiometricState", "()V", "", "errorMessage", "onBiometricError", "(Ljava/lang/String;)V", "openMoreOptions", "dismissMoreOptions", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;", "optionType", "publicCredential", "displayName", "requestId", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "authIntent", "handleMoreOptionSelected", "(Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;)V", "email", "password", "login", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;)V", "onPasswordChange", "performLogin$identity_prodRelease", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetState", "dismissPasswordCreatedBanner", "startPasswordRecovery$identity_prodRelease", "(Ljava/lang/String;Ljava/lang/String;)V", "getOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/passwordlogin/domain/usecase/PasswordUseCase;", "Camera2StreamConfigurationMap", "getOutputFormats", "Lcom/paypal/oslo/feature/identity/passwordrecovery/controller/PasswordRecoveryFlowCoordinator;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/usecase/MapToAuthOptionUseCase;", "getHighSpeedVideoFpsRanges", "getOutputStallDurationlomOqCM", "Lcom/paypal/oslo/feature/identity/passwordlogin/domain/validator/PasswordValidator;", "getHighSpeedVideoSizes", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/identity/passwordlogin/ui/PasswordViewModel$LoginState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getInputFormats", "Lkotlinx/coroutines/flow/StateFlow;", "loginState", "Lkotlinx/coroutines/flow/StateFlow;", "getLoginState", "()Lkotlinx/coroutines/flow/StateFlow;", "", "getInputSizeshNQ4ISI", "validationError", "getValidationError", "", "showPasswordCreatedBanner", "getShowPasswordCreatedBanner", "showMoreOptions", "getShowMoreOptions", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginFlowEffect;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/Flow;", "loginFlowEffect", "Lkotlinx/coroutines/flow/Flow;", "getLoginFlowEffect", "()Lkotlinx/coroutines/flow/Flow;", "getOutputMinFrameDurationlomOqCM", "showBiometricPrompt", "getShowBiometricPrompt", "isPasswordRecoveryLoading", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricLoginHandler$BiometricLoginUiState;", "biometricState", "getBiometricState", "LoginState"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasswordViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState> getInputFormats;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState> biometricState;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getOutputMinFrameDurationlomOqCM;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect> getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getOutputStallDurationlomOqCM;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MapToAuthOptionUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getOutputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> getHighSpeedVideoSizesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.passwordlogin.domain.usecase.PasswordUseCase Camera2StreamConfigurationMap;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidator getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isPasswordRecoveryLoading;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect> loginFlowEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState> loginState;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> showBiometricPrompt;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> showMoreOptions;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> showPasswordCreatedBanner;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> validationError;

    @javax.inject.Inject
    public PasswordViewModel(com.paypal.oslo.feature.identity.passwordlogin.domain.usecase.PasswordUseCase passwordUseCase, com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator passwordRecoveryFlowCoordinator, com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MapToAuthOptionUseCase mapToAuthOptionUseCase, com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidator passwordValidator, com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler biometricLoginHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passwordUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passwordRecoveryFlowCoordinator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapToAuthOptionUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passwordValidator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biometricLoginHandler, "");
        this.Camera2StreamConfigurationMap = passwordUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = passwordRecoveryFlowCoordinator;
        this.getHighSpeedVideoFpsRanges = mapToAuthOptionUseCase;
        this.getHighSpeedVideoSizes = passwordValidator;
        this.getHighSpeedVideoFpsRangesFor = biometricLoginHandler;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.Idle.INSTANCE);
        this.getInputFormats = MutableStateFlow;
        this.loginState = MutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getHighSpeedVideoSizesFor = MutableStateFlow2;
        this.validationError = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow3 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.getOutputFormats = MutableStateFlow3;
        this.showPasswordCreatedBanner = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow3);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow4 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.getInputSizeshNQ4ISI = MutableStateFlow4;
        this.showMoreOptions = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow4);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.getOutputMinFrameDuration = MutableSharedFlow$default;
        this.loginFlowEffect = MutableSharedFlow$default;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow5 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.getOutputMinFrameDurationlomOqCM = MutableStateFlow5;
        this.showBiometricPrompt = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow5);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow6 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.getOutputStallDurationlomOqCM = MutableStateFlow6;
        this.isPasswordRecoveryLoading = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow6);
        this.biometricState = biometricLoginHandler.getState();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState> getLoginState() {
        return this.loginState;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Integer> getValidationError() {
        return this.validationError;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getShowPasswordCreatedBanner() {
        return this.showPasswordCreatedBanner;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getShowMoreOptions() {
        return this.showMoreOptions;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect> getLoginFlowEffect() {
        return this.loginFlowEffect;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getShowBiometricPrompt() {
        return this.showBiometricPrompt;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isPasswordRecoveryLoading() {
        return this.isPasswordRecoveryLoading;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState> getBiometricState() {
        return this.biometricState;
    }

    public final void attemptBiometricLogin(androidx.fragment.app.FragmentActivity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        this.getOutputMinFrameDurationlomOqCM.setValue(java.lang.Boolean.FALSE);
        com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.attempt$default(this.getHighSpeedVideoFpsRangesFor, activity, androidx.view.ViewModelKt.getViewModelScope(this), null, 4, null);
    }

    public final void resetBiometricState() {
        this.getHighSpeedVideoFpsRangesFor.reset();
    }

    public final void onBiometricError(java.lang.String errorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
        this.getHighSpeedVideoFpsRangesFor.reset();
        this.getInputFormats.setValue(new com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.Error(errorMessage, false));
    }

    public final void openMoreOptions() {
        this.getInputSizeshNQ4ISI.setValue(java.lang.Boolean.TRUE);
    }

    public final void dismissMoreOptions() {
        this.getInputSizeshNQ4ISI.setValue(java.lang.Boolean.FALSE);
    }

    public final void handleMoreOptionSelected(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType, java.lang.String publicCredential, java.lang.String displayName, java.lang.String requestId, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authIntent, "");
        dismissMoreOptions();
        int i = com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.WhenMappings.$EnumSwitchMapping$0[optionType.ordinal()];
        if (i == 1) {
            startPasswordRecovery$identity_prodRelease(publicCredential, requestId);
            return;
        }
        if (i == 2) {
            this.getOutputMinFrameDurationlomOqCM.setValue(java.lang.Boolean.TRUE);
            return;
        }
        com.paypal.oslo.feature.identity.login.domain.model.AuthOptions invoke = this.getHighSpeedVideoFpsRanges.invoke(optionType);
        if (invoke != null) {
            this.getOutputMinFrameDuration.tryEmit(new com.paypal.oslo.feature.identity.login.domain.model.LoginFlowEffect.AuthMethodRequired(kotlin.collections.CollectionsKt.listOf(invoke), publicCredential, displayName, requestId, invoke, authIntent));
        }
    }

    public final void login(java.lang.String email, java.lang.String password, java.lang.String requestId, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authIntent, "");
        if (!(this.getHighSpeedVideoSizes.validate(password) instanceof com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidationResult.Valid)) {
            this.getHighSpeedVideoSizesFor.setValue(java.lang.Integer.valueOf(com.paypal.oslo.feature.identity.R.string.feature_identity_invalid_password_error));
            this.getInputFormats.setValue(com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.Idle.INSTANCE);
        } else {
            this.getHighSpeedVideoSizesFor.setValue(null);
            this.getInputFormats.setValue(com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.Loading.INSTANCE);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel$login$1(this, email, password, requestId, authIntent, null), 3, null);
        }
    }

    public final void onPasswordChange(java.lang.String password) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "");
        this.getHighSpeedVideoSizesFor.setValue(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object performLogin$identity_prodRelease(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel$performLogin$1 passwordViewModel$performLogin$1;
        int i;
        com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent2;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel$performLogin$1) {
            passwordViewModel$performLogin$1 = (com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel$performLogin$1) continuation;
            if ((passwordViewModel$performLogin$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                passwordViewModel$performLogin$1.getInputFormats -= 2147483648;
                java.lang.Object obj = passwordViewModel$performLogin$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = passwordViewModel$performLogin$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.passwordlogin.domain.model.PasswordLoginRequest passwordLoginRequest = new com.paypal.oslo.feature.identity.passwordlogin.domain.model.PasswordLoginRequest(str3, str, str2, authIntent, false, 16, null);
                    com.paypal.oslo.feature.identity.passwordlogin.domain.usecase.PasswordUseCase passwordUseCase = this.Camera2StreamConfigurationMap;
                    passwordViewModel$performLogin$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    passwordViewModel$performLogin$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    passwordViewModel$performLogin$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    passwordViewModel$performLogin$1.getHighSpeedVideoFpsRanges = authIntent;
                    passwordViewModel$performLogin$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passwordLoginRequest);
                    passwordViewModel$performLogin$1.getInputFormats = 1;
                    obj = passwordUseCase.invoke(passwordLoginRequest, passwordViewModel$performLogin$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    authIntent2 = authIntent;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    authIntent2 = (com.paypal.oslo.feature.identity.login.domain.model.AuthIntent) passwordViewModel$performLogin$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (either.isLeft()) {
                    com.paypal.oslo.feature.identity.login.domain.model.LoginError loginError = (com.paypal.oslo.feature.identity.login.domain.model.LoginError) ((arrow.core.Either.Left) either).getValue();
                    boolean z = authIntent2 == com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.LINK_ACCOUNT;
                    if (z) {
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
                        kotlin.Pair[] pairArr = new kotlin.Pair[2];
                        pairArr[0] = kotlin.TuplesKt.to("stateType", "Error");
                        com.paypal.oslo.feature.identity.login.domain.model.AuthError authError = loginError instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthError ? (com.paypal.oslo.feature.identity.login.domain.model.AuthError) loginError : null;
                        java.lang.String msg = authError != null ? authError.getMsg() : null;
                        if (msg == null) {
                            msg = "";
                        }
                        pairArr[1] = kotlin.TuplesKt.to("apiError", msg);
                        com.paypal.android.logger.Logger.d$default(logger, "LINK_ACCOUNT flow failed", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                    }
                    kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState> mutableStateFlow = this.getInputFormats;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(loginError, "");
                    mutableStateFlow.setValue(new com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.Error(((com.paypal.oslo.feature.identity.login.domain.model.AuthError) loginError).getMsg(), z));
                }
                if (either.isRight()) {
                    com.paypal.oslo.feature.identity.login.domain.model.LoginResult loginResult = (com.paypal.oslo.feature.identity.login.domain.model.LoginResult) ((arrow.core.Either.Right) either).getValue();
                    if (loginResult instanceof com.paypal.oslo.feature.identity.login.domain.model.Success) {
                        com.paypal.oslo.feature.identity.login.domain.model.Success success = (com.paypal.oslo.feature.identity.login.domain.model.Success) loginResult;
                        this.getInputFormats.setValue(new com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.Success(success.getFirstPartyUserAccessToken(), success.getPostAuthOperations()));
                    } else {
                        if (!(loginResult instanceof com.paypal.oslo.feature.identity.login.domain.model.ChallengeRequired)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        this.getInputFormats.setValue(new com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.ChallengeRequired(((com.paypal.oslo.feature.identity.login.domain.model.ChallengeRequired) loginResult).getChallengeResult()));
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        passwordViewModel$performLogin$1 = new com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel$performLogin$1(this, continuation);
        java.lang.Object obj2 = passwordViewModel$performLogin$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = passwordViewModel$performLogin$1.getInputFormats;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either.isLeft()) {
        }
        if (either.isRight()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public final void resetState() {
        this.getInputFormats.setValue(com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.Idle.INSTANCE);
        this.getHighSpeedVideoSizesFor.setValue(null);
    }

    public final void dismissPasswordCreatedBanner() {
        this.getOutputFormats.setValue(java.lang.Boolean.FALSE);
    }

    public final void startPasswordRecovery$identity_prodRelease(java.lang.String publicCredential, java.lang.String requestId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
        if (this.getOutputStallDurationlomOqCM.getValue().booleanValue()) {
            return;
        }
        this.getOutputStallDurationlomOqCM.setValue(java.lang.Boolean.TRUE);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel$startPasswordRecovery$1(this, publicCredential, requestId, null), 3, null);
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordlogin/ui/PasswordViewModel$LoginState;", "", "<init>", "()V", "Idle", "Loading", "ChallengeRequired", "Success", "Error", "Lcom/paypal/oslo/feature/identity/passwordlogin/ui/PasswordViewModel$LoginState$ChallengeRequired;", "Lcom/paypal/oslo/feature/identity/passwordlogin/ui/PasswordViewModel$LoginState$Error;", "Lcom/paypal/oslo/feature/identity/passwordlogin/ui/PasswordViewModel$LoginState$Idle;", "Lcom/paypal/oslo/feature/identity/passwordlogin/ui/PasswordViewModel$LoginState$Loading;", "Lcom/paypal/oslo/feature/identity/passwordlogin/ui/PasswordViewModel$LoginState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class LoginState {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordlogin/ui/PasswordViewModel$LoginState$Idle;", "Lcom/paypal/oslo/feature/identity/passwordlogin/ui/PasswordViewModel$LoginState;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Idle extends com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.Idle INSTANCE = new com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.Idle();

            private Idle() {
                super(null);
            }
        }

        private LoginState() {
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordlogin/ui/PasswordViewModel$LoginState$Loading;", "Lcom/paypal/oslo/feature/identity/passwordlogin/ui/PasswordViewModel$LoginState;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Loading extends com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.Loading INSTANCE = new com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.Loading();

            private Loading() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordlogin/ui/PasswordViewModel$LoginState$ChallengeRequired;", "Lcom/paypal/oslo/feature/identity/passwordlogin/ui/PasswordViewModel$LoginState;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "challengeResult", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;)Lcom/paypal/oslo/feature/identity/passwordlogin/ui/PasswordViewModel$LoginState$ChallengeRequired;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "getChallengeResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ChallengeRequired extends com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ChallengeRequired(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeResult, "");
                this.challengeResult = challengeResult;
            }

            public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult getChallengeResult() {
                return this.challengeResult;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult = this.challengeResult;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ChallengeRequired(challengeResult=");
                sb.append(challengeResult);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.challengeResult.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.ChallengeRequired) && kotlin.jvm.internal.Intrinsics.areEqual(this.challengeResult, ((com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.ChallengeRequired) other).challengeResult);
            }

            public final com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.ChallengeRequired copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeResult, "");
                return new com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.ChallengeRequired(challengeResult);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult getChallengeResult() {
                return this.challengeResult;
            }

            public static /* synthetic */ com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.ChallengeRequired copy$default(com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.ChallengeRequired challengeRequired, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    challengeResult = challengeRequired.challengeResult;
                }
                return challengeRequired.copy(challengeResult);
            }
        }

        @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordlogin/ui/PasswordViewModel$LoginState$Success;", "Lcom/paypal/oslo/feature/identity/passwordlogin/ui/PasswordViewModel$LoginState;", "Lcom/paypal/oslo/feature/identity/foundation/model/Token;", "result", "", "Lcom/paypal/oslo/feature/identity/login/domain/model/PostAuthenticationOperation;", "postAuthOperations", "<init>", "(Lcom/paypal/oslo/feature/identity/foundation/model/Token;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/identity/foundation/model/Token;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/identity/foundation/model/Token;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/passwordlogin/ui/PasswordViewModel$LoginState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/foundation/model/Token;", "getResult", "Ljava/util/List;", "getPostAuthOperations"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Success extends com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState {
            public static final int $stable = 8;
            private final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> postAuthOperations;
            private final com.paypal.oslo.feature.identity.foundation.model.Token result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(com.paypal.oslo.feature.identity.foundation.model.Token token, java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> list) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                this.result = token;
                this.postAuthOperations = list;
            }

            public final com.paypal.oslo.feature.identity.foundation.model.Token getResult() {
                return this.result;
            }

            public /* synthetic */ Success(com.paypal.oslo.feature.identity.foundation.model.Token token, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(token, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
            }

            public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> getPostAuthOperations() {
                return this.postAuthOperations;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.identity.foundation.model.Token token = this.result;
                java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> list = this.postAuthOperations;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(result=");
                sb.append(token);
                sb.append(", postAuthOperations=");
                sb.append(list);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.result.hashCode() * 31) + this.postAuthOperations.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.Success)) {
                    return false;
                }
                com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.Success success = (com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.Success) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.result, success.result) && kotlin.jvm.internal.Intrinsics.areEqual(this.postAuthOperations, success.postAuthOperations);
            }

            public final com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.Success copy(com.paypal.oslo.feature.identity.foundation.model.Token result, java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> postAuthOperations) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postAuthOperations, "");
                return new com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.Success(result, postAuthOperations);
            }

            public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> component2() {
                return this.postAuthOperations;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.identity.foundation.model.Token getResult() {
                return this.result;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.Success copy$default(com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.Success success, com.paypal.oslo.feature.identity.foundation.model.Token token, java.util.List list, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    token = success.result;
                }
                if ((i & 2) != 0) {
                    list = success.postAuthOperations;
                }
                return success.copy(token, list);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordlogin/ui/PasswordViewModel$LoginState$Error;", "Lcom/paypal/oslo/feature/identity/passwordlogin/ui/PasswordViewModel$LoginState;", "", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE, "", "isLinkAccountError", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/identity/passwordlogin/ui/PasswordViewModel$LoginState$Error;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFailure", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Error extends com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState {
            public static final int $stable = 0;
            private final java.lang.String failure;
            private final boolean isLinkAccountError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(java.lang.String str, boolean z) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.failure = str;
                this.isLinkAccountError = z;
            }

            public /* synthetic */ Error(java.lang.String str, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? false : z);
            }

            public final java.lang.String getFailure() {
                return this.failure;
            }

            public final boolean isLinkAccountError() {
                return this.isLinkAccountError;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.failure;
                boolean z = this.isLinkAccountError;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(failure=");
                sb.append(str);
                sb.append(", isLinkAccountError=");
                sb.append(z);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.failure.hashCode() * 31) + java.lang.Boolean.hashCode(this.isLinkAccountError);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.Error)) {
                    return false;
                }
                com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.Error error = (com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.Error) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.failure, error.failure) && this.isLinkAccountError == error.isLinkAccountError;
            }

            public final com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.Error copy(java.lang.String failure, boolean isLinkAccountError) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failure, "");
                return new com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.Error(failure, isLinkAccountError);
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsLinkAccountError() {
                return this.isLinkAccountError;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getFailure() {
                return this.failure;
            }

            public static /* synthetic */ com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.Error copy$default(com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel.LoginState.Error error, java.lang.String str, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = error.failure;
                }
                if ((i & 2) != 0) {
                    z = error.isLinkAccountError;
                }
                return error.copy(str, z);
            }
        }

        public /* synthetic */ LoginState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.CREATE_NEW_PASSWORD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_BIOMETRIC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
