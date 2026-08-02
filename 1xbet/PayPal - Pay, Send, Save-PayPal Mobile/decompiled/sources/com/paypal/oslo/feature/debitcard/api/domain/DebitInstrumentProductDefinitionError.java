package com.paypal.oslo.feature.debitcard.api.domain;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/domain/DebitInstrumentProductDefinitionError;", "", "<init>", "()V", "Network", "ProductNotFound", "Unknown", "Lcom/paypal/oslo/feature/debitcard/api/domain/DebitInstrumentProductDefinitionError$Network;", "Lcom/paypal/oslo/feature/debitcard/api/domain/DebitInstrumentProductDefinitionError$ProductNotFound;", "Lcom/paypal/oslo/feature/debitcard/api/domain/DebitInstrumentProductDefinitionError$Unknown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DebitInstrumentProductDefinitionError {
    public static final int $stable = 0;

    private DebitInstrumentProductDefinitionError() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/domain/DebitInstrumentProductDefinitionError$Network;", "Lcom/paypal/oslo/feature/debitcard/api/domain/DebitInstrumentProductDefinitionError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Network extends com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionError.Network INSTANCE = new com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionError.Network();

        public final int hashCode() {
            return -1106340954;
        }

        private Network() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Network";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionError.Network)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/domain/DebitInstrumentProductDefinitionError$ProductNotFound;", "Lcom/paypal/oslo/feature/debitcard/api/domain/DebitInstrumentProductDefinitionError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProductNotFound extends com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionError.ProductNotFound INSTANCE = new com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionError.ProductNotFound();

        public final int hashCode() {
            return -179446794;
        }

        private ProductNotFound() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ProductNotFound";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionError.ProductNotFound)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/domain/DebitInstrumentProductDefinitionError$Unknown;", "Lcom/paypal/oslo/feature/debitcard/api/domain/DebitInstrumentProductDefinitionError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Unknown extends com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionError.Unknown INSTANCE = new com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionError.Unknown();

        public final int hashCode() {
            return 1060300226;
        }

        private Unknown() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Unknown";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.api.domain.DebitInstrumentProductDefinitionError.Unknown)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ DebitInstrumentProductDefinitionError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
