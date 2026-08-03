package com.ironsource;

/* loaded from: classes5.dex */
public class Q6 {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f5933a = "adunit_data";

    public void a(java.lang.String str, java.lang.Object obj) {
        com.ironsource.N6.b().b(str, obj);
    }

    public void a(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.ironsource.N6.b().a(map);
    }

    public void a(java.lang.String str, org.json.JSONArray jSONArray) {
        com.ironsource.N6.b().a(str, jSONArray);
    }

    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        com.ironsource.N6.b().a(str, jSONObject);
    }

    public void a(android.content.Context context) {
        com.ironsource.N6.b().c(context);
    }

    public void a(java.lang.String str) {
        com.ironsource.N6.b().b(str);
    }

    public void a(java.lang.String str, java.lang.Object obj, com.ironsource.M6.a aVar) {
        try {
            java.lang.String name = aVar.name();
            com.ironsource.N6 b = com.ironsource.N6.b();
            org.json.JSONObject optJSONObject = b.b(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext()).optJSONObject(f5933a);
            if (optJSONObject == null) {
                b.b(f5933a, new org.json.JSONObject().put(name, new org.json.JSONObject().put(str, obj)));
                return;
            }
            org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject(name);
            if (optJSONObject2 == null) {
                b.b(f5933a, optJSONObject.put(name, new org.json.JSONObject().put(str, obj)));
            } else {
                b.b(f5933a, optJSONObject.put(name, optJSONObject2.put(str, obj)));
            }
        } catch (org.json.JSONException e) {
            com.ironsource.C3180n4.d().a(e);
        }
    }

    public void a(java.lang.String str, com.ironsource.M6.a aVar) {
        org.json.JSONObject optJSONObject;
        try {
            java.lang.String name = aVar.name();
            com.ironsource.N6 b = com.ironsource.N6.b();
            org.json.JSONObject optJSONObject2 = b.b(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext()).optJSONObject(f5933a);
            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject(name)) == null || optJSONObject.remove(str) == null) {
                return;
            }
            b.b(f5933a, optJSONObject2.put(name, optJSONObject));
        } catch (org.json.JSONException e) {
            com.ironsource.C3180n4.d().a(e);
        }
    }
}
