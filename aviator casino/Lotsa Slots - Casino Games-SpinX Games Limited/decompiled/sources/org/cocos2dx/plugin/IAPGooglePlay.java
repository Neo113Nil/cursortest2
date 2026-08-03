package org.cocos2dx.plugin;

/* loaded from: classes6.dex */
public class IAPGooglePlay implements org.cocos2dx.plugin.InterfaceIAP, org.cocos2dx.plugin.PluginListener, com.android.billingclient.api.PurchasesUpdatedListener, com.android.billingclient.api.BillingClientStateListener {
    static final java.lang.String TAG = "IAPGooglePlay";
    static boolean bDebug = true;
    static com.android.billingclient.api.ProductDetails curSku = null;
    static boolean initialized = false;
    static org.cocos2dx.plugin.InterfaceIAP mAdapter;
    static android.content.Context mContext;
    private com.android.billingclient.api.BillingClient billingClient;
    private java.util.Hashtable<java.lang.String, com.android.billingclient.api.ProductDetails> cacheSkuDetails;
    private java.util.Vector<java.lang.String> consumedTokens;
    boolean isConnecting;
    private java.util.Vector<com.android.billingclient.api.Purchase> purchases;

    interface SkuDetailsCallback {
        void onSkuDetailsResponse(com.android.billingclient.api.ProductDetails productDetails);
    }

    @Override // org.cocos2dx.plugin.InterfaceIAP
    public void configDeveloperInfo(java.util.Hashtable<java.lang.String, java.lang.String> hashtable) {
    }

    @Override // org.cocos2dx.plugin.PluginListener
    public void onPause() {
    }

    protected static void LogE(java.lang.String str, java.lang.Exception exc) {
        android.util.Log.e(TAG, str, exc);
        exc.printStackTrace();
    }

    protected static void LogD(java.lang.String str) {
        if (bDebug) {
            android.util.Log.d(TAG, str);
        }
    }

