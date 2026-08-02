package com.paypal.oslo.feature.identity.shared.domain.capability;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0006\u0005\u0006\u0007\b\t\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0006\u000b\f\r\u000e\u000f\u0010À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/capability/BiometricCapability;", "", "", "isAvailable", "()Z", "Available", "NoneEnrolled", "HardwareUnavailable", "NoHardware", "SecurityUpdateRequired", "Unknown", "Lcom/paypal/oslo/feature/identity/shared/domain/capability/BiometricCapability$Available;", "Lcom/paypal/oslo/feature/identity/shared/domain/capability/BiometricCapability$HardwareUnavailable;", "Lcom/paypal/oslo/feature/identity/shared/domain/capability/BiometricCapability$NoHardware;", "Lcom/paypal/oslo/feature/identity/shared/domain/capability/BiometricCapability$NoneEnrolled;", "Lcom/paypal/oslo/feature/identity/shared/domain/capability/BiometricCapability$SecurityUpdateRequired;", "Lcom/paypal/oslo/feature/identity/shared/domain/capability/BiometricCapability$Unknown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface BiometricCapability {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/capability/BiometricCapability$Available;", "Lcom/paypal/oslo/feature/identity/shared/domain/capability/BiometricCapability;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Available implements com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability.Available INSTANCE = new com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability.Available();

        public final int hashCode() {
            return 2011242741;
        }

        private Available() {
        }

        @Override // com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability
        public final /* bridge */ boolean isAvailable() {
            return super.isAvailable();
        }

        public final java.lang.String toString() {
            return "Available";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability.Available)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/capability/BiometricCapability$NoneEnrolled;", "Lcom/paypal/oslo/feature/identity/shared/domain/capability/BiometricCapability;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoneEnrolled implements com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability.NoneEnrolled INSTANCE = new com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability.NoneEnrolled();

        public final int hashCode() {
            return -540569231;
        }

        private NoneEnrolled() {
        }

        @Override // com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability
        public final /* bridge */ boolean isAvailable() {
            return super.isAvailable();
        }

        public final java.lang.String toString() {
            return "NoneEnrolled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability.NoneEnrolled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/capability/BiometricCapability$HardwareUnavailable;", "Lcom/paypal/oslo/feature/identity/shared/domain/capability/BiometricCapability;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HardwareUnavailable implements com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability.HardwareUnavailable INSTANCE = new com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability.HardwareUnavailable();

        public final int hashCode() {
            return 1732192372;
        }

        private HardwareUnavailable() {
        }

        @Override // com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability
        public final /* bridge */ boolean isAvailable() {
            return super.isAvailable();
        }

        public final java.lang.String toString() {
            return "HardwareUnavailable";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability.HardwareUnavailable)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/capability/BiometricCapability$NoHardware;", "Lcom/paypal/oslo/feature/identity/shared/domain/capability/BiometricCapability;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoHardware implements com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability.NoHardware INSTANCE = new com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability.NoHardware();

        public final int hashCode() {
            return 476067357;
        }

        private NoHardware() {
        }

        @Override // com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability
        public final /* bridge */ boolean isAvailable() {
            return super.isAvailable();
        }

        public final java.lang.String toString() {
            return "NoHardware";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability.NoHardware)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/capability/BiometricCapability$SecurityUpdateRequired;", "Lcom/paypal/oslo/feature/identity/shared/domain/capability/BiometricCapability;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SecurityUpdateRequired implements com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability.SecurityUpdateRequired INSTANCE = new com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability.SecurityUpdateRequired();

        public final int hashCode() {
            return 1678332988;
        }

        private SecurityUpdateRequired() {
        }

        @Override // com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability
        public final /* bridge */ boolean isAvailable() {
            return super.isAvailable();
        }

        public final java.lang.String toString() {
            return "SecurityUpdateRequired";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability.SecurityUpdateRequired)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/capability/BiometricCapability$Unknown;", "Lcom/paypal/oslo/feature/identity/shared/domain/capability/BiometricCapability;", "", "statusCode", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/identity/shared/domain/capability/BiometricCapability$Unknown;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getStatusCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Unknown implements com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability {
        public static final int $stable = 0;
        private final int statusCode;

        public Unknown(int i) {
            this.statusCode = i;
        }

        public final int getStatusCode() {
            return this.statusCode;
        }

        @Override // com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability
        public final /* bridge */ boolean isAvailable() {
            return super.isAvailable();
        }

        public final java.lang.String toString() {
            int i = this.statusCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown(statusCode=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.statusCode);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability.Unknown) && this.statusCode == ((com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability.Unknown) other).statusCode;
        }

        public final com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability.Unknown copy(int statusCode) {
            return new com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability.Unknown(statusCode);
        }

        /* renamed from: component1, reason: from getter */
        public final int getStatusCode() {
            return this.statusCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability.Unknown copy$default(com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability.Unknown unknown, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = unknown.statusCode;
            }
            return unknown.copy(i);
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static boolean isAvailable(com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability biometricCapability) {
            return com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability.super.isAvailable();
        }
    }

    default boolean isAvailable() {
        return this instanceof com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapability.Available;
    }
}
