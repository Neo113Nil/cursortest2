package com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/DeactivateContactlessResult;", "", "<init>", "()V", "Success", "Cancelled", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/DeactivateContactlessResult$Cancelled;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/DeactivateContactlessResult$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DeactivateContactlessResult {
    public static final int $stable = 0;

    private DeactivateContactlessResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/DeactivateContactlessResult$Success;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/DeactivateContactlessResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessResult.Success INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessResult.Success();

        public final int hashCode() {
            return -884475034;
        }

        private Success() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Success";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessResult.Success)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/DeactivateContactlessResult$Cancelled;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/deactivate/DeactivateContactlessResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Cancelled extends com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessResult.Cancelled INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessResult.Cancelled();

        public final int hashCode() {
            return -46557196;
        }

        private Cancelled() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Cancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.deactivate.DeactivateContactlessResult.Cancelled)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ DeactivateContactlessResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
