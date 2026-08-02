package com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "Loading", "Error", "Success", "Disabled", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiState$Disabled;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiState$Error;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiState$Initial;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiState$Loading;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PhoneConfirmationUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PhoneConfirmationUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiState$Initial;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Initial INSTANCE = new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Initial();

        public final int hashCode() {
            return 476668750;
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
            if (!(other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiState$Loading;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Loading INSTANCE = new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Loading();

        public final int hashCode() {
            return -1135022778;
        }

        private Loading() {
            super("Loading", null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiState$Error;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiState;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState {
        public static final int $stable = 0;
        private final java.lang.String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorMessage = str;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, ((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Error) other).errorMessage);
        }

        public final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Error copy(java.lang.String errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Error(errorMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Error copy$default(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Error error, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.errorMessage;
            }
            return error.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiState$Success;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiState;", "", "phoneNumber", "countryCode", "deviceId", "maskedPhoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPhoneNumber", "getCountryCode", "getDeviceId", "getMaskedPhoneNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState {
        public static final int $stable = 0;
        private final java.lang.String countryCode;
        private final java.lang.String deviceId;
        private final java.lang.String maskedPhoneNumber;
        private final java.lang.String phoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            super("Success", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.phoneNumber = str;
            this.countryCode = str2;
            this.deviceId = str3;
            this.maskedPhoneNumber = str4;
        }

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String getDeviceId() {
            return this.deviceId;
        }

        public final java.lang.String getMaskedPhoneNumber() {
            return this.maskedPhoneNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.phoneNumber;
            java.lang.String str2 = this.countryCode;
            java.lang.String str3 = this.deviceId;
            java.lang.String str4 = this.maskedPhoneNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(phoneNumber=");
            sb.append(str);
            sb.append(", countryCode=");
            sb.append(str2);
            sb.append(", deviceId=");
            sb.append(str3);
            sb.append(", maskedPhoneNumber=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.phoneNumber.hashCode() * 31) + this.countryCode.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + this.maskedPhoneNumber.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Success success = (com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, success.phoneNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, success.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceId, success.deviceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.maskedPhoneNumber, success.maskedPhoneNumber);
        }

        public final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Success copy(java.lang.String phoneNumber, java.lang.String countryCode, java.lang.String deviceId, java.lang.String maskedPhoneNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maskedPhoneNumber, "");
            return new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Success(phoneNumber, countryCode, deviceId, maskedPhoneNumber);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getMaskedPhoneNumber() {
            return this.maskedPhoneNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getDeviceId() {
            return this.deviceId;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Success copy$default(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Success success, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = success.phoneNumber;
            }
            if ((i & 2) != 0) {
                str2 = success.countryCode;
            }
            if ((i & 4) != 0) {
                str3 = success.deviceId;
            }
            if ((i & 8) != 0) {
                str4 = success.maskedPhoneNumber;
            }
            return success.copy(str, str2, str3, str4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiState$Disabled;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Disabled extends com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Disabled INSTANCE = new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Disabled();

        public final int hashCode() {
            return 1893707698;
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
            if (!(other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Disabled)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ PhoneConfirmationUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
