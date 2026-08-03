package com.unity3d.services.store.gpbl.bridges;

/* loaded from: classes6.dex */
public class PurchaseHistoryRecordBridge extends com.unity3d.services.store.gpbl.bridges.CommonJsonResponseBridge {
    public PurchaseHistoryRecordBridge(java.lang.Object obj) {
        super(obj);
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    protected java.lang.String getClassName() {
        return "com.android.billingclient.api.PurchaseHistoryRecord";
    }
}
