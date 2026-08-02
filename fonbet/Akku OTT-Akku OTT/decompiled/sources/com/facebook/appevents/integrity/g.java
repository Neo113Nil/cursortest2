package com.facebook.appevents.integrity;

import android.os.Bundle;
import com.facebook.internal.E;
import com.facebook.internal.n;
import com.facebook.internal.p;
import com.facebook.w;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class g {
    public static boolean b;
    public static final g a = new g();
    public static HashSet<String> c = new HashSet<>();
    public static HashMap d = new HashMap();

    @JvmStatic
    public static final void b(Bundle bundle, String eventName) {
        if (com.facebook.internal.instrument.crashshield.a.b(g.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (b && bundle != null) {
                if (!c.isEmpty() || d.containsKey(eventName)) {
                    JSONArray jSONArray = new JSONArray();
                    try {
                        HashSet hashSet = (HashSet) d.get(eventName);
                        Iterator it = new ArrayList(bundle.keySet()).iterator();
                        while (it.hasNext()) {
                            String key = (String) it.next();
                            g gVar = a;
                            Intrinsics.checkNotNullExpressionValue(key, "key");
                            gVar.getClass();
                            if (!com.facebook.internal.instrument.crashshield.a.b(gVar)) {
                                try {
                                    if (c.contains(key) || (hashSet != null && !hashSet.isEmpty() && hashSet.contains(key))) {
                                        bundle.remove(key);
                                        jSONArray.put(key);
                                    }
                                } catch (Throwable th) {
                                    com.facebook.internal.instrument.crashshield.a.a(th, gVar);
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                    if (jSONArray.length() > 0) {
                        bundle.putString("_filteredKey", jSONArray.toString());
                    }
                }
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, g.class);
        }
    }

    public final void a() {
        HashSet<String> e;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            n k = p.k(w.b(), false);
            if (k == null) {
                return;
            }
            try {
                c = new HashSet<>();
                d = new HashMap();
                JSONArray jSONArray = k.r;
                if (jSONArray == null || jSONArray.length() == 0) {
                    return;
                }
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    boolean has = jSONObject.has(Constants.KEY);
                    boolean has2 = jSONObject.has("value");
                    if (has && has2) {
                        String sensitiveParamsScope = jSONObject.getString(Constants.KEY);
                        JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                        if (jSONArray2 != null && (e = E.e(jSONArray2)) != null) {
                            if (sensitiveParamsScope.equals("_MTSDK_Default_")) {
                                c = e;
                            } else {
                                HashMap hashMap = d;
                                Intrinsics.checkNotNullExpressionValue(sensitiveParamsScope, "sensitiveParamsScope");
                                hashMap.put(sensitiveParamsScope, e);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }
}
