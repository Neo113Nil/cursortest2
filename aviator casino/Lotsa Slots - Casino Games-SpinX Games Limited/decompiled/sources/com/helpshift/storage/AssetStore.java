package com.helpshift.storage;

/* loaded from: classes5.dex */
public class AssetStore {
    private final com.helpshift.platform.Device device;
    private final java.util.Map<java.lang.String, java.lang.String> inMemStorage = new java.util.HashMap();

    public AssetStore(com.helpshift.platform.Device device) {
        this.device = device;
    }

    public java.lang.String getAssetContent(java.lang.String str) {
        boolean containsKey = this.inMemStorage.containsKey(str);
        java.lang.String readAssetContent = containsKey ? this.inMemStorage.get(str) : this.device.readAssetContent(str);
        if (!containsKey && com.helpshift.util.Utils.isNotEmpty(readAssetContent)) {
            this.inMemStorage.put(str, readAssetContent);
        }
        return readAssetContent;
    }
}
