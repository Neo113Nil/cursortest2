package com.unity3d.services.core.device.reader;

/* loaded from: classes6.dex */
public class DeviceInfoReaderFilterProvider {
    private static final java.lang.String FILTER_EXCLUDE_KEY = "exclude";
    private static final java.lang.String UNIFIED_CONFIG_KEY = "unifiedconfig";
    private com.unity3d.services.core.misc.IJsonStorageReader _storage;

    public DeviceInfoReaderFilterProvider(com.unity3d.services.core.misc.IJsonStorageReader iJsonStorageReader) {
        this._storage = iJsonStorageReader;
    }

    public java.util.List<java.lang.String> getFilterList() {
        java.lang.Object opt;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.unity3d.services.core.misc.IJsonStorageReader iJsonStorageReader = this._storage;
        if (iJsonStorageReader == null || iJsonStorageReader.getData() == null || (opt = this._storage.getData().opt("unifiedconfig")) == null || !(opt instanceof org.json.JSONObject)) {
            return arrayList;
        }
        java.lang.Object opt2 = ((org.json.JSONObject) opt).opt(FILTER_EXCLUDE_KEY);
        return opt2 instanceof java.lang.String ? trimWhiteSpaces(java.util.Arrays.asList(((java.lang.String) opt2).split(","))) : arrayList;
    }

    private java.util.List<java.lang.String> trimWhiteSpaces(java.util.List<java.lang.String> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().trim());
        }
        return arrayList;
    }
}
