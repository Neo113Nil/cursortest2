package com.paypal.oslo.feature.identity.passwordlogin.domain.validator;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordlogin/domain/validator/PasswordValidationResult;", "", "<init>", "()V", "Valid", "Invalid", "Lcom/paypal/oslo/feature/identity/passwordlogin/domain/validator/PasswordValidationResult$Invalid;", "Lcom/paypal/oslo/feature/identity/passwordlogin/domain/validator/PasswordValidationResult$Valid;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class PasswordValidationResult {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordlogin/domain/validator/PasswordValidationResult$Valid;", "Lcom/paypal/oslo/feature/identity/passwordlogin/domain/validator/PasswordValidationResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Valid extends com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidationResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidationResult.Valid INSTANCE = new com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidationResult.Valid();

        public final int hashCode() {
            return 26510982;
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
            if (!(other instanceof com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidationResult.Valid)) {
                return false;
            }
            return true;
        }
    }

    private PasswordValidationResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordlogin/domain/validator/PasswordValidationResult$Invalid;", "Lcom/paypal/oslo/feature/identity/passwordlogin/domain/validator/PasswordValidationResult;", "<init>", "()V", "RangeMismatch", "ContainsDisallowedCharacters", "Lcom/paypal/oslo/feature/identity/passwordlogin/domain/validator/PasswordValidationResult$Invalid$ContainsDisallowedCharacters;", "Lcom/paypal/oslo/feature/identity/passwordlogin/domain/validator/PasswordValidationResult$Invalid$RangeMismatch;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Invalid extends com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidationResult {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordlogin/domain/validator/PasswordValidationResult$Invalid$RangeMismatch;", "Lcom/paypal/oslo/feature/identity/passwordlogin/domain/validator/PasswordValidationResult$Invalid;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class RangeMismatch extends com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidationResult.Invalid {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidationResult.Invalid.RangeMismatch INSTANCE = new com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidationResult.Invalid.RangeMismatch();

            public final int hashCode() {
                return 144598238;
            }

            private RangeMismatch() {
                super(null);
            }

            public final java.lang.String toString() {
                return "RangeMismatch";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidationResult.Invalid.RangeMismatch)) {
                    return false;
                }
                return true;
            }
        }

        private Invalid() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordlogin/domain/validator/PasswordValidationResult$Invalid$ContainsDisallowedCharacters;", "Lcom/paypal/oslo/feature/identity/passwordlogin/domain/validator/PasswordValidationResult$Invalid;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ContainsDisallowedCharacters extends com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidationResult.Invalid {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidationResult.Invalid.ContainsDisallowedCharacters INSTANCE = new com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidationResult.Invalid.ContainsDisallowedCharacters();

            public final int hashCode() {
                return 676889872;
            }

            private ContainsDisallowedCharacters() {
                super(null);
            }

            public final java.lang.String toString() {
                return "ContainsDisallowedCharacters";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.identity.passwordlogin.domain.validator.PasswordValidationResult.Invalid.ContainsDisallowedCharacters)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ Invalid(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PasswordValidationResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
