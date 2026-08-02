package com.paypal.oslo.feature.identity.biometriclogin.domain.model;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\t\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "NotEligible", "BiometricUnavailable", "UserCancelled", "Lockout", "AuthenticationRejected", "SigningFailed", "AuthenticationFailed", "DeviceNotBound", "Unknown", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError$AuthenticationFailed;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError$AuthenticationRejected;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError$BiometricUnavailable;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError$DeviceNotBound;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError$Lockout;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError$NotEligible;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError$SigningFailed;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError$Unknown;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError$UserCancelled;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class BiometricLoginError {
    public static final int $stable = 0;
    private final java.lang.String message;

    private BiometricLoginError(java.lang.String str) {
        this.message = str;
    }

    public java.lang.String getMessage() {
        return this.message;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError$NotEligible;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NotEligible extends com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.NotEligible INSTANCE = new com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.NotEligible();

        public final int hashCode() {
            return 849143362;
        }

        private NotEligible() {
            super("No biometric bind token found", null);
        }

        public final java.lang.String toString() {
            return "NotEligible";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.NotEligible)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError$BiometricUnavailable;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BiometricUnavailable extends com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.BiometricUnavailable INSTANCE = new com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.BiometricUnavailable();

        public final int hashCode() {
            return -2121910528;
        }

        private BiometricUnavailable() {
            super("Biometric authentication is not available", null);
        }

        public final java.lang.String toString() {
            return "BiometricUnavailable";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.BiometricUnavailable)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError$UserCancelled;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UserCancelled extends com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.UserCancelled INSTANCE = new com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.UserCancelled();

        public final int hashCode() {
            return 1158960190;
        }

        private UserCancelled() {
            super("User cancelled biometric authentication", null);
        }

        public final java.lang.String toString() {
            return "UserCancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.UserCancelled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError$Lockout;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError;", "", "isPermanent", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError$Lockout;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Lockout extends com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError {
        public static final int $stable = 0;
        private final boolean isPermanent;

        public final boolean isPermanent() {
            return this.isPermanent;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Lockout(boolean z) {
            super(r0, null);
            java.lang.String str;
            if (z) {
                str = "Biometric locked - use device credentials";
            } else {
                str = "Biometric temporarily locked - try again later";
            }
            this.isPermanent = z;
        }

        public final java.lang.String toString() {
            boolean z = this.isPermanent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Lockout(isPermanent=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.isPermanent);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.Lockout) && this.isPermanent == ((com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.Lockout) other).isPermanent;
        }

        public final com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.Lockout copy(boolean isPermanent) {
            return new com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.Lockout(isPermanent);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsPermanent() {
            return this.isPermanent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.Lockout copy$default(com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.Lockout lockout, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = lockout.isPermanent;
            }
            return lockout.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError$AuthenticationRejected;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AuthenticationRejected extends com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.AuthenticationRejected INSTANCE = new com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.AuthenticationRejected();

        public final int hashCode() {
            return -815872098;
        }

        private AuthenticationRejected() {
            super("Biometric authentication failed", null);
        }

        public final java.lang.String toString() {
            return "AuthenticationRejected";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.AuthenticationRejected)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError$SigningFailed;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError$SigningFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SigningFailed extends com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SigningFailed(java.lang.String str) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        @Override // com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError
        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SigningFailed(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.SigningFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.SigningFailed) other).message);
        }

        public final com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.SigningFailed copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.SigningFailed(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.SigningFailed copy$default(com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.SigningFailed signingFailed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = signingFailed.message;
            }
            return signingFailed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError$AuthenticationFailed;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError$AuthenticationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AuthenticationFailed extends com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthenticationFailed(java.lang.String str) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        @Override // com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError
        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthenticationFailed(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.AuthenticationFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.AuthenticationFailed) other).message);
        }

        public final com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.AuthenticationFailed copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.AuthenticationFailed(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.AuthenticationFailed copy$default(com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.AuthenticationFailed authenticationFailed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = authenticationFailed.message;
            }
            return authenticationFailed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError$DeviceNotBound;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeviceNotBound extends com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.DeviceNotBound INSTANCE = new com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.DeviceNotBound();

        public final int hashCode() {
            return 159556457;
        }

        private DeviceNotBound() {
            super("Device is not bound for biometric login", null);
        }

        public final java.lang.String toString() {
            return "DeviceNotBound";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.DeviceNotBound)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError$Unknown;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/biometriclogin/domain/model/BiometricLoginError$Unknown;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Unknown extends com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(java.lang.String str, java.lang.Throwable th) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.cause = th;
        }

        public /* synthetic */ Unknown(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        @Override // com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError
        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown(message=");
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
            if (!(other instanceof com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.Unknown)) {
                return false;
            }
            com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.Unknown unknown = (com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.Unknown) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, unknown.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, unknown.cause);
        }

        public final com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.Unknown copy(java.lang.String message, java.lang.Throwable cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.Unknown(message, cause);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.Unknown copy$default(com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.Unknown unknown, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unknown.message;
            }
            if ((i & 2) != 0) {
                th = unknown.cause;
            }
            return unknown.copy(str, th);
        }
    }

    public /* synthetic */ BiometricLoginError(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
