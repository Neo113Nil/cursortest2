package com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\u0013\u0014B+\b\u0004\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00018\u00008\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f\u0082\u0001\u0002\u0015\u0016"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult;", "T", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "correlationId", "Ljava/lang/String;", "getCorrelationId", "()Ljava/lang/String;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "tag", "getTag", "Success", "Error", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
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

    public java.lang.String getCorrelationId() {
        return this.correlationId;
    }

    public T getData() {
        return this.data;
    }

    public /* synthetic */ UseCaseResult(java.lang.String str, java.lang.Object obj, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? "" : str2, null);
    }

    public java.lang.String getTag() {
        return this.tag;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001b\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00028\u0001HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00028\u00018\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Success;", "T", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult;", "", "correlationId", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId", "Ljava/lang/Object;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success<T> extends com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<T> {
        public static final int $stable = 8;
        private final java.lang.String correlationId;
        private final T data;

        public Success(java.lang.String str, T t) {
            super(str, t, null, 4, null);
            this.correlationId = str;
            this.data = t;
        }

        public /* synthetic */ Success(java.lang.String str, java.lang.Object obj, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, obj);
        }

        @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult
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
            java.lang.String str = this.correlationId;
            int hashCode = str == null ? 0 : str.hashCode();
            T t = this.data;
            return (hashCode * 31) + (t != null ? t.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Success)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Success success = (com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, success.correlationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, success.data);
        }

        public final com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Success<T> copy(java.lang.String correlationId, T data) {
            return new com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Success<>(correlationId, data);
        }

        public final T component2() {
            return this.data;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Success copy$default(com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Success success, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = success.correlationId;
            }
            if ((i & 2) != 0) {
                obj = success.data;
            }
            return success.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002:\t\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\u001d\b\u0004\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b\u0082\u0001\t\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error;", "T", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "correlationId", "Ljava/lang/String;", "getCorrelationId", "()Ljava/lang/String;", "tag", "getTag", "HttpError", "NoInternet", "MissingData", "MissingFieldError", "Generic", "FullPageError", "ErrorList", "StorageError", "ApplicationStatusError", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error$ApplicationStatusError;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error$ErrorList;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error$FullPageError;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error$Generic;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error$HttpError;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error$MissingData;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error$MissingFieldError;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error$NoInternet;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error$StorageError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Error<T> extends com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<T> {
        public static final int $stable = 8;
        private final java.lang.String correlationId;
        private final java.lang.String tag;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Error(java.lang.String str, java.lang.String str2) {
            super(str, r0, str2, r0);
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            this.correlationId = str;
            this.tag = str2;
        }

        public /* synthetic */ Error(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, str2, null);
        }

        @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult
        public java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult
        public java.lang.String getTag() {
            return this.tag;
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u001b\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error$HttpError;", "T", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error;", "", "correlationId", "", "code", "<init>", "(Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error$HttpError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getCorrelationId", com.visa.cbp.getEncExpo.warmup, "getCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class HttpError<T> extends com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error<T> {
            public static final int $stable = 8;
            private final int code;
            private final java.lang.String correlationId;

            public HttpError(java.lang.String str, int i) {
                super(str, "http_error", null);
                this.correlationId = str;
                this.code = i;
            }

            public /* synthetic */ HttpError(java.lang.String str, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? null : str, i);
            }

            public final int getCode() {
                return this.code;
            }

            @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error, com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult
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
                java.lang.String str = this.correlationId;
                return ((str == null ? 0 : str.hashCode()) * 31) + java.lang.Integer.hashCode(this.code);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.HttpError)) {
                    return false;
                }
                com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.HttpError httpError = (com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.HttpError) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, httpError.correlationId) && this.code == httpError.code;
            }

            public final com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.HttpError<T> copy(java.lang.String correlationId, int code) {
                return new com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.HttpError<>(correlationId, code);
            }

            /* renamed from: component2, reason: from getter */
            public final int getCode() {
                return this.code;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.HttpError copy$default(com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.HttpError httpError, java.lang.String str, int i, int i2, java.lang.Object obj) {
                if ((i2 & 1) != 0) {
                    str = httpError.correlationId;
                }
                if ((i2 & 2) != 0) {
                    i = httpError.code;
                }
                return httpError.copy(str, i);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error$NoInternet;", "T", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error$NoInternet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NoInternet<T> extends com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error<T> {
            public static final int $stable = 8;
            private final java.lang.String correlationId;

            public NoInternet(java.lang.String str) {
                super(str, com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Error.NO_INTERNET_ERROR, null);
                this.correlationId = str;
            }

            public /* synthetic */ NoInternet(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error, com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.correlationId;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NoInternet(correlationId=");
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
                return (other instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.NoInternet) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.NoInternet) other).correlationId);
            }

            public final com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.NoInternet<T> copy(java.lang.String correlationId) {
                return new com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.NoInternet<>(correlationId);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.NoInternet copy$default(com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.NoInternet noInternet, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = noInternet.correlationId;
                }
                return noInternet.copy(str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public NoInternet() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error$MissingData;", "T", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error$MissingData;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MissingData<T> extends com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error<T> {
            public static final int $stable = 8;
            private final java.lang.String correlationId;

            public MissingData(java.lang.String str) {
                super(str, "missing_data_error", null);
                this.correlationId = str;
            }

            public /* synthetic */ MissingData(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error, com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult
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
                return (other instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.MissingData) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.MissingData) other).correlationId);
            }

            public final com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.MissingData<T> copy(java.lang.String correlationId) {
                return new com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.MissingData<>(correlationId);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.MissingData copy$default(com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.MissingData missingData, java.lang.String str, int i, java.lang.Object obj) {
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

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error$MissingFieldError;", "T", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error$MissingFieldError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MissingFieldError<T> extends com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error<T> {
            public static final int $stable = 8;
            private final java.lang.String correlationId;

            public MissingFieldError(java.lang.String str) {
                super(str, "missing_field_error", null);
                this.correlationId = str;
            }

            public /* synthetic */ MissingFieldError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error, com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult
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
                return (other instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.MissingFieldError) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.MissingFieldError) other).correlationId);
            }

            public final com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.MissingFieldError<T> copy(java.lang.String correlationId) {
                return new com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.MissingFieldError<>(correlationId);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.MissingFieldError copy$default(com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.MissingFieldError missingFieldError, java.lang.String str, int i, java.lang.Object obj) {
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

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error$Generic;", "T", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error$Generic;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Generic<T> extends com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error<T> {
            public static final int $stable = 8;
            private final java.lang.String correlationId;

            public Generic(java.lang.String str) {
                super(str, com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Error.GENERIC_ERROR, null);
                this.correlationId = str;
            }

            public /* synthetic */ Generic(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error, com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult
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
                return (other instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.Generic) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.Generic) other).correlationId);
            }

            public final com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.Generic<T> copy(java.lang.String correlationId) {
                return new com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.Generic<>(correlationId);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.Generic copy$default(com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.Generic generic, java.lang.String str, int i, java.lang.Object obj) {
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

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error$FullPageError;", "T", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error$FullPageError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class FullPageError<T> extends com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error<T> {
            public static final int $stable = 8;
            private final java.lang.String correlationId;

            public FullPageError(java.lang.String str) {
                super(str, "full_page_error", null);
                this.correlationId = str;
            }

            public /* synthetic */ FullPageError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error, com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult
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
                return (other instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.FullPageError) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.FullPageError) other).correlationId);
            }

            public final com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.FullPageError<T> copy(java.lang.String correlationId) {
                return new com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.FullPageError<>(correlationId);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.FullPageError copy$default(com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.FullPageError fullPageError, java.lang.String str, int i, java.lang.Object obj) {
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

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error$ErrorList;", "T", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error$ErrorList;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ErrorList<T> extends com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error<T> {
            public static final int $stable = 8;
            private final java.lang.String correlationId;

            public ErrorList(java.lang.String str) {
                super(str, "error_list", null);
                this.correlationId = str;
            }

            public /* synthetic */ ErrorList(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error, com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult
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
                return (other instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.ErrorList) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.ErrorList) other).correlationId);
            }

            public final com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.ErrorList<T> copy(java.lang.String correlationId) {
                return new com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.ErrorList<>(correlationId);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.ErrorList copy$default(com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.ErrorList errorList, java.lang.String str, int i, java.lang.Object obj) {
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

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error$StorageError;", "T", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error$StorageError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class StorageError<T> extends com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error<T> {
            public static final int $stable = 8;
            private final java.lang.String correlationId;

            public StorageError(java.lang.String str) {
                super(str, "storage_error", null);
                this.correlationId = str;
            }

            public /* synthetic */ StorageError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error, com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult
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
                return (other instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.StorageError) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.StorageError) other).correlationId);
            }

            public final com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.StorageError<T> copy(java.lang.String correlationId) {
                return new com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.StorageError<>(correlationId);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.StorageError copy$default(com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.StorageError storageError, java.lang.String str, int i, java.lang.Object obj) {
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

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error$ApplicationStatusError;", "T", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/usecase/UseCaseResult$Error$ApplicationStatusError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ApplicationStatusError<T> extends com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error<T> {
            public static final int $stable = 8;
            private final java.lang.String correlationId;

            public ApplicationStatusError(java.lang.String str) {
                super(str, "application_status_error", null);
                this.correlationId = str;
            }

            public /* synthetic */ ApplicationStatusError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error, com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult
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
                return (other instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.ApplicationStatusError) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.ApplicationStatusError) other).correlationId);
            }

            public final com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.ApplicationStatusError<T> copy(java.lang.String correlationId) {
                return new com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.ApplicationStatusError<>(correlationId);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.ApplicationStatusError copy$default(com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.ApplicationStatusError applicationStatusError, java.lang.String str, int i, java.lang.Object obj) {
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

        public /* synthetic */ Error(java.lang.String str, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }
    }

    public /* synthetic */ UseCaseResult(java.lang.String str, java.lang.Object obj, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, obj, str2);
    }
}
