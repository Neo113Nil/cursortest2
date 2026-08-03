package com.ironsource.mediationsdk.adunit.adapter.utility;

/* loaded from: classes5.dex */
public class AdData {
    private final java.util.Map<java.lang.String, java.lang.Object> mAdUnitData;
    private final java.util.Map<java.lang.String, java.lang.Object> mConfiguration;
    private final java.lang.String mServerData;

    public AdData(java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map, java.util.Map<java.lang.String, java.lang.Object> map2) {
        this.mServerData = str;
        this.mConfiguration = map;
        this.mAdUnitData = map2;
    }

    public static com.ironsource.mediationsdk.adunit.adapter.utility.AdData createAdDataForNetworkAdapter(org.json.JSONObject jSONObject, com.ironsource.mediationsdk.IronSource.a aVar, java.lang.String str) {
        return createAdDataForNetworkAdapter(jSONObject, aVar, str, null);
    }

    public java.util.Map<java.lang.String, java.lang.Object> getAdUnitData() {
        return this.mAdUnitData;
    }

    public java.lang.Boolean getBoolean(java.lang.String str) {
        return (java.lang.Boolean) this.mConfiguration.get(str);
    }

    public java.util.Map<java.lang.String, java.lang.Object> getConfiguration() {
        return this.mConfiguration;
    }

    public java.lang.Integer getInt(java.lang.String str) {
        return (java.lang.Integer) this.mConfiguration.get(str);
    }

    public java.lang.String getServerData() {
        return this.mServerData;
    }

    public java.lang.String getString(java.lang.String str) {
        return (java.lang.String) this.mConfiguration.get(str);
    }

    public static com.ironsource.mediationsdk.adunit.adapter.utility.AdData createAdDataForNetworkAdapter(org.json.JSONObject jSONObject, com.ironsource.mediationsdk.IronSource.a aVar, java.lang.String str, com.ironsource.mediationsdk.o oVar) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("adUnit", aVar);
        if (str != null) {
            hashMap.put("userId", str);
        }
        if (oVar != null) {
            hashMap.put("bannerSize", oVar.getSize());
        }
        return new com.ironsource.mediationsdk.adunit.adapter.utility.AdData(null, com.ironsource.C3079ha.a(jSONObject), hashMap);
    }
}
