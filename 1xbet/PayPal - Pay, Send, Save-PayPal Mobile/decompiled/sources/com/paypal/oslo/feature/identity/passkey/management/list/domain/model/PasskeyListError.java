package com.paypal.oslo.feature.identity.passkey.management.list.domain.model;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError;", "", "<init>", "()V", "NetworkError", "TimeoutError", "UnauthorizedError", "NotFoundError", "ServerInternalError", "AuthenticationError", "ValidationError", "SecurityError", "MissingData", "UnsupportedPlatform", "UnknownError", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError$AuthenticationError;", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError$MissingData;", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError$NetworkError;", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError$NotFoundError;", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError$SecurityError;", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError$ServerInternalError;", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError$TimeoutError;", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError$UnauthorizedError;", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError$UnknownError;", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError$UnsupportedPlatform;", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError$ValidationError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class PasskeyListError {
    public static final int $stable = 0;

    private PasskeyListError() {
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError$NetworkError;", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "cause", "<init>", "(Ljava/lang/Exception;)V", "component1", "()Ljava/lang/Exception;", "copy", "(Ljava/lang/Exception;)Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError$NetworkError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Exception;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NetworkError extends com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError {
        public static final int $stable = 8;
        private final java.lang.Exception cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkError(java.lang.Exception exc) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
            this.cause = exc;
        }

        public final java.lang.Exception getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.Exception exc = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkError(cause=");
            sb.append(exc);
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
            return (other instanceof com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.NetworkError) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, ((com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.NetworkError) other).cause);
        }

        public final com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.NetworkError copy(java.lang.Exception cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "");
            return new com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.NetworkError(cause);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Exception getCause() {
            return this.cause;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.NetworkError copy$default(com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.NetworkError networkError, java.lang.Exception exc, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                exc = networkError.cause;
            }
            return networkError.copy(exc);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError$TimeoutError;", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "cause", "<init>", "(Ljava/lang/Exception;)V", "component1", "()Ljava/lang/Exception;", "copy", "(Ljava/lang/Exception;)Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError$TimeoutError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Exception;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TimeoutError extends com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError {
        public static final int $stable = 8;
        private final java.lang.Exception cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TimeoutError(java.lang.Exception exc) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
            this.cause = exc;
        }

        public final java.lang.Exception getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.Exception exc = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TimeoutError(cause=");
            sb.append(exc);
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
            return (other instanceof com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.TimeoutError) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, ((com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.TimeoutError) other).cause);
        }

        public final com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.TimeoutError copy(java.lang.Exception cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "");
            return new com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.TimeoutError(cause);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Exception getCause() {
            return this.cause;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.TimeoutError copy$default(com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.TimeoutError timeoutError, java.lang.Exception exc, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                exc = timeoutError.cause;
            }
            return timeoutError.copy(exc);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError$UnauthorizedError;", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnauthorizedError extends com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.UnauthorizedError INSTANCE = new com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.UnauthorizedError();

        public final int hashCode() {
            return -1257876723;
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
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.UnauthorizedError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError$NotFoundError;", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NotFoundError extends com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.NotFoundError INSTANCE = new com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.NotFoundError();

        public final int hashCode() {
            return -919139086;
        }

        private NotFoundError() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NotFoundError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.NotFoundError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError$ServerInternalError;", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ServerInternalError extends com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.ServerInternalError INSTANCE = new com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.ServerInternalError();

        public final int hashCode() {
            return -62767583;
        }

        private ServerInternalError() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ServerInternalError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.ServerInternalError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError$AuthenticationError;", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AuthenticationError extends com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.AuthenticationError INSTANCE = new com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.AuthenticationError();

        public final int hashCode() {
            return -778036791;
        }

        private AuthenticationError() {
            super(null);
        }

        public final java.lang.String toString() {
            return "AuthenticationError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.AuthenticationError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError$ValidationError;", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ValidationError extends com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.ValidationError INSTANCE = new com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.ValidationError();

        public final int hashCode() {
            return 259842280;
        }

        private ValidationError() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ValidationError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.ValidationError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError$SecurityError;", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SecurityError extends com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.SecurityError INSTANCE = new com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.SecurityError();

        public final int hashCode() {
            return 1520171201;
        }

        private SecurityError() {
            super(null);
        }

        public final java.lang.String toString() {
            return "SecurityError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.SecurityError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError$MissingData;", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MissingData extends com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.MissingData INSTANCE = new com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.MissingData();

        public final int hashCode() {
            return 1738832521;
        }

        private MissingData() {
            super(null);
        }

        public final java.lang.String toString() {
            return "MissingData";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.MissingData)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError$UnsupportedPlatform;", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnsupportedPlatform extends com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.UnsupportedPlatform INSTANCE = new com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.UnsupportedPlatform();

        public final int hashCode() {
            return 2085239073;
        }

        private UnsupportedPlatform() {
            super(null);
        }

        public final java.lang.String toString() {
            return "UnsupportedPlatform";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.UnsupportedPlatform)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError$UnknownError;", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "cause", "<init>", "(Ljava/lang/Exception;)V", "component1", "()Ljava/lang/Exception;", "copy", "(Ljava/lang/Exception;)Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError$UnknownError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Exception;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnknownError extends com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError {
        public static final int $stable = 8;
        private final java.lang.Exception cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownError(java.lang.Exception exc) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
            this.cause = exc;
        }

        public final java.lang.Exception getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.Exception exc = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnknownError(cause=");
            sb.append(exc);
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
            return (other instanceof com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.UnknownError) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, ((com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.UnknownError) other).cause);
        }

        public final com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.UnknownError copy(java.lang.Exception cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "");
            return new com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.UnknownError(cause);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Exception getCause() {
            return this.cause;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.UnknownError copy$default(com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError.UnknownError unknownError, java.lang.Exception exc, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                exc = unknownError.cause;
            }
            return unknownError.copy(exc);
        }
    }

    public /* synthetic */ PasskeyListError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
