package com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/model/result/EmailConfirmationError;", "", "<init>", "()V", "ConfirmationFailed", "CancelledByUser", "Api", "Unknown", "Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/model/result/EmailConfirmationError$Api;", "Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/model/result/EmailConfirmationError$CancelledByUser;", "Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/model/result/EmailConfirmationError$ConfirmationFailed;", "Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/model/result/EmailConfirmationError$Unknown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class EmailConfirmationError {
    public static final int $stable = 0;

    private EmailConfirmationError() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/model/result/EmailConfirmationError$ConfirmationFailed;", "Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/model/result/EmailConfirmationError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/model/result/EmailConfirmationError$ConfirmationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConfirmationFailed extends com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError {
        public static final int $stable = 0;
        private final java.lang.String message;

        public ConfirmationFailed(java.lang.String str) {
            super(null);
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfirmationFailed(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.ConfirmationFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.ConfirmationFailed) other).message);
        }

        public final com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.ConfirmationFailed copy(java.lang.String message) {
            return new com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.ConfirmationFailed(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.ConfirmationFailed copy$default(com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.ConfirmationFailed confirmationFailed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = confirmationFailed.message;
            }
            return confirmationFailed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/model/result/EmailConfirmationError$CancelledByUser;", "Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/model/result/EmailConfirmationError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CancelledByUser extends com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.CancelledByUser INSTANCE = new com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.CancelledByUser();

        public final int hashCode() {
            return 375560378;
        }

        private CancelledByUser() {
            super(null);
        }

        public final java.lang.String toString() {
            return "CancelledByUser";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.CancelledByUser)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/model/result/EmailConfirmationError$Api;", "Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/model/result/EmailConfirmationError;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError;", "error", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError;)Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/model/result/EmailConfirmationError$Api;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Api extends com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.shared.domain.model.ApiError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Api(com.paypal.oslo.feature.identity.shared.domain.model.ApiError apiError) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiError, "");
            this.error = apiError;
        }

        public final com.paypal.oslo.feature.identity.shared.domain.model.ApiError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.ApiError apiError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Api(error=");
            sb.append(apiError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.Api) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.Api) other).error);
        }

        public final com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.Api copy(com.paypal.oslo.feature.identity.shared.domain.model.ApiError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.Api(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.ApiError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.Api copy$default(com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.Api api, com.paypal.oslo.feature.identity.shared.domain.model.ApiError apiError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                apiError = api.error;
            }
            return api.copy(apiError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/model/result/EmailConfirmationError$Unknown;", "Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/model/result/EmailConfirmationError;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/model/result/EmailConfirmationError$Unknown;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Unknown extends com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;

        public Unknown(java.lang.Throwable th) {
            super(null);
            this.cause = th;
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown(cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Throwable th = this.cause;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.Unknown) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, ((com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.Unknown) other).cause);
        }

        public final com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.Unknown copy(java.lang.Throwable cause) {
            return new com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.Unknown(cause);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.Unknown copy$default(com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationError.Unknown unknown, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = unknown.cause;
            }
            return unknown.copy(th);
        }
    }

    public /* synthetic */ EmailConfirmationError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
