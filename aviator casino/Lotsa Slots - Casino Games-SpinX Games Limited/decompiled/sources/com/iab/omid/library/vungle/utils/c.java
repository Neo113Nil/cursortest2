package com.iab.omid.library.vungle.utils;

/* loaded from: classes5.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static android.view.WindowManager f4565a;
    private static java.lang.String[] b = {"x", "y", "width", "height"};
    static float c = android.content.res.Resources.getSystem().getDisplayMetrics().density;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4566a;

        static {
            int[] iArr = new int[com.iab.omid.library.vungle.adsession.OutputDeviceStatus.values().length];
            f4566a = iArr;
            try {
                iArr[com.iab.omid.library.vungle.adsession.OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        final float f4567a;
        final float b;

        b(float f, float f2) {
            this.f4567a = f;
            this.b = f2;
        }
    }

    static float a(int i) {
        return i / c;
    }

    private static com.iab.omid.library.vungle.utils.c.b a(org.json.JSONObject jSONObject) {
        float f;
        float f2;
        if (f4565a != null) {
            android.graphics.Point point = new android.graphics.Point(0, 0);
            f4565a.getDefaultDisplay().getRealSize(point);
            f = a(point.x);
            f2 = a(point.y);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        return new com.iab.omid.library.vungle.utils.c.b(f, f2);
    }

    public static org.json.JSONObject a(int i, int i2, int i3, int i4) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("x", a(i));
            jSONObject.put("y", a(i2));
            jSONObject.put("width", a(i3));
            jSONObject.put("height", a(i4));
        } catch (org.json.JSONException e) {
            com.iab.omid.library.vungle.utils.d.a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    public static void a(android.content.Context context) {
        if (context != null) {
            c = context.getResources().getDisplayMetrics().density;
            f4565a = (android.view.WindowManager) context.getSystemService("window");
        }
    }

    public static void a(org.json.JSONObject jSONObject, com.iab.omid.library.vungle.adsession.OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", a(outputDeviceStatus));
        } catch (org.json.JSONException e) {
            com.iab.omid.library.vungle.utils.d.a("Error with setting output device status", e);
        }
    }

    public static void a(org.json.JSONObject jSONObject, com.iab.omid.library.vungle.walking.a.C0114a c0114a) {
        com.iab.omid.library.vungle.internal.e a2 = c0114a.a();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.Iterator<java.lang.String> it = c0114a.b().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a2.d());
            jSONObject.put("friendlyObstructionPurpose", a2.b());
            jSONObject.put("friendlyObstructionReason", a2.a());
        } catch (org.json.JSONException e) {
            com.iab.omid.library.vungle.utils.d.a("Error with setting friendly obstruction", e);
        }
    }

    public static void a(org.json.JSONObject jSONObject, java.lang.Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (org.json.JSONException e) {
            com.iab.omid.library.vungle.utils.d.a("Error with setting has window focus", e);
        }
    }

    public static void a(org.json.JSONObject jSONObject, java.lang.String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (org.json.JSONException e) {
            com.iab.omid.library.vungle.utils.d.a("Error with setting ad session id", e);
        }
    }

    public static void a(org.json.JSONObject jSONObject, java.lang.String str, java.lang.Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (java.lang.NullPointerException | org.json.JSONException e) {
            com.iab.omid.library.vungle.utils.d.a("JSONException during JSONObject.put for name [" + str + com.ironsource.X3.j.e, e);
        }
    }

    public static void a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        try {
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new org.json.JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
    }

    private static boolean a(com.iab.omid.library.vungle.adsession.OutputDeviceStatus outputDeviceStatus) {
        return com.iab.omid.library.vungle.utils.c.a.f4566a[outputDeviceStatus.ordinal()] == 1;
    }

    private static boolean a(org.json.JSONArray jSONArray, org.json.JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    public static java.util.Map<java.lang.String, java.lang.String> b(org.json.JSONObject jSONObject) {
        try {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.lang.Object obj = jSONObject.get(next);
                if (obj instanceof java.lang.String) {
                    hashMap.put(next, (java.lang.String) obj);
                }
            }
            return hashMap;
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("Failed to parse JSON to Map", e);
        }
    }

    public static void b(org.json.JSONObject jSONObject, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            try {
                jSONObject.put("isPipActive", bool);
            } catch (org.json.JSONException e) {
                com.iab.omid.library.vungle.utils.d.a("Error with setting is picture-in-picture active", e);
            }
        }
    }

    public static void b(org.json.JSONObject jSONObject, java.lang.String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (org.json.JSONException e) {
            com.iab.omid.library.vungle.utils.d.a("Error with setting not visible reason", e);
        }
    }

    private static boolean b(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        org.json.JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!h(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }

    public static void c(org.json.JSONObject jSONObject) {
        com.iab.omid.library.vungle.utils.c.b a2 = a(jSONObject);
        try {
            jSONObject.put("width", a2.f4567a);
            jSONObject.put("height", a2.b);
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
    }

    private static boolean c(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        org.json.JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!optJSONArray.optString(i, "").equals(optJSONArray2.optString(i, ""))) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        return java.lang.Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(java.lang.Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    private static boolean e(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        return java.lang.Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(java.lang.Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    private static boolean f(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        for (java.lang.String str : b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean g(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    public static boolean h(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && f(jSONObject, jSONObject2) && g(jSONObject, jSONObject2) && e(jSONObject, jSONObject2) && d(jSONObject, jSONObject2) && c(jSONObject, jSONObject2) && b(jSONObject, jSONObject2);
    }
}
