package com.paypal.oslo.feature.identity.phoneconfirmation.domain.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0006\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError;", "", "<init>", "()V", "", "getDisplayMessage", "()Ljava/lang/String;", "displayMessage", "Api", "Validation", "Business", "Unauthorized", "ServerError", "Unknown", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Api;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Business;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$ServerError;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Unauthorized;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Unknown;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Validation;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PhoneConfirmationError {
    public static final int $stable = 0;

    private PhoneConfirmationError() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Api;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError;", "error", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Api;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Api extends com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.shared.domain.model.ApiError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Api(com.paypal.oslo.feature.identity.shared.domain.model.ApiError apiError) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiError, "");
            this.error = apiError;
        }

        public final com.paypal.oslo.feature.identity.shared.domain.model.ApiError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.ApiError apiError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Api(error=");
            sb.append(apiError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Api) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Api) other).error);
        }

        public final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Api copy(com.paypal.oslo.feature.identity.shared.domain.model.ApiError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Api(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.ApiError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Api copy$default(com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Api api, com.paypal.oslo.feature.identity.shared.domain.model.ApiError apiError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                apiError = api.error;
            }
            return api.copy(apiError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Validation;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError;", "<init>", "()V", "InvalidPhoneContact", "InvalidOTPCode", "InvalidDeviceId", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Validation$InvalidDeviceId;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Validation$InvalidOTPCode;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Validation$InvalidPhoneContact;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Validation extends com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError {
        public static final int $stable = 0;

        private Validation() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Validation$InvalidPhoneContact;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Validation;", "", "reason", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Validation$InvalidPhoneContact;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InvalidPhoneContact extends com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation {
            public static final int $stable = 0;
            private final java.lang.String reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InvalidPhoneContact(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.reason = str;
            }

            public final java.lang.String getReason() {
                return this.reason;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.reason;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("InvalidPhoneContact(reason=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.reason.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation.InvalidPhoneContact) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation.InvalidPhoneContact) other).reason);
            }

            public final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation.InvalidPhoneContact copy(java.lang.String reason) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
                return new com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation.InvalidPhoneContact(reason);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getReason() {
                return this.reason;
            }

            public static /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation.InvalidPhoneContact copy$default(com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation.InvalidPhoneContact invalidPhoneContact, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = invalidPhoneContact.reason;
                }
                return invalidPhoneContact.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Validation$InvalidOTPCode;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Validation;", "", "expected", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Validation$InvalidOTPCode;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getExpected"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InvalidOTPCode extends com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation {
            public static final int $stable = 0;
            private final java.lang.String expected;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InvalidOTPCode(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.expected = str;
            }

            public final java.lang.String getExpected() {
                return this.expected;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.expected;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("InvalidOTPCode(expected=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.expected.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation.InvalidOTPCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.expected, ((com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation.InvalidOTPCode) other).expected);
            }

            public final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation.InvalidOTPCode copy(java.lang.String expected) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expected, "");
                return new com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation.InvalidOTPCode(expected);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getExpected() {
                return this.expected;
            }

            public static /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation.InvalidOTPCode copy$default(com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation.InvalidOTPCode invalidOTPCode, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = invalidOTPCode.expected;
                }
                return invalidOTPCode.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Validation$InvalidDeviceId;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Validation;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InvalidDeviceId extends com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation.InvalidDeviceId INSTANCE = new com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation.InvalidDeviceId();

            public final int hashCode() {
                return 2129903671;
            }

            private InvalidDeviceId() {
                super(null);
            }

            public final java.lang.String toString() {
                return "InvalidDeviceId";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation.InvalidDeviceId)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ Validation(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Business;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError;", "<init>", "()V", "CodeExpired", "TooManyAttempts", "PhoneNumberBlocked", "InvalidCode", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Business$CodeExpired;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Business$InvalidCode;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Business$PhoneNumberBlocked;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Business$TooManyAttempts;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Business extends com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError {
        public static final int $stable = 0;

        private Business() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Business$CodeExpired;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Business;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CodeExpired extends com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.CodeExpired INSTANCE = new com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.CodeExpired();

            public final int hashCode() {
                return 377577678;
            }

            private CodeExpired() {
                super(null);
            }

            public final java.lang.String toString() {
                return "CodeExpired";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.CodeExpired)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Business$TooManyAttempts;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Business;", "", "retryAfter", "<init>", "(Ljava/lang/Long;)V", "component1", "()Ljava/lang/Long;", "copy", "(Ljava/lang/Long;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Business$TooManyAttempts;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Long;", "getRetryAfter"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class TooManyAttempts extends com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business {
            public static final int $stable = 0;
            private final java.lang.Long retryAfter;

            public TooManyAttempts(java.lang.Long l) {
                super(null);
                this.retryAfter = l;
            }

            public /* synthetic */ TooManyAttempts(java.lang.Long l, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : l);
            }

            public final java.lang.Long getRetryAfter() {
                return this.retryAfter;
            }

            public final java.lang.String toString() {
                java.lang.Long l = this.retryAfter;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("TooManyAttempts(retryAfter=");
                sb.append(l);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.Long l = this.retryAfter;
                if (l == null) {
                    return 0;
                }
                return l.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.TooManyAttempts) && kotlin.jvm.internal.Intrinsics.areEqual(this.retryAfter, ((com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.TooManyAttempts) other).retryAfter);
            }

            public final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.TooManyAttempts copy(java.lang.Long retryAfter) {
                return new com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.TooManyAttempts(retryAfter);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.Long getRetryAfter() {
                return this.retryAfter;
            }

            public static /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.TooManyAttempts copy$default(com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.TooManyAttempts tooManyAttempts, java.lang.Long l, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    l = tooManyAttempts.retryAfter;
                }
                return tooManyAttempts.copy(l);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public TooManyAttempts() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Business$PhoneNumberBlocked;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Business;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PhoneNumberBlocked extends com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.PhoneNumberBlocked INSTANCE = new com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.PhoneNumberBlocked();

            public final int hashCode() {
                return -820810113;
            }

            private PhoneNumberBlocked() {
                super(null);
            }

            public final java.lang.String toString() {
                return "PhoneNumberBlocked";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.PhoneNumberBlocked)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Business$InvalidCode;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Business;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InvalidCode extends com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.InvalidCode INSTANCE = new com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.InvalidCode();

            public final int hashCode() {
                return 1637819610;
            }

            private InvalidCode() {
                super(null);
            }

            public final java.lang.String toString() {
                return "InvalidCode";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.InvalidCode)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ Business(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Unauthorized;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Unauthorized extends com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Unauthorized INSTANCE = new com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Unauthorized();

        public final int hashCode() {
            return 1357030040;
        }

        private Unauthorized() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Unauthorized";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Unauthorized)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$ServerError;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError;", "", "statusCode", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$ServerError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getStatusCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ServerError extends com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError {
        public static final int $stable = 0;
        private final int statusCode;

        public ServerError(int i) {
            super(null);
            this.statusCode = i;
        }

        public final int getStatusCode() {
            return this.statusCode;
        }

        public final java.lang.String toString() {
            int i = this.statusCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ServerError(statusCode=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.statusCode);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.ServerError) && this.statusCode == ((com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.ServerError) other).statusCode;
        }

        public final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.ServerError copy(int statusCode) {
            return new com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.ServerError(statusCode);
        }

        /* renamed from: component1, reason: from getter */
        public final int getStatusCode() {
            return this.statusCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.ServerError copy$default(com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.ServerError serverError, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = serverError.statusCode;
            }
            return serverError.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Unknown;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/model/PhoneConfirmationError$Unknown;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Unknown extends com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError {
        public static final int $stable = 0;
        private final java.lang.String message;

        public Unknown(java.lang.String str) {
            super(null);
            this.message = str;
        }

        public /* synthetic */ Unknown(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Unknown) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Unknown) other).message);
        }

        public final com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Unknown copy(java.lang.String message) {
            return new com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Unknown(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Unknown copy$default(com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Unknown unknown, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unknown.message;
            }
            return unknown.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Unknown() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    public final java.lang.String getDisplayMessage() {
        if (this instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Api) {
            com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Api api = (com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Api) this;
            com.paypal.oslo.feature.identity.shared.domain.model.ApiError error = api.getError();
            if (!(error instanceof com.paypal.oslo.feature.identity.shared.domain.model.ApiError.HttpError)) {
                if (error instanceof com.paypal.oslo.feature.identity.shared.domain.model.ApiError.NetworkError) {
                    return "Network connection error. Please check your internet connection";
                }
                if (error instanceof com.paypal.oslo.feature.identity.shared.domain.model.ApiError.UnknownError) {
                    return "An unexpected API error occurred";
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
            int code = ((com.paypal.oslo.feature.identity.shared.domain.model.ApiError.HttpError) api.getError()).getCode();
            java.lang.String body = ((com.paypal.oslo.feature.identity.shared.domain.model.ApiError.HttpError) api.getError()).getBody();
            if (body == null) {
                body = com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("API error (");
            sb.append(code);
            sb.append("): ");
            sb.append(body);
            return sb.toString();
        }
        if (this instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation.InvalidPhoneContact) {
            return "Invalid phone number: ".concat(java.lang.String.valueOf(((com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation.InvalidPhoneContact) this).getReason()));
        }
        if (this instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation.InvalidOTPCode) {
            return "Invalid verification code. ".concat(java.lang.String.valueOf(((com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation.InvalidOTPCode) this).getExpected()));
        }
        if (this instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Validation.InvalidDeviceId) {
            return "Invalid device identifier";
        }
        if (this instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.CodeExpired) {
            return "Verification code has expired. Please request a new code";
        }
        if (this instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.TooManyAttempts) {
            java.lang.Long retryAfter = ((com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.TooManyAttempts) this).getRetryAfter();
            if (retryAfter != null) {
                long longValue = retryAfter.longValue() / 1000;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Too many attempts. Please try again in ");
                sb2.append(longValue);
                sb2.append(" seconds");
                java.lang.String obj = sb2.toString();
                return obj != null ? obj : "Too many attempts. Please try again later";
            }
            return "Too many attempts. Please try again later";
        }
        if (this instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.PhoneNumberBlocked) {
            return "This phone number is temporarily blocked";
        }
        if (this instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Business.InvalidCode) {
            return "Invalid verification code. Please try again";
        }
        if (this instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Unauthorized) {
            return "Authentication failed";
        }
        if (!(this instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.ServerError)) {
            if (!(this instanceof com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Unknown)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            java.lang.String message = ((com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.Unknown) this).getMessage();
            return message == null ? "An unexpected error occurred" : message;
        }
        int statusCode = ((com.paypal.oslo.feature.identity.phoneconfirmation.domain.model.PhoneConfirmationError.ServerError) this).getStatusCode();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Server error (");
        sb3.append(statusCode);
        sb3.append("). Please try again later");
        return sb3.toString();
    }

    public /* synthetic */ PhoneConfirmationError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
