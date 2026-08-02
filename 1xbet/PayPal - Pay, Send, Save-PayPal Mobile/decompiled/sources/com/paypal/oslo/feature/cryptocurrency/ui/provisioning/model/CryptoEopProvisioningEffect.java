package com.paypal.oslo.feature.cryptocurrency.ui.provisioning.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/model/CryptoEopProvisioningEffect;", "", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, "Cancelled", "Error", "Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/model/CryptoEopProvisioningEffect$Cancelled;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/model/CryptoEopProvisioningEffect$Completed;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/model/CryptoEopProvisioningEffect$Error;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CryptoEopProvisioningEffect {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/model/CryptoEopProvisioningEffect$Completed;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/model/CryptoEopProvisioningEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Completed implements com.paypal.oslo.feature.cryptocurrency.ui.provisioning.model.CryptoEopProvisioningEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.provisioning.model.CryptoEopProvisioningEffect.Completed INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.provisioning.model.CryptoEopProvisioningEffect.Completed();

        public final int hashCode() {
            return -205224823;
        }

        private Completed() {
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.provisioning.model.CryptoEopProvisioningEffect.Completed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/model/CryptoEopProvisioningEffect$Cancelled;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/model/CryptoEopProvisioningEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Cancelled implements com.paypal.oslo.feature.cryptocurrency.ui.provisioning.model.CryptoEopProvisioningEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.provisioning.model.CryptoEopProvisioningEffect.Cancelled INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.provisioning.model.CryptoEopProvisioningEffect.Cancelled();

        public final int hashCode() {
            return 1674295183;
        }

        private Cancelled() {
        }

        public final java.lang.String toString() {
            return "Cancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.provisioning.model.CryptoEopProvisioningEffect.Cancelled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/model/CryptoEopProvisioningEffect$Error;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/model/CryptoEopProvisioningEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.oslo.feature.cryptocurrency.ui.provisioning.model.CryptoEopProvisioningEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.provisioning.model.CryptoEopProvisioningEffect.Error INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.provisioning.model.CryptoEopProvisioningEffect.Error();

        public final int hashCode() {
            return 1664429894;
        }

        private Error() {
        }

        public final java.lang.String toString() {
            return "Error";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.provisioning.model.CryptoEopProvisioningEffect.Error)) {
                return false;
            }
            return true;
        }
    }
}
