package com.paypal.oslo.feature.identity.shared.domain.capability;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/capability/DeviceLockCapability;", "", "", "isAvailable", "()Z", "Available", "NotConfigured", "Lcom/paypal/oslo/feature/identity/shared/domain/capability/DeviceLockCapability$Available;", "Lcom/paypal/oslo/feature/identity/shared/domain/capability/DeviceLockCapability$NotConfigured;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface DeviceLockCapability {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/capability/DeviceLockCapability$Available;", "Lcom/paypal/oslo/feature/identity/shared/domain/capability/DeviceLockCapability;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Available implements com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapability {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapability.Available INSTANCE = new com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapability.Available();

        public final int hashCode() {
            return -920515062;
        }

        private Available() {
        }

        @Override // com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapability
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
            if (!(other instanceof com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapability.Available)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/capability/DeviceLockCapability$NotConfigured;", "Lcom/paypal/oslo/feature/identity/shared/domain/capability/DeviceLockCapability;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NotConfigured implements com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapability {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapability.NotConfigured INSTANCE = new com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapability.NotConfigured();

        public final int hashCode() {
            return -1327476686;
        }

        private NotConfigured() {
        }

        @Override // com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapability
        public final /* bridge */ boolean isAvailable() {
            return super.isAvailable();
        }

        public final java.lang.String toString() {
            return "NotConfigured";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapability.NotConfigured)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static boolean isAvailable(com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapability deviceLockCapability) {
            return com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapability.super.isAvailable();
        }
    }

    default boolean isAvailable() {
        return this instanceof com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapability.Available;
    }
}
