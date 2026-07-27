package com.onesignal.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONObject;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class JSONObjectExtensionsKt {
    public static final <T> List<T> expandJSONArray(JSONObject jSONObject, String name, InterfaceC1441l into) {
        i.e(jSONObject, "<this>");
        i.e(name, "name");
        i.e(into, "into");
        ArrayList arrayList = new ArrayList();
        if (jSONObject.has(name)) {
            JSONArray jSONArray = jSONObject.getJSONArray(name);
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                i.b(jSONObject2);
                Object invoke = into.invoke(jSONObject2);
                if (invoke != null) {
                    arrayList.add(invoke);
                }
            }
        }
        return arrayList;
    }

    public static final void expandJSONObject(JSONObject jSONObject, String name, InterfaceC1441l into) {
        i.e(jSONObject, "<this>");
        i.e(name, "name");
        i.e(into, "into");
        if (jSONObject.has(name)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(name);
            i.d(jSONObject2, "getJSONObject(...)");
            into.invoke(jSONObject2);
        }
    }

    public static final <T> JSONObject putJSONArray(JSONObject jSONObject, String name, List<? extends T> list, InterfaceC1441l create) {
        i.e(jSONObject, "<this>");
        i.e(name, "name");
        i.e(create, "create");
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject2 = (JSONObject) create.invoke(it.next());
                if (jSONObject2 != null) {
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put(name, jSONArray);
        }
        return jSONObject;
    }

    public static final JSONObject putJSONObject(JSONObject jSONObject, String name, InterfaceC1441l expand) {
        i.e(jSONObject, "<this>");
        i.e(name, "name");
        i.e(expand, "expand");
        JSONObject jSONObject2 = new JSONObject();
        expand.invoke(jSONObject2);
        jSONObject.put(name, jSONObject2);
        return jSONObject;
    }

    public static final JSONObject putMap(JSONObject jSONObject, Map<String, ? extends Object> map) {
        i.e(jSONObject, "<this>");
        i.e(map, "map");
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                value = JSONObject.NULL;
            }
            jSONObject.put(key, value);
        }
        return jSONObject;
    }

    public static final JSONObject putSafe(JSONObject jSONObject, String name, Object obj) {
        i.e(jSONObject, "<this>");
        i.e(name, "name");
        if (obj != null) {
            jSONObject.put(name, obj);
        }
        return jSONObject;
    }

    public static final Boolean safeBool(JSONObject jSONObject, String name) {
        i.e(jSONObject, "<this>");
        i.e(name, "name");
        if (jSONObject.has(name)) {
            return Boolean.valueOf(jSONObject.getBoolean(name));
        }
        return null;
    }

    public static final Double safeDouble(JSONObject jSONObject, String name) {
        i.e(jSONObject, "<this>");
        i.e(name, "name");
        if (jSONObject.has(name)) {
            return Double.valueOf(jSONObject.getDouble(name));
        }
        return null;
    }

    public static final Integer safeInt(JSONObject jSONObject, String name) {
        i.e(jSONObject, "<this>");
        i.e(name, "name");
        if (jSONObject.has(name)) {
            return Integer.valueOf(jSONObject.getInt(name));
        }
        return null;
    }

    public static final JSONObject safeJSONObject(JSONObject jSONObject, String name) {
        i.e(jSONObject, "<this>");
        i.e(name, "name");
        if (jSONObject.has(name)) {
            return jSONObject.getJSONObject(name);
        }
        return null;
    }

    public static final Long safeLong(JSONObject jSONObject, String name) {
        i.e(jSONObject, "<this>");
        i.e(name, "name");
        if (jSONObject.has(name)) {
            return Long.valueOf(jSONObject.getLong(name));
        }
        return null;
    }

    public static final String safeString(JSONObject jSONObject, String name) {
        i.e(jSONObject, "<this>");
        i.e(name, "name");
        if (jSONObject.has(name)) {
            return jSONObject.getString(name);
        }
        return null;
    }

    public static final List<Object> toList(JSONArray jSONArray) {
        i.e(jSONArray, "<this>");
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            Object opt = jSONArray.opt(i2);
            if (JSONObject.NULL.equals(opt)) {
                arrayList.add(null);
            } else if (opt instanceof JSONArray) {
                arrayList.add(toList((JSONArray) opt));
            } else if (opt instanceof JSONObject) {
                arrayList.add(toMap((JSONObject) opt));
            } else {
                arrayList.add(opt);
            }
        }
        return arrayList;
    }

    public static final Map<String, Object> toMap(JSONObject jSONObject) {
        i.e(jSONObject, "<this>");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        i.d(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            i.b(next);
            if (JSONObject.NULL.equals(obj)) {
                obj = null;
            } else if (obj instanceof JSONObject) {
                obj = toMap((JSONObject) obj);
            } else if (obj instanceof JSONArray) {
                obj = toList((JSONArray) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    public static final JSONObject putMap(JSONObject jSONObject, String name, Map<String, ? extends Object> map) {
        i.e(jSONObject, "<this>");
        i.e(name, "name");
        if (map != null) {
            putJSONObject(jSONObject, name, new JSONObjectExtensionsKt$putMap$1(map));
        }
        return jSONObject;
    }
}
