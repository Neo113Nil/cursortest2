package com.ironsource;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class I6 {
    public static final String b = "userId";
    public static final String c = "appKey";
    private static I6 d;

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f7676a = new JSONObject();

    private I6() {
    }

    public static synchronized I6 a() {
        I6 i6;
        synchronized (I6.class) {
            if (d == null) {
                d = new I6();
            }
            i6 = d;
        }
        return i6;
    }

    public synchronized JSONObject b() throws JSONException {
        if (Ib.a0().h().w()) {
            return new JSONObject(this.f7676a.toString());
        }
        return this.f7676a;
    }

    public synchronized void a(Map<String, Object> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                a(str, map.get(str));
            }
        }
    }

    public synchronized void a(String str, Object obj) {
        try {
            this.f7676a.put(str, obj);
        } catch (Exception e) {
            C4491k4.d().a(e);
        }
    }

    public synchronized String a(String str) {
        return this.f7676a.optString(str);
    }
}
