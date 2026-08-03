package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

/* compiled from: QueryProductDetailsParamsBuilderBridge.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\u000bH\u0014J\u0014\u0010\f\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryProductDetailsParamsBuilderBridge;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "builderInstance", "", "(Ljava/lang/Object;)V", "getBuilderInstance", "()Ljava/lang/Object;", "setBuilderInstance", com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsParamsBuilderBridge.BUILD_METHOD, "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryProductDetailsParamsBridge;", "getClassName", "", com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsParamsBuilderBridge.SET_PRODUCT_LIST_METHOD, "productList", "", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/ProductBridge;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class QueryProductDetailsParamsBuilderBridge extends com.unity3d.services.core.reflection.GenericBridge {
    private static final java.lang.String BUILD_METHOD = "build";
    private static final java.lang.String SET_PRODUCT_LIST_METHOD = "setProductList";
    private java.lang.Object builderInstance;

    public final java.lang.Object getBuilderInstance() {
        return this.builderInstance;
    }

    public final void setBuilderInstance(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.builderInstance = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryProductDetailsParamsBuilderBridge(java.lang.Object builderInstance) {
        super(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(SET_PRODUCT_LIST_METHOD, new java.lang.Class[]{java.util.List.class}), kotlin.TuplesKt.to(BUILD_METHOD, new java.lang.Class[0])));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderInstance, "builderInstance");
        this.builderInstance = builderInstance;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    protected java.lang.String getClassName() {
        return "com.android.billingclient.api.QueryProductDetailsParams$Builder";
    }

    public final com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsParamsBridge build() {
        return new com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsParamsBridge(callNonVoidMethod(BUILD_METHOD, this.builderInstance, new java.lang.Object[0]));
    }

    public final com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsParamsBuilderBridge setProductList(java.util.List<com.unity3d.services.store.gpbl.bridges.billingclient.v8.ProductBridge> productList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productList, "productList");
        java.util.List<com.unity3d.services.store.gpbl.bridges.billingclient.v8.ProductBridge> list = productList;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.unity3d.services.store.gpbl.bridges.billingclient.v8.ProductBridge) it.next()).getProductInternalInstance());
        }
        java.lang.Object callNonVoidMethod = callNonVoidMethod(SET_PRODUCT_LIST_METHOD, this.builderInstance, arrayList);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(callNonVoidMethod, "callNonVoidMethod(SET_PR…nce, productListInternal)");
        this.builderInstance = callNonVoidMethod;
        return this;
    }
}
