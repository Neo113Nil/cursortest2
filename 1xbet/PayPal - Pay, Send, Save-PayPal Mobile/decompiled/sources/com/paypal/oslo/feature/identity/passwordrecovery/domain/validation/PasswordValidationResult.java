package com.paypal.oslo.feature.identity.passwordrecovery.domain.validation;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidationResult;", "", "<init>", "()V", "Valid", "Empty", "TooShort", "TooLong", "TooWeak", "MatchesCredential", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidationResult$Empty;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidationResult$MatchesCredential;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidationResult$TooLong;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidationResult$TooShort;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidationResult$TooWeak;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidationResult$Valid;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PasswordValidationResult {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidationResult$Valid;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidationResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Valid extends com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult.Valid INSTANCE = new com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult.Valid();

        public final int hashCode() {
            return 32987305;
        }

        private Valid() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Valid";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult.Valid)) {
                return false;
            }
            return true;
        }
    }

    private PasswordValidationResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidationResult$Empty;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidationResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Empty extends com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult.Empty INSTANCE = new com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult.Empty();

        public final int hashCode() {
            return 17649146;
        }

        private Empty() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Empty";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult.Empty)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidationResult$TooShort;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidationResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TooShort extends com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult.TooShort INSTANCE = new com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult.TooShort();

        public final int hashCode() {
            return -407411781;
        }

        private TooShort() {
            super(null);
        }

        public final java.lang.String toString() {
            return "TooShort";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult.TooShort)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidationResult$TooLong;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidationResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TooLong extends com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult.TooLong INSTANCE = new com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult.TooLong();

        public final int hashCode() {
            return 263750493;
        }

        private TooLong() {
            super(null);
        }

        public final java.lang.String toString() {
            return "TooLong";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult.TooLong)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidationResult$TooWeak;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidationResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TooWeak extends com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult.TooWeak INSTANCE = new com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult.TooWeak();

        public final int hashCode() {
            return 264068185;
        }

        private TooWeak() {
            super(null);
        }

        public final java.lang.String toString() {
            return "TooWeak";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult.TooWeak)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidationResult$MatchesCredential;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/validation/PasswordValidationResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MatchesCredential extends com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult.MatchesCredential INSTANCE = new com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult.MatchesCredential();

        public final int hashCode() {
            return -405350633;
        }

        private MatchesCredential() {
            super(null);
        }

        public final java.lang.String toString() {
            return "MatchesCredential";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.validation.PasswordValidationResult.MatchesCredential)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ PasswordValidationResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
