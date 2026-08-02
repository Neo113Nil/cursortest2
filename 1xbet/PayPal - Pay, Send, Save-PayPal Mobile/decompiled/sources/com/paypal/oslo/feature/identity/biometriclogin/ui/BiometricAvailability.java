package com.paypal.oslo.feature.identity.biometriclogin.ui;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u00072\u00020\u0001:\u0007\b\t\n\u000b\f\r\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricAvailability;", "", "<init>", "()V", "", "isAvailable", "()Z", "Companion", "Available", "NoneEnrolled", "HardwareUnavailable", "NoHardware", "SecurityUpdateRequired", "Unknown", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricAvailability$Available;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricAvailability$HardwareUnavailable;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricAvailability$NoHardware;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricAvailability$NoneEnrolled;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricAvailability$SecurityUpdateRequired;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricAvailability$Unknown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class BiometricAvailability {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability.Companion INSTANCE = new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability.Companion(null);

    private BiometricAvailability() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricAvailability$Available;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricAvailability;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Available extends com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability.Available INSTANCE = new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability.Available();

        public final int hashCode() {
            return 489969746;
        }

        private Available() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Available";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability.Available)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricAvailability$NoneEnrolled;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricAvailability;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoneEnrolled extends com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability.NoneEnrolled INSTANCE = new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability.NoneEnrolled();

        public final int hashCode() {
            return -289455884;
        }

        private NoneEnrolled() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NoneEnrolled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability.NoneEnrolled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricAvailability$HardwareUnavailable;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricAvailability;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HardwareUnavailable extends com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability.HardwareUnavailable INSTANCE = new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability.HardwareUnavailable();

        public final int hashCode() {
            return -95514735;
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
            if (!(other instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability.HardwareUnavailable)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricAvailability$NoHardware;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricAvailability;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoHardware extends com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability.NoHardware INSTANCE = new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability.NoHardware();

        public final int hashCode() {
            return 561244768;
        }

        private NoHardware() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NoHardware";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability.NoHardware)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricAvailability$SecurityUpdateRequired;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricAvailability;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SecurityUpdateRequired extends com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability.SecurityUpdateRequired INSTANCE = new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability.SecurityUpdateRequired();

        public final int hashCode() {
            return -243680257;
        }

        private SecurityUpdateRequired() {
            super(null);
        }

        public final java.lang.String toString() {
            return "SecurityUpdateRequired";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability.SecurityUpdateRequired)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricAvailability$Unknown;", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricAvailability;", "", "statusCode", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricAvailability$Unknown;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getStatusCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Unknown extends com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability {
        public static final int $stable = 0;
        private final int statusCode;

        public Unknown(int i) {
            super(null);
            this.statusCode = i;
        }

        public final int getStatusCode() {
            return this.statusCode;
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
            return (other instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability.Unknown) && this.statusCode == ((com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability.Unknown) other).statusCode;
        }

        public final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability.Unknown copy(int statusCode) {
            return new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability.Unknown(statusCode);
        }

        /* renamed from: component1, reason: from getter */
        public final int getStatusCode() {
            return this.statusCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability.Unknown copy$default(com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability.Unknown unknown, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = unknown.statusCode;
            }
            return unknown.copy(i);
        }
    }

    public final boolean isAvailable() {
        return this instanceof com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability.Available;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricAvailability$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricAvailability;", "check", "(Landroid/content/Context;)Lcom/paypal/oslo/feature/identity/biometriclogin/ui/BiometricAvailability;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability check(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            androidx.biometric.BiometricManager from = androidx.biometric.BiometricManager.from(context);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "");
            int canAuthenticate = from.canAuthenticate(15);
            if (canAuthenticate == -1) {
                return new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability.Unknown(-1);
            }
            if (canAuthenticate == 0) {
                return com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability.Available.INSTANCE;
            }
            if (canAuthenticate == 1) {
                return com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability.HardwareUnavailable.INSTANCE;
            }
            if (canAuthenticate == 11) {
                return com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability.NoneEnrolled.INSTANCE;
            }
            if (canAuthenticate == 12) {
                return com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability.NoHardware.INSTANCE;
            }
            if (canAuthenticate == 15) {
                return com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability.SecurityUpdateRequired.INSTANCE;
            }
            return new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricAvailability.Unknown(canAuthenticate);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BiometricAvailability(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
