package com.adjust.sdk;

/* loaded from: classes7.dex */
public class AdjustStoreInfo {
    private static final com.adjust.sdk.ILogger logger = com.adjust.sdk.AdjustFactory.getLogger();
    java.lang.String storeAppId;
    java.lang.String storeName;

    public AdjustStoreInfo(java.lang.String str) {
        if (isValidStore(str)) {
            this.storeName = str;
        }
    }

    private boolean isValidStore(java.lang.String str) {
        if (str == null) {
            logger.error("Missing store name", new java.lang.Object[0]);
            return false;
        }
        if (!str.isEmpty()) {
            return true;
        }
        logger.error("Store name can't be empty", new java.lang.Object[0]);
        return false;
    }

    public void setStoreAppId(java.lang.String str) {
        this.storeAppId = str;
    }
}
