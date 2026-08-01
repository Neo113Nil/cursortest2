package com.unity3d.services.store.gpbl.bridges;

import com.facebook.appevents.iap.InAppPurchaseConstants;

/* loaded from: classes7.dex */
public class PurchaseHistoryRecordBridge extends CommonJsonResponseBridge {
    public PurchaseHistoryRecordBridge(Object obj) {
        super(obj);
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    protected String getClassName() {
        return InAppPurchaseConstants.CLASSNAME_PURCHASE_HISTORY_RECORD;
    }
}
