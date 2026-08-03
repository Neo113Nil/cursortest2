package com.unity3d.services.store.gpbl.bridges.billingclient;

/* loaded from: classes6.dex */
public interface IBillingClientBuilderBridge {
    com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient build() throws java.lang.ClassNotFoundException;

    com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge enablePendingPurchases();

    com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge setListener(com.unity3d.services.store.gpbl.proxies.PurchaseUpdatedListenerProxy purchaseUpdatedListenerProxy) throws java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException;
}
