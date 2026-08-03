package com.ironsource;

/* loaded from: classes5.dex */
public class O6 {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f5869a = "adunit_data";

    public org.json.JSONObject a(java.util.List<java.lang.String> list) throws org.json.JSONException {
        return a(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), list);
    }

    public org.json.JSONObject a(android.content.Context context, java.lang.String[] strArr) throws org.json.JSONException {
        return a(a(com.ironsource.N6.b().b(context)), strArr);
    }

    public org.json.JSONObject a(java.util.List<java.lang.String> list, com.ironsource.M6.a aVar) throws org.json.JSONException {
        return a(a(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), aVar), (java.lang.String[]) list.toArray(new java.lang.String[list.size()]));
    }

    private org.json.JSONObject a(android.content.Context context, java.util.List<java.lang.String> list) throws org.json.JSONException {
        return a(a(com.ironsource.N6.b().b(context)), (java.lang.String[]) list.toArray(new java.lang.String[list.size()]));
    }

    public org.json.JSONObject a(java.lang.String[] strArr) throws org.json.JSONException {
        return a(a(com.ironsource.N6.b().b(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext())), strArr);
    }

    private org.json.JSONObject a(android.content.Context context, com.ironsource.M6.a aVar) throws org.json.JSONException {
        java.lang.String name = aVar.name();
        org.json.JSONObject b = com.ironsource.N6.b().b(context);
        org.json.JSONObject optJSONObject = b.optJSONObject(f5869a);
        org.json.JSONObject a2 = a(b);
        if (optJSONObject != null && optJSONObject.optJSONObject(name) != null) {
            org.json.JSONObject jSONObject = optJSONObject.getJSONObject(name);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                a2.putOpt(next, jSONObject.opt(next));
            }
        }
        return a2;
    }

    private org.json.JSONObject a(org.json.JSONObject jSONObject, java.lang.String[] strArr) throws org.json.JSONException {
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        for (java.lang.String str : strArr) {
            if (jSONObject.has(str)) {
                jSONObject2.put(str, jSONObject.opt(str));
            }
        }
        return jSONObject2;
    }

    private org.json.JSONObject a(org.json.JSONObject jSONObject) {
        jSONObject.remove(f5869a);
        return jSONObject;
    }
}
