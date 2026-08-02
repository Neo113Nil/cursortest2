package com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "Loading", "Error", "CodeResent", "Success", "Disabled", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiState$CodeResent;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiState$Disabled;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiState$Error;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiState$Initial;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiState$Loading;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class OTPVerificationUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private OTPVerificationUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiState$Initial;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiState;", "", "otpCode", "maskedPhoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiState$Initial;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getOtpCode", "getMaskedPhoneNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState {
        public static final int $stable = 0;
        private final java.lang.String maskedPhoneNumber;
        private final java.lang.String otpCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initial(java.lang.String str, java.lang.String str2) {
            super("Initial", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.otpCode = str;
            this.maskedPhoneNumber = str2;
        }

        public /* synthetic */ Initial(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, str2);
        }

        public final java.lang.String getOtpCode() {
            return this.otpCode;
        }

        public final java.lang.String getMaskedPhoneNumber() {
            return this.maskedPhoneNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.otpCode;
            java.lang.String str2 = this.maskedPhoneNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initial(otpCode=");
            sb.append(str);
            sb.append(", maskedPhoneNumber=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.otpCode.hashCode() * 31) + this.maskedPhoneNumber.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Initial)) {
                return false;
            }
            com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Initial initial = (com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Initial) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.otpCode, initial.otpCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.maskedPhoneNumber, initial.maskedPhoneNumber);
        }

        public final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Initial copy(java.lang.String otpCode, java.lang.String maskedPhoneNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otpCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maskedPhoneNumber, "");
            return new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Initial(otpCode, maskedPhoneNumber);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMaskedPhoneNumber() {
            return this.maskedPhoneNumber;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getOtpCode() {
            return this.otpCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Initial copy$default(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Initial initial, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = initial.otpCode;
            }
            if ((i & 2) != 0) {
                str2 = initial.maskedPhoneNumber;
            }
            return initial.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u0006\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiState$Loading;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiState;", "", "otpCode", "maskedPhoneNumber", "", "isResending", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiState$Loading;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getOtpCode", "getMaskedPhoneNumber", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState {
        public static final int $stable = 0;
        private final boolean isResending;
        private final java.lang.String maskedPhoneNumber;
        private final java.lang.String otpCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(java.lang.String str, java.lang.String str2, boolean z) {
            super("Loading", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.otpCode = str;
            this.maskedPhoneNumber = str2;
            this.isResending = z;
        }

        public /* synthetic */ Loading(java.lang.String str, java.lang.String str2, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? false : z);
        }

        public final java.lang.String getOtpCode() {
            return this.otpCode;
        }

        public final java.lang.String getMaskedPhoneNumber() {
            return this.maskedPhoneNumber;
        }

        public final boolean isResending() {
            return this.isResending;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.otpCode;
            java.lang.String str2 = this.maskedPhoneNumber;
            boolean z = this.isResending;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(otpCode=");
            sb.append(str);
            sb.append(", maskedPhoneNumber=");
            sb.append(str2);
            sb.append(", isResending=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.otpCode.hashCode() * 31) + this.maskedPhoneNumber.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isResending);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Loading)) {
                return false;
            }
            com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Loading loading = (com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Loading) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.otpCode, loading.otpCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.maskedPhoneNumber, loading.maskedPhoneNumber) && this.isResending == loading.isResending;
        }

        public final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Loading copy(java.lang.String otpCode, java.lang.String maskedPhoneNumber, boolean isResending) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otpCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maskedPhoneNumber, "");
            return new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Loading(otpCode, maskedPhoneNumber, isResending);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsResending() {
            return this.isResending;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMaskedPhoneNumber() {
            return this.maskedPhoneNumber;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getOtpCode() {
            return this.otpCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Loading copy$default(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Loading loading, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = loading.otpCode;
            }
            if ((i & 2) != 0) {
                str2 = loading.maskedPhoneNumber;
            }
            if ((i & 4) != 0) {
                z = loading.isResending;
            }
            return loading.copy(str, str2, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiState$Error;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiState;", "", "otpCode", "maskedPhoneNumber", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getOtpCode", "getMaskedPhoneNumber", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState {
        public static final int $stable = 0;
        private final java.lang.String errorMessage;
        private final java.lang.String maskedPhoneNumber;
        private final java.lang.String otpCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.otpCode = str;
            this.maskedPhoneNumber = str2;
            this.errorMessage = str3;
        }

        public final java.lang.String getOtpCode() {
            return this.otpCode;
        }

        public final java.lang.String getMaskedPhoneNumber() {
            return this.maskedPhoneNumber;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.otpCode;
            java.lang.String str2 = this.maskedPhoneNumber;
            java.lang.String str3 = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(otpCode=");
            sb.append(str);
            sb.append(", maskedPhoneNumber=");
            sb.append(str2);
            sb.append(", errorMessage=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.otpCode.hashCode() * 31) + this.maskedPhoneNumber.hashCode()) * 31) + this.errorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Error error = (com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.otpCode, error.otpCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.maskedPhoneNumber, error.maskedPhoneNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, error.errorMessage);
        }

        public final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Error copy(java.lang.String otpCode, java.lang.String maskedPhoneNumber, java.lang.String errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otpCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maskedPhoneNumber, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Error(otpCode, maskedPhoneNumber, errorMessage);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMaskedPhoneNumber() {
            return this.maskedPhoneNumber;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getOtpCode() {
            return this.otpCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Error copy$default(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Error error, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.otpCode;
            }
            if ((i & 2) != 0) {
                str2 = error.maskedPhoneNumber;
            }
            if ((i & 4) != 0) {
                str3 = error.errorMessage;
            }
            return error.copy(str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiState$CodeResent;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiState;", "", "otpCode", "maskedPhoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiState$CodeResent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getOtpCode", "getMaskedPhoneNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CodeResent extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState {
        public static final int $stable = 0;
        private final java.lang.String maskedPhoneNumber;
        private final java.lang.String otpCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CodeResent(java.lang.String str, java.lang.String str2) {
            super("CodeResent", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.otpCode = str;
            this.maskedPhoneNumber = str2;
        }

        public /* synthetic */ CodeResent(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, str2);
        }

        public final java.lang.String getOtpCode() {
            return this.otpCode;
        }

        public final java.lang.String getMaskedPhoneNumber() {
            return this.maskedPhoneNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.otpCode;
            java.lang.String str2 = this.maskedPhoneNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CodeResent(otpCode=");
            sb.append(str);
            sb.append(", maskedPhoneNumber=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.otpCode.hashCode() * 31) + this.maskedPhoneNumber.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.CodeResent)) {
                return false;
            }
            com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.CodeResent codeResent = (com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.CodeResent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.otpCode, codeResent.otpCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.maskedPhoneNumber, codeResent.maskedPhoneNumber);
        }

        public final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.CodeResent copy(java.lang.String otpCode, java.lang.String maskedPhoneNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otpCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maskedPhoneNumber, "");
            return new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.CodeResent(otpCode, maskedPhoneNumber);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMaskedPhoneNumber() {
            return this.maskedPhoneNumber;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getOtpCode() {
            return this.otpCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.CodeResent copy$default(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.CodeResent codeResent, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = codeResent.otpCode;
            }
            if ((i & 2) != 0) {
                str2 = codeResent.maskedPhoneNumber;
            }
            return codeResent.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiState$Success;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiState;", "", "phoneNumber", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPhoneNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState {
        public static final int $stable = 0;
        private final java.lang.String phoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(java.lang.String str) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.phoneNumber = str;
        }

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.phoneNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(phoneNumber=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.phoneNumber.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Success) other).phoneNumber);
        }

        public final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Success copy(java.lang.String phoneNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
            return new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Success(phoneNumber);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Success copy$default(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Success success, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = success.phoneNumber;
            }
            return success.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiState$Disabled;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/OTPVerificationUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Disabled extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Disabled INSTANCE = new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Disabled();

        public final int hashCode() {
            return 751343189;
        }

        private Disabled() {
            super("Disabled", null);
        }

        public final java.lang.String toString() {
            return "Disabled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationUiState.Disabled)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ OTPVerificationUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
