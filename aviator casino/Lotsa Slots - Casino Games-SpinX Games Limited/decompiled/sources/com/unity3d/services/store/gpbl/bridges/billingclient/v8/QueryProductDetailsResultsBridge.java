package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

/* compiled from: QueryProductDetailsResultsBridge.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryProductDetailsResultsBridge;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "productDetailsResult", "", "(Ljava/lang/Object;)V", "getClassName", "", com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsResultsBridge.GET_PRODUCT_DETAILS_LIST_METHOD, "", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/ProductDetailsBridge;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class QueryProductDetailsResultsBridge extends com.unity3d.services.core.reflection.GenericBridge {
    private static final java.lang.String GET_PRODUCT_DETAILS_LIST_METHOD = "getProductDetailsList";
    private final java.lang.Object productDetailsResult;

    public final java.util.List<com.unity3d.services.store.gpbl.bridges.billingclient.v8.ProductDetailsBridge> getProductDetailsList() {
        java.util.List list = (java.util.List) callNonVoidMethod(GET_PRODUCT_DETAILS_LIST_METHOD, this.productDetailsResult, new java.lang.Object[0]);
        if (list != null) {
            java.util.List list2 = list;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.unity3d.services.store.gpbl.bridges.billingclient.v8.ProductDetailsBridge(it.next()));
            }
            return arrayList;
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    protected java.lang.String getClassName() {
        return "com.android.billingclient.api.QueryProductDetailsResult";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryProductDetailsResultsBridge(java.lang.Object productDetailsResult) {
        super(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(GET_PRODUCT_DETAILS_LIST_METHOD, new java.lang.Class[0])));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productDetailsResult, "productDetailsResult");
        this.productDetailsResult = productDetailsResult;
    }
}
