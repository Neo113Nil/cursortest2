package com.amazon.device.iap.internal.a;

/* compiled from: SandboxRequestHandler.java */
/* loaded from: classes2.dex */
public final class c implements com.amazon.device.iap.internal.c {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f3462a = "c";

    @Override // com.amazon.device.iap.internal.c
    public void a(com.amazon.device.iap.model.RequestId requestId) {
        com.amazon.device.iap.internal.util.e.a(f3462a, "sendGetUserDataRequest");
        a(requestId.toString(), false, false);
    }

    private void a(java.lang.String str, boolean z, boolean z2) {
        try {
            android.content.Context b = com.amazon.device.iap.internal.d.d().b();
            android.os.Bundle bundle = new android.os.Bundle();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("requestId", str);
            jSONObject.put("packageName", b.getPackageName());
            jSONObject.put("sdkVersion", com.amazon.device.iap.PurchasingService.SDK_VERSION);
            jSONObject.put("isPurchaseUpdates", z);
            jSONObject.put("reset", z2);
            bundle.putString("userInput", jSONObject.toString());
            android.content.Intent a2 = a("com.amazon.testclient.iap.appUserId");
            a2.addFlags(268435456);
            a2.putExtras(bundle);
            b.startService(a2);
        } catch (org.json.JSONException unused) {
            com.amazon.device.iap.internal.util.e.b(f3462a, "Error in sendGetUserDataRequest.");
        }
    }

