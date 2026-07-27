package com.android.billingclient.api;

import java.util.List;

/* compiled from: com.android.billingclient:billing@@8.3.0 */
/* loaded from: classes5.dex */
public interface PurchasesUpdatedListener {
    void onPurchasesUpdated(BillingResult billingResult, List<Purchase> list);
}
