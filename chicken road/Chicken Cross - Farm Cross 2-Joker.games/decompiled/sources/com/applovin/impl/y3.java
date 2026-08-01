package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w3;
import com.applovin.impl.x3;
import com.applovin.mediation.MaxAdFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class y3 {
    private static final HashMap d = new HashMap();
    private static final Object e = new Object();
    private static final HashMap f = new HashMap();
    private static final Object g = new Object();
    private static final HashMap h = new LinkedHashMap();
    private static final Object i = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f4568a;
    private final JSONObject b = a(v3.E8);
    private final JSONObject c = a(v3.D8);

    public y3(com.applovin.impl.sdk.l lVar) {
        this.f4568a = lVar;
        a((String) f5.a(e5.K, (Object) null, com.applovin.impl.sdk.l.p()), x3.a.AD_UNIT_ID);
        a((String) f5.a(e5.L, (Object) null, com.applovin.impl.sdk.l.p()), x3.a.AD_FORMAT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long a(Long l, Long l2) {
        return l;
    }

    private JSONObject a(c5 c5Var) {
        return JsonUtils.jsonObjectFromJsonString((String) this.f4568a.a(c5Var), new JSONObject());
    }

    private Map b(w3 w3Var, x3 x3Var, w3.b bVar) {
        if (!a(w3Var, x3Var, bVar) || !b(w3Var, x3Var)) {
            return null;
        }
        String b = x3Var.b();
        HashMap a2 = a(x3Var.a());
        Object b2 = b(x3Var.a());
        HashMap hashMap = new HashMap();
        synchronized (b2) {
            if (x3Var instanceof u3) {
                a((u3) x3Var, a2);
            }
            HashMap hashMap2 = (HashMap) a2.get(b);
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
                a2.put(b, hashMap2);
            }
            Iterator it = w3Var.b().iterator();
            while (it.hasNext()) {
                String b3 = ((w3.a) it.next()).b();
                HashMap hashMap3 = (HashMap) hashMap2.get(b3);
                if (hashMap3 == null) {
                    hashMap3 = new HashMap();
                    hashMap2.put(b3, hashMap3);
                }
                Object a3 = bVar.a(hashMap3.get(w3Var));
                hashMap3.put(w3Var, a3);
                hashMap.put(b3, a3);
            }
        }
        if (w3Var.a(w3.a.INSTALL)) {
            b(x3Var);
        }
        return hashMap;
    }

    private e5 c(x3.a aVar) {
        if (aVar == x3.a.AD_UNIT_ID) {
            return e5.K;
        }
        if (aVar == x3.a.AD_FORMAT) {
            return e5.L;
        }
        return null;
    }

    public Map a(w3 w3Var, x3 x3Var) {
        return b(w3Var, x3Var, new w3.b() { // from class: com.applovin.impl.y3$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.w3.b
            public final Object a(Object obj) {
                Long a2;
                a2 = y3.a((Long) obj);
                return a2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long a(Long l) {
        return Long.valueOf(l != null ? 1 + l.longValue() : 1L);
    }

    public void a(w3 w3Var, x3 x3Var, final Long l) {
        b(w3Var, x3Var, new w3.b() { // from class: com.applovin.impl.y3$$ExternalSyntheticLambda1
            @Override // com.applovin.impl.w3.b
            public final Object a(Object obj) {
                Long a2;
                a2 = y3.a(l, (Long) obj);
                return a2;
            }
        });
    }

    public Map a(w3 w3Var, x3.a aVar) {
        return a(w3Var, aVar, w3.a.SESSION);
    }

    private Map a(w3 w3Var, x3.a aVar, w3.a aVar2) {
        HashMap a2 = a(aVar);
        Object b = b(aVar);
        HashMap hashMap = new HashMap();
        synchronized (b) {
            for (String str : a2.keySet()) {
                HashMap hashMap2 = (HashMap) a2.get(str);
                String b2 = aVar2.b();
                if (hashMap2 != null && hashMap2.containsKey(b2)) {
                    HashMap hashMap3 = (HashMap) hashMap2.get(b2);
                    if (aVar == x3.a.AD) {
                        hashMap.put(n3.a(str).b(), hashMap3.get(w3Var));
                    } else {
                        hashMap.put(str, hashMap3.get(w3Var));
                    }
                }
            }
        }
        return hashMap;
    }

    private void a(u3 u3Var, Map map) {
        MaxAdFormat a2 = u3Var.c().a();
        Integer integer = JsonUtils.getInteger(this.c, a2.getLabel(), null);
        if (integer == null) {
            return;
        }
        Iterator it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (n3.a((String) it.next()).a().equals(a2)) {
                i2++;
            }
        }
        if (i2 < integer.intValue()) {
            return;
        }
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext() && i2 >= integer.intValue()) {
            if (n3.a((String) ((Map.Entry) it2.next()).getKey()).a().equals(a2)) {
                it2.remove();
                i2--;
            }
        }
    }

    private Object b(x3.a aVar) {
        if (aVar == x3.a.AD_UNIT_ID) {
            return e;
        }
        if (aVar == x3.a.AD_FORMAT) {
            return g;
        }
        return i;
    }

    private boolean b(w3 w3Var, x3 x3Var) {
        Iterator<String> keys = this.b.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (next.equals(x3Var.a().toString().toLowerCase()) && JsonUtils.valueExists(JsonUtils.getJSONArray(this.b, next, new JSONArray()), w3Var.a())) {
                return false;
            }
        }
        return true;
    }

    private HashMap a(x3.a aVar) {
        if (aVar == x3.a.AD_UNIT_ID) {
            return d;
        }
        if (aVar == x3.a.AD_FORMAT) {
            return f;
        }
        return h;
    }

    private void b(x3 x3Var) {
        e5 c = c(x3Var.a());
        if (c == null) {
            return;
        }
        f5.b(c, a((Map) a(x3Var)), com.applovin.impl.sdk.l.p());
    }

    private boolean a(w3 w3Var, x3 x3Var, w3.b bVar) {
        if (w3Var == null) {
            this.f4568a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f4568a.Q().b("MediationStatsManager", "Failed to update stat, no stat provided");
            }
            return false;
        }
        if (x3Var == null) {
            this.f4568a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f4568a.Q().b("MediationStatsManager", "Failed to update stat, no dimension key provided");
            }
            return false;
        }
        if (bVar != null) {
            return true;
        }
        this.f4568a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f4568a.Q().b("MediationStatsManager", "Failed to update stat, no stat updater provided");
        }
        return false;
    }

    private HashMap a(x3 x3Var) {
        HashMap hashMap = new HashMap();
        HashMap a2 = a(x3Var.a());
        synchronized (b(x3Var.a())) {
            for (Map.Entry entry : a2.entrySet()) {
                String str = (String) entry.getKey();
                HashMap hashMap2 = (HashMap) entry.getValue();
                if (!CollectionUtils.isEmpty(hashMap2)) {
                    HashMap hashMap3 = (HashMap) hashMap2.get(w3.a.INSTALL.b());
                    if (!CollectionUtils.isEmpty(hashMap3)) {
                        hashMap.put(str, new HashMap(hashMap3));
                    }
                }
            }
        }
        return hashMap;
    }

    private String a(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry2 : ((HashMap) entry.getValue()).entrySet()) {
                w3 w3Var = (w3) entry2.getKey();
                Object value = entry2.getValue();
                if (value != null) {
                    JsonUtils.putObject(jSONObject2, w3Var.toString(), value);
                }
            }
            JsonUtils.putJSONObject(jSONObject, (String) entry.getKey(), jSONObject2);
        }
        return jSONObject.toString();
    }

    private void a(String str, x3.a aVar) {
        if (StringUtils.isValidString(str)) {
            HashMap a2 = a(aVar);
            Object b = b(aVar);
            Map<String, Object> stringObjectMap = JsonUtils.toStringObjectMap(str);
            synchronized (b) {
                for (Map.Entry<String, Object> entry : stringObjectMap.entrySet()) {
                    String key = entry.getKey();
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                        w3 a3 = w3.a((String) entry2.getKey());
                        if (a3 != null) {
                            hashMap.put(a3, a(entry2.getValue()));
                        }
                    }
                    if (!CollectionUtils.isEmpty(hashMap)) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put(w3.a.INSTALL.b(), hashMap);
                        a2.put(key, hashMap2);
                    }
                }
            }
        }
    }

    private Object a(Object obj) {
        return obj instanceof Integer ? Long.valueOf(((Integer) obj).longValue()) : obj;
    }
}
