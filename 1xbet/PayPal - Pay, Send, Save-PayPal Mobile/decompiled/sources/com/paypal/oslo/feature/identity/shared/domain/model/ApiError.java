package com.paypal.oslo.feature.identity.shared.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError;", "", "<init>", "()V", "HttpError", "NetworkError", "UnknownError", "Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError$HttpError;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError$NetworkError;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError$UnknownError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ApiError {
    public static final int $stable = 0;

    private ApiError() {
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError$HttpError;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError;", "", "code", "", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "<init>", "(ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError$HttpError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getCode", "Ljava/lang/String;", "getBody"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HttpError extends com.paypal.oslo.feature.identity.shared.domain.model.ApiError {
        public static final int $stable = 0;
        private final java.lang.String body;
        private final int code;

        public HttpError(int i, java.lang.String str) {
            super(null);
            this.code = i;
            this.body = str;
        }

        public final java.lang.String getBody() {
            return this.body;
        }

        public final int getCode() {
            return this.code;
        }

        public final java.lang.String toString() {
            int i = this.code;
            java.lang.String str = this.body;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HttpError(code=");
            sb.append(i);
            sb.append(", body=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Integer.hashCode(this.code);
            java.lang.String str = this.body;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.shared.domain.model.ApiError.HttpError)) {
                return false;
            }
            com.paypal.oslo.feature.identity.shared.domain.model.ApiError.HttpError httpError = (com.paypal.oslo.feature.identity.shared.domain.model.ApiError.HttpError) other;
            return this.code == httpError.code && kotlin.jvm.internal.Intrinsics.areEqual(this.body, httpError.body);
        }

        public final com.paypal.oslo.feature.identity.shared.domain.model.ApiError.HttpError copy(int code, java.lang.String body) {
            return new com.paypal.oslo.feature.identity.shared.domain.model.ApiError.HttpError(code, body);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getBody() {
            return this.body;
        }

        /* renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.ApiError.HttpError copy$default(com.paypal.oslo.feature.identity.shared.domain.model.ApiError.HttpError httpError, int i, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = httpError.code;
            }
            if ((i2 & 2) != 0) {
                str = httpError.body;
            }
            return httpError.copy(i, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError$NetworkError;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NetworkError extends com.paypal.oslo.feature.identity.shared.domain.model.ApiError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.shared.domain.model.ApiError.NetworkError INSTANCE = new com.paypal.oslo.feature.identity.shared.domain.model.ApiError.NetworkError();

        public final int hashCode() {
            return 492917781;
        }

        private NetworkError() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NetworkError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.shared.domain.model.ApiError.NetworkError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError$UnknownError;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError$UnknownError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnknownError extends com.paypal.oslo.feature.identity.shared.domain.model.ApiError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownError(java.lang.Throwable th) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
            this.cause = th;
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnknownError(cause=");
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
            return (other instanceof com.paypal.oslo.feature.identity.shared.domain.model.ApiError.UnknownError) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, ((com.paypal.oslo.feature.identity.shared.domain.model.ApiError.UnknownError) other).cause);
        }

        public final com.paypal.oslo.feature.identity.shared.domain.model.ApiError.UnknownError copy(java.lang.Throwable cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "");
            return new com.paypal.oslo.feature.identity.shared.domain.model.ApiError.UnknownError(cause);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.ApiError.UnknownError copy$default(com.paypal.oslo.feature.identity.shared.domain.model.ApiError.UnknownError unknownError, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = unknownError.cause;
            }
            return unknownError.copy(th);
        }
    }

    public /* synthetic */ ApiError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
