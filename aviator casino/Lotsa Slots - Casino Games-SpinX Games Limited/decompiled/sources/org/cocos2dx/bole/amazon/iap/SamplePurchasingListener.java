package org.cocos2dx.bole.amazon.iap;

/* loaded from: classes6.dex */
public class SamplePurchasingListener implements com.amazon.device.iap.PurchasingListener {
    private static final java.lang.String TAG = "bole";
    private final org.cocos2dx.bole.amazon.iap.SampleIapManager iapManager;

    public SamplePurchasingListener(org.cocos2dx.bole.amazon.iap.SampleIapManager sampleIapManager) {
        this.iapManager = sampleIapManager;
    }

    @Override // com.amazon.device.iap.PurchasingListener
    public void onUserDataResponse(com.amazon.device.iap.model.UserDataResponse userDataResponse) {
        int i = org.cocos2dx.bole.amazon.iap.SamplePurchasingListener.AnonymousClass1.$SwitchMap$com$amazon$device$iap$model$UserDataResponse$RequestStatus[userDataResponse.getRequestStatus().ordinal()];
        if (i == 1) {
            this.iapManager.setAmazonUserId(userDataResponse.getUserData().getUserId(), userDataResponse.getUserData().getMarketplace());
        } else if (i == 2 || i == 3) {
            this.iapManager.setAmazonUserId(null, null);
        }
    }

    @Override // com.amazon.device.iap.PurchasingListener
    public void onProductDataResponse(com.amazon.device.iap.model.ProductDataResponse productDataResponse) {
        int i = org.cocos2dx.bole.amazon.iap.SamplePurchasingListener.AnonymousClass1.$SwitchMap$com$amazon$device$iap$model$ProductDataResponse$RequestStatus[productDataResponse.getRequestStatus().ordinal()];
        if (i == 1) {
            productDataResponse.getUnavailableSkus();
            this.iapManager.enablePurchaseForSkus(productDataResponse.getProductData());
            this.iapManager.disablePurchaseForSkus(productDataResponse.getUnavailableSkus());
        } else if (i == 2 || i == 3) {
            this.iapManager.disableAllPurchases();
        }
    }

    @Override // com.amazon.device.iap.PurchasingListener
    public void onPurchaseUpdatesResponse(com.amazon.device.iap.model.PurchaseUpdatesResponse purchaseUpdatesResponse) {
        int i = org.cocos2dx.bole.amazon.iap.SamplePurchasingListener.AnonymousClass1.$SwitchMap$com$amazon$device$iap$model$PurchaseUpdatesResponse$RequestStatus[purchaseUpdatesResponse.getRequestStatus().ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                this.iapManager.disableAllPurchases();
                return;
            }
            return;
        }
        this.iapManager.setAmazonUserId(purchaseUpdatesResponse.getUserData().getUserId(), purchaseUpdatesResponse.getUserData().getMarketplace());
        java.util.Iterator<com.amazon.device.iap.model.Receipt> it = purchaseUpdatesResponse.getReceipts().iterator();
        while (it.hasNext()) {
            this.iapManager.handleReceipt(it.next(), purchaseUpdatesResponse.getUserData());
        }
        if (purchaseUpdatesResponse.hasMore()) {
            com.amazon.device.iap.PurchasingService.getPurchaseUpdates(false);
        }
        this.iapManager.refreshOranges();
    }

    @Override // com.amazon.device.iap.PurchasingListener
    public void onPurchaseResponse(com.amazon.device.iap.model.PurchaseResponse purchaseResponse) {
        purchaseResponse.getRequestId().toString();
        purchaseResponse.getUserData().getUserId();
        int i = org.cocos2dx.bole.amazon.iap.SamplePurchasingListener.AnonymousClass1.$SwitchMap$com$amazon$device$iap$model$PurchaseResponse$RequestStatus[purchaseResponse.getRequestStatus().ordinal()];
        if (i == 1) {
            com.amazon.device.iap.model.Receipt receipt = purchaseResponse.getReceipt();
            this.iapManager.setAmazonUserId(purchaseResponse.getUserData().getUserId(), purchaseResponse.getUserData().getMarketplace());
            this.iapManager.handleReceipt(receipt, purchaseResponse.getUserData());
        } else if (i == 3) {
            java.util.HashSet hashSet = new java.util.HashSet();
            hashSet.add(purchaseResponse.getReceipt().getSku());
            this.iapManager.disablePurchaseForSkus(hashSet);
        } else if (i == 4 || i == 5) {
            this.iapManager.purchaseFailed(purchaseResponse.getReceipt().getSku());
        }
    }

    /* renamed from: org.cocos2dx.bole.amazon.iap.SamplePurchasingListener$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$iap$model$ProductDataResponse$RequestStatus;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$iap$model$PurchaseResponse$RequestStatus;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$iap$model$PurchaseUpdatesResponse$RequestStatus;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$iap$model$UserDataResponse$RequestStatus;

        static {
            int[] iArr = new int[com.amazon.device.iap.model.PurchaseResponse.RequestStatus.values().length];
            $SwitchMap$com$amazon$device$iap$model$PurchaseResponse$RequestStatus = iArr;
            try {
                iArr[com.amazon.device.iap.model.PurchaseResponse.RequestStatus.SUCCESSFUL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$device$iap$model$PurchaseResponse$RequestStatus[com.amazon.device.iap.model.PurchaseResponse.RequestStatus.ALREADY_PURCHASED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$device$iap$model$PurchaseResponse$RequestStatus[com.amazon.device.iap.model.PurchaseResponse.RequestStatus.INVALID_SKU.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$device$iap$model$PurchaseResponse$RequestStatus[com.amazon.device.iap.model.PurchaseResponse.RequestStatus.FAILED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$device$iap$model$PurchaseResponse$RequestStatus[com.amazon.device.iap.model.PurchaseResponse.RequestStatus.NOT_SUPPORTED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.values().length];
            $SwitchMap$com$amazon$device$iap$model$PurchaseUpdatesResponse$RequestStatus = iArr2;
            try {
                iArr2[com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$amazon$device$iap$model$PurchaseUpdatesResponse$RequestStatus[com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.FAILED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$amazon$device$iap$model$PurchaseUpdatesResponse$RequestStatus[com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.NOT_SUPPORTED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[com.amazon.device.iap.model.ProductDataResponse.RequestStatus.values().length];
            $SwitchMap$com$amazon$device$iap$model$ProductDataResponse$RequestStatus = iArr3;
            try {
                iArr3[com.amazon.device.iap.model.ProductDataResponse.RequestStatus.SUCCESSFUL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$amazon$device$iap$model$ProductDataResponse$RequestStatus[com.amazon.device.iap.model.ProductDataResponse.RequestStatus.FAILED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$amazon$device$iap$model$ProductDataResponse$RequestStatus[com.amazon.device.iap.model.ProductDataResponse.RequestStatus.NOT_SUPPORTED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            int[] iArr4 = new int[com.amazon.device.iap.model.UserDataResponse.RequestStatus.values().length];
            $SwitchMap$com$amazon$device$iap$model$UserDataResponse$RequestStatus = iArr4;
            try {
                iArr4[com.amazon.device.iap.model.UserDataResponse.RequestStatus.SUCCESSFUL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$amazon$device$iap$model$UserDataResponse$RequestStatus[com.amazon.device.iap.model.UserDataResponse.RequestStatus.FAILED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$amazon$device$iap$model$UserDataResponse$RequestStatus[com.amazon.device.iap.model.UserDataResponse.RequestStatus.NOT_SUPPORTED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
        }
    }
}
