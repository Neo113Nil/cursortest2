package com.ironsource;

import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.jc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4481jc {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, JSONObject> f8269a;

    /* JADX WARN: Multi-variable type inference failed */
    public C4481jc() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final ConcurrentHashMap<String, JSONObject> a() {
        return this.f8269a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4481jc) && Intrinsics.areEqual(this.f8269a, ((C4481jc) obj).f8269a);
    }

    public int hashCode() {
        return this.f8269a.hashCode();
    }

    public String toString() {
        return "NetworkDataStore(networkDataMap=" + this.f8269a + ")";
    }

    public C4481jc(ConcurrentHashMap<String, JSONObject> networkDataMap) {
        Intrinsics.checkNotNullParameter(networkDataMap, "networkDataMap");
        this.f8269a = networkDataMap;
    }

    public final C4481jc a(ConcurrentHashMap<String, JSONObject> networkDataMap) {
        Intrinsics.checkNotNullParameter(networkDataMap, "networkDataMap");
        return new C4481jc(networkDataMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4481jc a(C4481jc c4481jc, ConcurrentHashMap concurrentHashMap, int i, Object obj) {
        if ((i & 1) != 0) {
            concurrentHashMap = c4481jc.f8269a;
        }
        return c4481jc.a((ConcurrentHashMap<String, JSONObject>) concurrentHashMap);
    }

    public /* synthetic */ C4481jc(ConcurrentHashMap concurrentHashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ConcurrentHashMap() : concurrentHashMap);
    }

    public final void a(com.ironsource.mediationsdk.t networkData) {
        Intrinsics.checkNotNullParameter(networkData, "networkData");
        if (!this.f8269a.containsKey(networkData.a())) {
            this.f8269a.put(networkData.a(), networkData.allData());
            return;
        }
        try {
            ConcurrentHashMap<String, JSONObject> concurrentHashMap = this.f8269a;
            String a2 = networkData.a();
            JSONObject jSONObject = this.f8269a.get(networkData.a());
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject a3 = IronSourceUtils.a(jSONObject, networkData.allData());
            Intrinsics.checkNotNullExpressionValue(a3, "deepMergeJSONObjects(\n  …), networkData.allData())");
            concurrentHashMap.put(a2, a3);
        } catch (Exception e) {
            IronLog.INTERNAL.error("error while merging network data: " + e.getMessage());
        }
    }

    public final void a(AbstractAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Set<Map.Entry<String, JSONObject>> entrySet = this.f8269a.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "networkDataMap.entries");
        ArrayList<Map.Entry> arrayList = new ArrayList();
        for (Object obj : entrySet) {
            if (com.ironsource.mediationsdk.c.a((String) ((Map.Entry) obj).getKey(), adapter)) {
                arrayList.add(obj);
            }
        }
        for (Map.Entry entry : arrayList) {
            Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "it.key");
            Object value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "it.value");
            adapter.setNetworkData(new com.ironsource.mediationsdk.t((String) key, (JSONObject) value));
        }
    }

    public final void a(AdapterBaseWrapper adapterBaseWrapper) {
        Set<Map.Entry<String, JSONObject>> entrySet = this.f8269a.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "networkDataMap.entries");
        ArrayList<Map.Entry> arrayList = new ArrayList();
        for (Object obj : entrySet) {
            if (com.ironsource.mediationsdk.c.a((String) ((Map.Entry) obj).getKey(), adapterBaseWrapper)) {
                arrayList.add(obj);
            }
        }
        for (Map.Entry entry : arrayList) {
            AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper != null ? adapterBaseWrapper.getAdapterBaseInterface() : null;
            Intrinsics.checkNotNull(adapterBaseInterface, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface");
            Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "it.key");
            Object value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "it.value");
            ((AdapterNetworkDataInterface) adapterBaseInterface).setNetworkData(new com.ironsource.mediationsdk.t((String) key, (JSONObject) value));
        }
    }
}
