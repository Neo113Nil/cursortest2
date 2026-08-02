package com.paypal.oslo.feature.identity.biometriclogin.ui;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u00042\u00020\u0001:\t\u0005\u0006\u0007\b\t\n\u000b\f\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptError;", "", "<init>", "()V", "Companion", "UserCancelled", "Lockout", "LockoutPermanent", "NoBiometricEnrolled", "HardwareUnavailable", "SignatureNotReturned", "AuthenticationRejected", "AuthenticationError", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptError$AuthenticationError;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptError$AuthenticationRejected;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptError$HardwareUnavailable;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptError$Lockout;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptError$LockoutPermanent;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptError$NoBiometricEnrolled;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptError$SignatureNotReturned;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptError$UserCancelled;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class BiometricPromptError {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.Companion INSTANCE = new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.Companion(null);

    private BiometricPromptError() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptError$UserCancelled;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UserCancelled extends com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.UserCancelled INSTANCE = new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.UserCancelled();

        public final int hashCode() {
            return 948514880;
        }

        private UserCancelled() {
            super(null);
        }

        public final java.lang.String toString() {
            return "UserCancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.UserCancelled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptError$Lockout;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Lockout extends com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.Lockout INSTANCE = new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.Lockout();

        public final int hashCode() {
            return -1939343299;
        }

        private Lockout() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Lockout";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.Lockout)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptError$LockoutPermanent;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LockoutPermanent extends com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.LockoutPermanent INSTANCE = new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.LockoutPermanent();

        public final int hashCode() {
            return 1910075633;
        }

        private LockoutPermanent() {
            super(null);
        }

        public final java.lang.String toString() {
            return "LockoutPermanent";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.LockoutPermanent)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptError$NoBiometricEnrolled;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoBiometricEnrolled extends com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.NoBiometricEnrolled INSTANCE = new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.NoBiometricEnrolled();

        public final int hashCode() {
            return 763300822;
        }

        private NoBiometricEnrolled() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NoBiometricEnrolled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.NoBiometricEnrolled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptError$HardwareUnavailable;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HardwareUnavailable extends com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.HardwareUnavailable INSTANCE = new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.HardwareUnavailable();

        public final int hashCode() {
            return 387372098;
        }

        private HardwareUnavailable() {
            super(null);
        }

        public final java.lang.String toString() {
            return "HardwareUnavailable";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.HardwareUnavailable)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptError$SignatureNotReturned;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SignatureNotReturned extends com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.SignatureNotReturned INSTANCE = new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.SignatureNotReturned();

        public final int hashCode() {
            return 593893936;
        }

        private SignatureNotReturned() {
            super(null);
        }

        public final java.lang.String toString() {
            return "SignatureNotReturned";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.SignatureNotReturned)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptError$AuthenticationRejected;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AuthenticationRejected extends com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.AuthenticationRejected INSTANCE = new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.AuthenticationRejected();

        public final int hashCode() {
            return -2076946980;
        }

        private AuthenticationRejected() {
            super(null);
        }

        public final java.lang.String toString() {
            return "AuthenticationRejected";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.AuthenticationRejected)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptError$AuthenticationError;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptError;", "", "errorCode", "", "message", "<init>", "(ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptError$AuthenticationError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getErrorCode", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AuthenticationError extends com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError {
        public static final int $stable = 0;
        private final int errorCode;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthenticationError(int i, java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorCode = i;
            this.message = str;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            int i = this.errorCode;
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthenticationError(errorCode=");
            sb.append(i);
            sb.append(", message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Integer.hashCode(this.errorCode) * 31) + this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.AuthenticationError)) {
                return false;
            }
            com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.AuthenticationError authenticationError = (com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.AuthenticationError) other;
            return this.errorCode == authenticationError.errorCode && kotlin.jvm.internal.Intrinsics.areEqual(this.message, authenticationError.message);
        }

        public final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.AuthenticationError copy(int errorCode, java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.AuthenticationError(errorCode, message);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* renamed from: component1, reason: from getter */
        public final int getErrorCode() {
            return this.errorCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.AuthenticationError copy$default(com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.AuthenticationError authenticationError, int i, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = authenticationError.errorCode;
            }
            if ((i2 & 2) != 0) {
                str = authenticationError.message;
            }
            return authenticationError.copy(i, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptError$Companion;", "", "<init>", "()V", "", "errorCode", "", "message", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptError;", "fromErrorCode", "(ILjava/lang/String;)Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricPromptError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError fromErrorCode(int errorCode, java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            if (errorCode != 1) {
                if (errorCode == 7) {
                    return com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.Lockout.INSTANCE;
                }
                switch (errorCode) {
                    case 9:
                        return com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.LockoutPermanent.INSTANCE;
                    case 10:
                    case 13:
                        return com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.UserCancelled.INSTANCE;
                    case 11:
                        return com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.NoBiometricEnrolled.INSTANCE;
                    case 12:
                        break;
                    default:
                        return new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.AuthenticationError(errorCode, message);
                }
            }
            return com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricPromptError.HardwareUnavailable.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BiometricPromptError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
