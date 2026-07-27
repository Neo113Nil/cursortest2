package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᐣ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0747 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static C0747 f2080;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public HashMap f2082;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final HashMap f2083 = new HashMap();

    /* renamed from: ｋ, reason: contains not printable characters */
    public final Handler f2081 = new Handler(Looper.getMainLooper());

    static {
        StringFog.decrypt("+9YEpiZnwEHq2gWsIU3xTP/c\n", "j7lxxU4jpTU=\n");
        StringFog.decrypt("yB2t\n", "qWnBA0Vv/34=\n");
        StringFog.decrypt("LQE=\n", "X21eIY4f2cw=\n");
        StringFog.decrypt("OlsT\n", "VDR9n7wB51Y=\n");
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static synchronized C0747 m5649() {
        C0747 c0747;
        synchronized (C0747.class) {
            if (f2080 == null) {
                f2080 = new C0747();
            }
            c0747 = f2080;
        }
        return c0747;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized boolean m5651(Activity activity) {
        return EnumC0753.f2090 == m5652(activity);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized EnumC0753 m5652(Activity activity) {
        if (activity != null) {
            String name = activity.getClass().getName();
            if (m5650().containsKey(name)) {
                return (EnumC0753) m5650().get(name);
            }
            if (((HashMap) m5653()).containsKey(name)) {
                return (EnumC0753) ((HashMap) m5653()).get(name);
            }
        }
        return EnumC0753.m5654(AbstractC0398.m5397().mo5406());
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized HashMap m5650() {
        return new HashMap(this.f2083);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized Map m5653() {
        JSONObject jSONObject;
        if (this.f2082 == null) {
            this.f2082 = new HashMap();
            C1161 c1161 = ((C0470) AbstractC0398.m5397()).f3223;
            if (c1161 != null) {
                jSONObject = c1161.f3327.optJSONObject(C1161.f3324);
                if (jSONObject == null) {
                    jSONObject = c1161.f3326;
                }
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, EnumC0753.m5654(jSONObject.optString(next)));
                }
                this.f2082 = hashMap;
            }
        }
        return this.f2082;
    }
}
