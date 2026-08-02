package com.paypal.oslo.feature.bnplacquisition.domain.model.error;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError;", "", "<init>", "()V", "Network", "GraphQL", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$Network;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class BNPLError {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$Network;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError;", "<init>", "()V", "NoConnection", "HttpError", "UnknownNetworkError", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$Network$HttpError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$Network$NoConnection;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$Network$UnknownNetworkError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Network extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$Network$NoConnection;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$Network;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$Network$NoConnection;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NoConnection extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.Network {
            public static final int $stable = 8;
            private final java.lang.Throwable cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NoConnection(java.lang.Throwable th) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
                this.cause = th;
            }

            public final java.lang.Throwable getCause() {
                return this.cause;
            }

            public final java.lang.String toString() {
                java.lang.Throwable th = this.cause;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NoConnection(cause=");
                sb.append(th);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.cause.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.Network.NoConnection) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, ((com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.Network.NoConnection) other).cause);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.Network.NoConnection copy(java.lang.Throwable cause) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.Network.NoConnection(cause);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.Throwable getCause() {
                return this.cause;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.Network.NoConnection copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.Network.NoConnection noConnection, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    th = noConnection.cause;
                }
                return noConnection.copy(th);
            }
        }

        private Network() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\nJ\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$Network$HttpError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$Network;", "", "statusCode", "", "message", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "copy", "(ILjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$Network$HttpError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getStatusCode", "Ljava/lang/String;", "getMessage", "getBody"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class HttpError extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.Network {
            public static final int $stable = 0;
            private final java.lang.String body;
            private final java.lang.String message;
            private final int statusCode;

            public HttpError(int i, java.lang.String str, java.lang.String str2) {
                super(null);
                this.statusCode = i;
                this.message = str;
                this.body = str2;
            }

            public /* synthetic */ HttpError(int i, java.lang.String str, java.lang.String str2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(i, str, (i2 & 4) != 0 ? null : str2);
            }

            public final int getStatusCode() {
                return this.statusCode;
            }

            public final java.lang.String getMessage() {
                return this.message;
            }

            public final java.lang.String getBody() {
                return this.body;
            }

            public final java.lang.String toString() {
                int i = this.statusCode;
                java.lang.String str = this.message;
                java.lang.String str2 = this.body;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("HttpError(statusCode=");
                sb.append(i);
                sb.append(", message=");
                sb.append(str);
                sb.append(", body=");
                sb.append(str2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = java.lang.Integer.hashCode(this.statusCode);
                java.lang.String str = this.message;
                int hashCode2 = str == null ? 0 : str.hashCode();
                java.lang.String str2 = this.body;
                return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.Network.HttpError)) {
                    return false;
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.Network.HttpError httpError = (com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.Network.HttpError) other;
                return this.statusCode == httpError.statusCode && kotlin.jvm.internal.Intrinsics.areEqual(this.message, httpError.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.body, httpError.body);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.Network.HttpError copy(int statusCode, java.lang.String message, java.lang.String body) {
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.Network.HttpError(statusCode, message, body);
            }

            /* renamed from: component3, reason: from getter */
            public final java.lang.String getBody() {
                return this.body;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getMessage() {
                return this.message;
            }

            /* renamed from: component1, reason: from getter */
            public final int getStatusCode() {
                return this.statusCode;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.Network.HttpError copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.Network.HttpError httpError, int i, java.lang.String str, java.lang.String str2, int i2, java.lang.Object obj) {
                if ((i2 & 1) != 0) {
                    i = httpError.statusCode;
                }
                if ((i2 & 2) != 0) {
                    str = httpError.message;
                }
                if ((i2 & 4) != 0) {
                    str2 = httpError.body;
                }
                return httpError.copy(i, str, str2);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$Network$UnknownNetworkError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$Network;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$Network$UnknownNetworkError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class UnknownNetworkError extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.Network {
            public static final int $stable = 8;
            private final java.lang.Throwable cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnknownNetworkError(java.lang.Throwable th) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
                this.cause = th;
            }

            public final java.lang.Throwable getCause() {
                return this.cause;
            }

            public final java.lang.String toString() {
                java.lang.Throwable th = this.cause;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("UnknownNetworkError(cause=");
                sb.append(th);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.cause.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.Network.UnknownNetworkError) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, ((com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.Network.UnknownNetworkError) other).cause);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.Network.UnknownNetworkError copy(java.lang.Throwable cause) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.Network.UnknownNetworkError(cause);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.Throwable getCause() {
                return this.cause;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.Network.UnknownNetworkError copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.Network.UnknownNetworkError unknownNetworkError, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    th = unknownNetworkError.cause;
                }
                return unknownNetworkError.copy(th);
            }
        }

        public /* synthetic */ Network(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private BNPLError() {
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \b2\u00020\u0001:\u0011\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\r\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError;", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "getErrorDetail", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "errorDetail", "Companion", "ErrorDetail", "GraphQLExtensions", "GraphQLErrorDetail", "FeatureNotAvailable", "DeviceTokenPendingActive", "InvalidVirtualCard", "IssuerDigitizationDataNotFound", "AddressNormalizationError", "RepaymentAuthenticationFailure", "DownpaymentAuthorizationError", "FetchVccFailed", "InvalidPhoneNumber", "InvalidDateOfBirth", "InvalidAge", "InvalidNationalIdentification", "Unknown", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$AddressNormalizationError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$DeviceTokenPendingActive;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$DownpaymentAuthorizationError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$FeatureNotAvailable;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$FetchVccFailed;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$InvalidAge;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$InvalidDateOfBirth;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$InvalidNationalIdentification;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$InvalidPhoneNumber;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$InvalidVirtualCard;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$IssuerDigitizationDataNotFound;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$RepaymentAuthenticationFailure;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$Unknown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class GraphQL extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError {
        public static final int $stable = 0;
        public static final java.lang.String ERROR_NAME_ADDRESS_NORMALIZATION_ERROR = "ADDRESS_NORMALIZATION_ERROR";
        public static final java.lang.String ERROR_NAME_DEVICE_TOKEN_PENDING_ACTIVE = "DEVICE_TOKEN_PENDING_ACTIVE";
        public static final java.lang.String ERROR_NAME_DOWNPAYMENT_AUTHORIZATION_ERROR = "DOWNPAYMENT_AUTHORIZATION_ERROR";
        public static final java.lang.String ERROR_NAME_FEATURE_NOT_AVAILABLE = "FEATURE_NOT_AVAILABLE_ERROR";
        public static final java.lang.String ERROR_NAME_FETCH_VCC_FAILED = "FETCH_VCC_FAILED";
        public static final java.lang.String ERROR_NAME_INVALID_AGE = "INVALID_AGE";
        public static final java.lang.String ERROR_NAME_INVALID_DATE_OF_BIRTH = "INVALID_DATE_OF_BIRTH";
        public static final java.lang.String ERROR_NAME_INVALID_NATIONAL_IDENTIFICATION = "INVALID_NATIONAL_IDENTIFICATION";
        public static final java.lang.String ERROR_NAME_INVALID_PHONE_NUMBER = "INVALID_PHONE_NUMBER";
        public static final java.lang.String ERROR_NAME_INVALID_VIRTUAL_CARD = "INVALID_VIRTUAL_CARD";
        public static final java.lang.String ERROR_NAME_ISSUER_DIGITIZATION_DATA_NOT_FOUND = "ISSUER_DIGITIZATION_DATA_NOT_FOUND";
        public static final java.lang.String ERROR_NAME_REPAYMENT_AUTHENTICATION_FAILURE = "REPAYMENT_AUTHENTICATION_FAILURE";

        public abstract com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail();

        private GraphQL() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$ErrorDetail;", "", "", com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "field", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$ErrorDetail;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getIssue", "getDescription", "getField", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ErrorDetail {
            public static final int $stable = 0;
            private final java.lang.String description;
            private final java.lang.String field;
            private final java.lang.String issue;
            private final java.lang.String value;

            public ErrorDetail(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
                this.issue = str;
                this.description = str2;
                this.field = str3;
                this.value = str4;
            }

            public final java.lang.String getIssue() {
                return this.issue;
            }

            public final java.lang.String getDescription() {
                return this.description;
            }

            public final java.lang.String getField() {
                return this.field;
            }

            public final java.lang.String getValue() {
                return this.value;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.issue;
                java.lang.String str2 = this.description;
                java.lang.String str3 = this.field;
                java.lang.String str4 = this.value;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ErrorDetail(issue=");
                sb.append(str);
                sb.append(", description=");
                sb.append(str2);
                sb.append(", field=");
                sb.append(str3);
                sb.append(", value=");
                sb.append(str4);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.issue;
                int hashCode = str == null ? 0 : str.hashCode();
                java.lang.String str2 = this.description;
                int hashCode2 = str2 == null ? 0 : str2.hashCode();
                java.lang.String str3 = this.field;
                int hashCode3 = str3 == null ? 0 : str3.hashCode();
                java.lang.String str4 = this.value;
                return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ErrorDetail)) {
                    return false;
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ErrorDetail errorDetail = (com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ErrorDetail) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.issue, errorDetail.issue) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, errorDetail.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.field, errorDetail.field) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, errorDetail.value);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ErrorDetail copy(java.lang.String issue, java.lang.String description, java.lang.String field, java.lang.String value) {
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ErrorDetail(issue, description, field, value);
            }

            /* renamed from: component4, reason: from getter */
            public final java.lang.String getValue() {
                return this.value;
            }

            /* renamed from: component3, reason: from getter */
            public final java.lang.String getField() {
                return this.field;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getDescription() {
                return this.description;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getIssue() {
                return this.issue;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ErrorDetail copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ErrorDetail errorDetail, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = errorDetail.issue;
                }
                if ((i & 2) != 0) {
                    str2 = errorDetail.description;
                }
                if ((i & 4) != 0) {
                    str3 = errorDetail.field;
                }
                if ((i & 8) != 0) {
                    str4 = errorDetail.value;
                }
                return errorDetail.copy(str, str2, str3, str4);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J6\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u000eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u0011R\u0013\u0010\"\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b!\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLExtensions;", "", "", "name", "service", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$ErrorDetail;", "details", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "fieldName", "getFieldValue", "(Ljava/lang/String;)Ljava/lang/String;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLExtensions;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "getService", "Ljava/util/List;", "getDetails", "getDebugId", "debugId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class GraphQLExtensions {
            public static final int $stable = 8;
            private final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ErrorDetail> details;
            private final java.lang.String name;
            private final java.lang.String service;

            public GraphQLExtensions(java.lang.String str, java.lang.String str2, java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ErrorDetail> list) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                this.name = str;
                this.service = str2;
                this.details = list;
            }

            public final java.lang.String getName() {
                return this.name;
            }

            public final java.lang.String getService() {
                return this.service;
            }

            public /* synthetic */ GraphQLExtensions(java.lang.String str, java.lang.String str2, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
            }

            public final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ErrorDetail> getDetails() {
                return this.details;
            }

            public final java.lang.String getDebugId() {
                return getFieldValue("debugId");
            }

            public final java.lang.String getFieldValue(java.lang.String fieldName) {
                java.lang.Object obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldName, "");
                java.util.Iterator<T> it = this.details.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ErrorDetail) obj).getField(), fieldName)) {
                        break;
                    }
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ErrorDetail errorDetail = (com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ErrorDetail) obj;
                if (errorDetail != null) {
                    return errorDetail.getValue();
                }
                return null;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.name;
                java.lang.String str2 = this.service;
                java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ErrorDetail> list = this.details;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("GraphQLExtensions(name=");
                sb.append(str);
                sb.append(", service=");
                sb.append(str2);
                sb.append(", details=");
                sb.append(list);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.name.hashCode();
                java.lang.String str = this.service;
                return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.details.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLExtensions)) {
                    return false;
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLExtensions graphQLExtensions = (com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLExtensions) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.name, graphQLExtensions.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.service, graphQLExtensions.service) && kotlin.jvm.internal.Intrinsics.areEqual(this.details, graphQLExtensions.details);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLExtensions copy(java.lang.String name2, java.lang.String service, java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ErrorDetail> details) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(details, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLExtensions(name2, service, details);
            }

            public final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.ErrorDetail> component3() {
                return this.details;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getService() {
                return this.service;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getName() {
                return this.name;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLExtensions copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLExtensions graphQLExtensions, java.lang.String str, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = graphQLExtensions.name;
                }
                if ((i & 2) != 0) {
                    str2 = graphQLExtensions.service;
                }
                if ((i & 4) != 0) {
                    list = graphQLExtensions.details;
                }
                return graphQLExtensions.copy(str, str2, list);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "", "", "message", "", "path", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLExtensions;", com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS, "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLExtensions;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLExtensions;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLExtensions;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Ljava/util/List;", "getPath", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLExtensions;", "getExtensions"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class GraphQLErrorDetail {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLExtensions extensions;
            private final java.lang.String message;
            private final java.util.List<java.lang.String> path;

            public GraphQLErrorDetail(java.lang.String str, java.util.List<java.lang.String> list, com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLExtensions graphQLExtensions) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLExtensions, "");
                this.message = str;
                this.path = list;
                this.extensions = graphQLExtensions;
            }

            public final java.lang.String getMessage() {
                return this.message;
            }

            public final java.util.List<java.lang.String> getPath() {
                return this.path;
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLExtensions getExtensions() {
                return this.extensions;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.message;
                java.util.List<java.lang.String> list = this.path;
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLExtensions graphQLExtensions = this.extensions;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("GraphQLErrorDetail(message=");
                sb.append(str);
                sb.append(", path=");
                sb.append(list);
                sb.append(", extensions=");
                sb.append(graphQLExtensions);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.message.hashCode();
                java.util.List<java.lang.String> list = this.path;
                return (((hashCode * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.extensions.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail)) {
                    return false;
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail = (com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.message, graphQLErrorDetail.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.path, graphQLErrorDetail.path) && kotlin.jvm.internal.Intrinsics.areEqual(this.extensions, graphQLErrorDetail.extensions);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail copy(java.lang.String message, java.util.List<java.lang.String> path, com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLExtensions extensions) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensions, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail(message, path, extensions);
            }

            /* renamed from: component3, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLExtensions getExtensions() {
                return this.extensions;
            }

            public final java.util.List<java.lang.String> component2() {
                return this.path;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getMessage() {
                return this.message;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, java.lang.String str, java.util.List list, com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLExtensions graphQLExtensions, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = graphQLErrorDetail.message;
                }
                if ((i & 2) != 0) {
                    list = graphQLErrorDetail.path;
                }
                if ((i & 4) != 0) {
                    graphQLExtensions = graphQLErrorDetail.extensions;
                }
                return graphQLErrorDetail.copy(str, list, graphQLExtensions);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$FeatureNotAvailable;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "errorDetail", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$FeatureNotAvailable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "getErrorDetail"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class FeatureNotAvailable extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FeatureNotAvailable(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLErrorDetail, "");
                this.errorDetail = graphQLErrorDetail;
            }

            @Override // com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail = this.errorDetail;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("FeatureNotAvailable(errorDetail=");
                sb.append(graphQLErrorDetail);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.errorDetail.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.FeatureNotAvailable) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetail, ((com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.FeatureNotAvailable) other).errorDetail);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.FeatureNotAvailable copy(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetail, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.FeatureNotAvailable(errorDetail);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.FeatureNotAvailable copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.FeatureNotAvailable featureNotAvailable, com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    graphQLErrorDetail = featureNotAvailable.errorDetail;
                }
                return featureNotAvailable.copy(graphQLErrorDetail);
            }
        }

        @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$DeviceTokenPendingActive;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "errorDetail", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/ProvisionedToken;", "pendingActiveToken", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/ProvisionedToken;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/ProvisionedToken;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/ProvisionedToken;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$DeviceTokenPendingActive;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "getErrorDetail", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/ProvisionedToken;", "getPendingActiveToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DeviceTokenPendingActive extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail;
            private final com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken pendingActiveToken;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DeviceTokenPendingActive(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken provisionedToken) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLErrorDetail, "");
                this.errorDetail = graphQLErrorDetail;
                this.pendingActiveToken = provisionedToken;
            }

            @Override // com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken getPendingActiveToken() {
                return this.pendingActiveToken;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail = this.errorDetail;
                com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken provisionedToken = this.pendingActiveToken;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("DeviceTokenPendingActive(errorDetail=");
                sb.append(graphQLErrorDetail);
                sb.append(", pendingActiveToken=");
                sb.append(provisionedToken);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.errorDetail.hashCode();
                com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken provisionedToken = this.pendingActiveToken;
                return (hashCode * 31) + (provisionedToken == null ? 0 : provisionedToken.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.DeviceTokenPendingActive)) {
                    return false;
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.DeviceTokenPendingActive deviceTokenPendingActive = (com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.DeviceTokenPendingActive) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetail, deviceTokenPendingActive.errorDetail) && kotlin.jvm.internal.Intrinsics.areEqual(this.pendingActiveToken, deviceTokenPendingActive.pendingActiveToken);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.DeviceTokenPendingActive copy(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail, com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken pendingActiveToken) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetail, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.DeviceTokenPendingActive(errorDetail, pendingActiveToken);
            }

            /* renamed from: component2, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken getPendingActiveToken() {
                return this.pendingActiveToken;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.DeviceTokenPendingActive copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.DeviceTokenPendingActive deviceTokenPendingActive, com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken provisionedToken, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    graphQLErrorDetail = deviceTokenPendingActive.errorDetail;
                }
                if ((i & 2) != 0) {
                    provisionedToken = deviceTokenPendingActive.pendingActiveToken;
                }
                return deviceTokenPendingActive.copy(graphQLErrorDetail, provisionedToken);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$InvalidVirtualCard;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "errorDetail", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$InvalidVirtualCard;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "getErrorDetail"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InvalidVirtualCard extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InvalidVirtualCard(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLErrorDetail, "");
                this.errorDetail = graphQLErrorDetail;
            }

            @Override // com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail = this.errorDetail;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("InvalidVirtualCard(errorDetail=");
                sb.append(graphQLErrorDetail);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.errorDetail.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidVirtualCard) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetail, ((com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidVirtualCard) other).errorDetail);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidVirtualCard copy(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetail, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidVirtualCard(errorDetail);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidVirtualCard copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidVirtualCard invalidVirtualCard, com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    graphQLErrorDetail = invalidVirtualCard.errorDetail;
                }
                return invalidVirtualCard.copy(graphQLErrorDetail);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$IssuerDigitizationDataNotFound;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "errorDetail", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$IssuerDigitizationDataNotFound;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "getErrorDetail"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class IssuerDigitizationDataNotFound extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IssuerDigitizationDataNotFound(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLErrorDetail, "");
                this.errorDetail = graphQLErrorDetail;
            }

            @Override // com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail = this.errorDetail;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("IssuerDigitizationDataNotFound(errorDetail=");
                sb.append(graphQLErrorDetail);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.errorDetail.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.IssuerDigitizationDataNotFound) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetail, ((com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.IssuerDigitizationDataNotFound) other).errorDetail);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.IssuerDigitizationDataNotFound copy(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetail, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.IssuerDigitizationDataNotFound(errorDetail);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.IssuerDigitizationDataNotFound copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.IssuerDigitizationDataNotFound issuerDigitizationDataNotFound, com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    graphQLErrorDetail = issuerDigitizationDataNotFound.errorDetail;
                }
                return issuerDigitizationDataNotFound.copy(graphQLErrorDetail);
            }
        }

        @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$AddressNormalizationError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "errorDetail", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/Address;", "address", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/Address;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/Address;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/Address;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$AddressNormalizationError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "getErrorDetail", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/Address;", "getAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class AddressNormalizationError extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address;
            private final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddressNormalizationError(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLErrorDetail, "");
                this.errorDetail = graphQLErrorDetail;
                this.address = address;
            }

            @Override // com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address getAddress() {
                return this.address;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail = this.errorDetail;
                com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address = this.address;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressNormalizationError(errorDetail=");
                sb.append(graphQLErrorDetail);
                sb.append(", address=");
                sb.append(address);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.errorDetail.hashCode();
                com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address = this.address;
                return (hashCode * 31) + (address == null ? 0 : address.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.AddressNormalizationError)) {
                    return false;
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.AddressNormalizationError addressNormalizationError = (com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.AddressNormalizationError) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetail, addressNormalizationError.errorDetail) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, addressNormalizationError.address);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.AddressNormalizationError copy(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail, com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetail, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.AddressNormalizationError(errorDetail, address);
            }

            /* renamed from: component2, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address getAddress() {
                return this.address;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.AddressNormalizationError copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.AddressNormalizationError addressNormalizationError, com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    graphQLErrorDetail = addressNormalizationError.errorDetail;
                }
                if ((i & 2) != 0) {
                    address = addressNormalizationError.address;
                }
                return addressNormalizationError.copy(graphQLErrorDetail, address);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$RepaymentAuthenticationFailure;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "errorDetail", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$RepaymentAuthenticationFailure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "getErrorDetail"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class RepaymentAuthenticationFailure extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RepaymentAuthenticationFailure(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLErrorDetail, "");
                this.errorDetail = graphQLErrorDetail;
            }

            @Override // com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail = this.errorDetail;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("RepaymentAuthenticationFailure(errorDetail=");
                sb.append(graphQLErrorDetail);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.errorDetail.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.RepaymentAuthenticationFailure) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetail, ((com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.RepaymentAuthenticationFailure) other).errorDetail);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.RepaymentAuthenticationFailure copy(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetail, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.RepaymentAuthenticationFailure(errorDetail);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.RepaymentAuthenticationFailure copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.RepaymentAuthenticationFailure repaymentAuthenticationFailure, com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    graphQLErrorDetail = repaymentAuthenticationFailure.errorDetail;
                }
                return repaymentAuthenticationFailure.copy(graphQLErrorDetail);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$DownpaymentAuthorizationError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "errorDetail", "", "reason", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$DownpaymentAuthorizationError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "getErrorDetail", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DownpaymentAuthorizationError extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail;
            private final java.lang.String reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DownpaymentAuthorizationError(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLErrorDetail, "");
                this.errorDetail = graphQLErrorDetail;
                this.reason = str;
            }

            @Override // com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public final java.lang.String getReason() {
                return this.reason;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail = this.errorDetail;
                java.lang.String str = this.reason;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("DownpaymentAuthorizationError(errorDetail=");
                sb.append(graphQLErrorDetail);
                sb.append(", reason=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.errorDetail.hashCode();
                java.lang.String str = this.reason;
                return (hashCode * 31) + (str == null ? 0 : str.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.DownpaymentAuthorizationError)) {
                    return false;
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.DownpaymentAuthorizationError downpaymentAuthorizationError = (com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.DownpaymentAuthorizationError) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetail, downpaymentAuthorizationError.errorDetail) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, downpaymentAuthorizationError.reason);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.DownpaymentAuthorizationError copy(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail, java.lang.String reason) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetail, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.DownpaymentAuthorizationError(errorDetail, reason);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getReason() {
                return this.reason;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.DownpaymentAuthorizationError copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.DownpaymentAuthorizationError downpaymentAuthorizationError, com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    graphQLErrorDetail = downpaymentAuthorizationError.errorDetail;
                }
                if ((i & 2) != 0) {
                    str = downpaymentAuthorizationError.reason;
                }
                return downpaymentAuthorizationError.copy(graphQLErrorDetail, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$FetchVccFailed;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "errorDetail", "", "creditAccountId", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$FetchVccFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "getErrorDetail", "Ljava/lang/String;", "getCreditAccountId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class FetchVccFailed extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL {
            public static final int $stable = 8;
            private final java.lang.String creditAccountId;
            private final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FetchVccFailed(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLErrorDetail, "");
                this.errorDetail = graphQLErrorDetail;
                this.creditAccountId = str;
            }

            @Override // com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public final java.lang.String getCreditAccountId() {
                return this.creditAccountId;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail = this.errorDetail;
                java.lang.String str = this.creditAccountId;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("FetchVccFailed(errorDetail=");
                sb.append(graphQLErrorDetail);
                sb.append(", creditAccountId=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.errorDetail.hashCode();
                java.lang.String str = this.creditAccountId;
                return (hashCode * 31) + (str == null ? 0 : str.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.FetchVccFailed)) {
                    return false;
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.FetchVccFailed fetchVccFailed = (com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.FetchVccFailed) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetail, fetchVccFailed.errorDetail) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, fetchVccFailed.creditAccountId);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.FetchVccFailed copy(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail, java.lang.String creditAccountId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetail, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.FetchVccFailed(errorDetail, creditAccountId);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getCreditAccountId() {
                return this.creditAccountId;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.FetchVccFailed copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.FetchVccFailed fetchVccFailed, com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    graphQLErrorDetail = fetchVccFailed.errorDetail;
                }
                if ((i & 2) != 0) {
                    str = fetchVccFailed.creditAccountId;
                }
                return fetchVccFailed.copy(graphQLErrorDetail, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$InvalidPhoneNumber;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "errorDetail", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$InvalidPhoneNumber;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "getErrorDetail"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InvalidPhoneNumber extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InvalidPhoneNumber(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLErrorDetail, "");
                this.errorDetail = graphQLErrorDetail;
            }

            @Override // com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail = this.errorDetail;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("InvalidPhoneNumber(errorDetail=");
                sb.append(graphQLErrorDetail);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.errorDetail.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidPhoneNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetail, ((com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidPhoneNumber) other).errorDetail);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidPhoneNumber copy(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetail, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidPhoneNumber(errorDetail);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidPhoneNumber copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidPhoneNumber invalidPhoneNumber, com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    graphQLErrorDetail = invalidPhoneNumber.errorDetail;
                }
                return invalidPhoneNumber.copy(graphQLErrorDetail);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$InvalidDateOfBirth;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "errorDetail", "", "reason", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$InvalidDateOfBirth;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "getErrorDetail", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InvalidDateOfBirth extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail;
            private final java.lang.String reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InvalidDateOfBirth(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLErrorDetail, "");
                this.errorDetail = graphQLErrorDetail;
                this.reason = str;
            }

            @Override // com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public final java.lang.String getReason() {
                return this.reason;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail = this.errorDetail;
                java.lang.String str = this.reason;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("InvalidDateOfBirth(errorDetail=");
                sb.append(graphQLErrorDetail);
                sb.append(", reason=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.errorDetail.hashCode();
                java.lang.String str = this.reason;
                return (hashCode * 31) + (str == null ? 0 : str.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidDateOfBirth)) {
                    return false;
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidDateOfBirth invalidDateOfBirth = (com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidDateOfBirth) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetail, invalidDateOfBirth.errorDetail) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, invalidDateOfBirth.reason);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidDateOfBirth copy(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail, java.lang.String reason) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetail, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidDateOfBirth(errorDetail, reason);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getReason() {
                return this.reason;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidDateOfBirth copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidDateOfBirth invalidDateOfBirth, com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    graphQLErrorDetail = invalidDateOfBirth.errorDetail;
                }
                if ((i & 2) != 0) {
                    str = invalidDateOfBirth.reason;
                }
                return invalidDateOfBirth.copy(graphQLErrorDetail, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$InvalidAge;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "errorDetail", "", "reason", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$InvalidAge;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "getErrorDetail", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InvalidAge extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail;
            private final java.lang.String reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InvalidAge(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLErrorDetail, "");
                this.errorDetail = graphQLErrorDetail;
                this.reason = str;
            }

            @Override // com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public final java.lang.String getReason() {
                return this.reason;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail = this.errorDetail;
                java.lang.String str = this.reason;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("InvalidAge(errorDetail=");
                sb.append(graphQLErrorDetail);
                sb.append(", reason=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.errorDetail.hashCode();
                java.lang.String str = this.reason;
                return (hashCode * 31) + (str == null ? 0 : str.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidAge)) {
                    return false;
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidAge invalidAge = (com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidAge) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetail, invalidAge.errorDetail) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, invalidAge.reason);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidAge copy(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail, java.lang.String reason) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetail, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidAge(errorDetail, reason);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getReason() {
                return this.reason;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidAge copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidAge invalidAge, com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    graphQLErrorDetail = invalidAge.errorDetail;
                }
                if ((i & 2) != 0) {
                    str = invalidAge.reason;
                }
                return invalidAge.copy(graphQLErrorDetail, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$InvalidNationalIdentification;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "errorDetail", "", "reason", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$InvalidNationalIdentification;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "getErrorDetail", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InvalidNationalIdentification extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail;
            private final java.lang.String reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InvalidNationalIdentification(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLErrorDetail, "");
                this.errorDetail = graphQLErrorDetail;
                this.reason = str;
            }

            @Override // com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public final java.lang.String getReason() {
                return this.reason;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail = this.errorDetail;
                java.lang.String str = this.reason;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("InvalidNationalIdentification(errorDetail=");
                sb.append(graphQLErrorDetail);
                sb.append(", reason=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.errorDetail.hashCode();
                java.lang.String str = this.reason;
                return (hashCode * 31) + (str == null ? 0 : str.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidNationalIdentification)) {
                    return false;
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidNationalIdentification invalidNationalIdentification = (com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidNationalIdentification) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetail, invalidNationalIdentification.errorDetail) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, invalidNationalIdentification.reason);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidNationalIdentification copy(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail, java.lang.String reason) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetail, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidNationalIdentification(errorDetail, reason);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getReason() {
                return this.reason;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidNationalIdentification copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidNationalIdentification invalidNationalIdentification, com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    graphQLErrorDetail = invalidNationalIdentification.errorDetail;
                }
                if ((i & 2) != 0) {
                    str = invalidNationalIdentification.reason;
                }
                return invalidNationalIdentification.copy(graphQLErrorDetail, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$Unknown;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "errorDetail", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$Unknown;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "getErrorDetail"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Unknown extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Unknown(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLErrorDetail, "");
                this.errorDetail = graphQLErrorDetail;
            }

            @Override // com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail = this.errorDetail;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown(errorDetail=");
                sb.append(graphQLErrorDetail);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.errorDetail.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetail, ((com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown) other).errorDetail);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown copy(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetail, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown(errorDetail);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown unknown, com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    graphQLErrorDetail = unknown.errorDetail;
                }
                return unknown.copy(graphQLErrorDetail);
            }
        }

        public /* synthetic */ GraphQL(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BNPLError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
