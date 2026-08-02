package org.betup.services.billing;

/* loaded from: classes2.dex */
public interface PurchaseConfirmationListener {
    void onPurchaseCanceledByUser();

    void onPurchaseConfirmed(String skuId);

    void onVideoConfirmed();
}
