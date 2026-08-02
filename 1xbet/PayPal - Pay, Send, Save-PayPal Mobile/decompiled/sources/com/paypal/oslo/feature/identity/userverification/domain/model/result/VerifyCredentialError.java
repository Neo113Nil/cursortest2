package com.paypal.oslo.feature.identity.userverification.domain.model.result;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialError;", "", "<init>", "()V", "InvalidCredential", "NetworkError", "AuthenticationError", "UnknownError", "EmailConfirmationRequired", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialError$AuthenticationError;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialError$EmailConfirmationRequired;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialError$InvalidCredential;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialError$NetworkError;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialError$UnknownError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class VerifyCredentialError {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialError$InvalidCredential;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InvalidCredential extends com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError.InvalidCredential INSTANCE = new com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError.InvalidCredential();

        public final int hashCode() {
            return 1356396493;
        }

        private InvalidCredential() {
            super(null);
        }

        public final java.lang.String toString() {
            return "InvalidCredential";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError.InvalidCredential)) {
                return false;
            }
            return true;
        }
    }

    private VerifyCredentialError() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialError$NetworkError;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NetworkError extends com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError.NetworkError INSTANCE = new com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError.NetworkError();

        public final int hashCode() {
            return 603951867;
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
            if (!(other instanceof com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError.NetworkError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialError$AuthenticationError;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AuthenticationError extends com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError.AuthenticationError INSTANCE = new com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError.AuthenticationError();

        public final int hashCode() {
            return 2108082383;
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
            if (!(other instanceof com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError.AuthenticationError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialError$UnknownError;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnknownError extends com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError.UnknownError INSTANCE = new com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError.UnknownError();

        public final int hashCode() {
            return -695848353;
        }

        private UnknownError() {
            super(null);
        }

        public final java.lang.String toString() {
            return "UnknownError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError.UnknownError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialError$EmailConfirmationRequired;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialError;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential$EmailCredential;", "publicCredential", "<init>", "(Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential$EmailCredential;)V", "component1", "()Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential$EmailCredential;", "copy", "(Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential$EmailCredential;)Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialError$EmailConfirmationRequired;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential$EmailCredential;", "getPublicCredential"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EmailConfirmationRequired extends com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential publicCredential;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmailConfirmationRequired(com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential emailCredential) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailCredential, "");
            this.publicCredential = emailCredential;
        }

        public final com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential getPublicCredential() {
            return this.publicCredential;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential emailCredential = this.publicCredential;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EmailConfirmationRequired(publicCredential=");
            sb.append(emailCredential);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.publicCredential.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError.EmailConfirmationRequired) && kotlin.jvm.internal.Intrinsics.areEqual(this.publicCredential, ((com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError.EmailConfirmationRequired) other).publicCredential);
        }

        public final com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError.EmailConfirmationRequired copy(com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential publicCredential) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
            return new com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError.EmailConfirmationRequired(publicCredential);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential getPublicCredential() {
            return this.publicCredential;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError.EmailConfirmationRequired copy$default(com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError.EmailConfirmationRequired emailConfirmationRequired, com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential emailCredential, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                emailCredential = emailConfirmationRequired.publicCredential;
            }
            return emailConfirmationRequired.copy(emailCredential);
        }
    }

    public /* synthetic */ VerifyCredentialError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
