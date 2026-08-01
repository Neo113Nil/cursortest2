package com.unity3d.services.store.gpbl.listeners;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import kotlin.Metadata;

/* compiled from: BillingClientStateListener.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/unity3d/services/store/gpbl/listeners/BillingClientStateListener;", "", InAppPurchaseConstants.METHOD_ON_BILLING_SETUP_FINISHED, "", "billingResult", "Lcom/unity3d/services/store/gpbl/bridges/BillingResultBridge;", InAppPurchaseConstants.METHOD_ON_BILLING_SERVICE_DISCONNECTED, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface BillingClientStateListener {
    void onBillingServiceDisconnected();

    void onBillingSetupFinished(BillingResultBridge billingResult);
}
