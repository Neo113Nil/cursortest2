package ee.forgr.nativepurchases;

import com.android.billingclient.api.Purchase;

/* loaded from: classes2.dex */
final class PurchaseActionDecider {

    interface PurchaseDetails {
        int getPurchaseState();

        boolean isAcknowledged();
    }

    private PurchaseActionDecider() {
    }

    static PurchaseAction decide(boolean z, Purchase purchase) {
        return decide(z, purchase == null ? null : new PurchaseDetailsAdapter(purchase));
    }

    static PurchaseAction decide(boolean z, PurchaseDetails purchaseDetails) {
        if (purchaseDetails == null) {
            return PurchaseAction.NONE;
        }
        if (purchaseDetails.getPurchaseState() != 1) {
            return PurchaseAction.NONE;
        }
        if (z) {
            return PurchaseAction.CONSUME;
        }
        if (purchaseDetails.isAcknowledged()) {
            return PurchaseAction.NONE;
        }
        return PurchaseAction.ACKNOWLEDGE;
    }

    private static final class PurchaseDetailsAdapter implements PurchaseDetails {
        private final Purchase purchase;

        PurchaseDetailsAdapter(Purchase purchase) {
            this.purchase = purchase;
        }

        @Override // ee.forgr.nativepurchases.PurchaseActionDecider.PurchaseDetails
        public int getPurchaseState() {
            return this.purchase.getPurchaseState();
        }

        @Override // ee.forgr.nativepurchases.PurchaseActionDecider.PurchaseDetails
        public boolean isAcknowledged() {
            return this.purchase.isAcknowledged();
        }
    }
}
