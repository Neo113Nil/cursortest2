package com.paypal.oslo.feature.cardconnect.shared.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError;", "", "<init>", "()V", "Network", "GraphQLError", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$GraphQLError;", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$Network;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class DataResultError {
    public static final int $stable = 0;

    private DataResultError() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$Network;", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError;", "<init>", "()V", "HttpError", "NoInternet", "UnknownNetworkError", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$Network$HttpError;", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$Network$NoInternet;", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$Network$UnknownNetworkError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Network extends com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError {
        public static final int $stable = 0;

        private Network() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000bJ\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$Network$HttpError;", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$Network;", "", "code", "", "correlationId", "message", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$Network$HttpError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getCode", "Ljava/lang/String;", "getCorrelationId", "getMessage", "getBody"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class HttpError extends com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.Network {
            public static final int $stable = 0;
            private final java.lang.String body;
            private final int code;
            private final java.lang.String correlationId;
            private final java.lang.String message;

            public HttpError(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
                super(null);
                this.code = i;
                this.correlationId = str;
                this.message = str2;
                this.body = str3;
            }

            public /* synthetic */ HttpError(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3);
            }

            public final int getCode() {
                return this.code;
            }

            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public final java.lang.String getMessage() {
                return this.message;
            }

            public final java.lang.String getBody() {
                return this.body;
            }

            public final java.lang.String toString() {
                int i = this.code;
                java.lang.String str = this.correlationId;
                java.lang.String str2 = this.message;
                java.lang.String str3 = this.body;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("HttpError(code=");
                sb.append(i);
                sb.append(", correlationId=");
                sb.append(str);
                sb.append(", message=");
                sb.append(str2);
                sb.append(", body=");
                sb.append(str3);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = java.lang.Integer.hashCode(this.code);
                java.lang.String str = this.correlationId;
                int hashCode2 = str == null ? 0 : str.hashCode();
                java.lang.String str2 = this.message;
                int hashCode3 = str2 == null ? 0 : str2.hashCode();
                java.lang.String str3 = this.body;
                return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.Network.HttpError)) {
                    return false;
                }
                com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.Network.HttpError httpError = (com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.Network.HttpError) other;
                return this.code == httpError.code && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, httpError.correlationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, httpError.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.body, httpError.body);
            }

            public final com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.Network.HttpError copy(int code, java.lang.String correlationId, java.lang.String message, java.lang.String body) {
                return new com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.Network.HttpError(code, correlationId, message, body);
            }

            /* renamed from: component4, reason: from getter */
            public final java.lang.String getBody() {
                return this.body;
            }

            /* renamed from: component3, reason: from getter */
            public final java.lang.String getMessage() {
                return this.message;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            /* renamed from: component1, reason: from getter */
            public final int getCode() {
                return this.code;
            }

            public static /* synthetic */ com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.Network.HttpError copy$default(com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.Network.HttpError httpError, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, int i2, java.lang.Object obj) {
                if ((i2 & 1) != 0) {
                    i = httpError.code;
                }
                if ((i2 & 2) != 0) {
                    str = httpError.correlationId;
                }
                if ((i2 & 4) != 0) {
                    str2 = httpError.message;
                }
                if ((i2 & 8) != 0) {
                    str3 = httpError.body;
                }
                return httpError.copy(i, str, str2, str3);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$Network$NoInternet;", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$Network;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NoInternet extends com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.Network {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.Network.NoInternet INSTANCE = new com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.Network.NoInternet();

            public final int hashCode() {
                return 591226682;
            }

            private NoInternet() {
                super(null);
            }

            public final java.lang.String toString() {
                return "NoInternet";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.Network.NoInternet)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$Network$UnknownNetworkError;", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$Network;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class UnknownNetworkError extends com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.Network {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.Network.UnknownNetworkError INSTANCE = new com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.Network.UnknownNetworkError();

            public final int hashCode() {
                return 1473221068;
            }

            private UnknownNetworkError() {
                super(null);
            }

            public final java.lang.String toString() {
                return "UnknownNetworkError";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.Network.UnknownNetworkError)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ Network(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0001\u0010"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$GraphQLError;", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError;", "<init>", "()V", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$GraphQLError$GraphQLErrorDetail;", "getErrorDetail", "()Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$GraphQLError$GraphQLErrorDetail;", "errorDetail", "", "getCorrelationId", "()Ljava/lang/String;", "correlationId", "ErrorDetail", "GraphQLExtensions", "GraphQLErrorDetail", "GenericError", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$GraphQLError$GenericError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class GraphQLError extends com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError {
        public static final int $stable = 0;

        public abstract java.lang.String getCorrelationId();

        public abstract com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLErrorDetail getErrorDetail();

        private GraphQLError() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$GraphQLError$ErrorDetail;", "", "", com.paypal.oslo.feature.identity.shared.data.mapper.GraphQLErrorMapper.KEY_ISSUE, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "field", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$GraphQLError$ErrorDetail;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getIssue", "getDescription", "getField", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
                if (!(other instanceof com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.ErrorDetail)) {
                    return false;
                }
                com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.ErrorDetail errorDetail = (com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.ErrorDetail) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.issue, errorDetail.issue) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, errorDetail.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.field, errorDetail.field) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, errorDetail.value);
            }

            public final com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.ErrorDetail copy(java.lang.String issue, java.lang.String description, java.lang.String field, java.lang.String value) {
                return new com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.ErrorDetail(issue, description, field, value);
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

            public static /* synthetic */ com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.ErrorDetail copy$default(com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.ErrorDetail errorDetail, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
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

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J6\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u000eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u0011R\u0013\u0010\"\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b!\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$GraphQLError$GraphQLExtensions;", "", "", "name", "service", "", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$GraphQLError$ErrorDetail;", "details", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "fieldName", "getFieldValue", "(Ljava/lang/String;)Ljava/lang/String;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$GraphQLError$GraphQLExtensions;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "getService", "Ljava/util/List;", "getDetails", "getDebugId", "debugId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class GraphQLExtensions {
            public static final int $stable = 8;
            private final java.util.List<com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.ErrorDetail> details;
            private final java.lang.String name;
            private final java.lang.String service;

            public GraphQLExtensions(java.lang.String str, java.lang.String str2, java.util.List<com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.ErrorDetail> list) {
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

            public final java.util.List<com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.ErrorDetail> getDetails() {
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
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.ErrorDetail) obj).getField(), fieldName)) {
                        break;
                    }
                }
                com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.ErrorDetail errorDetail = (com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.ErrorDetail) obj;
                if (errorDetail != null) {
                    return errorDetail.getValue();
                }
                return null;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.name;
                java.lang.String str2 = this.service;
                java.util.List<com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.ErrorDetail> list = this.details;
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
                if (!(other instanceof com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLExtensions)) {
                    return false;
                }
                com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLExtensions graphQLExtensions = (com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLExtensions) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.name, graphQLExtensions.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.service, graphQLExtensions.service) && kotlin.jvm.internal.Intrinsics.areEqual(this.details, graphQLExtensions.details);
            }

            public final com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLExtensions copy(java.lang.String name2, java.lang.String service, java.util.List<com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.ErrorDetail> details) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(details, "");
                return new com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLExtensions(name2, service, details);
            }

            public final java.util.List<com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.ErrorDetail> component3() {
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
            public static /* synthetic */ com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLExtensions copy$default(com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLExtensions graphQLExtensions, java.lang.String str, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
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

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$GraphQLError$GraphQLErrorDetail;", "", "", "message", "", "path", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$GraphQLError$GraphQLExtensions;", com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS, "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$GraphQLError$GraphQLExtensions;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$GraphQLError$GraphQLExtensions;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$GraphQLError$GraphQLExtensions;)Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$GraphQLError$GraphQLErrorDetail;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Ljava/util/List;", "getPath", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$GraphQLError$GraphQLExtensions;", "getExtensions"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class GraphQLErrorDetail {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLExtensions extensions;
            private final java.lang.String message;
            private final java.util.List<java.lang.String> path;

            public GraphQLErrorDetail(java.lang.String str, java.util.List<java.lang.String> list, com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLExtensions graphQLExtensions) {
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

            public final com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLExtensions getExtensions() {
                return this.extensions;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.message;
                java.util.List<java.lang.String> list = this.path;
                com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLExtensions graphQLExtensions = this.extensions;
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
                if (!(other instanceof com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLErrorDetail)) {
                    return false;
                }
                com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLErrorDetail graphQLErrorDetail = (com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLErrorDetail) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.message, graphQLErrorDetail.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.path, graphQLErrorDetail.path) && kotlin.jvm.internal.Intrinsics.areEqual(this.extensions, graphQLErrorDetail.extensions);
            }

            public final com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLErrorDetail copy(java.lang.String message, java.util.List<java.lang.String> path, com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLExtensions extensions) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensions, "");
                return new com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLErrorDetail(message, path, extensions);
            }

            /* renamed from: component3, reason: from getter */
            public final com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLExtensions getExtensions() {
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
            public static /* synthetic */ com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLErrorDetail copy$default(com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLErrorDetail graphQLErrorDetail, java.lang.String str, java.util.List list, com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLExtensions graphQLExtensions, int i, java.lang.Object obj) {
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

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$GraphQLError$GenericError;", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$GraphQLError;", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$GraphQLError$GraphQLErrorDetail;", "errorDetail", "", "correlationId", "<init>", "(Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$GraphQLError$GraphQLErrorDetail;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$GraphQLError$GraphQLErrorDetail;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$GraphQLError$GraphQLErrorDetail;Ljava/lang/String;)Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$GraphQLError$GenericError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$GraphQLError$GraphQLErrorDetail;", "getErrorDetail", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class GenericError extends com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError {
            public static final int $stable = 8;
            private final java.lang.String correlationId;
            private final com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLErrorDetail errorDetail;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GenericError(com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLErrorDetail graphQLErrorDetail, java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLErrorDetail, "");
                this.errorDetail = graphQLErrorDetail;
                this.correlationId = str;
            }

            @Override // com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError
            public final com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            @Override // com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLErrorDetail graphQLErrorDetail = this.errorDetail;
                java.lang.String str = this.correlationId;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("GenericError(errorDetail=");
                sb.append(graphQLErrorDetail);
                sb.append(", correlationId=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.errorDetail.hashCode();
                java.lang.String str = this.correlationId;
                return (hashCode * 31) + (str == null ? 0 : str.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GenericError)) {
                    return false;
                }
                com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GenericError genericError = (com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GenericError) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetail, genericError.errorDetail) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, genericError.correlationId);
            }

            public final com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GenericError copy(com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLErrorDetail errorDetail, java.lang.String correlationId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetail, "");
                return new com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GenericError(errorDetail, correlationId);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public static /* synthetic */ com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GenericError copy$default(com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GenericError genericError, com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLErrorDetail graphQLErrorDetail, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    graphQLErrorDetail = genericError.errorDetail;
                }
                if ((i & 2) != 0) {
                    str = genericError.correlationId;
                }
                return genericError.copy(graphQLErrorDetail, str);
            }
        }

        public /* synthetic */ GraphQLError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DataResultError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
