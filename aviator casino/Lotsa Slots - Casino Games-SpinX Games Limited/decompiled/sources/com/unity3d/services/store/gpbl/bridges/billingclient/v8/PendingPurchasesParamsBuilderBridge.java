package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

/* compiled from: PendingPurchasesParamsBuilderBridge.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0000J\b\u0010\b\u001a\u00020\tH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/PendingPurchasesParamsBuilderBridge;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "builderInstance", "", "(Ljava/lang/Object;)V", com.unity3d.services.store.gpbl.bridges.billingclient.v8.PendingPurchasesParamsBuilderBridge.BUILD_METHOD, "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/PendingPurchasesParamsBridge;", com.unity3d.services.store.gpbl.bridges.billingclient.v8.PendingPurchasesParamsBuilderBridge.ENABLE_ONE_TIME_PRODUCT_METHOD, "getClassName", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PendingPurchasesParamsBuilderBridge extends com.unity3d.services.core.reflection.GenericBridge {
    private static final java.lang.String BUILD_METHOD = "build";
    private static final java.lang.String ENABLE_ONE_TIME_PRODUCT_METHOD = "enableOneTimeProducts";
    private final java.lang.Object builderInstance;

    @Override // com.unity3d.services.core.reflection.GenericBridge
    protected java.lang.String getClassName() {
        return "com.android.billingclient.api.PendingPurchasesParams$Builder";
    }

    public final com.unity3d.services.store.gpbl.bridges.billingclient.v8.PendingPurchasesParamsBuilderBridge enableOneTimeProducts() {
        callVoidMethod(ENABLE_ONE_TIME_PRODUCT_METHOD, this.builderInstance, new java.lang.Object[0]);
        return this;
    }

    public final com.unity3d.services.store.gpbl.bridges.billingclient.v8.PendingPurchasesParamsBridge build() {
        return new com.unity3d.services.store.gpbl.bridges.billingclient.v8.PendingPurchasesParamsBridge(callNonVoidMethod(BUILD_METHOD, this.builderInstance, new java.lang.Object[0]));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingPurchasesParamsBuilderBridge(java.lang.Object builderInstance) {
        super(kotlin.collections.MapsKt.hashMapOf(kotlin.TuplesKt.to(ENABLE_ONE_TIME_PRODUCT_METHOD, new java.lang.Class[0]), kotlin.TuplesKt.to(BUILD_METHOD, new java.lang.Class[0])));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builderInstance, "builderInstance");
        this.builderInstance = builderInstance;
    }
}
