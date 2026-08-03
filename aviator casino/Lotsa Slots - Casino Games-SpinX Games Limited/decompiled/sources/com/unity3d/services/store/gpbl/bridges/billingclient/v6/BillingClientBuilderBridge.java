package com.unity3d.services.store.gpbl.bridges.billingclient.v6;

/* compiled from: BillingClientBuilderBridge.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v6/BillingClientBuilderBridge;", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/common/BillingClientBuilderBridgeCommon;", "billingClientBuilderInternalInstance", "", "(Ljava/lang/Object;)V", "build", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/common/BillingClientBridgeCommon;", "enablePendingPurchases", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/IBillingClientBuilderBridge;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingClientBuilderBridge extends com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon {
    public static final java.lang.String ENABLE_PENDING_PURCHASES_METHOD = "enablePendingPurchases";

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge
    public com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge enablePendingPurchases() {
        this._billingClientBuilderInternalInstance = callNonVoidMethod("enablePendingPurchases", this._billingClientBuilderInternalInstance, new java.lang.Object[0]);
        return this;
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge
    public com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon build() throws java.lang.ClassNotFoundException {
        return new com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge(callNonVoidMethod("build", this._billingClientBuilderInternalInstance, new java.lang.Object[0]));
    }

    public BillingClientBuilderBridge(java.lang.Object obj) {
        super(obj, kotlin.collections.MapsKt.hashMapOf(kotlin.TuplesKt.to("enablePendingPurchases", new java.lang.Class[0])));
    }
}
