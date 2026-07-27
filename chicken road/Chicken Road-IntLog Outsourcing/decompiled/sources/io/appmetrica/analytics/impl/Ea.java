package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Ea {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f6747a;

    static {
        HashSet hashSet = new HashSet();
        f6747a = hashSet;
        hashSet.add("get_ad");
        hashSet.add("report");
        hashSet.add("report_ad");
        hashSet.add("startup");
        hashSet.add("diagnostic");
    }

    public static ArrayList a(JSONObject jSONObject, String str) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (optJSONObject != null) {
                return AbstractC0847nb.a(optJSONObject.getJSONArray("urls"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
