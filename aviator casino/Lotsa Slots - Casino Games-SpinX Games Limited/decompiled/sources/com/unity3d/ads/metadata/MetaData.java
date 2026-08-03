package com.unity3d.ads.metadata;

/* loaded from: classes5.dex */
public class MetaData extends com.unity3d.services.core.misc.JsonStorage {
    private java.lang.String _category;
    protected android.content.Context _context;

    public MetaData(android.content.Context context) {
        this._context = context.getApplicationContext();
    }

    public com.unity3d.services.core.device.StorageManager.StorageType getStorageType() {
        return com.unity3d.services.core.device.StorageManager.StorageType.PUBLIC;
    }

    public void setCategory(java.lang.String str) {
        this._category = str;
    }

    public java.lang.String getCategory() {
        return this._category;
    }

    private synchronized boolean set(java.lang.String str, boolean z) {
        return set(str, java.lang.Boolean.valueOf(z));
    }

    private synchronized boolean set(java.lang.String str, int i) {
        return set(str, java.lang.Integer.valueOf(i));
    }

    private synchronized boolean set(java.lang.String str, long j) {
        return set(str, java.lang.Long.valueOf(j));
    }

    @Override // com.unity3d.services.core.misc.JsonStorage
    public synchronized boolean set(java.lang.String str, java.lang.Object obj) {
        boolean z;
        initData();
        if (super.set(getActualKey(str) + ".value", obj)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getActualKey(str));
            sb.append(".ts");
            z = super.set(sb.toString(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        return z;
    }

    protected synchronized boolean setRaw(java.lang.String str, java.lang.Object obj) {
        initData();
        return super.set(getActualKey(str), obj);
    }

    public void commit() {
        if (com.unity3d.services.core.device.StorageManager.init(this._context)) {
            com.unity3d.services.core.device.Storage storage = com.unity3d.services.core.device.StorageManager.getStorage(getStorageType());
            if (getData() == null || storage == null) {
                return;
            }
            java.util.Iterator<java.lang.String> keys = getData().keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.lang.Object obj = get(next);
                if (storage.get(next) != null && (storage.get(next) instanceof org.json.JSONObject) && (get(next) instanceof org.json.JSONObject)) {
                    try {
                        obj = com.unity3d.services.core.misc.Utilities.mergeJsonObjects((org.json.JSONObject) obj, (org.json.JSONObject) storage.get(next));
                    } catch (java.lang.Exception e) {
                        com.unity3d.services.core.log.DeviceLog.exception("Exception merging JSONs", e);
                    }
                }
                storage.set(next, obj);
            }
            storage.writeStorage();
            storage.sendEvent(com.unity3d.services.core.device.StorageEvent.SET, getData());
            return;
        }
        com.unity3d.services.core.log.DeviceLog.error("Unity Ads could not commit metadata due to storage error");
    }

    private java.lang.String getActualKey(java.lang.String str) {
        if (getCategory() == null) {
            return str;
        }
        return getCategory() + "." + str;
    }
}
