package org.cocos2dx.bole.amazon.iap;

/* loaded from: classes6.dex */
public class AmazonIapManager {
    public static java.lang.String TAG = "bole";
    public static int luaCallback;
    public static org.cocos2dx.bole.amazon.iap.SampleIapManager sampleIapManager;

    public static void setupIAPOnCreate(android.app.Activity activity) {
        org.cocos2dx.bole.amazon.iap.SampleIapManager sampleIapManager2 = new org.cocos2dx.bole.amazon.iap.SampleIapManager(activity);
        sampleIapManager = sampleIapManager2;
        sampleIapManager2.activate();
        org.cocos2dx.bole.amazon.iap.SamplePurchasingListener samplePurchasingListener = new org.cocos2dx.bole.amazon.iap.SamplePurchasingListener(sampleIapManager);
        android.util.Log.d(TAG, "onCreate: registering PurchasingListener");
        com.amazon.device.iap.PurchasingService.registerListener(activity.getApplicationContext(), samplePurchasingListener);
        android.util.Log.d(TAG, "IS_SANDBOX_MODE:" + com.amazon.device.iap.PurchasingService.IS_SANDBOX_MODE);
    }

    public static void onResume() {
        sampleIapManager.activate();
        com.amazon.device.iap.PurchasingService.getUserData();
        com.amazon.device.iap.PurchasingService.getPurchaseUpdates(false);
    }

    public static java.lang.String purchase(java.lang.String str, int i) {
        luaCallback = i;
        return com.amazon.device.iap.PurchasingService.purchase(str).toString();
    }

    public static void consume(java.lang.String str, java.lang.String str2) {
        sampleIapManager.handleVerifiedPurchase(str, str2);
    }
}