    private android.content.Context getContext() {
        return mContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public android.app.Activity getActivity() {
        return (android.app.Activity) mContext;
    }

    public IAPGooglePlay(android.content.Context context) {
        this.isConnecting = false;
        mAdapter = this;
        mContext = context;
        this.purchases = new java.util.Vector<>();
        this.consumedTokens = new java.util.Vector<>();
        this.cacheSkuDetails = new java.util.Hashtable<>();
        org.cocos2dx.plugin.PluginWrapper.addListener(this);
        if (initialized) {
            return;
        }
        com.android.billingclient.api.BillingClient build = com.android.billingclient.api.BillingClient.newBuilder(mContext).setListener(this).enablePendingPurchases().build();
        this.billingClient = build;
        if (!build.isReady()) {
            LogD("BillingClient: Start connection...");
            this.isConnecting = true;
            this.billingClient.startConnection(this);
        }
        initialized = true;
    }

    public void showInAppMessages(java.lang.String str) {
        android.util.Log.d(TAG, "onInAppMessageResponseBillingResult: " + this.billingClient.showInAppMessages(getActivity(), com.android.billingclient.api.InAppMessageParams.newBuilder().addInAppMessageCategoryToShow(java.lang.Integer.parseInt(str)).build(), new com.android.billingclient.api.InAppMessageResponseListener() { // from class: org.cocos2dx.plugin.IAPGooglePlay.1
            @Override // com.android.billingclient.api.InAppMessageResponseListener
            public void onInAppMessageResponse(com.android.billingclient.api.InAppMessageResult inAppMessageResult) {
                android.util.Log.d(org.cocos2dx.plugin.IAPGooglePlay.TAG, "onInAppMessageResponse: " + inAppMessageResult.getResponseCode());
                org.cocos2dx.plugin.IAPWrapper.onPayResult(org.cocos2dx.plugin.IAPGooglePlay.mAdapter, 200, inAppMessageResult.getResponseCode() + ":" + inAppMessageResult.getPurchaseToken());
            }
        }));
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingSetupFinished(com.android.billingclient.api.BillingResult billingResult) {
        this.isConnecting = false;
        int responseCode = billingResult.getResponseCode();
        LogD("onBillingSetupFinished: " + responseCode + io.ktor.sse.ServerSentEventKt.SPACE + billingResult.getDebugMessage());
        if (responseCode == 0) {
            queryPurchases();
            succeedConnected("Billing connection setup");
        } else {
            failedConnected("Billing Client Setup Failed.");
        }
    }

    public void queryPurchases() {
        org.cocos2dx.plugin.PluginWrapper.runOnMainThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.IAPGooglePlay.2
            @Override // java.lang.Runnable
            public void run() {
                if (org.cocos2dx.plugin.IAPGooglePlay.this.isBillingConnectReady()) {
                    org.cocos2dx.plugin.IAPGooglePlay.LogD("queryPurchases: SUBS");
                    org.cocos2dx.plugin.IAPGooglePlay.this.billingClient.queryPurchasesAsync(com.android.billingclient.api.QueryPurchasesParams.newBuilder().setProductType("inapp").build(), new com.android.billingclient.api.PurchasesResponseListener() { // from class: org.cocos2dx.plugin.IAPGooglePlay.2.1
                        @Override // com.android.billingclient.api.PurchasesResponseListener
                        public void onQueryPurchasesResponse(com.android.billingclient.api.BillingResult billingResult, java.util.List<com.android.billingclient.api.Purchase> list) {
                            java.util.Iterator<com.android.billingclient.api.Purchase> it = list.iterator();
                            while (it.hasNext()) {
                                org.cocos2dx.plugin.IAPGooglePlay.this.succeedPurchase(it.next());
                            }
                        }
                    });
                    org.cocos2dx.plugin.IAPGooglePlay.this.billingClient.queryPurchasesAsync(com.android.billingclient.api.QueryPurchasesParams.newBuilder().setProductType("subs").build(), new com.android.billingclient.api.PurchasesResponseListener() { // from class: org.cocos2dx.plugin.IAPGooglePlay.2.2
                        @Override // com.android.billingclient.api.PurchasesResponseListener
                        public void onQueryPurchasesResponse(com.android.billingclient.api.BillingResult billingResult, java.util.List<com.android.billingclient.api.Purchase> list) {
                            java.util.Iterator<com.android.billingclient.api.Purchase> it = list.iterator();
                            while (it.hasNext()) {
                                org.cocos2dx.plugin.IAPGooglePlay.this.succeedPurchase(it.next());
                            }
                        }
                    });
                }
            }
        });
    }

