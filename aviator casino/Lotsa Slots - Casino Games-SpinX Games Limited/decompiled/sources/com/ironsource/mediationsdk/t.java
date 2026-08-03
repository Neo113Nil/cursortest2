package com.ironsource.mediationsdk;

/* loaded from: classes5.dex */
public final class t implements com.ironsource.mediationsdk.AdapterNetworkData {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6467a;
    private final org.json.JSONObject b;

    public t(java.lang.String networkName, org.json.JSONObject data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkName, "networkName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        this.f6467a = networkName;
        this.b = new org.json.JSONObject(data.toString());
    }

    private final void b(java.util.Collection<? extends com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper> collection) {
        java.util.List filterNotNull = kotlin.collections.CollectionsKt.filterNotNull(collection);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : filterNotNull) {
            if (com.ironsource.mediationsdk.c.a(this.f6467a, (com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper) it.next()).getAdapterBaseInterface());
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList2) {
            if (obj2 instanceof com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface) {
                arrayList3.add(obj2);
            }
        }
        java.util.Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            ((com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface) it2.next()).setNetworkData(this);
        }
    }

    public final java.lang.String a() {
        return this.f6467a;
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    public org.json.JSONObject allData() {
        return this.b;
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    public <T> T dataByKeyIgnoreCase(java.lang.String desiredKey, java.lang.Class<T> valueType) {
        T t;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(desiredKey, "desiredKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueType, "valueType");
        java.util.Iterator<java.lang.String> keys = allData().keys();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys, "allData()\n          .keys()");
        java.util.Iterator<T> it = kotlin.sequences.SequencesKt.asSequence(keys).iterator();
        while (true) {
            if (!it.hasNext()) {
                t = (T) null;
                break;
            }
            t = it.next();
            if (kotlin.text.StringsKt.equals((java.lang.String) t, desiredKey, true)) {
                break;
            }
        }
        java.lang.String str = t;
        if (str == null) {
            return null;
        }
        java.lang.Object opt = allData().opt(str);
        if (!valueType.isInstance(opt)) {
            opt = null;
        }
        if (opt != null) {
            return valueType.cast(opt);
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    public org.json.JSONObject networkDataByAdUnit(com.ironsource.mediationsdk.IronSource.a adUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        org.json.JSONObject optJSONObject = this.b.optJSONObject(adUnit.toString());
        return optJSONObject == null ? new org.json.JSONObject() : optJSONObject;
    }

    public java.lang.String toString() {
        return "NetworkData(networkName=" + this.f6467a + ", networkData=" + this.b + ")";
    }

    public final void a(java.util.Collection<? extends com.ironsource.mediationsdk.AbstractAdapter> adapters, java.util.Collection<? extends com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper> networkAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapters, "adapters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkAdapters, "networkAdapters");
        try {
            a(adapters);
            b(networkAdapters);
        } catch (java.lang.Exception e) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("error while setting network data: " + e.getMessage());
        }
    }

    private final void a(java.util.Collection<? extends com.ironsource.mediationsdk.AbstractAdapter> collection) {
        java.util.List filterNotNull = kotlin.collections.CollectionsKt.filterNotNull(collection);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : filterNotNull) {
            if (com.ironsource.mediationsdk.c.a(this.f6467a, (com.ironsource.mediationsdk.AbstractAdapter) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.ironsource.mediationsdk.AbstractAdapter) it.next()).setNetworkData(this);
        }
    }

    public final void b() {
        java.util.Iterator<java.lang.String> keys = this.b.keys();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys, "networkData.keys()");
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.asSequence(keys)), ",", null, null, 0, null, null, 62, null);
        com.ironsource.F9.i().a(new com.ironsource.C3360x5(com.ironsource.EnumC3378y5.SET_NETWORK_DATA, com.ironsource.mediationsdk.utils.IronSourceUtils.b(false).put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, this.f6467a + " - " + joinToString$default)));
    }
}
