package com.ironsource;

/* renamed from: com.ironsource.jc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3116jc {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, org.json.JSONObject> f6327a;

    /* JADX WARN: Multi-variable type inference failed */
    public C3116jc() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, org.json.JSONObject> a() {
        return this.f6327a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.ironsource.C3116jc) && kotlin.jvm.internal.Intrinsics.areEqual(this.f6327a, ((com.ironsource.C3116jc) obj).f6327a);
    }

    public int hashCode() {
        return this.f6327a.hashCode();
    }

    public java.lang.String toString() {
        return "NetworkDataStore(networkDataMap=" + this.f6327a + ")";
    }

    public C3116jc(java.util.concurrent.ConcurrentHashMap<java.lang.String, org.json.JSONObject> networkDataMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkDataMap, "networkDataMap");
        this.f6327a = networkDataMap;
    }

    public final com.ironsource.C3116jc a(java.util.concurrent.ConcurrentHashMap<java.lang.String, org.json.JSONObject> networkDataMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkDataMap, "networkDataMap");
        return new com.ironsource.C3116jc(networkDataMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.ironsource.C3116jc a(com.ironsource.C3116jc c3116jc, java.util.concurrent.ConcurrentHashMap concurrentHashMap, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            concurrentHashMap = c3116jc.f6327a;
        }
        return c3116jc.a((java.util.concurrent.ConcurrentHashMap<java.lang.String, org.json.JSONObject>) concurrentHashMap);
    }

    public /* synthetic */ C3116jc(java.util.concurrent.ConcurrentHashMap concurrentHashMap, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new java.util.concurrent.ConcurrentHashMap() : concurrentHashMap);
    }

    public final void a(com.ironsource.mediationsdk.t networkData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkData, "networkData");
        if (!this.f6327a.containsKey(networkData.a())) {
            this.f6327a.put(networkData.a(), networkData.allData());
            return;
        }
        try {
            java.util.concurrent.ConcurrentHashMap<java.lang.String, org.json.JSONObject> concurrentHashMap = this.f6327a;
            java.lang.String a2 = networkData.a();
            org.json.JSONObject jSONObject = this.f6327a.get(networkData.a());
            if (jSONObject == null) {
                jSONObject = new org.json.JSONObject();
            }
            org.json.JSONObject a3 = com.ironsource.mediationsdk.utils.IronSourceUtils.a(jSONObject, networkData.allData());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a3, "deepMergeJSONObjects(\n  …), networkData.allData())");
            concurrentHashMap.put(a2, a3);
        } catch (java.lang.Exception e) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("error while merging network data: " + e.getMessage());
        }
    }

    public final void a(com.ironsource.mediationsdk.AbstractAdapter adapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "adapter");
        java.util.Set<java.util.Map.Entry<java.lang.String, org.json.JSONObject>> entrySet = this.f6327a.entrySet();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(entrySet, "networkDataMap.entries");
        java.util.ArrayList<java.util.Map.Entry> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : entrySet) {
            if (com.ironsource.mediationsdk.c.a((java.lang.String) ((java.util.Map.Entry) obj).getKey(), adapter)) {
                arrayList.add(obj);
            }
        }
        for (java.util.Map.Entry entry : arrayList) {
            java.lang.Object key = entry.getKey();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "it.key");
            java.lang.Object value = entry.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "it.value");
            adapter.setNetworkData(new com.ironsource.mediationsdk.t((java.lang.String) key, (org.json.JSONObject) value));
        }
    }

    public final void a(com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper adapterBaseWrapper) {
        java.util.Set<java.util.Map.Entry<java.lang.String, org.json.JSONObject>> entrySet = this.f6327a.entrySet();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(entrySet, "networkDataMap.entries");
        java.util.ArrayList<java.util.Map.Entry> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : entrySet) {
            if (com.ironsource.mediationsdk.c.a((java.lang.String) ((java.util.Map.Entry) obj).getKey(), adapterBaseWrapper)) {
                arrayList.add(obj);
            }
        }
        for (java.util.Map.Entry entry : arrayList) {
            com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper != null ? adapterBaseWrapper.getAdapterBaseInterface() : null;
            kotlin.jvm.internal.Intrinsics.checkNotNull(adapterBaseInterface, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface");
            java.lang.Object key = entry.getKey();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "it.key");
            java.lang.Object value = entry.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "it.value");
            ((com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface) adapterBaseInterface).setNetworkData(new com.ironsource.mediationsdk.t((java.lang.String) key, (org.json.JSONObject) value));
        }
    }
}
