package com.ironsource;

/* loaded from: classes5.dex */
public class Nb {

    /* renamed from: a, reason: collision with root package name */
    private java.lang.String f5860a;

    public Nb(java.lang.String str) {
        this.f5860a = str;
    }

    private com.ironsource.C3381y8 a() throws java.lang.Exception {
        com.ironsource.C3381y8 c3381y8 = new com.ironsource.C3381y8(this.f5860a, "metadata.json");
        if (!c3381y8.exists()) {
            a(c3381y8);
        }
        return c3381y8;
    }

    synchronized org.json.JSONObject b() throws java.lang.Exception {
        return new org.json.JSONObject(com.ironsource.sdk.utils.IronSourceStorageUtils.readFile(a()));
    }

    private void a(com.ironsource.C3381y8 c3381y8) throws java.lang.Exception {
        com.ironsource.sdk.utils.IronSourceStorageUtils.saveFile(new org.json.JSONObject().toString().getBytes(), c3381y8.getPath());
    }

    synchronized boolean b(java.lang.String str, org.json.JSONObject jSONObject) throws java.lang.Exception {
        org.json.JSONObject b;
        b = b();
        org.json.JSONObject optJSONObject = b.optJSONObject(str);
        if (optJSONObject != null) {
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                optJSONObject.putOpt(next, jSONObject.opt(next));
            }
        } else {
            b.putOpt(str, jSONObject);
        }
        return a(b);
    }

    private boolean a(org.json.JSONObject jSONObject) throws java.lang.Exception {
        return com.ironsource.sdk.utils.IronSourceStorageUtils.saveFile(jSONObject.toString().getBytes(), a().getPath()) != 0;
    }

    synchronized boolean a(java.lang.String str, org.json.JSONObject jSONObject) throws java.lang.Exception {
        org.json.JSONObject b;
        b = b();
        b.put(str, jSONObject);
        return a(b);
    }

    synchronized boolean a(java.lang.String str) throws java.lang.Exception {
        org.json.JSONObject b = b();
        if (!b.has(str)) {
            return true;
        }
        b.remove(str);
        return a(b);
    }

    boolean a(java.util.ArrayList<com.ironsource.C3381y8> arrayList) throws java.lang.Exception {
        java.util.Iterator<com.ironsource.C3381y8> it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (!a(it.next().getName())) {
                z = false;
            }
        }
        return z;
    }
}
