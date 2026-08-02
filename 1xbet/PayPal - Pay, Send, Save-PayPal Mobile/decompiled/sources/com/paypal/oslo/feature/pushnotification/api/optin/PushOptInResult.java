package com.paypal.oslo.feature.pushnotification.api.optin;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/api/optin/PushOptInResult;", "", "Granted", "Denied", "RequiresSettings", "NotRequired", "Lcom/paypal/oslo/feature/pushnotification/api/optin/PushOptInResult$Denied;", "Lcom/paypal/oslo/feature/pushnotification/api/optin/PushOptInResult$Granted;", "Lcom/paypal/oslo/feature/pushnotification/api/optin/PushOptInResult$NotRequired;", "Lcom/paypal/oslo/feature/pushnotification/api/optin/PushOptInResult$RequiresSettings;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface PushOptInResult {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/api/optin/PushOptInResult$Granted;", "Lcom/paypal/oslo/feature/pushnotification/api/optin/PushOptInResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Granted implements com.paypal.oslo.feature.pushnotification.api.optin.PushOptInResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.pushnotification.api.optin.PushOptInResult.Granted INSTANCE = new com.paypal.oslo.feature.pushnotification.api.optin.PushOptInResult.Granted();

        public final int hashCode() {
            return -421672666;
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
            if (!(other instanceof com.paypal.oslo.feature.pushnotification.api.optin.PushOptInResult.Granted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/api/optin/PushOptInResult$Denied;", "Lcom/paypal/oslo/feature/pushnotification/api/optin/PushOptInResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Denied implements com.paypal.oslo.feature.pushnotification.api.optin.PushOptInResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.pushnotification.api.optin.PushOptInResult.Denied INSTANCE = new com.paypal.oslo.feature.pushnotification.api.optin.PushOptInResult.Denied();

        public final int hashCode() {
            return 1274359760;
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
            if (!(other instanceof com.paypal.oslo.feature.pushnotification.api.optin.PushOptInResult.Denied)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/api/optin/PushOptInResult$RequiresSettings;", "Lcom/paypal/oslo/feature/pushnotification/api/optin/PushOptInResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequiresSettings implements com.paypal.oslo.feature.pushnotification.api.optin.PushOptInResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.pushnotification.api.optin.PushOptInResult.RequiresSettings INSTANCE = new com.paypal.oslo.feature.pushnotification.api.optin.PushOptInResult.RequiresSettings();

        public final int hashCode() {
            return 1449948134;
        }

        private RequiresSettings() {
        }

        public final java.lang.String toString() {
            return "RequiresSettings";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pushnotification.api.optin.PushOptInResult.RequiresSettings)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/api/optin/PushOptInResult$NotRequired;", "Lcom/paypal/oslo/feature/pushnotification/api/optin/PushOptInResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NotRequired implements com.paypal.oslo.feature.pushnotification.api.optin.PushOptInResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.pushnotification.api.optin.PushOptInResult.NotRequired INSTANCE = new com.paypal.oslo.feature.pushnotification.api.optin.PushOptInResult.NotRequired();

        public final int hashCode() {
            return 417225853;
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
            if (!(other instanceof com.paypal.oslo.feature.pushnotification.api.optin.PushOptInResult.NotRequired)) {
                return false;
            }
            return true;
        }
    }
}