    public boolean isBillingConnectReady() {
        try {
            if (this.billingClient.isReady()) {
                return true;
            }
            if (!this.isConnecting) {
                if (this.billingClient == null) {
                    this.billingClient = com.android.billingclient.api.BillingClient.newBuilder(mContext).setListener(this).enablePendingPurchases().build();
                }
                LogD("BillingClient: Start connection...");
                this.isConnecting = true;
                this.billingClient.startConnection(this);
            }
            return false;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public int onGetSkuDetailsInMainThread(com.android.billingclient.api.BillingResult billingResult, java.util.List<com.android.billingclient.api.ProductDetails> list) {
        if (billingResult == null) {
            LogD("onSkuDetailsResponse: null BillingResult");
            return -1;
        }
        int responseCode = billingResult.getResponseCode();
        java.lang.String debugMessage = billingResult.getDebugMessage();
        if (responseCode == 0) {
            LogD("onSkuDetailsResponse: " + responseCode + io.ktor.sse.ServerSentEventKt.SPACE + debugMessage);
            for (com.android.billingclient.api.ProductDetails productDetails : list) {
                java.lang.String productId = productDetails.getProductId();
                this.cacheSkuDetails.put(productId, productDetails);
                LogD("insert skudetails:" + productId + "  " + productDetails.toString());
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.lang.String str : this.cacheSkuDetails.keySet()) {
                try {
                    jSONObject.put(str, this.cacheSkuDetails.get(str).toString());
                } catch (org.json.JSONException e) {
                    e.printStackTrace();
                }
            }
            succeedSkuDetails(jSONObject.toString());
        } else {
            LogD("onSkuDetailsResponse: " + responseCode + io.ktor.sse.ServerSentEventKt.SPACE + debugMessage);
            failedSkuDetails(responseCode + io.ktor.sse.ServerSentEventKt.SPACE + debugMessage);
        }
        return responseCode;
    }

    public void getSKUDetails(org.json.JSONObject jSONObject, final java.lang.String str) {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        LogD("getSkuDetails begin" + str);
        try {
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.lang.String string = jSONObject.getString(next);
                LogD("getSkuDetails item: " + next + "  " + string);
                arrayList.add(string);
            }
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
        org.cocos2dx.plugin.PluginWrapper.runOnMainThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.IAPGooglePlay.3
            @Override // java.lang.Runnable
            public void run() {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.String str2 : arrayList) {
                    if (!org.cocos2dx.plugin.IAPGooglePlay.this.cacheSkuDetails.containsKey(str2)) {
                        org.cocos2dx.plugin.IAPGooglePlay.LogD("try to query sku :" + str2);
                        arrayList2.add(str2);
                    }
                }
                if (arrayList2.size() > 0) {
                    org.cocos2dx.plugin.IAPGooglePlay.this.querySkuDetails(arrayList2, str);
                }
            }
        });
    }

    public void getSKUDetailsInApp(org.json.JSONObject jSONObject) {
        getSKUDetails(jSONObject, "inapp");
    }

    public void getSKUDetailsSub(org.json.JSONObject jSONObject) {
        getSKUDetails(jSONObject, "subs");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void payWithSkuDetails(java.util.Hashtable<java.lang.String, java.lang.String> hashtable, final com.android.billingclient.api.ProductDetails productDetails) {
        hashtable.get("IAPId");
        hashtable.get("IAPType");
        final java.lang.String str = hashtable.get("IAPAccountId");
        final java.lang.String str2 = hashtable.get("IAPProfileId");
        final android.app.Activity activity = getActivity();
        org.cocos2dx.plugin.PluginWrapper.runOnMainThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.IAPGooglePlay.4
            @Override // java.lang.Runnable
            public void run() {
                java.util.List<com.android.billingclient.api.ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails;
                try {
                    if (org.cocos2dx.plugin.IAPGooglePlay.this.isBillingConnectReady()) {
                        org.cocos2dx.plugin.IAPGooglePlay.curSku = productDetails;
                        org.cocos2dx.plugin.IAPGooglePlay.LogD("Check SkuDetails to make purchase:" + org.cocos2dx.plugin.IAPGooglePlay.curSku.toString());
                        com.android.billingclient.api.BillingFlowParams.ProductDetailsParams.Builder productDetails2 = com.android.billingclient.api.BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productDetails);
                        if (productDetails.getProductType().endsWith("subs") && (subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails()) != null && subscriptionOfferDetails.size() > 0) {
                            productDetails2.setOfferToken(subscriptionOfferDetails.get(0).getOfferToken());
                        }
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(productDetails2.build());
                        com.android.billingclient.api.BillingResult launchBillingFlow = org.cocos2dx.plugin.IAPGooglePlay.this.billingClient.launchBillingFlow(activity, com.android.billingclient.api.BillingFlowParams.newBuilder().setProductDetailsParamsList(arrayList).setObfuscatedAccountId(str).setObfuscatedProfileId(str2).build());
                        if (launchBillingFlow.getResponseCode() != 0) {
                            org.cocos2dx.plugin.IAPGooglePlay.failPurchase("Can't launch purchase flow right now : " + launchBillingFlow.getResponseCode());
                            return;
                        }
                        return;
                    }
                    org.cocos2dx.plugin.IAPGooglePlay.failPurchase("Billing connection is lost. Please retry in a few seconds.");
                } catch (java.lang.Exception e) {
                    org.cocos2dx.plugin.IAPGooglePlay.LogE("Can't launch purchase", e);
                    org.cocos2dx.plugin.IAPGooglePlay.failPurchase("Can't launch purchase flow right now because of exception. ");
                }
            }
        });
    }

    @Override // org.cocos2dx.plugin.InterfaceIAP
    public void payForProduct(final java.util.Hashtable<java.lang.String, java.lang.String> hashtable) {
        LogD("payForProduct invoked " + hashtable.toString());
        if (!networkReachable()) {
            failPurchase("Network Unreachable");
            return;
        }
        final java.lang.String str = hashtable.get("IAPId");
        final java.lang.String str2 = hashtable.get("IAPType");
        org.cocos2dx.plugin.PluginWrapper.runOnMainThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.IAPGooglePlay.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (org.cocos2dx.plugin.IAPGooglePlay.this.isBillingConnectReady()) {
                        if (org.cocos2dx.plugin.IAPGooglePlay.this.cacheSkuDetails.containsKey(str)) {
                            com.android.billingclient.api.ProductDetails productDetails = (com.android.billingclient.api.ProductDetails) org.cocos2dx.plugin.IAPGooglePlay.this.cacheSkuDetails.get(str);
                            org.cocos2dx.plugin.IAPGooglePlay.LogD("Get SkuDetails to make purchase:" + productDetails.toString());
                            org.cocos2dx.plugin.IAPGooglePlay.this.payWithSkuDetails(hashtable, productDetails);
                        } else {
                            org.cocos2dx.plugin.IAPGooglePlay.LogD("No SkuDetails found:" + str);
                            org.cocos2dx.plugin.IAPGooglePlay.this.querySkuDetails(str, str2, new org.cocos2dx.plugin.IAPGooglePlay.SkuDetailsCallback() { // from class: org.cocos2dx.plugin.IAPGooglePlay.5.1
                                @Override // org.cocos2dx.plugin.IAPGooglePlay.SkuDetailsCallback
                                public void onSkuDetailsResponse(com.android.billingclient.api.ProductDetails productDetails2) {
                                    if (productDetails2 == null) {
                                        org.cocos2dx.plugin.IAPGooglePlay.LogD("Could not find SkuDetails to make purchase.");
                                        org.cocos2dx.plugin.IAPGooglePlay.this.payForOldGPStore(hashtable);
                                    } else {
                                        org.cocos2dx.plugin.IAPGooglePlay.LogD("Check SkuDetails to make purchase:" + productDetails2.toString());
                                        org.cocos2dx.plugin.IAPGooglePlay.this.payWithSkuDetails(hashtable, productDetails2);
                                    }
                                }
                            });
                        }
                    } else {
                        org.cocos2dx.plugin.IAPGooglePlay.failPurchase("Billing connection is lost. Please retry in a few seconds.");
                    }
                } catch (java.lang.Exception e) {
                    org.cocos2dx.plugin.IAPGooglePlay.LogE("Can't launch purchase", e);
                    org.cocos2dx.plugin.IAPGooglePlay.failPurchase("Can't launch purchase flow right now. Please retry in a few seconds.");
                }
            }
        });
    }

    public void payForOldGPStore(java.util.Hashtable<java.lang.String, java.lang.String> hashtable) {
        java.lang.String str = hashtable.get("IAPId");
        java.lang.String str2 = hashtable.get("IAPType");
        final java.lang.String str3 = hashtable.get("IAPAccountId");
        final java.lang.String str4 = hashtable.get("IAPProfileId");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        com.android.billingclient.api.SkuDetailsParams build = com.android.billingclient.api.SkuDetailsParams.newBuilder().setType(str2).setSkusList(arrayList).build();
        LogD("querySkuDetailsAsync");
        this.billingClient.querySkuDetailsAsync(build, new com.android.billingclient.api.SkuDetailsResponseListener() { // from class: org.cocos2dx.plugin.IAPGooglePlay.6
            @Override // com.android.billingclient.api.SkuDetailsResponseListener
            public void onSkuDetailsResponse(com.android.billingclient.api.BillingResult billingResult, java.util.List<com.android.billingclient.api.SkuDetails> list) {
                if (billingResult.getResponseCode() != 0 || list == null || list.isEmpty()) {
                    org.cocos2dx.plugin.IAPGooglePlay.failPurchase("Could not find SkuDetails to make purchase.");
                    return;
                }
                com.android.billingclient.api.BillingResult launchBillingFlow = org.cocos2dx.plugin.IAPGooglePlay.this.billingClient.launchBillingFlow(org.cocos2dx.plugin.IAPGooglePlay.this.getActivity(), com.android.billingclient.api.BillingFlowParams.newBuilder().setSkuDetails(list.get(0)).setObfuscatedAccountId(str3).setObfuscatedProfileId(str4).build());
                if (launchBillingFlow.getResponseCode() != 0) {
                    org.cocos2dx.plugin.IAPGooglePlay.failPurchase("Can't launch purchase flow right now : " + launchBillingFlow.getResponseCode());
                }
            }
        });
    }

    public void querySkuDetails(final java.lang.String str, java.lang.String str2, final org.cocos2dx.plugin.IAPGooglePlay.SkuDetailsCallback skuDetailsCallback) {
        LogD("querySkuDetails");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(com.android.billingclient.api.QueryProductDetailsParams.Product.newBuilder().setProductId(str).setProductType(str2).build());
        this.billingClient.queryProductDetailsAsync(com.android.billingclient.api.QueryProductDetailsParams.newBuilder().setProductList(arrayList).build(), new com.android.billingclient.api.ProductDetailsResponseListener() { // from class: org.cocos2dx.plugin.IAPGooglePlay.7
            @Override // com.android.billingclient.api.ProductDetailsResponseListener
            public void onProductDetailsResponse(final com.android.billingclient.api.BillingResult billingResult, final java.util.List<com.android.billingclient.api.ProductDetails> list) {
                org.cocos2dx.plugin.PluginWrapper.runOnMainThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.IAPGooglePlay.7.1
                    @Override // java.lang.Runnable
                    public void run() {
                        int onGetSkuDetailsInMainThread = org.cocos2dx.plugin.IAPGooglePlay.this.onGetSkuDetailsInMainThread(billingResult, list);
                        if (skuDetailsCallback != null) {
                            if (onGetSkuDetailsInMainThread == 0) {
                                if (org.cocos2dx.plugin.IAPGooglePlay.this.cacheSkuDetails.containsKey(str)) {
                                    com.android.billingclient.api.ProductDetails productDetails = (com.android.billingclient.api.ProductDetails) org.cocos2dx.plugin.IAPGooglePlay.this.cacheSkuDetails.get(str);
                                    org.cocos2dx.plugin.IAPGooglePlay.LogD("Get SkuDetails to make purchase:" + productDetails.toString());
                                    skuDetailsCallback.onSkuDetailsResponse(productDetails);
                                    return;
                                }
                                skuDetailsCallback.onSkuDetailsResponse(null);
                                return;
                            }
                            skuDetailsCallback.onSkuDetailsResponse(null);
                        }
                    }
                });
            }
        });
    }

    public void querySkuDetails(java.util.List<java.lang.String> list, java.lang.String str) {
        LogD("querySkuDetails");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(com.android.billingclient.api.QueryProductDetailsParams.Product.newBuilder().setProductId(it.next()).setProductType(str).build());
        }
        this.billingClient.queryProductDetailsAsync(com.android.billingclient.api.QueryProductDetailsParams.newBuilder().setProductList(arrayList).build(), new com.android.billingclient.api.ProductDetailsResponseListener() { // from class: org.cocos2dx.plugin.IAPGooglePlay.8
            @Override // com.android.billingclient.api.ProductDetailsResponseListener
            public void onProductDetailsResponse(final com.android.billingclient.api.BillingResult billingResult, final java.util.List<com.android.billingclient.api.ProductDetails> list2) {
                org.cocos2dx.plugin.PluginWrapper.runOnMainThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.IAPGooglePlay.8.1
                    @Override // java.lang.Runnable
                    public void run() {
                        org.cocos2dx.plugin.IAPGooglePlay.this.onGetSkuDetailsInMainThread(billingResult, list2);
                    }
                });
            }
        });
    }

    public void forceConsume(java.lang.String str, java.lang.String str2) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("Param1", str);
            jSONObject.put("Param2", str2);
            consume(jSONObject);
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // org.cocos2dx.plugin.InterfaceIAP
    public void setDebugMode(boolean z) {
        bDebug = z;
    }

    @Override // org.cocos2dx.plugin.InterfaceIAP
    public java.lang.String getSDKVersion() {
        return "20160902";
    }

    private boolean networkReachable() {
        boolean z = false;
        try {
            android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) mContext.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    z = true;
                }
            }
        } catch (java.lang.Exception e) {
            LogE("Fail to check network status", e);
        }
        LogD("NetWork reachable : " + z);
        return z;
    }

    @Override // org.cocos2dx.plugin.InterfaceIAP
    public java.lang.String getPluginVersion() {
        return "0.5";
    }

    public com.android.billingclient.api.Purchase getPurchase(java.lang.String str, java.lang.String str2) {
        java.util.Vector<com.android.billingclient.api.Purchase> vector = this.purchases;
        if (vector == null) {
            return null;
        }
        java.util.Iterator<com.android.billingclient.api.Purchase> it = vector.iterator();
        while (it.hasNext()) {
            com.android.billingclient.api.Purchase next = it.next();
            if (str.equals(next.getProducts().get(0)) && (str2.equals("inapp") || !next.isAcknowledged())) {
                return next;
            }
        }
        return null;
    }

    public boolean addPurchase(com.android.billingclient.api.Purchase purchase) {
        if (purchase == null || this.consumedTokens.contains(purchase.getPurchaseToken())) {
            return false;
        }
        java.util.Iterator<com.android.billingclient.api.Purchase> it = this.purchases.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.android.billingclient.api.Purchase next = it.next();
            if (purchase.getPurchaseToken().equals(next.getPurchaseToken())) {
                this.purchases.remove(next);
                break;
            }
        }
        this.purchases.add(purchase);
        return true;
    }

    public void consume(org.json.JSONObject jSONObject) {
        try {
            final java.lang.String string = jSONObject.getString("Param1");
            final java.lang.String string2 = jSONObject.getString("Param2");
            android.util.Log.d(TAG, "consume: " + string + io.ktor.sse.ServerSentEventKt.SPACE + string2);
            org.cocos2dx.plugin.PluginWrapper.runOnMainThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.IAPGooglePlay.9
                @Override // java.lang.Runnable
                public void run() {
                    final com.android.billingclient.api.Purchase purchase = org.cocos2dx.plugin.IAPGooglePlay.this.getPurchase(string, string2);
                    if (purchase != null) {
                        if (org.cocos2dx.plugin.IAPGooglePlay.this.isBillingConnectReady()) {
                            if (string2.equals("inapp")) {
                                org.cocos2dx.plugin.IAPGooglePlay.this.billingClient.consumeAsync(com.android.billingclient.api.ConsumeParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), new com.android.billingclient.api.ConsumeResponseListener() { // from class: org.cocos2dx.plugin.IAPGooglePlay.9.1
                                    @Override // com.android.billingclient.api.ConsumeResponseListener
                                    public void onConsumeResponse(com.android.billingclient.api.BillingResult billingResult, java.lang.String str) {
                                        int responseCode = billingResult.getResponseCode();
                                        java.lang.String debugMessage = billingResult.getDebugMessage();
                                        org.cocos2dx.plugin.IAPGooglePlay.LogD("onConsumeResponse: " + responseCode + io.ktor.sse.ServerSentEventKt.SPACE + debugMessage);
                                        if (responseCode == 0) {
                                            org.cocos2dx.plugin.IAPGooglePlay.this.consumedTokens.add(str);
                                            org.cocos2dx.plugin.IAPGooglePlay.this.purchases.remove(purchase);
                                            org.cocos2dx.plugin.IAPGooglePlay.succeedConsume(responseCode + io.ktor.sse.ServerSentEventKt.SPACE + debugMessage);
                                            return;
                                        }
                                        org.cocos2dx.plugin.IAPGooglePlay.failedConsume(responseCode + io.ktor.sse.ServerSentEventKt.SPACE + debugMessage);
                                    }
                                });
                                return;
                            } else {
                                if (purchase.isAcknowledged()) {
                                    return;
                                }
                                org.cocos2dx.plugin.IAPGooglePlay.this.billingClient.acknowledgePurchase(com.android.billingclient.api.AcknowledgePurchaseParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), new com.android.billingclient.api.AcknowledgePurchaseResponseListener() { // from class: org.cocos2dx.plugin.IAPGooglePlay.9.2
                                    @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
                                    public void onAcknowledgePurchaseResponse(com.android.billingclient.api.BillingResult billingResult) {
                                        int responseCode = billingResult.getResponseCode();
                                        java.lang.String debugMessage = billingResult.getDebugMessage();
                                        android.util.Log.d(org.cocos2dx.plugin.IAPGooglePlay.TAG, "acknowledgePurchase: " + responseCode + io.ktor.sse.ServerSentEventKt.SPACE + debugMessage);
                                        if (responseCode == 0) {
                                            org.cocos2dx.plugin.IAPGooglePlay.this.purchases.remove(purchase);
                                            org.cocos2dx.plugin.IAPGooglePlay.succeedConsume(responseCode + io.ktor.sse.ServerSentEventKt.SPACE + debugMessage);
                                            return;
                                        }
                                        org.cocos2dx.plugin.IAPGooglePlay.failedConsume(responseCode + io.ktor.sse.ServerSentEventKt.SPACE + debugMessage);
                                    }
                                });
                                return;
                            }
                        }
                        return;
                    }
                    org.cocos2dx.plugin.IAPGooglePlay.LogD("can't find purchase for sku:" + string);
                    org.cocos2dx.plugin.IAPGooglePlay.failedConsume("Can't find purchase for sku:" + string);
                }
            });
        } catch (org.json.JSONException e) {
            e.printStackTrace();
            failedConsume("Error while parsing json info");
        }
    }

    public void refreshPurchases() {
        LogD("TODO implement refreshPurchases");
    }

    public void succeedPurchase(com.android.billingclient.api.Purchase purchase) {
        try {
            LogD("PurchaseState:" + purchase.getSkus().get(0) + ' ' + purchase.getPurchaseState());
            if (purchase.getPurchaseState() == 1) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("data", purchase.getOriginalJson());
                jSONObject.put(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_SIGNATURE, purchase.getSignature());
                java.lang.String jSONObject2 = jSONObject.toString();
                if (addPurchase(purchase)) {
                    succeedPurchase(jSONObject2);
                }
            } else {
                failPurchase("Purchase State:" + purchase.getPurchaseState());
            }
        } catch (java.lang.Exception unused) {
        }
    }

    static void succeedPurchase(java.lang.String str) {
        org.cocos2dx.plugin.IAPWrapper.onPayResult(mAdapter, 0, str);
    }

    static void failPurchase(java.lang.String str) {
        org.cocos2dx.plugin.IAPWrapper.onPayResult(mAdapter, 1, str);
    }

    static void cancelPurchase(java.lang.String str) {
        org.cocos2dx.plugin.IAPWrapper.onPayResult(mAdapter, 2, str);
    }

    static void succeedSkuDetails(java.lang.String str) {
        org.cocos2dx.plugin.IAPWrapper.onPayResult(mAdapter, 104, str);
    }

    static void failedSkuDetails(java.lang.String str) {
        org.cocos2dx.plugin.IAPWrapper.onPayResult(mAdapter, 105, str);
    }

    static void succeedConsume(java.lang.String str) {
        org.cocos2dx.plugin.IAPWrapper.onPayResult(mAdapter, 102, str);
    }

    static void failedConsume(java.lang.String str) {
        org.cocos2dx.plugin.IAPWrapper.onPayResult(mAdapter, 103, str);
    }

    static void succeedConnected(java.lang.String str) {
        org.cocos2dx.plugin.IAPWrapper.onPayResult(mAdapter, 100, str);
    }

    static void failedConnected(java.lang.String str) {
        org.cocos2dx.plugin.IAPWrapper.onPayResult(mAdapter, 101, str);
    }

    void alert(java.lang.String str) {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getContext());
        builder.setMessage(str);
        builder.setNeutralButton("OK", (android.content.DialogInterface.OnClickListener) null);
        LogD("Showing alert dialog: " + str);
        builder.create().show();
    }

    @Override // org.cocos2dx.plugin.PluginListener
    public boolean onActivityResult(int i, int i2, android.content.Intent intent) {
        LogD("onActivityResult(" + i + ", " + i2 + ", data)");
        return false;
    }

    @Override // org.cocos2dx.plugin.PluginListener
    public void onResume() {
        queryPurchases();
    }

    @Override // org.cocos2dx.plugin.PluginListener
    public void onDestroy() {
        LogD("Destroying helper.");
        com.android.billingclient.api.BillingClient billingClient = this.billingClient;
        if (billingClient != null && billingClient.isReady()) {
            this.billingClient.endConnection();
            this.billingClient = null;
        }
        initialized = false;
        org.cocos2dx.plugin.PluginWrapper.removeListener(this);
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingServiceDisconnected() {
        this.isConnecting = false;
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(com.android.billingclient.api.BillingResult billingResult, java.util.List<com.android.billingclient.api.Purchase> list) {
        if (billingResult == null) {
            LogD("onPurchasesUpdated: null BillingResult");
            failPurchase("null BillingResult");
            return;
        }
        int responseCode = billingResult.getResponseCode();
        java.lang.String debugMessage = billingResult.getDebugMessage();
        LogD("onPurchasesUpdated: " + responseCode + io.ktor.sse.ServerSentEventKt.SPACE + debugMessage);
        if (responseCode == 0) {
            if (list == null) {
                LogD("onPurchasesUpdated: null purchase list");
                failPurchase("null purchase list");
                return;
            } else {
                java.util.Iterator<com.android.billingclient.api.Purchase> it = list.iterator();
                while (it.hasNext()) {
                    succeedPurchase(it.next());
                }
                return;
            }
        }
        if (responseCode == 1) {
            LogD("onPurchasesUpdated: User canceled the purchase");
            cancelPurchase("User canceled the purchase");
            return;
        }
        if (responseCode == 5) {
            LogD("onPurchasesUpdated: Developer error means that Google Play does not recognize the configuration. If you are just getting started, make sure you have configured the application correctly in the Google Play Console. The SKU product ID must match and the APK you are using must be signed with release keys.");
            failPurchase("Developer error");
            return;
        }
        if (responseCode == 7) {
            LogD("onPurchasesUpdated: The user already owns this item");
            com.android.billingclient.api.ProductDetails productDetails = curSku;
            if (productDetails != null) {
                forceConsume(productDetails.getProductId(), curSku.getProductType());
            }
            failPurchase("The user already owns this item");
            return;
        }
        failPurchase(responseCode + io.ktor.sse.ServerSentEventKt.SPACE + debugMessage);
    }
}
