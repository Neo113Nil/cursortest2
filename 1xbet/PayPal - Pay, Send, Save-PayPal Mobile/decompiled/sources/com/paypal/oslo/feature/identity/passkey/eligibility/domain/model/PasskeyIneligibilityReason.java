package com.paypal.oslo.feature.identity.passkey.eligibility.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/model/PasskeyIneligibilityReason;", "", "FeatureDisabled", "OsVersionNotSupported", "NoUVPAA", "NoPasskeyEnrolled", "RunningOnEmulator", "Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/model/PasskeyIneligibilityReason$FeatureDisabled;", "Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/model/PasskeyIneligibilityReason$NoPasskeyEnrolled;", "Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/model/PasskeyIneligibilityReason$NoUVPAA;", "Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/model/PasskeyIneligibilityReason$OsVersionNotSupported;", "Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/model/PasskeyIneligibilityReason$RunningOnEmulator;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface PasskeyIneligibilityReason {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/model/PasskeyIneligibilityReason$FeatureDisabled;", "Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/model/PasskeyIneligibilityReason;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FeatureDisabled implements com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason.FeatureDisabled INSTANCE = new com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason.FeatureDisabled();

        public final int hashCode() {
            return 1862328689;
        }

        private FeatureDisabled() {
        }

        public final java.lang.String toString() {
            return "FeatureDisabled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason.FeatureDisabled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/model/PasskeyIneligibilityReason$OsVersionNotSupported;", "Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/model/PasskeyIneligibilityReason;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OsVersionNotSupported implements com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason.OsVersionNotSupported INSTANCE = new com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason.OsVersionNotSupported();

        public final int hashCode() {
            return 209729070;
        }

        private OsVersionNotSupported() {
        }

        public final java.lang.String toString() {
            return "OsVersionNotSupported";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason.OsVersionNotSupported)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/model/PasskeyIneligibilityReason$NoUVPAA;", "Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/model/PasskeyIneligibilityReason;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoUVPAA implements com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason.NoUVPAA INSTANCE = new com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason.NoUVPAA();

        public final int hashCode() {
            return 997321197;
        }

        private NoUVPAA() {
        }

        public final java.lang.String toString() {
            return "NoUVPAA";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason.NoUVPAA)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/model/PasskeyIneligibilityReason$NoPasskeyEnrolled;", "Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/model/PasskeyIneligibilityReason;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoPasskeyEnrolled implements com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason.NoPasskeyEnrolled INSTANCE = new com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason.NoPasskeyEnrolled();

        public final int hashCode() {
            return -691779407;
        }

        private NoPasskeyEnrolled() {
        }

        public final java.lang.String toString() {
            return "NoPasskeyEnrolled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason.NoPasskeyEnrolled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/model/PasskeyIneligibilityReason$RunningOnEmulator;", "Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/model/PasskeyIneligibilityReason;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RunningOnEmulator implements com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason.RunningOnEmulator INSTANCE = new com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason.RunningOnEmulator();

        public final int hashCode() {
            return 175114066;
        }

        private RunningOnEmulator() {
        }

        public final java.lang.String toString() {
            return "RunningOnEmulator";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason.RunningOnEmulator)) {
                return false;
            }
            return true;
        }
    }
}
