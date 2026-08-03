package com.ironsource.mediationsdk;

/* loaded from: classes5.dex */
public interface AdapterNetworkData {
    org.json.JSONObject allData();

    <T> T dataByKeyIgnoreCase(java.lang.String str, java.lang.Class<T> cls);

    org.json.JSONObject networkDataByAdUnit(com.ironsource.mediationsdk.IronSource.a aVar);
}
