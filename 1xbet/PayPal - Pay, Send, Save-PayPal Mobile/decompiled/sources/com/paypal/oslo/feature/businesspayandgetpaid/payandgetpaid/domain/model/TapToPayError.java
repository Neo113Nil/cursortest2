package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/TapToPayError;", "", "<init>", "()V", "InvalidLowAmount", "NetworkError", "PaymentProcessingError", "UnknownError", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/TapToPayError$InvalidLowAmount;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/TapToPayError$NetworkError;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/TapToPayError$PaymentProcessingError;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/TapToPayError$UnknownError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class TapToPayError extends java.lang.Throwable {
    public static final int $stable = 8;

    private TapToPayError() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/TapToPayError$InvalidLowAmount;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/TapToPayError;", "<init>", "()V", "", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class InvalidLowAmount extends com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.TapToPayError {
        public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.TapToPayError.InvalidLowAmount INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.TapToPayError.InvalidLowAmount();
        private static final java.lang.String message = "The requested amount is below minimum";
        public static final int $stable = 8;

        private InvalidLowAmount() {
            super(null);
        }

        @Override // java.lang.Throwable
        public final java.lang.String getMessage() {
            return message;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/TapToPayError$NetworkError;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/TapToPayError;", "<init>", "()V", "", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NetworkError extends com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.TapToPayError {
        public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.TapToPayError.NetworkError INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.TapToPayError.NetworkError();
        private static final java.lang.String message = "Network error during payment processing";
        public static final int $stable = 8;

        private NetworkError() {
            super(null);
        }

        @Override // java.lang.Throwable
        public final java.lang.String getMessage() {
            return message;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/TapToPayError$PaymentProcessingError;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/TapToPayError;", "<init>", "()V", "", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PaymentProcessingError extends com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.TapToPayError {
        public static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.TapToPayError.PaymentProcessingError INSTANCE = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.TapToPayError.PaymentProcessingError();
        private static final java.lang.String message = "Error processing payment";
        public static final int $stable = 8;

        private PaymentProcessingError() {
            super(null);
        }

        @Override // java.lang.Throwable
        public final java.lang.String getMessage() {
            return message;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\u00128\u0017X\u0097D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/TapToPayError$UnknownError;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/TapToPayError;", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ERROR_CAUSE, "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/TapToPayError$UnknownError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getErrorCause", "message", "Ljava/lang/String;", "getMessage", "cause", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnknownError extends com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.TapToPayError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;
        private final java.lang.Throwable errorCause;
        private final java.lang.String message;

        public UnknownError(java.lang.Throwable th) {
            super(null);
            this.errorCause = th;
            this.message = "An unexpected error occurred";
            this.cause = th;
        }

        public final java.lang.Throwable getErrorCause() {
            return this.errorCause;
        }

        @Override // java.lang.Throwable
        public final java.lang.String getMessage() {
            return this.message;
        }

        @Override // java.lang.Throwable
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        @Override // java.lang.Throwable
        public final java.lang.String toString() {
            java.lang.Throwable th = this.errorCause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnknownError(errorCause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Throwable th = this.errorCause;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.TapToPayError.UnknownError) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCause, ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.TapToPayError.UnknownError) other).errorCause);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.TapToPayError.UnknownError copy(java.lang.Throwable errorCause) {
            return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.TapToPayError.UnknownError(errorCause);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getErrorCause() {
            return this.errorCause;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.TapToPayError.UnknownError copy$default(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.TapToPayError.UnknownError unknownError, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = unknownError.errorCause;
            }
            return unknownError.copy(th);
        }
    }

    public /* synthetic */ TapToPayError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
