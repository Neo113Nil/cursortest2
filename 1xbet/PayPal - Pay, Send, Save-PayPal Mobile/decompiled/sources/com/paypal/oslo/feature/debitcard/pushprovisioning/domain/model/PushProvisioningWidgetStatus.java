package com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/PushProvisioningWidgetStatus;", "", "<init>", "()V", "Ineligible", "AddToWallet", "ManageWallet", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/PushProvisioningWidgetStatus$AddToWallet;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/PushProvisioningWidgetStatus$Ineligible;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/PushProvisioningWidgetStatus$ManageWallet;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class PushProvisioningWidgetStatus {
    public static final int $stable = 0;

    private PushProvisioningWidgetStatus() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/PushProvisioningWidgetStatus$Ineligible;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/PushProvisioningWidgetStatus;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ineligible extends com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus.Ineligible INSTANCE = new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus.Ineligible();

        public final int hashCode() {
            return 1428368066;
        }

        private Ineligible() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Ineligible";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus.Ineligible)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/PushProvisioningWidgetStatus$AddToWallet;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/PushProvisioningWidgetStatus;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddToWallet extends com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus.AddToWallet INSTANCE = new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus.AddToWallet();

        public final int hashCode() {
            return -309775857;
        }

        private AddToWallet() {
            super(null);
        }

        public final java.lang.String toString() {
            return "AddToWallet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus.AddToWallet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/PushProvisioningWidgetStatus$ManageWallet;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/PushProvisioningWidgetStatus;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ManageWallet extends com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus.ManageWallet INSTANCE = new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus.ManageWallet();

        public final int hashCode() {
            return 125648132;
        }

        private ManageWallet() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ManageWallet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus.ManageWallet)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ PushProvisioningWidgetStatus(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
