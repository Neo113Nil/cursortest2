package com.paypal.oslo.feature.businessinventory.api.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxInventoryUpdate;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/InventoryUpdate;", "TaxAdded", "TaxUpdated", "TaxDeleted", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxInventoryUpdate$TaxAdded;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxInventoryUpdate$TaxDeleted;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxInventoryUpdate$TaxUpdated;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface TaxInventoryUpdate extends com.paypal.oslo.feature.businessinventory.api.domain.model.InventoryUpdate {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxInventoryUpdate$TaxAdded;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxInventoryUpdate;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TaxAdded implements com.paypal.oslo.feature.businessinventory.api.domain.model.TaxInventoryUpdate {
        public static final com.paypal.oslo.feature.businessinventory.api.domain.model.TaxInventoryUpdate.TaxAdded INSTANCE = new com.paypal.oslo.feature.businessinventory.api.domain.model.TaxInventoryUpdate.TaxAdded();

        public final int hashCode() {
            return 1449269329;
        }

        private TaxAdded() {
        }

        public final java.lang.String toString() {
            return "TaxAdded";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businessinventory.api.domain.model.TaxInventoryUpdate.TaxAdded)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxInventoryUpdate$TaxUpdated;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxInventoryUpdate;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TaxUpdated implements com.paypal.oslo.feature.businessinventory.api.domain.model.TaxInventoryUpdate {
        public static final com.paypal.oslo.feature.businessinventory.api.domain.model.TaxInventoryUpdate.TaxUpdated INSTANCE = new com.paypal.oslo.feature.businessinventory.api.domain.model.TaxInventoryUpdate.TaxUpdated();

        public final int hashCode() {
            return 2092074956;
        }

        private TaxUpdated() {
        }

        public final java.lang.String toString() {
            return "TaxUpdated";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businessinventory.api.domain.model.TaxInventoryUpdate.TaxUpdated)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxInventoryUpdate$TaxDeleted;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxInventoryUpdate;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TaxDeleted implements com.paypal.oslo.feature.businessinventory.api.domain.model.TaxInventoryUpdate {
        public static final com.paypal.oslo.feature.businessinventory.api.domain.model.TaxInventoryUpdate.TaxDeleted INSTANCE = new com.paypal.oslo.feature.businessinventory.api.domain.model.TaxInventoryUpdate.TaxDeleted();

        public final int hashCode() {
            return -417999062;
        }

        private TaxDeleted() {
        }

        public final java.lang.String toString() {
            return "TaxDeleted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businessinventory.api.domain.model.TaxInventoryUpdate.TaxDeleted)) {
                return false;
            }
            return true;
        }
    }
}
