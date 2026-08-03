package com.fyber.inneractive.sdk.config.global;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f3600a;
    public int b;
    public final java.util.ArrayList c = new java.util.ArrayList();
    public final java.util.ArrayList d = new java.util.ArrayList();

    public static void a(com.fyber.inneractive.sdk.config.global.b bVar, org.json.JSONObject jSONObject, boolean z) {
        java.lang.String next;
        com.fyber.inneractive.sdk.config.global.d cVar;
        if (jSONObject != null) {
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                next = keys.next();
                next.getClass();
                next.hashCode();
                switch (next) {
                    case "demand":
                        cVar = new com.fyber.inneractive.sdk.config.global.c(jSONObject.getJSONArray(next), z);
                        break;
                    case "pub_id":
                        cVar = new com.fyber.inneractive.sdk.config.global.i(jSONObject.getJSONArray(next), z);
                        break;
                    case "placement_type":
                        cVar = new com.fyber.inneractive.sdk.config.global.h(jSONObject.getJSONArray(next), z);
                        break;
                    case "os":
                        cVar = new com.fyber.inneractive.sdk.config.global.f(z, jSONObject.getString(next));
                        break;
                    case "sdk":
                        cVar = new com.fyber.inneractive.sdk.config.global.j(z, jSONObject.getString(next));
                        break;
                    default:
                        cVar = null;
                        break;
                }
                if (cVar != null) {
                    bVar.d.add(cVar);
                } else {
                    com.fyber.inneractive.sdk.util.IAlog.a("b: Unsupported filter type: " + next, new java.lang.Object[0]);
                }
            }
        }
    }

    public final java.lang.String toString() {
        return java.lang.String.format("experiment: id=%s, variants=%s, filters=%s", this.f3600a, this.c, this.d);
    }
}
