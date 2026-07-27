package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ܕ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC0647 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String f1786 = StringFog.decrypt("e8e5BMBmWIRC\n", "MZT2SpUSMeg=\n");

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m5606(JSONObject jSONObject, boolean z) {
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                if (z) {
                    jSONObject2.remove(AbstractC0739.f2061);
                }
                return jSONObject2;
            } catch (JSONException unused) {
            }
        }
        return new JSONObject();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5608(JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject.put(next, jSONObject2.opt(next));
            } catch (JSONException unused) {
            }
        }
        if (z) {
            jSONObject.remove(AbstractC0739.f2061);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static List m5604(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object opt = jSONArray.opt(i);
            if (opt != null) {
                arrayList.add(opt);
            }
        }
        return arrayList;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5607(JSONObject jSONObject, int i, List list) {
        String m5602;
        try {
            JSONArray names = jSONObject.names();
            if (names != null) {
                for (int i2 = 0; i2 < names.length(); i2++) {
                    String optString = names.optString(i2);
                    if ((list == null || !list.contains(optString)) && (m5602 = m5602(jSONObject.opt(optString), i)) != null) {
                        if (m5602.equals("")) {
                            m5602 = null;
                        }
                        jSONObject.put(optString, m5602);
                    }
                }
            }
        } catch (JSONException e) {
            String str = f1786;
            AbstractC0544.m5511(str, str, StringFog.decrypt("pidNSgxxoTiPPFtECji5PsM/TEoQ\n", "41U/JX5R11k=\n"), e, null, false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m5602(Object obj, int i) {
        if (obj instanceof JSONObject) {
            m5607((JSONObject) obj, i, (List) null);
        } else {
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    String m5602 = m5602(jSONArray.opt(i2), i);
                    if (m5602 != null) {
                        jSONArray.put(i2, m5602);
                    }
                }
            } else if (obj instanceof String) {
                String str = (String) obj;
                return str.length() > i ? AbstractC1257.m5940("xVC3OaWtVTKIH+10tfY=\n", "636ZEdHfIFw=\n", new StringBuilder().append(str.substring(0, i))) : str;
            }
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static HashMap m5603(JSONObject jSONObject, C1061 c1061) {
        AbstractC0411 abstractC0411;
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            c1061.getClass();
            try {
                String optString = jSONObject.optString(next);
                if (jSONObject.opt(next) instanceof String) {
                    optString = StringFog.decrypt("iA==\n", "qlK7e5ZVOgg=\n") + optString + StringFog.decrypt("SQ==\n", "a5uRrL10YF4=\n");
                }
                abstractC0411 = new C0619().m5569(AbstractC0407.m5424(c1061.f3165.f3104, optString, optString));
            } catch (Throwable th) {
                AbstractC1086.m5875(c1061.f3165.f3104, AbstractC1196.m5920("n9jCshOSiG+o2dmzBpI=\n", "2qqw3WGy+A4=\n", new StringBuilder(), next).append(StringFog.decrypt("huToK8sMJqU=\n", "poeHRbh4HIU=\n")).append(jSONObject.optString(next)).toString(), th, null);
                abstractC0411 = null;
            }
            hashMap.put(next, abstractC0411);
        }
        return hashMap;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m5605(int i, int i2, long j, long j2) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (j > -1) {
                jSONObject.put(StringFog.decrypt("PQ==\n", "RYHIwNxr9ws=\n"), i);
                jSONObject.put(StringFog.decrypt("ag==\n", "E3j6wGrwuWw=\n"), i2);
                jSONObject.put(StringFog.decrypt("nQ==\n", "6RjqL/PA8Hc=\n"), j);
                jSONObject.put(StringFog.decrypt("Hg==\n", "a6lCXsVuMmU=\n"), j2);
            } else {
                jSONObject.put(StringFog.decrypt("YQ==\n", "GeXD2Xdofn8=\n"), -1);
                jSONObject.put(StringFog.decrypt("DQ==\n", "dP1S938Hv8U=\n"), -1);
                jSONObject.put(StringFog.decrypt("FA==\n", "YNfLiOeoMuw=\n"), -1);
                jSONObject.put(StringFog.decrypt("Ew==\n", "Zmh/FVrLUO8=\n"), -1);
            }
        } catch (JSONException e) {
            String str = f1786;
            AbstractC0544.m5511(str, str, StringFog.decrypt("C1KP2w8MMk8rQYndE0txUS9TieASWTJVbkqO2xM=\n", "TiD9tH0sUT0=\n"), e, null, false);
        }
        return jSONObject;
    }
}
