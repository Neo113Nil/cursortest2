package com.paypal.oslo.feature.oneonboarding.domain.error;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/domain/error/NetworkErrorType;", "", "<init>", "()V", "NoInternet", "HttpError", "Lcom/paypal/oslo/feature/oneonboarding/domain/error/NetworkErrorType$HttpError;", "Lcom/paypal/oslo/feature/oneonboarding/domain/error/NetworkErrorType$NoInternet;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class NetworkErrorType {
    public static final int $stable = 0;

    private NetworkErrorType() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/domain/error/NetworkErrorType$NoInternet;", "Lcom/paypal/oslo/feature/oneonboarding/domain/error/NetworkErrorType;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/oneonboarding/domain/error/NetworkErrorType$NoInternet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoInternet extends com.paypal.oslo.feature.oneonboarding.domain.error.NetworkErrorType {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoInternet(java.lang.Throwable th) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
            this.cause = th;
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NoInternet(cause=");
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
            return (other instanceof com.paypal.oslo.feature.oneonboarding.domain.error.NetworkErrorType.NoInternet) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, ((com.paypal.oslo.feature.oneonboarding.domain.error.NetworkErrorType.NoInternet) other).cause);
        }

        public final com.paypal.oslo.feature.oneonboarding.domain.error.NetworkErrorType.NoInternet copy(java.lang.Throwable cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "");
            return new com.paypal.oslo.feature.oneonboarding.domain.error.NetworkErrorType.NoInternet(cause);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.domain.error.NetworkErrorType.NoInternet copy$default(com.paypal.oslo.feature.oneonboarding.domain.error.NetworkErrorType.NoInternet noInternet, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = noInternet.cause;
            }
            return noInternet.copy(th);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/domain/error/NetworkErrorType$HttpError;", "Lcom/paypal/oslo/feature/oneonboarding/domain/error/NetworkErrorType;", "", "code", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/oneonboarding/domain/error/NetworkErrorType$HttpError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HttpError extends com.paypal.oslo.feature.oneonboarding.domain.error.NetworkErrorType {
        public static final int $stable = 0;
        private final int code;

        public HttpError(int i) {
            super(null);
            this.code = i;
        }

        public final int getCode() {
            return this.code;
        }

        public final java.lang.String toString() {
            int i = this.code;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HttpError(code=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.code);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.oneonboarding.domain.error.NetworkErrorType.HttpError) && this.code == ((com.paypal.oslo.feature.oneonboarding.domain.error.NetworkErrorType.HttpError) other).code;
        }

        public final com.paypal.oslo.feature.oneonboarding.domain.error.NetworkErrorType.HttpError copy(int code) {
            return new com.paypal.oslo.feature.oneonboarding.domain.error.NetworkErrorType.HttpError(code);
        }

        /* renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.domain.error.NetworkErrorType.HttpError copy$default(com.paypal.oslo.feature.oneonboarding.domain.error.NetworkErrorType.HttpError httpError, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = httpError.code;
            }
            return httpError.copy(i);
        }
    }

    public /* synthetic */ NetworkErrorType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
