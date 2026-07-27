package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* compiled from: BillingClientBuilderBridge.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/BillingClientBuilderBridge;", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/common/BillingClientBuilderBridgeCommon;", "billingClientBuilderInternalInstance", "", "<init>", "(Ljava/lang/Object;)V", "enablePendingPurchases", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/IBillingClientBuilderBridge;", InAppPurchaseConstants.METHOD_BUILD, "Lcom/unity3d/services/store/gpbl/bridges/billingclient/common/BillingClientBridgeCommon;", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BillingClientBuilderBridge extends BillingClientBuilderBridgeCommon {
    public static final String ENABLE_PENDING_PURCHASES_METHOD = "enablePendingPurchases";

    public BillingClientBuilderBridge(Object obj) {
        super(obj, MapsKt.hashMapOf(TuplesKt.to("enablePendingPurchases", new Class[]{PendingPurchasesParamsBridge.INSTANCE.getClassForParams()})));
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge
    public IBillingClientBuilderBridge enablePendingPurchases() {
        this._billingClientBuilderInternalInstance = callNonVoidMethod("enablePendingPurchases", this._billingClientBuilderInternalInstance, PendingPurchasesParamsBridge.INSTANCE.newBuilder().enableOneTimeProducts().build().getPendingPurchasesParamsInternalInstance());
        return this;
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge
    public BillingClientBridgeCommon build() throws ClassNotFoundException {
        return new BillingClientBridge(callNonVoidMethod(InAppPurchaseConstants.METHOD_BUILD, this._billingClientBuilderInternalInstance, new Object[0]));
    }
}
