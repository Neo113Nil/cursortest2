package com.mbridge.msdk.config.component.common.metrics;

import android.text.TextUtils;
import bolts.MeasurementEvent;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MetricsUtil.java */
/* loaded from: classes6.dex */
public class b {
    public static Map<String, Object> a(com.mbridge.msdk.config.component.base.b bVar, Map<String, Object> map, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Map<String, Object> a2;
        Map<String, Object> a3;
        Map<String, Object> a4;
        Map<String, Object> a5;
        Object obj;
        HashMap hashMap = new HashMap();
        try {
            boolean a6 = a(bVar.b(), c.c("20"));
            boolean a7 = a(bVar.b(), c.c("21"));
            boolean a8 = a(bVar.b(), c.c("22"));
            boolean a9 = a(bVar.b(), c.c("23"));
            hashMap.put(c.c("key"), bVar.c());
            if (a6 && (a5 = a(aVar.b(c.c("50")))) != null && (obj = a5.get(c.c(MeasurementEvent.MEASUREMENT_EVENT_NAME_KEY))) != null) {
                hashMap.put(c.c("e_s_name"), String.valueOf(obj));
            }
            HashMap hashMap2 = null;
            Map<String, Object> a10 = map != null ? a(map.get("event_gen_data")) : null;
            Map<String, Object> a11 = map != null ? a(map.get("event_replace_data")) : null;
            if (a11 != null && a11.containsKey(c.c("24")) && (a4 = a(a11.get(c.c("24")))) != null && !a4.isEmpty()) {
                hashMap2 = new HashMap(a4);
                a11.remove(c.c("24"));
            }
            if (a7 && a10 != null) {
                hashMap.put(c.c("e_output"), a10);
            }
            if (a8) {
                hashMap.put(c.c("execute_c_config"), a(a(bVar.b().get(c.c("52")))));
                if (a11 != null && !a11.isEmpty()) {
                    a11.remove(c.c("pre_action"));
                    hashMap.put(c.c("execute_e_config"), a11);
                }
            }
            if (a9 && (a2 = a(bVar.b().get(c.c("51")))) != null && (a3 = a(a2.get(c.c("metrics")))) != null && !a3.isEmpty()) {
                hashMap.putAll(a3);
            }
            if (hashMap2 != null && !hashMap2.isEmpty()) {
                hashMap.putAll(c.a((Map<String, Object>) hashMap2));
            }
        } catch (Throwable th) {
            q0.b("MetricsUtil", th.getMessage());
        }
        return hashMap;
    }

    private static boolean a(Map<String, Object> map, String str) {
        Map<String, Object> map2;
        Object obj;
        if (map != null && !TextUtils.isEmpty(str)) {
            try {
                if (map.containsKey(c.c("50"))) {
                    Object obj2 = map.get(c.c("50"));
                    if (obj2 instanceof Map) {
                        map2 = (Map) obj2;
                    } else if (obj2 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                        map2 = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj2).b();
                    }
                    if (map2 == null && map2.containsKey(str) && (obj = map2.get(str)) != null) {
                        return String.valueOf(obj).equals("1");
                    }
                    return true;
                }
                map2 = null;
                if (map2 == null) {
                }
            } catch (Throwable th) {
                q0.b("MetricsUtil", th.getMessage());
            }
        }
        return true;
    }

    private static Map<String, Object> a(Object obj) {
        if (obj instanceof Map) {
            return (Map) obj;
        }
        if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            return ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).b();
        }
        return null;
    }

    private static Map<String, Object> a(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!entry.getKey().equals(c.c("25")) && !entry.getKey().equals(c.c("13"))) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return hashMap;
    }

    public static void a(String str, Map<String, Object> map) {
        try {
            e eVar = new e();
            eVar.a(map);
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar.a(str, eVar);
            d.b().a(str, cVar);
        } catch (Throwable th) {
            q0.b("MetricsUtil", th.getMessage());
        }
    }
}
