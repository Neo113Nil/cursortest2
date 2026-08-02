package q6;

import io.sentry.ISentryLifecycleToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import u2.InterfaceC1636m;

/* loaded from: classes2.dex */
public abstract class a {
    public static final void a(ISentryLifecycleToken iSentryLifecycleToken, Throwable th) {
        if (iSentryLifecycleToken != null) {
            if (th == null) {
                iSentryLifecycleToken.close();
                return;
            }
            try {
                iSentryLifecycleToken.close();
            } catch (Throwable th2) {
                Q0.a.c(th, th2);
            }
        }
    }

    public static void b(InterfaceC1636m interfaceC1636m) {
        if (interfaceC1636m != null) {
            try {
                interfaceC1636m.close();
            } catch (IOException unused) {
            }
        }
    }

    public static HashMap c(String str) {
        try {
            return g(new JSONObject(str));
        } catch (JSONException e7) {
            throw new IOException(e7);
        }
    }

    public static String d(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof String) {
            return JSONObject.quote((String) obj);
        }
        if (obj instanceof Number) {
            try {
                return JSONObject.numberToString((Number) obj);
            } catch (JSONException e7) {
                throw new IOException("Could not serialize number", e7);
            }
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? "true" : "false";
        }
        try {
            JSONStringer jSONStringer = new JSONStringer();
            e(obj, jSONStringer);
            return jSONStringer.toString();
        } catch (JSONException e8) {
            throw new IOException("Failed to serialize JSON", e8);
        }
    }

    public static void e(Object obj, JSONStringer jSONStringer) {
        if (obj instanceof Map) {
            jSONStringer.object();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONStringer.key((String) entry.getKey());
                e(entry.getValue(), jSONStringer);
            }
            jSONStringer.endObject();
            return;
        }
        if (!(obj instanceof Collection)) {
            jSONStringer.value(obj);
            return;
        }
        jSONStringer.array();
        Iterator it = ((Collection) obj).iterator();
        while (it.hasNext()) {
            e(it.next(), jSONStringer);
        }
        jSONStringer.endArray();
    }

    public static Object f(Object obj) {
        if (obj instanceof JSONObject) {
            return g((JSONObject) obj);
        }
        if (!(obj instanceof JSONArray)) {
            if (obj.equals(JSONObject.NULL)) {
                return null;
            }
            return obj;
        }
        JSONArray jSONArray = (JSONArray) obj;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            arrayList.add(f(jSONArray.get(i7)));
        }
        return arrayList;
    }

    public static HashMap g(JSONObject jSONObject) {
        HashMap hashMap = new HashMap(jSONObject.length());
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, f(jSONObject.get(next)));
        }
        return hashMap;
    }
}
