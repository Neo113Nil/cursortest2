package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class p3 extends s0 {
    private static final String[] e = {com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, "settings", "auto_init_adapters", "test_mode_idfas", "test_mode_auto_init_adapters", "ad_unit_signal_providers"};
    private static final String[] f = {com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, "settings", "signal_providers", "ad_unit_signal_providers"};

    public static String a(com.applovin.impl.sdk.l lVar) {
        return s0.a((String) lVar.a(v3.C7), "1.0/mediate", lVar);
    }

    public static String b(com.applovin.impl.sdk.l lVar) {
        return s0.a((String) lVar.a(v3.B7), "1.0/mediate", lVar);
    }

    public static void d(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (JsonUtils.valueExists(jSONObject, "ad_unit_signal_providers")) {
            u5.a(jSONObject, lVar);
        }
    }

    public static void e(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject.length() == 0) {
            return;
        }
        if (!JsonUtils.valueExists(jSONObject, "auto_init_adapters") && !JsonUtils.valueExists(jSONObject, "test_mode_auto_init_adapters")) {
            lVar.c(e5.G);
            return;
        }
        JSONObject shallowCopy = JsonUtils.shallowCopy(jSONObject);
        JsonUtils.removeObjectsForKeys(shallowCopy, f);
        lVar.b(e5.G, shallowCopy.toString());
    }

    public static void f(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (JsonUtils.valueExists(jSONObject, "signal_providers")) {
            JSONObject shallowCopy = JsonUtils.shallowCopy(jSONObject);
            JsonUtils.removeObjectsForKeys(shallowCopy, e);
            lVar.b(e5.F, shallowCopy.toString());
            u5.a(shallowCopy);
        }
    }

    public static void g(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (JsonUtils.valueExists(jSONObject, "ad_unit_signal_providers") && JsonUtils.valueExists(jSONObject, "signal_providers")) {
            try {
                HashSet hashSet = new HashSet();
                JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
                for (int i = 0; i < jSONArray.length(); i++) {
                    hashSet.add(JsonUtils.getString(jSONArray.getJSONObject(i), "name", null));
                }
                HashSet hashSet2 = new HashSet();
                JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
                Iterator it = JsonUtils.toList(jSONObject2.names()).iterator();
                while (it.hasNext()) {
                    hashSet2.addAll(JsonUtils.getList(jSONObject2, (String) it.next(), null));
                }
                if (hashSet.equals(hashSet2)) {
                    return;
                }
                Set differenceSet = CollectionUtils.getDifferenceSet(hashSet, hashSet2);
                com.applovin.impl.sdk.p.h("MediationConnectionUtils", "\"signal_providers\" contains extra network(s): " + differenceSet);
                Set differenceSet2 = CollectionUtils.getDifferenceSet(hashSet2, hashSet);
                com.applovin.impl.sdk.p.h("MediationConnectionUtils", "\"ad_unit_signal_providers\" contains extra network(s): " + differenceSet2);
                lVar.E().a(h2.m1, "signalProvidersMismatch", CollectionUtils.hashMap("details", "extraSignalProviderNetworks=" + differenceSet + ",extraAdUnitSignalProviderNetworks=" + differenceSet2));
                m1.a("Networks within \"signal_providers\" and \"ad_unit_signal_providers\" do not match.", new Object[0]);
            } catch (JSONException e2) {
                com.applovin.impl.sdk.p.c("MediationConnectionUtils", "Failed to parse JSON", e2);
                lVar.E().a("MediationConnectionUtils", "verifyBidderNetworksMatchFromJson", e2);
                m1.a((Throwable) e2, "Failed to parse JSON in verifyBidderNetworksMatchFromJson", new Object[0]);
            }
        }
    }

    public static String h(com.applovin.impl.sdk.l lVar) {
        c5 c5Var = v3.O8;
        return s0.a((String) lVar.a(((Boolean) lVar.a(c5Var)).booleanValue() ? v3.N8 : v3.C7), ((Boolean) lVar.a(c5Var)).booleanValue() ? "2.0/mediate_debug" : "1.0/mediate_debug", lVar);
    }

    public static String i(com.applovin.impl.sdk.l lVar) {
        c5 c5Var = v3.O8;
        return s0.a((String) lVar.a(((Boolean) lVar.a(c5Var)).booleanValue() ? v3.M8 : v3.B7), ((Boolean) lVar.a(c5Var)).booleanValue() ? "2.0/mediate_debug" : "1.0/mediate_debug", lVar);
    }
}
