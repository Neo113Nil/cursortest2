package com.paypal.oslo.feature.onboarding.signup.phone.ui.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/phone/ui/model/PhoneOtpVerificationState;", "", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/OtpErrorDisplay;", "errorDisplay", "", "isLoading", "<init>", "(Lcom/paypal/oslo/feature/onboarding/signup/ui/model/OtpErrorDisplay;Z)V", "component1", "()Lcom/paypal/oslo/feature/onboarding/signup/ui/model/OtpErrorDisplay;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/onboarding/signup/ui/model/OtpErrorDisplay;Z)Lcom/paypal/oslo/feature/onboarding/signup/phone/ui/model/PhoneOtpVerificationState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/OtpErrorDisplay;", "getErrorDisplay", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PhoneOtpVerificationState {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay errorDisplay;
    private final boolean isLoading;

    public PhoneOtpVerificationState(com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay otpErrorDisplay, boolean z) {
        this.errorDisplay = otpErrorDisplay;
        this.isLoading = z;
    }

    public /* synthetic */ PhoneOtpVerificationState(com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay otpErrorDisplay, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : otpErrorDisplay, (i & 2) != 0 ? true : z);
    }

    public final com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay getErrorDisplay() {
        return this.errorDisplay;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay otpErrorDisplay = this.errorDisplay;
        boolean z = this.isLoading;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PhoneOtpVerificationState(errorDisplay=");
        sb.append(otpErrorDisplay);
        sb.append(", isLoading=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay otpErrorDisplay = this.errorDisplay;
        return ((otpErrorDisplay == null ? 0 : otpErrorDisplay.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isLoading);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationState)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationState phoneOtpVerificationState = (com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.errorDisplay, phoneOtpVerificationState.errorDisplay) && this.isLoading == phoneOtpVerificationState.isLoading;
    }

    public final com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationState copy(com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay errorDisplay, boolean isLoading) {
        return new com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationState(errorDisplay, isLoading);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay getErrorDisplay() {
        return this.errorDisplay;
    }

    public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationState copy$default(com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationState phoneOtpVerificationState, com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay otpErrorDisplay, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            otpErrorDisplay = phoneOtpVerificationState.errorDisplay;
        }
        if ((i & 2) != 0) {
            z = phoneOtpVerificationState.isLoading;
        }
        return phoneOtpVerificationState.copy(otpErrorDisplay, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PhoneOtpVerificationState() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }
}
