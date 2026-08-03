package org.cocos2dx.bole.amazon.iap;

/* loaded from: classes6.dex */
public class SampleIapManager {
    private static final java.lang.String CONSUMED = "CONSUMED";
    private static final java.lang.String REMAINING = "REMAINING";
    private static final java.lang.String TAG = "bole";
    private final android.content.Context context;
    private final org.cocos2dx.bole.amazon.iap.PurchaseDataSource dataSource;
    private final android.app.Activity mainActivity;
    private org.cocos2dx.bole.amazon.iap.UserIapData userIapData;

    private void revokeConsumablePurchase(com.amazon.device.iap.model.Receipt receipt, com.amazon.device.iap.model.UserData userData) {
    }

    public void disableAllPurchases() {
    }

    public void disablePurchaseForSkus(java.util.Set<java.lang.String> set) {
    }

    public void enablePurchaseForSkus(java.util.Map<java.lang.String, com.amazon.device.iap.model.Product> map) {
    }

    public void purchaseFailed(java.lang.String str) {
    }

    public void refreshOranges() {
    }

    public static class PurchaseRecord {
        private java.lang.String receiptId;
        private org.cocos2dx.bole.amazon.iap.PurchaseDataSource.PurchaseStatus status;
        private java.lang.String userId;

        public org.cocos2dx.bole.amazon.iap.PurchaseDataSource.PurchaseStatus getStatus() {
            return this.status;
        }

        public void setStatus(org.cocos2dx.bole.amazon.iap.PurchaseDataSource.PurchaseStatus purchaseStatus) {
            this.status = purchaseStatus;
        }

        public java.lang.String getReceiptId() {
            return this.receiptId;
        }

        public void setReceiptId(java.lang.String str) {
            this.receiptId = str;
        }

        public java.lang.String getUserId() {
            return this.userId;
        }

        public void setUserId(java.lang.String str) {
            this.userId = str;
        }
    }

    public SampleIapManager(android.app.Activity activity) {
        this.mainActivity = activity;
        android.content.Context applicationContext = activity.getApplicationContext();
        this.context = applicationContext;
        this.dataSource = new org.cocos2dx.bole.amazon.iap.PurchaseDataSource(applicationContext);
    }

