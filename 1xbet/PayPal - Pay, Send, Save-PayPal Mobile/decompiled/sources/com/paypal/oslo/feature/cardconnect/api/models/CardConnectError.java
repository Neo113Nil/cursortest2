package com.paypal.oslo.feature.cardconnect.api.models;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectError;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "tag", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "NoInternet", "HttpError", "UnknownNetworkError", "GraphQLError", "NoDataFound", "RiskDenied", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectError$GraphQLError;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectError$HttpError;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectError$NoDataFound;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectError$NoInternet;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectError$RiskDenied;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectError$UnknownNetworkError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class CardConnectError {
    private final java.lang.String tag;

    private CardConnectError(java.lang.String str) {
        this.tag = str;
    }

    public /* synthetic */ CardConnectError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, null);
    }

    public java.lang.String getTag() {
        return this.tag;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectError$NoInternet;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoInternet extends com.paypal.oslo.feature.cardconnect.api.models.CardConnectError {
        public static final com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.NoInternet INSTANCE = new com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.NoInternet();

        public final int hashCode() {
            return -1991779593;
        }

        private NoInternet() {
            super(com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.Network.NO_INTERNET_CODE, null);
        }

        public final java.lang.String toString() {
            return "NoInternet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.NoInternet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectError$HttpError;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectError;", "", "statusCode", "", "correlationId", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectError$HttpError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/Integer;", "getStatusCode", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HttpError extends com.paypal.oslo.feature.cardconnect.api.models.CardConnectError {
        private final java.lang.String correlationId;
        private final java.lang.Integer statusCode;

        public final java.lang.Integer getStatusCode() {
            return this.statusCode;
        }

        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public HttpError(java.lang.Integer num, java.lang.String str) {
            super("HTTP_".concat(java.lang.String.valueOf(num == null ? "UNKNOWN" : num)), null);
            this.statusCode = num;
            this.correlationId = str;
        }

        public final java.lang.String toString() {
            java.lang.Integer num = this.statusCode;
            java.lang.String str = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HttpError(statusCode=");
            sb.append(num);
            sb.append(", correlationId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Integer num = this.statusCode;
            int hashCode = num == null ? 0 : num.hashCode();
            java.lang.String str = this.correlationId;
            return (hashCode * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.HttpError)) {
                return false;
            }
            com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.HttpError httpError = (com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.HttpError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.statusCode, httpError.statusCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, httpError.correlationId);
        }

        public final com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.HttpError copy(java.lang.Integer statusCode, java.lang.String correlationId) {
            return new com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.HttpError(statusCode, correlationId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Integer getStatusCode() {
            return this.statusCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.HttpError copy$default(com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.HttpError httpError, java.lang.Integer num, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                num = httpError.statusCode;
            }
            if ((i & 2) != 0) {
                str = httpError.correlationId;
            }
            return httpError.copy(num, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectError$UnknownNetworkError;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnknownNetworkError extends com.paypal.oslo.feature.cardconnect.api.models.CardConnectError {
        public static final com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.UnknownNetworkError INSTANCE = new com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.UnknownNetworkError();

        public final int hashCode() {
            return 1963917999;
        }

        private UnknownNetworkError() {
            super("UNKNOWN_NETWORK_ERROR", null);
        }

        public final java.lang.String toString() {
            return "UnknownNetworkError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.UnknownNetworkError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectError$GraphQLError;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectError;", "", "errorDetail", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectError$GraphQLError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorDetail"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GraphQLError extends com.paypal.oslo.feature.cardconnect.api.models.CardConnectError {
        private final java.lang.String errorDetail;

        public GraphQLError(java.lang.String str) {
            super("GRAPHQL_ERROR", null);
            this.errorDetail = str;
        }

        public final java.lang.String getErrorDetail() {
            return this.errorDetail;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorDetail;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GraphQLError(errorDetail=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.errorDetail;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.GraphQLError) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetail, ((com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.GraphQLError) other).errorDetail);
        }

        public final com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.GraphQLError copy(java.lang.String errorDetail) {
            return new com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.GraphQLError(errorDetail);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorDetail() {
            return this.errorDetail;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.GraphQLError copy$default(com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.GraphQLError graphQLError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = graphQLError.errorDetail;
            }
            return graphQLError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectError$NoDataFound;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoDataFound extends com.paypal.oslo.feature.cardconnect.api.models.CardConnectError {
        public static final com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.NoDataFound INSTANCE = new com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.NoDataFound();

        public final int hashCode() {
            return 1789875458;
        }

        private NoDataFound() {
            super("NO_DATA_FOUND", null);
        }

        public final java.lang.String toString() {
            return "NoDataFound";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.NoDataFound)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectError$RiskDenied;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RiskDenied extends com.paypal.oslo.feature.cardconnect.api.models.CardConnectError {
        public static final com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.RiskDenied INSTANCE = new com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.RiskDenied();

        public final int hashCode() {
            return -81318369;
        }

        private RiskDenied() {
            super(com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_RISK_DENIED, null);
        }

        public final java.lang.String toString() {
            return "RiskDenied";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cardconnect.api.models.CardConnectError.RiskDenied)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ CardConnectError(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
