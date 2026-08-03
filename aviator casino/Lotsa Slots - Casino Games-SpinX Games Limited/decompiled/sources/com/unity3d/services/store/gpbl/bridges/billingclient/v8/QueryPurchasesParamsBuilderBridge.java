package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

/* compiled from: QueryPurchasesParamsBuilderBridge.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\u000bH\u0014J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u000f"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryPurchasesParamsBuilderBridge;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "builderInstance", "", "(Ljava/lang/Object;)V", "getBuilderInstance", "()Ljava/lang/Object;", "setBuilderInstance", com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryPurchasesParamsBuilderBridge.BUILD_METHOD, "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryProductDetailsParamsBridge;", "getClassName", "", com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryPurchasesParamsBuilderBridge.SET_PRODUCT_TYPE_METHOD, com.ironsource.X3.i.m, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class QueryPurchasesParamsBuilderBridge extends com.unity3d.services.core.reflection.GenericBridge {
    private static final java.lang.String BUILD_METHOD = "build";
    private static final java.lang.String SET_PRODUCT_TYPE_METHOD = "setProductType";
    private java.lang.Object builderInstance;

    public final java.lang.Object getBuilderInstance() {
        return this.builderInstance;
    }

    public final void setBuilderInstance(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.builderInstance = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryPurchasesParamsBuilderBridge(java.lang.Object builderInstance) {
        super(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(SET_PRODUCT_TYPE_METHOD, new java.lang.Class[]{java.lang.String.class}), kotlin.TuplesKt.to(BUILD_METHOD, new java.lang.Class[0])));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderInstance, "builderInstance");
        this.builderInstance = builderInstance;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    protected java.lang.String getClassName() {
        return "com.android.billingclient.api.QueryPurchasesParams$Builder";
    }

    public final com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsParamsBridge build() {
        return new com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsParamsBridge(callNonVoidMethod(BUILD_METHOD, this.builderInstance, new java.lang.Object[0]));
    }

    public final com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryPurchasesParamsBuilderBridge setProductType(java.lang.String productType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productType, "productType");
        java.lang.Object callNonVoidMethod = callNonVoidMethod(SET_PRODUCT_TYPE_METHOD, this.builderInstance, productType);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(callNonVoidMethod, "callNonVoidMethod(SET_PR…derInstance, productType)");
        this.builderInstance = callNonVoidMethod;
        return this;
    }
}
