package com.unity3d.services.store.gpbl.proxies;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.services.core.reflection.GenericListenerProxy;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsResultsBridge;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsResponseListener;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProductDetailsResponseListenerProxy.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\f\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J0\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0002\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\u000bH\u0002R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/unity3d/services/store/gpbl/proxies/ProductDetailsResponseListenerProxy;", "Lcom/unity3d/services/core/reflection/GenericListenerProxy;", "productDetailsResponseListener", "Lcom/unity3d/services/store/gpbl/listeners/ProductDetailsResponseListener;", "<init>", "(Lcom/unity3d/services/store/gpbl/listeners/ProductDetailsResponseListener;)V", "getProductDetailsResponseListener", "()Lcom/unity3d/services/store/gpbl/listeners/ProductDetailsResponseListener;", "getProxyClass", "Ljava/lang/Class;", "invoke", "", "proxy", "method", "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "onPurchasesUpdated", "", "billingResult", "productDetailsResult", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductDetailsResponseListenerProxy extends GenericListenerProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String onProductDetailsResponseMethodName = "onProductDetailsResponse";
    private final ProductDetailsResponseListener productDetailsResponseListener;

    public ProductDetailsResponseListenerProxy(ProductDetailsResponseListener productDetailsResponseListener) {
        this.productDetailsResponseListener = productDetailsResponseListener;
    }

    public final ProductDetailsResponseListener getProductDetailsResponseListener() {
        return this.productDetailsResponseListener;
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy
    public Class<?> getProxyClass() {
        return INSTANCE.getProxyListenerClass();
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy, java.lang.reflect.InvocationHandler
    public Object invoke(Object proxy, Method method, Object[] args) {
        Object obj;
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(method, "method");
        if (!Intrinsics.areEqual(method.getName(), "onProductDetailsResponse")) {
            return super.invoke(proxy, method, args);
        }
        if (args != null && (obj = args[1]) != null) {
            onPurchasesUpdated(args[0], obj);
        }
        return null;
    }

    private final void onPurchasesUpdated(Object billingResult, Object productDetailsResult) {
        QueryProductDetailsResultsBridge queryProductDetailsResultsBridge = new QueryProductDetailsResultsBridge(productDetailsResult);
        ProductDetailsResponseListener productDetailsResponseListener = this.productDetailsResponseListener;
        if (productDetailsResponseListener != null) {
            productDetailsResponseListener.onProductDetailsResponse(new BillingResultBridge(billingResult), queryProductDetailsResultsBridge);
        }
    }

    /* compiled from: ProductDetailsResponseListenerProxy.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/unity3d/services/store/gpbl/proxies/ProductDetailsResponseListenerProxy$Companion;", "", "<init>", "()V", "onProductDetailsResponseMethodName", "", "getProxyListenerClass", "Ljava/lang/Class;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Class<?> getProxyListenerClass() throws ClassNotFoundException {
            Class<?> cls = Class.forName(InAppPurchaseConstants.CLASSNAME_PRODUCT_DETAILS_RESPONSE_LISTENER);
            Intrinsics.checkNotNullExpressionValue(cls, "forName(...)");
            return cls;
        }
    }
}
