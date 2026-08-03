package com.unity3d.services.store.gpbl.proxies;

/* compiled from: ProductDetailsResponseListenerProxy.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016J0\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0002\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\nH\u0002R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/unity3d/services/store/gpbl/proxies/ProductDetailsResponseListenerProxy;", "Lcom/unity3d/services/core/reflection/GenericListenerProxy;", "productDetailsResponseListener", "Lcom/unity3d/services/store/gpbl/listeners/ProductDetailsResponseListener;", "(Lcom/unity3d/services/store/gpbl/listeners/ProductDetailsResponseListener;)V", "getProductDetailsResponseListener", "()Lcom/unity3d/services/store/gpbl/listeners/ProductDetailsResponseListener;", "getProxyClass", "Ljava/lang/Class;", "invoke", "", "proxy", "method", "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "onPurchasesUpdated", "", "billingResult", "productDetailsResult", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProductDetailsResponseListenerProxy extends com.unity3d.services.core.reflection.GenericListenerProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.unity3d.services.store.gpbl.proxies.ProductDetailsResponseListenerProxy.Companion INSTANCE = new com.unity3d.services.store.gpbl.proxies.ProductDetailsResponseListenerProxy.Companion(null);
    public static final java.lang.String onProductDetailsResponseMethodName = "onProductDetailsResponse";
    private final com.unity3d.services.store.gpbl.listeners.ProductDetailsResponseListener productDetailsResponseListener;

    public ProductDetailsResponseListenerProxy(com.unity3d.services.store.gpbl.listeners.ProductDetailsResponseListener productDetailsResponseListener) {
        this.productDetailsResponseListener = productDetailsResponseListener;
    }

    public final com.unity3d.services.store.gpbl.listeners.ProductDetailsResponseListener getProductDetailsResponseListener() {
        return this.productDetailsResponseListener;
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy
    public java.lang.Class<?> getProxyClass() {
        return INSTANCE.getProxyListenerClass();
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy, java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object proxy, java.lang.reflect.Method method, java.lang.Object[] args) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proxy, "proxy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "method");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(method.getName(), onProductDetailsResponseMethodName)) {
            return super.invoke(proxy, method, args);
        }
        if (args != null && (obj = args[1]) != null) {
            onPurchasesUpdated(args[0], obj);
        }
        return null;
    }

    private final void onPurchasesUpdated(java.lang.Object billingResult, java.lang.Object productDetailsResult) {
        com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsResultsBridge queryProductDetailsResultsBridge = new com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsResultsBridge(productDetailsResult);
        com.unity3d.services.store.gpbl.listeners.ProductDetailsResponseListener productDetailsResponseListener = this.productDetailsResponseListener;
        if (productDetailsResponseListener != null) {
            productDetailsResponseListener.onProductDetailsResponse(new com.unity3d.services.store.gpbl.bridges.BillingResultBridge(billingResult), queryProductDetailsResultsBridge);
        }
    }

    /* compiled from: ProductDetailsResponseListenerProxy.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/unity3d/services/store/gpbl/proxies/ProductDetailsResponseListenerProxy$Companion;", "", "()V", "onProductDetailsResponseMethodName", "", "getProxyListenerClass", "Ljava/lang/Class;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final java.lang.Class<?> getProxyListenerClass() throws java.lang.ClassNotFoundException {
            java.lang.Class<?> cls = java.lang.Class.forName("com.android.billingclient.api.ProductDetailsResponseListener");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cls, "forName(\"com.android.bil…DetailsResponseListener\")");
            return cls;
        }
    }
}
