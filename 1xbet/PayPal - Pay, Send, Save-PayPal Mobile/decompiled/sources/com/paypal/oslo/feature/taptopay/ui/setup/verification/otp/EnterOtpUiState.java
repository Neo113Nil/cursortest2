package com.paypal.oslo.feature.taptopay.ui.setup.verification.otp;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001#B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u0011\u0010\u001e\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b \u0010\u001fR\u0011\u0010!\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0011\u0010\"\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\"\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/verification/otp/EnterOtpUiState;", "", "", "otpCode", "", "errorTextRes", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/OTPErrorCode;", "serverErrorCode", "<init>", "(Ljava/lang/String;ILcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/OTPErrorCode;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/OTPErrorCode;", "copy", "(Ljava/lang/String;ILcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/OTPErrorCode;)Lcom/paypal/oslo/feature/taptopay/ui/setup/verification/otp/EnterOtpUiState;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getOtpCode", com.visa.cbp.getEncExpo.warmup, "getErrorTextRes", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/OTPErrorCode;", "getServerErrorCode", "isOtpValid", "()Z", "isContinueEnabled", "isContinueVisible", "isGetNewCodeVisible", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class EnterOtpUiState {
    public static final int $stable = 0;
    public static final int MAX_OTP_LENGTH = 6;
    public static final int NO_ERROR = -1;
    private final int errorTextRes;
    private final java.lang.String otpCode;
    private final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode serverErrorCode;

    public EnterOtpUiState(java.lang.String str, int i, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode oTPErrorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.otpCode = str;
        this.errorTextRes = i;
        this.serverErrorCode = oTPErrorCode;
    }

    public /* synthetic */ EnterOtpUiState(java.lang.String str, int i, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode oTPErrorCode, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? null : oTPErrorCode);
    }

    public final java.lang.String getOtpCode() {
        return this.otpCode;
    }

    public final int getErrorTextRes() {
        return this.errorTextRes;
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode getServerErrorCode() {
        return this.serverErrorCode;
    }

    public final boolean isOtpValid() {
        return this.otpCode.length() == 6;
    }

    public final boolean isContinueEnabled() {
        return this.otpCode.length() > 0;
    }

    public final boolean isContinueVisible() {
        return this.serverErrorCode != com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode.INCORRECT_OTP_MAX_TRY_EXCEEDED;
    }

    public final boolean isGetNewCodeVisible() {
        return this.serverErrorCode != com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode.INCORRECT_OTP_MAX_TRY_EXCEEDED;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.otpCode;
        int i = this.errorTextRes;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode oTPErrorCode = this.serverErrorCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EnterOtpUiState(otpCode=");
        sb.append(str);
        sb.append(", errorTextRes=");
        sb.append(i);
        sb.append(", serverErrorCode=");
        sb.append(oTPErrorCode);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.otpCode.hashCode();
        int hashCode2 = java.lang.Integer.hashCode(this.errorTextRes);
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode oTPErrorCode = this.serverErrorCode;
        return (((hashCode * 31) + hashCode2) * 31) + (oTPErrorCode == null ? 0 : oTPErrorCode.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.verification.otp.EnterOtpUiState)) {
            return false;
        }
        com.paypal.oslo.feature.taptopay.ui.setup.verification.otp.EnterOtpUiState enterOtpUiState = (com.paypal.oslo.feature.taptopay.ui.setup.verification.otp.EnterOtpUiState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.otpCode, enterOtpUiState.otpCode) && this.errorTextRes == enterOtpUiState.errorTextRes && this.serverErrorCode == enterOtpUiState.serverErrorCode;
    }

    public final com.paypal.oslo.feature.taptopay.ui.setup.verification.otp.EnterOtpUiState copy(java.lang.String otpCode, int errorTextRes, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode serverErrorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otpCode, "");
        return new com.paypal.oslo.feature.taptopay.ui.setup.verification.otp.EnterOtpUiState(otpCode, errorTextRes, serverErrorCode);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode getServerErrorCode() {
        return this.serverErrorCode;
    }

    /* renamed from: component2, reason: from getter */
    public final int getErrorTextRes() {
        return this.errorTextRes;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getOtpCode() {
        return this.otpCode;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.verification.otp.EnterOtpUiState copy$default(com.paypal.oslo.feature.taptopay.ui.setup.verification.otp.EnterOtpUiState enterOtpUiState, java.lang.String str, int i, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode oTPErrorCode, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = enterOtpUiState.otpCode;
        }
        if ((i2 & 2) != 0) {
            i = enterOtpUiState.errorTextRes;
        }
        if ((i2 & 4) != 0) {
            oTPErrorCode = enterOtpUiState.serverErrorCode;
        }
        return enterOtpUiState.copy(str, i, oTPErrorCode);
    }

    public EnterOtpUiState() {
        this(null, 0, null, 7, null);
    }
}
