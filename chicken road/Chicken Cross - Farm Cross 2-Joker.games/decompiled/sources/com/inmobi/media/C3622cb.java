package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.SignalsConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.cb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3622cb implements InterfaceC4195wl {
    @Override // com.inmobi.media.InterfaceC4195wl
    public final Object a(Context context, SignalsConfig.SynapseCollectorConfig synapseCollectorConfig, Continuation continuation) {
        return a(this, context, synapseCollectorConfig);
    }

    @Override // com.inmobi.media.InterfaceC4195wl
    public final void b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.inmobi.media.InterfaceC4195wl
    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.inmobi.media.InterfaceC4195wl
    public final String a() {
        return "i_apps";
    }

    @Override // com.inmobi.media.InterfaceC4195wl
    public final SignalsConfig.SynapseCollectorConfig a(SignalsConfig signalsConfig) {
        Intrinsics.checkNotNullParameter(signalsConfig, "signalsConfig");
        return signalsConfig.getInstalledAppConfig();
    }

    public static El a(C3622cb c3622cb, Context context, SignalsConfig.SynapseCollectorConfig synapseCollectorConfig) {
        String str;
        List list = null;
        SignalsConfig.InstalledAppConfig installedAppConfig = synapseCollectorConfig instanceof SignalsConfig.InstalledAppConfig ? (SignalsConfig.InstalledAppConfig) synapseCollectorConfig : null;
        if (installedAppConfig == null) {
            c3622cb.getClass();
            return new Cl("i_apps", (short) 2518, "Installed apps config type is invalid.", null, 8);
        }
        Map<String, List<SignalsConfig.AppWithWeight>> payloadData = installedAppConfig.getPayloadData();
        c3622cb.getClass();
        Map a2 = a(payloadData);
        if (a2.isEmpty()) {
            return new Cl("i_apps", (short) 2519, "Installed apps payload is empty or invalid.", null, 8);
        }
        int scanLimit = installedAppConfig.getScanLimit();
        if (scanLimit > 0) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = a2.values().iterator();
            loop0: while (true) {
                if (it.hasNext()) {
                    Iterator it2 = ((List) it.next()).iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.add(((SignalsConfig.AppWithWeight) it2.next()).getId());
                        if (linkedHashSet.size() > scanLimit) {
                            break loop0;
                        }
                    }
                } else {
                    list = CollectionsKt.toList(linkedHashSet);
                    break;
                }
            }
        }
        if (list == null) {
            short s = installedAppConfig.getScanLimit() <= 0 ? (short) 2520 : (short) 2521;
            if (installedAppConfig.getScanLimit() <= 0) {
                str = "Installed apps scan limit is invalid.";
            } else {
                str = "Installed apps payload exceeds scan limit.";
            }
            return new Cl("i_apps", s, str, null, 8);
        }
        LinkedHashMap a3 = c3622cb.a(context, list);
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(a2.size()));
        for (Map.Entry entry : a2.entrySet()) {
            Object key = entry.getKey();
            List<SignalsConfig.AppWithWeight> list2 = (List) entry.getValue();
            Iterator it3 = list2.iterator();
            int i = 0;
            while (it3.hasNext()) {
                i += RangesKt.coerceAtLeast(((SignalsConfig.AppWithWeight) it3.next()).getWt(), 1);
            }
            int i2 = 0;
            for (SignalsConfig.AppWithWeight appWithWeight : list2) {
                i2 += Intrinsics.areEqual(a3.get(appWithWeight.getId()), Boolean.TRUE) ? RangesKt.coerceAtLeast(appWithWeight.getWt(), 1) : 0;
            }
            double d = i2 / i;
            double d2 = 100;
            linkedHashMap.put(key, Double.valueOf(Math.rint(d * d2) / d2));
        }
        if (linkedHashMap.isEmpty()) {
            return new Dl("i_apps");
        }
        JSONObject jSONObject = new JSONObject(linkedHashMap);
        String str2 = "Installed apps signal ready (" + linkedHashMap.size() + " categories).";
        return new Bl("i_apps", new C4249yl(jSONObject));
    }

    @Override // com.inmobi.media.InterfaceC4195wl
    public final String a(SignalsConfig.SynapseCollectorConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        SignalsConfig.InstalledAppConfig installedAppConfig = config instanceof SignalsConfig.InstalledAppConfig ? (SignalsConfig.InstalledAppConfig) config : null;
        if (installedAppConfig == null) {
            return null;
        }
        Map payload = a(installedAppConfig.getPayloadData());
        if (payload.isEmpty()) {
            return null;
        }
        Intrinsics.checkNotNullParameter(payload, "payload");
        return String.valueOf(CollectionsKt.joinToString$default(CollectionsKt.sorted(payload.keySet()), "|", null, null, 0, null, null, 62, null).hashCode());
    }

    public static Map a(Map map) {
        SignalsConfig.AppWithWeight appWithWeight;
        if (map != null && !map.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                List<SignalsConfig.AppWithWeight> list = (List) entry.getValue();
                ArrayList arrayList = new ArrayList();
                for (SignalsConfig.AppWithWeight appWithWeight2 : list) {
                    String obj = StringsKt.trim((CharSequence) appWithWeight2.getId()).toString();
                    if (obj.length() == 0) {
                        appWithWeight = null;
                    } else {
                        SignalsConfig.AppWithWeight appWithWeight3 = new SignalsConfig.AppWithWeight();
                        appWithWeight3.setId(obj);
                        appWithWeight3.setWt(RangesKt.coerceAtLeast(appWithWeight2.getWt(), 1));
                        appWithWeight = appWithWeight3;
                    }
                    if (appWithWeight != null) {
                        arrayList.add(appWithWeight);
                    }
                }
                linkedHashMap.put(key, arrayList);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (!((Collection) entry2.getValue()).isEmpty()) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            return linkedHashMap2;
        }
        return MapsKt.emptyMap();
    }

    public final LinkedHashMap a(Context context, List list) {
        String str = "Checking " + list.size() + " distinct packages.";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            linkedHashMap.put(str2, Boolean.valueOf(C3593bb.a(context, str2)));
        }
        return linkedHashMap;
    }
}
