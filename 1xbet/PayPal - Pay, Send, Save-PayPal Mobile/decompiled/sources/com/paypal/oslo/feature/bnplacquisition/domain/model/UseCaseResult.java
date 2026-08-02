package com.paypal.oslo.feature.bnplacquisition.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0013\u0014\u0015B'\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00018\u00008\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f\u0082\u0001\u0003\u0016\u0017\u0018"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult;", "T", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "correlationId", "Ljava/lang/String;", "getCorrelationId", "()Ljava/lang/String;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "tag", "getTag", "Success", "Error", "Decline", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Decline;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class UseCaseResult<T> {
    public static final int $stable = 0;
    private final java.lang.String correlationId;
    private final T data;
    private final java.lang.String tag;

    private UseCaseResult(java.lang.String str, T t, java.lang.String str2) {
        this.correlationId = str;
        this.data = t;
        this.tag = str2;
    }

    public /* synthetic */ UseCaseResult(java.lang.String str, java.lang.Object obj, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? "" : str2, null);
    }

    public java.lang.String getCorrelationId() {
        return this.correlationId;
    }

    public T getData() {
        return this.data;
    }

    public java.lang.String getTag() {
        return this.tag;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0019\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00028\u0001HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00028\u00018\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Success;", "T", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult;", "", "correlationId", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId", "Ljava/lang/Object;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success<T> extends com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<T> {
        public static final int $stable = 8;
        private final java.lang.String correlationId;
        private final T data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(java.lang.String str, T t) {
            super(str, t, null, 4, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.correlationId = str;
            this.data = t;
        }

        public /* synthetic */ Success(java.lang.String str, java.lang.Object obj, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, obj);
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult
        public final T getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            T t = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(correlationId=");
            sb.append(str);
            sb.append(", data=");
            sb.append(t);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.correlationId.hashCode();
            T t = this.data;
            return (hashCode * 31) + (t == null ? 0 : t.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success success = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, success.correlationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, success.data);
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success<T> copy(java.lang.String correlationId, T data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(correlationId, "");
            return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success<>(correlationId, data);
        }

        public final T component2() {
            return this.data;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Success success, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = success.correlationId;
            }
            if ((i & 2) != 0) {
                obj = success.data;
            }
            return success.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0017\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&B'\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\u0082\u0001\u0017'()*+,-./0123456789:;<="}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult;", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "correlationId", "Ljava/lang/String;", "getCorrelationId", "()Ljava/lang/String;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getData", "tag", "getTag", "HttpError", "NoInternet", "MissingData", "MissingFieldError", "Generic", "UnknownNetworkError", "FullPageError", "ErrorList", "StorageError", "ApplicationStatusError", "FeatureNotAvailableError", "DeviceTokenPendingActiveError", "InvalidVirtualCardError", "IssuerDigitizationDataNotFoundError", "AddressNormalizationError", "RepaymentAuthenticationFailureError", "DownpaymentAuthorizationError", "FetchVccFailedError", "InvalidPhoneNumberError", "InvalidDateOfBirthError", "InvalidAgeError", "InvalidNationalIdentificationError", "UnknownGraphQLError", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$AddressNormalizationError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$ApplicationStatusError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$DeviceTokenPendingActiveError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$DownpaymentAuthorizationError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$ErrorList;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$FeatureNotAvailableError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$FetchVccFailedError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$FullPageError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$Generic;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$HttpError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$InvalidAgeError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$InvalidDateOfBirthError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$InvalidNationalIdentificationError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$InvalidPhoneNumberError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$InvalidVirtualCardError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$IssuerDigitizationDataNotFoundError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$MissingData;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$MissingFieldError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$NoInternet;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$RepaymentAuthenticationFailureError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$StorageError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$UnknownGraphQLError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$UnknownNetworkError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Error extends com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<java.lang.String> {
        public static final int $stable = 8;
        private final java.lang.String correlationId;
        private final java.lang.String data;
        private final java.lang.String tag;

        private Error(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super(str, str2, str3, null);
            this.correlationId = str;
            this.data = str2;
            this.tag = str3;
        }

        public /* synthetic */ Error(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, str3, null);
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult
        public java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult
        public java.lang.String getData() {
            return this.data;
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult
        public java.lang.String getTag() {
            return this.tag;
        }

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$HttpError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;", "", "correlationId", "", "code", "<init>", "(Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$HttpError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getCorrelationId", com.visa.cbp.getEncExpo.warmup, "getCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class HttpError extends com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error {
            public static final int $stable = 8;
            private final int code;
            private final java.lang.String correlationId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HttpError(java.lang.String str, int i) {
                super(str, null, "http_error", 2, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.correlationId = str;
                this.code = i;
            }

            public /* synthetic */ HttpError(java.lang.String str, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? "" : str, i);
            }

            public final int getCode() {
                return this.code;
            }

            @Override // com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error, com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.correlationId;
                int i = this.code;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("HttpError(correlationId=");
                sb.append(str);
                sb.append(", code=");
                sb.append(i);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.correlationId.hashCode() * 31) + java.lang.Integer.hashCode(this.code);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.HttpError)) {
                    return false;
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.HttpError httpError = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.HttpError) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, httpError.correlationId) && this.code == httpError.code;
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.HttpError copy(java.lang.String correlationId, int code) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(correlationId, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.HttpError(correlationId, code);
            }

            /* renamed from: component2, reason: from getter */
            public final int getCode() {
                return this.code;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.HttpError copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.HttpError httpError, java.lang.String str, int i, int i2, java.lang.Object obj) {
                if ((i2 & 1) != 0) {
                    str = httpError.correlationId;
                }
                if ((i2 & 2) != 0) {
                    i = httpError.code;
                }
                return httpError.copy(str, i);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$NoInternet;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$NoInternet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NoInternet extends com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error {
            public static final int $stable = 8;
            private final java.lang.String data;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NoInternet(java.lang.String str) {
                super("", str, com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Error.NO_INTERNET_ERROR, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.data = str;
            }

            @Override // com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error, com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult
            public final /* bridge */ /* synthetic */ java.lang.String getData() {
                return getData();
            }

            @Override // com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error, com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult
            public final java.lang.String getData() {
                return this.data;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.data;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NoInternet(data=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.data.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.NoInternet) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.NoInternet) other).data);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.NoInternet copy(java.lang.String data) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.NoInternet(data);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getData() {
                return this.data;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.NoInternet copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.NoInternet noInternet, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = noInternet.data;
                }
                return noInternet.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$MissingData;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$MissingData;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MissingData extends com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error {
            public static final int $stable = 8;
            private final java.lang.String correlationId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MissingData(java.lang.String str) {
                super(str, null, "missing_data_error", 2, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.correlationId = str;
            }

            public /* synthetic */ MissingData(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }

            @Override // com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error, com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.correlationId;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("MissingData(correlationId=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.correlationId.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.MissingData) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.MissingData) other).correlationId);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.MissingData copy(java.lang.String correlationId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(correlationId, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.MissingData(correlationId);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.MissingData copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.MissingData missingData, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = missingData.correlationId;
                }
                return missingData.copy(str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public MissingData() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$MissingFieldError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$MissingFieldError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MissingFieldError extends com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error {
            public static final int $stable = 8;
            private final java.lang.String correlationId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MissingFieldError(java.lang.String str) {
                super(str, null, "missing_field_error", 2, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.correlationId = str;
            }

            public /* synthetic */ MissingFieldError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }

            @Override // com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error, com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.correlationId;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("MissingFieldError(correlationId=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.correlationId.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.MissingFieldError) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.MissingFieldError) other).correlationId);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.MissingFieldError copy(java.lang.String correlationId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(correlationId, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.MissingFieldError(correlationId);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.MissingFieldError copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.MissingFieldError missingFieldError, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = missingFieldError.correlationId;
                }
                return missingFieldError.copy(str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public MissingFieldError() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$Generic;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$Generic;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Generic extends com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error {
            public static final int $stable = 8;
            private final java.lang.String correlationId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Generic(java.lang.String str) {
                super(str, null, com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Error.GENERIC_ERROR, 2, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.correlationId = str;
            }

            public /* synthetic */ Generic(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }

            @Override // com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error, com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.correlationId;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Generic(correlationId=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.correlationId.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.Generic) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.Generic) other).correlationId);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.Generic copy(java.lang.String correlationId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(correlationId, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.Generic(correlationId);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.Generic copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.Generic generic, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = generic.correlationId;
                }
                return generic.copy(str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Generic() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$UnknownNetworkError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$UnknownNetworkError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class UnknownNetworkError extends com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error {
            public static final int $stable = 8;
            private final java.lang.String correlationId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnknownNetworkError(java.lang.String str) {
                super(str, null, "unknown_network_error", 2, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.correlationId = str;
            }

            public /* synthetic */ UnknownNetworkError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }

            @Override // com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error, com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.correlationId;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("UnknownNetworkError(correlationId=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.correlationId.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.UnknownNetworkError) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.UnknownNetworkError) other).correlationId);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.UnknownNetworkError copy(java.lang.String correlationId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(correlationId, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.UnknownNetworkError(correlationId);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.UnknownNetworkError copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.UnknownNetworkError unknownNetworkError, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = unknownNetworkError.correlationId;
                }
                return unknownNetworkError.copy(str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public UnknownNetworkError() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$FullPageError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$FullPageError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class FullPageError extends com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error {
            public static final int $stable = 8;
            private final java.lang.String correlationId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FullPageError(java.lang.String str) {
                super(str, null, "full_page_error", 2, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.correlationId = str;
            }

            public /* synthetic */ FullPageError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }

            @Override // com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error, com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.correlationId;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("FullPageError(correlationId=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.correlationId.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.FullPageError) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.FullPageError) other).correlationId);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.FullPageError copy(java.lang.String correlationId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(correlationId, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.FullPageError(correlationId);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.FullPageError copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.FullPageError fullPageError, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = fullPageError.correlationId;
                }
                return fullPageError.copy(str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public FullPageError() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$ErrorList;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$ErrorList;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ErrorList extends com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error {
            public static final int $stable = 8;
            private final java.lang.String correlationId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ErrorList(java.lang.String str) {
                super(str, null, "error_list", 2, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.correlationId = str;
            }

            public /* synthetic */ ErrorList(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }

            @Override // com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error, com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.correlationId;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ErrorList(correlationId=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.correlationId.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.ErrorList) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.ErrorList) other).correlationId);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.ErrorList copy(java.lang.String correlationId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(correlationId, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.ErrorList(correlationId);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.ErrorList copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.ErrorList errorList, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = errorList.correlationId;
                }
                return errorList.copy(str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public ErrorList() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$StorageError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$StorageError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class StorageError extends com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error {
            public static final int $stable = 8;
            private final java.lang.String correlationId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StorageError(java.lang.String str) {
                super(str, null, "storage_error", 2, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.correlationId = str;
            }

            public /* synthetic */ StorageError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }

            @Override // com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error, com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.correlationId;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("StorageError(correlationId=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.correlationId.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.StorageError) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.StorageError) other).correlationId);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.StorageError copy(java.lang.String correlationId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(correlationId, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.StorageError(correlationId);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.StorageError copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.StorageError storageError, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = storageError.correlationId;
                }
                return storageError.copy(str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public StorageError() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$ApplicationStatusError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$ApplicationStatusError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ApplicationStatusError extends com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error {
            public static final int $stable = 8;
            private final java.lang.String correlationId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ApplicationStatusError(java.lang.String str) {
                super(str, null, "application_status_error", 2, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.correlationId = str;
            }

            public /* synthetic */ ApplicationStatusError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }

            @Override // com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error, com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.correlationId;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ApplicationStatusError(correlationId=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.correlationId.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.ApplicationStatusError) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.ApplicationStatusError) other).correlationId);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.ApplicationStatusError copy(java.lang.String correlationId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(correlationId, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.ApplicationStatusError(correlationId);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.ApplicationStatusError copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.ApplicationStatusError applicationStatusError, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = applicationStatusError.correlationId;
                }
                return applicationStatusError.copy(str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public ApplicationStatusError() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$FeatureNotAvailableError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "errorDetail", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$FeatureNotAvailableError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "getErrorDetail"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class FeatureNotAvailableError extends com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail;

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public FeatureNotAvailableError(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail) {
                super(r1 == null ? "" : r1, null, "graphql_feature_not_available", 2, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLErrorDetail, "");
                java.lang.String debugId = graphQLErrorDetail.getExtensions().getDebugId();
                this.errorDetail = graphQLErrorDetail;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail = this.errorDetail;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("FeatureNotAvailableError(errorDetail=");
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
                return (other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.FeatureNotAvailableError) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetail, ((com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.FeatureNotAvailableError) other).errorDetail);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.FeatureNotAvailableError copy(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetail, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.FeatureNotAvailableError(errorDetail);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.FeatureNotAvailableError copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.FeatureNotAvailableError featureNotAvailableError, com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    graphQLErrorDetail = featureNotAvailableError.errorDetail;
                }
                return featureNotAvailableError.copy(graphQLErrorDetail);
            }
        }

        @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$DeviceTokenPendingActiveError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "errorDetail", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/ProvisionedToken;", "pendingActiveToken", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/ProvisionedToken;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/ProvisionedToken;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/ProvisionedToken;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$DeviceTokenPendingActiveError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "getErrorDetail", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/ProvisionedToken;", "getPendingActiveToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DeviceTokenPendingActiveError extends com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail;
            private final com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken pendingActiveToken;

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken getPendingActiveToken() {
                return this.pendingActiveToken;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public DeviceTokenPendingActiveError(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken provisionedToken) {
                super(r1 == null ? "" : r1, null, "graphql_device_token_pending", 2, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLErrorDetail, "");
                java.lang.String debugId = graphQLErrorDetail.getExtensions().getDebugId();
                this.errorDetail = graphQLErrorDetail;
                this.pendingActiveToken = provisionedToken;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail = this.errorDetail;
                com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken provisionedToken = this.pendingActiveToken;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("DeviceTokenPendingActiveError(errorDetail=");
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
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.DeviceTokenPendingActiveError)) {
                    return false;
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.DeviceTokenPendingActiveError deviceTokenPendingActiveError = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.DeviceTokenPendingActiveError) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetail, deviceTokenPendingActiveError.errorDetail) && kotlin.jvm.internal.Intrinsics.areEqual(this.pendingActiveToken, deviceTokenPendingActiveError.pendingActiveToken);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.DeviceTokenPendingActiveError copy(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail, com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken pendingActiveToken) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetail, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.DeviceTokenPendingActiveError(errorDetail, pendingActiveToken);
            }

            /* renamed from: component2, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken getPendingActiveToken() {
                return this.pendingActiveToken;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.DeviceTokenPendingActiveError copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.DeviceTokenPendingActiveError deviceTokenPendingActiveError, com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken provisionedToken, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    graphQLErrorDetail = deviceTokenPendingActiveError.errorDetail;
                }
                if ((i & 2) != 0) {
                    provisionedToken = deviceTokenPendingActiveError.pendingActiveToken;
                }
                return deviceTokenPendingActiveError.copy(graphQLErrorDetail, provisionedToken);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$InvalidVirtualCardError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "errorDetail", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$InvalidVirtualCardError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "getErrorDetail"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InvalidVirtualCardError extends com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail;

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public InvalidVirtualCardError(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail) {
                super(r1 == null ? "" : r1, null, "graphql_invalid_virtual_card", 2, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLErrorDetail, "");
                java.lang.String debugId = graphQLErrorDetail.getExtensions().getDebugId();
                this.errorDetail = graphQLErrorDetail;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail = this.errorDetail;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("InvalidVirtualCardError(errorDetail=");
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
                return (other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidVirtualCardError) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetail, ((com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidVirtualCardError) other).errorDetail);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidVirtualCardError copy(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetail, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidVirtualCardError(errorDetail);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidVirtualCardError copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidVirtualCardError invalidVirtualCardError, com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    graphQLErrorDetail = invalidVirtualCardError.errorDetail;
                }
                return invalidVirtualCardError.copy(graphQLErrorDetail);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$IssuerDigitizationDataNotFoundError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "errorDetail", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$IssuerDigitizationDataNotFoundError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "getErrorDetail"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class IssuerDigitizationDataNotFoundError extends com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail;

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public IssuerDigitizationDataNotFoundError(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail) {
                super(r1 == null ? "" : r1, null, "graphql_issuer_digitization_not_found", 2, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLErrorDetail, "");
                java.lang.String debugId = graphQLErrorDetail.getExtensions().getDebugId();
                this.errorDetail = graphQLErrorDetail;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail = this.errorDetail;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("IssuerDigitizationDataNotFoundError(errorDetail=");
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
                return (other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.IssuerDigitizationDataNotFoundError) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetail, ((com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.IssuerDigitizationDataNotFoundError) other).errorDetail);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.IssuerDigitizationDataNotFoundError copy(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetail, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.IssuerDigitizationDataNotFoundError(errorDetail);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.IssuerDigitizationDataNotFoundError copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.IssuerDigitizationDataNotFoundError issuerDigitizationDataNotFoundError, com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    graphQLErrorDetail = issuerDigitizationDataNotFoundError.errorDetail;
                }
                return issuerDigitizationDataNotFoundError.copy(graphQLErrorDetail);
            }
        }

        @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$AddressNormalizationError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "errorDetail", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/Address;", "address", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/Address;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/Address;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/Address;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$AddressNormalizationError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "getErrorDetail", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/Address;", "getAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class AddressNormalizationError extends com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address;
            private final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail;

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address getAddress() {
                return this.address;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public AddressNormalizationError(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address) {
                super(r1 == null ? "" : r1, null, "graphql_address_normalization", 2, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLErrorDetail, "");
                java.lang.String debugId = graphQLErrorDetail.getExtensions().getDebugId();
                this.errorDetail = graphQLErrorDetail;
                this.address = address;
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
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.AddressNormalizationError)) {
                    return false;
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.AddressNormalizationError addressNormalizationError = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.AddressNormalizationError) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetail, addressNormalizationError.errorDetail) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, addressNormalizationError.address);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.AddressNormalizationError copy(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail, com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetail, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.AddressNormalizationError(errorDetail, address);
            }

            /* renamed from: component2, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address getAddress() {
                return this.address;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.AddressNormalizationError copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.AddressNormalizationError addressNormalizationError, com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    graphQLErrorDetail = addressNormalizationError.errorDetail;
                }
                if ((i & 2) != 0) {
                    address = addressNormalizationError.address;
                }
                return addressNormalizationError.copy(graphQLErrorDetail, address);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$RepaymentAuthenticationFailureError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "errorDetail", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$RepaymentAuthenticationFailureError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "getErrorDetail"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class RepaymentAuthenticationFailureError extends com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail;

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public RepaymentAuthenticationFailureError(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail) {
                super(r1 == null ? "" : r1, null, "graphql_repayment_auth_failure", 2, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLErrorDetail, "");
                java.lang.String debugId = graphQLErrorDetail.getExtensions().getDebugId();
                this.errorDetail = graphQLErrorDetail;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail = this.errorDetail;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("RepaymentAuthenticationFailureError(errorDetail=");
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
                return (other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.RepaymentAuthenticationFailureError) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetail, ((com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.RepaymentAuthenticationFailureError) other).errorDetail);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.RepaymentAuthenticationFailureError copy(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetail, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.RepaymentAuthenticationFailureError(errorDetail);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.RepaymentAuthenticationFailureError copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.RepaymentAuthenticationFailureError repaymentAuthenticationFailureError, com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    graphQLErrorDetail = repaymentAuthenticationFailureError.errorDetail;
                }
                return repaymentAuthenticationFailureError.copy(graphQLErrorDetail);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$DownpaymentAuthorizationError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "errorDetail", "", "reason", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$DownpaymentAuthorizationError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "getErrorDetail", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DownpaymentAuthorizationError extends com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail;
            private final java.lang.String reason;

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public final java.lang.String getReason() {
                return this.reason;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public DownpaymentAuthorizationError(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, java.lang.String str) {
                super(r1 == null ? "" : r1, null, "graphql_downpayment_authorization", 2, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLErrorDetail, "");
                java.lang.String debugId = graphQLErrorDetail.getExtensions().getDebugId();
                this.errorDetail = graphQLErrorDetail;
                this.reason = str;
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
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.DownpaymentAuthorizationError)) {
                    return false;
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.DownpaymentAuthorizationError downpaymentAuthorizationError = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.DownpaymentAuthorizationError) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetail, downpaymentAuthorizationError.errorDetail) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, downpaymentAuthorizationError.reason);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.DownpaymentAuthorizationError copy(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail, java.lang.String reason) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetail, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.DownpaymentAuthorizationError(errorDetail, reason);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getReason() {
                return this.reason;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.DownpaymentAuthorizationError copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.DownpaymentAuthorizationError downpaymentAuthorizationError, com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    graphQLErrorDetail = downpaymentAuthorizationError.errorDetail;
                }
                if ((i & 2) != 0) {
                    str = downpaymentAuthorizationError.reason;
                }
                return downpaymentAuthorizationError.copy(graphQLErrorDetail, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$FetchVccFailedError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "errorDetail", "", "creditAccountId", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$FetchVccFailedError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "getErrorDetail", "Ljava/lang/String;", "getCreditAccountId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class FetchVccFailedError extends com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error {
            public static final int $stable = 8;
            private final java.lang.String creditAccountId;
            private final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail;

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public final java.lang.String getCreditAccountId() {
                return this.creditAccountId;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public FetchVccFailedError(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, java.lang.String str) {
                super(r1 == null ? "" : r1, null, "graphql_fetch_vcc_failed", 2, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLErrorDetail, "");
                java.lang.String debugId = graphQLErrorDetail.getExtensions().getDebugId();
                this.errorDetail = graphQLErrorDetail;
                this.creditAccountId = str;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail = this.errorDetail;
                java.lang.String str = this.creditAccountId;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("FetchVccFailedError(errorDetail=");
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
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.FetchVccFailedError)) {
                    return false;
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.FetchVccFailedError fetchVccFailedError = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.FetchVccFailedError) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetail, fetchVccFailedError.errorDetail) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, fetchVccFailedError.creditAccountId);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.FetchVccFailedError copy(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail, java.lang.String creditAccountId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetail, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.FetchVccFailedError(errorDetail, creditAccountId);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getCreditAccountId() {
                return this.creditAccountId;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.FetchVccFailedError copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.FetchVccFailedError fetchVccFailedError, com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    graphQLErrorDetail = fetchVccFailedError.errorDetail;
                }
                if ((i & 2) != 0) {
                    str = fetchVccFailedError.creditAccountId;
                }
                return fetchVccFailedError.copy(graphQLErrorDetail, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$InvalidPhoneNumberError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "errorDetail", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$InvalidPhoneNumberError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "getErrorDetail"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InvalidPhoneNumberError extends com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail;

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public InvalidPhoneNumberError(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail) {
                super(r1 == null ? "" : r1, null, "graphql_invalid_phone_number", 2, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLErrorDetail, "");
                java.lang.String debugId = graphQLErrorDetail.getExtensions().getDebugId();
                this.errorDetail = graphQLErrorDetail;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail = this.errorDetail;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("InvalidPhoneNumberError(errorDetail=");
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
                return (other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidPhoneNumberError) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetail, ((com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidPhoneNumberError) other).errorDetail);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidPhoneNumberError copy(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetail, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidPhoneNumberError(errorDetail);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidPhoneNumberError copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidPhoneNumberError invalidPhoneNumberError, com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    graphQLErrorDetail = invalidPhoneNumberError.errorDetail;
                }
                return invalidPhoneNumberError.copy(graphQLErrorDetail);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$InvalidDateOfBirthError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "errorDetail", "", "reason", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$InvalidDateOfBirthError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "getErrorDetail", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InvalidDateOfBirthError extends com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail;
            private final java.lang.String reason;

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public final java.lang.String getReason() {
                return this.reason;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public InvalidDateOfBirthError(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, java.lang.String str) {
                super(r1 == null ? "" : r1, null, "graphql_invalid_date_of_birth", 2, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLErrorDetail, "");
                java.lang.String debugId = graphQLErrorDetail.getExtensions().getDebugId();
                this.errorDetail = graphQLErrorDetail;
                this.reason = str;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail = this.errorDetail;
                java.lang.String str = this.reason;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("InvalidDateOfBirthError(errorDetail=");
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
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidDateOfBirthError)) {
                    return false;
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidDateOfBirthError invalidDateOfBirthError = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidDateOfBirthError) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetail, invalidDateOfBirthError.errorDetail) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, invalidDateOfBirthError.reason);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidDateOfBirthError copy(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail, java.lang.String reason) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetail, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidDateOfBirthError(errorDetail, reason);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getReason() {
                return this.reason;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidDateOfBirthError copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidDateOfBirthError invalidDateOfBirthError, com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    graphQLErrorDetail = invalidDateOfBirthError.errorDetail;
                }
                if ((i & 2) != 0) {
                    str = invalidDateOfBirthError.reason;
                }
                return invalidDateOfBirthError.copy(graphQLErrorDetail, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$InvalidAgeError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "errorDetail", "", "reason", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$InvalidAgeError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "getErrorDetail", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InvalidAgeError extends com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail;
            private final java.lang.String reason;

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public final java.lang.String getReason() {
                return this.reason;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public InvalidAgeError(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, java.lang.String str) {
                super(r1 == null ? "" : r1, null, "graphql_invalid_age", 2, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLErrorDetail, "");
                java.lang.String debugId = graphQLErrorDetail.getExtensions().getDebugId();
                this.errorDetail = graphQLErrorDetail;
                this.reason = str;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail = this.errorDetail;
                java.lang.String str = this.reason;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("InvalidAgeError(errorDetail=");
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
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidAgeError)) {
                    return false;
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidAgeError invalidAgeError = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidAgeError) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetail, invalidAgeError.errorDetail) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, invalidAgeError.reason);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidAgeError copy(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail, java.lang.String reason) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetail, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidAgeError(errorDetail, reason);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getReason() {
                return this.reason;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidAgeError copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidAgeError invalidAgeError, com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    graphQLErrorDetail = invalidAgeError.errorDetail;
                }
                if ((i & 2) != 0) {
                    str = invalidAgeError.reason;
                }
                return invalidAgeError.copy(graphQLErrorDetail, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$InvalidNationalIdentificationError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "errorDetail", "", "reason", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$InvalidNationalIdentificationError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "getErrorDetail", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InvalidNationalIdentificationError extends com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail;
            private final java.lang.String reason;

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public final java.lang.String getReason() {
                return this.reason;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public InvalidNationalIdentificationError(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, java.lang.String str) {
                super(r1 == null ? "" : r1, null, "graphql_invalid_national_id", 2, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLErrorDetail, "");
                java.lang.String debugId = graphQLErrorDetail.getExtensions().getDebugId();
                this.errorDetail = graphQLErrorDetail;
                this.reason = str;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail = this.errorDetail;
                java.lang.String str = this.reason;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("InvalidNationalIdentificationError(errorDetail=");
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
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidNationalIdentificationError)) {
                    return false;
                }
                com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidNationalIdentificationError invalidNationalIdentificationError = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidNationalIdentificationError) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetail, invalidNationalIdentificationError.errorDetail) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, invalidNationalIdentificationError.reason);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidNationalIdentificationError copy(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail, java.lang.String reason) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetail, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidNationalIdentificationError(errorDetail, reason);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getReason() {
                return this.reason;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidNationalIdentificationError copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidNationalIdentificationError invalidNationalIdentificationError, com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    graphQLErrorDetail = invalidNationalIdentificationError.errorDetail;
                }
                if ((i & 2) != 0) {
                    str = invalidNationalIdentificationError.reason;
                }
                return invalidNationalIdentificationError.copy(graphQLErrorDetail, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$UnknownGraphQLError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "errorDetail", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error$UnknownGraphQLError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL$GraphQLErrorDetail;", "getErrorDetail"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class UnknownGraphQLError extends com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail;

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public UnknownGraphQLError(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail) {
                super(r1 == null ? "" : r1, null, "graphql_unknown", 2, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLErrorDetail, "");
                java.lang.String debugId = graphQLErrorDetail.getExtensions().getDebugId();
                this.errorDetail = graphQLErrorDetail;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail = this.errorDetail;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("UnknownGraphQLError(errorDetail=");
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
                return (other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.UnknownGraphQLError) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDetail, ((com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.UnknownGraphQLError) other).errorDetail);
            }

            public final com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.UnknownGraphQLError copy(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDetail, "");
                return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.UnknownGraphQLError(errorDetail);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail getErrorDetail() {
                return this.errorDetail;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.UnknownGraphQLError copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.UnknownGraphQLError unknownGraphQLError, com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail graphQLErrorDetail, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    graphQLErrorDetail = unknownGraphQLError.errorDetail;
                }
                return unknownGraphQLError.copy(graphQLErrorDetail);
            }
        }

        public /* synthetic */ Error(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Decline;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult;", "", "correlationId", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Decline;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Decline extends com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult<java.lang.String> {
        public static final int $stable = 8;
        private final java.lang.String correlationId;
        private final java.lang.String data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Decline(java.lang.String str, java.lang.String str2) {
            super(str, str2, "decline", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.correlationId = str;
            this.data = str2;
        }

        public /* synthetic */ Decline(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2);
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        @Override // com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult
        public final java.lang.String getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            java.lang.String str2 = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Decline(correlationId=");
            sb.append(str);
            sb.append(", data=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.correlationId.hashCode();
            java.lang.String str = this.data;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline decline = (com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, decline.correlationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, decline.data);
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline copy(java.lang.String correlationId, java.lang.String data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(correlationId, "");
            return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline(correlationId, data);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getData() {
            return this.data;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Decline decline, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = decline.correlationId;
            }
            if ((i & 2) != 0) {
                str2 = decline.data;
            }
            return decline.copy(str, str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Decline() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ UseCaseResult(java.lang.String str, java.lang.Object obj, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, obj, str2);
    }
}