    @Override // com.amazon.device.iap.internal.c
    public void a(com.amazon.device.iap.model.RequestId requestId, java.lang.String str) {
        com.amazon.device.iap.internal.util.e.a(f3462a, "sendPurchaseRequest");
        try {
            android.content.Context b = com.amazon.device.iap.internal.d.d().b();
            android.os.Bundle bundle = new android.os.Bundle();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper.COLUMN_SKU, str);
            jSONObject.put("requestId", requestId.toString());
            jSONObject.put("packageName", b.getPackageName());
            jSONObject.put("sdkVersion", com.amazon.device.iap.PurchasingService.SDK_VERSION);
            bundle.putString("purchaseInput", jSONObject.toString());
            android.content.Intent a2 = a("com.amazon.testclient.iap.purchase");
            a2.addFlags(268435456);
            a2.putExtras(bundle);
            b.startService(a2);
        } catch (org.json.JSONException unused) {
            com.amazon.device.iap.internal.util.e.b(f3462a, "Error in sendPurchaseRequest.");
        }
    }

    @Override // com.amazon.device.iap.internal.c
    public void a(com.amazon.device.iap.model.RequestId requestId, java.util.Set<java.lang.String> set) {
        com.amazon.device.iap.internal.util.e.a(f3462a, "sendItemDataRequest");
        try {
            android.content.Context b = com.amazon.device.iap.internal.d.d().b();
            android.os.Bundle bundle = new android.os.Bundle();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONArray jSONArray = new org.json.JSONArray((java.util.Collection) set);
            jSONObject.put("requestId", requestId.toString());
            jSONObject.put("packageName", b.getPackageName());
            jSONObject.put("skus", jSONArray);
            jSONObject.put("sdkVersion", com.amazon.device.iap.PurchasingService.SDK_VERSION);
            bundle.putString("itemDataInput", jSONObject.toString());
            android.content.Intent a2 = a("com.amazon.testclient.iap.itemData");
            a2.addFlags(268435456);
            a2.putExtras(bundle);
            b.startService(a2);
        } catch (org.json.JSONException unused) {
            com.amazon.device.iap.internal.util.e.b(f3462a, "Error in sendItemDataRequest.");
        }
    }

    @Override // com.amazon.device.iap.internal.c
    public void a(com.amazon.device.iap.model.RequestId requestId, boolean z) {
        if (requestId == null) {
            requestId = new com.amazon.device.iap.model.RequestId();
        }
        com.amazon.device.iap.internal.util.e.a(f3462a, "sendPurchaseUpdatesRequest/sendGetUserData first:" + requestId);
        a(requestId.toString(), true, z);
    }

    @Override // com.amazon.device.iap.internal.c
    public void a(com.amazon.device.iap.model.RequestId requestId, java.lang.String str, com.amazon.device.iap.model.FulfillmentResult fulfillmentResult) {
        com.amazon.device.iap.internal.util.e.a(f3462a, "sendNotifyPurchaseFulfilled");
        try {
            android.content.Context b = com.amazon.device.iap.internal.d.d().b();
            android.os.Bundle bundle = new android.os.Bundle();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("requestId", requestId.toString());
            jSONObject.put("packageName", b.getPackageName());
            jSONObject.put("receiptId", str);
            jSONObject.put("fulfillmentResult", fulfillmentResult);
            jSONObject.put("sdkVersion", com.amazon.device.iap.PurchasingService.SDK_VERSION);
            bundle.putString("purchaseFulfilledInput", jSONObject.toString());
            android.content.Intent a2 = a("com.amazon.testclient.iap.purchaseFulfilled");
            a2.addFlags(268435456);
            a2.putExtras(bundle);
            b.startService(a2);
        } catch (org.json.JSONException unused) {
            com.amazon.device.iap.internal.util.e.b(f3462a, "Error in sendNotifyPurchaseFulfilled.");
        }
    }

    @Override // com.amazon.device.iap.internal.c
    public void a(android.content.Context context, android.content.Intent intent) {
        com.amazon.device.iap.internal.util.e.a(f3462a, "handleResponse");
        intent.setComponent(new android.content.ComponentName("com.amazon.sdktestclient", "com.amazon.sdktestclient.command.CommandBroker"));
        try {
            java.lang.String string = intent.getExtras().getString("responseType");
            if (string.equalsIgnoreCase("com.amazon.testclient.iap.purchase")) {
                g(intent);
            } else if (string.equalsIgnoreCase("com.amazon.testclient.iap.appUserId")) {
                e(intent);
            } else if (string.equalsIgnoreCase("com.amazon.testclient.iap.itemData")) {
                c(intent);
            } else if (string.equalsIgnoreCase("com.amazon.testclient.iap.purchaseUpdates")) {
                a(intent);
            }
        } catch (java.lang.Exception e) {
            android.util.Log.e(f3462a, "Error handling response.", e);
        }
    }

    private android.content.Intent a(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent(str);
        intent.setComponent(new android.content.ComponentName("com.amazon.sdktestclient", "com.amazon.sdktestclient.command.CommandBroker"));
        return intent;
    }

    protected void a(final java.lang.Object obj) {
        com.amazon.device.iap.internal.util.d.a(obj, com.ironsource.Ve.n);
        android.content.Context b = com.amazon.device.iap.internal.d.d().b();
        final com.amazon.device.iap.PurchasingListener a2 = com.amazon.device.iap.internal.d.d().a();
        if (b == null || a2 == null) {
            com.amazon.device.iap.internal.util.e.a(f3462a, "PurchasingListener is not set. Dropping response: " + obj);
            return;
        }
        new android.os.Handler(b.getMainLooper()).post(new java.lang.Runnable() { // from class: com.amazon.device.iap.internal.a.c.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    java.lang.Object obj2 = obj;
                    if (obj2 instanceof com.amazon.device.iap.model.ProductDataResponse) {
                        a2.onProductDataResponse((com.amazon.device.iap.model.ProductDataResponse) obj2);
                    } else if (obj2 instanceof com.amazon.device.iap.model.UserDataResponse) {
                        a2.onUserDataResponse((com.amazon.device.iap.model.UserDataResponse) obj2);
                    } else if (obj2 instanceof com.amazon.device.iap.model.PurchaseUpdatesResponse) {
                        a2.onPurchaseUpdatesResponse((com.amazon.device.iap.model.PurchaseUpdatesResponse) obj2);
                    } else if (!(obj2 instanceof com.amazon.device.iap.model.PurchaseResponse)) {
                        com.amazon.device.iap.internal.util.e.b(com.amazon.device.iap.internal.a.c.f3462a, "Unknown response type:" + obj.getClass().getName());
                    } else {
                        a2.onPurchaseResponse((com.amazon.device.iap.model.PurchaseResponse) obj2);
                    }
                } catch (java.lang.Exception e) {
                    com.amazon.device.iap.internal.util.e.b(com.amazon.device.iap.internal.a.c.f3462a, "Error in sendResponse: " + e);
                }
            }
        });
    }

    private void a(android.content.Intent intent) throws org.json.JSONException {
        com.amazon.device.iap.model.PurchaseUpdatesResponse b = b(intent);
        if (b.getRequestStatus() == com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL) {
            java.lang.String optString = new org.json.JSONObject(intent.getStringExtra("purchaseUpdatesOutput")).optString("offset");
            android.util.Log.i(f3462a, "Offset for PurchaseUpdatesResponse:" + optString);
            com.amazon.device.iap.internal.util.b.a(b.getUserData().getUserId(), optString);
        }
        a(b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    private com.amazon.device.iap.model.PurchaseUpdatesResponse b(android.content.Intent intent) {
        com.amazon.device.iap.model.UserData userData;
        java.util.ArrayList arrayList;
        java.lang.Exception e;
        com.amazon.device.iap.model.RequestId requestId;
        boolean z;
        boolean z2;
        org.json.JSONObject jSONObject;
        com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus requestStatus = com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.FAILED;
        java.util.ArrayList arrayList2 = null;
        int i = 0;
        try {
            jSONObject = new org.json.JSONObject(intent.getStringExtra("purchaseUpdatesOutput"));
            requestId = com.amazon.device.iap.model.RequestId.fromString(jSONObject.optString("requestId"));
            try {
                requestStatus = com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.valueOf(jSONObject.optString("status"));
                z2 = jSONObject.optBoolean("isMore");
                try {
                    userData = new com.amazon.device.iap.internal.model.UserDataBuilder().setUserId(jSONObject.optString("userId")).setMarketplace(jSONObject.optString("marketplace")).build();
                } catch (java.lang.Exception e2) {
                    e = e2;
                    userData = null;
                    arrayList = null;
                }
            } catch (java.lang.Exception e3) {
                userData = null;
                arrayList = null;
                e = e3;
            }
            try {
                z = z2;
            } catch (java.lang.Exception e4) {
                e = e4;
                arrayList = null;
                e = e;
                i = z2 ? 1 : 0;
                android.util.Log.e(f3462a, "Error parsing purchase updates output", e);
                z2 = i;
                arrayList2 = arrayList;
                z = z2;
                return new com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).setReceipts(arrayList2).setHasMore(z).build();
            }
        } catch (java.lang.Exception e5) {
            userData = null;
            arrayList = null;
            e = e5;
            requestId = null;
        }
        if (requestStatus == com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL) {
            arrayList = new java.util.ArrayList();
            try {
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("receipts");
                if (optJSONArray != null) {
                    while (i < optJSONArray.length()) {
                        org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        try {
                            arrayList.add(a(optJSONObject));
                        } catch (java.lang.Exception unused) {
                            android.util.Log.e(f3462a, "Failed to parse receipt from json:" + optJSONObject);
                        }
                        i++;
                    }
                }
            } catch (java.lang.Exception e6) {
                e = e6;
                i = z2 ? 1 : 0;
                android.util.Log.e(f3462a, "Error parsing purchase updates output", e);
                z2 = i;
                arrayList2 = arrayList;
                z = z2;
                return new com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).setReceipts(arrayList2).setHasMore(z).build();
            }
            arrayList2 = arrayList;
            z = z2;
        }
        return new com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).setReceipts(arrayList2).setHasMore(z).build();
    }

    private void c(android.content.Intent intent) {
        a(d(intent));
    }

    private com.amazon.device.iap.model.ProductDataResponse d(android.content.Intent intent) {
        java.util.LinkedHashSet linkedHashSet;
        java.util.HashMap hashMap;
        java.lang.Exception e;
        com.amazon.device.iap.model.RequestId requestId;
        org.json.JSONObject jSONObject;
        com.amazon.device.iap.model.ProductDataResponse.RequestStatus requestStatus = com.amazon.device.iap.model.ProductDataResponse.RequestStatus.FAILED;
        java.util.LinkedHashSet linkedHashSet2 = null;
        try {
            jSONObject = new org.json.JSONObject(intent.getStringExtra("itemDataOutput"));
            requestId = com.amazon.device.iap.model.RequestId.fromString(jSONObject.optString("requestId"));
            try {
                requestStatus = com.amazon.device.iap.model.ProductDataResponse.RequestStatus.valueOf(jSONObject.optString("status"));
            } catch (java.lang.Exception e2) {
                e = e2;
                linkedHashSet = null;
                hashMap = null;
            }
        } catch (java.lang.Exception e3) {
            linkedHashSet = null;
            hashMap = null;
            e = e3;
            requestId = null;
        }
        if (requestStatus != com.amazon.device.iap.model.ProductDataResponse.RequestStatus.FAILED) {
            linkedHashSet = new java.util.LinkedHashSet();
            try {
                hashMap = new java.util.HashMap();
                try {
                    org.json.JSONArray optJSONArray = jSONObject.optJSONArray("unavailableSkus");
                    if (optJSONArray != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            linkedHashSet.add(optJSONArray.getString(i));
                        }
                    }
                    org.json.JSONObject optJSONObject = jSONObject.optJSONObject(com.google.firebase.analytics.FirebaseAnalytics.Param.ITEMS);
                    if (optJSONObject != null) {
                        java.util.Iterator<java.lang.String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            java.lang.String next = keys.next();
                            hashMap.put(next, a(next, optJSONObject.optJSONObject(next)));
                        }
                    }
                } catch (java.lang.Exception e4) {
                    e = e4;
                    android.util.Log.e(f3462a, "Error parsing item data output", e);
                    linkedHashSet2 = linkedHashSet;
                    return new com.amazon.device.iap.internal.model.ProductDataResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setProductData(hashMap).setUnavailableSkus(linkedHashSet2).build();
                }
            } catch (java.lang.Exception e5) {
                e = e5;
                hashMap = null;
                e = e;
                android.util.Log.e(f3462a, "Error parsing item data output", e);
                linkedHashSet2 = linkedHashSet;
                return new com.amazon.device.iap.internal.model.ProductDataResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setProductData(hashMap).setUnavailableSkus(linkedHashSet2).build();
            }
            linkedHashSet2 = linkedHashSet;
            return new com.amazon.device.iap.internal.model.ProductDataResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setProductData(hashMap).setUnavailableSkus(linkedHashSet2).build();
        }
        hashMap = null;
        return new com.amazon.device.iap.internal.model.ProductDataResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setProductData(hashMap).setUnavailableSkus(linkedHashSet2).build();
    }

    private com.amazon.device.iap.model.Product a(java.lang.String str, org.json.JSONObject jSONObject) throws org.json.JSONException {
        com.amazon.device.iap.model.ProductType valueOf = com.amazon.device.iap.model.ProductType.valueOf(jSONObject.optString("itemType"));
        org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("priceJson");
        java.util.Currency currency = java.util.Currency.getInstance(jSONObject2.optString("currency"));
        java.lang.String str2 = currency.getSymbol() + new java.math.BigDecimal(jSONObject2.optString("value"));
        return new com.amazon.device.iap.internal.model.ProductBuilder().setSku(str).setProductType(valueOf).setDescription(jSONObject.optString("description")).setPrice(str2).setSmallIconUrl(jSONObject.optString("smallIconUrl")).setTitle(jSONObject.optString("title")).build();
    }

    private void e(android.content.Intent intent) {
        org.json.JSONObject jSONObject;
        com.amazon.device.iap.model.UserDataResponse f = f(intent);
        com.amazon.device.iap.model.RequestId requestId = f.getRequestId();
        java.lang.String stringExtra = intent.getStringExtra("userInput");
        try {
            jSONObject = new org.json.JSONObject(stringExtra);
        } catch (org.json.JSONException e) {
            android.util.Log.e(f3462a, "Unable to parse request data: " + stringExtra, e);
            jSONObject = null;
        }
        if (requestId == null || jSONObject == null) {
            a(f);
            return;
        }
        if (!jSONObject.optBoolean("isPurchaseUpdates", false)) {
            a(f);
            return;
        }
        if (f.getUserData() == null || com.amazon.device.iap.internal.util.d.a(f.getUserData().getUserId())) {
            android.util.Log.e(f3462a, "No Userid found in userDataResponse" + f);
            a(new com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder().setRequestId(requestId).setRequestStatus(com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.FAILED).setUserData(f.getUserData()).setReceipts(new java.util.ArrayList()).setHasMore(false).build());
            return;
        }
        android.util.Log.i(f3462a, "sendGetPurchaseUpdates with user id" + f.getUserData().getUserId());
        a(requestId.toString(), f.getUserData().getUserId(), jSONObject.optBoolean("reset", true));
    }

    private void a(java.lang.String str, java.lang.String str2, boolean z) {
        try {
            android.content.Context b = com.amazon.device.iap.internal.d.d().b();
            java.lang.String a2 = com.amazon.device.iap.internal.util.b.a(str2);
            android.util.Log.i(f3462a, "send PurchaseUpdates with user id:" + str2 + ";reset flag:" + z + ", local cursor:" + a2 + ", parsed from old requestId:" + str);
            android.os.Bundle bundle = new android.os.Bundle();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("requestId", str.toString());
            if (z) {
                a2 = null;
            }
            jSONObject.put("offset", a2);
            jSONObject.put("sdkVersion", com.amazon.device.iap.PurchasingService.SDK_VERSION);
            jSONObject.put("packageName", b.getPackageName());
            bundle.putString("purchaseUpdatesInput", jSONObject.toString());
            android.content.Intent a3 = a("com.amazon.testclient.iap.purchaseUpdates");
            a3.addFlags(268435456);
            a3.putExtras(bundle);
            b.startService(a3);
        } catch (org.json.JSONException unused) {
            com.amazon.device.iap.internal.util.e.b(f3462a, "Error in sendPurchaseUpdatesRequest.");
        }
    }

    private com.amazon.device.iap.model.UserDataResponse f(android.content.Intent intent) {
        com.amazon.device.iap.model.RequestId requestId;
        org.json.JSONObject jSONObject;
        com.amazon.device.iap.model.UserDataResponse.RequestStatus requestStatus = com.amazon.device.iap.model.UserDataResponse.RequestStatus.FAILED;
        com.amazon.device.iap.model.UserData userData = null;
        try {
            jSONObject = new org.json.JSONObject(intent.getStringExtra("userOutput"));
            requestId = com.amazon.device.iap.model.RequestId.fromString(jSONObject.optString("requestId"));
        } catch (java.lang.Exception e) {
            e = e;
            requestId = null;
        }
        try {
            requestStatus = com.amazon.device.iap.model.UserDataResponse.RequestStatus.valueOf(jSONObject.optString("status"));
            if (requestStatus == com.amazon.device.iap.model.UserDataResponse.RequestStatus.SUCCESSFUL) {
                userData = new com.amazon.device.iap.internal.model.UserDataBuilder().setUserId(jSONObject.optString("userId")).setMarketplace(jSONObject.optString("marketplace")).build();
            }
        } catch (java.lang.Exception e2) {
            e = e2;
            android.util.Log.e(f3462a, "Error parsing userid output", e);
            return new com.amazon.device.iap.internal.model.UserDataResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).build();
        }
        return new com.amazon.device.iap.internal.model.UserDataResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).build();
    }

    private void g(android.content.Intent intent) {
        a(h(intent));
    }

    private com.amazon.device.iap.model.PurchaseResponse h(android.content.Intent intent) {
        com.amazon.device.iap.model.RequestId requestId;
        com.amazon.device.iap.model.UserData userData;
        com.amazon.device.iap.model.PurchaseResponse.RequestStatus requestStatus = com.amazon.device.iap.model.PurchaseResponse.RequestStatus.FAILED;
        com.amazon.device.iap.model.Receipt receipt = null;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(intent.getStringExtra("purchaseOutput"));
            requestId = com.amazon.device.iap.model.RequestId.fromString(jSONObject.optString("requestId"));
            try {
                userData = new com.amazon.device.iap.internal.model.UserDataBuilder().setUserId(jSONObject.optString("userId")).setMarketplace(jSONObject.optString("marketplace")).build();
            } catch (java.lang.Exception e) {
                e = e;
                userData = null;
            }
            try {
                requestStatus = com.amazon.device.iap.model.PurchaseResponse.RequestStatus.safeValueOf(jSONObject.optString("purchaseStatus"));
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("receipt");
                if (optJSONObject != null) {
                    receipt = a(optJSONObject);
                }
            } catch (java.lang.Exception e2) {
                e = e2;
                android.util.Log.e(f3462a, "Error parsing purchase output", e);
                return new com.amazon.device.iap.internal.model.PurchaseResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).setReceipt(receipt).build();
            }
        } catch (java.lang.Exception e3) {
            e = e3;
            requestId = null;
            userData = null;
        }
        return new com.amazon.device.iap.internal.model.PurchaseResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).setReceipt(receipt).build();
    }

    private com.amazon.device.iap.model.Receipt a(org.json.JSONObject jSONObject) throws java.text.ParseException {
        java.lang.String optString = jSONObject.optString("receiptId");
        java.lang.String optString2 = jSONObject.optString(org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper.COLUMN_SKU);
        com.amazon.device.iap.model.ProductType valueOf = com.amazon.device.iap.model.ProductType.valueOf(jSONObject.optString("itemType"));
        java.util.Date parse = com.amazon.device.iap.internal.a.b.f3461a.parse(jSONObject.optString("purchaseDate"));
        java.lang.String optString3 = jSONObject.optString("cancelDate");
        return new com.amazon.device.iap.internal.model.ReceiptBuilder().setReceiptId(optString).setSku(optString2).setProductType(valueOf).setPurchaseDate(parse).setCancelDate((optString3 == null || optString3.length() == 0) ? null : com.amazon.device.iap.internal.a.b.f3461a.parse(optString3)).build();
    }
}
