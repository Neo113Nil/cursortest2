package com.paypal.oslo.feature.identity.userverification.domain.model.result;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/GoogleSignUpError;", "", "Cancelled", "CredentialError", "ParsingError", "UnexpectedCredentialType", "FeatureGoogleSignUpDisabled", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/GoogleSignUpError$Cancelled;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/GoogleSignUpError$CredentialError;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/GoogleSignUpError$FeatureGoogleSignUpDisabled;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/GoogleSignUpError$ParsingError;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/GoogleSignUpError$UnexpectedCredentialType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface GoogleSignUpError {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/GoogleSignUpError$Cancelled;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/GoogleSignUpError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Cancelled implements com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError.Cancelled INSTANCE = new com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError.Cancelled();

        public final int hashCode() {
            return -1951866961;
        }

        private Cancelled() {
        }

        public final java.lang.String toString() {
            return "Cancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError.Cancelled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/GoogleSignUpError$CredentialError;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/GoogleSignUpError;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/GoogleSignUpError$CredentialError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CredentialError implements com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;
        private final java.lang.String message;

        public CredentialError(java.lang.String str, java.lang.Throwable th) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.cause = th;
        }

        public /* synthetic */ CredentialError(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CredentialError(message=");
            sb.append(str);
            sb.append(", cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode();
            java.lang.Throwable th = this.cause;
            return (hashCode * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError.CredentialError)) {
                return false;
            }
            com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError.CredentialError credentialError = (com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError.CredentialError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, credentialError.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, credentialError.cause);
        }

        public final com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError.CredentialError copy(java.lang.String message, java.lang.Throwable cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError.CredentialError(message, cause);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError.CredentialError copy$default(com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError.CredentialError credentialError, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = credentialError.message;
            }
            if ((i & 2) != 0) {
                th = credentialError.cause;
            }
            return credentialError.copy(str, th);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/GoogleSignUpError$ParsingError;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/GoogleSignUpError;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/GoogleSignUpError$ParsingError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ParsingError implements com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;

        public ParsingError(java.lang.Throwable th) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
            this.cause = th;
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ParsingError(cause=");
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
            return (other instanceof com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError.ParsingError) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, ((com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError.ParsingError) other).cause);
        }

        public final com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError.ParsingError copy(java.lang.Throwable cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "");
            return new com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError.ParsingError(cause);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError.ParsingError copy$default(com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError.ParsingError parsingError, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = parsingError.cause;
            }
            return parsingError.copy(th);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/GoogleSignUpError$UnexpectedCredentialType;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/GoogleSignUpError;", "", "actualType", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/GoogleSignUpError$UnexpectedCredentialType;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getActualType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnexpectedCredentialType implements com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError {
        public static final int $stable = 0;
        private final java.lang.String actualType;

        public UnexpectedCredentialType(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.actualType = str;
        }

        public final java.lang.String getActualType() {
            return this.actualType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.actualType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnexpectedCredentialType(actualType=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.actualType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError.UnexpectedCredentialType) && kotlin.jvm.internal.Intrinsics.areEqual(this.actualType, ((com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError.UnexpectedCredentialType) other).actualType);
        }

        public final com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError.UnexpectedCredentialType copy(java.lang.String actualType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actualType, "");
            return new com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError.UnexpectedCredentialType(actualType);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getActualType() {
            return this.actualType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError.UnexpectedCredentialType copy$default(com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError.UnexpectedCredentialType unexpectedCredentialType, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unexpectedCredentialType.actualType;
            }
            return unexpectedCredentialType.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/GoogleSignUpError$FeatureGoogleSignUpDisabled;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/GoogleSignUpError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FeatureGoogleSignUpDisabled implements com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError.FeatureGoogleSignUpDisabled INSTANCE = new com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError.FeatureGoogleSignUpDisabled();

        public final int hashCode() {
            return 1293637985;
        }

        private FeatureGoogleSignUpDisabled() {
        }

        public final java.lang.String toString() {
            return "FeatureGoogleSignUpDisabled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError.FeatureGoogleSignUpDisabled)) {
                return false;
            }
            return true;
        }
    }
}
