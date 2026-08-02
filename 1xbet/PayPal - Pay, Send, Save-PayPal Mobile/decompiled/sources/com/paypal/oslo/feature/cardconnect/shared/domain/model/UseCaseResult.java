package com.paypal.oslo.feature.cardconnect.shared.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult;", "T", "", "<init>", "()V", "Success", "Error", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult$Error;", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class UseCaseResult<T> {
    public static final int $stable = 0;

    private UseCaseResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00028\u00018\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult$Success;", "T", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success<T> extends com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult<T> {
        public static final int $stable = 0;
        private final T data;

        public Success(T t) {
            super(null);
            this.data = t;
        }

        public final T getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            T t = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(data=");
            sb.append(t);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            T t = this.data;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Success) other).data);
        }

        public final com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Success<T> copy(T data) {
            return new com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Success<>(data);
        }

        public final T component1() {
            return this.data;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Success copy$default(com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Success success, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = success.data;
            }
            return success.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u000e\u000f\u0010\u0011\u0012B!\b\u0004\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b\u0082\u0001\u0005\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult$Error;", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "correlationId", "Ljava/lang/String;", "getCorrelationId", "()Ljava/lang/String;", "errorMessage", "getErrorMessage", "HttpError", "NoInternet", "UnknownNetworkError", "NoDataFoundError", "GenericGraphQLError", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult$Error$GenericGraphQLError;", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult$Error$HttpError;", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult$Error$NoDataFoundError;", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult$Error$NoInternet;", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult$Error$UnknownNetworkError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Error extends com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult {
        public static final int $stable = 0;
        private final java.lang.String correlationId;
        private final java.lang.String errorMessage;

        private Error(java.lang.String str, java.lang.String str2) {
            super(null);
            this.correlationId = str;
            this.errorMessage = str2;
        }

        public /* synthetic */ Error(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, null);
        }

        public java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\nJ\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult$Error$HttpError;", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult$Error;", "", "statusCode", "", "correlationId", "errorMessage", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "copy", "(ILjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult$Error$HttpError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getStatusCode", "Ljava/lang/String;", "getCorrelationId", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class HttpError extends com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error {
            public static final int $stable = 0;
            private final java.lang.String correlationId;
            private final java.lang.String errorMessage;
            private final int statusCode;

            public HttpError(int i, java.lang.String str, java.lang.String str2) {
                super(str, str2, null);
                this.statusCode = i;
                this.correlationId = str;
                this.errorMessage = str2;
            }

            public /* synthetic */ HttpError(int i, java.lang.String str, java.lang.String str2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(i, str, (i2 & 4) != 0 ? null : str2);
            }

            public final int getStatusCode() {
                return this.statusCode;
            }

            @Override // com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            @Override // com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error
            public final java.lang.String getErrorMessage() {
                return this.errorMessage;
            }

            public final java.lang.String toString() {
                int i = this.statusCode;
                java.lang.String str = this.correlationId;
                java.lang.String str2 = this.errorMessage;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("HttpError(statusCode=");
                sb.append(i);
                sb.append(", correlationId=");
                sb.append(str);
                sb.append(", errorMessage=");
                sb.append(str2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = java.lang.Integer.hashCode(this.statusCode);
                java.lang.String str = this.correlationId;
                int hashCode2 = str == null ? 0 : str.hashCode();
                java.lang.String str2 = this.errorMessage;
                return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.HttpError)) {
                    return false;
                }
                com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.HttpError httpError = (com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.HttpError) other;
                return this.statusCode == httpError.statusCode && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, httpError.correlationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, httpError.errorMessage);
            }

            public final com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.HttpError copy(int statusCode, java.lang.String correlationId, java.lang.String errorMessage) {
                return new com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.HttpError(statusCode, correlationId, errorMessage);
            }

            /* renamed from: component3, reason: from getter */
            public final java.lang.String getErrorMessage() {
                return this.errorMessage;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            /* renamed from: component1, reason: from getter */
            public final int getStatusCode() {
                return this.statusCode;
            }

            public static /* synthetic */ com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.HttpError copy$default(com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.HttpError httpError, int i, java.lang.String str, java.lang.String str2, int i2, java.lang.Object obj) {
                if ((i2 & 1) != 0) {
                    i = httpError.statusCode;
                }
                if ((i2 & 2) != 0) {
                    str = httpError.correlationId;
                }
                if ((i2 & 4) != 0) {
                    str2 = httpError.errorMessage;
                }
                return httpError.copy(i, str, str2);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult$Error$NoInternet;", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult$Error;", "", "correlationId", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult$Error$NoInternet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NoInternet extends com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error {
            public static final int $stable = 0;
            private final java.lang.String correlationId;
            private final java.lang.String errorMessage;

            public NoInternet(java.lang.String str, java.lang.String str2) {
                super(str, str2, null);
                this.correlationId = str;
                this.errorMessage = str2;
            }

            public /* synthetic */ NoInternet(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : str2);
            }

            @Override // com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            @Override // com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error
            public final java.lang.String getErrorMessage() {
                return this.errorMessage;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.correlationId;
                java.lang.String str2 = this.errorMessage;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NoInternet(correlationId=");
                sb.append(str);
                sb.append(", errorMessage=");
                sb.append(str2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.correlationId;
                int hashCode = str == null ? 0 : str.hashCode();
                java.lang.String str2 = this.errorMessage;
                return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.NoInternet)) {
                    return false;
                }
                com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.NoInternet noInternet = (com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.NoInternet) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, noInternet.correlationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, noInternet.errorMessage);
            }

            public final com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.NoInternet copy(java.lang.String correlationId, java.lang.String errorMessage) {
                return new com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.NoInternet(correlationId, errorMessage);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getErrorMessage() {
                return this.errorMessage;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.NoInternet copy$default(com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.NoInternet noInternet, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = noInternet.correlationId;
                }
                if ((i & 2) != 0) {
                    str2 = noInternet.errorMessage;
                }
                return noInternet.copy(str, str2);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult$Error$UnknownNetworkError;", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult$Error;", "", "correlationId", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult$Error$UnknownNetworkError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class UnknownNetworkError extends com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error {
            public static final int $stable = 0;
            private final java.lang.String correlationId;
            private final java.lang.String errorMessage;

            public UnknownNetworkError(java.lang.String str, java.lang.String str2) {
                super(str, str2, null);
                this.correlationId = str;
                this.errorMessage = str2;
            }

            public /* synthetic */ UnknownNetworkError(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : str2);
            }

            @Override // com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            @Override // com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error
            public final java.lang.String getErrorMessage() {
                return this.errorMessage;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.correlationId;
                java.lang.String str2 = this.errorMessage;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("UnknownNetworkError(correlationId=");
                sb.append(str);
                sb.append(", errorMessage=");
                sb.append(str2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.correlationId;
                int hashCode = str == null ? 0 : str.hashCode();
                java.lang.String str2 = this.errorMessage;
                return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.UnknownNetworkError)) {
                    return false;
                }
                com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.UnknownNetworkError unknownNetworkError = (com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.UnknownNetworkError) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, unknownNetworkError.correlationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, unknownNetworkError.errorMessage);
            }

            public final com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.UnknownNetworkError copy(java.lang.String correlationId, java.lang.String errorMessage) {
                return new com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.UnknownNetworkError(correlationId, errorMessage);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getErrorMessage() {
                return this.errorMessage;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.UnknownNetworkError copy$default(com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.UnknownNetworkError unknownNetworkError, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = unknownNetworkError.correlationId;
                }
                if ((i & 2) != 0) {
                    str2 = unknownNetworkError.errorMessage;
                }
                return unknownNetworkError.copy(str, str2);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult$Error$NoDataFoundError;", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult$Error;", "", "correlationId", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult$Error$NoDataFoundError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NoDataFoundError extends com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error {
            public static final int $stable = 0;
            private final java.lang.String correlationId;
            private final java.lang.String errorMessage;

            public NoDataFoundError(java.lang.String str, java.lang.String str2) {
                super(str, str2, null);
                this.correlationId = str;
                this.errorMessage = str2;
            }

            @Override // com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public /* synthetic */ NoDataFoundError(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "Expected data is null" : str2);
            }

            @Override // com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error
            public final java.lang.String getErrorMessage() {
                return this.errorMessage;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.correlationId;
                java.lang.String str2 = this.errorMessage;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NoDataFoundError(correlationId=");
                sb.append(str);
                sb.append(", errorMessage=");
                sb.append(str2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.correlationId;
                int hashCode = str == null ? 0 : str.hashCode();
                java.lang.String str2 = this.errorMessage;
                return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.NoDataFoundError)) {
                    return false;
                }
                com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.NoDataFoundError noDataFoundError = (com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.NoDataFoundError) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, noDataFoundError.correlationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, noDataFoundError.errorMessage);
            }

            public final com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.NoDataFoundError copy(java.lang.String correlationId, java.lang.String errorMessage) {
                return new com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.NoDataFoundError(correlationId, errorMessage);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getErrorMessage() {
                return this.errorMessage;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.NoDataFoundError copy$default(com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.NoDataFoundError noDataFoundError, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = noDataFoundError.correlationId;
                }
                if ((i & 2) != 0) {
                    str2 = noDataFoundError.errorMessage;
                }
                return noDataFoundError.copy(str, str2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public NoDataFoundError() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult$Error$GenericGraphQLError;", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult$Error;", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$GraphQLError$GraphQLErrorDetail;", "errorDetail", "<init>", "(Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$GraphQLError$GraphQLErrorDetail;)V", "component1", "()Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$GraphQLError$GraphQLErrorDetail;", "copy", "(Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$GraphQLError$GraphQLErrorDetail;)Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult$Error$GenericGraphQLError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/DataResultError$GraphQLError$GraphQLErrorDetail;", "getErrorDetail"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class GenericGraphQLError extends com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLErrorDetail errorDetail;

            public final com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GenericGraphQLError(com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLErrorDetail graphQLErrorDetail) {
                super(graphQLErrorDetail.getExtensions().getDebugId(), graphQLErrorDetail.getMessage(), null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLErrorDetail, "");
                this.errorDetail = graphQLErrorDetail;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLErrorDetail graphQLErrorDetail = this.errorDetail;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("GenericGraphQLError(errorDetail=");
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
                return (other instanceof com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.GenericGraphQLError) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetail, ((com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.GenericGraphQLError) other).errorDetail);
            }

            public final com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.GenericGraphQLError copy(com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLErrorDetail errorDetail) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetail, "");
                return new com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.GenericGraphQLError(errorDetail);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public static /* synthetic */ com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.GenericGraphQLError copy$default(com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult.Error.GenericGraphQLError genericGraphQLError, com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError.GraphQLError.GraphQLErrorDetail graphQLErrorDetail, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    graphQLErrorDetail = genericGraphQLError.errorDetail;
                }
                return genericGraphQLError.copy(graphQLErrorDetail);
            }
        }

        public /* synthetic */ Error(java.lang.String str, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }
    }

    public /* synthetic */ UseCaseResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
