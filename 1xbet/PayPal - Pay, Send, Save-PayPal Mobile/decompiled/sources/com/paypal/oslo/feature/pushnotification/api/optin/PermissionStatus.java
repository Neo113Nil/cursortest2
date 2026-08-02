package com.paypal.oslo.feature.pushnotification.api.optin;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/api/optin/PermissionStatus;", "", "Granted", "Denied", "PermanentlyDenied", "NotRequired", "Lcom/paypal/oslo/feature/pushnotification/api/optin/PermissionStatus$Denied;", "Lcom/paypal/oslo/feature/pushnotification/api/optin/PermissionStatus$Granted;", "Lcom/paypal/oslo/feature/pushnotification/api/optin/PermissionStatus$NotRequired;", "Lcom/paypal/oslo/feature/pushnotification/api/optin/PermissionStatus$PermanentlyDenied;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface PermissionStatus {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/api/optin/PermissionStatus$Granted;", "Lcom/paypal/oslo/feature/pushnotification/api/optin/PermissionStatus;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Granted implements com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus.Granted INSTANCE = new com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus.Granted();

        public final int hashCode() {
            return 426596496;
        }

        private Granted() {
        }

        public final java.lang.String toString() {
            return "Granted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus.Granted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/api/optin/PermissionStatus$Denied;", "Lcom/paypal/oslo/feature/pushnotification/api/optin/PermissionStatus;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Denied implements com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus.Denied INSTANCE = new com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus.Denied();

        public final int hashCode() {
            return 1994459942;
        }

        private Denied() {
        }

        public final java.lang.String toString() {
            return "Denied";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus.Denied)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/api/optin/PermissionStatus$PermanentlyDenied;", "Lcom/paypal/oslo/feature/pushnotification/api/optin/PermissionStatus;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PermanentlyDenied implements com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus.PermanentlyDenied INSTANCE = new com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus.PermanentlyDenied();

        public final int hashCode() {
            return 1696659915;
        }

        private PermanentlyDenied() {
        }

        public final java.lang.String toString() {
            return "PermanentlyDenied";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus.PermanentlyDenied)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/api/optin/PermissionStatus$NotRequired;", "Lcom/paypal/oslo/feature/pushnotification/api/optin/PermissionStatus;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NotRequired implements com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus.NotRequired INSTANCE = new com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus.NotRequired();

        public final int hashCode() {
            return 1357129447;
        }

        private NotRequired() {
        }

        public final java.lang.String toString() {
            return "NotRequired";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pushnotification.api.optin.PermissionStatus.NotRequired)) {
                return false;
            }
            return true;
        }
    }
}
