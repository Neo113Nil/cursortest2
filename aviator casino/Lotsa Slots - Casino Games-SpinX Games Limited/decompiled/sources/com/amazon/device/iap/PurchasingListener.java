package com.amazon.device.iap;

/* loaded from: classes2.dex */
public interface PurchasingListener {
    void onProductDataResponse(com.amazon.device.iap.model.ProductDataResponse productDataResponse);

    void onPurchaseResponse(com.amazon.device.iap.model.PurchaseResponse purchaseResponse);

    void onPurchaseUpdatesResponse(com.amazon.device.iap.model.PurchaseUpdatesResponse purchaseUpdatesResponse);

    void onUserDataResponse(com.amazon.device.iap.model.UserDataResponse userDataResponse);
}
