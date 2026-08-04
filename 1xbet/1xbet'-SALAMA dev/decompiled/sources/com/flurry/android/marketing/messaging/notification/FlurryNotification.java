package com.flurry.android.marketing.messaging.notification;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p155w1.AbstractC1006k1;

/* JADX INFO: loaded from: classes.dex */
public abstract class FlurryNotification<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f10486a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f10487b = new ConcurrentHashMap();
    protected String token;

    public static boolean a(JSONObject jSONObject, FlurryNotificationFilter flurryNotificationFilter, int i7) {
        List<String> pathList;
        if (jSONObject != null && (pathList = flurryNotificationFilter.getPathList()) != null && !pathList.isEmpty() && i7 < pathList.size()) {
            String str = pathList.get(i7);
            if (i7 == pathList.size() - 1) {
                String strOptString = jSONObject.optString(str, null);
                String equal = flurryNotificationFilter.getEqual();
                return strOptString != null && (equal == null || equal.equals(strOptString));
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
            if (jSONArrayOptJSONArray != null) {
                for (int i8 = 0; i8 < jSONArrayOptJSONArray.length(); i8++) {
                    if (a(jSONArrayOptJSONArray.optJSONObject(i8), flurryNotificationFilter, i7 + 1)) {
                        return true;
                    }
                }
                return false;
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
            if (jSONObjectOptJSONObject != null && a(jSONObjectOptJSONObject, flurryNotificationFilter, i7 + 1)) {
                return true;
            }
        }
        return false;
    }

    public static JSONObject convertMapToJson(Map<String, String> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            try {
                try {
                    jSONObject.put(key, new JSONArray(entry.getValue()));
                } catch (JSONException unused) {
                    jSONObject.put(key, new JSONObject(value));
                }
            } catch (JSONException unused2) {
                jSONObject.put(key, value);
            }
        }
        return jSONObject;
    }

    public String addNotificationFilter(FlurryNotificationFilter<T> flurryNotificationFilter) {
        String string = UUID.randomUUID().toString();
        this.f10486a.put(string, flurryNotificationFilter);
        return string;
    }

    public void addNotificationListener(String str, FlurryNotificationListener<T> flurryNotificationListener) {
        this.f10487b.put(str, flurryNotificationListener);
    }

    public abstract JSONObject convertToJson(T t7);

    public FlurryNotificationFilter<T> defaultNotificationFilter() {
        return null;
    }

    public FlurryNotificationFilter<T> getNotificationFilter(String str) {
        return (FlurryNotificationFilter) this.f10486a.get(str);
    }

    public FlurryNotificationListener<T> getNotificationListener(String str) {
        return (FlurryNotificationListener) this.f10487b.get(str);
    }

    public String getPushToken() {
        return this.token;
    }

    public void notificationReceived(T t7) {
        AbstractC1006k1.e(new c(this, t7, 0));
        boolean z4 = false;
        try {
            JSONObject jSONObjectConvertToJson = convertToJson(t7);
            if (jSONObjectConvertToJson != null) {
                ConcurrentHashMap concurrentHashMap = this.f10486a;
                if (concurrentHashMap.size() == 0) {
                    FlurryNotificationFilter<T> flurryNotificationFilterDefaultNotificationFilter = defaultNotificationFilter();
                    if (flurryNotificationFilterDefaultNotificationFilter != null && a(jSONObjectConvertToJson, flurryNotificationFilterDefaultNotificationFilter, 0)) {
                        AbstractC1006k1.e(new b(1, flurryNotificationFilterDefaultNotificationFilter, t7, false));
                        z4 = true;
                    }
                } else {
                    Iterator it = concurrentHashMap.entrySet().iterator();
                    boolean z7 = false;
                    while (it.hasNext()) {
                        FlurryNotificationFilter flurryNotificationFilter = (FlurryNotificationFilter) ((Map.Entry) it.next()).getValue();
                        if (a(jSONObjectConvertToJson, flurryNotificationFilter, 0)) {
                            AbstractC1006k1.e(new b(1, flurryNotificationFilter, t7, false));
                            z7 = true;
                        }
                    }
                    z4 = z7;
                }
            }
        } catch (Throwable unused) {
        }
        if (z4) {
            return;
        }
        AbstractC1006k1.e(new c(this, t7, 1));
    }

    public void notifyIntegrationType(boolean z4) {
        AbstractC1006k1.e(new a(this, z4, 0));
    }

    public void notifyNotificationStatus(boolean z4) {
        AbstractC1006k1.e(new a(this, z4, 1));
    }

    public void notifyTokenRefresh(String str) {
        AbstractC1006k1.e(new b(0, this, str));
    }

    public void removeNotificationFilter(String str) {
        this.f10486a.remove(str);
    }

    public void removeNotificationListener(String str) {
        this.f10487b.remove(str);
    }

    public abstract void tokenRefreshed(String str);
}
