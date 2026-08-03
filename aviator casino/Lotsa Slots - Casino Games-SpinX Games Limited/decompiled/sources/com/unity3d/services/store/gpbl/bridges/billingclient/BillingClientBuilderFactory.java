package com.unity3d.services.store.gpbl.bridges.billingclient;

/* loaded from: classes6.dex */
public class BillingClientBuilderFactory {
    public static com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge getBillingClientBuilder(android.content.Context context) throws java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        return com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge.newBuilder(context);
    }
}
