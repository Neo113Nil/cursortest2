package com.unity3d.services.store.gpbl.bridges.billingclient.common;

/* loaded from: classes6.dex */
public abstract class BillingClientBuilderBridgeCommon extends com.unity3d.services.core.reflection.GenericBridge implements com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge {
    protected static final java.lang.String buildMethodName = "build";
    private static final java.lang.String setListenerMethodName = "setListener";
    protected java.lang.Object _billingClientBuilderInternalInstance;

    public BillingClientBuilderBridgeCommon(java.lang.Object obj, java.util.Map<java.lang.String, java.lang.Class<?>[]> map) throws java.lang.ClassNotFoundException {
        super(appendFunctionAnParameters(map));
        this._billingClientBuilderInternalInstance = obj;
    }

    private static java.util.Map<java.lang.String, java.lang.Class<?>[]> appendFunctionAnParameters(java.util.Map<java.lang.String, java.lang.Class<?>[]> map) throws java.lang.ClassNotFoundException {
        map.putAll(new java.util.HashMap<java.lang.String, java.lang.Class<?>[]>() { // from class: com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon.1
            {
                put(com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon.setListenerMethodName, new java.lang.Class[]{com.unity3d.services.store.gpbl.proxies.PurchaseUpdatedListenerProxy.getProxyListenerClass()});
                put(com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon.buildMethodName, new java.lang.Class[0]);
            }
        });
        return map;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    protected java.lang.String getClassName() {
        return "com.android.billingclient.api.BillingClient$Builder";
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge
    public com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge setListener(com.unity3d.services.store.gpbl.proxies.PurchaseUpdatedListenerProxy purchaseUpdatedListenerProxy) throws java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
        this._billingClientBuilderInternalInstance = callNonVoidMethod(setListenerMethodName, this._billingClientBuilderInternalInstance, purchaseUpdatedListenerProxy.getProxyInstance());
        return this;
    }
}
