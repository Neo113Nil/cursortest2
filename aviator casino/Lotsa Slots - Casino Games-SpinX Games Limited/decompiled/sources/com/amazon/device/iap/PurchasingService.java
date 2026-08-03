package com.amazon.device.iap;

/* loaded from: classes2.dex */
public final class PurchasingService {
    public static final boolean IS_SANDBOX_MODE = com.amazon.device.iap.internal.e.a();
    public static final java.lang.String SDK_VERSION = "2.0.61.0";
    private static final java.lang.String TAG = "PurchasingService";

    private PurchasingService() {
        android.util.Log.i(TAG, "In-App Purchasing SDK initializing. SDK Version 2.0.61.0, IS_SANDBOX_MODE: " + IS_SANDBOX_MODE);
    }

    public static void registerListener(android.content.Context context, com.amazon.device.iap.PurchasingListener purchasingListener) {
        com.amazon.device.iap.internal.d.d().a(context, purchasingListener);
    }

    public static com.amazon.device.iap.model.RequestId getUserData() {
        return com.amazon.device.iap.internal.d.d().c();
    }

    public static com.amazon.device.iap.model.RequestId purchase(java.lang.String str) {
        return com.amazon.device.iap.internal.d.d().a(str);
    }

    public static com.amazon.device.iap.model.RequestId getProductData(java.util.Set<java.lang.String> set) {
        return com.amazon.device.iap.internal.d.d().a(set);
    }

    public static com.amazon.device.iap.model.RequestId getPurchaseUpdates(boolean z) {
        return com.amazon.device.iap.internal.d.d().a(z);
    }

    public static void notifyFulfillment(java.lang.String str, com.amazon.device.iap.model.FulfillmentResult fulfillmentResult) {
        com.amazon.device.iap.internal.d.d().a(str, fulfillmentResult);
    }
}
