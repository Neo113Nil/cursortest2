package com.paypal.oslo.feature.shoppingrewards.shared.domain.repository;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0015\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "correlationId", "Ljava/lang/String;", "getCorrelationId", "()Ljava/lang/String;", "HttpError", "NoInternet", "Unknown", "ServerSideError", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError$HttpError;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError$NoInternet;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError$ServerSideError;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError$Unknown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class DataResultError {
    public static final int $stable = 0;
    private final java.lang.String correlationId;

    private DataResultError(java.lang.String str) {
        this.correlationId = str;
    }

    public /* synthetic */ DataResultError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, null);
    }

    public java.lang.String getCorrelationId() {
        return this.correlationId;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000bJ\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError$HttpError;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;", "", "code", "", "message", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "correlationId", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError$HttpError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getCode", "Ljava/lang/String;", "getMessage", "getBody", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HttpError extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError {
        public static final int $stable = 0;
        private final java.lang.String body;
        private final int code;
        private final java.lang.String correlationId;
        private final java.lang.String message;

        public HttpError(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super(str3, null);
            this.code = i;
            this.message = str;
            this.body = str2;
            this.correlationId = str3;
        }

        public /* synthetic */ HttpError(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3);
        }

        public final int getCode() {
            return this.code;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String getBody() {
            return this.body;
        }

        @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final java.lang.String toString() {
            int i = this.code;
            java.lang.String str = this.message;
            java.lang.String str2 = this.body;
            java.lang.String str3 = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HttpError(code=");
            sb.append(i);
            sb.append(", message=");
            sb.append(str);
            sb.append(", body=");
            sb.append(str2);
            sb.append(", correlationId=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Integer.hashCode(this.code);
            java.lang.String str = this.message;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.body;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.correlationId;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.HttpError)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.HttpError httpError = (com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.HttpError) other;
            return this.code == httpError.code && kotlin.jvm.internal.Intrinsics.areEqual(this.message, httpError.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.body, httpError.body) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, httpError.correlationId);
        }

        public final com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.HttpError copy(int code, java.lang.String message, java.lang.String body, java.lang.String correlationId) {
            return new com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.HttpError(code, message, body, correlationId);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
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
        public final int getCode() {
            return this.code;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.HttpError copy$default(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.HttpError httpError, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = httpError.code;
            }
            if ((i2 & 2) != 0) {
                str = httpError.message;
            }
            if ((i2 & 4) != 0) {
                str2 = httpError.body;
            }
            if ((i2 & 8) != 0) {
                str3 = httpError.correlationId;
            }
            return httpError.copy(i, str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError$NoInternet;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoInternet extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.NoInternet INSTANCE = new com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.NoInternet();

        public final int hashCode() {
            return -98532113;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private NoInternet() {
            super(null, 1, 0 == true ? 1 : 0);
        }

        public final java.lang.String toString() {
            return "NoInternet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.NoInternet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError$Unknown;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Unknown extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.Unknown INSTANCE = new com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.Unknown();

        public final int hashCode() {
            return 1857751709;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Unknown() {
            super(null, 1, 0 == true ? 1 : 0);
        }

        public final java.lang.String toString() {
            return "Unknown";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.Unknown)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError$ServerSideError;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError$ServerSideError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ServerSideError extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError {
        public static final int $stable = 0;
        private final java.lang.String correlationId;

        public ServerSideError(java.lang.String str) {
            super(str, null);
            this.correlationId = str;
        }

        public /* synthetic */ ServerSideError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ServerSideError(correlationId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.correlationId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.ServerSideError) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.ServerSideError) other).correlationId);
        }

        public final com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.ServerSideError copy(java.lang.String correlationId) {
            return new com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.ServerSideError(correlationId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.ServerSideError copy$default(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError.ServerSideError serverSideError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = serverSideError.correlationId;
            }
            return serverSideError.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ServerSideError() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ DataResultError(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
