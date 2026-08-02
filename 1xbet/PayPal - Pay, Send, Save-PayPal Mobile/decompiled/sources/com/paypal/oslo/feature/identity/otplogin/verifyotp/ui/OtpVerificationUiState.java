package com.paypal.oslo.feature.identity.otplogin.verifyotp.ui;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "VerifyingOtp", "RequestingNewOtp", "InputReady", "Error", "Success", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiState$Error;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiState$Initial;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiState$InputReady;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiState$RequestingNewOtp;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiState$Success;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiState$VerifyingOtp;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class OtpVerificationUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private OtpVerificationUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiState$Initial;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.Initial INSTANCE = new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.Initial();

        public final int hashCode() {
            return -1471094150;
        }

        private Initial() {
            super("Initial", null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiState$VerifyingOtp;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiState;", "", "phoneNumber", "email", "otpInput", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiState$VerifyingOtp;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPhoneNumber", "getEmail", "getOtpInput"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class VerifyingOtp extends com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState {
        public static final int $stable = 0;
        private final java.lang.String email;
        private final java.lang.String otpInput;
        private final java.lang.String phoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerifyingOtp(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super("VerifyingOtp", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.phoneNumber = str;
            this.email = str2;
            this.otpInput = str3;
        }

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final java.lang.String getEmail() {
            return this.email;
        }

        public final java.lang.String getOtpInput() {
            return this.otpInput;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.phoneNumber;
            java.lang.String str2 = this.email;
            java.lang.String str3 = this.otpInput;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("VerifyingOtp(phoneNumber=");
            sb.append(str);
            sb.append(", email=");
            sb.append(str2);
            sb.append(", otpInput=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.phoneNumber.hashCode() * 31) + this.email.hashCode()) * 31) + this.otpInput.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.VerifyingOtp)) {
                return false;
            }
            com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.VerifyingOtp verifyingOtp = (com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.VerifyingOtp) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, verifyingOtp.phoneNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, verifyingOtp.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.otpInput, verifyingOtp.otpInput);
        }

        public final com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.VerifyingOtp copy(java.lang.String phoneNumber, java.lang.String email, java.lang.String otpInput) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otpInput, "");
            return new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.VerifyingOtp(phoneNumber, email, otpInput);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getOtpInput() {
            return this.otpInput;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getEmail() {
            return this.email;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.VerifyingOtp copy$default(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.VerifyingOtp verifyingOtp, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = verifyingOtp.phoneNumber;
            }
            if ((i & 2) != 0) {
                str2 = verifyingOtp.email;
            }
            if ((i & 4) != 0) {
                str3 = verifyingOtp.otpInput;
            }
            return verifyingOtp.copy(str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiState$RequestingNewOtp;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiState;", "", "phoneNumber", "email", "otpInput", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiState$RequestingNewOtp;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPhoneNumber", "getEmail", "getOtpInput"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequestingNewOtp extends com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState {
        public static final int $stable = 0;
        private final java.lang.String email;
        private final java.lang.String otpInput;
        private final java.lang.String phoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestingNewOtp(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super("RequestingNewOtp", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.phoneNumber = str;
            this.email = str2;
            this.otpInput = str3;
        }

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final java.lang.String getEmail() {
            return this.email;
        }

        public final java.lang.String getOtpInput() {
            return this.otpInput;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.phoneNumber;
            java.lang.String str2 = this.email;
            java.lang.String str3 = this.otpInput;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestingNewOtp(phoneNumber=");
            sb.append(str);
            sb.append(", email=");
            sb.append(str2);
            sb.append(", otpInput=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.phoneNumber.hashCode() * 31) + this.email.hashCode()) * 31) + this.otpInput.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.RequestingNewOtp)) {
                return false;
            }
            com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.RequestingNewOtp requestingNewOtp = (com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.RequestingNewOtp) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, requestingNewOtp.phoneNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, requestingNewOtp.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.otpInput, requestingNewOtp.otpInput);
        }

        public final com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.RequestingNewOtp copy(java.lang.String phoneNumber, java.lang.String email, java.lang.String otpInput) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otpInput, "");
            return new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.RequestingNewOtp(phoneNumber, email, otpInput);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getOtpInput() {
            return this.otpInput;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getEmail() {
            return this.email;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.RequestingNewOtp copy$default(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.RequestingNewOtp requestingNewOtp, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = requestingNewOtp.phoneNumber;
            }
            if ((i & 2) != 0) {
                str2 = requestingNewOtp.email;
            }
            if ((i & 4) != 0) {
                str3 = requestingNewOtp.otpInput;
            }
            return requestingNewOtp.copy(str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiState$InputReady;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiState;", "", "phoneNumber", "email", "otpInput", "", "autoSmsDetectionEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiState$InputReady;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPhoneNumber", "getEmail", "getOtpInput", "Z", "getAutoSmsDetectionEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InputReady extends com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState {
        public static final int $stable = 0;
        private final boolean autoSmsDetectionEnabled;
        private final java.lang.String email;
        private final java.lang.String otpInput;
        private final java.lang.String phoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InputReady(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
            super("InputReady", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.phoneNumber = str;
            this.email = str2;
            this.otpInput = str3;
            this.autoSmsDetectionEnabled = z;
        }

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final java.lang.String getEmail() {
            return this.email;
        }

        public final java.lang.String getOtpInput() {
            return this.otpInput;
        }

        public final boolean getAutoSmsDetectionEnabled() {
            return this.autoSmsDetectionEnabled;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.phoneNumber;
            java.lang.String str2 = this.email;
            java.lang.String str3 = this.otpInput;
            boolean z = this.autoSmsDetectionEnabled;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InputReady(phoneNumber=");
            sb.append(str);
            sb.append(", email=");
            sb.append(str2);
            sb.append(", otpInput=");
            sb.append(str3);
            sb.append(", autoSmsDetectionEnabled=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.phoneNumber.hashCode() * 31) + this.email.hashCode()) * 31) + this.otpInput.hashCode()) * 31) + java.lang.Boolean.hashCode(this.autoSmsDetectionEnabled);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.InputReady)) {
                return false;
            }
            com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.InputReady inputReady = (com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.InputReady) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, inputReady.phoneNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, inputReady.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.otpInput, inputReady.otpInput) && this.autoSmsDetectionEnabled == inputReady.autoSmsDetectionEnabled;
        }

        public final com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.InputReady copy(java.lang.String phoneNumber, java.lang.String email, java.lang.String otpInput, boolean autoSmsDetectionEnabled) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otpInput, "");
            return new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.InputReady(phoneNumber, email, otpInput, autoSmsDetectionEnabled);
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getAutoSmsDetectionEnabled() {
            return this.autoSmsDetectionEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getOtpInput() {
            return this.otpInput;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getEmail() {
            return this.email;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.InputReady copy$default(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.InputReady inputReady, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = inputReady.phoneNumber;
            }
            if ((i & 2) != 0) {
                str2 = inputReady.email;
            }
            if ((i & 4) != 0) {
                str3 = inputReady.otpInput;
            }
            if ((i & 8) != 0) {
                z = inputReady.autoSmsDetectionEnabled;
            }
            return inputReady.copy(str, str2, str3, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\b\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiState$Error;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiState;", "", "message", "phoneNumber", "email", "otpInput", "", "isExpiredError", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiState$Error;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "getPhoneNumber", "getEmail", "getOtpInput", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState {
        public static final int $stable = 0;
        private final java.lang.String email;
        private final boolean isExpiredError;
        private final java.lang.String message;
        private final java.lang.String otpInput;
        private final java.lang.String phoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.message = str;
            this.phoneNumber = str2;
            this.email = str3;
            this.otpInput = str4;
            this.isExpiredError = z;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final java.lang.String getEmail() {
            return this.email;
        }

        public final java.lang.String getOtpInput() {
            return this.otpInput;
        }

        public final boolean isExpiredError() {
            return this.isExpiredError;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.String str2 = this.phoneNumber;
            java.lang.String str3 = this.email;
            java.lang.String str4 = this.otpInput;
            boolean z = this.isExpiredError;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(message=");
            sb.append(str);
            sb.append(", phoneNumber=");
            sb.append(str2);
            sb.append(", email=");
            sb.append(str3);
            sb.append(", otpInput=");
            sb.append(str4);
            sb.append(", isExpiredError=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((this.message.hashCode() * 31) + this.phoneNumber.hashCode()) * 31) + this.email.hashCode()) * 31) + this.otpInput.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isExpiredError);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.Error error = (com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, error.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, error.phoneNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, error.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.otpInput, error.otpInput) && this.isExpiredError == error.isExpiredError;
        }

        public final com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.Error copy(java.lang.String message, java.lang.String phoneNumber, java.lang.String email, java.lang.String otpInput, boolean isExpiredError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otpInput, "");
            return new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.Error(message, phoneNumber, email, otpInput, isExpiredError);
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsExpiredError() {
            return this.isExpiredError;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getOtpInput() {
            return this.otpInput;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getEmail() {
            return this.email;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.Error copy$default(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.Error error, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            if ((i & 2) != 0) {
                str2 = error.phoneNumber;
            }
            java.lang.String str5 = str2;
            if ((i & 4) != 0) {
                str3 = error.email;
            }
            java.lang.String str6 = str3;
            if ((i & 8) != 0) {
                str4 = error.otpInput;
            }
            java.lang.String str7 = str4;
            if ((i & 16) != 0) {
                z = error.isExpiredError;
            }
            return error.copy(str, str5, str6, str7, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiState$Success;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.Success INSTANCE = new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.Success();

        public final int hashCode() {
            return -991638727;
        }

        private Success() {
            super("Success", null);
        }

        public final java.lang.String toString() {
            return "Success";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationUiState.Success)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ OtpVerificationUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