    public void setAmazonUserId(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            if (this.userIapData != null) {
                this.userIapData = null;
            }
        } else {
            org.cocos2dx.bole.amazon.iap.UserIapData userIapData = this.userIapData;
            if (userIapData == null || !str.equals(userIapData.getAmazonUserId())) {
                this.userIapData = reloadUserData(str, str2);
            }
        }
    }

    public void serverVerified(final int i, final com.amazon.device.iap.model.Receipt receipt, final com.amazon.device.iap.model.UserData userData) {
        if (org.cocos2dx.bole.amazon.iap.AmazonIapManager.luaCallback != 0) {
            org.cocos2dx.plugin.PluginWrapper.runOnGLThread(new java.lang.Runnable() { // from class: org.cocos2dx.bole.amazon.iap.SampleIapManager.1
                @Override // java.lang.Runnable
                public void run() {
                    org.json.JSONObject json = receipt.toJSON();
                    try {
                        json.put("success", i);
                        if (i == 1) {
                            json.put("userId", userData.getUserId());
                        }
                        org.cocos2dx.lib.Cocos2dxLuaJavaBridge.callLuaFunctionWithString(org.cocos2dx.bole.amazon.iap.AmazonIapManager.luaCallback, json.toString());
                        org.cocos2dx.lib.Cocos2dxLuaJavaBridge.releaseLuaFunction(org.cocos2dx.bole.amazon.iap.AmazonIapManager.luaCallback);
                    } catch (java.lang.Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public void handleConsumablePurchase(com.amazon.device.iap.model.Receipt receipt, com.amazon.device.iap.model.UserData userData) {
        int i;
        try {
            if (receipt.isCanceled()) {
                revokeConsumablePurchase(receipt, userData);
                i = 0;
            } else {
                createPurchase(receipt.getReceiptId(), userData.getUserId());
                i = 1;
            }
            serverVerified(i, receipt, userData);
        } catch (java.lang.Throwable unused) {
        }
    }

    public void handleVerifiedPurchase(java.lang.String str, java.lang.String str2) {
        if (this.dataSource.getPurchaseRecord(str, str2) != null) {
            try {
                if (receiptAlreadyFulfilled(str, str2)) {
                    com.amazon.device.iap.PurchasingService.notifyFulfillment(str, com.amazon.device.iap.model.FulfillmentResult.FULFILLED);
                    return;
                } else {
                    grantConsumablePurchase(str);
                    return;
                }
            } catch (java.lang.Throwable unused) {
                return;
            }
        }
        java.util.List<org.cocos2dx.bole.amazon.iap.SubscriptionRecord> subscriptionRecords = this.dataSource.getSubscriptionRecords(str2);
        if (subscriptionRecords == null || subscriptionRecords.size() <= 0) {
            return;
        }
        java.util.Iterator<org.cocos2dx.bole.amazon.iap.SubscriptionRecord> it = subscriptionRecords.iterator();
        while (it.hasNext()) {
            if (it.next().getAmazonReceiptId().equals(str)) {
                grantSubscriptionPurchase(str, str2);
                return;
            }
        }
    }

    /* renamed from: org.cocos2dx.bole.amazon.iap.SampleIapManager$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$iap$model$ProductType;

        static {
            int[] iArr = new int[com.amazon.device.iap.model.ProductType.values().length];
            $SwitchMap$com$amazon$device$iap$model$ProductType = iArr;
            try {
                iArr[com.amazon.device.iap.model.ProductType.CONSUMABLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$device$iap$model$ProductType[com.amazon.device.iap.model.ProductType.ENTITLED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$device$iap$model$ProductType[com.amazon.device.iap.model.ProductType.SUBSCRIPTION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public void handleReceipt(com.amazon.device.iap.model.Receipt receipt, com.amazon.device.iap.model.UserData userData) {
        int i = org.cocos2dx.bole.amazon.iap.SampleIapManager.AnonymousClass2.$SwitchMap$com$amazon$device$iap$model$ProductType[receipt.getProductType().ordinal()];
        if (i == 1) {
            handleConsumablePurchase(receipt, userData);
        } else {
            if (i != 3) {
                return;
            }
            handleSubscriptionPurchase(receipt, userData);
        }
    }

    public void handleSubscriptionPurchase(com.amazon.device.iap.model.Receipt receipt, com.amazon.device.iap.model.UserData userData) {
        try {
            if (receipt.isCanceled()) {
                revokeSubscription(receipt, userData.getUserId());
            } else {
                saveSubscriptionRecord(receipt, userData.getUserId());
            }
            serverVerified(1, receipt, userData);
        } catch (java.lang.Throwable unused) {
            android.util.Log.d(TAG, "Purchase cannot be completed, please retry");
        }
    }

    private void grantSubscriptionPurchase(java.lang.String str, java.lang.String str2) {
        try {
            com.amazon.device.iap.PurchasingService.notifyFulfillment(str, com.amazon.device.iap.model.FulfillmentResult.FULFILLED);
        } catch (java.lang.Throwable th) {
            android.util.Log.e(TAG, "Failed to grant entitlement purchase, with error " + th.getMessage());
        }
    }

    private void saveSubscriptionRecord(com.amazon.device.iap.model.Receipt receipt, java.lang.String str) {
        this.dataSource.insertOrUpdateSubscriptionRecord(receipt.getReceiptId(), str, receipt.getPurchaseDate().getTime(), receipt.getCancelDate() == null ? org.cocos2dx.bole.amazon.iap.SubscriptionRecord.TO_DATE_NOT_SET : receipt.getCancelDate().getTime(), receipt.getSku());
    }

    private void revokeSubscription(com.amazon.device.iap.model.Receipt receipt, java.lang.String str) {
        this.dataSource.cancelSubscription(receipt.getReceiptId(), receipt.getCancelDate().getTime());
    }

    public boolean eatOrange() {
        if (this.userIapData.getRemainingOranges() <= 0) {
            return false;
        }
        org.cocos2dx.bole.amazon.iap.UserIapData userIapData = this.userIapData;
        userIapData.setConsumedOranges(userIapData.getConsumedOranges() + 1);
        org.cocos2dx.bole.amazon.iap.UserIapData userIapData2 = this.userIapData;
        userIapData2.setRemainingOranges(userIapData2.getRemainingOranges() - 1);
        saveUserIapData();
        return true;
    }

    public org.cocos2dx.bole.amazon.iap.UserIapData getUserIapData() {
        return this.userIapData;
    }

    public void deactivate() {
        this.dataSource.close();
    }

    public void activate() {
        this.dataSource.open();
    }

    private org.cocos2dx.bole.amazon.iap.UserIapData reloadUserData(java.lang.String str, java.lang.String str2) {
        org.cocos2dx.bole.amazon.iap.UserIapData userIapData = new org.cocos2dx.bole.amazon.iap.UserIapData(str, str2);
        android.content.SharedPreferences sharedPreferences = this.context.getSharedPreferences("ORANGES_" + str, 0);
        userIapData.setRemainingOranges(sharedPreferences.getInt(REMAINING, 0));
        userIapData.setConsumedOranges(sharedPreferences.getInt(CONSUMED, 0));
        return userIapData;
    }

    private void saveUserIapData() {
        org.cocos2dx.bole.amazon.iap.UserIapData userIapData = this.userIapData;
        if (userIapData == null || userIapData.getAmazonUserId() == null) {
            return;
        }
        try {
            android.content.SharedPreferences.Editor edit = this.context.getSharedPreferences("ORANGES_" + this.userIapData.getAmazonUserId(), 0).edit();
            edit.putInt(REMAINING, this.userIapData.getRemainingOranges());
            edit.putInt(CONSUMED, this.userIapData.getConsumedOranges());
            edit.commit();
        } catch (java.lang.Throwable unused) {
            android.util.Log.e(TAG, "failed to save user iap data:");
        }
    }

    private void grantConsumablePurchase(java.lang.String str) {
        try {
            if (updatePurchaseStatus(str, org.cocos2dx.bole.amazon.iap.PurchaseDataSource.PurchaseStatus.PAID, org.cocos2dx.bole.amazon.iap.PurchaseDataSource.PurchaseStatus.FULFILLED)) {
                saveUserIapData();
                android.util.Log.i(TAG, "Successfuly update purchase from PAID->FULFILLED for receipt id " + str);
                com.amazon.device.iap.PurchasingService.notifyFulfillment(str, com.amazon.device.iap.model.FulfillmentResult.FULFILLED);
            } else {
                android.util.Log.w(TAG, "Failed to update purchase from PAID->FULFILLED for receipt id " + str + ", Status already changed.");
            }
        } catch (java.lang.Throwable th) {
            android.util.Log.e(TAG, "Failed to grant consumable purchase, with error " + th.getMessage());
        }
    }

    private boolean verifyReceiptFromYourService(java.lang.String str, com.amazon.device.iap.model.UserData userData) {
        android.util.Log.d(TAG, "verifyReceiptFromYourService   receiptId " + str + "  userData == " + userData.toString());
        return true;
    }

    private boolean receiptAlreadyFulfilled(java.lang.String str, java.lang.String str2) {
        org.cocos2dx.bole.amazon.iap.SampleIapManager.PurchaseRecord purchaseRecord = this.dataSource.getPurchaseRecord(str, str2);
        return (purchaseRecord == null || org.cocos2dx.bole.amazon.iap.PurchaseDataSource.PurchaseStatus.FULFILLED == purchaseRecord.getStatus() || org.cocos2dx.bole.amazon.iap.PurchaseDataSource.PurchaseStatus.UNAVAILABLE == purchaseRecord.getStatus()) ? false : true;
    }

    private boolean updatePurchaseStatus(java.lang.String str, org.cocos2dx.bole.amazon.iap.PurchaseDataSource.PurchaseStatus purchaseStatus, org.cocos2dx.bole.amazon.iap.PurchaseDataSource.PurchaseStatus purchaseStatus2) {
        return this.dataSource.updatePurchaseStatus(str, purchaseStatus, purchaseStatus2);
    }

    private void createPurchase(java.lang.String str, java.lang.String str2) {
        this.dataSource.createPurchase(str, str2, org.cocos2dx.bole.amazon.iap.PurchaseDataSource.PurchaseStatus.PAID);
    }
}
