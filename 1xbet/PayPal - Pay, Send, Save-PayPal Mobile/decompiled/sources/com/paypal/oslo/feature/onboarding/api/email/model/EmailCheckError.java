package com.paypal.oslo.feature.onboarding.api.email.model;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/email/model/EmailCheckError;", "", "NetworkError", "DataNotFound", "ServerError", "UnknownError", "ConfirmationRequired", "BlockedEmail", "Lcom/paypal/oslo/feature/onboarding/api/email/model/EmailCheckError$BlockedEmail;", "Lcom/paypal/oslo/feature/onboarding/api/email/model/EmailCheckError$ConfirmationRequired;", "Lcom/paypal/oslo/feature/onboarding/api/email/model/EmailCheckError$DataNotFound;", "Lcom/paypal/oslo/feature/onboarding/api/email/model/EmailCheckError$NetworkError;", "Lcom/paypal/oslo/feature/onboarding/api/email/model/EmailCheckError$ServerError;", "Lcom/paypal/oslo/feature/onboarding/api/email/model/EmailCheckError$UnknownError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface EmailCheckError {

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u0007\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/email/model/EmailCheckError$NetworkError;", "Lcom/paypal/oslo/feature/onboarding/api/email/model/EmailCheckError;", "", "message", "", "httpCode", "", "isConnectivityIssue", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Z)Lcom/paypal/oslo/feature/onboarding/api/email/model/EmailCheckError$NetworkError;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Ljava/lang/Integer;", "getHttpCode", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NetworkError implements com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError {
        private final java.lang.Integer httpCode;
        private final boolean isConnectivityIssue;
        private final java.lang.String message;

        public NetworkError(java.lang.String str, java.lang.Integer num, boolean z) {
            this.message = str;
            this.httpCode = num;
            this.isConnectivityIssue = z;
        }

        public /* synthetic */ NetworkError(java.lang.String str, java.lang.Integer num, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? false : z);
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.Integer getHttpCode() {
            return this.httpCode;
        }

        public final boolean isConnectivityIssue() {
            return this.isConnectivityIssue;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.Integer num = this.httpCode;
            boolean z = this.isConnectivityIssue;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkError(message=");
            sb.append(str);
            sb.append(", httpCode=");
            sb.append(num);
            sb.append(", isConnectivityIssue=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.message;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.Integer num = this.httpCode;
            return (((hashCode * 31) + (num != null ? num.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isConnectivityIssue);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.NetworkError)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.NetworkError networkError = (com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.NetworkError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, networkError.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.httpCode, networkError.httpCode) && this.isConnectivityIssue == networkError.isConnectivityIssue;
        }

        public final com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.NetworkError copy(java.lang.String message, java.lang.Integer httpCode, boolean isConnectivityIssue) {
            return new com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.NetworkError(message, httpCode, isConnectivityIssue);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsConnectivityIssue() {
            return this.isConnectivityIssue;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Integer getHttpCode() {
            return this.httpCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.NetworkError copy$default(com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.NetworkError networkError, java.lang.String str, java.lang.Integer num, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = networkError.message;
            }
            if ((i & 2) != 0) {
                num = networkError.httpCode;
            }
            if ((i & 4) != 0) {
                z = networkError.isConnectivityIssue;
            }
            return networkError.copy(str, num, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/email/model/EmailCheckError$DataNotFound;", "Lcom/paypal/oslo/feature/onboarding/api/email/model/EmailCheckError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/api/email/model/EmailCheckError$DataNotFound;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DataNotFound implements com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError {
        private final java.lang.String message;

        public DataNotFound(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DataNotFound(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.DataNotFound) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.DataNotFound) other).message);
        }

        public final com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.DataNotFound copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.DataNotFound(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.DataNotFound copy$default(com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.DataNotFound dataNotFound, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dataNotFound.message;
            }
            return dataNotFound.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/email/model/EmailCheckError$ServerError;", "Lcom/paypal/oslo/feature/onboarding/api/email/model/EmailCheckError;", "", "", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/onboarding/api/email/model/EmailCheckError$ServerError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getErrors"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ServerError implements com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError {
        private final java.util.List<java.lang.String> errors;

        public ServerError(java.util.List<java.lang.String> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.errors = list;
        }

        public final java.util.List<java.lang.String> getErrors() {
            return this.errors;
        }

        public final java.lang.String toString() {
            java.util.List<java.lang.String> list = this.errors;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ServerError(errors=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errors.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.ServerError) && kotlin.jvm.internal.Intrinsics.areEqual(this.errors, ((com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.ServerError) other).errors);
        }

        public final com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.ServerError copy(java.util.List<java.lang.String> errors) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errors, "");
            return new com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.ServerError(errors);
        }

        public final java.util.List<java.lang.String> component1() {
            return this.errors;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.ServerError copy$default(com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.ServerError serverError, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = serverError.errors;
            }
            return serverError.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/email/model/EmailCheckError$UnknownError;", "Lcom/paypal/oslo/feature/onboarding/api/email/model/EmailCheckError;", "", "reason", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/api/email/model/EmailCheckError$UnknownError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnknownError implements com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError {
        private final java.lang.String reason;

        public UnknownError(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnknownError(reason=");
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
            return (other instanceof com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.UnknownError) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.UnknownError) other).reason);
        }

        public final com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.UnknownError copy(java.lang.String reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.UnknownError(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.UnknownError copy$default(com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.UnknownError unknownError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unknownError.reason;
            }
            return unknownError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/email/model/EmailCheckError$ConfirmationRequired;", "Lcom/paypal/oslo/feature/onboarding/api/email/model/EmailCheckError;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/Email;", "email", "<init>", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-BvNj-jI", "()Ljava/lang/String;", "component1", "copy-RQoNrjY", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/api/email/model/EmailCheckError$ConfirmationRequired;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "Ljava/lang/String;", "getEmail-BvNj-jI"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConfirmationRequired implements com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError {
        private final java.lang.String email;

        private ConfirmationRequired(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.email = str;
        }

        /* renamed from: getEmail-BvNj-jI, reason: not valid java name */
        public final java.lang.String m15866getEmailBvNjjI() {
            return this.email;
        }

        public final java.lang.String toString() {
            java.lang.String m15926toStringimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15926toStringimpl(this.email);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfirmationRequired(email=");
            sb.append(m15926toStringimpl);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15925hashCodeimpl(this.email);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.ConfirmationRequired) && com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15924equalsimpl0(this.email, ((com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.ConfirmationRequired) other).email);
        }

        /* renamed from: copy-RQoNrjY, reason: not valid java name */
        public final com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.ConfirmationRequired m15865copyRQoNrjY(java.lang.String email) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
            return new com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.ConfirmationRequired(email, null);
        }

        /* renamed from: component1-BvNj-jI, reason: not valid java name and from getter */
        public final java.lang.String getEmail() {
            return this.email;
        }

        /* renamed from: copy-RQoNrjY$default, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.ConfirmationRequired m15863copyRQoNrjY$default(com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.ConfirmationRequired confirmationRequired, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = confirmationRequired.email;
            }
            return confirmationRequired.m15865copyRQoNrjY(str);
        }

        public /* synthetic */ ConfirmationRequired(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/email/model/EmailCheckError$BlockedEmail;", "Lcom/paypal/oslo/feature/onboarding/api/email/model/EmailCheckError;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/Email;", "email", "", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-BvNj-jI", "()Ljava/lang/String;", "component1", "component2", "copy-E4ilnuY", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/api/email/model/EmailCheckError$BlockedEmail;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getEmail-BvNj-jI", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BlockedEmail implements com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError {
        private final java.lang.String email;
        private final java.lang.String errorMessage;

        private BlockedEmail(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.email = str;
            this.errorMessage = str2;
        }

        /* renamed from: getEmail-BvNj-jI, reason: not valid java name */
        public final java.lang.String m15862getEmailBvNjjI() {
            return this.email;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            java.lang.String m15926toStringimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15926toStringimpl(this.email);
            java.lang.String str = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BlockedEmail(email=");
            sb.append(m15926toStringimpl);
            sb.append(", errorMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15925hashCodeimpl(this.email) * 31) + this.errorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.BlockedEmail)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.BlockedEmail blockedEmail = (com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.BlockedEmail) other;
            return com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15924equalsimpl0(this.email, blockedEmail.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, blockedEmail.errorMessage);
        }

        /* renamed from: copy-E4ilnuY, reason: not valid java name */
        public final com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.BlockedEmail m15861copyE4ilnuY(java.lang.String email, java.lang.String errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.BlockedEmail(email, errorMessage, null);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1-BvNj-jI, reason: not valid java name and from getter */
        public final java.lang.String getEmail() {
            return this.email;
        }

        /* renamed from: copy-E4ilnuY$default, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.BlockedEmail m15859copyE4ilnuY$default(com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.BlockedEmail blockedEmail, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = blockedEmail.email;
            }
            if ((i & 2) != 0) {
                str2 = blockedEmail.errorMessage;
            }
            return blockedEmail.m15861copyE4ilnuY(str, str2);
        }

        public /* synthetic */ BlockedEmail(java.lang.String str, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }
    }
}
