package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

/* compiled from: ProductBuilderBridge.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u00020\bH\u0014J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/ProductBuilderBridge;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "builderInstance", "", "(Ljava/lang/Object;)V", com.unity3d.services.store.gpbl.bridges.billingclient.v8.ProductBuilderBridge.BUILD_METHOD, "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/ProductBridge;", "getClassName", "", com.unity3d.services.store.gpbl.bridges.billingclient.v8.ProductBuilderBridge.SET_PRODUCT_ID_METHOD, com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_PRODUCT_ID, com.unity3d.services.store.gpbl.bridges.billingclient.v8.ProductBuilderBridge.SET_PRODUCT_TYPE_METHOD, com.ironsource.X3.i.m, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProductBuilderBridge extends com.unity3d.services.core.reflection.GenericBridge {
    private static final java.lang.String BUILD_METHOD = "build";
    private static final java.lang.String SET_PRODUCT_ID_METHOD = "setProductId";
    private static final java.lang.String SET_PRODUCT_TYPE_METHOD = "setProductType";
    private java.lang.Object builderInstance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductBuilderBridge(java.lang.Object builderInstance) {
        super(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(SET_PRODUCT_ID_METHOD, new java.lang.Class[]{java.lang.String.class}), kotlin.TuplesKt.to(SET_PRODUCT_TYPE_METHOD, new java.lang.Class[]{java.lang.String.class}), kotlin.TuplesKt.to(BUILD_METHOD, new java.lang.Class[0])));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderInstance, "builderInstance");
        this.builderInstance = builderInstance;
    }

    public final com.unity3d.services.store.gpbl.bridges.billingclient.v8.ProductBridge build() {
        return new com.unity3d.services.store.gpbl.bridges.billingclient.v8.ProductBridge(callNonVoidMethod(BUILD_METHOD, this.builderInstance, new java.lang.Object[0]));
    }

    public final com.unity3d.services.store.gpbl.bridges.billingclient.v8.ProductBuilderBridge setProductType(java.lang.String productType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productType, "productType");
        java.lang.Object callNonVoidMethod = callNonVoidMethod(SET_PRODUCT_TYPE_METHOD, this.builderInstance, productType);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(callNonVoidMethod, "callNonVoidMethod(SET_PR…derInstance, productType)");
        this.builderInstance = callNonVoidMethod;
        return this;
    }

    public final com.unity3d.services.store.gpbl.bridges.billingclient.v8.ProductBuilderBridge setProductId(java.lang.String productId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productId, "productId");
        java.lang.Object callNonVoidMethod = callNonVoidMethod(SET_PRODUCT_ID_METHOD, this.builderInstance, productId);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(callNonVoidMethod, "callNonVoidMethod(SET_PR…ilderInstance, productId)");
        this.builderInstance = callNonVoidMethod;
        return this;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    protected java.lang.String getClassName() {
        return "com.android.billingclient.api.QueryProductDetailsParams$Product$Builder";
    }
}
