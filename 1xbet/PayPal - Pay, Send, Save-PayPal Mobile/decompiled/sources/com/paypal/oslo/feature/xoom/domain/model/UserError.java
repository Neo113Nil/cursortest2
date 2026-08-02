package com.paypal.oslo.feature.xoom.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/model/UserError;", "", "<init>", "()V", "ConflictError", "ForbiddenError", "UnauthorizedError", "NetworkError", "Lcom/paypal/oslo/feature/xoom/domain/model/UserError$ConflictError;", "Lcom/paypal/oslo/feature/xoom/domain/model/UserError$ForbiddenError;", "Lcom/paypal/oslo/feature/xoom/domain/model/UserError$NetworkError;", "Lcom/paypal/oslo/feature/xoom/domain/model/UserError$UnauthorizedError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class UserError {
    public static final int $stable = 0;

    private UserError() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/model/UserError$ConflictError;", "Lcom/paypal/oslo/feature/xoom/domain/model/UserError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConflictError extends com.paypal.oslo.feature.xoom.domain.model.UserError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.xoom.domain.model.UserError.ConflictError INSTANCE = new com.paypal.oslo.feature.xoom.domain.model.UserError.ConflictError();

        public final int hashCode() {
            return -1555731810;
        }

        private ConflictError() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ConflictError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.xoom.domain.model.UserError.ConflictError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/model/UserError$ForbiddenError;", "Lcom/paypal/oslo/feature/xoom/domain/model/UserError;", "Lcom/paypal/oslo/feature/xoom/domain/model/ForbiddenErrorType;", "errorType", "<init>", "(Lcom/paypal/oslo/feature/xoom/domain/model/ForbiddenErrorType;)V", "component1", "()Lcom/paypal/oslo/feature/xoom/domain/model/ForbiddenErrorType;", "copy", "(Lcom/paypal/oslo/feature/xoom/domain/model/ForbiddenErrorType;)Lcom/paypal/oslo/feature/xoom/domain/model/UserError$ForbiddenError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/xoom/domain/model/ForbiddenErrorType;", "getErrorType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ForbiddenError extends com.paypal.oslo.feature.xoom.domain.model.UserError {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType errorType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ForbiddenError(com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType forbiddenErrorType) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(forbiddenErrorType, "");
            this.errorType = forbiddenErrorType;
        }

        public final com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType forbiddenErrorType = this.errorType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ForbiddenError(errorType=");
            sb.append(forbiddenErrorType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.xoom.domain.model.UserError.ForbiddenError) && this.errorType == ((com.paypal.oslo.feature.xoom.domain.model.UserError.ForbiddenError) other).errorType;
        }

        public final com.paypal.oslo.feature.xoom.domain.model.UserError.ForbiddenError copy(com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType errorType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.xoom.domain.model.UserError.ForbiddenError(errorType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.xoom.domain.model.UserError.ForbiddenError copy$default(com.paypal.oslo.feature.xoom.domain.model.UserError.ForbiddenError forbiddenError, com.paypal.oslo.feature.xoom.domain.model.ForbiddenErrorType forbiddenErrorType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                forbiddenErrorType = forbiddenError.errorType;
            }
            return forbiddenError.copy(forbiddenErrorType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/model/UserError$UnauthorizedError;", "Lcom/paypal/oslo/feature/xoom/domain/model/UserError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnauthorizedError extends com.paypal.oslo.feature.xoom.domain.model.UserError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.xoom.domain.model.UserError.UnauthorizedError INSTANCE = new com.paypal.oslo.feature.xoom.domain.model.UserError.UnauthorizedError();

        public final int hashCode() {
            return -1612235076;
        }

        private UnauthorizedError() {
            super(null);
        }

        public final java.lang.String toString() {
            return "UnauthorizedError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.xoom.domain.model.UserError.UnauthorizedError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/model/UserError$NetworkError;", "Lcom/paypal/oslo/feature/xoom/domain/model/UserError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NetworkError extends com.paypal.oslo.feature.xoom.domain.model.UserError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.xoom.domain.model.UserError.NetworkError INSTANCE = new com.paypal.oslo.feature.xoom.domain.model.UserError.NetworkError();

        public final int hashCode() {
            return 1667648050;
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
            if (!(other instanceof com.paypal.oslo.feature.xoom.domain.model.UserError.NetworkError)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ UserError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
