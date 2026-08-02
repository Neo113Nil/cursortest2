package com.paypal.oslo.feature.taptopay.ui.setup.verification.otp;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u0003J\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00188\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/verification/otp/EnterOtpScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "", "digit", "", "onDigitInput", "(Ljava/lang/String;)V", "onBackspace", "clearCode", "resetState", "", "validateAndPrepareSubmit", "()Z", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/OTPErrorCode;", "errorCode", "setErrorFromServer", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/OTPErrorCode;)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/taptopay/ui/setup/verification/otp/EnterOtpUiState;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class EnterOtpScreenViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.taptopay.ui.setup.verification.otp.EnterOtpUiState> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.taptopay.ui.setup.verification.otp.EnterOtpUiState> uiState;

    @javax.inject.Inject
    public EnterOtpScreenViewModel() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.taptopay.ui.setup.verification.otp.EnterOtpUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.taptopay.ui.setup.verification.otp.EnterOtpUiState(null, 0, null, 7, null));
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.taptopay.ui.setup.verification.otp.EnterOtpUiState> getUiState() {
        return this.uiState;
    }

    public final void onDigitInput(java.lang.String digit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digit, "");
        if (this.getHighResolutionOutputSizeshNQ4ISI.getValue().getOtpCode().length() < 6) {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.taptopay.ui.setup.verification.otp.EnterOtpUiState> mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.taptopay.ui.setup.verification.otp.EnterOtpUiState value = mutableStateFlow.getValue();
            java.lang.String otpCode = this.getHighResolutionOutputSizeshNQ4ISI.getValue().getOtpCode();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(otpCode);
            sb.append(digit);
            mutableStateFlow.setValue(value.copy(sb.toString(), -1, null));
        }
    }

    public final void onBackspace() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.taptopay.ui.setup.verification.otp.EnterOtpUiState> mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI;
        mutableStateFlow.setValue(mutableStateFlow.getValue().copy(kotlin.text.StringsKt.dropLast(this.getHighResolutionOutputSizeshNQ4ISI.getValue().getOtpCode(), 1), -1, null));
    }

    public final void clearCode() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.taptopay.ui.setup.verification.otp.EnterOtpUiState> mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI;
        mutableStateFlow.setValue(mutableStateFlow.getValue().copy("", -1, null));
    }

    public final void resetState() {
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(new com.paypal.oslo.feature.taptopay.ui.setup.verification.otp.EnterOtpUiState(null, 0, null, 7, null));
    }

    public final boolean validateAndPrepareSubmit() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getValue().getOtpCode().length() == 0) {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.taptopay.ui.setup.verification.otp.EnterOtpUiState> mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI;
            mutableStateFlow.setValue(com.paypal.oslo.feature.taptopay.ui.setup.verification.otp.EnterOtpUiState.copy$default(mutableStateFlow.getValue(), null, com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_error_empty_code, null, 5, null));
            return false;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI.getValue().isOtpValid()) {
            return true;
        }
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.taptopay.ui.setup.verification.otp.EnterOtpUiState> mutableStateFlow2 = this.getHighResolutionOutputSizeshNQ4ISI;
        mutableStateFlow2.setValue(com.paypal.oslo.feature.taptopay.ui.setup.verification.otp.EnterOtpUiState.copy$default(mutableStateFlow2.getValue(), null, com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_otp_error_code_length, null, 5, null));
        return false;
    }

    public final void setErrorFromServer(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode errorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.taptopay.ui.setup.verification.otp.EnterOtpUiState> mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI;
        mutableStateFlow.setValue(com.paypal.oslo.feature.taptopay.ui.setup.verification.otp.EnterOtpUiState.copy$default(mutableStateFlow.getValue(), null, com.paypal.oslo.feature.taptopay.ui.setup.verification.otp.EnterOtpUiStateKt.toErrorStringRes(errorCode), errorCode, 1, null));
    }
}
