package com.onesignal.common;

import B4.r;
import android.os.Bundle;
import com.onesignal.debug.internal.logging.Logging;
import g4.AbstractC0467l;
import g4.AbstractC0476u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class JSONUtils {
    public static final String EXTERNAL_USER_ID = "external_user_id";
    public static final JSONUtils INSTANCE = new JSONUtils();

    private JSONUtils() {
    }

    public final JSONObject bundleAsJSONObject(Bundle bundle) {
        i.e(bundle, "bundle");
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, bundle.get(str));
            } catch (JSONException e3) {
                Logging.error("bundleAsJSONObject error for key: " + str, e3);
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        r4 = r4 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean compareJSONArrays(JSONArray jSONArray, JSONArray jSONArray2) {
        int i2;
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        try {
            int length = jSONArray.length();
            int i3 = 0;
            while (i3 < length) {
                int length2 = jSONArray2.length();
                for (0; i2 < length2; i2 + 1) {
                    Object obj = jSONArray.get(i3);
                    i.d(obj, "get(...)");
                    Object normalizeType = normalizeType(obj);
                    Object obj2 = jSONArray2.get(i2);
                    i.d(obj2, "get(...)");
                    i2 = i.a(normalizeType, normalizeType(obj2)) ? 0 : i2 + 1;
                }
                return false;
            }
            return true;
        } catch (JSONException e3) {
            e3.printStackTrace();
            return false;
        }
    }

    public final Object convertToJson(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                return obj;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(INSTANCE.convertToJson(it.next()));
            }
            return jSONArray;
        }
        Set entrySet = ((Map) obj).entrySet();
        ArrayList<Map.Entry> arrayList = new ArrayList();
        for (Object obj2 : entrySet) {
            if (((Map.Entry) obj2).getKey() instanceof String) {
                arrayList.add(obj2);
            }
        }
        int W5 = AbstractC0476u.W(AbstractC0467l.D0(arrayList, 10));
        if (W5 < 16) {
            W5 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(W5);
        for (Map.Entry entry : arrayList) {
            Object key = entry.getKey();
            i.c(key, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) key, INSTANCE.convertToJson(entry.getValue()));
        }
        return mapToJson(linkedHashMap);
    }

    public final boolean isValidJsonObject(Object obj) {
        boolean z;
        boolean z5;
        if (obj == null ? true : obj instanceof Boolean ? true : obj instanceof Number ? true : obj instanceof String ? true : obj instanceof JSONObject ? true : obj instanceof JSONArray) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            Set keySet = map.keySet();
            if (keySet == null || !keySet.isEmpty()) {
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof String)) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                Collection values = map.values();
                if (values == null || !values.isEmpty()) {
                    Iterator it2 = values.iterator();
                    while (it2.hasNext()) {
                        if (!INSTANCE.isValidJsonObject(it2.next())) {
                            z5 = false;
                            break;
                        }
                    }
                }
                z5 = true;
                if (z5) {
                    return true;
                }
            }
        } else if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return true;
            }
            Iterator it3 = iterable.iterator();
            while (it3.hasNext()) {
                if (!INSTANCE.isValidJsonObject(it3.next())) {
                }
            }
            return true;
        }
        return false;
    }

    public final Bundle jsonStringToBundle(String data) {
        i.e(data, "data");
        try {
            JSONObject jSONObject = new JSONObject(data);
            Bundle bundle = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            i.d(keys, "keys(...)");
            while (keys.hasNext()) {
                String next = keys.next();
                i.c(next, "null cannot be cast to non-null type kotlin.String");
                String str = next;
                bundle.putString(str, jSONObject.getString(str));
            }
            return bundle;
        } catch (JSONException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public final JSONObject mapToJson(Map<String, ? extends Object> map) {
        i.e(map, "map");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), convertToJson(entry.getValue()));
        }
        return jSONObject;
    }

    public final Map<String, String> newStringMapFromJSONObject(JSONObject jsonObject) {
        Object opt;
        i.e(jsonObject, "jsonObject");
        Iterator<String> keys = jsonObject.keys();
        i.d(keys, "keys(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                opt = jsonObject.opt(next);
            } catch (Throwable unused) {
            }
            if (!(opt instanceof JSONArray) && !(opt instanceof JSONObject)) {
                if (!jsonObject.isNull(next) && !"".equals(opt)) {
                    linkedHashMap.put(next, opt.toString());
                }
                linkedHashMap.put(next, "");
            }
            Logging.warn$default("Omitting key '" + next + "'! sendTags DO NOT supported nested values!", null, 2, null);
        }
        return linkedHashMap;
    }

    public final Set<String> newStringSetFromJSONArray(JSONArray jsonArray) {
        i.e(jsonArray, "jsonArray");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jsonArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            String string = jsonArray.getString(i2);
            i.d(string, "getString(...)");
            linkedHashSet.add(string);
        }
        return linkedHashSet;
    }

    public final Object normalizeType(Object object) {
        i.e(object, "object");
        Class<?> cls = object.getClass();
        return cls.equals(Integer.TYPE) ? Long.valueOf(((Integer) object).intValue()) : cls.equals(Float.TYPE) ? Double.valueOf(((Float) object).floatValue()) : object;
    }

    public final String toUnescapedEUIDString(JSONObject json) {
        String group;
        i.e(json, "json");
        String jSONObject = json.toString();
        i.d(jSONObject, "toString(...)");
        if (!json.has(EXTERNAL_USER_ID)) {
            return jSONObject;
        }
        Matcher matcher = Pattern.compile("(?<=\"external_user_id\":\").*?(?=\")").matcher(jSONObject);
        if (!matcher.find() || (group = matcher.group(0)) == null) {
            return jSONObject;
        }
        String replaceAll = matcher.replaceAll(Matcher.quoteReplacement(r.M(group, "\\/", "/")));
        i.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final JSONArray wrapInJsonArray(JSONObject jSONObject) {
        JSONArray put = new JSONArray().put(jSONObject);
        i.d(put, "put(...)");
        return put;
    }
}
