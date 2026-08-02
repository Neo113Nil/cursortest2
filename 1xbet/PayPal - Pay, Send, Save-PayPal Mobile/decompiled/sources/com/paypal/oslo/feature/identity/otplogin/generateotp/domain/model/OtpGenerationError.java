package com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError;", "", "<init>", "()V", "NoInternet", "HttpError", "DataNotFound", "AuthenticationResultMissing", "UnknownError", "EmptyCredential", "EmptyNonce", "NoPhones", "EmptyChallengeId", "EmptyAdsChallengeId", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError$AuthenticationResultMissing;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError$DataNotFound;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError$EmptyAdsChallengeId;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError$EmptyChallengeId;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError$EmptyCredential;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError$EmptyNonce;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError$HttpError;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError$NoInternet;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError$NoPhones;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError$UnknownError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class OtpGenerationError {
    public static final int $stable = 0;

    private OtpGenerationError() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError$NoInternet;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoInternet extends com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.NoInternet INSTANCE = new com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.NoInternet();

        public final int hashCode() {
            return 1577916549;
        }

        private NoInternet() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NoInternet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.NoInternet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError$HttpError;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError;", "", "statusCode", "", "message", "<init>", "(ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError$HttpError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getStatusCode", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HttpError extends com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError {
        public static final int $stable = 0;
        private final java.lang.String message;
        private final int statusCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HttpError(int i, java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.statusCode = i;
            this.message = str;
        }

        public final int getStatusCode() {
            return this.statusCode;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            int i = this.statusCode;
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HttpError(statusCode=");
            sb.append(i);
            sb.append(", message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Integer.hashCode(this.statusCode) * 31) + this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.HttpError)) {
                return false;
            }
            com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.HttpError httpError = (com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.HttpError) other;
            return this.statusCode == httpError.statusCode && kotlin.jvm.internal.Intrinsics.areEqual(this.message, httpError.message);
        }

        public final com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.HttpError copy(int statusCode, java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.HttpError(statusCode, message);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* renamed from: component1, reason: from getter */
        public final int getStatusCode() {
            return this.statusCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.HttpError copy$default(com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.HttpError httpError, int i, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = httpError.statusCode;
            }
            if ((i2 & 2) != 0) {
                str = httpError.message;
            }
            return httpError.copy(i, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError$DataNotFound;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DataNotFound extends com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.DataNotFound INSTANCE = new com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.DataNotFound();

        public final int hashCode() {
            return -983599652;
        }

        private DataNotFound() {
            super(null);
        }

        public final java.lang.String toString() {
            return "DataNotFound";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.DataNotFound)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError$AuthenticationResultMissing;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AuthenticationResultMissing extends com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.AuthenticationResultMissing INSTANCE = new com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.AuthenticationResultMissing();

        public final int hashCode() {
            return 700430574;
        }

        private AuthenticationResultMissing() {
            super(null);
        }

        public final java.lang.String toString() {
            return "AuthenticationResultMissing";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.AuthenticationResultMissing)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError$UnknownError;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError$UnknownError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnknownError extends com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError {
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
            return (other instanceof com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.UnknownError) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, ((com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.UnknownError) other).cause);
        }

        public final com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.UnknownError copy(java.lang.Throwable cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "");
            return new com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.UnknownError(cause);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.UnknownError copy$default(com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.UnknownError unknownError, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = unknownError.cause;
            }
            return unknownError.copy(th);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError$EmptyCredential;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EmptyCredential extends com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.EmptyCredential INSTANCE = new com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.EmptyCredential();

        public final int hashCode() {
            return 1486185217;
        }

        private EmptyCredential() {
            super(null);
        }

        public final java.lang.String toString() {
            return "EmptyCredential";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.EmptyCredential)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError$EmptyNonce;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EmptyNonce extends com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.EmptyNonce INSTANCE = new com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.EmptyNonce();

        public final int hashCode() {
            return -1226491131;
        }

        private EmptyNonce() {
            super(null);
        }

        public final java.lang.String toString() {
            return "EmptyNonce";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.EmptyNonce)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError$NoPhones;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoPhones extends com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.NoPhones INSTANCE = new com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.NoPhones();

        public final int hashCode() {
            return -603634935;
        }

        private NoPhones() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NoPhones";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.NoPhones)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError$EmptyChallengeId;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EmptyChallengeId extends com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.EmptyChallengeId INSTANCE = new com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.EmptyChallengeId();

        public final int hashCode() {
            return 2143998836;
        }

        private EmptyChallengeId() {
            super(null);
        }

        public final java.lang.String toString() {
            return "EmptyChallengeId";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.EmptyChallengeId)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError$EmptyAdsChallengeId;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EmptyAdsChallengeId extends com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.EmptyAdsChallengeId INSTANCE = new com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.EmptyAdsChallengeId();

        public final int hashCode() {
            return -1598296136;
        }

        private EmptyAdsChallengeId() {
            super(null);
        }

        public final java.lang.String toString() {
            return "EmptyAdsChallengeId";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.EmptyAdsChallengeId)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ OtpGenerationError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
