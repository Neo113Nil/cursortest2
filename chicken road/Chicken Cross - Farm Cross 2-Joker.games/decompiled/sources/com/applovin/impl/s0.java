package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import com.applovin.impl.r0;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.Q3;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f4417a = {7, 4, 2, 1, 11};
    private static final int[] b = {5, 6, 12, 10, 3, 9, 8, 14};
    private static final int[] c = {15, 13};
    private static final int[] d = {20};

    public static String a(String str, com.applovin.impl.sdk.l lVar) {
        return a((String) lVar.a(c5.o0), str, lVar);
    }

    public static boolean a(int i) {
        return i < 200 || i >= 300;
    }

    public static String b(String str, com.applovin.impl.sdk.l lVar) {
        return a((String) lVar.a(c5.n0), str, lVar);
    }

    public static Map c(com.applovin.impl.sdk.l lVar) {
        HashMap hashMap = new HashMap();
        String str = (String) lVar.a(c5.j);
        if (StringUtils.isValidString(str)) {
            hashMap.put("device_token", str);
        } else if (!((Boolean) lVar.a(c5.u5)).booleanValue()) {
            hashMap.put("api_key", lVar.k0());
        }
        hashMap.putAll(t7.a(lVar.B().e()));
        return hashMap;
    }

    public static String d(com.applovin.impl.sdk.l lVar) {
        return a((String) lVar.a(c5.m0), "4.0/ad", lVar);
    }

    public static String e(com.applovin.impl.sdk.l lVar) {
        return a((String) lVar.a(c5.l0), "4.0/ad", lVar);
    }

    public static Long f(com.applovin.impl.sdk.l lVar) {
        r0.d a2 = lVar.x().a();
        if (a2 == null) {
            return null;
        }
        double c2 = t7.c(a2.b());
        double d2 = t7.d(a2.a());
        if (d2 == 0.0d) {
            return null;
        }
        return Long.valueOf((long) (c2 / d2));
    }

    public static String g(com.applovin.impl.sdk.l lVar) {
        NetworkInfo b2 = b(com.applovin.impl.sdk.l.p());
        if (b2 == null) {
            return "unknown";
        }
        int type = b2.getType();
        int subtype = b2.getSubtype();
        return type == 1 ? Q3.b : type == 0 ? a(subtype, f4417a) ? "2g" : a(subtype, b) ? Q3.f7855a : a(subtype, c) ? "4g" : a(subtype, d) ? "5g" : "mobile" : "unknown";
    }

    public static void a(JSONObject jSONObject, boolean z, com.applovin.impl.sdk.l lVar) {
        lVar.u().a(jSONObject, z);
    }

    public static void b(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        String string = JsonUtils.getString(jSONObject, "persisted_data", null);
        if (StringUtils.isValidString(string)) {
            lVar.b(e5.H, string);
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().d("ConnectionUtils", "Updated persisted data");
            }
        }
    }

    public static void a(int i, com.applovin.impl.sdk.l lVar) {
        if (i == 401) {
            com.applovin.impl.sdk.p.h("AppLovinSdk", "SDK key \"" + lVar.k0() + "\" is rejected by AppLovin. Please make sure the SDK key is correct.");
            return;
        }
        if (i == 418) {
            lVar.q0().a(c5.e, Boolean.TRUE);
            lVar.q0().e();
        } else if (i >= 400 && i < 500) {
            if (((Boolean) lVar.a(c5.g)).booleanValue()) {
                lVar.V0();
            }
        } else if (i == -1 && ((Boolean) lVar.a(c5.g)).booleanValue()) {
            lVar.V0();
        }
    }

    private static NetworkInfo b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    public static String b(com.applovin.impl.sdk.l lVar) {
        return a((String) lVar.a(c5.l0), ((Boolean) lVar.a(c5.p3)).booleanValue() ? "5.0/ad" : "4.0/ad", lVar);
    }

    public static void c(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (lVar != null) {
            try {
                if (jSONObject.has("settings")) {
                    d5 q0 = lVar.q0();
                    if (jSONObject.isNull("settings")) {
                        return;
                    }
                    JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
                    q0.a(jSONObject2);
                    q0.e();
                    String b2 = c5.Q6.b();
                    if (JsonUtils.valueExists(jSONObject2, b2)) {
                        f5.b(e5.J, JsonUtils.getBoolean(jSONObject2, b2, Boolean.FALSE), com.applovin.impl.sdk.l.p());
                        return;
                    }
                    return;
                }
                return;
            } catch (JSONException e) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().a("ConnectionUtils", "Unable to parse settings out of API response", e);
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public static String a(String str, String str2, com.applovin.impl.sdk.l lVar) {
        if (str == null || str.length() < 4) {
            throw new IllegalArgumentException("Invalid domain specified");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("No endpoint specified");
        }
        if (lVar != null) {
            return str + str2;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public static void a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "filesystem_values", (JSONObject) null);
        if (jSONObject2 != null) {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.l.p()).edit();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object object = JsonUtils.getObject(jSONObject2, next, null);
                if (object != null) {
                    f5.a(next, object, (SharedPreferences) null, edit);
                }
            }
            if (((Boolean) lVar.a(c5.M6)).booleanValue()) {
                f5.a(edit);
            } else {
                edit.apply();
            }
        }
    }

    public static byte[] a(InputStream inputStream, com.applovin.impl.sdk.l lVar) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[((Integer) lVar.a(c5.i3)).intValue()];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static boolean a(Context context) {
        if (context.getSystemService("connectivity") == null) {
            return true;
        }
        NetworkInfo b2 = b(context);
        if (b2 != null) {
            return b2.isConnected();
        }
        return false;
    }

    private static boolean a(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static String a(com.applovin.impl.sdk.l lVar) {
        return a((String) lVar.a(c5.m0), ((Boolean) lVar.a(c5.p3)).booleanValue() ? "5.0/ad" : "4.0/ad", lVar);
    }
}
