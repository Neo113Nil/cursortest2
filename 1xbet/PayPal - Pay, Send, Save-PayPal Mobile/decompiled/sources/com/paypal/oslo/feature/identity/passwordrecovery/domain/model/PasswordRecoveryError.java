package com.paypal.oslo.feature.identity.passwordrecovery.domain.model;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0011\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0011\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;", "", "<init>", "()V", "EmptyPassword", "EmptyConfirmPassword", "PasswordTooShort", "PasswordTooLong", "PasswordTooWeak", "PasswordsDoNotMatch", "PasswordRecentlyUsed", "PasswordIllegalCharacters", "PasswordMatchesCredential", "PasswordSequence", "PasswordRepeatedCharacters", "PasswordForbiddenWord", "InvalidResetToken", "ExpiredResetToken", "NetworkError", "ServerError", "UnknownError", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$EmptyConfirmPassword;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$EmptyPassword;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$ExpiredResetToken;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$InvalidResetToken;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$NetworkError;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$PasswordForbiddenWord;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$PasswordIllegalCharacters;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$PasswordMatchesCredential;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$PasswordRecentlyUsed;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$PasswordRepeatedCharacters;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$PasswordSequence;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$PasswordTooLong;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$PasswordTooShort;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$PasswordTooWeak;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$PasswordsDoNotMatch;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$ServerError;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$UnknownError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class PasswordRecoveryError {
    public static final int $stable = 0;

    private PasswordRecoveryError() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$EmptyPassword;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class EmptyPassword extends com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.EmptyPassword INSTANCE = new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.EmptyPassword();

        public final int hashCode() {
            return 2107582914;
        }

        private EmptyPassword() {
            super(null);
        }

        public final java.lang.String toString() {
            return "EmptyPassword";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.EmptyPassword)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$EmptyConfirmPassword;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EmptyConfirmPassword extends com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.EmptyConfirmPassword INSTANCE = new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.EmptyConfirmPassword();

        public final int hashCode() {
            return -751842188;
        }

        private EmptyConfirmPassword() {
            super(null);
        }

        public final java.lang.String toString() {
            return "EmptyConfirmPassword";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.EmptyConfirmPassword)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$PasswordTooShort;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class PasswordTooShort extends com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordTooShort INSTANCE = new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordTooShort();

        public final int hashCode() {
            return 856884809;
        }

        private PasswordTooShort() {
            super(null);
        }

        public final java.lang.String toString() {
            return "PasswordTooShort";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordTooShort)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$PasswordTooLong;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class PasswordTooLong extends com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordTooLong INSTANCE = new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordTooLong();

        public final int hashCode() {
            return 1412912911;
        }

        private PasswordTooLong() {
            super(null);
        }

        public final java.lang.String toString() {
            return "PasswordTooLong";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordTooLong)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$PasswordTooWeak;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class PasswordTooWeak extends com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordTooWeak INSTANCE = new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordTooWeak();

        public final int hashCode() {
            return 1413230603;
        }

        private PasswordTooWeak() {
            super(null);
        }

        public final java.lang.String toString() {
            return "PasswordTooWeak";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordTooWeak)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$PasswordsDoNotMatch;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class PasswordsDoNotMatch extends com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordsDoNotMatch INSTANCE = new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordsDoNotMatch();

        public final int hashCode() {
            return 60931823;
        }

        private PasswordsDoNotMatch() {
            super(null);
        }

        public final java.lang.String toString() {
            return "PasswordsDoNotMatch";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordsDoNotMatch)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$PasswordRecentlyUsed;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class PasswordRecentlyUsed extends com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordRecentlyUsed INSTANCE = new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordRecentlyUsed();

        public final int hashCode() {
            return 1361636166;
        }

        private PasswordRecentlyUsed() {
            super(null);
        }

        public final java.lang.String toString() {
            return "PasswordRecentlyUsed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordRecentlyUsed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$PasswordIllegalCharacters;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class PasswordIllegalCharacters extends com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordIllegalCharacters INSTANCE = new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordIllegalCharacters();

        public final int hashCode() {
            return -468137761;
        }

        private PasswordIllegalCharacters() {
            super(null);
        }

        public final java.lang.String toString() {
            return "PasswordIllegalCharacters";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordIllegalCharacters)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$PasswordMatchesCredential;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class PasswordMatchesCredential extends com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordMatchesCredential INSTANCE = new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordMatchesCredential();

        public final int hashCode() {
            return 758002761;
        }

        private PasswordMatchesCredential() {
            super(null);
        }

        public final java.lang.String toString() {
            return "PasswordMatchesCredential";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordMatchesCredential)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$PasswordSequence;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class PasswordSequence extends com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordSequence INSTANCE = new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordSequence();

        public final int hashCode() {
            return -1082460542;
        }

        private PasswordSequence() {
            super(null);
        }

        public final java.lang.String toString() {
            return "PasswordSequence";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordSequence)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$PasswordRepeatedCharacters;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class PasswordRepeatedCharacters extends com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordRepeatedCharacters INSTANCE = new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordRepeatedCharacters();

        public final int hashCode() {
            return -1775307003;
        }

        private PasswordRepeatedCharacters() {
            super(null);
        }

        public final java.lang.String toString() {
            return "PasswordRepeatedCharacters";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordRepeatedCharacters)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$PasswordForbiddenWord;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class PasswordForbiddenWord extends com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordForbiddenWord INSTANCE = new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordForbiddenWord();

        public final int hashCode() {
            return -1545419646;
        }

        private PasswordForbiddenWord() {
            super(null);
        }

        public final java.lang.String toString() {
            return "PasswordForbiddenWord";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.PasswordForbiddenWord)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$InvalidResetToken;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class InvalidResetToken extends com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.InvalidResetToken INSTANCE = new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.InvalidResetToken();

        public final int hashCode() {
            return 2044453115;
        }

        private InvalidResetToken() {
            super(null);
        }

        public final java.lang.String toString() {
            return "InvalidResetToken";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.InvalidResetToken)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$ExpiredResetToken;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class ExpiredResetToken extends com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.ExpiredResetToken INSTANCE = new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.ExpiredResetToken();

        public final int hashCode() {
            return 1929147561;
        }

        private ExpiredResetToken() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ExpiredResetToken";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.ExpiredResetToken)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$NetworkError;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class NetworkError extends com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.NetworkError INSTANCE = new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.NetworkError();

        public final int hashCode() {
            return 497242752;
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
            if (!(other instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.NetworkError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$ServerError;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$ServerError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class ServerError extends com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError {
        public static final int $stable = 0;
        private final java.lang.String message;

        public ServerError(java.lang.String str) {
            super(null);
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ServerError(message=");
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
            return (other instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.ServerError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.ServerError) other).message);
        }

        public final com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.ServerError copy(java.lang.String message) {
            return new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.ServerError(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.ServerError copy$default(com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.ServerError serverError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = serverError.message;
            }
            return serverError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError$UnknownError;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class UnknownError extends com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.UnknownError INSTANCE = new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.UnknownError();

        public final int hashCode() {
            return -802557468;
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
            if (!(other instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.UnknownError)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ PasswordRecoveryError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
